// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ScheduledActionTargetActionResumeCluster {
    /**
     * @return The identifier of the cluster to be resumed.
     * 
     */
    private String clusterIdentifier;

    private ScheduledActionTargetActionResumeCluster() {}
    /**
     * @return The identifier of the cluster to be resumed.
     * 
     */
    public String clusterIdentifier() {
        return this.clusterIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledActionTargetActionResumeCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clusterIdentifier;
        public Builder() {}
        public Builder(ScheduledActionTargetActionResumeCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterIdentifier = defaults.clusterIdentifier;
        }

        @CustomType.Setter
        public Builder clusterIdentifier(String clusterIdentifier) {
            this.clusterIdentifier = Objects.requireNonNull(clusterIdentifier);
            return this;
        }
        public ScheduledActionTargetActionResumeCluster build() {
            final var o = new ScheduledActionTargetActionResumeCluster();
            o.clusterIdentifier = clusterIdentifier;
            return o;
        }
    }
}
