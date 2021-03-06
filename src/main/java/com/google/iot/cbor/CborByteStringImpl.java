/*
 * Copyright (C) 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.iot.cbor;

import java.util.Arrays;

final class CborByteStringImpl extends CborByteString {
    private final byte[] mByteValue;
    private final int mTag;

    @Override
    public int getTag() {
        return mTag;
    }

    CborByteStringImpl(byte[] array, int offset, int length, int tag) {
        mTag = tag;
        mByteValue = Arrays.copyOfRange(array, offset, offset + length);
    }

    @Override
    public byte[] byteArrayValue() {
        return mByteValue;
    }
}
