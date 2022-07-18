// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.LaunchTemplateBlockDeviceMappingEbs;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateBlockDeviceMapping {
    /**
     * @return The name of the device to mount.
     * 
     */
    private final @Nullable String deviceName;
    /**
     * @return Configure EBS volume properties.
     * 
     */
    private final @Nullable LaunchTemplateBlockDeviceMappingEbs ebs;
    /**
     * @return Suppresses the specified device included in the AMI&#39;s block device mapping.
     * 
     */
    private final @Nullable String noDevice;
    /**
     * @return The [Instance Store Device
     * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
     * (e.g., `&#34;ephemeral0&#34;`).
     * 
     */
    private final @Nullable String virtualName;

    @CustomType.Constructor
    private LaunchTemplateBlockDeviceMapping(
        @CustomType.Parameter("deviceName") @Nullable String deviceName,
        @CustomType.Parameter("ebs") @Nullable LaunchTemplateBlockDeviceMappingEbs ebs,
        @CustomType.Parameter("noDevice") @Nullable String noDevice,
        @CustomType.Parameter("virtualName") @Nullable String virtualName) {
        this.deviceName = deviceName;
        this.ebs = ebs;
        this.noDevice = noDevice;
        this.virtualName = virtualName;
    }

    /**
     * @return The name of the device to mount.
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return Configure EBS volume properties.
     * 
     */
    public Optional<LaunchTemplateBlockDeviceMappingEbs> ebs() {
        return Optional.ofNullable(this.ebs);
    }
    /**
     * @return Suppresses the specified device included in the AMI&#39;s block device mapping.
     * 
     */
    public Optional<String> noDevice() {
        return Optional.ofNullable(this.noDevice);
    }
    /**
     * @return The [Instance Store Device
     * Name](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/InstanceStorage.html#InstanceStoreDeviceNames)
     * (e.g., `&#34;ephemeral0&#34;`).
     * 
     */
    public Optional<String> virtualName() {
        return Optional.ofNullable(this.virtualName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateBlockDeviceMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deviceName;
        private @Nullable LaunchTemplateBlockDeviceMappingEbs ebs;
        private @Nullable String noDevice;
        private @Nullable String virtualName;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchTemplateBlockDeviceMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.ebs = defaults.ebs;
    	      this.noDevice = defaults.noDevice;
    	      this.virtualName = defaults.virtualName;
        }

        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder ebs(@Nullable LaunchTemplateBlockDeviceMappingEbs ebs) {
            this.ebs = ebs;
            return this;
        }
        public Builder noDevice(@Nullable String noDevice) {
            this.noDevice = noDevice;
            return this;
        }
        public Builder virtualName(@Nullable String virtualName) {
            this.virtualName = virtualName;
            return this;
        }        public LaunchTemplateBlockDeviceMapping build() {
            return new LaunchTemplateBlockDeviceMapping(deviceName, ebs, noDevice, virtualName);
        }
    }
}