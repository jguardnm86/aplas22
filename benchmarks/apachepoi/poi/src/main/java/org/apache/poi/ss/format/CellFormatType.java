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

package org.apache.poi.ss.format;

import java.util.Locale;

/**
 * The different kinds of formats that the formatter understands.
 */
public enum CellFormatType {

    /** The general (default) format; also used for {@code "General"}. */
    GENERAL {
        @Override
        boolean isSpecial(char ch) {
            return false;
        }
        @Override
        CellFormatter formatter(String pattern) {
            return new CellGeneralFormatter();
        }
        @Override
        CellFormatter formatter(Locale locale, String pattern) {
            return new CellGeneralFormatter(locale);
        }
    },
    /** A numeric format. */
    NUMBER {
        @Override
        boolean isSpecial(char ch) {
            return false;
        }
        @Override
        CellFormatter formatter(String pattern) {
            return new CellNumberFormatter(pattern);
        }
        @Override
        CellFormatter formatter(Locale locale, String pattern) {
            return new CellNumberFormatter(locale, pattern);
        }
    },
    /** A date format. */
    DATE {
        @Override
        boolean isSpecial(char ch) {
            return ch == '\'' || (ch <= '\u007f' && Character.isLetter(ch));
        }
        @Override
        CellFormatter formatter(String pattern) {
            return new CellDateFormatter(pattern);
        }
        @Override
        CellFormatter formatter(Locale locale, String pattern) {
            return new CellDateFormatter(locale, pattern);
        }
    },
    /** An elapsed time format. */
    ELAPSED {
        @Override
        boolean isSpecial(char ch) {
            return false;
        }
        @Override
        CellFormatter formatter(String pattern) {
            return new CellElapsedFormatter(pattern);
        }
        @Override
        CellFormatter formatter(Locale locale, String pattern) {
            return new CellElapsedFormatter(pattern);
        }
    },
    /** A text format. */
    TEXT {
        @Override
        boolean isSpecial(char ch) {
            return false;
        }
        @Override
        CellFormatter formatter(String pattern) {
            return new CellTextFormatter(pattern);
        }
        @Override
        CellFormatter formatter(Locale locale, String pattern) {
            return new CellTextFormatter(pattern);
        }
    };

    /**
     * Returns {@code true} if the format is special and needs to be quoted.
     *
     * @param ch The character to test.
     *
     * @return {@code true} if the format is special and needs to be quoted.
     */
    abstract boolean isSpecial(char ch);

    /**
     * Returns a new formatter of the appropriate type, for the given pattern.
     * The pattern must be appropriate for the type.
     *
     * @param pattern The pattern to use.
     *
     * @return A new formatter of the appropriate type, for the given pattern.
     */
    abstract CellFormatter formatter(String pattern);

    /**
     * Returns a new formatter of the appropriate type, for the given pattern.
     * The pattern must be appropriate for the type.
     *
     * @param locale The locale to use.
     * @param pattern The pattern to use.
     *
     * @return A new formatter of the appropriate type, for the given pattern.
     */
    abstract CellFormatter formatter(Locale locale, String pattern);
}
