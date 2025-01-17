// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualGatewaySpecLoggingAccessLogFileFormatJson;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualGatewaySpecLoggingAccessLogFileFormat {
    /**
     * @return The logging format for JSON.
     * 
     */
    private @Nullable List<VirtualGatewaySpecLoggingAccessLogFileFormatJson> jsons;
    /**
     * @return The logging format for text. Must be between 1 and 1000 characters in length.
     * 
     */
    private @Nullable String text;

    private VirtualGatewaySpecLoggingAccessLogFileFormat() {}
    /**
     * @return The logging format for JSON.
     * 
     */
    public List<VirtualGatewaySpecLoggingAccessLogFileFormatJson> jsons() {
        return this.jsons == null ? List.of() : this.jsons;
    }
    /**
     * @return The logging format for text. Must be between 1 and 1000 characters in length.
     * 
     */
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecLoggingAccessLogFileFormat defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<VirtualGatewaySpecLoggingAccessLogFileFormatJson> jsons;
        private @Nullable String text;
        public Builder() {}
        public Builder(VirtualGatewaySpecLoggingAccessLogFileFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jsons = defaults.jsons;
    	      this.text = defaults.text;
        }

        @CustomType.Setter
        public Builder jsons(@Nullable List<VirtualGatewaySpecLoggingAccessLogFileFormatJson> jsons) {
            this.jsons = jsons;
            return this;
        }
        public Builder jsons(VirtualGatewaySpecLoggingAccessLogFileFormatJson... jsons) {
            return jsons(List.of(jsons));
        }
        @CustomType.Setter
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }
        public VirtualGatewaySpecLoggingAccessLogFileFormat build() {
            final var o = new VirtualGatewaySpecLoggingAccessLogFileFormat();
            o.jsons = jsons;
            o.text = text;
            return o;
        }
    }
}
