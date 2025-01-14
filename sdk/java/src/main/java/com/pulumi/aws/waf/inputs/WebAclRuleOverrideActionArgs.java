// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleOverrideActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleOverrideActionArgs Empty = new WebAclRuleOverrideActionArgs();

    /**
     * Specifies how you want AWS WAF to respond to requests that don&#39;t match the criteria in any of the `rules`.
     * e.g., `ALLOW` or `BLOCK`
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Specifies how you want AWS WAF to respond to requests that don&#39;t match the criteria in any of the `rules`.
     * e.g., `ALLOW` or `BLOCK`
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private WebAclRuleOverrideActionArgs() {}

    private WebAclRuleOverrideActionArgs(WebAclRuleOverrideActionArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleOverrideActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleOverrideActionArgs $;

        public Builder() {
            $ = new WebAclRuleOverrideActionArgs();
        }

        public Builder(WebAclRuleOverrideActionArgs defaults) {
            $ = new WebAclRuleOverrideActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type Specifies how you want AWS WAF to respond to requests that don&#39;t match the criteria in any of the `rules`.
         * e.g., `ALLOW` or `BLOCK`
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies how you want AWS WAF to respond to requests that don&#39;t match the criteria in any of the `rules`.
         * e.g., `ALLOW` or `BLOCK`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WebAclRuleOverrideActionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
