// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioHlsRenditionSelection;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelection;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioPidSelection;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelection;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings {
    private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioHlsRenditionSelection audioHlsRenditionSelection;
    private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelection audioLanguageSelection;
    private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioPidSelection audioPidSelection;
    private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelection audioTrackSelection;

    private ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings() {}
    public Optional<ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioHlsRenditionSelection> audioHlsRenditionSelection() {
        return Optional.ofNullable(this.audioHlsRenditionSelection);
    }
    public Optional<ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelection> audioLanguageSelection() {
        return Optional.ofNullable(this.audioLanguageSelection);
    }
    public Optional<ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioPidSelection> audioPidSelection() {
        return Optional.ofNullable(this.audioPidSelection);
    }
    public Optional<ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelection> audioTrackSelection() {
        return Optional.ofNullable(this.audioTrackSelection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioHlsRenditionSelection audioHlsRenditionSelection;
        private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelection audioLanguageSelection;
        private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioPidSelection audioPidSelection;
        private @Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelection audioTrackSelection;
        public Builder() {}
        public Builder(ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audioHlsRenditionSelection = defaults.audioHlsRenditionSelection;
    	      this.audioLanguageSelection = defaults.audioLanguageSelection;
    	      this.audioPidSelection = defaults.audioPidSelection;
    	      this.audioTrackSelection = defaults.audioTrackSelection;
        }

        @CustomType.Setter
        public Builder audioHlsRenditionSelection(@Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioHlsRenditionSelection audioHlsRenditionSelection) {
            this.audioHlsRenditionSelection = audioHlsRenditionSelection;
            return this;
        }
        @CustomType.Setter
        public Builder audioLanguageSelection(@Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioLanguageSelection audioLanguageSelection) {
            this.audioLanguageSelection = audioLanguageSelection;
            return this;
        }
        @CustomType.Setter
        public Builder audioPidSelection(@Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioPidSelection audioPidSelection) {
            this.audioPidSelection = audioPidSelection;
            return this;
        }
        @CustomType.Setter
        public Builder audioTrackSelection(@Nullable ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettingsAudioTrackSelection audioTrackSelection) {
            this.audioTrackSelection = audioTrackSelection;
            return this;
        }
        public ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings build() {
            final var o = new ChannelInputAttachmentInputSettingsAudioSelectorSelectorSettings();
            o.audioHlsRenditionSelection = audioHlsRenditionSelection;
            o.audioLanguageSelection = audioLanguageSelection;
            o.audioPidSelection = audioPidSelection;
            o.audioTrackSelection = audioTrackSelection;
            return o;
        }
    }
}
