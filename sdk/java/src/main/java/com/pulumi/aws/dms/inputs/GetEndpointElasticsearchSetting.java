// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetEndpointElasticsearchSetting extends com.pulumi.resources.InvokeArgs {

    public static final GetEndpointElasticsearchSetting Empty = new GetEndpointElasticsearchSetting();

    @Import(name="endpointUri", required=true)
    private String endpointUri;

    public String endpointUri() {
        return this.endpointUri;
    }

    @Import(name="errorRetryDuration", required=true)
    private Integer errorRetryDuration;

    public Integer errorRetryDuration() {
        return this.errorRetryDuration;
    }

    @Import(name="fullLoadErrorPercentage", required=true)
    private Integer fullLoadErrorPercentage;

    public Integer fullLoadErrorPercentage() {
        return this.fullLoadErrorPercentage;
    }

    @Import(name="serviceAccessRoleArn", required=true)
    private String serviceAccessRoleArn;

    public String serviceAccessRoleArn() {
        return this.serviceAccessRoleArn;
    }

    private GetEndpointElasticsearchSetting() {}

    private GetEndpointElasticsearchSetting(GetEndpointElasticsearchSetting $) {
        this.endpointUri = $.endpointUri;
        this.errorRetryDuration = $.errorRetryDuration;
        this.fullLoadErrorPercentage = $.fullLoadErrorPercentage;
        this.serviceAccessRoleArn = $.serviceAccessRoleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEndpointElasticsearchSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEndpointElasticsearchSetting $;

        public Builder() {
            $ = new GetEndpointElasticsearchSetting();
        }

        public Builder(GetEndpointElasticsearchSetting defaults) {
            $ = new GetEndpointElasticsearchSetting(Objects.requireNonNull(defaults));
        }

        public Builder endpointUri(String endpointUri) {
            $.endpointUri = endpointUri;
            return this;
        }

        public Builder errorRetryDuration(Integer errorRetryDuration) {
            $.errorRetryDuration = errorRetryDuration;
            return this;
        }

        public Builder fullLoadErrorPercentage(Integer fullLoadErrorPercentage) {
            $.fullLoadErrorPercentage = fullLoadErrorPercentage;
            return this;
        }

        public Builder serviceAccessRoleArn(String serviceAccessRoleArn) {
            $.serviceAccessRoleArn = serviceAccessRoleArn;
            return this;
        }

        public GetEndpointElasticsearchSetting build() {
            $.endpointUri = Objects.requireNonNull($.endpointUri, "expected parameter 'endpointUri' to be non-null");
            $.errorRetryDuration = Objects.requireNonNull($.errorRetryDuration, "expected parameter 'errorRetryDuration' to be non-null");
            $.fullLoadErrorPercentage = Objects.requireNonNull($.fullLoadErrorPercentage, "expected parameter 'fullLoadErrorPercentage' to be non-null");
            $.serviceAccessRoleArn = Objects.requireNonNull($.serviceAccessRoleArn, "expected parameter 'serviceAccessRoleArn' to be non-null");
            return $;
        }
    }

}
