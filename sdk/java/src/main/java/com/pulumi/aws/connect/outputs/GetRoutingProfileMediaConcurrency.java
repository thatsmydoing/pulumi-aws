// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRoutingProfileMediaConcurrency {
    /**
     * @return Specifies the channels agents can handle in the Contact Control Panel (CCP) for this routing profile. Valid values are `VOICE`, `CHAT`, `TASK`.
     * 
     */
    private final String channel;
    /**
     * @return Specifies the number of contacts an agent can have on a channel simultaneously. Valid Range for `VOICE`: Minimum value of 1. Maximum value of 1. Valid Range for `CHAT`: Minimum value of 1. Maximum value of 10. Valid Range for `TASK`: Minimum value of 1. Maximum value of 10.
     * 
     */
    private final Integer concurrency;

    @CustomType.Constructor
    private GetRoutingProfileMediaConcurrency(
        @CustomType.Parameter("channel") String channel,
        @CustomType.Parameter("concurrency") Integer concurrency) {
        this.channel = channel;
        this.concurrency = concurrency;
    }

    /**
     * @return Specifies the channels agents can handle in the Contact Control Panel (CCP) for this routing profile. Valid values are `VOICE`, `CHAT`, `TASK`.
     * 
     */
    public String channel() {
        return this.channel;
    }
    /**
     * @return Specifies the number of contacts an agent can have on a channel simultaneously. Valid Range for `VOICE`: Minimum value of 1. Maximum value of 1. Valid Range for `CHAT`: Minimum value of 1. Maximum value of 10. Valid Range for `TASK`: Minimum value of 1. Maximum value of 10.
     * 
     */
    public Integer concurrency() {
        return this.concurrency;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoutingProfileMediaConcurrency defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String channel;
        private Integer concurrency;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRoutingProfileMediaConcurrency defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channel = defaults.channel;
    	      this.concurrency = defaults.concurrency;
        }

        public Builder channel(String channel) {
            this.channel = Objects.requireNonNull(channel);
            return this;
        }
        public Builder concurrency(Integer concurrency) {
            this.concurrency = Objects.requireNonNull(concurrency);
            return this;
        }        public GetRoutingProfileMediaConcurrency build() {
            return new GetRoutingProfileMediaConcurrency(channel, concurrency);
        }
    }
}