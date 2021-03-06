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

package org.apache.poi.hslf.usermodel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.poi.POIDataSamples;
import org.apache.poi.hslf.record.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Tests that the record setup done by SlideShow
 *  has worked correctly
 * Note: most recent record stuff has its own test
 */
public final class TestRecordSetup {
    // SlideShow primed on the test data
    @SuppressWarnings("unused")
    private HSLFSlideShow ss;
    private HSLFSlideShowImpl hss;

    @BeforeEach
    void init() throws Exception {
        POIDataSamples slTests = POIDataSamples.getSlideShowInstance();
        hss = new HSLFSlideShowImpl(slTests.openResourceAsStream("basic_test_ppt_file.ppt"));
        ss = new HSLFSlideShow(hss);
    }

    @Test
    void testHandleParentAwareRecords() {
         org.apache.poi.hslf.record.Record[] records = hss.getRecords();
        for ( org.apache.poi.hslf.record.Record record : records) {
            ensureParentAware(record,null);
        }
    }
    private void ensureParentAware( org.apache.poi.hslf.record.Record r,RecordContainer parent) {
        if(r instanceof ParentAwareRecord) {
            ParentAwareRecord pr = (ParentAwareRecord)r;
            assertEquals(parent, pr.getParentRecord());
        }
        if(r instanceof RecordContainer) {
            RecordContainer rc = (RecordContainer)r;
             org.apache.poi.hslf.record.Record[] children = rc.getChildRecords();
            for ( org.apache.poi.hslf.record.Record rec : children) {
                ensureParentAware(rec, rc);
            }
        }
    }
}
