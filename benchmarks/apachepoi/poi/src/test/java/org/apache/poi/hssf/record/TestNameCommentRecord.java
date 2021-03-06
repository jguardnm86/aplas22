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

package org.apache.poi.hssf.record;

import static org.apache.poi.hssf.record.TestcaseRecordInputStream.confirmRecordEncoding;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.poi.util.HexRead;
import org.junit.jupiter.api.Test;

/**
 * Tests the NameCommentRecord serializes/deserializes correctly
 */
final class TestNameCommentRecord {
    @Test
    void testReserialize() {
        final byte[] data = HexRead
                .readFromString(""
                        + "94 08 00 00 00 00 00 00 00 00 00 00 04 00 07 00 00 6E 61 6D 65 00 63 6F 6D 6D 65 6E 74]");
        final RecordInputStream in = TestcaseRecordInputStream.create(NameCommentRecord.sid, data);
        final NameCommentRecord ncr = new NameCommentRecord(in);
        assertEquals(0x0894, ncr.getRecordType());
        assertEquals("name", ncr.getNameText());
        assertEquals("comment", ncr.getCommentText());
        final byte[] data2 = ncr.serialize();
        confirmRecordEncoding(NameCommentRecord.sid, data, data2);
    }
}
