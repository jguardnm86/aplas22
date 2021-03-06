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

package org.apache.poi.ss.formula.ptg;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFEvaluationWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.jupiter.api.Test;

/**
 * Tests for Ref3DPtg
 */
final class TestRef3DPtg extends BaseTestPtg {
    @Test
    void testToFormulaString() throws IOException {

        Ref3DPtg target = new Ref3DPtg("A1", (short)0);

        try (HSSFWorkbook wb = createWorkbookWithSheet("my sheet")) {
            HSSFEvaluationWorkbook book = HSSFEvaluationWorkbook.create(wb);
            assertEquals("'my sheet'!A1", target.toFormulaString(book));

            wb.setSheetName(0, "ProfitAndLoss");
            assertEquals("ProfitAndLoss!A1", target.toFormulaString(book));

            wb.setSheetName(0, "profit+loss");
            assertEquals("'profit+loss'!A1", target.toFormulaString(book));
        }
    }
}
