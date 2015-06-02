/*
 * Copyright (C) 2015 Twitter, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.digits.sdk.android;

import android.os.Parcel;

public class ContactsUploadResultTests extends DigitsAndroidTestCase {
    public void testParcelable() {
        final ContactsUploadResult result = new ContactsUploadResult(1, 2);
        final Parcel parcel = Parcel.obtain();
        result.writeToParcel(parcel, 0);
        parcel.setDataPosition(0);
        final ContactsUploadResult parceledResult = ContactsUploadResult
                .CREATOR.createFromParcel(parcel);
        assertEquals(result.successCount, parceledResult.successCount);
        assertEquals(result.totalCount, parceledResult.totalCount);
    }
}