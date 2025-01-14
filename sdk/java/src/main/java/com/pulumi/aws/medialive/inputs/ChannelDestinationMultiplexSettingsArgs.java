// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ChannelDestinationMultiplexSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelDestinationMultiplexSettingsArgs Empty = new ChannelDestinationMultiplexSettingsArgs();

    /**
     * The ID of the Multiplex that the encoder is providing output to.
     * 
     */
    @Import(name="multiplexId", required=true)
    private Output<String> multiplexId;

    /**
     * @return The ID of the Multiplex that the encoder is providing output to.
     * 
     */
    public Output<String> multiplexId() {
        return this.multiplexId;
    }

    /**
     * The program name of the Multiplex program that the encoder is providing output to.
     * 
     */
    @Import(name="programName", required=true)
    private Output<String> programName;

    /**
     * @return The program name of the Multiplex program that the encoder is providing output to.
     * 
     */
    public Output<String> programName() {
        return this.programName;
    }

    private ChannelDestinationMultiplexSettingsArgs() {}

    private ChannelDestinationMultiplexSettingsArgs(ChannelDestinationMultiplexSettingsArgs $) {
        this.multiplexId = $.multiplexId;
        this.programName = $.programName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelDestinationMultiplexSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelDestinationMultiplexSettingsArgs $;

        public Builder() {
            $ = new ChannelDestinationMultiplexSettingsArgs();
        }

        public Builder(ChannelDestinationMultiplexSettingsArgs defaults) {
            $ = new ChannelDestinationMultiplexSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param multiplexId The ID of the Multiplex that the encoder is providing output to.
         * 
         * @return builder
         * 
         */
        public Builder multiplexId(Output<String> multiplexId) {
            $.multiplexId = multiplexId;
            return this;
        }

        /**
         * @param multiplexId The ID of the Multiplex that the encoder is providing output to.
         * 
         * @return builder
         * 
         */
        public Builder multiplexId(String multiplexId) {
            return multiplexId(Output.of(multiplexId));
        }

        /**
         * @param programName The program name of the Multiplex program that the encoder is providing output to.
         * 
         * @return builder
         * 
         */
        public Builder programName(Output<String> programName) {
            $.programName = programName;
            return this;
        }

        /**
         * @param programName The program name of the Multiplex program that the encoder is providing output to.
         * 
         * @return builder
         * 
         */
        public Builder programName(String programName) {
            return programName(Output.of(programName));
        }

        public ChannelDestinationMultiplexSettingsArgs build() {
            $.multiplexId = Objects.requireNonNull($.multiplexId, "expected parameter 'multiplexId' to be non-null");
            $.programName = Objects.requireNonNull($.programName, "expected parameter 'programName' to be non-null");
            return $;
        }
    }

}
