// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs Empty = new GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs();

    /**
     * Maximum. Set to `0` to exclude instance types with accelerators.
     * 
     */
    @Import(name="max")
    private @Nullable Output<Double> max;

    /**
     * @return Maximum. Set to `0` to exclude instance types with accelerators.
     * 
     */
    public Optional<Output<Double>> max() {
        return Optional.ofNullable(this.max);
    }

    /**
     * Minimum.
     * 
     */
    @Import(name="min")
    private @Nullable Output<Double> min;

    /**
     * @return Minimum.
     * 
     */
    public Optional<Output<Double>> min() {
        return Optional.ofNullable(this.min);
    }

    private GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs() {}

    private GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs(GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs $;

        public Builder() {
            $ = new GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs();
        }

        public Builder(GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs defaults) {
            $ = new GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param max Maximum. Set to `0` to exclude instance types with accelerators.
         * 
         * @return builder
         * 
         */
        public Builder max(@Nullable Output<Double> max) {
            $.max = max;
            return this;
        }

        /**
         * @param max Maximum. Set to `0` to exclude instance types with accelerators.
         * 
         * @return builder
         * 
         */
        public Builder max(Double max) {
            return max(Output.of(max));
        }

        /**
         * @param min Minimum.
         * 
         * @return builder
         * 
         */
        public Builder min(@Nullable Output<Double> min) {
            $.min = min;
            return this;
        }

        /**
         * @param min Minimum.
         * 
         * @return builder
         * 
         */
        public Builder min(Double min) {
            return min(Output.of(min));
        }

        public GroupMixedInstancesPolicyLaunchTemplateOverrideInstanceRequirementsMemoryGibPerVcpuArgs build() {
            return $;
        }
    }

}
