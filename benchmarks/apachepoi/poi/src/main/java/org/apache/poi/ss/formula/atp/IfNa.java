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

package org.apache.poi.ss.formula.atp;

import org.apache.poi.ss.formula.OperationEvaluationContext;
import org.apache.poi.ss.formula.eval.ErrorEval;
import org.apache.poi.ss.formula.eval.EvaluationException;
import org.apache.poi.ss.formula.eval.OperandResolver;
import org.apache.poi.ss.formula.eval.ValueEval;
import org.apache.poi.ss.formula.functions.FreeRefFunction;

/**
 * Implementation of 'Analysis Toolpak' the Excel function IFNA()
 *
 * <b>Syntax</b>:<br>
 * <b>IFNA</b>(<b>test_value</b>, <b>default_value</b>)<p>
 *
 * <b>test_value</b>  The value to be tested<br>
 * <b>default_value</b>  The value to be tested<br>
 * <br>
 * Returns {@code default_value} if {@code test_value} is '#N/A', {@code test_value} otherwise.
 */
public final class IfNa implements FreeRefFunction {

    public static final FreeRefFunction instance = new IfNa();

    private IfNa() {
        // Enforce singleton
    }

    public ValueEval evaluate(ValueEval[] args, OperationEvaluationContext ec) {
        if (args.length != 2) {
            return ErrorEval.VALUE_INVALID;
        }

        try {
            return OperandResolver.getSingleValue(args[0], ec.getRowIndex(), ec.getColumnIndex());
        } catch (EvaluationException e) {
            ValueEval error = e.getErrorEval();
            if (error != ErrorEval.NA) {
                return error;
            }
        }
        try {
            return OperandResolver.getSingleValue(args[1], ec.getRowIndex(), ec.getColumnIndex());
        } catch (EvaluationException e) {
            return e.getErrorEval();
        }
    }
}
