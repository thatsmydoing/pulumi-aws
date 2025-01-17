// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.outputs;

import com.pulumi.aws.ec2transitgateway.outputs.GetTransitGatewayFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetTransitGatewayResult {
    /**
     * @return Private Autonomous System Number (ASN) for the Amazon side of a BGP session
     * 
     */
    private Integer amazonSideAsn;
    /**
     * @return EC2 Transit Gateway ARN
     * 
     */
    private String arn;
    /**
     * @return Identifier of the default association route table
     * 
     */
    private String associationDefaultRouteTableId;
    /**
     * @return Whether resource attachment requests are automatically accepted
     * 
     */
    private String autoAcceptSharedAttachments;
    /**
     * @return Whether resource attachments are automatically associated with the default association route table
     * 
     */
    private String defaultRouteTableAssociation;
    /**
     * @return Whether resource attachments automatically propagate routes to the default propagation route table
     * 
     */
    private String defaultRouteTablePropagation;
    /**
     * @return Description of the EC2 Transit Gateway
     * 
     */
    private String description;
    /**
     * @return Whether DNS support is enabled
     * 
     */
    private String dnsSupport;
    private @Nullable List<GetTransitGatewayFilter> filters;
    /**
     * @return EC2 Transit Gateway identifier
     * 
     */
    private String id;
    /**
     * @return Whether Multicast support is enabled
     * 
     */
    private String multicastSupport;
    /**
     * @return Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    private String ownerId;
    /**
     * @return Identifier of the default propagation route table
     * 
     */
    private String propagationDefaultRouteTableId;
    /**
     * @return Key-value tags for the EC2 Transit Gateway
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The list of associated CIDR blocks
     * 
     */
    private List<String> transitGatewayCidrBlocks;
    /**
     * @return Whether VPN Equal Cost Multipath Protocol support is enabled
     * 
     */
    private String vpnEcmpSupport;

    private GetTransitGatewayResult() {}
    /**
     * @return Private Autonomous System Number (ASN) for the Amazon side of a BGP session
     * 
     */
    public Integer amazonSideAsn() {
        return this.amazonSideAsn;
    }
    /**
     * @return EC2 Transit Gateway ARN
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return Identifier of the default association route table
     * 
     */
    public String associationDefaultRouteTableId() {
        return this.associationDefaultRouteTableId;
    }
    /**
     * @return Whether resource attachment requests are automatically accepted
     * 
     */
    public String autoAcceptSharedAttachments() {
        return this.autoAcceptSharedAttachments;
    }
    /**
     * @return Whether resource attachments are automatically associated with the default association route table
     * 
     */
    public String defaultRouteTableAssociation() {
        return this.defaultRouteTableAssociation;
    }
    /**
     * @return Whether resource attachments automatically propagate routes to the default propagation route table
     * 
     */
    public String defaultRouteTablePropagation() {
        return this.defaultRouteTablePropagation;
    }
    /**
     * @return Description of the EC2 Transit Gateway
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Whether DNS support is enabled
     * 
     */
    public String dnsSupport() {
        return this.dnsSupport;
    }
    public List<GetTransitGatewayFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return EC2 Transit Gateway identifier
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Whether Multicast support is enabled
     * 
     */
    public String multicastSupport() {
        return this.multicastSupport;
    }
    /**
     * @return Identifier of the AWS account that owns the EC2 Transit Gateway
     * 
     */
    public String ownerId() {
        return this.ownerId;
    }
    /**
     * @return Identifier of the default propagation route table
     * 
     */
    public String propagationDefaultRouteTableId() {
        return this.propagationDefaultRouteTableId;
    }
    /**
     * @return Key-value tags for the EC2 Transit Gateway
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The list of associated CIDR blocks
     * 
     */
    public List<String> transitGatewayCidrBlocks() {
        return this.transitGatewayCidrBlocks;
    }
    /**
     * @return Whether VPN Equal Cost Multipath Protocol support is enabled
     * 
     */
    public String vpnEcmpSupport() {
        return this.vpnEcmpSupport;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer amazonSideAsn;
        private String arn;
        private String associationDefaultRouteTableId;
        private String autoAcceptSharedAttachments;
        private String defaultRouteTableAssociation;
        private String defaultRouteTablePropagation;
        private String description;
        private String dnsSupport;
        private @Nullable List<GetTransitGatewayFilter> filters;
        private String id;
        private String multicastSupport;
        private String ownerId;
        private String propagationDefaultRouteTableId;
        private Map<String,String> tags;
        private List<String> transitGatewayCidrBlocks;
        private String vpnEcmpSupport;
        public Builder() {}
        public Builder(GetTransitGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonSideAsn = defaults.amazonSideAsn;
    	      this.arn = defaults.arn;
    	      this.associationDefaultRouteTableId = defaults.associationDefaultRouteTableId;
    	      this.autoAcceptSharedAttachments = defaults.autoAcceptSharedAttachments;
    	      this.defaultRouteTableAssociation = defaults.defaultRouteTableAssociation;
    	      this.defaultRouteTablePropagation = defaults.defaultRouteTablePropagation;
    	      this.description = defaults.description;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.multicastSupport = defaults.multicastSupport;
    	      this.ownerId = defaults.ownerId;
    	      this.propagationDefaultRouteTableId = defaults.propagationDefaultRouteTableId;
    	      this.tags = defaults.tags;
    	      this.transitGatewayCidrBlocks = defaults.transitGatewayCidrBlocks;
    	      this.vpnEcmpSupport = defaults.vpnEcmpSupport;
        }

        @CustomType.Setter
        public Builder amazonSideAsn(Integer amazonSideAsn) {
            this.amazonSideAsn = Objects.requireNonNull(amazonSideAsn);
            return this;
        }
        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder associationDefaultRouteTableId(String associationDefaultRouteTableId) {
            this.associationDefaultRouteTableId = Objects.requireNonNull(associationDefaultRouteTableId);
            return this;
        }
        @CustomType.Setter
        public Builder autoAcceptSharedAttachments(String autoAcceptSharedAttachments) {
            this.autoAcceptSharedAttachments = Objects.requireNonNull(autoAcceptSharedAttachments);
            return this;
        }
        @CustomType.Setter
        public Builder defaultRouteTableAssociation(String defaultRouteTableAssociation) {
            this.defaultRouteTableAssociation = Objects.requireNonNull(defaultRouteTableAssociation);
            return this;
        }
        @CustomType.Setter
        public Builder defaultRouteTablePropagation(String defaultRouteTablePropagation) {
            this.defaultRouteTablePropagation = Objects.requireNonNull(defaultRouteTablePropagation);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder dnsSupport(String dnsSupport) {
            this.dnsSupport = Objects.requireNonNull(dnsSupport);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetTransitGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetTransitGatewayFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder multicastSupport(String multicastSupport) {
            this.multicastSupport = Objects.requireNonNull(multicastSupport);
            return this;
        }
        @CustomType.Setter
        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }
        @CustomType.Setter
        public Builder propagationDefaultRouteTableId(String propagationDefaultRouteTableId) {
            this.propagationDefaultRouteTableId = Objects.requireNonNull(propagationDefaultRouteTableId);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder transitGatewayCidrBlocks(List<String> transitGatewayCidrBlocks) {
            this.transitGatewayCidrBlocks = Objects.requireNonNull(transitGatewayCidrBlocks);
            return this;
        }
        public Builder transitGatewayCidrBlocks(String... transitGatewayCidrBlocks) {
            return transitGatewayCidrBlocks(List.of(transitGatewayCidrBlocks));
        }
        @CustomType.Setter
        public Builder vpnEcmpSupport(String vpnEcmpSupport) {
            this.vpnEcmpSupport = Objects.requireNonNull(vpnEcmpSupport);
            return this;
        }
        public GetTransitGatewayResult build() {
            final var o = new GetTransitGatewayResult();
            o.amazonSideAsn = amazonSideAsn;
            o.arn = arn;
            o.associationDefaultRouteTableId = associationDefaultRouteTableId;
            o.autoAcceptSharedAttachments = autoAcceptSharedAttachments;
            o.defaultRouteTableAssociation = defaultRouteTableAssociation;
            o.defaultRouteTablePropagation = defaultRouteTablePropagation;
            o.description = description;
            o.dnsSupport = dnsSupport;
            o.filters = filters;
            o.id = id;
            o.multicastSupport = multicastSupport;
            o.ownerId = ownerId;
            o.propagationDefaultRouteTableId = propagationDefaultRouteTableId;
            o.tags = tags;
            o.transitGatewayCidrBlocks = transitGatewayCidrBlocks;
            o.vpnEcmpSupport = vpnEcmpSupport;
            return o;
        }
    }
}
