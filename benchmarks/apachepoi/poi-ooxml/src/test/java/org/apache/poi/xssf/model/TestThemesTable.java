/* ====================================================================
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
==================================================================== */

package org.apache.poi.xssf.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.XSSFTestDataSamples;
import org.apache.poi.xssf.model.ThemesTable.ThemeElement;
import org.apache.poi.xssf.usermodel.*;
import org.junit.jupiter.api.Test;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTColor;

import static org.junit.jupiter.api.Assertions.*;

class TestThemesTable {
    private static final String testFileComplex = "Themes2.xlsx";
    // TODO .xls version available too, add HSSF support then check

    // For offline testing
    private static final boolean createFiles = false;

    // What colours they should show up as
    private static final String[] rgbExpected = {
            "ffffff", // Lt1
            "000000", // Dk1
            "eeece1", // Lt2
            "1f497d", // DK2
            "4f81bd", // Accent1
            "c0504d", // Accent2
            "9bbb59", // Accent3
            "8064a2", // Accent4
            "4bacc6", // Accent5
            "f79646", // Accent6
            "0000ff", // Hlink
            "800080"  // FolHlink
    };

    @Test
    void testThemesTableColors() throws Exception {
        // Load our two test workbooks
        String testFileSimple = "Themes.xlsx";
        XSSFWorkbook simple = XSSFTestDataSamples.openSampleWorkbook(testFileSimple);
        XSSFWorkbook complex = XSSFTestDataSamples.openSampleWorkbook(testFileComplex);
        // Save and re-load them, to check for stability across that
        XSSFWorkbook simpleRS = XSSFTestDataSamples.writeOutAndReadBack(simple);
        XSSFWorkbook complexRS = XSSFTestDataSamples.writeOutAndReadBack(complex);
        // Fetch fresh copies to test with
        simple.close();
        simple = XSSFTestDataSamples.openSampleWorkbook(testFileSimple);
        complex.close();
        complex = XSSFTestDataSamples.openSampleWorkbook(testFileComplex);
        // Files and descriptions
        Map<String,XSSFWorkbook> workbooks = new LinkedHashMap<>();
        workbooks.put(testFileSimple, simple);
        workbooks.put("Re-Saved_" + testFileSimple, simpleRS);
        workbooks.put(testFileComplex, complex);
        workbooks.put("Re-Saved_" + testFileComplex, complexRS);

        // Sanity check
        assertEquals(12, rgbExpected.length);

        // Check each workbook in turn, and verify that the colours
        //  for the theme-applied cells in Column A are correct
        for (String whatWorkbook : workbooks.keySet()) {
            XSSFWorkbook workbook = workbooks.get(whatWorkbook);
            XSSFSheet sheet = workbook.getSheetAt(0);
            int startRN = 0;
            if (whatWorkbook.endsWith(testFileComplex)) startRN++;

            for (int rn=startRN; rn<rgbExpected.length+startRN; rn++) {
                XSSFRow row = sheet.getRow(rn);
                assertNotNull(row, "Missing row " + rn + " in " + whatWorkbook);
                String ref = (new CellReference(rn, 0)).formatAsString();
                XSSFCell cell = row.getCell(0);
                assertNotNull(cell, "Missing cell " + ref + " in " + whatWorkbook);

                int expectedThemeIdx = rn-startRN;
                ThemeElement themeElem = ThemeElement.byId(expectedThemeIdx);
                assertEquals(themeElem.name.toLowerCase(Locale.ROOT), cell.getStringCellValue(),
                    "Wrong theme at " + ref + " in " + whatWorkbook);

                // Fonts are theme-based in their colours
                XSSFFont font = cell.getCellStyle().getFont();
                CTColor ctColor = font.getCTFont().getColorArray(0);
                assertNotNull(ctColor);
                assertTrue(ctColor.isSetTheme());
                assertEquals(themeElem.idx, ctColor.getTheme());

                // Get the colour, via the theme
                XSSFColor color = font.getXSSFColor();
                // Theme colours aren't tinted
                assertFalse(color.hasTint());
                // Check the RGB part (no tint)
                assertEquals(rgbExpected[expectedThemeIdx], Hex.encodeHexString(color.getRGB()),
                    "Wrong theme colour " + themeElem.name + " on " + whatWorkbook);
                long themeIdx = font.getCTFont().getColorArray(0).getTheme();
                assertEquals(expectedThemeIdx, themeIdx,
                    "Wrong theme index " + expectedThemeIdx + " on " + whatWorkbook);

                if (createFiles) {
                    XSSFCellStyle cs = row.getSheet().getWorkbook().createCellStyle();
                    cs.setFillForegroundColor(color);
                    cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                    row.createCell(1).setCellStyle(cs);
                }
            }

            if (createFiles) {
                FileOutputStream fos = new FileOutputStream("Generated_"+whatWorkbook);
                workbook.write(fos);
                fos.close();
            }
        }

        simpleRS.close();
        simple.close();
        complexRS.close();
        complex.close();
    }

