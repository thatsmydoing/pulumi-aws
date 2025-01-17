// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs Empty = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs();

    @Import(name="convert608To708")
    private @Nullable Output<String> convert608To708;

    public Optional<Output<String>> convert608To708() {
        return Optional.ofNullable(this.convert608To708);
    }

    @Import(name="source608ChannelNumber")
    private @Nullable Output<Integer> source608ChannelNumber;

    public Optional<Output<Integer>> source608ChannelNumber() {
        return Optional.ofNullable(this.source608ChannelNumber);
    }

    private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs() {}

    private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs $) {
        this.convert608To708 = $.convert608To708;
        this.source608ChannelNumber = $.source608ChannelNumber;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs();
        }

        public Builder(ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs defaults) {
            $ = new ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder convert608To708(@Nullable Output<String> convert608To708) {
            $.convert608To708 = convert608To708;
            return this;
        }

        public Builder convert608To708(String convert608To708) {
            return convert608To708(Output.of(convert608To708));
        }

        public Builder source608ChannelNumber(@Nullable Output<Integer> source608ChannelNumber) {
            $.source608ChannelNumber = source608ChannelNumber;
            return this;
        }

        public Builder source608ChannelNumber(Integer source608ChannelNumber) {
            return source608ChannelNumber(Output.of(source608ChannelNumber));
        }

        public ChannelInputAttachmentInputSettingsCaptionSelectorSelectorSettingsScte20SourceSettingsArgs build() {
            return $;
        }
    }

}
