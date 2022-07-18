// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesis.outputs;

import com.pulumi.aws.kinesis.outputs.GetStreamStreamModeDetail;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetStreamResult {
    /**
     * @return The Amazon Resource Name (ARN) of the Kinesis Stream (same as id).
     * 
     */
    private final String arn;
    /**
     * @return The list of shard ids in the CLOSED state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
     * 
     */
    private final List<String> closedShards;
    /**
     * @return The approximate UNIX timestamp that the stream was created.
     * 
     */
    private final Integer creationTimestamp;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return The name of the Kinesis Stream.
     * 
     */
    private final String name;
    /**
     * @return The list of shard ids in the OPEN state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
     * 
     */
    private final List<String> openShards;
    /**
     * @return Length of time (in hours) data records are accessible after they are added to the stream.
     * 
     */
    private final Integer retentionPeriod;
    /**
     * @return A list of shard-level CloudWatch metrics which are enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more.
     * 
     */
    private final List<String> shardLevelMetrics;
    /**
     * @return The current status of the stream. The stream status is one of CREATING, DELETING, ACTIVE, or UPDATING.
     * 
     */
    private final String status;
    /**
     * @return Indicates the [capacity mode](https://docs.aws.amazon.com/streams/latest/dev/how-do-i-size-a-stream.html) of the data stream. Detailed below.
     * 
     */
    private final List<GetStreamStreamModeDetail> streamModeDetails;
    /**
     * @return A map of tags to assigned to the stream.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetStreamResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("closedShards") List<String> closedShards,
        @CustomType.Parameter("creationTimestamp") Integer creationTimestamp,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("openShards") List<String> openShards,
        @CustomType.Parameter("retentionPeriod") Integer retentionPeriod,
        @CustomType.Parameter("shardLevelMetrics") List<String> shardLevelMetrics,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("streamModeDetails") List<GetStreamStreamModeDetail> streamModeDetails,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.closedShards = closedShards;
        this.creationTimestamp = creationTimestamp;
        this.id = id;
        this.name = name;
        this.openShards = openShards;
        this.retentionPeriod = retentionPeriod;
        this.shardLevelMetrics = shardLevelMetrics;
        this.status = status;
        this.streamModeDetails = streamModeDetails;
        this.tags = tags;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the Kinesis Stream (same as id).
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The list of shard ids in the CLOSED state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
     * 
     */
    public List<String> closedShards() {
        return this.closedShards;
    }
    /**
     * @return The approximate UNIX timestamp that the stream was created.
     * 
     */
    public Integer creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the Kinesis Stream.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The list of shard ids in the OPEN state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
     * 
     */
    public List<String> openShards() {
        return this.openShards;
    }
    /**
     * @return Length of time (in hours) data records are accessible after they are added to the stream.
     * 
     */
    public Integer retentionPeriod() {
        return this.retentionPeriod;
    }
    /**
     * @return A list of shard-level CloudWatch metrics which are enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more.
     * 
     */
    public List<String> shardLevelMetrics() {
        return this.shardLevelMetrics;
    }
    /**
     * @return The current status of the stream. The stream status is one of CREATING, DELETING, ACTIVE, or UPDATING.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Indicates the [capacity mode](https://docs.aws.amazon.com/streams/latest/dev/how-do-i-size-a-stream.html) of the data stream. Detailed below.
     * 
     */
    public List<GetStreamStreamModeDetail> streamModeDetails() {
        return this.streamModeDetails;
    }
    /**
     * @return A map of tags to assigned to the stream.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<String> closedShards;
        private Integer creationTimestamp;
        private String id;
        private String name;
        private List<String> openShards;
        private Integer retentionPeriod;
        private List<String> shardLevelMetrics;
        private String status;
        private List<GetStreamStreamModeDetail> streamModeDetails;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.closedShards = defaults.closedShards;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.openShards = defaults.openShards;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.shardLevelMetrics = defaults.shardLevelMetrics;
    	      this.status = defaults.status;
    	      this.streamModeDetails = defaults.streamModeDetails;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder closedShards(List<String> closedShards) {
            this.closedShards = Objects.requireNonNull(closedShards);
            return this;
        }
        public Builder closedShards(String... closedShards) {
            return closedShards(List.of(closedShards));
        }
        public Builder creationTimestamp(Integer creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder openShards(List<String> openShards) {
            this.openShards = Objects.requireNonNull(openShards);
            return this;
        }
        public Builder openShards(String... openShards) {
            return openShards(List.of(openShards));
        }
        public Builder retentionPeriod(Integer retentionPeriod) {
            this.retentionPeriod = Objects.requireNonNull(retentionPeriod);
            return this;
        }
        public Builder shardLevelMetrics(List<String> shardLevelMetrics) {
            this.shardLevelMetrics = Objects.requireNonNull(shardLevelMetrics);
            return this;
        }
        public Builder shardLevelMetrics(String... shardLevelMetrics) {
            return shardLevelMetrics(List.of(shardLevelMetrics));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder streamModeDetails(List<GetStreamStreamModeDetail> streamModeDetails) {
            this.streamModeDetails = Objects.requireNonNull(streamModeDetails);
            return this;
        }
        public Builder streamModeDetails(GetStreamStreamModeDetail... streamModeDetails) {
            return streamModeDetails(List.of(streamModeDetails));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetStreamResult build() {
            return new GetStreamResult(arn, closedShards, creationTimestamp, id, name, openShards, retentionPeriod, shardLevelMetrics, status, streamModeDetails, tags);
        }
    }
}