// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuleSourceCustomPolicyDetails {
    /**
     * @return The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is `false`.
     * 
     */
    private final @Nullable Boolean enableDebugLogDelivery;
    /**
     * @return The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. For more information about Guard, see the [Guard GitHub Repository](https://github.com/aws-cloudformation/cloudformation-guard).
     * 
     */
    private final String policyRuntime;
    /**
     * @return The policy definition containing the logic for your Config Custom Policy rule.
     * 
     */
    private final String policyText;

    @CustomType.Constructor
    private RuleSourceCustomPolicyDetails(
        @CustomType.Parameter("enableDebugLogDelivery") @Nullable Boolean enableDebugLogDelivery,
        @CustomType.Parameter("policyRuntime") String policyRuntime,
        @CustomType.Parameter("policyText") String policyText) {
        this.enableDebugLogDelivery = enableDebugLogDelivery;
        this.policyRuntime = policyRuntime;
        this.policyText = policyText;
    }

    /**
     * @return The boolean expression for enabling debug logging for your Config Custom Policy rule. The default value is `false`.
     * 
     */
    public Optional<Boolean> enableDebugLogDelivery() {
        return Optional.ofNullable(this.enableDebugLogDelivery);
    }
    /**
     * @return The runtime system for your Config Custom Policy rule. Guard is a policy-as-code language that allows you to write policies that are enforced by Config Custom Policy rules. For more information about Guard, see the [Guard GitHub Repository](https://github.com/aws-cloudformation/cloudformation-guard).
     * 
     */
    public String policyRuntime() {
        return this.policyRuntime;
    }
    /**
     * @return The policy definition containing the logic for your Config Custom Policy rule.
     * 
     */
    public String policyText() {
        return this.policyText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleSourceCustomPolicyDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enableDebugLogDelivery;
        private String policyRuntime;
        private String policyText;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleSourceCustomPolicyDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableDebugLogDelivery = defaults.enableDebugLogDelivery;
    	      this.policyRuntime = defaults.policyRuntime;
    	      this.policyText = defaults.policyText;
        }

        public Builder enableDebugLogDelivery(@Nullable Boolean enableDebugLogDelivery) {
            this.enableDebugLogDelivery = enableDebugLogDelivery;
            return this;
        }
        public Builder policyRuntime(String policyRuntime) {
            this.policyRuntime = Objects.requireNonNull(policyRuntime);
            return this;
        }
        public Builder policyText(String policyText) {
            this.policyText = Objects.requireNonNull(policyText);
            return this;
        }        public RuleSourceCustomPolicyDetails build() {
            return new RuleSourceCustomPolicyDetails(enableDebugLogDelivery, policyRuntime, policyText);
        }
    }
}