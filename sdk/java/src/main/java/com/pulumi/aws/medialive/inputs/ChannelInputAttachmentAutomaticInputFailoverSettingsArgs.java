// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.aws.medialive.inputs.ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelInputAttachmentAutomaticInputFailoverSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelInputAttachmentAutomaticInputFailoverSettingsArgs Empty = new ChannelInputAttachmentAutomaticInputFailoverSettingsArgs();

    @Import(name="errorClearTimeMsec")
    private @Nullable Output<Integer> errorClearTimeMsec;

    public Optional<Output<Integer>> errorClearTimeMsec() {
        return Optional.ofNullable(this.errorClearTimeMsec);
    }

    @Import(name="failoverConditions")
    private @Nullable Output<List<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs>> failoverConditions;

    public Optional<Output<List<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs>>> failoverConditions() {
        return Optional.ofNullable(this.failoverConditions);
    }

    @Import(name="inputPreference")
    private @Nullable Output<String> inputPreference;

    public Optional<Output<String>> inputPreference() {
        return Optional.ofNullable(this.inputPreference);
    }

    @Import(name="secondaryInputId", required=true)
    private Output<String> secondaryInputId;

    public Output<String> secondaryInputId() {
        return this.secondaryInputId;
    }

    private ChannelInputAttachmentAutomaticInputFailoverSettingsArgs() {}

    private ChannelInputAttachmentAutomaticInputFailoverSettingsArgs(ChannelInputAttachmentAutomaticInputFailoverSettingsArgs $) {
        this.errorClearTimeMsec = $.errorClearTimeMsec;
        this.failoverConditions = $.failoverConditions;
        this.inputPreference = $.inputPreference;
        this.secondaryInputId = $.secondaryInputId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelInputAttachmentAutomaticInputFailoverSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelInputAttachmentAutomaticInputFailoverSettingsArgs $;

        public Builder() {
            $ = new ChannelInputAttachmentAutomaticInputFailoverSettingsArgs();
        }

        public Builder(ChannelInputAttachmentAutomaticInputFailoverSettingsArgs defaults) {
            $ = new ChannelInputAttachmentAutomaticInputFailoverSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder errorClearTimeMsec(@Nullable Output<Integer> errorClearTimeMsec) {
            $.errorClearTimeMsec = errorClearTimeMsec;
            return this;
        }

        public Builder errorClearTimeMsec(Integer errorClearTimeMsec) {
            return errorClearTimeMsec(Output.of(errorClearTimeMsec));
        }

        public Builder failoverConditions(@Nullable Output<List<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs>> failoverConditions) {
            $.failoverConditions = failoverConditions;
            return this;
        }

        public Builder failoverConditions(List<ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs> failoverConditions) {
            return failoverConditions(Output.of(failoverConditions));
        }

        public Builder failoverConditions(ChannelInputAttachmentAutomaticInputFailoverSettingsFailoverConditionArgs... failoverConditions) {
            return failoverConditions(List.of(failoverConditions));
        }

        public Builder inputPreference(@Nullable Output<String> inputPreference) {
            $.inputPreference = inputPreference;
            return this;
        }

        public Builder inputPreference(String inputPreference) {
            return inputPreference(Output.of(inputPreference));
        }

        public Builder secondaryInputId(Output<String> secondaryInputId) {
            $.secondaryInputId = secondaryInputId;
            return this;
        }

        public Builder secondaryInputId(String secondaryInputId) {
            return secondaryInputId(Output.of(secondaryInputId));
        }

        public ChannelInputAttachmentAutomaticInputFailoverSettingsArgs build() {
            $.secondaryInputId = Objects.requireNonNull($.secondaryInputId, "expected parameter 'secondaryInputId' to be non-null");
            return $;
        }
    }

}
