// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBrokerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBrokerPlainArgs Empty = new GetBrokerPlainArgs();

    /**
     * The unique id of the mq broker.
     * 
     */
    @Import(name="brokerId")
    private @Nullable String brokerId;

    /**
     * @return The unique id of the mq broker.
     * 
     */
    public Optional<String> brokerId() {
        return Optional.ofNullable(this.brokerId);
    }

    /**
     * The unique name of the mq broker.
     * 
     */
    @Import(name="brokerName")
    private @Nullable String brokerName;

    /**
     * @return The unique name of the mq broker.
     * 
     */
    public Optional<String> brokerName() {
        return Optional.ofNullable(this.brokerName);
    }

    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetBrokerPlainArgs() {}

    private GetBrokerPlainArgs(GetBrokerPlainArgs $) {
        this.brokerId = $.brokerId;
        this.brokerName = $.brokerName;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBrokerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBrokerPlainArgs $;

        public Builder() {
            $ = new GetBrokerPlainArgs();
        }

        public Builder(GetBrokerPlainArgs defaults) {
            $ = new GetBrokerPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param brokerId The unique id of the mq broker.
         * 
         * @return builder
         * 
         */
        public Builder brokerId(@Nullable String brokerId) {
            $.brokerId = brokerId;
            return this;
        }

        /**
         * @param brokerName The unique name of the mq broker.
         * 
         * @return builder
         * 
         */
        public Builder brokerName(@Nullable String brokerName) {
            $.brokerName = brokerName;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetBrokerPlainArgs build() {
            return $;
        }
    }

}