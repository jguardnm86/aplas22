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

package org.apache.poi.ss.formula;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.util.Internal;

/**
 * Abstracts a cell for the purpose of formula evaluation.  This interface represents both formula
 * and non-formula cells.
 */
@Internal
public interface EvaluationCell {
    /**
     * @return an Object that identifies the underlying cell,
     * suitable for use as a key in a {@link java.util.HashMap}
     */
    Object getIdentityKey();

    EvaluationSheet getSheet();
    int getRowIndex();
    int getColumnIndex();
    CellType getCellType();

    double getNumericCellValue();
    String getStringCellValue();
    boolean getBooleanCellValue();
    int getErrorCellValue();
    CellRangeAddress getArrayFormulaRange();
    boolean isPartOfArrayFormulaGroup();

    /**
     * @return cell type of cached formula result
     */
    CellType getCachedFormulaResultType();
}
