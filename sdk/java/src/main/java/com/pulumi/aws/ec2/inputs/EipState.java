// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EipState extends com.pulumi.resources.ResourceArgs {

    public static final EipState Empty = new EipState();

    /**
     * IP address from an EC2 BYOIP pool. This option is only available for VPC EIPs.
     * 
     */
    @Import(name="address")
    private @Nullable Output<String> address;

    /**
     * @return IP address from an EC2 BYOIP pool. This option is only available for VPC EIPs.
     * 
     */
    public Optional<Output<String>> address() {
        return Optional.ofNullable(this.address);
    }

    /**
     * ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
     * 
     */
    @Import(name="allocationId")
    private @Nullable Output<String> allocationId;

    /**
     * @return ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
     * 
     */
    public Optional<Output<String>> allocationId() {
        return Optional.ofNullable(this.allocationId);
    }

    /**
     * User-specified primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     * 
     */
    @Import(name="associateWithPrivateIp")
    private @Nullable Output<String> associateWithPrivateIp;

    /**
     * @return User-specified primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
     * 
     */
    public Optional<Output<String>> associateWithPrivateIp() {
        return Optional.ofNullable(this.associateWithPrivateIp);
    }

    /**
     * ID representing the association of the address with an instance in a VPC.
     * 
     */
    @Import(name="associationId")
    private @Nullable Output<String> associationId;

    /**
     * @return ID representing the association of the address with an instance in a VPC.
     * 
     */
    public Optional<Output<String>> associationId() {
        return Optional.ofNullable(this.associationId);
    }

    /**
     * Carrier IP address.
     * 
     */
    @Import(name="carrierIp")
    private @Nullable Output<String> carrierIp;

    /**
     * @return Carrier IP address.
     * 
     */
    public Optional<Output<String>> carrierIp() {
        return Optional.ofNullable(this.carrierIp);
    }

    /**
     * Customer owned IP.
     * 
     */
    @Import(name="customerOwnedIp")
    private @Nullable Output<String> customerOwnedIp;

    /**
     * @return Customer owned IP.
     * 
     */
    public Optional<Output<String>> customerOwnedIp() {
        return Optional.ofNullable(this.customerOwnedIp);
    }

    /**
     * ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing).
     * 
     */
    @Import(name="customerOwnedIpv4Pool")
    private @Nullable Output<String> customerOwnedIpv4Pool;

    /**
     * @return ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing).
     * 
     */
    public Optional<Output<String>> customerOwnedIpv4Pool() {
        return Optional.ofNullable(this.customerOwnedIpv4Pool);
    }

    /**
     * Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * EC2 instance ID.
     * 
     */
    @Import(name="instance")
    private @Nullable Output<String> instance;

    /**
     * @return EC2 instance ID.
     * 
     */
    public Optional<Output<String>> instance() {
        return Optional.ofNullable(this.instance);
    }

    /**
     * Location from which the IP address is advertised. Use this parameter to limit the address to this location.
     * 
     */
    @Import(name="networkBorderGroup")
    private @Nullable Output<String> networkBorderGroup;

    /**
     * @return Location from which the IP address is advertised. Use this parameter to limit the address to this location.
     * 
     */
    public Optional<Output<String>> networkBorderGroup() {
        return Optional.ofNullable(this.networkBorderGroup);
    }

    /**
     * Network interface ID to associate with.
     * 
     */
    @Import(name="networkInterface")
    private @Nullable Output<String> networkInterface;

    /**
     * @return Network interface ID to associate with.
     * 
     */
    public Optional<Output<String>> networkInterface() {
        return Optional.ofNullable(this.networkInterface);
    }

    /**
     * The Private DNS associated with the Elastic IP address (if in VPC).
     * 
     */
    @Import(name="privateDns")
    private @Nullable Output<String> privateDns;

    /**
     * @return The Private DNS associated with the Elastic IP address (if in VPC).
     * 
     */
    public Optional<Output<String>> privateDns() {
        return Optional.ofNullable(this.privateDns);
    }

    /**
     * Contains the private IP address (if in VPC).
     * 
     */
    @Import(name="privateIp")
    private @Nullable Output<String> privateIp;

    /**
     * @return Contains the private IP address (if in VPC).
     * 
     */
    public Optional<Output<String>> privateIp() {
        return Optional.ofNullable(this.privateIp);
    }

    /**
     * Public DNS associated with the Elastic IP address.
     * 
     */
    @Import(name="publicDns")
    private @Nullable Output<String> publicDns;

    /**
     * @return Public DNS associated with the Elastic IP address.
     * 
     */
    public Optional<Output<String>> publicDns() {
        return Optional.ofNullable(this.publicDns);
    }

    /**
     * Contains the public IP address.
     * 
     */
    @Import(name="publicIp")
    private @Nullable Output<String> publicIp;

    /**
     * @return Contains the public IP address.
     * 
     */
    public Optional<Output<String>> publicIp() {
        return Optional.ofNullable(this.publicIp);
    }

    /**
     * EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
     * 
     */
    @Import(name="publicIpv4Pool")
    private @Nullable Output<String> publicIpv4Pool;

    /**
     * @return EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
     * 
     */
    public Optional<Output<String>> publicIpv4Pool() {
        return Optional.ofNullable(this.publicIpv4Pool);
    }

    /**
     * Map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Boolean if the EIP is in a VPC or not.
     * 
     */
    @Import(name="vpc")
    private @Nullable Output<Boolean> vpc;

    /**
     * @return Boolean if the EIP is in a VPC or not.
     * 
     */
    public Optional<Output<Boolean>> vpc() {
        return Optional.ofNullable(this.vpc);
    }

    private EipState() {}

    private EipState(EipState $) {
        this.address = $.address;
        this.allocationId = $.allocationId;
        this.associateWithPrivateIp = $.associateWithPrivateIp;
        this.associationId = $.associationId;
        this.carrierIp = $.carrierIp;
        this.customerOwnedIp = $.customerOwnedIp;
        this.customerOwnedIpv4Pool = $.customerOwnedIpv4Pool;
        this.domain = $.domain;
        this.instance = $.instance;
        this.networkBorderGroup = $.networkBorderGroup;
        this.networkInterface = $.networkInterface;
        this.privateDns = $.privateDns;
        this.privateIp = $.privateIp;
        this.publicDns = $.publicDns;
        this.publicIp = $.publicIp;
        this.publicIpv4Pool = $.publicIpv4Pool;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpc = $.vpc;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EipState $;

        public Builder() {
            $ = new EipState();
        }

        public Builder(EipState defaults) {
            $ = new EipState(Objects.requireNonNull(defaults));
        }

        /**
         * @param address IP address from an EC2 BYOIP pool. This option is only available for VPC EIPs.
         * 
         * @return builder
         * 
         */
        public Builder address(@Nullable Output<String> address) {
            $.address = address;
            return this;
        }

        /**
         * @param address IP address from an EC2 BYOIP pool. This option is only available for VPC EIPs.
         * 
         * @return builder
         * 
         */
        public Builder address(String address) {
            return address(Output.of(address));
        }

        /**
         * @param allocationId ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(@Nullable Output<String> allocationId) {
            $.allocationId = allocationId;
            return this;
        }

        /**
         * @param allocationId ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
         * 
         * @return builder
         * 
         */
        public Builder allocationId(String allocationId) {
            return allocationId(Output.of(allocationId));
        }

        /**
         * @param associateWithPrivateIp User-specified primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
         * 
         * @return builder
         * 
         */
        public Builder associateWithPrivateIp(@Nullable Output<String> associateWithPrivateIp) {
            $.associateWithPrivateIp = associateWithPrivateIp;
            return this;
        }

        /**
         * @param associateWithPrivateIp User-specified primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
         * 
         * @return builder
         * 
         */
        public Builder associateWithPrivateIp(String associateWithPrivateIp) {
            return associateWithPrivateIp(Output.of(associateWithPrivateIp));
        }

        /**
         * @param associationId ID representing the association of the address with an instance in a VPC.
         * 
         * @return builder
         * 
         */
        public Builder associationId(@Nullable Output<String> associationId) {
            $.associationId = associationId;
            return this;
        }

        /**
         * @param associationId ID representing the association of the address with an instance in a VPC.
         * 
         * @return builder
         * 
         */
        public Builder associationId(String associationId) {
            return associationId(Output.of(associationId));
        }

        /**
         * @param carrierIp Carrier IP address.
         * 
         * @return builder
         * 
         */
        public Builder carrierIp(@Nullable Output<String> carrierIp) {
            $.carrierIp = carrierIp;
            return this;
        }

        /**
         * @param carrierIp Carrier IP address.
         * 
         * @return builder
         * 
         */
        public Builder carrierIp(String carrierIp) {
            return carrierIp(Output.of(carrierIp));
        }

        /**
         * @param customerOwnedIp Customer owned IP.
         * 
         * @return builder
         * 
         */
        public Builder customerOwnedIp(@Nullable Output<String> customerOwnedIp) {
            $.customerOwnedIp = customerOwnedIp;
            return this;
        }

        /**
         * @param customerOwnedIp Customer owned IP.
         * 
         * @return builder
         * 
         */
        public Builder customerOwnedIp(String customerOwnedIp) {
            return customerOwnedIp(Output.of(customerOwnedIp));
        }

        /**
         * @param customerOwnedIpv4Pool ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing).
         * 
         * @return builder
         * 
         */
        public Builder customerOwnedIpv4Pool(@Nullable Output<String> customerOwnedIpv4Pool) {
            $.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }

        /**
         * @param customerOwnedIpv4Pool ID  of a customer-owned address pool. For more on customer owned IP addressed check out [Customer-owned IP addresses guide](https://docs.aws.amazon.com/outposts/latest/userguide/outposts-networking-components.html#ip-addressing).
         * 
         * @return builder
         * 
         */
        public Builder customerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            return customerOwnedIpv4Pool(Output.of(customerOwnedIpv4Pool));
        }

        /**
         * @param domain Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain Indicates if this EIP is for use in VPC (`vpc`) or EC2 Classic (`standard`).
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param instance EC2 instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instance(@Nullable Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance EC2 instance ID.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param networkBorderGroup Location from which the IP address is advertised. Use this parameter to limit the address to this location.
         * 
         * @return builder
         * 
         */
        public Builder networkBorderGroup(@Nullable Output<String> networkBorderGroup) {
            $.networkBorderGroup = networkBorderGroup;
            return this;
        }

        /**
         * @param networkBorderGroup Location from which the IP address is advertised. Use this parameter to limit the address to this location.
         * 
         * @return builder
         * 
         */
        public Builder networkBorderGroup(String networkBorderGroup) {
            return networkBorderGroup(Output.of(networkBorderGroup));
        }

        /**
         * @param networkInterface Network interface ID to associate with.
         * 
         * @return builder
         * 
         */
        public Builder networkInterface(@Nullable Output<String> networkInterface) {
            $.networkInterface = networkInterface;
            return this;
        }

        /**
         * @param networkInterface Network interface ID to associate with.
         * 
         * @return builder
         * 
         */
        public Builder networkInterface(String networkInterface) {
            return networkInterface(Output.of(networkInterface));
        }

        /**
         * @param privateDns The Private DNS associated with the Elastic IP address (if in VPC).
         * 
         * @return builder
         * 
         */
        public Builder privateDns(@Nullable Output<String> privateDns) {
            $.privateDns = privateDns;
            return this;
        }

        /**
         * @param privateDns The Private DNS associated with the Elastic IP address (if in VPC).
         * 
         * @return builder
         * 
         */
        public Builder privateDns(String privateDns) {
            return privateDns(Output.of(privateDns));
        }

        /**
         * @param privateIp Contains the private IP address (if in VPC).
         * 
         * @return builder
         * 
         */
        public Builder privateIp(@Nullable Output<String> privateIp) {
            $.privateIp = privateIp;
            return this;
        }

        /**
         * @param privateIp Contains the private IP address (if in VPC).
         * 
         * @return builder
         * 
         */
        public Builder privateIp(String privateIp) {
            return privateIp(Output.of(privateIp));
        }

        /**
         * @param publicDns Public DNS associated with the Elastic IP address.
         * 
         * @return builder
         * 
         */
        public Builder publicDns(@Nullable Output<String> publicDns) {
            $.publicDns = publicDns;
            return this;
        }

        /**
         * @param publicDns Public DNS associated with the Elastic IP address.
         * 
         * @return builder
         * 
         */
        public Builder publicDns(String publicDns) {
            return publicDns(Output.of(publicDns));
        }

        /**
         * @param publicIp Contains the public IP address.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(@Nullable Output<String> publicIp) {
            $.publicIp = publicIp;
            return this;
        }

        /**
         * @param publicIp Contains the public IP address.
         * 
         * @return builder
         * 
         */
        public Builder publicIp(String publicIp) {
            return publicIp(Output.of(publicIp));
        }

        /**
         * @param publicIpv4Pool EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
         * 
         * @return builder
         * 
         */
        public Builder publicIpv4Pool(@Nullable Output<String> publicIpv4Pool) {
            $.publicIpv4Pool = publicIpv4Pool;
            return this;
        }

        /**
         * @param publicIpv4Pool EC2 IPv4 address pool identifier or `amazon`. This option is only available for VPC EIPs.
         * 
         * @return builder
         * 
         */
        public Builder publicIpv4Pool(String publicIpv4Pool) {
            return publicIpv4Pool(Output.of(publicIpv4Pool));
        }

        /**
         * @param tags Map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource. Tags can only be applied to EIPs in a VPC. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpc Boolean if the EIP is in a VPC or not.
         * 
         * @return builder
         * 
         */
        public Builder vpc(@Nullable Output<Boolean> vpc) {
            $.vpc = vpc;
            return this;
        }

        /**
         * @param vpc Boolean if the EIP is in a VPC or not.
         * 
         * @return builder
         * 
         */
        public Builder vpc(Boolean vpc) {
            return vpc(Output.of(vpc));
        }

        public EipState build() {
            return $;
        }
    }

}