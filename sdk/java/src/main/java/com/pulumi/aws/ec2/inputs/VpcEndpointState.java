// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.VpcEndpointDnsEntryArgs;
import com.pulumi.aws.ec2.inputs.VpcEndpointDnsOptionsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpcEndpointState extends com.pulumi.resources.ResourceArgs {

    public static final VpcEndpointState Empty = new VpcEndpointState();

    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the VPC endpoint.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
     * 
     */
    @Import(name="autoAccept")
    private @Nullable Output<Boolean> autoAccept;

    /**
     * @return Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
     * 
     */
    public Optional<Output<Boolean>> autoAccept() {
        return Optional.ofNullable(this.autoAccept);
    }

    /**
     * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
     */
    @Import(name="cidrBlocks")
    private @Nullable Output<List<String>> cidrBlocks;

    /**
     * @return The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
     */
    public Optional<Output<List<String>>> cidrBlocks() {
        return Optional.ofNullable(this.cidrBlocks);
    }

    /**
     * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
     * 
     */
    @Import(name="dnsEntries")
    private @Nullable Output<List<VpcEndpointDnsEntryArgs>> dnsEntries;

    /**
     * @return The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
     * 
     */
    public Optional<Output<List<VpcEndpointDnsEntryArgs>>> dnsEntries() {
        return Optional.ofNullable(this.dnsEntries);
    }

    /**
     * The DNS options for the endpoint. See dns_options below.
     * 
     */
    @Import(name="dnsOptions")
    private @Nullable Output<VpcEndpointDnsOptionsArgs> dnsOptions;

    /**
     * @return The DNS options for the endpoint. See dns_options below.
     * 
     */
    public Optional<Output<VpcEndpointDnsOptionsArgs>> dnsOptions() {
        return Optional.ofNullable(this.dnsOptions);
    }

    /**
     * The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
     * 
     */
    @Import(name="ipAddressType")
    private @Nullable Output<String> ipAddressType;

    /**
     * @return The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
     * 
     */
    public Optional<Output<String>> ipAddressType() {
        return Optional.ofNullable(this.ipAddressType);
    }

    /**
     * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
     * 
     */
    @Import(name="networkInterfaceIds")
    private @Nullable Output<List<String>> networkInterfaceIds;

    /**
     * @return One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
     * 
     */
    public Optional<Output<List<String>>> networkInterfaceIds() {
        return Optional.ofNullable(this.networkInterfaceIds);
    }

    /**
     * The ID of the AWS account that owns the VPC endpoint.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return The ID of the AWS account that owns the VPC endpoint.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    /**
     * A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
     * 
     */
    @Import(name="policy")
    private @Nullable Output<String> policy;

    /**
     * @return A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
     * 
     */
    public Optional<Output<String>> policy() {
        return Optional.ofNullable(this.policy);
    }

    /**
     * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
     */
    @Import(name="prefixListId")
    private @Nullable Output<String> prefixListId;

    /**
     * @return The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
     * 
     */
    public Optional<Output<String>> prefixListId() {
        return Optional.ofNullable(this.prefixListId);
    }

    /**
     * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
     * Defaults to `false`.
     * 
     */
    @Import(name="privateDnsEnabled")
    private @Nullable Output<Boolean> privateDnsEnabled;

    /**
     * @return Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
     * Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> privateDnsEnabled() {
        return Optional.ofNullable(this.privateDnsEnabled);
    }

    /**
     * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
     * 
     */
    @Import(name="requesterManaged")
    private @Nullable Output<Boolean> requesterManaged;

    /**
     * @return Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
     * 
     */
    public Optional<Output<Boolean>> requesterManaged() {
        return Optional.ofNullable(this.requesterManaged);
    }

    /**
     * One or more route table IDs. Applicable for endpoints of type `Gateway`.
     * 
     */
    @Import(name="routeTableIds")
    private @Nullable Output<List<String>> routeTableIds;

    /**
     * @return One or more route table IDs. Applicable for endpoints of type `Gateway`.
     * 
     */
    public Optional<Output<List<String>>> routeTableIds() {
        return Optional.ofNullable(this.routeTableIds);
    }

    /**
     * The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
     * If no security groups are specified, the VPC&#39;s [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
     * 
     */
    @Import(name="securityGroupIds")
    private @Nullable Output<List<String>> securityGroupIds;

    /**
     * @return The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
     * If no security groups are specified, the VPC&#39;s [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
     * 
     */
    public Optional<Output<List<String>>> securityGroupIds() {
        return Optional.ofNullable(this.securityGroupIds);
    }

    /**
     * The service name. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
     * 
     */
    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    /**
     * @return The service name. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
     * 
     */
    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    /**
     * The state of the VPC endpoint.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the VPC endpoint.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
     * 
     */
    @Import(name="vpcEndpointType")
    private @Nullable Output<String> vpcEndpointType;

    /**
     * @return The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
     * 
     */
    public Optional<Output<String>> vpcEndpointType() {
        return Optional.ofNullable(this.vpcEndpointType);
    }

    /**
     * The ID of the VPC in which the endpoint will be used.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC in which the endpoint will be used.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private VpcEndpointState() {}

    private VpcEndpointState(VpcEndpointState $) {
        this.arn = $.arn;
        this.autoAccept = $.autoAccept;
        this.cidrBlocks = $.cidrBlocks;
        this.dnsEntries = $.dnsEntries;
        this.dnsOptions = $.dnsOptions;
        this.ipAddressType = $.ipAddressType;
        this.networkInterfaceIds = $.networkInterfaceIds;
        this.ownerId = $.ownerId;
        this.policy = $.policy;
        this.prefixListId = $.prefixListId;
        this.privateDnsEnabled = $.privateDnsEnabled;
        this.requesterManaged = $.requesterManaged;
        this.routeTableIds = $.routeTableIds;
        this.securityGroupIds = $.securityGroupIds;
        this.serviceName = $.serviceName;
        this.state = $.state;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcEndpointType = $.vpcEndpointType;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpcEndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpcEndpointState $;

        public Builder() {
            $ = new VpcEndpointState();
        }

        public Builder(VpcEndpointState defaults) {
            $ = new VpcEndpointState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the VPC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the VPC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param autoAccept Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
         * 
         * @return builder
         * 
         */
        public Builder autoAccept(@Nullable Output<Boolean> autoAccept) {
            $.autoAccept = autoAccept;
            return this;
        }

        /**
         * @param autoAccept Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
         * 
         * @return builder
         * 
         */
        public Builder autoAccept(Boolean autoAccept) {
            return autoAccept(Output.of(autoAccept));
        }

        /**
         * @param cidrBlocks The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(@Nullable Output<List<String>> cidrBlocks) {
            $.cidrBlocks = cidrBlocks;
            return this;
        }

        /**
         * @param cidrBlocks The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(List<String> cidrBlocks) {
            return cidrBlocks(Output.of(cidrBlocks));
        }

        /**
         * @param cidrBlocks The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlocks(String... cidrBlocks) {
            return cidrBlocks(List.of(cidrBlocks));
        }

        /**
         * @param dnsEntries The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder dnsEntries(@Nullable Output<List<VpcEndpointDnsEntryArgs>> dnsEntries) {
            $.dnsEntries = dnsEntries;
            return this;
        }

        /**
         * @param dnsEntries The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder dnsEntries(List<VpcEndpointDnsEntryArgs> dnsEntries) {
            return dnsEntries(Output.of(dnsEntries));
        }

        /**
         * @param dnsEntries The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
         * 
         * @return builder
         * 
         */
        public Builder dnsEntries(VpcEndpointDnsEntryArgs... dnsEntries) {
            return dnsEntries(List.of(dnsEntries));
        }

        /**
         * @param dnsOptions The DNS options for the endpoint. See dns_options below.
         * 
         * @return builder
         * 
         */
        public Builder dnsOptions(@Nullable Output<VpcEndpointDnsOptionsArgs> dnsOptions) {
            $.dnsOptions = dnsOptions;
            return this;
        }

        /**
         * @param dnsOptions The DNS options for the endpoint. See dns_options below.
         * 
         * @return builder
         * 
         */
        public Builder dnsOptions(VpcEndpointDnsOptionsArgs dnsOptions) {
            return dnsOptions(Output.of(dnsOptions));
        }

        /**
         * @param ipAddressType The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressType(@Nullable Output<String> ipAddressType) {
            $.ipAddressType = ipAddressType;
            return this;
        }

        /**
         * @param ipAddressType The IP address type for the endpoint. Valid values are `ipv4`, `dualstack`, and `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder ipAddressType(String ipAddressType) {
            return ipAddressType(Output.of(ipAddressType));
        }

        /**
         * @param networkInterfaceIds One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceIds(@Nullable Output<List<String>> networkInterfaceIds) {
            $.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        /**
         * @param networkInterfaceIds One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceIds(List<String> networkInterfaceIds) {
            return networkInterfaceIds(Output.of(networkInterfaceIds));
        }

        /**
         * @param networkInterfaceIds One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder networkInterfaceIds(String... networkInterfaceIds) {
            return networkInterfaceIds(List.of(networkInterfaceIds));
        }

        /**
         * @param ownerId The ID of the AWS account that owns the VPC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId The ID of the AWS account that owns the VPC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        /**
         * @param policy A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder policy(@Nullable Output<String> policy) {
            $.policy = policy;
            return this;
        }

        /**
         * @param policy A policy to attach to the endpoint that controls access to the service. This is a JSON formatted string. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
         * 
         * @return builder
         * 
         */
        public Builder policy(String policy) {
            return policy(Output.of(policy));
        }

        /**
         * @param prefixListId The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder prefixListId(@Nullable Output<String> prefixListId) {
            $.prefixListId = prefixListId;
            return this;
        }

        /**
         * @param prefixListId The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder prefixListId(String prefixListId) {
            return prefixListId(Output.of(prefixListId));
        }

        /**
         * @param privateDnsEnabled Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsEnabled(@Nullable Output<Boolean> privateDnsEnabled) {
            $.privateDnsEnabled = privateDnsEnabled;
            return this;
        }

        /**
         * @param privateDnsEnabled Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
         * Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder privateDnsEnabled(Boolean privateDnsEnabled) {
            return privateDnsEnabled(Output.of(privateDnsEnabled));
        }

        /**
         * @param requesterManaged Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder requesterManaged(@Nullable Output<Boolean> requesterManaged) {
            $.requesterManaged = requesterManaged;
            return this;
        }

        /**
         * @param requesterManaged Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
         * 
         * @return builder
         * 
         */
        public Builder requesterManaged(Boolean requesterManaged) {
            return requesterManaged(Output.of(requesterManaged));
        }

        /**
         * @param routeTableIds One or more route table IDs. Applicable for endpoints of type `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder routeTableIds(@Nullable Output<List<String>> routeTableIds) {
            $.routeTableIds = routeTableIds;
            return this;
        }

        /**
         * @param routeTableIds One or more route table IDs. Applicable for endpoints of type `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder routeTableIds(List<String> routeTableIds) {
            return routeTableIds(Output.of(routeTableIds));
        }

        /**
         * @param routeTableIds One or more route table IDs. Applicable for endpoints of type `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder routeTableIds(String... routeTableIds) {
            return routeTableIds(List.of(routeTableIds));
        }

        /**
         * @param securityGroupIds The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
         * If no security groups are specified, the VPC&#39;s [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(@Nullable Output<List<String>> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * @param securityGroupIds The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
         * If no security groups are specified, the VPC&#39;s [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(List<String> securityGroupIds) {
            return securityGroupIds(Output.of(securityGroupIds));
        }

        /**
         * @param securityGroupIds The ID of one or more security groups to associate with the network interface. Applicable for endpoints of type `Interface`.
         * If no security groups are specified, the VPC&#39;s [default security group](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html#DefaultSecurityGroup) is associated with the endpoint.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        /**
         * @param serviceName The service name. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
         * 
         * @return builder
         * 
         */
        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The service name. For AWS services the service name is usually in the form `com.amazonaws.&lt;region&gt;.&lt;service&gt;` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.&lt;region&gt;.notebook`).
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param state The state of the VPC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the VPC endpoint.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subnetIds The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `GatewayLoadBalancer` and `Interface`.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpcEndpointType The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointType(@Nullable Output<String> vpcEndpointType) {
            $.vpcEndpointType = vpcEndpointType;
            return this;
        }

        /**
         * @param vpcEndpointType The VPC endpoint type, `Gateway`, `GatewayLoadBalancer`, or `Interface`. Defaults to `Gateway`.
         * 
         * @return builder
         * 
         */
        public Builder vpcEndpointType(String vpcEndpointType) {
            return vpcEndpointType(Output.of(vpcEndpointType));
        }

        /**
         * @param vpcId The ID of the VPC in which the endpoint will be used.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC in which the endpoint will be used.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public VpcEndpointState build() {
            return $;
        }
    }

}