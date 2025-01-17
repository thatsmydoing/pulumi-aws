// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kinesisanalyticsv2.outputs;

import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration;
import com.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationApplicationConfigurationFlinkApplicationConfiguration {
    /**
     * @return Describes an application&#39;s checkpointing configuration.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration checkpointConfiguration;
    /**
     * @return Describes configuration parameters for CloudWatch logging for an application.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration monitoringConfiguration;
    /**
     * @return Describes parameters for how an application executes multiple tasks simultaneously.
     * 
     */
    private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration parallelismConfiguration;

    private ApplicationApplicationConfigurationFlinkApplicationConfiguration() {}
    /**
     * @return Describes an application&#39;s checkpointing configuration.
     * 
     */
    public Optional<ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration> checkpointConfiguration() {
        return Optional.ofNullable(this.checkpointConfiguration);
    }
    /**
     * @return Describes configuration parameters for CloudWatch logging for an application.
     * 
     */
    public Optional<ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration> monitoringConfiguration() {
        return Optional.ofNullable(this.monitoringConfiguration);
    }
    /**
     * @return Describes parameters for how an application executes multiple tasks simultaneously.
     * 
     */
    public Optional<ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration> parallelismConfiguration() {
        return Optional.ofNullable(this.parallelismConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationFlinkApplicationConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration checkpointConfiguration;
        private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration monitoringConfiguration;
        private @Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration parallelismConfiguration;
        public Builder() {}
        public Builder(ApplicationApplicationConfigurationFlinkApplicationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkpointConfiguration = defaults.checkpointConfiguration;
    	      this.monitoringConfiguration = defaults.monitoringConfiguration;
    	      this.parallelismConfiguration = defaults.parallelismConfiguration;
        }

        @CustomType.Setter
        public Builder checkpointConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationCheckpointConfiguration checkpointConfiguration) {
            this.checkpointConfiguration = checkpointConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder monitoringConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationMonitoringConfiguration monitoringConfiguration) {
            this.monitoringConfiguration = monitoringConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder parallelismConfiguration(@Nullable ApplicationApplicationConfigurationFlinkApplicationConfigurationParallelismConfiguration parallelismConfiguration) {
            this.parallelismConfiguration = parallelismConfiguration;
            return this;
        }
        public ApplicationApplicationConfigurationFlinkApplicationConfiguration build() {
            final var o = new ApplicationApplicationConfigurationFlinkApplicationConfiguration();
            o.checkpointConfiguration = checkpointConfiguration;
            o.monitoringConfiguration = monitoringConfiguration;
            o.parallelismConfiguration = parallelismConfiguration;
            return o;
        }
    }
}
