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

package org.apache.poi.ss.formula.functions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.poi.ss.formula.eval.ValueEval;
import org.junit.jupiter.api.Test;

/**
 * Tests for ROW(), ROWS(), COLUMN(), COLUMNS()
 */
final class TestRowCol {

    @Test
    void testCol() {
        Function target = Column::evaluate;
        {
            ValueEval[] args = { EvalFactory.createRefEval("C5"), };
            double actual = NumericFunctionInvoker.invoke(target, args);
            assertEquals(3, actual, 0D);
        }
        {
            ValueEval[] args = { EvalFactory.createAreaEval("E2:H12", new ValueEval[44]), };
            double actual = NumericFunctionInvoker.invoke(target, args);
            assertEquals(5, actual, 0D);
        }
    }

    @Test
    void testRow() {
        Function target = RowFunc::evaluate;
        {
            ValueEval[] args = { EvalFactory.createRefEval("C5"), };
            double actual = NumericFunctionInvoker.invoke(target, args);
            assertEquals(5, actual, 0D);
        }
        {
            ValueEval[] args = { EvalFactory.createAreaEval("E2:H12", new ValueEval[44]), };
            double actual = NumericFunctionInvoker.invoke(target, args);
            assertEquals(2, actual, 0D);
        }
    }

    @Test
    void testColumns() {

        confirmColumnsFunc("A1:F1", 6, 1);
        confirmColumnsFunc("A1:C2", 3, 2);
        confirmColumnsFunc("A1:B3", 2, 3);
        confirmColumnsFunc("A1:A6", 1, 6);

        ValueEval[] args = { EvalFactory.createRefEval("C5"), };
        double actual = NumericFunctionInvoker.invoke(new Columns(), args);
        assertEquals(1, actual, 0D);
    }

    @Test
    void testRows() {

        confirmRowsFunc("A1:F1", 6, 1);
        confirmRowsFunc("A1:C2", 3, 2);
        confirmRowsFunc("A1:B3", 2, 3);
        confirmRowsFunc("A1:A6", 1, 6);

        ValueEval[] args = { EvalFactory.createRefEval("C5"), };
        double actual = NumericFunctionInvoker.invoke(new Rows(), args);
        assertEquals(1, actual, 0D);
    }

    private static void confirmRowsFunc(String areaRefStr, int nCols, int nRows) {
        ValueEval[] args = { EvalFactory.createAreaEval(areaRefStr, new ValueEval[nCols * nRows]), };

        double actual = NumericFunctionInvoker.invoke(new Rows(), args);
        assertEquals(nRows, actual, 0D);
    }


    private static void confirmColumnsFunc(String areaRefStr, int nCols, int nRows) {
        ValueEval[] args = { EvalFactory.createAreaEval(areaRefStr, new ValueEval[nCols * nRows]), };

        double actual = NumericFunctionInvoker.invoke(new Columns(), args);
        assertEquals(nCols, actual, 0D);
    }
}