    /**
     * Ensure that, for a file with themes, we can correctly
     *  read both the themed and non-themed colours back.
     * Column A = Theme Foreground
     * Column B = Theme Foreground
     * Column C = Explicit Colour Foreground
     * Column E = Explicit Colour Background, Black Foreground
     * Column G = Conditional Formatting Backgrounds
     *
     * Note - Grey Row has an odd way of doing the styling...
     */
    @Test
    void themedAndNonThemedColours() throws IOException {
        try (XSSFWorkbook wb = XSSFTestDataSamples.openSampleWorkbook(testFileComplex)) {
            XSSFSheet sheet = wb.getSheetAt(0);
            ThemesTable themesTable = wb.getTheme();
            XSSFColor color1 = themesTable.getThemeColor(0);
            assertNotNull(color1);
            assertNotEquals(0, color1.getRGB().length);
            List<PackagePart> themeParts = wb.getPackage().getPartsByContentType(XSSFRelation.THEME.getContentType());
            assertEquals(1, themeParts.size());
            try (InputStream themeStream = themeParts.get(0).getInputStream()) {
                ThemesTable themesTable2 = new ThemesTable(themeStream);
                assertArrayEquals(color1.getRGB(), themesTable2.getThemeColor(0).getRGB());
            }

            String[] names = {"White", "Black", "Grey", "Dark Blue", "Blue", "Red", "Green"};
            String[] explicitFHexes = {"FFFFFFFF", "FF000000", "FFC0C0C0", "FF002060",
                    "FF0070C0", "FFFF0000", "FF00B050"};
            String[] explicitBHexes = {"FFFFFFFF", "FF000000", "FFC0C0C0", "FF002060",
                    "FF0000FF", "FFFF0000", "FF00FF00"};
            assertEquals(7, names.length);

            // Check the non-CF colours in Columns A, B, C and E
            for (int rn = 1; rn < 8; rn++) {
                int idx = rn - 1;
                XSSFRow row = sheet.getRow(rn);
                assertNotNull(row, "Missing row " + rn);

                // Theme cells come first
                XSSFCell themeCell = row.getCell(0);
                ThemeElement themeElem = ThemeElement.byId(idx);
                assertCellContents(themeElem.name, themeCell);

                // Sanity check names
                assertCellContents(names[idx], row.getCell(1));
                assertCellContents(names[idx], row.getCell(2));
                assertCellContents(names[idx], row.getCell(4));


                // Check the colours

                //  A: Theme Based, Foreground
                XSSFCellStyle style = themeCell.getCellStyle();
                XSSFColor color = style.getFont().getXSSFColor();
                assertTrue(color.isThemed());
                assertEquals(idx, color.getTheme());
                assertEquals(rgbExpected[idx], Hex.encodeHexString(color.getRGB()));

                //  B: Theme Based, Foreground
                XSSFCell cell = row.getCell(1);
                style = cell.getCellStyle();
                color = style.getFont().getXSSFColor();
                assertTrue(color.isThemed());
                if (idx != 2) {
                    assertEquals(idx, color.getTheme());
                    assertEquals(rgbExpected[idx], Hex.encodeHexString(color.getRGB()));
                } else {
                    assertEquals(1, color.getTheme());
                    assertEquals(0.50, color.getTint(), 0.001);
                }

                //  C: Explicit, Foreground
                cell = row.getCell(2);
                style = cell.getCellStyle();
                color = style.getFont().getXSSFColor();
                assertFalse(color.isThemed());
                assertEquals(explicitFHexes[idx], color.getARGBHex());

                // E: Explicit Background, Foreground all Black
                cell = row.getCell(4);
                style = cell.getCellStyle();

                color = style.getFont().getXSSFColor();
                assertTrue(color.isThemed());
                assertEquals("FF000000", color.getARGBHex());

                color = style.getFillForegroundXSSFColor();
                assertFalse(color.isThemed());
                assertEquals(explicitBHexes[idx], color.getARGBHex());
                color = style.getFillBackgroundColorColor();
                assertFalse(color.isThemed());
                assertNull(color.getARGBHex());
            }
        }

        // Check the CF colours
        // TODO
    }
    private static void assertCellContents(String expected, XSSFCell cell) {
        assertNotNull(cell);
        assertEquals(expected.toLowerCase(Locale.ROOT),
                     cell.getStringCellValue().toLowerCase(Locale.ROOT));
    }

    @Test
    @SuppressWarnings("resource")
    void testAddNew() {
        XSSFWorkbook wb = new XSSFWorkbook();
        wb.createSheet();
        assertNull(wb.getTheme());

        StylesTable styles = wb.getStylesSource();
        assertNull(styles.getTheme());

        styles.ensureThemesTable();

        assertNotNull(styles.getTheme());
        assertNotNull(wb.getTheme());

        wb = XSSFTestDataSamples.writeOutAndReadBack(wb);
        styles = wb.getStylesSource();
        assertNotNull(styles.getTheme());
        assertNotNull(wb.getTheme());
    }
}
