// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccountArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountArgs Empty = new AccountArgs();

    /**
     * Specifies how often to publish updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). Valid values are `FIFTEEN_MINUTES`, `ONE_HOUR` or `SIX_HOURS`.
     * 
     */
    @Import(name="findingPublishingFrequency")
    private @Nullable Output<String> findingPublishingFrequency;

    /**
     * @return Specifies how often to publish updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). Valid values are `FIFTEEN_MINUTES`, `ONE_HOUR` or `SIX_HOURS`.
     * 
     */
    public Optional<Output<String>> findingPublishingFrequency() {
        return Optional.ofNullable(this.findingPublishingFrequency);
    }

    /**
     * Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private AccountArgs() {}

    private AccountArgs(AccountArgs $) {
        this.findingPublishingFrequency = $.findingPublishingFrequency;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountArgs $;

        public Builder() {
            $ = new AccountArgs();
        }

        public Builder(AccountArgs defaults) {
            $ = new AccountArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param findingPublishingFrequency Specifies how often to publish updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). Valid values are `FIFTEEN_MINUTES`, `ONE_HOUR` or `SIX_HOURS`.
         * 
         * @return builder
         * 
         */
        public Builder findingPublishingFrequency(@Nullable Output<String> findingPublishingFrequency) {
            $.findingPublishingFrequency = findingPublishingFrequency;
            return this;
        }

        /**
         * @param findingPublishingFrequency Specifies how often to publish updates to policy findings for the account. This includes publishing updates to AWS Security Hub and Amazon EventBridge (formerly called Amazon CloudWatch Events). Valid values are `FIFTEEN_MINUTES`, `ONE_HOUR` or `SIX_HOURS`.
         * 
         * @return builder
         * 
         */
        public Builder findingPublishingFrequency(String findingPublishingFrequency) {
            return findingPublishingFrequency(Output.of(findingPublishingFrequency));
        }

        /**
         * @param status Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public AccountArgs build() {
            return $;
        }
    }

}