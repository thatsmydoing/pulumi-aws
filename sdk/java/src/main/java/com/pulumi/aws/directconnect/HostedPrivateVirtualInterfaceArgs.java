// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directconnect;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostedPrivateVirtualInterfaceArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostedPrivateVirtualInterfaceArgs Empty = new HostedPrivateVirtualInterfaceArgs();

    /**
     * The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    @Import(name="addressFamily", required=true)
    private Output<String> addressFamily;

    /**
     * @return The address family for the BGP peer. ` ipv4  ` or `ipv6`.
     * 
     */
    public Output<String> addressFamily() {
        return this.addressFamily;
    }

    /**
     * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    @Import(name="amazonAddress")
    private @Nullable Output<String> amazonAddress;

    /**
     * @return The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
     * 
     */
    public Optional<Output<String>> amazonAddress() {
        return Optional.ofNullable(this.amazonAddress);
    }

    /**
     * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    @Import(name="bgpAsn", required=true)
    private Output<Integer> bgpAsn;

    /**
     * @return The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
     * 
     */
    public Output<Integer> bgpAsn() {
        return this.bgpAsn;
    }

    /**
     * The authentication key for BGP configuration.
     * 
     */
    @Import(name="bgpAuthKey")
    private @Nullable Output<String> bgpAuthKey;

    /**
     * @return The authentication key for BGP configuration.
     * 
     */
    public Optional<Output<String>> bgpAuthKey() {
        return Optional.ofNullable(this.bgpAuthKey);
    }

    /**
     * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    @Import(name="connectionId", required=true)
    private Output<String> connectionId;

    /**
     * @return The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
     * 
     */
    public Output<String> connectionId() {
        return this.connectionId;
    }

    /**
     * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    @Import(name="customerAddress")
    private @Nullable Output<String> customerAddress;

    /**
     * @return The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
     * 
     */
    public Optional<Output<String>> customerAddress() {
        return Optional.ofNullable(this.customerAddress);
    }

    /**
     * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
     * 
     */
    @Import(name="mtu")
    private @Nullable Output<Integer> mtu;

    /**
     * @return The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
     * 
     */
    public Optional<Output<Integer>> mtu() {
        return Optional.ofNullable(this.mtu);
    }

    /**
     * The name for the virtual interface.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the virtual interface.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The AWS account that will own the new virtual interface.
     * 
     */
    @Import(name="ownerAccountId", required=true)
    private Output<String> ownerAccountId;

    /**
     * @return The AWS account that will own the new virtual interface.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * The VLAN ID.
     * 
     */
    @Import(name="vlan", required=true)
    private Output<Integer> vlan;

    /**
     * @return The VLAN ID.
     * 
     */
    public Output<Integer> vlan() {
        return this.vlan;
    }

    private HostedPrivateVirtualInterfaceArgs() {}

    private HostedPrivateVirtualInterfaceArgs(HostedPrivateVirtualInterfaceArgs $) {
        this.addressFamily = $.addressFamily;
        this.amazonAddress = $.amazonAddress;
        this.bgpAsn = $.bgpAsn;
        this.bgpAuthKey = $.bgpAuthKey;
        this.connectionId = $.connectionId;
        this.customerAddress = $.customerAddress;
        this.mtu = $.mtu;
        this.name = $.name;
        this.ownerAccountId = $.ownerAccountId;
        this.vlan = $.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostedPrivateVirtualInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostedPrivateVirtualInterfaceArgs $;

        public Builder() {
            $ = new HostedPrivateVirtualInterfaceArgs();
        }

        public Builder(HostedPrivateVirtualInterfaceArgs defaults) {
            $ = new HostedPrivateVirtualInterfaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressFamily The address family for the BGP peer. ` ipv4  ` or `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(Output<String> addressFamily) {
            $.addressFamily = addressFamily;
            return this;
        }

        /**
         * @param addressFamily The address family for the BGP peer. ` ipv4  ` or `ipv6`.
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(String addressFamily) {
            return addressFamily(Output.of(addressFamily));
        }

        /**
         * @param amazonAddress The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
         * 
         * @return builder
         * 
         */
        public Builder amazonAddress(@Nullable Output<String> amazonAddress) {
            $.amazonAddress = amazonAddress;
            return this;
        }

        /**
         * @param amazonAddress The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
         * 
         * @return builder
         * 
         */
        public Builder amazonAddress(String amazonAddress) {
            return amazonAddress(Output.of(amazonAddress));
        }

        /**
         * @param bgpAsn The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         * 
         * @return builder
         * 
         */
        public Builder bgpAsn(Output<Integer> bgpAsn) {
            $.bgpAsn = bgpAsn;
            return this;
        }

        /**
         * @param bgpAsn The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
         * 
         * @return builder
         * 
         */
        public Builder bgpAsn(Integer bgpAsn) {
            return bgpAsn(Output.of(bgpAsn));
        }

        /**
         * @param bgpAuthKey The authentication key for BGP configuration.
         * 
         * @return builder
         * 
         */
        public Builder bgpAuthKey(@Nullable Output<String> bgpAuthKey) {
            $.bgpAuthKey = bgpAuthKey;
            return this;
        }

        /**
         * @param bgpAuthKey The authentication key for BGP configuration.
         * 
         * @return builder
         * 
         */
        public Builder bgpAuthKey(String bgpAuthKey) {
            return bgpAuthKey(Output.of(bgpAuthKey));
        }

        /**
         * @param connectionId The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(Output<String> connectionId) {
            $.connectionId = connectionId;
            return this;
        }

        /**
         * @param connectionId The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
         * 
         * @return builder
         * 
         */
        public Builder connectionId(String connectionId) {
            return connectionId(Output.of(connectionId));
        }

        /**
         * @param customerAddress The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
         * 
         * @return builder
         * 
         */
        public Builder customerAddress(@Nullable Output<String> customerAddress) {
            $.customerAddress = customerAddress;
            return this;
        }

        /**
         * @param customerAddress The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
         * 
         * @return builder
         * 
         */
        public Builder customerAddress(String customerAddress) {
            return customerAddress(Output.of(customerAddress));
        }

        /**
         * @param mtu The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
         * 
         * @return builder
         * 
         */
        public Builder mtu(@Nullable Output<Integer> mtu) {
            $.mtu = mtu;
            return this;
        }

        /**
         * @param mtu The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
         * 
         * @return builder
         * 
         */
        public Builder mtu(Integer mtu) {
            return mtu(Output.of(mtu));
        }

        /**
         * @param name The name for the virtual interface.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the virtual interface.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param ownerAccountId The AWS account that will own the new virtual interface.
         * 
         * @return builder
         * 
         */
        public Builder ownerAccountId(Output<String> ownerAccountId) {
            $.ownerAccountId = ownerAccountId;
            return this;
        }

        /**
         * @param ownerAccountId The AWS account that will own the new virtual interface.
         * 
         * @return builder
         * 
         */
        public Builder ownerAccountId(String ownerAccountId) {
            return ownerAccountId(Output.of(ownerAccountId));
        }

        /**
         * @param vlan The VLAN ID.
         * 
         * @return builder
         * 
         */
        public Builder vlan(Output<Integer> vlan) {
            $.vlan = vlan;
            return this;
        }

        /**
         * @param vlan The VLAN ID.
         * 
         * @return builder
         * 
         */
        public Builder vlan(Integer vlan) {
            return vlan(Output.of(vlan));
        }

        public HostedPrivateVirtualInterfaceArgs build() {
            $.addressFamily = Objects.requireNonNull($.addressFamily, "expected parameter 'addressFamily' to be non-null");
            $.bgpAsn = Objects.requireNonNull($.bgpAsn, "expected parameter 'bgpAsn' to be non-null");
            $.connectionId = Objects.requireNonNull($.connectionId, "expected parameter 'connectionId' to be non-null");
            $.ownerAccountId = Objects.requireNonNull($.ownerAccountId, "expected parameter 'ownerAccountId' to be non-null");
            $.vlan = Objects.requireNonNull($.vlan, "expected parameter 'vlan' to be non-null");
            return $;
        }
    }

}