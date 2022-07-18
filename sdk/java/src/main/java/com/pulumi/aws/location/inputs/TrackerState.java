// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.location.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TrackerState extends com.pulumi.resources.ResourceArgs {

    public static final TrackerState Empty = new TrackerState();

    /**
     * The timestamp for when the tracker resource was created in ISO 8601 format.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return The timestamp for when the tracker resource was created in ISO 8601 format.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The optional description for the tracker resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The optional description for the tracker resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
     * 
     */
    @Import(name="kmsKeyId")
    private @Nullable Output<String> kmsKeyId;

    /**
     * @return A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
     * 
     */
    public Optional<Output<String>> kmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }

    /**
     * The position filtering method of the tracker resource. Valid values: `TimeBased`, `DistanceBased`, `AccuracyBased`. Default: `TimeBased`.
     * 
     */
    @Import(name="positionFiltering")
    private @Nullable Output<String> positionFiltering;

    /**
     * @return The position filtering method of the tracker resource. Valid values: `TimeBased`, `DistanceBased`, `AccuracyBased`. Default: `TimeBased`.
     * 
     */
    public Optional<Output<String>> positionFiltering() {
        return Optional.ofNullable(this.positionFiltering);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all AWS.
     * 
     */
    @Import(name="trackerArn")
    private @Nullable Output<String> trackerArn;

    /**
     * @return The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all AWS.
     * 
     */
    public Optional<Output<String>> trackerArn() {
        return Optional.ofNullable(this.trackerArn);
    }

    /**
     * The name of the tracker resource.
     * 
     */
    @Import(name="trackerName")
    private @Nullable Output<String> trackerName;

    /**
     * @return The name of the tracker resource.
     * 
     */
    public Optional<Output<String>> trackerName() {
        return Optional.ofNullable(this.trackerName);
    }

    /**
     * The timestamp for when the tracker resource was last update in ISO 8601 format.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return The timestamp for when the tracker resource was last update in ISO 8601 format.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private TrackerState() {}

    private TrackerState(TrackerState $) {
        this.createTime = $.createTime;
        this.description = $.description;
        this.kmsKeyId = $.kmsKeyId;
        this.positionFiltering = $.positionFiltering;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.trackerArn = $.trackerArn;
        this.trackerName = $.trackerName;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TrackerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TrackerState $;

        public Builder() {
            $ = new TrackerState();
        }

        public Builder(TrackerState defaults) {
            $ = new TrackerState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createTime The timestamp for when the tracker resource was created in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime The timestamp for when the tracker resource was created in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param description The optional description for the tracker resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The optional description for the tracker resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param kmsKeyId A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(@Nullable Output<String> kmsKeyId) {
            $.kmsKeyId = kmsKeyId;
            return this;
        }

        /**
         * @param kmsKeyId A key identifier for an AWS KMS customer managed key assigned to the Amazon Location resource.
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyId(String kmsKeyId) {
            return kmsKeyId(Output.of(kmsKeyId));
        }

        /**
         * @param positionFiltering The position filtering method of the tracker resource. Valid values: `TimeBased`, `DistanceBased`, `AccuracyBased`. Default: `TimeBased`.
         * 
         * @return builder
         * 
         */
        public Builder positionFiltering(@Nullable Output<String> positionFiltering) {
            $.positionFiltering = positionFiltering;
            return this;
        }

        /**
         * @param positionFiltering The position filtering method of the tracker resource. Valid values: `TimeBased`, `DistanceBased`, `AccuracyBased`. Default: `TimeBased`.
         * 
         * @return builder
         * 
         */
        public Builder positionFiltering(String positionFiltering) {
            return positionFiltering(Output.of(positionFiltering));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param trackerArn The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all AWS.
         * 
         * @return builder
         * 
         */
        public Builder trackerArn(@Nullable Output<String> trackerArn) {
            $.trackerArn = trackerArn;
            return this;
        }

        /**
         * @param trackerArn The Amazon Resource Name (ARN) for the tracker resource. Used when you need to specify a resource across all AWS.
         * 
         * @return builder
         * 
         */
        public Builder trackerArn(String trackerArn) {
            return trackerArn(Output.of(trackerArn));
        }

        /**
         * @param trackerName The name of the tracker resource.
         * 
         * @return builder
         * 
         */
        public Builder trackerName(@Nullable Output<String> trackerName) {
            $.trackerName = trackerName;
            return this;
        }

        /**
         * @param trackerName The name of the tracker resource.
         * 
         * @return builder
         * 
         */
        public Builder trackerName(String trackerName) {
            return trackerName(Output.of(trackerName));
        }

        /**
         * @param updateTime The timestamp for when the tracker resource was last update in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime The timestamp for when the tracker resource was last update in ISO 8601 format.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public TrackerState build() {
            return $;
        }
    }

}