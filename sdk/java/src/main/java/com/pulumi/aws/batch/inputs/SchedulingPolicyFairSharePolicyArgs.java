// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.inputs;

import com.pulumi.aws.batch.inputs.SchedulingPolicyFairSharePolicyShareDistributionArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SchedulingPolicyFairSharePolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulingPolicyFairSharePolicyArgs Empty = new SchedulingPolicyFairSharePolicyArgs();

    /**
     * A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
     * 
     */
    @Import(name="computeReservation")
    private @Nullable Output<Integer> computeReservation;

    /**
     * @return A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
     * 
     */
    public Optional<Output<Integer>> computeReservation() {
        return Optional.ofNullable(this.computeReservation);
    }

    @Import(name="shareDecaySeconds")
    private @Nullable Output<Integer> shareDecaySeconds;

    public Optional<Output<Integer>> shareDecaySeconds() {
        return Optional.ofNullable(this.shareDecaySeconds);
    }

    /**
     * One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
     * 
     */
    @Import(name="shareDistributions")
    private @Nullable Output<List<SchedulingPolicyFairSharePolicyShareDistributionArgs>> shareDistributions;

    /**
     * @return One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
     * 
     */
    public Optional<Output<List<SchedulingPolicyFairSharePolicyShareDistributionArgs>>> shareDistributions() {
        return Optional.ofNullable(this.shareDistributions);
    }

    private SchedulingPolicyFairSharePolicyArgs() {}

    private SchedulingPolicyFairSharePolicyArgs(SchedulingPolicyFairSharePolicyArgs $) {
        this.computeReservation = $.computeReservation;
        this.shareDecaySeconds = $.shareDecaySeconds;
        this.shareDistributions = $.shareDistributions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingPolicyFairSharePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingPolicyFairSharePolicyArgs $;

        public Builder() {
            $ = new SchedulingPolicyFairSharePolicyArgs();
        }

        public Builder(SchedulingPolicyFairSharePolicyArgs defaults) {
            $ = new SchedulingPolicyFairSharePolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param computeReservation A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
         * 
         * @return builder
         * 
         */
        public Builder computeReservation(@Nullable Output<Integer> computeReservation) {
            $.computeReservation = computeReservation;
            return this;
        }

        /**
         * @param computeReservation A value used to reserve some of the available maximum vCPU for fair share identifiers that have not yet been used. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html).
         * 
         * @return builder
         * 
         */
        public Builder computeReservation(Integer computeReservation) {
            return computeReservation(Output.of(computeReservation));
        }

        public Builder shareDecaySeconds(@Nullable Output<Integer> shareDecaySeconds) {
            $.shareDecaySeconds = shareDecaySeconds;
            return this;
        }

        public Builder shareDecaySeconds(Integer shareDecaySeconds) {
            return shareDecaySeconds(Output.of(shareDecaySeconds));
        }

        /**
         * @param shareDistributions One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareDistributions(@Nullable Output<List<SchedulingPolicyFairSharePolicyShareDistributionArgs>> shareDistributions) {
            $.shareDistributions = shareDistributions;
            return this;
        }

        /**
         * @param shareDistributions One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareDistributions(List<SchedulingPolicyFairSharePolicyShareDistributionArgs> shareDistributions) {
            return shareDistributions(Output.of(shareDistributions));
        }

        /**
         * @param shareDistributions One or more share distribution blocks which define the weights for the fair share identifiers for the fair share policy. For more information, see [FairsharePolicy](https://docs.aws.amazon.com/batch/latest/APIReference/API_FairsharePolicy.html). The `share_distribution` block is documented below.
         * 
         * @return builder
         * 
         */
        public Builder shareDistributions(SchedulingPolicyFairSharePolicyShareDistributionArgs... shareDistributions) {
            return shareDistributions(List.of(shareDistributions));
        }

        public SchedulingPolicyFairSharePolicyArgs build() {
            return $;
        }
    }

}