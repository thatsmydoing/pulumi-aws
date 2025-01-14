// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutput {
    /**
     * @return Describes the data format when records are written to the destination.
     * 
     */
    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema destinationSchema;
    /**
     * @return Identifies a Kinesis Data Firehose delivery stream as the destination.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput kinesisFirehoseOutput;
    /**
     * @return Identifies a Kinesis data stream as the destination.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput kinesisStreamsOutput;
    /**
     * @return Identifies a Lambda function as the destination.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput lambdaOutput;
    /**
     * @return The name of the in-application stream.
     * 
     */
    private String name;
    private @Nullable String outputId;

    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutput() {}
    /**
     * @return Describes the data format when records are written to the destination.
     * 
     */
    public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema destinationSchema() {
        return this.destinationSchema;
    }
    /**
     * @return Identifies a Kinesis Data Firehose delivery stream as the destination.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput> kinesisFirehoseOutput() {
        return Optional.ofNullable(this.kinesisFirehoseOutput);
    }
    /**
     * @return Identifies a Kinesis data stream as the destination.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput> kinesisStreamsOutput() {
        return Optional.ofNullable(this.kinesisStreamsOutput);
    }
    /**
     * @return Identifies a Lambda function as the destination.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput> lambdaOutput() {
        return Optional.ofNullable(this.lambdaOutput);
    }
    /**
     * @return The name of the in-application stream.
     * 
     */
    public String name() {
        return this.name;
    }
    public Optional<String> outputId() {
        return Optional.ofNullable(this.outputId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutput defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema destinationSchema;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput kinesisFirehoseOutput;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput kinesisStreamsOutput;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput lambdaOutput;
        private String name;
        private @Nullable String outputId;
        public Builder() {}
        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationSchema = defaults.destinationSchema;
    	      this.kinesisFirehoseOutput = defaults.kinesisFirehoseOutput;
    	      this.kinesisStreamsOutput = defaults.kinesisStreamsOutput;
    	      this.lambdaOutput = defaults.lambdaOutput;
    	      this.name = defaults.name;
    	      this.outputId = defaults.outputId;
        }

        @CustomType.Setter
        public Builder destinationSchema(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema destinationSchema) {
            this.destinationSchema = Objects.requireNonNull(destinationSchema);
            return this;
        }
        @CustomType.Setter
        public Builder kinesisFirehoseOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput kinesisFirehoseOutput) {
            this.kinesisFirehoseOutput = kinesisFirehoseOutput;
            return this;
        }
        @CustomType.Setter
        public Builder kinesisStreamsOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput kinesisStreamsOutput) {
            this.kinesisStreamsOutput = kinesisStreamsOutput;
            return this;
        }
        @CustomType.Setter
        public Builder lambdaOutput(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput lambdaOutput) {
            this.lambdaOutput = lambdaOutput;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder outputId(@Nullable String outputId) {
            this.outputId = outputId;
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutput build() {
            final var o = new ApplicationApplicationConfigurationSqlApplicationConfigurationOutput();
            o.destinationSchema = destinationSchema;
            o.kinesisFirehoseOutput = kinesisFirehoseOutput;
            o.kinesisStreamsOutput = kinesisStreamsOutput;
            o.lambdaOutput = lambdaOutput;
            o.name = name;
            o.outputId = outputId;
            return o;
        }
    }
}
