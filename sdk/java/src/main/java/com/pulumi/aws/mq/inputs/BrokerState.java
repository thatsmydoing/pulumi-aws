// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mq.inputs;

import com.pulumi.aws.mq.inputs.BrokerConfigurationArgs;
import com.pulumi.aws.mq.inputs.BrokerEncryptionOptionsArgs;
import com.pulumi.aws.mq.inputs.BrokerInstanceArgs;
import com.pulumi.aws.mq.inputs.BrokerLdapServerMetadataArgs;
import com.pulumi.aws.mq.inputs.BrokerLogsArgs;
import com.pulumi.aws.mq.inputs.BrokerMaintenanceWindowStartTimeArgs;
import com.pulumi.aws.mq.inputs.BrokerUserArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BrokerState extends com.pulumi.resources.ResourceArgs {

    public static final BrokerState Empty = new BrokerState();

    /**
     * Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    @Import(name="applyImmediately")
    private @Nullable Output<Boolean> applyImmediately;

    /**
     * @return Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
     * 
     */
    public Optional<Output<Boolean>> applyImmediately() {
        return Optional.ofNullable(this.applyImmediately);
    }

    /**
     * ARN of the broker.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the broker.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
     * 
     */
    @Import(name="authenticationStrategy")
    private @Nullable Output<String> authenticationStrategy;

    /**
     * @return Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
     * 
     */
    public Optional<Output<String>> authenticationStrategy() {
        return Optional.ofNullable(this.authenticationStrategy);
    }

    /**
     * Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
     * 
     */
    @Import(name="autoMinorVersionUpgrade")
    private @Nullable Output<Boolean> autoMinorVersionUpgrade;

    /**
     * @return Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
     * 
     */
    public Optional<Output<Boolean>> autoMinorVersionUpgrade() {
        return Optional.ofNullable(this.autoMinorVersionUpgrade);
    }

    /**
     * Name of the broker.
     * 
     */
    @Import(name="brokerName")
    private @Nullable Output<String> brokerName;

    /**
     * @return Name of the broker.
     * 
     */
    public Optional<Output<String>> brokerName() {
        return Optional.ofNullable(this.brokerName);
    }

    /**
     * Configuration block for broker configuration. Applies to `engine_type` of `ActiveMQ` only. Detailed below.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<BrokerConfigurationArgs> configuration;

    /**
     * @return Configuration block for broker configuration. Applies to `engine_type` of `ActiveMQ` only. Detailed below.
     * 
     */
    public Optional<Output<BrokerConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
     * 
     */
    @Import(name="deploymentMode")
    private @Nullable Output<String> deploymentMode;

    /**
     * @return Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
     * 
     */
    public Optional<Output<String>> deploymentMode() {
        return Optional.ofNullable(this.deploymentMode);
    }

    /**
     * Configuration block containing encryption options. Detailed below.
     * 
     */
    @Import(name="encryptionOptions")
    private @Nullable Output<BrokerEncryptionOptionsArgs> encryptionOptions;

    /**
     * @return Configuration block containing encryption options. Detailed below.
     * 
     */
    public Optional<Output<BrokerEncryptionOptionsArgs>> encryptionOptions() {
        return Optional.ofNullable(this.encryptionOptions);
    }

    /**
     * Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
     * 
     */
    @Import(name="engineType")
    private @Nullable Output<String> engineType;

    /**
     * @return Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
     * 
     */
    public Optional<Output<String>> engineType() {
        return Optional.ofNullable(this.engineType);
    }

    /**
     * Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.15.0`.
     * 
     */
    @Import(name="engineVersion")
    private @Nullable Output<String> engineVersion;

    /**
     * @return Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.15.0`.
     * 
     */
    public Optional<Output<String>> engineVersion() {
        return Optional.ofNullable(this.engineVersion);
    }

    /**
     * Broker&#39;s instance type. For example, `mq.t3.micro`, `mq.m5.large`.
     * 
     */
    @Import(name="hostInstanceType")
    private @Nullable Output<String> hostInstanceType;

    /**
     * @return Broker&#39;s instance type. For example, `mq.t3.micro`, `mq.m5.large`.
     * 
     */
    public Optional<Output<String>> hostInstanceType() {
        return Optional.ofNullable(this.hostInstanceType);
    }

    /**
     * List of information about allocated brokers (both active &amp; standby).
     * * `instances.0.console_url` - The URL of the broker&#39;s [ActiveMQ Web Console](http://activemq.apache.org/web-console.html).
     * * `instances.0.ip_address` - IP Address of the broker.
     * * `instances.0.endpoints` - Broker&#39;s wire-level protocol endpoints in the following order &amp; format referenceable e.g., as `instances.0.endpoints.0` (SSL):
     * * For `ActiveMQ`:
     * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
     * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
     * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
     * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
     * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
     * * For `RabbitMQ`:
     * * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
     * 
     */
    @Import(name="instances")
    private @Nullable Output<List<BrokerInstanceArgs>> instances;

    /**
     * @return List of information about allocated brokers (both active &amp; standby).
     * * `instances.0.console_url` - The URL of the broker&#39;s [ActiveMQ Web Console](http://activemq.apache.org/web-console.html).
     * * `instances.0.ip_address` - IP Address of the broker.
     * * `instances.0.endpoints` - Broker&#39;s wire-level protocol endpoints in the following order &amp; format referenceable e.g., as `instances.0.endpoints.0` (SSL):
     * * For `ActiveMQ`:
     * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
     * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
     * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
     * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
     * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
     * * For `RabbitMQ`:
     * * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
     * 
     */
    public Optional<Output<List<BrokerInstanceArgs>>> instances() {
        return Optional.ofNullable(this.instances);
    }

    /**
     * Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engine_type` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
     * 
     */
    @Import(name="ldapServerMetadata")
    private @Nullable Output<BrokerLdapServerMetadataArgs> ldapServerMetadata;

    /**
     * @return Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engine_type` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
     * 
     */
    public Optional<Output<BrokerLdapServerMetadataArgs>> ldapServerMetadata() {
        return Optional.ofNullable(this.ldapServerMetadata);
    }

    /**
     * Configuration block for the logging configuration of the broker. Detailed below.
     * 
     */
    @Import(name="logs")
    private @Nullable Output<BrokerLogsArgs> logs;

    /**
     * @return Configuration block for the logging configuration of the broker. Detailed below.
     * 
     */
    public Optional<Output<BrokerLogsArgs>> logs() {
        return Optional.ofNullable(this.logs);
    }

    /**
     * Configuration block for the maintenance window start time. Detailed below.
     * 
     */
    @Import(name="maintenanceWindowStartTime")
    private @Nullable Output<BrokerMaintenanceWindowStartTimeArgs> maintenanceWindowStartTime;

    /**
     * @return Configuration block for the maintenance window start time. Detailed below.
     * 
     */
    public Optional<Output<BrokerMaintenanceWindowStartTimeArgs>> maintenanceWindowStartTime() {
        return Optional.ofNullable(this.maintenanceWindowStartTime);
    }

    /**
     * Whether to enable connections from applications outside of the VPC that hosts the broker&#39;s subnets.
     * 
     */
    @Import(name="publiclyAccessible")
    private @Nullable Output<Boolean> publiclyAccessible;

    /**
     * @return Whether to enable connections from applications outside of the VPC that hosts the broker&#39;s subnets.
     * 
     */
    public Optional<Output<Boolean>> publiclyAccessible() {
        return Optional.ofNullable(this.publiclyAccessible);
    }

    /**
     * List of security group IDs assigned to the broker.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return List of security group IDs assigned to the broker.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * Storage type of the broker. For `engine_type` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engine_type` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
     * 
     */
    @Import(name="storageType")
    private @Nullable Output<String> storageType;

    /**
     * @return Storage type of the broker. For `engine_type` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engine_type` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
     * 
     */
    public Optional<Output<String>> storageType() {
        return Optional.ofNullable(this.storageType);
    }

    /**
     * List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
     * 
     */
    @Import(name="subnetIds")
    private @Nullable Output<List<String>> subnetIds;

    /**
     * @return List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
     * 
     */
    public Optional<Output<List<String>>> subnetIds() {
        return Optional.ofNullable(this.subnetIds);
    }

    /**
     * Map of tags to assign to the broker. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the broker. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Configuration block for broker users. For `engine_type` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
     * 
     */
    @Import(name="users")
    private @Nullable Output<List<BrokerUserArgs>> users;

    /**
     * @return Configuration block for broker users. For `engine_type` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
     * 
     */
    public Optional<Output<List<BrokerUserArgs>>> users() {
        return Optional.ofNullable(this.users);
    }

    private BrokerState() {}

    private BrokerState(BrokerState $) {
        this.applyImmediately = $.applyImmediately;
        this.arn = $.arn;
        this.authenticationStrategy = $.authenticationStrategy;
        this.autoMinorVersionUpgrade = $.autoMinorVersionUpgrade;
        this.brokerName = $.brokerName;
        this.configuration = $.configuration;
        this.deploymentMode = $.deploymentMode;
        this.encryptionOptions = $.encryptionOptions;
        this.engineType = $.engineType;
        this.engineVersion = $.engineVersion;
        this.hostInstanceType = $.hostInstanceType;
        this.instances = $.instances;
        this.ldapServerMetadata = $.ldapServerMetadata;
        this.logs = $.logs;
        this.maintenanceWindowStartTime = $.maintenanceWindowStartTime;
        this.publiclyAccessible = $.publiclyAccessible;
        this.securityGroups = $.securityGroups;
        this.storageType = $.storageType;
        this.subnetIds = $.subnetIds;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.users = $.users;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BrokerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BrokerState $;

        public Builder() {
            $ = new BrokerState();
        }

        public Builder(BrokerState defaults) {
            $ = new BrokerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param applyImmediately Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(@Nullable Output<Boolean> applyImmediately) {
            $.applyImmediately = applyImmediately;
            return this;
        }

        /**
         * @param applyImmediately Specifies whether any broker modifications are applied immediately, or during the next maintenance window. Default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder applyImmediately(Boolean applyImmediately) {
            return applyImmediately(Output.of(applyImmediately));
        }

        /**
         * @param arn ARN of the broker.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the broker.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param authenticationStrategy Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationStrategy(@Nullable Output<String> authenticationStrategy) {
            $.authenticationStrategy = authenticationStrategy;
            return this;
        }

        /**
         * @param authenticationStrategy Authentication strategy used to secure the broker. Valid values are `simple` and `ldap`. `ldap` is not supported for `engine_type` `RabbitMQ`.
         * 
         * @return builder
         * 
         */
        public Builder authenticationStrategy(String authenticationStrategy) {
            return authenticationStrategy(Output.of(authenticationStrategy));
        }

        /**
         * @param autoMinorVersionUpgrade Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
         * 
         * @return builder
         * 
         */
        public Builder autoMinorVersionUpgrade(@Nullable Output<Boolean> autoMinorVersionUpgrade) {
            $.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
            return this;
        }

        /**
         * @param autoMinorVersionUpgrade Whether to automatically upgrade to new minor versions of brokers as Amazon MQ makes releases available.
         * 
         * @return builder
         * 
         */
        public Builder autoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
            return autoMinorVersionUpgrade(Output.of(autoMinorVersionUpgrade));
        }

        /**
         * @param brokerName Name of the broker.
         * 
         * @return builder
         * 
         */
        public Builder brokerName(@Nullable Output<String> brokerName) {
            $.brokerName = brokerName;
            return this;
        }

        /**
         * @param brokerName Name of the broker.
         * 
         * @return builder
         * 
         */
        public Builder brokerName(String brokerName) {
            return brokerName(Output.of(brokerName));
        }

        /**
         * @param configuration Configuration block for broker configuration. Applies to `engine_type` of `ActiveMQ` only. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<BrokerConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Configuration block for broker configuration. Applies to `engine_type` of `ActiveMQ` only. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(BrokerConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param deploymentMode Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
         * 
         * @return builder
         * 
         */
        public Builder deploymentMode(@Nullable Output<String> deploymentMode) {
            $.deploymentMode = deploymentMode;
            return this;
        }

        /**
         * @param deploymentMode Deployment mode of the broker. Valid values are `SINGLE_INSTANCE`, `ACTIVE_STANDBY_MULTI_AZ`, and `CLUSTER_MULTI_AZ`. Default is `SINGLE_INSTANCE`.
         * 
         * @return builder
         * 
         */
        public Builder deploymentMode(String deploymentMode) {
            return deploymentMode(Output.of(deploymentMode));
        }

        /**
         * @param encryptionOptions Configuration block containing encryption options. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionOptions(@Nullable Output<BrokerEncryptionOptionsArgs> encryptionOptions) {
            $.encryptionOptions = encryptionOptions;
            return this;
        }

        /**
         * @param encryptionOptions Configuration block containing encryption options. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder encryptionOptions(BrokerEncryptionOptionsArgs encryptionOptions) {
            return encryptionOptions(Output.of(encryptionOptions));
        }

        /**
         * @param engineType Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
         * 
         * @return builder
         * 
         */
        public Builder engineType(@Nullable Output<String> engineType) {
            $.engineType = engineType;
            return this;
        }

        /**
         * @param engineType Type of broker engine. Valid values are `ActiveMQ` and `RabbitMQ`.
         * 
         * @return builder
         * 
         */
        public Builder engineType(String engineType) {
            return engineType(Output.of(engineType));
        }

        /**
         * @param engineVersion Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.15.0`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(@Nullable Output<String> engineVersion) {
            $.engineVersion = engineVersion;
            return this;
        }

        /**
         * @param engineVersion Version of the broker engine. See the [AmazonMQ Broker Engine docs](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html) for supported versions. For example, `5.15.0`.
         * 
         * @return builder
         * 
         */
        public Builder engineVersion(String engineVersion) {
            return engineVersion(Output.of(engineVersion));
        }

        /**
         * @param hostInstanceType Broker&#39;s instance type. For example, `mq.t3.micro`, `mq.m5.large`.
         * 
         * @return builder
         * 
         */
        public Builder hostInstanceType(@Nullable Output<String> hostInstanceType) {
            $.hostInstanceType = hostInstanceType;
            return this;
        }

        /**
         * @param hostInstanceType Broker&#39;s instance type. For example, `mq.t3.micro`, `mq.m5.large`.
         * 
         * @return builder
         * 
         */
        public Builder hostInstanceType(String hostInstanceType) {
            return hostInstanceType(Output.of(hostInstanceType));
        }

        /**
         * @param instances List of information about allocated brokers (both active &amp; standby).
         * * `instances.0.console_url` - The URL of the broker&#39;s [ActiveMQ Web Console](http://activemq.apache.org/web-console.html).
         * * `instances.0.ip_address` - IP Address of the broker.
         * * `instances.0.endpoints` - Broker&#39;s wire-level protocol endpoints in the following order &amp; format referenceable e.g., as `instances.0.endpoints.0` (SSL):
         * * For `ActiveMQ`:
         * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
         * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
         * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
         * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
         * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
         * * For `RabbitMQ`:
         * * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
         * 
         * @return builder
         * 
         */
        public Builder instances(@Nullable Output<List<BrokerInstanceArgs>> instances) {
            $.instances = instances;
            return this;
        }

        /**
         * @param instances List of information about allocated brokers (both active &amp; standby).
         * * `instances.0.console_url` - The URL of the broker&#39;s [ActiveMQ Web Console](http://activemq.apache.org/web-console.html).
         * * `instances.0.ip_address` - IP Address of the broker.
         * * `instances.0.endpoints` - Broker&#39;s wire-level protocol endpoints in the following order &amp; format referenceable e.g., as `instances.0.endpoints.0` (SSL):
         * * For `ActiveMQ`:
         * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
         * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
         * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
         * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
         * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
         * * For `RabbitMQ`:
         * * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
         * 
         * @return builder
         * 
         */
        public Builder instances(List<BrokerInstanceArgs> instances) {
            return instances(Output.of(instances));
        }

        /**
         * @param instances List of information about allocated brokers (both active &amp; standby).
         * * `instances.0.console_url` - The URL of the broker&#39;s [ActiveMQ Web Console](http://activemq.apache.org/web-console.html).
         * * `instances.0.ip_address` - IP Address of the broker.
         * * `instances.0.endpoints` - Broker&#39;s wire-level protocol endpoints in the following order &amp; format referenceable e.g., as `instances.0.endpoints.0` (SSL):
         * * For `ActiveMQ`:
         * * `ssl://broker-id.mq.us-west-2.amazonaws.com:61617`
         * * `amqp+ssl://broker-id.mq.us-west-2.amazonaws.com:5671`
         * * `stomp+ssl://broker-id.mq.us-west-2.amazonaws.com:61614`
         * * `mqtt+ssl://broker-id.mq.us-west-2.amazonaws.com:8883`
         * * `wss://broker-id.mq.us-west-2.amazonaws.com:61619`
         * * For `RabbitMQ`:
         * * `amqps://broker-id.mq.us-west-2.amazonaws.com:5671`
         * 
         * @return builder
         * 
         */
        public Builder instances(BrokerInstanceArgs... instances) {
            return instances(List.of(instances));
        }

        /**
         * @param ldapServerMetadata Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engine_type` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
         * 
         * @return builder
         * 
         */
        public Builder ldapServerMetadata(@Nullable Output<BrokerLdapServerMetadataArgs> ldapServerMetadata) {
            $.ldapServerMetadata = ldapServerMetadata;
            return this;
        }

        /**
         * @param ldapServerMetadata Configuration block for the LDAP server used to authenticate and authorize connections to the broker. Not supported for `engine_type` `RabbitMQ`. Detailed below. (Currently, AWS may not process changes to LDAP server metadata.)
         * 
         * @return builder
         * 
         */
        public Builder ldapServerMetadata(BrokerLdapServerMetadataArgs ldapServerMetadata) {
            return ldapServerMetadata(Output.of(ldapServerMetadata));
        }

        /**
         * @param logs Configuration block for the logging configuration of the broker. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder logs(@Nullable Output<BrokerLogsArgs> logs) {
            $.logs = logs;
            return this;
        }

        /**
         * @param logs Configuration block for the logging configuration of the broker. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder logs(BrokerLogsArgs logs) {
            return logs(Output.of(logs));
        }

        /**
         * @param maintenanceWindowStartTime Configuration block for the maintenance window start time. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowStartTime(@Nullable Output<BrokerMaintenanceWindowStartTimeArgs> maintenanceWindowStartTime) {
            $.maintenanceWindowStartTime = maintenanceWindowStartTime;
            return this;
        }

        /**
         * @param maintenanceWindowStartTime Configuration block for the maintenance window start time. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceWindowStartTime(BrokerMaintenanceWindowStartTimeArgs maintenanceWindowStartTime) {
            return maintenanceWindowStartTime(Output.of(maintenanceWindowStartTime));
        }

        /**
         * @param publiclyAccessible Whether to enable connections from applications outside of the VPC that hosts the broker&#39;s subnets.
         * 
         * @return builder
         * 
         */
        public Builder publiclyAccessible(@Nullable Output<Boolean> publiclyAccessible) {
            $.publiclyAccessible = publiclyAccessible;
            return this;
        }

        /**
         * @param publiclyAccessible Whether to enable connections from applications outside of the VPC that hosts the broker&#39;s subnets.
         * 
         * @return builder
         * 
         */
        public Builder publiclyAccessible(Boolean publiclyAccessible) {
            return publiclyAccessible(Output.of(publiclyAccessible));
        }

        /**
         * @param securityGroups List of security group IDs assigned to the broker.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups List of security group IDs assigned to the broker.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups List of security group IDs assigned to the broker.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param storageType Storage type of the broker. For `engine_type` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engine_type` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
         * 
         * @return builder
         * 
         */
        public Builder storageType(@Nullable Output<String> storageType) {
            $.storageType = storageType;
            return this;
        }

        /**
         * @param storageType Storage type of the broker. For `engine_type` `ActiveMQ`, the valid values are `efs` and `ebs`, and the AWS-default is `efs`. For `engine_type` `RabbitMQ`, only `ebs` is supported. When using `ebs`, only the `mq.m5` broker instance type family is supported.
         * 
         * @return builder
         * 
         */
        public Builder storageType(String storageType) {
            return storageType(Output.of(storageType));
        }

        /**
         * @param subnetIds List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            $.subnetIds = subnetIds;
            return this;
        }

        /**
         * @param subnetIds List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(List<String> subnetIds) {
            return subnetIds(Output.of(subnetIds));
        }

        /**
         * @param subnetIds List of subnet IDs in which to launch the broker. A `SINGLE_INSTANCE` deployment requires one subnet. An `ACTIVE_STANDBY_MULTI_AZ` deployment requires multiple subnets.
         * 
         * @return builder
         * 
         */
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }

        /**
         * @param tags Map of tags to assign to the broker. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the broker. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll A map of tags assigned to the resource, including those inherited from the provider .
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param users Configuration block for broker users. For `engine_type` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder users(@Nullable Output<List<BrokerUserArgs>> users) {
            $.users = users;
            return this;
        }

        /**
         * @param users Configuration block for broker users. For `engine_type` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder users(List<BrokerUserArgs> users) {
            return users(Output.of(users));
        }

        /**
         * @param users Configuration block for broker users. For `engine_type` of `RabbitMQ`, Amazon MQ does not return broker users preventing this resource from making user updates and drift detection. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder users(BrokerUserArgs... users) {
            return users(List.of(users));
        }

        public BrokerState build() {
            return $;
        }
    }

}