// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.SpaceSpaceSettingsJupyterServerAppSettings;
import com.pulumi.aws.sagemaker.outputs.SpaceSpaceSettingsKernelGatewayAppSettings;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SpaceSpaceSettings {
    /**
     * @return The Jupyter server&#39;s app settings. See Jupyter Server App Settings below.
     * 
     */
    private @Nullable SpaceSpaceSettingsJupyterServerAppSettings jupyterServerAppSettings;
    /**
     * @return The kernel gateway app settings. See Kernel Gateway App Settings below.
     * 
     */
    private @Nullable SpaceSpaceSettingsKernelGatewayAppSettings kernelGatewayAppSettings;

    private SpaceSpaceSettings() {}
    /**
     * @return The Jupyter server&#39;s app settings. See Jupyter Server App Settings below.
     * 
     */
    public Optional<SpaceSpaceSettingsJupyterServerAppSettings> jupyterServerAppSettings() {
        return Optional.ofNullable(this.jupyterServerAppSettings);
    }
    /**
     * @return The kernel gateway app settings. See Kernel Gateway App Settings below.
     * 
     */
    public Optional<SpaceSpaceSettingsKernelGatewayAppSettings> kernelGatewayAppSettings() {
        return Optional.ofNullable(this.kernelGatewayAppSettings);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpaceSpaceSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SpaceSpaceSettingsJupyterServerAppSettings jupyterServerAppSettings;
        private @Nullable SpaceSpaceSettingsKernelGatewayAppSettings kernelGatewayAppSettings;
        public Builder() {}
        public Builder(SpaceSpaceSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jupyterServerAppSettings = defaults.jupyterServerAppSettings;
    	      this.kernelGatewayAppSettings = defaults.kernelGatewayAppSettings;
        }

        @CustomType.Setter
        public Builder jupyterServerAppSettings(@Nullable SpaceSpaceSettingsJupyterServerAppSettings jupyterServerAppSettings) {
            this.jupyterServerAppSettings = jupyterServerAppSettings;
            return this;
        }
        @CustomType.Setter
        public Builder kernelGatewayAppSettings(@Nullable SpaceSpaceSettingsKernelGatewayAppSettings kernelGatewayAppSettings) {
            this.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return this;
        }
        public SpaceSpaceSettings build() {
            final var o = new SpaceSpaceSettings();
            o.jupyterServerAppSettings = jupyterServerAppSettings;
            o.kernelGatewayAppSettings = kernelGatewayAppSettings;
            return o;
        }
    }
}
