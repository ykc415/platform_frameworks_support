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

package androidx.camera.core;

import androidx.annotation.RestrictTo;
import androidx.annotation.RestrictTo.Scope;

/** Configuration for a video capture use case. */
public final class VideoCaptureUseCaseConfiguration
        implements UseCaseConfiguration<VideoCaptureUseCase>,
        ImageOutputConfiguration,
        CameraDeviceConfiguration,
        ThreadConfiguration {

    // Option Declarations:
    // *********************************************************************************************
    static final Option<Integer> OPTION_VIDEO_FRAME_RATE =
            Option.create("camerax.core.videoCapture.recordingFrameRate", int.class);
    static final Option<Integer> OPTION_BIT_RATE =
            Option.create("camerax.core.videoCapture.bitRate", int.class);
    static final Option<Integer> OPTION_INTRA_FRAME_INTERVAL =
            Option.create("camerax.core.videoCapture.intraFrameInterval", int.class);
    static final Option<Integer> OPTION_AUDIO_BIT_RATE =
            Option.create("camerax.core.videoCapture.audioBitRate", int.class);
    static final Option<Integer> OPTION_AUDIO_SAMPLE_RATE =
            Option.create("camerax.core.videoCapture.audioSampleRate", int.class);
    static final Option<Integer> OPTION_AUDIO_CHANNEL_COUNT =
            Option.create("camerax.core.videoCapture.audioChannelCount", int.class);
    static final Option<Integer> OPTION_AUDIO_RECORD_SOURCE =
            Option.create("camerax.core.videoCapture.audioRecordSource", int.class);
    static final Option<Integer> OPTION_AUDIO_MIN_BUFFER_SIZE =
            Option.create("camerax.core.videoCapture.audioMinBufferSize", int.class);
    private final OptionsBundle mConfig;

    VideoCaptureUseCaseConfiguration(OptionsBundle config) {
        mConfig = config;
    }

    /**
     * {@inheritDoc}
     *
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    @Override
    public Configuration getConfiguration() {
        return mConfig;
    }

    /**
     * Returns the recording frames per second.
     *
     * @param valueIfMissing The value to return if this configuration option has not been set.
     * @return The stored value or <code>valueIfMissing</code> if the value does not exist in this
     * configuration.
     */
    public int getVideoFrameRate(int valueIfMissing) {
        return getConfiguration().retrieveOption(OPTION_VIDEO_FRAME_RATE, valueIfMissing);
    }

    /**
     * Returns the recording frames per second.
     *
     * @return The stored value, if it exists in this configuration.
     * @throws IllegalArgumentException if the option does not exist in this configuration.
     */
    public int getVideoFrameRate() {
        return getConfiguration().retrieveOption(OPTION_VIDEO_FRAME_RATE);
    }

    /**
     * Returns the encoding bit rate.
     *
     * @param valueIfMissing The value to return if this configuration option has not been set.
     * @return The stored value or <code>valueIfMissing</code> if the value does not exist in this
     * configuration.
     */
    public int getBitRate(int valueIfMissing) {
        return getConfiguration().retrieveOption(OPTION_BIT_RATE, valueIfMissing);
    }

    /**
     * Returns the encoding bit rate.
     *
     * @return The stored value, if it exists in this configuration.
     * @throws IllegalArgumentException if the option does not exist in this configuration.
     */
    public int getBitRate() {
        return getConfiguration().retrieveOption(OPTION_BIT_RATE);
    }

    /**
     * Returns the number of seconds between each key frame.
     *
     * @param valueIfMissing The value to return if this configuration option has not been set.
     * @return The stored value or <code>valueIfMissing</code> if the value does not exist in this
     * configuration.
     */
    public int getIFrameInterval(int valueIfMissing) {
        return getConfiguration().retrieveOption(OPTION_INTRA_FRAME_INTERVAL, valueIfMissing);
    }

    /**
     * Returns the number of seconds between each key frame.
     *
     * @return The stored value, if it exists in this configuration.
     * @throws IllegalArgumentException if the option does not exist in this configuration.
     */
    public int getIFrameInterval() {
        return getConfiguration().retrieveOption(OPTION_INTRA_FRAME_INTERVAL);
    }

    /**
     * Returns the audio encoding bit rate.
     *
     * @param valueIfMissing The value to return if this configuration option has not been set.
     * @return The stored value or <code>valueIfMissing</code> if the value does not exist in this
     * configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioBitRate(int valueIfMissing) {
        return getConfiguration().retrieveOption(OPTION_AUDIO_BIT_RATE, valueIfMissing);
    }

    /**
     * Returns the audio encoding bit rate.
     *
     * @return The stored value, if it exists in this configuration.
     * @throws IllegalArgumentException if the option does not exist in this configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioBitRate() {
        return getConfiguration().retrieveOption(OPTION_AUDIO_BIT_RATE);
    }

    /**
     * Returns the audio sample rate.
     *
     * @param valueIfMissing The value to return if this configuration option has not been set.
     * @return The stored value or <code>valueIfMissing</code> if the value does not exist in this
     * configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioSampleRate(int valueIfMissing) {
        return getConfiguration().retrieveOption(OPTION_AUDIO_SAMPLE_RATE, valueIfMissing);
    }

    /**
     * Returns the audio sample rate.
     *
     * @return The stored value, if it exists in this configuration.
     * @throws IllegalArgumentException if the option does not exist in this configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioSampleRate() {
        return getConfiguration().retrieveOption(OPTION_AUDIO_SAMPLE_RATE);
    }

    /**
     * Returns the audio channel count.
     *
     * @param valueIfMissing The value to return if this configuration option has not been set.
     * @return The stored value or <code>valueIfMissing</code> if the value does not exist in this
     * configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioChannelCount(int valueIfMissing) {
        return getConfiguration().retrieveOption(OPTION_AUDIO_CHANNEL_COUNT, valueIfMissing);
    }

    /**
     * Returns the audio channel count.
     *
     * @return The stored value, if it exists in this configuration.
     * @throws IllegalArgumentException if the option does not exist in this configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioChannelCount() {
        return getConfiguration().retrieveOption(OPTION_AUDIO_CHANNEL_COUNT);
    }

    /**
     * Returns the audio recording source.
     *
     * @param valueIfMissing The value to return if this configuration option has not been set.
     * @return The stored value or <code>valueIfMissing</code> if the value does not exist in this
     * configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioRecordSource(int valueIfMissing) {
        return getConfiguration().retrieveOption(OPTION_AUDIO_RECORD_SOURCE, valueIfMissing);
    }

    /**
     * Returns the audio recording source.
     *
     * @return The stored value, if it exists in this configuration.
     * @throws IllegalArgumentException if the option does not exist in this configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioRecordSource() {
        return getConfiguration().retrieveOption(OPTION_AUDIO_RECORD_SOURCE);
    }

    /**
     * Returns the audio minimum buffer size, in bytes.
     *
     * @param valueIfMissing The value to return if this configuration option has not been set.
     * @return The stored value or <code>valueIfMissing</code> if the value does not exist in this
     * configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioMinBufferSize(int valueIfMissing) {
        return getConfiguration().retrieveOption(OPTION_AUDIO_MIN_BUFFER_SIZE, valueIfMissing);
    }

    /**
     * Returns the audio minimum buffer size, in bytes.
     *
     * @return The stored value, if it exists in this configuration.
     * @throws IllegalArgumentException if the option does not exist in this configuration.
     * @hide
     */
    @RestrictTo(Scope.LIBRARY_GROUP)
    public int getAudioMinBufferSize() {
        return getConfiguration().retrieveOption(OPTION_AUDIO_MIN_BUFFER_SIZE);
    }

    /** Builder for a {@link VideoCaptureUseCaseConfiguration}. */
    public static final class Builder
            implements UseCaseConfiguration.Builder<
            VideoCaptureUseCase, VideoCaptureUseCaseConfiguration, Builder>,
            ImageOutputConfiguration.Builder<VideoCaptureUseCaseConfiguration, Builder>,
            CameraDeviceConfiguration.Builder<VideoCaptureUseCaseConfiguration, Builder>,
            ThreadConfiguration.Builder<VideoCaptureUseCaseConfiguration, Builder> {

        private final MutableOptionsBundle mMutableConfig;

        /** Creates a new Builder object. */
        public Builder() {
            this(MutableOptionsBundle.create());
        }

        private Builder(MutableOptionsBundle mutableConfig) {
            mMutableConfig = mutableConfig;

            Class<?> oldConfigClass =
                    mutableConfig.retrieveOption(TargetConfiguration.OPTION_TARGET_CLASS, null);
            if (oldConfigClass != null && !oldConfigClass.equals(VideoCaptureUseCase.class)) {
                throw new IllegalArgumentException(
                        "Invalid target class configuration for "
                                + Builder.this
                                + ": "
                                + oldConfigClass);
            }

            setTargetClass(VideoCaptureUseCase.class);
        }

        /**
         * Generates a Builder from another Configuration object
         *
         * @param configuration An immutable configuration to pre-populate this builder.
         * @return The new Builder.
         */
        public static Builder fromConfig(VideoCaptureUseCaseConfiguration configuration) {
            return new Builder(MutableOptionsBundle.from(configuration));
        }

        /**
         * {@inheritDoc}
         *
         * @hide
         */
        @RestrictTo(Scope.LIBRARY_GROUP)
        @Override
        public MutableConfiguration getMutableConfiguration() {
            return mMutableConfig;
        }

        /** The solution for the unchecked cast warning. */
        @Override
        public Builder builder() {
            return this;
        }

        @Override
        public VideoCaptureUseCaseConfiguration build() {
            return new VideoCaptureUseCaseConfiguration(OptionsBundle.from(mMutableConfig));
        }

        /**
         * Sets the recording frames per second.
         *
         * @param videoFrameRate The requested interval in seconds.
         * @return The current Builder.
         */
        public Builder setVideoFrameRate(int videoFrameRate) {
            getMutableConfiguration().insertOption(OPTION_VIDEO_FRAME_RATE, videoFrameRate);
            return builder();
        }

        /**
         * Sets the encoding bit rate.
         *
         * @param bitRate The requested bit rate in bits per second.
         * @return The current Builder.
         */
        public Builder setBitRate(int bitRate) {
            getMutableConfiguration().insertOption(OPTION_BIT_RATE, bitRate);
            return builder();
        }

        /**
         * Sets number of seconds between each key frame in seconds.
         *
         * @param interval The requested interval in seconds.
         * @return The current Builder.
         */
        public Builder setIFrameInterval(int interval) {
            getMutableConfiguration().insertOption(OPTION_INTRA_FRAME_INTERVAL, interval);
            return builder();
        }

        /**
         * Sets the bit rate of the audio stream.
         *
         * @param bitRate The requested bit rate in bits/s.
         * @return The current Builder.
         * @hide
         */
        @RestrictTo(Scope.LIBRARY_GROUP)
        public Builder setAudioBitRate(int bitRate) {
            getMutableConfiguration().insertOption(OPTION_AUDIO_BIT_RATE, bitRate);
            return builder();
        }

        /**
         * Sets the sample rate of the audio stream.
         *
         * @param sampleRate The requested sample rate in bits/s.
         * @return The current Builder.
         * @hide
         */
        @RestrictTo(Scope.LIBRARY_GROUP)
        public Builder setAudioSampleRate(int sampleRate) {
            getMutableConfiguration().insertOption(OPTION_AUDIO_SAMPLE_RATE, sampleRate);
            return builder();
        }

        /**
         * Sets the number of audio channels.
         *
         * @param channelCount The requested number of audio channels.
         * @return The current Builder.
         * @hide
         */
        @RestrictTo(Scope.LIBRARY_GROUP)
        public Builder setAudioChannelCount(int channelCount) {
            getMutableConfiguration().insertOption(OPTION_AUDIO_CHANNEL_COUNT, channelCount);
            return builder();
        }

        /**
         * Sets the audio source.
         *
         * @param source The audio source. Currently only AudioSource.MIC is supported.
         * @return The current Builder.
         * @hide
         */
        @RestrictTo(Scope.LIBRARY_GROUP)
        public Builder setAudioRecordSource(int source) {
            getMutableConfiguration().insertOption(OPTION_AUDIO_RECORD_SOURCE, source);
            return builder();
        }

        /**
         * Sets the audio min buffer size.
         *
         * @param minBufferSize The requested audio minimum buffer size, in bytes.
         * @return The current Builder.
         * @hide
         */
        @RestrictTo(Scope.LIBRARY_GROUP)
        public Builder setAudioMinBufferSize(int minBufferSize) {
            getMutableConfiguration().insertOption(OPTION_AUDIO_MIN_BUFFER_SIZE, minBufferSize);
            return builder();
        }
    }
}