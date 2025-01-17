// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs;
import com.pulumi.aws.wafv2.inputs.RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementTextTransformationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs Empty = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs();

    /**
     * The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    @Import(name="fieldToMatch")
    private @Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs> fieldToMatch;

    /**
     * @return The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
     * 
     */
    public Optional<Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs>> fieldToMatch() {
        return Optional.ofNullable(this.fieldToMatch);
    }

    /**
     * The string representing the regular expression. Minimum of `1` and maximum of `512` characters.
     * 
     */
    @Import(name="regexString", required=true)
    private Output<String> regexString;

    /**
     * @return The string representing the regular expression. Minimum of `1` and maximum of `512` characters.
     * 
     */
    public Output<String> regexString() {
        return this.regexString;
    }

    /**
     * Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    @Import(name="textTransformations", required=true)
    private Output<List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementTextTransformationArgs>> textTransformations;

    /**
     * @return Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
     * At least one required.
     * See Text Transformation below for details.
     * 
     */
    public Output<List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementTextTransformationArgs>> textTransformations() {
        return this.textTransformations;
    }

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs() {}

    private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs $) {
        this.fieldToMatch = $.fieldToMatch;
        this.regexString = $.regexString;
        this.textTransformations = $.textTransformations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs $;

        public Builder() {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs();
        }

        public Builder(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs defaults) {
            $ = new RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(@Nullable Output<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs> fieldToMatch) {
            $.fieldToMatch = fieldToMatch;
            return this;
        }

        /**
         * @param fieldToMatch The part of a web request that you want AWS WAF to inspect. See Field to Match below for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldToMatch(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementFieldToMatchArgs fieldToMatch) {
            return fieldToMatch(Output.of(fieldToMatch));
        }

        /**
         * @param regexString The string representing the regular expression. Minimum of `1` and maximum of `512` characters.
         * 
         * @return builder
         * 
         */
        public Builder regexString(Output<String> regexString) {
            $.regexString = regexString;
            return this;
        }

        /**
         * @param regexString The string representing the regular expression. Minimum of `1` and maximum of `512` characters.
         * 
         * @return builder
         * 
         */
        public Builder regexString(String regexString) {
            return regexString(Output.of(regexString));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(Output<List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementTextTransformationArgs>> textTransformations) {
            $.textTransformations = textTransformations;
            return this;
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(List<RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementTextTransformationArgs> textTransformations) {
            return textTransformations(Output.of(textTransformations));
        }

        /**
         * @param textTransformations Text transformations eliminate some of the unusual formatting that attackers use in web requests in an effort to bypass detection.
         * At least one required.
         * See Text Transformation below for details.
         * 
         * @return builder
         * 
         */
        public Builder textTransformations(RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementTextTransformationArgs... textTransformations) {
            return textTransformations(List.of(textTransformations));
        }

        public RuleGroupRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementRegexMatchStatementArgs build() {
            $.regexString = Objects.requireNonNull($.regexString, "expected parameter 'regexString' to be non-null");
            $.textTransformations = Objects.requireNonNull($.textTransformations, "expected parameter 'textTransformations' to be non-null");
            return $;
        }
    }

}
