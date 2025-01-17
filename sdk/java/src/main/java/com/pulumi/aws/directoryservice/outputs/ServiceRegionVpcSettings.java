// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServiceRegionVpcSettings {
    /**
     * @return The identifiers of the subnets for the directory servers.
     * 
     */
    private List<String> subnetIds;
    /**
     * @return The identifier of the VPC in which to create the directory.
     * 
     */
    private String vpcId;

    private ServiceRegionVpcSettings() {}
    /**
     * @return The identifiers of the subnets for the directory servers.
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return The identifier of the VPC in which to create the directory.
     * 
     */
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRegionVpcSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> subnetIds;
        private String vpcId;
        public Builder() {}
        public Builder(ServiceRegionVpcSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public ServiceRegionVpcSettings build() {
            final var o = new ServiceRegionVpcSettings();
            o.subnetIds = subnetIds;
            o.vpcId = vpcId;
            return o;
        }
    }
}
