// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceDevice {
    /**
     * @return A description for the device.
     * 
     */
    private final @Nullable String description;
    /**
     * @return The name of the device.
     * 
     */
    private final String deviceName;
    /**
     * @return Amazon Web Services Internet of Things (IoT) object name.
     * 
     */
    private final @Nullable String iotThingName;

    @CustomType.Constructor
    private DeviceDevice(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("deviceName") String deviceName,
        @CustomType.Parameter("iotThingName") @Nullable String iotThingName) {
        this.description = description;
        this.deviceName = deviceName;
        this.iotThingName = iotThingName;
    }

    /**
     * @return A description for the device.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The name of the device.
     * 
     */
    public String deviceName() {
        return this.deviceName;
    }
    /**
     * @return Amazon Web Services Internet of Things (IoT) object name.
     * 
     */
    public Optional<String> iotThingName() {
        return Optional.ofNullable(this.iotThingName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String deviceName;
        private @Nullable String iotThingName;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceName = defaults.deviceName;
    	      this.iotThingName = defaults.iotThingName;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder deviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }
        public Builder iotThingName(@Nullable String iotThingName) {
            this.iotThingName = iotThingName;
            return this;
        }        public DeviceDevice build() {
            return new DeviceDevice(description, deviceName, iotThingName);
        }
    }
}