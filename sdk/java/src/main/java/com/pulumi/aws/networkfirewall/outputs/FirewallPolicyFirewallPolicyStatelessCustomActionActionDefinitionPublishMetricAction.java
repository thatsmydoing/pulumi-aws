// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkfirewall.outputs;

import com.pulumi.aws.networkfirewall.outputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction {
    /**
     * @return Set of configuration blocks describing dimension settings to use for Amazon CloudWatch custom metrics. See Dimension below for more details.
     * 
     */
    private final List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension> dimensions;

    @CustomType.Constructor
    private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction(@CustomType.Parameter("dimensions") List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension> dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * @return Set of configuration blocks describing dimension settings to use for Amazon CloudWatch custom metrics. See Dimension below for more details.
     * 
     */
    public List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension> dimensions() {
        return this.dimensions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension> dimensions;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
        }

        public Builder dimensions(List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public Builder dimensions(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimension... dimensions) {
            return dimensions(List.of(dimensions));
        }        public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction build() {
            return new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricAction(dimensions);
        }
    }
}