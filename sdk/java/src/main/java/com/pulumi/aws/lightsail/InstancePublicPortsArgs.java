// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail;

import com.pulumi.aws.lightsail.inputs.InstancePublicPortsPortInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class InstancePublicPortsArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstancePublicPortsArgs Empty = new InstancePublicPortsArgs();

    /**
     * Name of the Lightsail Instance.
     * 
     */
    @Import(name="instanceName", required=true)
    private Output<String> instanceName;

    /**
     * @return Name of the Lightsail Instance.
     * 
     */
    public Output<String> instanceName() {
        return this.instanceName;
    }

    /**
     * Configuration block with port information. AWS closes all currently open ports that are not included in the `port_info`. Detailed below.
     * 
     */
    @Import(name="portInfos", required=true)
    private Output<List<InstancePublicPortsPortInfoArgs>> portInfos;

    /**
     * @return Configuration block with port information. AWS closes all currently open ports that are not included in the `port_info`. Detailed below.
     * 
     */
    public Output<List<InstancePublicPortsPortInfoArgs>> portInfos() {
        return this.portInfos;
    }

    private InstancePublicPortsArgs() {}

    private InstancePublicPortsArgs(InstancePublicPortsArgs $) {
        this.instanceName = $.instanceName;
        this.portInfos = $.portInfos;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstancePublicPortsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstancePublicPortsArgs $;

        public Builder() {
            $ = new InstancePublicPortsArgs();
        }

        public Builder(InstancePublicPortsArgs defaults) {
            $ = new InstancePublicPortsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceName Name of the Lightsail Instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName Name of the Lightsail Instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param portInfos Configuration block with port information. AWS closes all currently open ports that are not included in the `port_info`. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder portInfos(Output<List<InstancePublicPortsPortInfoArgs>> portInfos) {
            $.portInfos = portInfos;
            return this;
        }

        /**
         * @param portInfos Configuration block with port information. AWS closes all currently open ports that are not included in the `port_info`. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder portInfos(List<InstancePublicPortsPortInfoArgs> portInfos) {
            return portInfos(Output.of(portInfos));
        }

        /**
         * @param portInfos Configuration block with port information. AWS closes all currently open ports that are not included in the `port_info`. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder portInfos(InstancePublicPortsPortInfoArgs... portInfos) {
            return portInfos(List.of(portInfos));
        }

        public InstancePublicPortsArgs build() {
            $.instanceName = Objects.requireNonNull($.instanceName, "expected parameter 'instanceName' to be non-null");
            $.portInfos = Objects.requireNonNull($.portInfos, "expected parameter 'portInfos' to be non-null");
            return $;
        }
    }

}