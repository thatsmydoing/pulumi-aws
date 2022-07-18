// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostedConnectionState extends com.pulumi.resources.ResourceArgs {

    public static final HostedConnectionState Empty = new HostedConnectionState();

    /**
     * The Direct Connect endpoint on which the physical connection terminates.
     * 
     */
    @Import(name="awsDevice")
    private @Nullable Output<String> awsDevice;

    /**
     * @return The Direct Connect endpoint on which the physical connection terminates.
     * 
     */
    public Optional<Output<String>> awsDevice() {
        return Optional.ofNullable(this.awsDevice);
    }

    /**
     * The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     * 
     */
    @Import(name="bandwidth")
    private @Nullable Output<String> bandwidth;

    /**
     * @return The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
     * 
     */
    public Optional<Output<String>> bandwidth() {
        return Optional.ofNullable(this.bandwidth);
    }

    /**
     * The ID of the interconnect or LAG.
     * 
     */
    @Import(name="connectionId")
    private @Nullable Output<String> connectionId;

    /**
     * @return The ID of the interconnect or LAG.
     * 
     */
    public Optional<Output<String>> connectionId() {
        return Optional.ofNullable(this.connectionId);
    }

    /**
     * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    @Import(name="hasLogicalRedundancy")
    private @Nullable Output<String> hasLogicalRedundancy;

    /**
     * @return Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
     * 
     */
    public Optional<Output<String>> hasLogicalRedundancy() {
        return Optional.ofNullable(this.hasLogicalRedundancy);
    }

    /**
     * Boolean value representing if jumbo frames have been enabled for this connection.
     * 
     */
    @Import(name="jumboFrameCapable")
    private @Nullable Output<Boolean> jumboFrameCapable;

    /**
     * @return Boolean value representing if jumbo frames have been enabled for this connection.
     * 
     */
    public Optional<Output<Boolean>> jumboFrameCapable() {
        return Optional.ofNullable(this.jumboFrameCapable);
    }

    /**
     * The ID of the LAG.
     * 
     */
    @Import(name="lagId")
    private @Nullable Output<String> lagId;

    /**
     * @return The ID of the LAG.
     * 
     */
    public Optional<Output<String>> lagId() {
        return Optional.ofNullable(this.lagId);
    }

    /**
     * The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
     * 
     */
    @Import(name="loaIssueTime")
    private @Nullable Output<String> loaIssueTime;

    /**
     * @return The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
     * 
     */
    public Optional<Output<String>> loaIssueTime() {
        return Optional.ofNullable(this.loaIssueTime);
    }

    /**
     * The location of the connection.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the connection.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the connection.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the connection.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the AWS account of the customer for the connection.
     * 
     */
    @Import(name="ownerAccountId")
    private @Nullable Output<String> ownerAccountId;

    /**
     * @return The ID of the AWS account of the customer for the connection.
     * 
     */
    public Optional<Output<String>> ownerAccountId() {
        return Optional.ofNullable(this.ownerAccountId);
    }

    /**
     * The name of the AWS Direct Connect service provider associated with the connection.
     * 
     */
    @Import(name="partnerName")
    private @Nullable Output<String> partnerName;

    /**
     * @return The name of the AWS Direct Connect service provider associated with the connection.
     * 
     */
    public Optional<Output<String>> partnerName() {
        return Optional.ofNullable(this.partnerName);
    }

    /**
     * The name of the service provider associated with the connection.
     * 
     */
    @Import(name="providerName")
    private @Nullable Output<String> providerName;

    /**
     * @return The name of the service provider associated with the connection.
     * 
     */
    public Optional<Output<String>> providerName() {
        return Optional.ofNullable(this.providerName);
    }

    /**
     * The AWS Region where the connection is located.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The AWS Region where the connection is located.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The dedicated VLAN provisioned to the hosted connection.
     * 
     */
    @Import(name="vlan")
    private @Nullable Output<Integer> vlan;

    /**
     * @return The dedicated VLAN provisioned to the hosted connection.
     * 
     */
    public Optional<Output<Integer>> vlan() {
        return Optional.ofNullable(this.vlan);
    }

    private HostedConnectionState() {}

    private HostedConnectionState(HostedConnectionState $) {
        this.awsDevice = $.awsDevice;
        this.bandwidth = $.bandwidth;
        this.connectionId = $.connectionId;
        this.hasLogicalRedundancy = $.hasLogicalRedundancy;
        this.jumboFrameCapable = $.jumboFrameCapable;
        this.lagId = $.lagId;
        this.loaIssueTime = $.loaIssueTime;
        this.location = $.location;
        this.name = $.name;
        this.ownerAccountId = $.ownerAccountId;
        this.partnerName = $.partnerName;
        this.providerName = $.providerName;
        this.region = $.region;
        this.state = $.state;
        this.vlan = $.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostedConnectionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostedConnectionState $;

        public Builder() {
            $ = new HostedConnectionState();
        }

        public Builder(HostedConnectionState defaults) {
            $ = new HostedConnectionState(Objects.requireNonNull(defaults));
        }

        /**
         * @param awsDevice The Direct Connect endpoint on which the physical connection terminates.
         * 
         * @return builder
         * 
         */
        public Builder awsDevice(@Nullable Output<String> awsDevice) {
            $.awsDevice = awsDevice;
            return this;
        }

        /**
         * @param awsDevice The Direct Connect endpoint on which the physical connection terminates.
         * 
         * @return builder
         * 
         */
        public Builder awsDevice(String awsDevice) {
            return awsDevice(Output.of(awsDevice));
        }

        /**
         * @param bandwidth The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(@Nullable Output<String> bandwidth) {
            $.bandwidth = bandwidth;
            return this;
        }

        /**
         * @param bandwidth The bandwidth of the connection. Valid values for dedicated connections: 1Gbps, 10Gbps. Valid values for hosted connections: 50Mbps, 100Mbps, 200Mbps, 300Mbps, 400Mbps, 500Mbps, 1Gbps, 2Gbps, 5Gbps and 10Gbps. Case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder bandwidth(String bandwidth) {
            return bandwidth(Output.of(bandwidth));
        }

        /**
         * @param connectionId The ID of the interconnect or LAG.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(@Nullable Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId The ID of the interconnect or LAG.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param hasLogicalRedundancy Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
         * 
         * @return builder
         * 
         */
        public Builder hasLogicalRedundancy(@Nullable Output<String> hasLogicalRedundancy) {
            $.hasLogicalRedundancy = hasLogicalRedundancy;
            return this;
        }

        /**
         * @param hasLogicalRedundancy Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
         * 
         * @return builder
         * 
         */
        public Builder hasLogicalRedundancy(String hasLogicalRedundancy) {
            return hasLogicalRedundancy(Output.of(hasLogicalRedundancy));
        }

        /**
         * @param jumboFrameCapable Boolean value representing if jumbo frames have been enabled for this connection.
         * 
         * @return builder
         * 
         */
        public Builder jumboFrameCapable(@Nullable Output<Boolean> jumboFrameCapable) {
            $.jumboFrameCapable = jumboFrameCapable;
            return this;
        }

        /**
         * @param jumboFrameCapable Boolean value representing if jumbo frames have been enabled for this connection.
         * 
         * @return builder
         * 
         */
        public Builder jumboFrameCapable(Boolean jumboFrameCapable) {
            return jumboFrameCapable(Output.of(jumboFrameCapable));
        }

        /**
         * @param lagId The ID of the LAG.
         * 
         * @return builder
         * 
         */
        public Builder lagId(@Nullable Output<String> lagId) {
            $.lagId = lagId;
            return this;
        }

        /**
         * @param lagId The ID of the LAG.
         * 
         * @return builder
         * 
         */
        public Builder lagId(String lagId) {
            return lagId(Output.of(lagId));
        }

        /**
         * @param loaIssueTime The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
         * 
         * @return builder
         * 
         */
        public Builder loaIssueTime(@Nullable Output<String> loaIssueTime) {
            $.loaIssueTime = loaIssueTime;
            return this;
        }

        /**
         * @param loaIssueTime The time of the most recent call to [DescribeLoa](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_DescribeLoa.html) for this connection.
         * 
         * @return builder
         * 
         */
        public Builder loaIssueTime(String loaIssueTime) {
            return loaIssueTime(Output.of(loaIssueTime));
        }

        /**
         * @param location The location of the connection.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the connection.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the connection.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerAccountId The ID of the AWS account of the customer for the connection.
         * 
         * @return builder
         * 
         */
        public Builder ownerAccountId(@Nullable Output<String> ownerAccountId) {
            $.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * @param ownerAccountId The ID of the AWS account of the customer for the connection.
         * 
         * @return builder
         * 
         */
        public Builder ownerAccountId(String ownerAccountId) {
            return ownerAccountId(Output.of(ownerAccountId));
        }

        /**
         * @param partnerName The name of the AWS Direct Connect service provider associated with the connection.
         * 
         * @return builder
         * 
         */
        public Builder partnerName(@Nullable Output<String> partnerName) {
            $.partnerName = partnerName;
            return this;
        }

        /**
         * @param partnerName The name of the AWS Direct Connect service provider associated with the connection.
         * 
         * @return builder
         * 
         */
        public Builder partnerName(String partnerName) {
            return partnerName(Output.of(partnerName));
        }

        /**
         * @param providerName The name of the service provider associated with the connection.
         * 
         * @return builder
         * 
         */
        public Builder providerName(@Nullable Output<String> providerName) {
            $.providerName = providerName;
            return this;
        }

        /**
         * @param providerName The name of the service provider associated with the connection.
         * 
         * @return builder
         * 
         */
        public Builder providerName(String providerName) {
            return providerName(Output.of(providerName));
        }

        /**
         * @param region The AWS Region where the connection is located.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The AWS Region where the connection is located.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param state The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The state of the connection. Possible values include: ordering, requested, pending, available, down, deleting, deleted, rejected, unknown. See [AllocateHostedConnection](https://docs.aws.amazon.com/directconnect/latest/APIReference/API_AllocateHostedConnection.html) for a description of each connection state.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param vlan The dedicated VLAN provisioned to the hosted connection.
         * 
         * @return builder
         * 
         */
        public Builder vlan(@Nullable Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        /**
         * @param vlan The dedicated VLAN provisioned to the hosted connection.
         * 
         * @return builder
         * 
         */
        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        public HostedConnectionState build() {
            return $;
        }
    }

}