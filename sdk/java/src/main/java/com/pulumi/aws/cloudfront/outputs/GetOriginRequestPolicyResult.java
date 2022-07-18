// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyCookiesConfig;
import com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyHeadersConfig;
import com.pulumi.aws.cloudfront.outputs.GetOriginRequestPolicyQueryStringsConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOriginRequestPolicyResult {
    /**
     * @return Comment to describe the origin request policy.
     * 
     */
    private final String comment;
    /**
     * @return Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    private final List<GetOriginRequestPolicyCookiesConfig> cookiesConfigs;
    /**
     * @return The current version of the origin request policy.
     * 
     */
    private final String etag;
    /**
     * @return Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    private final List<GetOriginRequestPolicyHeadersConfig> headersConfigs;
    private final @Nullable String id;
    private final @Nullable String name;
    /**
     * @return Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    private final List<GetOriginRequestPolicyQueryStringsConfig> queryStringsConfigs;

    @CustomType.Constructor
    private GetOriginRequestPolicyResult(
        @CustomType.Parameter("comment") String comment,
        @CustomType.Parameter("cookiesConfigs") List<GetOriginRequestPolicyCookiesConfig> cookiesConfigs,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("headersConfigs") List<GetOriginRequestPolicyHeadersConfig> headersConfigs,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("queryStringsConfigs") List<GetOriginRequestPolicyQueryStringsConfig> queryStringsConfigs) {
        this.comment = comment;
        this.cookiesConfigs = cookiesConfigs;
        this.etag = etag;
        this.headersConfigs = headersConfigs;
        this.id = id;
        this.name = name;
        this.queryStringsConfigs = queryStringsConfigs;
    }

    /**
     * @return Comment to describe the origin request policy.
     * 
     */
    public String comment() {
        return this.comment;
    }
    /**
     * @return Object that determines whether any cookies in viewer requests (and if so, which cookies) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Cookies Config for more information.
     * 
     */
    public List<GetOriginRequestPolicyCookiesConfig> cookiesConfigs() {
        return this.cookiesConfigs;
    }
    /**
     * @return The current version of the origin request policy.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return Object that determines whether any HTTP headers (and if so, which headers) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Headers Config for more information.
     * 
     */
    public List<GetOriginRequestPolicyHeadersConfig> headersConfigs() {
        return this.headersConfigs;
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Object that determines whether any URL query strings in viewer requests (and if so, which query strings) are included in the origin request key and automatically included in requests that CloudFront sends to the origin. See Query String Config for more information.
     * 
     */
    public List<GetOriginRequestPolicyQueryStringsConfig> queryStringsConfigs() {
        return this.queryStringsConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOriginRequestPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;
        private List<GetOriginRequestPolicyCookiesConfig> cookiesConfigs;
        private String etag;
        private List<GetOriginRequestPolicyHeadersConfig> headersConfigs;
        private @Nullable String id;
        private @Nullable String name;
        private List<GetOriginRequestPolicyQueryStringsConfig> queryStringsConfigs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOriginRequestPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.cookiesConfigs = defaults.cookiesConfigs;
    	      this.etag = defaults.etag;
    	      this.headersConfigs = defaults.headersConfigs;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.queryStringsConfigs = defaults.queryStringsConfigs;
        }

        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        public Builder cookiesConfigs(List<GetOriginRequestPolicyCookiesConfig> cookiesConfigs) {
            this.cookiesConfigs = Objects.requireNonNull(cookiesConfigs);
            return this;
        }
        public Builder cookiesConfigs(GetOriginRequestPolicyCookiesConfig... cookiesConfigs) {
            return cookiesConfigs(List.of(cookiesConfigs));
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder headersConfigs(List<GetOriginRequestPolicyHeadersConfig> headersConfigs) {
            this.headersConfigs = Objects.requireNonNull(headersConfigs);
            return this;
        }
        public Builder headersConfigs(GetOriginRequestPolicyHeadersConfig... headersConfigs) {
            return headersConfigs(List.of(headersConfigs));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder queryStringsConfigs(List<GetOriginRequestPolicyQueryStringsConfig> queryStringsConfigs) {
            this.queryStringsConfigs = Objects.requireNonNull(queryStringsConfigs);
            return this;
        }
        public Builder queryStringsConfigs(GetOriginRequestPolicyQueryStringsConfig... queryStringsConfigs) {
            return queryStringsConfigs(List.of(queryStringsConfigs));
        }        public GetOriginRequestPolicyResult build() {
            return new GetOriginRequestPolicyResult(comment, cookiesConfigs, etag, headersConfigs, id, name, queryStringsConfigs);
        }
    }
}