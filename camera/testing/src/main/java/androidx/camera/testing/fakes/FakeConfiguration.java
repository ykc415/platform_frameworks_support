/*
 * Copyright (C) 2019 The Android Open Source Project
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
 */

package androidx.camera.testing.fakes;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;
import androidx.camera.core.Configuration;
import androidx.camera.core.MutableConfiguration;
import androidx.camera.core.MutableOptionsBundle;
import androidx.camera.core.OptionsBundle;

/**
 * Wrapper for an empty Configuration
 *
 * @hide
 */
@RestrictTo(Scope.LIBRARY_GROUP)
public final class FakeConfiguration implements Configuration.Reader {

    private final Configuration mConfig;

    FakeConfiguration(Configuration config) {
        mConfig = config;
    }

    @Override
    public Configuration getConfiguration() {
        return mConfig;
    }

    /** Builder for an empty Configuration */
    public static final class Builder implements Configuration.Builder<FakeConfiguration, Builder> {

        private final MutableOptionsBundle mOptionsBundle;

        public Builder() {
            mOptionsBundle = MutableOptionsBundle.create();
        }

        @Override
        public MutableConfiguration getMutableConfiguration() {
            return mOptionsBundle;
        }

        @Override
        public Builder builder() {
            return this;
        }

        @Override
        public FakeConfiguration build() {
            return new FakeConfiguration(OptionsBundle.from(mOptionsBundle));
        }
    }
}