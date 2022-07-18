// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ebs.outputs;

import com.pulumi.aws.ebs.outputs.GetVolumeFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVolumeResult {
    /**
     * @return The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
     * 
     */
    private final String arn;
    /**
     * @return The AZ where the EBS volume exists.
     * 
     */
    private final String availabilityZone;
    /**
     * @return Whether the disk is encrypted.
     * 
     */
    private final Boolean encrypted;
    private final @Nullable List<GetVolumeFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The amount of IOPS for the disk.
     * 
     */
    private final Integer iops;
    /**
     * @return The ARN for the KMS encryption key.
     * 
     */
    private final String kmsKeyId;
    private final @Nullable Boolean mostRecent;
    /**
     * @return (Optional) Specifies whether Amazon EBS Multi-Attach is enabled.
     * 
     */
    private final Boolean multiAttachEnabled;
    /**
     * @return The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    private final String outpostArn;
    /**
     * @return The size of the drive in GiBs.
     * 
     */
    private final Integer size;
    /**
     * @return The snapshot_id the EBS volume is based off.
     * 
     */
    private final String snapshotId;
    /**
     * @return A map of tags for the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The throughput that the volume supports, in MiB/s.
     * 
     */
    private final Integer throughput;
    /**
     * @return The volume ID (e.g., vol-59fcb34e).
     * 
     */
    private final String volumeId;
    /**
     * @return The type of EBS volume.
     * 
     */
    private final String volumeType;

    @CustomType.Constructor
    private GetVolumeResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("availabilityZone") String availabilityZone,
        @CustomType.Parameter("encrypted") Boolean encrypted,
        @CustomType.Parameter("filters") @Nullable List<GetVolumeFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("iops") Integer iops,
        @CustomType.Parameter("kmsKeyId") String kmsKeyId,
        @CustomType.Parameter("mostRecent") @Nullable Boolean mostRecent,
        @CustomType.Parameter("multiAttachEnabled") Boolean multiAttachEnabled,
        @CustomType.Parameter("outpostArn") String outpostArn,
        @CustomType.Parameter("size") Integer size,
        @CustomType.Parameter("snapshotId") String snapshotId,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("throughput") Integer throughput,
        @CustomType.Parameter("volumeId") String volumeId,
        @CustomType.Parameter("volumeType") String volumeType) {
        this.arn = arn;
        this.availabilityZone = availabilityZone;
        this.encrypted = encrypted;
        this.filters = filters;
        this.id = id;
        this.iops = iops;
        this.kmsKeyId = kmsKeyId;
        this.mostRecent = mostRecent;
        this.multiAttachEnabled = multiAttachEnabled;
        this.outpostArn = outpostArn;
        this.size = size;
        this.snapshotId = snapshotId;
        this.tags = tags;
        this.throughput = throughput;
        this.volumeId = volumeId;
        this.volumeType = volumeType;
    }

    /**
     * @return The volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The AZ where the EBS volume exists.
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * @return Whether the disk is encrypted.
     * 
     */
    public Boolean encrypted() {
        return this.encrypted;
    }
    public List<GetVolumeFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The amount of IOPS for the disk.
     * 
     */
    public Integer iops() {
        return this.iops;
    }
    /**
     * @return The ARN for the KMS encryption key.
     * 
     */
    public String kmsKeyId() {
        return this.kmsKeyId;
    }
    public Optional<Boolean> mostRecent() {
        return Optional.ofNullable(this.mostRecent);
    }
    /**
     * @return (Optional) Specifies whether Amazon EBS Multi-Attach is enabled.
     * 
     */
    public Boolean multiAttachEnabled() {
        return this.multiAttachEnabled;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the Outpost.
     * 
     */
    public String outpostArn() {
        return this.outpostArn;
    }
    /**
     * @return The size of the drive in GiBs.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The snapshot_id the EBS volume is based off.
     * 
     */
    public String snapshotId() {
        return this.snapshotId;
    }
    /**
     * @return A map of tags for the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The throughput that the volume supports, in MiB/s.
     * 
     */
    public Integer throughput() {
        return this.throughput;
    }
    /**
     * @return The volume ID (e.g., vol-59fcb34e).
     * 
     */
    public String volumeId() {
        return this.volumeId;
    }
    /**
     * @return The type of EBS volume.
     * 
     */
    public String volumeType() {
        return this.volumeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String availabilityZone;
        private Boolean encrypted;
        private @Nullable List<GetVolumeFilter> filters;
        private String id;
        private Integer iops;
        private String kmsKeyId;
        private @Nullable Boolean mostRecent;
        private Boolean multiAttachEnabled;
        private String outpostArn;
        private Integer size;
        private String snapshotId;
        private Map<String,String> tags;
        private Integer throughput;
        private String volumeId;
        private String volumeType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.encrypted = defaults.encrypted;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.iops = defaults.iops;
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.mostRecent = defaults.mostRecent;
    	      this.multiAttachEnabled = defaults.multiAttachEnabled;
    	      this.outpostArn = defaults.outpostArn;
    	      this.size = defaults.size;
    	      this.snapshotId = defaults.snapshotId;
    	      this.tags = defaults.tags;
    	      this.throughput = defaults.throughput;
    	      this.volumeId = defaults.volumeId;
    	      this.volumeType = defaults.volumeType;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = Objects.requireNonNull(encrypted);
            return this;
        }
        public Builder filters(@Nullable List<GetVolumeFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetVolumeFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder iops(Integer iops) {
            this.iops = Objects.requireNonNull(iops);
            return this;
        }
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = Objects.requireNonNull(kmsKeyId);
            return this;
        }
        public Builder mostRecent(@Nullable Boolean mostRecent) {
            this.mostRecent = mostRecent;
            return this;
        }
        public Builder multiAttachEnabled(Boolean multiAttachEnabled) {
            this.multiAttachEnabled = Objects.requireNonNull(multiAttachEnabled);
            return this;
        }
        public Builder outpostArn(String outpostArn) {
            this.outpostArn = Objects.requireNonNull(outpostArn);
            return this;
        }
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public Builder snapshotId(String snapshotId) {
            this.snapshotId = Objects.requireNonNull(snapshotId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder throughput(Integer throughput) {
            this.throughput = Objects.requireNonNull(throughput);
            return this;
        }
        public Builder volumeId(String volumeId) {
            this.volumeId = Objects.requireNonNull(volumeId);
            return this;
        }
        public Builder volumeType(String volumeType) {
            this.volumeType = Objects.requireNonNull(volumeType);
            return this;
        }        public GetVolumeResult build() {
            return new GetVolumeResult(arn, availabilityZone, encrypted, filters, id, iops, kmsKeyId, mostRecent, multiAttachEnabled, outpostArn, size, snapshotId, tags, throughput, volumeId, volumeType);
        }
    }
}