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

package org.apache.poi.hwpf.model.types;

import org.apache.poi.util.Internal;

/**
 * Hyphenation (HRESI).
 * <p>
 * Class and fields descriptions are quoted from Microsoft Office Word 97-2007
 * Binary File Format (.doc) Specification
 */
@Internal
public abstract class HRESIAbstractType {
    public static final byte HRES_NO = 0;
    public static final byte HRES_NORMAL = 1;
    public static final byte HRES_ADD_LETTER_BEFORE = 2;
    public static final byte HRES_CHANGE_LETTER_BEFORE = 3;
    public static final byte HRES_DELETE_LETTER_BEFORE = 4;
    public static final byte HRES_CHANGE_LETTER_AFTER = 5;
    public static final byte HRES_DELETE_BEFORE_CHANGE_BEFORE = 6;

    protected byte field_1_hres;
    protected byte field_2_chHres;

    protected HRESIAbstractType() {}

    protected HRESIAbstractType(HRESIAbstractType other) {
        field_1_hres = other.field_1_hres;
        field_2_chHres = other.field_2_chHres;
    }

    protected void fillFields( byte[] data, int offset )
    {
        field_1_hres                   = data[ 0x0 + offset ];
        field_2_chHres                 = data[ 0x1 + offset ];
    }

    public void serialize( byte[] data, int offset )
    {
        data[ 0x0 + offset] = field_1_hres;
        data[ 0x1 + offset] = field_2_chHres;
    }

    /**
     * Size of record (exluding 4 byte header)
     */
    public static int getSize()
    {
        return 4 +  + 1 + 1;
    }

    public String toString()
    {
        return "[HRESI]\n" +
            "    .hres                 = " +
            " (" + getHres() + " )\n" +
            "    .chHres               = " +
            " (" + getChHres() + " )\n" +
            "[/HRESI]\n";
    }

    /**
     * Hyphenation rule.
     *
     * @return One of
     * <ul>
     * <li>{@link #HRES_NO}
     * <li>{@link #HRES_NORMAL}
     * <li>{@link #HRES_ADD_LETTER_BEFORE}
     * <li>{@link #HRES_CHANGE_LETTER_BEFORE}
     * <li>{@link #HRES_DELETE_LETTER_BEFORE}
     * <li>{@link #HRES_CHANGE_LETTER_AFTER}
     * <li>{@link #HRES_DELETE_BEFORE_CHANGE_BEFORE}
     * </ul>
     */
    public byte getHres()
    {
        return field_1_hres;
    }

    /**
     * Hyphenation rule.
     *
     * @param field_1_hres One of
     * <ul>
     * <li>{@link #HRES_NO}
     * <li>{@link #HRES_NORMAL}
     * <li>{@link #HRES_ADD_LETTER_BEFORE}
     * <li>{@link #HRES_CHANGE_LETTER_BEFORE}
     * <li>{@link #HRES_DELETE_LETTER_BEFORE}
     * <li>{@link #HRES_CHANGE_LETTER_AFTER}
     * <li>{@link #HRES_DELETE_BEFORE_CHANGE_BEFORE}
     * </ul>
     */
    public void setHres( byte field_1_hres )
    {
        this.field_1_hres = field_1_hres;
    }

    /**
     * The character that will be used to add or change a letter when hres is 2, 3, 5 or 6.
     */
    public byte getChHres()
    {
        return field_2_chHres;
    }

    /**
     * The character that will be used to add or change a letter when hres is 2, 3, 5 or 6.
     */
    public void setChHres( byte field_2_chHres )
    {
        this.field_2_chHres = field_2_chHres;
    }

}  // END OF CLASS
