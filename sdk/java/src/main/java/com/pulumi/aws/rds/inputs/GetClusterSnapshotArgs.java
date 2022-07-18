// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClusterSnapshotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetClusterSnapshotArgs Empty = new GetClusterSnapshotArgs();

    /**
     * Returns the list of snapshots created by the specific db_cluster
     * 
     */
    @Import(name="dbClusterIdentifier")
    private @Nullable Output<String> dbClusterIdentifier;

    /**
     * @return Returns the list of snapshots created by the specific db_cluster
     * 
     */
    public Optional<Output<String>> dbClusterIdentifier() {
        return Optional.ofNullable(this.dbClusterIdentifier);
    }

    /**
     * Returns information on a specific snapshot_id.
     * 
     */
    @Import(name="dbClusterSnapshotIdentifier")
    private @Nullable Output<String> dbClusterSnapshotIdentifier;

    /**
     * @return Returns information on a specific snapshot_id.
     * 
     */
    public Optional<Output<String>> dbClusterSnapshotIdentifier() {
        return Optional.ofNullable(this.dbClusterSnapshotIdentifier);
    }

    /**
     * Set this value to true to include manual DB Cluster Snapshots that are public and can be
     * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
     * 
     */
    @Import(name="includePublic")
    private @Nullable Output<Boolean> includePublic;

    /**
     * @return Set this value to true to include manual DB Cluster Snapshots that are public and can be
     * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
     * 
     */
    public Optional<Output<Boolean>> includePublic() {
        return Optional.ofNullable(this.includePublic);
    }

    /**
     * Set this value to true to include shared manual DB Cluster Snapshots from other
     * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
     * The default is `false`.
     * 
     */
    @Import(name="includeShared")
    private @Nullable Output<Boolean> includeShared;

    /**
     * @return Set this value to true to include shared manual DB Cluster Snapshots from other
     * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
     * The default is `false`.
     * 
     */
    public Optional<Output<Boolean>> includeShared() {
        return Optional.ofNullable(this.includeShared);
    }

    /**
     * If more than one result is returned, use the most recent Snapshot.
     * 
     */
    @Import(name="mostRecent")
    private @Nullable Output<Boolean> mostRecent;

    /**
     * @return If more than one result is returned, use the most recent Snapshot.
     * 
     */
    public Optional<Output<Boolean>> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }

    /**
     * The type of snapshots to be returned. If you don&#39;t specify a SnapshotType
     * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
     * included in the returned results by default. Possible values are, `automated`, `manual`, `shared`, `public` and `awsbackup`.
     * 
     */
    @Import(name="snapshotType")
    private @Nullable Output<String> snapshotType;

    /**
     * @return The type of snapshots to be returned. If you don&#39;t specify a SnapshotType
     * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
     * included in the returned results by default. Possible values are, `automated`, `manual`, `shared`, `public` and `awsbackup`.
     * 
     */
    public Optional<Output<String>> snapshotType() {
        return Optional.ofNullable(this.snapshotType);
    }

    /**
     * A map of tags for the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A map of tags for the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetClusterSnapshotArgs() {}

    private GetClusterSnapshotArgs(GetClusterSnapshotArgs $) {
        this.dbClusterIdentifier = $.dbClusterIdentifier;
        this.dbClusterSnapshotIdentifier = $.dbClusterSnapshotIdentifier;
        this.includePublic = $.includePublic;
        this.includeShared = $.includeShared;
        this.mostRecent = $.mostRecent;
        this.snapshotType = $.snapshotType;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetClusterSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterSnapshotArgs $;

        public Builder() {
            $ = new GetClusterSnapshotArgs();
        }

        public Builder(GetClusterSnapshotArgs defaults) {
            $ = new GetClusterSnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dbClusterIdentifier Returns the list of snapshots created by the specific db_cluster
         * 
         * @return builder
         * 
         */
        public Builder dbClusterIdentifier(@Nullable Output<String> dbClusterIdentifier) {
            $.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        /**
         * @param dbClusterIdentifier Returns the list of snapshots created by the specific db_cluster
         * 
         * @return builder
         * 
         */
        public Builder dbClusterIdentifier(String dbClusterIdentifier) {
            return dbClusterIdentifier(Output.of(dbClusterIdentifier));
        }

        /**
         * @param dbClusterSnapshotIdentifier Returns information on a specific snapshot_id.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterSnapshotIdentifier(@Nullable Output<String> dbClusterSnapshotIdentifier) {
            $.dbClusterSnapshotIdentifier = dbClusterSnapshotIdentifier;
            return this;
        }

        /**
         * @param dbClusterSnapshotIdentifier Returns information on a specific snapshot_id.
         * 
         * @return builder
         * 
         */
        public Builder dbClusterSnapshotIdentifier(String dbClusterSnapshotIdentifier) {
            return dbClusterSnapshotIdentifier(Output.of(dbClusterSnapshotIdentifier));
        }

        /**
         * @param includePublic Set this value to true to include manual DB Cluster Snapshots that are public and can be
         * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder includePublic(@Nullable Output<Boolean> includePublic) {
            $.includePublic = includePublic;
            return this;
        }

        /**
         * @param includePublic Set this value to true to include manual DB Cluster Snapshots that are public and can be
         * copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder includePublic(Boolean includePublic) {
            return includePublic(Output.of(includePublic));
        }

        /**
         * @param includeShared Set this value to true to include shared manual DB Cluster Snapshots from other
         * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
         * The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeShared(@Nullable Output<Boolean> includeShared) {
            $.includeShared = includeShared;
            return this;
        }

        /**
         * @param includeShared Set this value to true to include shared manual DB Cluster Snapshots from other
         * AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
         * The default is `false`.
         * 
         * @return builder
         * 
         */
        public Builder includeShared(Boolean includeShared) {
            return includeShared(Output.of(includeShared));
        }

        /**
         * @param mostRecent If more than one result is returned, use the most recent Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(@Nullable Output<Boolean> mostRecent) {
            $.mostRecent = mostRecent;
            return this;
        }

        /**
         * @param mostRecent If more than one result is returned, use the most recent Snapshot.
         * 
         * @return builder
         * 
         */
        public Builder mostRecent(Boolean mostRecent) {
            return mostRecent(Output.of(mostRecent));
        }

        /**
         * @param snapshotType The type of snapshots to be returned. If you don&#39;t specify a SnapshotType
         * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
         * included in the returned results by default. Possible values are, `automated`, `manual`, `shared`, `public` and `awsbackup`.
         * 
         * @return builder
         * 
         */
        public Builder snapshotType(@Nullable Output<String> snapshotType) {
            $.snapshotType = snapshotType;
            return this;
        }

        /**
         * @param snapshotType The type of snapshots to be returned. If you don&#39;t specify a SnapshotType
         * value, then both automated and manual DB cluster snapshots are returned. Shared and public DB Cluster Snapshots are not
         * included in the returned results by default. Possible values are, `automated`, `manual`, `shared`, `public` and `awsbackup`.
         * 
         * @return builder
         * 
         */
        public Builder snapshotType(String snapshotType) {
            return snapshotType(Output.of(snapshotType));
        }

        /**
         * @param tags A map of tags for the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A map of tags for the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetClusterSnapshotArgs build() {
            return $;
        }
    }

}