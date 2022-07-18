// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SnapshotImportClientDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final SnapshotImportClientDataArgs Empty = new SnapshotImportClientDataArgs();

    /**
     * A user-defined comment about the disk upload.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return A user-defined comment about the disk upload.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * The time that the disk upload ends.
     * 
     */
    @Import(name="uploadEnd")
    private @Nullable Output<String> uploadEnd;

    /**
     * @return The time that the disk upload ends.
     * 
     */
    public Optional<Output<String>> uploadEnd() {
        return Optional.ofNullable(this.uploadEnd);
    }

    /**
     * The size of the uploaded disk image, in GiB.
     * 
     */
    @Import(name="uploadSize")
    private @Nullable Output<Double> uploadSize;

    /**
     * @return The size of the uploaded disk image, in GiB.
     * 
     */
    public Optional<Output<Double>> uploadSize() {
        return Optional.ofNullable(this.uploadSize);
    }

    /**
     * The time that the disk upload starts.
     * 
     */
    @Import(name="uploadStart")
    private @Nullable Output<String> uploadStart;

    /**
     * @return The time that the disk upload starts.
     * 
     */
    public Optional<Output<String>> uploadStart() {
        return Optional.ofNullable(this.uploadStart);
    }

    private SnapshotImportClientDataArgs() {}

    private SnapshotImportClientDataArgs(SnapshotImportClientDataArgs $) {
        this.comment = $.comment;
        this.uploadEnd = $.uploadEnd;
        this.uploadSize = $.uploadSize;
        this.uploadStart = $.uploadStart;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SnapshotImportClientDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SnapshotImportClientDataArgs $;

        public Builder() {
            $ = new SnapshotImportClientDataArgs();
        }

        public Builder(SnapshotImportClientDataArgs defaults) {
            $ = new SnapshotImportClientDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comment A user-defined comment about the disk upload.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment A user-defined comment about the disk upload.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param uploadEnd The time that the disk upload ends.
         * 
         * @return builder
         * 
         */
        public Builder uploadEnd(@Nullable Output<String> uploadEnd) {
            $.uploadEnd = uploadEnd;
            return this;
        }

        /**
         * @param uploadEnd The time that the disk upload ends.
         * 
         * @return builder
         * 
         */
        public Builder uploadEnd(String uploadEnd) {
            return uploadEnd(Output.of(uploadEnd));
        }

        /**
         * @param uploadSize The size of the uploaded disk image, in GiB.
         * 
         * @return builder
         * 
         */
        public Builder uploadSize(@Nullable Output<Double> uploadSize) {
            $.uploadSize = uploadSize;
            return this;
        }

        /**
         * @param uploadSize The size of the uploaded disk image, in GiB.
         * 
         * @return builder
         * 
         */
        public Builder uploadSize(Double uploadSize) {
            return uploadSize(Output.of(uploadSize));
        }

        /**
         * @param uploadStart The time that the disk upload starts.
         * 
         * @return builder
         * 
         */
        public Builder uploadStart(@Nullable Output<String> uploadStart) {
            $.uploadStart = uploadStart;
            return this;
        }

        /**
         * @param uploadStart The time that the disk upload starts.
         * 
         * @return builder
         * 
         */
        public Builder uploadStart(String uploadStart) {
            return uploadStart(Output.of(uploadStart));
        }

        public SnapshotImportClientDataArgs build() {
            return $;
        }
    }

}