// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ReceiptRuleStopActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleStopActionArgs Empty = new ReceiptRuleStopActionArgs();

    /**
     * The position of the action in the receipt rule
     * 
     */
    @Import(name="position", required=true)
    private Output<Integer> position;

    /**
     * @return The position of the action in the receipt rule
     * 
     */
    public Output<Integer> position() {
        return this.position;
    }

    /**
     * The scope to apply. The only acceptable value is `RuleSet`.
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope to apply. The only acceptable value is `RuleSet`.
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @Import(name="topicArn")
    private @Nullable Output<String> topicArn;

    /**
     * @return The ARN of an SNS topic to notify
     * 
     */
    public Optional<Output<String>> topicArn() {
        return Optional.ofNullable(this.topicArn);
    }

    private ReceiptRuleStopActionArgs() {}

    private ReceiptRuleStopActionArgs(ReceiptRuleStopActionArgs $) {
        this.position = $.position;
        this.scope = $.scope;
        this.topicArn = $.topicArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReceiptRuleStopActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReceiptRuleStopActionArgs $;

        public Builder() {
            $ = new ReceiptRuleStopActionArgs();
        }

        public Builder(ReceiptRuleStopActionArgs defaults) {
            $ = new ReceiptRuleStopActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param position The position of the action in the receipt rule
         * 
         * @return builder
         * 
         */
        public Builder position(Output<Integer> position) {
            $.position = position;
            return this;
        }

        /**
         * @param position The position of the action in the receipt rule
         * 
         * @return builder
         * 
         */
        public Builder position(Integer position) {
            return position(Output.of(position));
        }

        /**
         * @param scope The scope to apply. The only acceptable value is `RuleSet`.
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope to apply. The only acceptable value is `RuleSet`.
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param topicArn The ARN of an SNS topic to notify
         * 
         * @return builder
         * 
         */
        public Builder topicArn(@Nullable Output<String> topicArn) {
            $.topicArn = topicArn;
            return this;
        }

        /**
         * @param topicArn The ARN of an SNS topic to notify
         * 
         * @return builder
         * 
         */
        public Builder topicArn(String topicArn) {
            return topicArn(Output.of(topicArn));
        }

        public ReceiptRuleStopActionArgs build() {
            $.position = Objects.requireNonNull($.position, "expected parameter 'position' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}