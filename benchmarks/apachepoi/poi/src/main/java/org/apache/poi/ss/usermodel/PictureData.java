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

package org.apache.poi.ss.usermodel;

public interface PictureData {

    /**
     * Gets the picture data.
     *
     * @return the picture data.
     */
    byte[] getData();

    /**
     * Suggests a file extension for this image.
     *
     * @return the file extension, without a leading {@code .}. Never {@code null}, but will be empty if the extension
     * is unknown or if the file backing these data does not have an extension.
     */
    String suggestFileExtension();

    /**
     * Returns the mime type for the image
     */
    String getMimeType();
    
    /**
     * @return the POI internal image type, {@code 0} if unknown image type
     *
     * @see Workbook#PICTURE_TYPE_DIB
     * @see Workbook#PICTURE_TYPE_EMF
     * @see Workbook#PICTURE_TYPE_JPEG
     * @see Workbook#PICTURE_TYPE_PICT
     * @see Workbook#PICTURE_TYPE_PNG
     * @see Workbook#PICTURE_TYPE_WMF
     */
    int getPictureType();
}