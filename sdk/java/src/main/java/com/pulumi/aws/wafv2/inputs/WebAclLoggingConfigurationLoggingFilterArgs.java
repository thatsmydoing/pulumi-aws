// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclLoggingConfigurationLoggingFilterFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class WebAclLoggingConfigurationLoggingFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclLoggingConfigurationLoggingFilterArgs Empty = new WebAclLoggingConfigurationLoggingFilterArgs();

    /**
     * Default handling for logs that don&#39;t match any of the specified filtering conditions. Valid values: `KEEP` or `DROP`.
     * 
     */
    @Import(name="defaultBehavior", required=true)
    private Output<String> defaultBehavior;

    /**
     * @return Default handling for logs that don&#39;t match any of the specified filtering conditions. Valid values: `KEEP` or `DROP`.
     * 
     */
    public Output<String> defaultBehavior() {
        return this.defaultBehavior;
    }

    /**
     * Filter(s) that you want to apply to the logs. See Filter below for more details.
     * 
     */
    @Import(name="filters", required=true)
    private Output<List<WebAclLoggingConfigurationLoggingFilterFilterArgs>> filters;

    /**
     * @return Filter(s) that you want to apply to the logs. See Filter below for more details.
     * 
     */
    public Output<List<WebAclLoggingConfigurationLoggingFilterFilterArgs>> filters() {
        return this.filters;
    }

    private WebAclLoggingConfigurationLoggingFilterArgs() {}

    private WebAclLoggingConfigurationLoggingFilterArgs(WebAclLoggingConfigurationLoggingFilterArgs $) {
        this.defaultBehavior = $.defaultBehavior;
        this.filters = $.filters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclLoggingConfigurationLoggingFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclLoggingConfigurationLoggingFilterArgs $;

        public Builder() {
            $ = new WebAclLoggingConfigurationLoggingFilterArgs();
        }

        public Builder(WebAclLoggingConfigurationLoggingFilterArgs defaults) {
            $ = new WebAclLoggingConfigurationLoggingFilterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param defaultBehavior Default handling for logs that don&#39;t match any of the specified filtering conditions. Valid values: `KEEP` or `DROP`.
         * 
         * @return builder
         * 
         */
        public Builder defaultBehavior(Output<String> defaultBehavior) {
            $.defaultBehavior = defaultBehavior;
            return this;
        }

        /**
         * @param defaultBehavior Default handling for logs that don&#39;t match any of the specified filtering conditions. Valid values: `KEEP` or `DROP`.
         * 
         * @return builder
         * 
         */
        public Builder defaultBehavior(String defaultBehavior) {
            return defaultBehavior(Output.of(defaultBehavior));
        }

        /**
         * @param filters Filter(s) that you want to apply to the logs. See Filter below for more details.
         * 
         * @return builder
         * 
         */
        public Builder filters(Output<List<WebAclLoggingConfigurationLoggingFilterFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Filter(s) that you want to apply to the logs. See Filter below for more details.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<WebAclLoggingConfigurationLoggingFilterFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Filter(s) that you want to apply to the logs. See Filter below for more details.
         * 
         * @return builder
         * 
         */
        public Builder filters(WebAclLoggingConfigurationLoggingFilterFilterArgs... filters) {
            return filters(List.of(filters));
        }

        public WebAclLoggingConfigurationLoggingFilterArgs build() {
            $.defaultBehavior = Objects.requireNonNull($.defaultBehavior, "expected parameter 'defaultBehavior' to be non-null");
            $.filters = Objects.requireNonNull($.filters, "expected parameter 'filters' to be non-null");
            return $;
        }
    }

}