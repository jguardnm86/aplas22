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
package org.apache.poi.poifs.crypt.dsig;

import org.etsi.uri.x01903.v13.*;
import org.etsi.uri.x01903.v14.ValidationDataType;
import org.junit.jupiter.api.Test;
import org.w3.x2000.x09.xmldsig.SignatureValueType;

import static org.junit.jupiter.api.Assertions.assertNotNull;

// aim is to get these classes loaded and included in poi-ooxml-lite.jar
public class TestNecessaryClasses {

    @Test
    void testProblemClasses() {
        DataObjectFormatType dataObjectFormatType = DataObjectFormatType.Factory.newInstance();
        assertNotNull(dataObjectFormatType);
        IdentifierType identifierType = IdentifierType.Factory.newInstance();
        assertNotNull(identifierType);
        ObjectIdentifierType objectIdentifierType = ObjectIdentifierType.Factory.newInstance();
        assertNotNull(objectIdentifierType);
        SignedDataObjectPropertiesType signedDataObjectPropertiesType = SignedDataObjectPropertiesType.Factory.newInstance();
        assertNotNull(signedDataObjectPropertiesType);
        SignaturePolicyIdType signaturePolicyIdType = SignaturePolicyIdType.Factory.newInstance();
        assertNotNull(signaturePolicyIdType);
        SigPolicyQualifiersListType sigPolicyQualifiersListType = SigPolicyQualifiersListType.Factory.newInstance();
        assertNotNull(sigPolicyQualifiersListType);
        ValidationDataType validationDataType = ValidationDataType.Factory.newInstance();
        assertNotNull(validationDataType);
        SignatureValueType signatureValueType = SignatureValueType.Factory.newInstance();
        assertNotNull(signatureValueType);
    }

}
