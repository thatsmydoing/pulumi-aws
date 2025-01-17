// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.globalaccelerator;

import com.pulumi.aws.globalaccelerator.inputs.ListenerPortRangeArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ListenerArgs Empty = new ListenerArgs();

    /**
     * The Amazon Resource Name (ARN) of your accelerator.
     * 
     */
    @Import(name="acceleratorArn", required=true)
    private Output<String> acceleratorArn;

    /**
     * @return The Amazon Resource Name (ARN) of your accelerator.
     * 
     */
    public Output<String> acceleratorArn() {
        return this.acceleratorArn;
    }

    /**
     * Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the &#34;five-tuple&#34; properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the &#34;two-tuple&#34; properties of source (client) IP address and destination IP address to select the hash value.
     * 
     */
    @Import(name="clientAffinity")
    private @Nullable Output<String> clientAffinity;

    /**
     * @return Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the &#34;five-tuple&#34; properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the &#34;two-tuple&#34; properties of source (client) IP address and destination IP address to select the hash value.
     * 
     */
    public Optional<Output<String>> clientAffinity() {
        return Optional.ofNullable(this.clientAffinity);
    }

    /**
     * The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * 
     * **port_range** supports the following attributes:
     * 
     */
    @Import(name="portRanges", required=true)
    private Output<List<ListenerPortRangeArgs>> portRanges;

    /**
     * @return The list of port ranges for the connections from clients to the accelerator. Fields documented below.
     * 
     * **port_range** supports the following attributes:
     * 
     */
    public Output<List<ListenerPortRangeArgs>> portRanges() {
        return this.portRanges;
    }

    /**
     * The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     * 
     */
    @Import(name="protocol", required=true)
    private Output<String> protocol;

    /**
     * @return The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }

    private ListenerArgs() {}

    private ListenerArgs(ListenerArgs $) {
        this.acceleratorArn = $.acceleratorArn;
        this.clientAffinity = $.clientAffinity;
        this.portRanges = $.portRanges;
        this.protocol = $.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListenerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListenerArgs $;

        public Builder() {
            $ = new ListenerArgs();
        }

        public Builder(ListenerArgs defaults) {
            $ = new ListenerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param acceleratorArn The Amazon Resource Name (ARN) of your accelerator.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorArn(Output<String> acceleratorArn) {
            $.acceleratorArn = acceleratorArn;
            return this;
        }

        /**
         * @param acceleratorArn The Amazon Resource Name (ARN) of your accelerator.
         * 
         * @return builder
         * 
         */
        public Builder acceleratorArn(String acceleratorArn) {
            return acceleratorArn(Output.of(acceleratorArn));
        }

        /**
         * @param clientAffinity Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the &#34;five-tuple&#34; properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the &#34;two-tuple&#34; properties of source (client) IP address and destination IP address to select the hash value.
         * 
         * @return builder
         * 
         */
        public Builder clientAffinity(@Nullable Output<String> clientAffinity) {
            $.clientAffinity = clientAffinity;
            return this;
        }

        /**
         * @param clientAffinity Direct all requests from a user to the same endpoint. Valid values are `NONE`, `SOURCE_IP`. Default: `NONE`. If `NONE`, Global Accelerator uses the &#34;five-tuple&#34; properties of source IP address, source port, destination IP address, destination port, and protocol to select the hash value. If `SOURCE_IP`, Global Accelerator uses the &#34;two-tuple&#34; properties of source (client) IP address and destination IP address to select the hash value.
         * 
         * @return builder
         * 
         */
        public Builder clientAffinity(String clientAffinity) {
            return clientAffinity(Output.of(clientAffinity));
        }

        /**
         * @param portRanges The list of port ranges for the connections from clients to the accelerator. Fields documented below.
         * 
         * **port_range** supports the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder portRanges(Output<List<ListenerPortRangeArgs>> portRanges) {
            $.portRanges = portRanges;
            return this;
        }

        /**
         * @param portRanges The list of port ranges for the connections from clients to the accelerator. Fields documented below.
         * 
         * **port_range** supports the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder portRanges(List<ListenerPortRangeArgs> portRanges) {
            return portRanges(Output.of(portRanges));
        }

        /**
         * @param portRanges The list of port ranges for the connections from clients to the accelerator. Fields documented below.
         * 
         * **port_range** supports the following attributes:
         * 
         * @return builder
         * 
         */
        public Builder portRanges(ListenerPortRangeArgs... portRanges) {
            return portRanges(List.of(portRanges));
        }

        /**
         * @param protocol The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(Output<String> protocol) {
            $.protocol = protocol;
            return this;
        }

        /**
         * @param protocol The protocol for the connections from clients to the accelerator. Valid values are `TCP`, `UDP`.
         * 
         * @return builder
         * 
         */
        public Builder protocol(String protocol) {
            return protocol(Output.of(protocol));
        }

        public ListenerArgs build() {
            $.acceleratorArn = Objects.requireNonNull($.acceleratorArn, "expected parameter 'acceleratorArn' to be non-null");
            $.portRanges = Objects.requireNonNull($.portRanges, "expected parameter 'portRanges' to be non-null");
            $.protocol = Objects.requireNonNull($.protocol, "expected parameter 'protocol' to be non-null");
            return $;
        }
    }

}
