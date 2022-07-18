// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.inputs;

import com.pulumi.aws.dynamodb.inputs.TableAttributeArgs;
import com.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexArgs;
import com.pulumi.aws.dynamodb.inputs.TableLocalSecondaryIndexArgs;
import com.pulumi.aws.dynamodb.inputs.TablePointInTimeRecoveryArgs;
import com.pulumi.aws.dynamodb.inputs.TableReplicaArgs;
import com.pulumi.aws.dynamodb.inputs.TableServerSideEncryptionArgs;
import com.pulumi.aws.dynamodb.inputs.TableTtlArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableState extends com.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * ARN of the table
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN of the table
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Set of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. See below.
     * 
     */
    @Import(name="attributes")
    private @Nullable Output<List<TableAttributeArgs>> attributes;

    /**
     * @return Set of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. See below.
     * 
     */
    public Optional<Output<List<TableAttributeArgs>>> attributes() {
        return Optional.ofNullable(this.attributes);
    }

    /**
     * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
     * 
     */
    @Import(name="billingMode")
    private @Nullable Output<String> billingMode;

    /**
     * @return Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
     * 
     */
    public Optional<Output<String>> billingMode() {
        return Optional.ofNullable(this.billingMode);
    }

    /**
     * Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
     * 
     */
    @Import(name="globalSecondaryIndexes")
    private @Nullable Output<List<TableGlobalSecondaryIndexArgs>> globalSecondaryIndexes;

    /**
     * @return Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
     * 
     */
    public Optional<Output<List<TableGlobalSecondaryIndexArgs>>> globalSecondaryIndexes() {
        return Optional.ofNullable(this.globalSecondaryIndexes);
    }

    /**
     * Name of the hash key in the index; must be defined as an attribute in the resource.
     * 
     */
    @Import(name="hashKey")
    private @Nullable Output<String> hashKey;

    /**
     * @return Name of the hash key in the index; must be defined as an attribute in the resource.
     * 
     */
    public Optional<Output<String>> hashKey() {
        return Optional.ofNullable(this.hashKey);
    }

    /**
     * Describe an LSI on the table; these can only be allocated *at creation* so you cannot change this definition after you have created the resource. See below.
     * 
     */
    @Import(name="localSecondaryIndexes")
    private @Nullable Output<List<TableLocalSecondaryIndexArgs>> localSecondaryIndexes;

    /**
     * @return Describe an LSI on the table; these can only be allocated *at creation* so you cannot change this definition after you have created the resource. See below.
     * 
     */
    public Optional<Output<List<TableLocalSecondaryIndexArgs>>> localSecondaryIndexes() {
        return Optional.ofNullable(this.localSecondaryIndexes);
    }

    /**
     * Name of the index
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the index
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Whether to enable Point In Time Recovery for the replica.
     * 
     */
    @Import(name="pointInTimeRecovery")
    private @Nullable Output<TablePointInTimeRecoveryArgs> pointInTimeRecovery;

    /**
     * @return Whether to enable Point In Time Recovery for the replica.
     * 
     */
    public Optional<Output<TablePointInTimeRecoveryArgs>> pointInTimeRecovery() {
        return Optional.ofNullable(this.pointInTimeRecovery);
    }

    /**
     * Name of the range key.
     * 
     */
    @Import(name="rangeKey")
    private @Nullable Output<String> rangeKey;

    /**
     * @return Name of the range key.
     * 
     */
    public Optional<Output<String>> rangeKey() {
        return Optional.ofNullable(this.rangeKey);
    }

    /**
     * Number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @Import(name="readCapacity")
    private @Nullable Output<Integer> readCapacity;

    /**
     * @return Number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    public Optional<Output<Integer>> readCapacity() {
        return Optional.ofNullable(this.readCapacity);
    }

    /**
     * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
     * 
     */
    @Import(name="replicas")
    private @Nullable Output<List<TableReplicaArgs>> replicas;

    /**
     * @return Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
     * 
     */
    public Optional<Output<List<TableReplicaArgs>>> replicas() {
        return Optional.ofNullable(this.replicas);
    }

    /**
     * Time of the point-in-time recovery point to restore.
     * 
     */
    @Import(name="restoreDateTime")
    private @Nullable Output<String> restoreDateTime;

    /**
     * @return Time of the point-in-time recovery point to restore.
     * 
     */
    public Optional<Output<String>> restoreDateTime() {
        return Optional.ofNullable(this.restoreDateTime);
    }

    /**
     * Name of the table to restore. Must match the name of an existing table.
     * 
     */
    @Import(name="restoreSourceName")
    private @Nullable Output<String> restoreSourceName;

    /**
     * @return Name of the table to restore. Must match the name of an existing table.
     * 
     */
    public Optional<Output<String>> restoreSourceName() {
        return Optional.ofNullable(this.restoreSourceName);
    }

    /**
     * If set, restores table to the most recent point-in-time recovery point.
     * 
     */
    @Import(name="restoreToLatestTime")
    private @Nullable Output<Boolean> restoreToLatestTime;

    /**
     * @return If set, restores table to the most recent point-in-time recovery point.
     * 
     */
    public Optional<Output<Boolean>> restoreToLatestTime() {
        return Optional.ofNullable(this.restoreToLatestTime);
    }

    /**
     * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn&#39;t specified. See below.
     * 
     */
    @Import(name="serverSideEncryption")
    private @Nullable Output<TableServerSideEncryptionArgs> serverSideEncryption;

    /**
     * @return Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn&#39;t specified. See below.
     * 
     */
    public Optional<Output<TableServerSideEncryptionArgs>> serverSideEncryption() {
        return Optional.ofNullable(this.serverSideEncryption);
    }

    /**
     * ARN of the Table Stream. Only available when `stream_enabled = true`
     * 
     */
    @Import(name="streamArn")
    private @Nullable Output<String> streamArn;

    /**
     * @return ARN of the Table Stream. Only available when `stream_enabled = true`
     * 
     */
    public Optional<Output<String>> streamArn() {
        return Optional.ofNullable(this.streamArn);
    }

    /**
     * Whether Streams are enabled.
     * 
     */
    @Import(name="streamEnabled")
    private @Nullable Output<Boolean> streamEnabled;

    /**
     * @return Whether Streams are enabled.
     * 
     */
    public Optional<Output<Boolean>> streamEnabled() {
        return Optional.ofNullable(this.streamEnabled);
    }

    /**
     * Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
     * 
     */
    @Import(name="streamLabel")
    private @Nullable Output<String> streamLabel;

    /**
     * @return Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
     * 
     */
    public Optional<Output<String>> streamLabel() {
        return Optional.ofNullable(this.streamLabel);
    }

    /**
     * When an item in the table is modified, StreamViewType determines what information is written to the table&#39;s stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
     * 
     */
    @Import(name="streamViewType")
    private @Nullable Output<String> streamViewType;

    /**
     * @return When an item in the table is modified, StreamViewType determines what information is written to the table&#39;s stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
     * 
     */
    public Optional<Output<String>> streamViewType() {
        return Optional.ofNullable(this.streamViewType);
    }

    /**
     * Storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
     * 
     */
    @Import(name="tableClass")
    private @Nullable Output<String> tableClass;

    /**
     * @return Storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
     * 
     */
    public Optional<Output<String>> tableClass() {
        return Optional.ofNullable(this.tableClass);
    }

    /**
     * A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * Configuration block for TTL. See below.
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<TableTtlArgs> ttl;

    /**
     * @return Configuration block for TTL. See below.
     * 
     */
    public Optional<Output<TableTtlArgs>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * Number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @Import(name="writeCapacity")
    private @Nullable Output<Integer> writeCapacity;

    /**
     * @return Number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    public Optional<Output<Integer>> writeCapacity() {
        return Optional.ofNullable(this.writeCapacity);
    }

    private TableState() {}

    private TableState(TableState $) {
        this.arn = $.arn;
        this.attributes = $.attributes;
        this.billingMode = $.billingMode;
        this.globalSecondaryIndexes = $.globalSecondaryIndexes;
        this.hashKey = $.hashKey;
        this.localSecondaryIndexes = $.localSecondaryIndexes;
        this.name = $.name;
        this.pointInTimeRecovery = $.pointInTimeRecovery;
        this.rangeKey = $.rangeKey;
        this.readCapacity = $.readCapacity;
        this.replicas = $.replicas;
        this.restoreDateTime = $.restoreDateTime;
        this.restoreSourceName = $.restoreSourceName;
        this.restoreToLatestTime = $.restoreToLatestTime;
        this.serverSideEncryption = $.serverSideEncryption;
        this.streamArn = $.streamArn;
        this.streamEnabled = $.streamEnabled;
        this.streamLabel = $.streamLabel;
        this.streamViewType = $.streamViewType;
        this.tableClass = $.tableClass;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.ttl = $.ttl;
        this.writeCapacity = $.writeCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableState $;

        public Builder() {
            $ = new TableState();
        }

        public Builder(TableState defaults) {
            $ = new TableState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN of the table
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN of the table
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param attributes Set of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. See below.
         * 
         * @return builder
         * 
         */
        public Builder attributes(@Nullable Output<List<TableAttributeArgs>> attributes) {
            $.attributes = attributes;
            return this;
        }

        /**
         * @param attributes Set of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. See below.
         * 
         * @return builder
         * 
         */
        public Builder attributes(List<TableAttributeArgs> attributes) {
            return attributes(Output.of(attributes));
        }

        /**
         * @param attributes Set of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. See below.
         * 
         * @return builder
         * 
         */
        public Builder attributes(TableAttributeArgs... attributes) {
            return attributes(List.of(attributes));
        }

        /**
         * @param billingMode Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
         * 
         * @return builder
         * 
         */
        public Builder billingMode(@Nullable Output<String> billingMode) {
            $.billingMode = billingMode;
            return this;
        }

        /**
         * @param billingMode Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
         * 
         * @return builder
         * 
         */
        public Builder billingMode(String billingMode) {
            return billingMode(Output.of(billingMode));
        }

        /**
         * @param globalSecondaryIndexes Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
         * 
         * @return builder
         * 
         */
        public Builder globalSecondaryIndexes(@Nullable Output<List<TableGlobalSecondaryIndexArgs>> globalSecondaryIndexes) {
            $.globalSecondaryIndexes = globalSecondaryIndexes;
            return this;
        }

        /**
         * @param globalSecondaryIndexes Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
         * 
         * @return builder
         * 
         */
        public Builder globalSecondaryIndexes(List<TableGlobalSecondaryIndexArgs> globalSecondaryIndexes) {
            return globalSecondaryIndexes(Output.of(globalSecondaryIndexes));
        }

        /**
         * @param globalSecondaryIndexes Describe a GSI for the table; subject to the normal limits on the number of GSIs, projected attributes, etc. See below.
         * 
         * @return builder
         * 
         */
        public Builder globalSecondaryIndexes(TableGlobalSecondaryIndexArgs... globalSecondaryIndexes) {
            return globalSecondaryIndexes(List.of(globalSecondaryIndexes));
        }

        /**
         * @param hashKey Name of the hash key in the index; must be defined as an attribute in the resource.
         * 
         * @return builder
         * 
         */
        public Builder hashKey(@Nullable Output<String> hashKey) {
            $.hashKey = hashKey;
            return this;
        }

        /**
         * @param hashKey Name of the hash key in the index; must be defined as an attribute in the resource.
         * 
         * @return builder
         * 
         */
        public Builder hashKey(String hashKey) {
            return hashKey(Output.of(hashKey));
        }

        /**
         * @param localSecondaryIndexes Describe an LSI on the table; these can only be allocated *at creation* so you cannot change this definition after you have created the resource. See below.
         * 
         * @return builder
         * 
         */
        public Builder localSecondaryIndexes(@Nullable Output<List<TableLocalSecondaryIndexArgs>> localSecondaryIndexes) {
            $.localSecondaryIndexes = localSecondaryIndexes;
            return this;
        }

        /**
         * @param localSecondaryIndexes Describe an LSI on the table; these can only be allocated *at creation* so you cannot change this definition after you have created the resource. See below.
         * 
         * @return builder
         * 
         */
        public Builder localSecondaryIndexes(List<TableLocalSecondaryIndexArgs> localSecondaryIndexes) {
            return localSecondaryIndexes(Output.of(localSecondaryIndexes));
        }

        /**
         * @param localSecondaryIndexes Describe an LSI on the table; these can only be allocated *at creation* so you cannot change this definition after you have created the resource. See below.
         * 
         * @return builder
         * 
         */
        public Builder localSecondaryIndexes(TableLocalSecondaryIndexArgs... localSecondaryIndexes) {
            return localSecondaryIndexes(List.of(localSecondaryIndexes));
        }

        /**
         * @param name Name of the index
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the index
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param pointInTimeRecovery Whether to enable Point In Time Recovery for the replica.
         * 
         * @return builder
         * 
         */
        public Builder pointInTimeRecovery(@Nullable Output<TablePointInTimeRecoveryArgs> pointInTimeRecovery) {
            $.pointInTimeRecovery = pointInTimeRecovery;
            return this;
        }

        /**
         * @param pointInTimeRecovery Whether to enable Point In Time Recovery for the replica.
         * 
         * @return builder
         * 
         */
        public Builder pointInTimeRecovery(TablePointInTimeRecoveryArgs pointInTimeRecovery) {
            return pointInTimeRecovery(Output.of(pointInTimeRecovery));
        }

        /**
         * @param rangeKey Name of the range key.
         * 
         * @return builder
         * 
         */
        public Builder rangeKey(@Nullable Output<String> rangeKey) {
            $.rangeKey = rangeKey;
            return this;
        }

        /**
         * @param rangeKey Name of the range key.
         * 
         * @return builder
         * 
         */
        public Builder rangeKey(String rangeKey) {
            return rangeKey(Output.of(rangeKey));
        }

        /**
         * @param readCapacity Number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
         * 
         * @return builder
         * 
         */
        public Builder readCapacity(@Nullable Output<Integer> readCapacity) {
            $.readCapacity = readCapacity;
            return this;
        }

        /**
         * @param readCapacity Number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
         * 
         * @return builder
         * 
         */
        public Builder readCapacity(Integer readCapacity) {
            return readCapacity(Output.of(readCapacity));
        }

        /**
         * @param replicas Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(@Nullable Output<List<TableReplicaArgs>> replicas) {
            $.replicas = replicas;
            return this;
        }

        /**
         * @param replicas Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(List<TableReplicaArgs> replicas) {
            return replicas(Output.of(replicas));
        }

        /**
         * @param replicas Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. See below.
         * 
         * @return builder
         * 
         */
        public Builder replicas(TableReplicaArgs... replicas) {
            return replicas(List.of(replicas));
        }

        /**
         * @param restoreDateTime Time of the point-in-time recovery point to restore.
         * 
         * @return builder
         * 
         */
        public Builder restoreDateTime(@Nullable Output<String> restoreDateTime) {
            $.restoreDateTime = restoreDateTime;
            return this;
        }

        /**
         * @param restoreDateTime Time of the point-in-time recovery point to restore.
         * 
         * @return builder
         * 
         */
        public Builder restoreDateTime(String restoreDateTime) {
            return restoreDateTime(Output.of(restoreDateTime));
        }

        /**
         * @param restoreSourceName Name of the table to restore. Must match the name of an existing table.
         * 
         * @return builder
         * 
         */
        public Builder restoreSourceName(@Nullable Output<String> restoreSourceName) {
            $.restoreSourceName = restoreSourceName;
            return this;
        }

        /**
         * @param restoreSourceName Name of the table to restore. Must match the name of an existing table.
         * 
         * @return builder
         * 
         */
        public Builder restoreSourceName(String restoreSourceName) {
            return restoreSourceName(Output.of(restoreSourceName));
        }

        /**
         * @param restoreToLatestTime If set, restores table to the most recent point-in-time recovery point.
         * 
         * @return builder
         * 
         */
        public Builder restoreToLatestTime(@Nullable Output<Boolean> restoreToLatestTime) {
            $.restoreToLatestTime = restoreToLatestTime;
            return this;
        }

        /**
         * @param restoreToLatestTime If set, restores table to the most recent point-in-time recovery point.
         * 
         * @return builder
         * 
         */
        public Builder restoreToLatestTime(Boolean restoreToLatestTime) {
            return restoreToLatestTime(Output.of(restoreToLatestTime));
        }

        /**
         * @param serverSideEncryption Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn&#39;t specified. See below.
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(@Nullable Output<TableServerSideEncryptionArgs> serverSideEncryption) {
            $.serverSideEncryption = serverSideEncryption;
            return this;
        }

        /**
         * @param serverSideEncryption Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS-owned Customer Master Key if this argument isn&#39;t specified. See below.
         * 
         * @return builder
         * 
         */
        public Builder serverSideEncryption(TableServerSideEncryptionArgs serverSideEncryption) {
            return serverSideEncryption(Output.of(serverSideEncryption));
        }

        /**
         * @param streamArn ARN of the Table Stream. Only available when `stream_enabled = true`
         * 
         * @return builder
         * 
         */
        public Builder streamArn(@Nullable Output<String> streamArn) {
            $.streamArn = streamArn;
            return this;
        }

        /**
         * @param streamArn ARN of the Table Stream. Only available when `stream_enabled = true`
         * 
         * @return builder
         * 
         */
        public Builder streamArn(String streamArn) {
            return streamArn(Output.of(streamArn));
        }

        /**
         * @param streamEnabled Whether Streams are enabled.
         * 
         * @return builder
         * 
         */
        public Builder streamEnabled(@Nullable Output<Boolean> streamEnabled) {
            $.streamEnabled = streamEnabled;
            return this;
        }

        /**
         * @param streamEnabled Whether Streams are enabled.
         * 
         * @return builder
         * 
         */
        public Builder streamEnabled(Boolean streamEnabled) {
            return streamEnabled(Output.of(streamEnabled));
        }

        /**
         * @param streamLabel Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
         * 
         * @return builder
         * 
         */
        public Builder streamLabel(@Nullable Output<String> streamLabel) {
            $.streamLabel = streamLabel;
            return this;
        }

        /**
         * @param streamLabel Timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not a unique identifier for the stream on its own. However, the combination of AWS customer ID, table name and this field is guaranteed to be unique. It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
         * 
         * @return builder
         * 
         */
        public Builder streamLabel(String streamLabel) {
            return streamLabel(Output.of(streamLabel));
        }

        /**
         * @param streamViewType When an item in the table is modified, StreamViewType determines what information is written to the table&#39;s stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
         * 
         * @return builder
         * 
         */
        public Builder streamViewType(@Nullable Output<String> streamViewType) {
            $.streamViewType = streamViewType;
            return this;
        }

        /**
         * @param streamViewType When an item in the table is modified, StreamViewType determines what information is written to the table&#39;s stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
         * 
         * @return builder
         * 
         */
        public Builder streamViewType(String streamViewType) {
            return streamViewType(Output.of(streamViewType));
        }

        /**
         * @param tableClass Storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
         * 
         * @return builder
         * 
         */
        public Builder tableClass(@Nullable Output<String> tableClass) {
            $.tableClass = tableClass;
            return this;
        }

        /**
         * @param tableClass Storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
         * 
         * @return builder
         * 
         */
        public Builder tableClass(String tableClass) {
            return tableClass(Output.of(tableClass));
        }

        /**
         * @param tags A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        /**
         * @param tagsAll Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
         * 
         * @return builder
         * 
         */
        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param ttl Configuration block for TTL. See below.
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<TableTtlArgs> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Configuration block for TTL. See below.
         * 
         * @return builder
         * 
         */
        public Builder ttl(TableTtlArgs ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param writeCapacity Number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
         * 
         * @return builder
         * 
         */
        public Builder writeCapacity(@Nullable Output<Integer> writeCapacity) {
            $.writeCapacity = writeCapacity;
            return this;
        }

        /**
         * @param writeCapacity Number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
         * 
         * @return builder
         * 
         */
        public Builder writeCapacity(Integer writeCapacity) {
            return writeCapacity(Output.of(writeCapacity));
        }

        public TableState build() {
            return $;
        }
    }

}