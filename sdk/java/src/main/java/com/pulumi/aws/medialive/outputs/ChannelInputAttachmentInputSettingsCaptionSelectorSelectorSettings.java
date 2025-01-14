// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAncillarySourceSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsEmbeddedSourceSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte27SourceSettings;
import com.pulumi.aws.medialive.outputs.ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings {
    private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAncillarySourceSettings ancillarySourceSettings;
    private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings dvbTdtSettings;
    private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsEmbeddedSourceSettings embeddedSourceSettings;
    private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettings scte20SourceSettings;
    private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte27SourceSettings scte27SourceSettings;
    private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettings teletextSourceSettings;

    private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings() {}
    public Optional<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAncillarySourceSettings> ancillarySourceSettings() {
        return Optional.ofNullable(this.ancillarySourceSettings);
    }
    public Optional<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings> dvbTdtSettings() {
        return Optional.ofNullable(this.dvbTdtSettings);
    }
    public Optional<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsEmbeddedSourceSettings> embeddedSourceSettings() {
        return Optional.ofNullable(this.embeddedSourceSettings);
    }
    public Optional<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettings> scte20SourceSettings() {
        return Optional.ofNullable(this.scte20SourceSettings);
    }
    public Optional<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte27SourceSettings> scte27SourceSettings() {
        return Optional.ofNullable(this.scte27SourceSettings);
    }
    public Optional<ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettings> teletextSourceSettings() {
        return Optional.ofNullable(this.teletextSourceSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAncillarySourceSettings ancillarySourceSettings;
        private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings dvbTdtSettings;
        private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsEmbeddedSourceSettings embeddedSourceSettings;
        private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettings scte20SourceSettings;
        private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte27SourceSettings scte27SourceSettings;
        private @Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettings teletextSourceSettings;
        public Builder() {}
        public Builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ancillarySourceSettings = defaults.ancillarySourceSettings;
    	      this.dvbTdtSettings = defaults.dvbTdtSettings;
    	      this.embeddedSourceSettings = defaults.embeddedSourceSettings;
    	      this.scte20SourceSettings = defaults.scte20SourceSettings;
    	      this.scte27SourceSettings = defaults.scte27SourceSettings;
    	      this.teletextSourceSettings = defaults.teletextSourceSettings;
        }

        @CustomType.Setter
        public Builder ancillarySourceSettings(@Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsAncillarySourceSettings ancillarySourceSettings) {
            this.ancillarySourceSettings = ancillarySourceSettings;
            return this;
        }
        @CustomType.Setter
        public Builder dvbTdtSettings(@Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsDvbTdtSettings dvbTdtSettings) {
            this.dvbTdtSettings = dvbTdtSettings;
            return this;
        }
        @CustomType.Setter
        public Builder embeddedSourceSettings(@Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsEmbeddedSourceSettings embeddedSourceSettings) {
            this.embeddedSourceSettings = embeddedSourceSettings;
            return this;
        }
        @CustomType.Setter
        public Builder scte20SourceSettings(@Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettings scte20SourceSettings) {
            this.scte20SourceSettings = scte20SourceSettings;
            return this;
        }
        @CustomType.Setter
        public Builder scte27SourceSettings(@Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte27SourceSettings scte27SourceSettings) {
            this.scte27SourceSettings = scte27SourceSettings;
            return this;
        }
        @CustomType.Setter
        public Builder teletextSourceSettings(@Nullable ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsTeletextSourceSettings teletextSourceSettings) {
            this.teletextSourceSettings = teletextSourceSettings;
            return this;
        }
        public ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings build() {
            final var o = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettings();
            o.ancillarySourceSettings = ancillarySourceSettings;
            o.dvbTdtSettings = dvbTdtSettings;
            o.embeddedSourceSettings = embeddedSourceSettings;
            o.scte20SourceSettings = scte20SourceSettings;
            o.scte27SourceSettings = scte27SourceSettings;
            o.teletextSourceSettings = teletextSourceSettings;
            return o;
        }
    }
}
