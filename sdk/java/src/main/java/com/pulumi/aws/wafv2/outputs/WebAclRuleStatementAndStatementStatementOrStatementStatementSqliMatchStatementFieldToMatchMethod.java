// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod {
    @CustomType.Constructor
    private WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod() {
    }


    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod defaults) {
    	      Objects.requireNonNull(defaults);
        }
        public WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementFieldToMatchMethod();
        }
    }
}