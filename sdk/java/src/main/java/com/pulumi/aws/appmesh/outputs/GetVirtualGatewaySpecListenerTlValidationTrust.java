// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GetVirtualGatewaySpecListenerTlValidationTrustFile;
import com.pulumi.aws.appmesh.outputs.GetVirtualGatewaySpecListenerTlValidationTrustSd;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetVirtualGatewaySpecListenerTlValidationTrust {
    private List<GetVirtualGatewaySpecListenerTlValidationTrustFile> files;
    private List<GetVirtualGatewaySpecListenerTlValidationTrustSd> sds;

    private GetVirtualGatewaySpecListenerTlValidationTrust() {}
    public List<GetVirtualGatewaySpecListenerTlValidationTrustFile> files() {
        return this.files;
    }
    public List<GetVirtualGatewaySpecListenerTlValidationTrustSd> sds() {
        return this.sds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualGatewaySpecListenerTlValidationTrust defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetVirtualGatewaySpecListenerTlValidationTrustFile> files;
        private List<GetVirtualGatewaySpecListenerTlValidationTrustSd> sds;
        public Builder() {}
        public Builder(GetVirtualGatewaySpecListenerTlValidationTrust defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.files = defaults.files;
    	      this.sds = defaults.sds;
        }

        @CustomType.Setter
        public Builder files(List<GetVirtualGatewaySpecListenerTlValidationTrustFile> files) {
            this.files = Objects.requireNonNull(files);
            return this;
        }
        public Builder files(GetVirtualGatewaySpecListenerTlValidationTrustFile... files) {
            return files(List.of(files));
        }
        @CustomType.Setter
        public Builder sds(List<GetVirtualGatewaySpecListenerTlValidationTrustSd> sds) {
            this.sds = Objects.requireNonNull(sds);
            return this;
        }
        public Builder sds(GetVirtualGatewaySpecListenerTlValidationTrustSd... sds) {
            return sds(List.of(sds));
        }
        public GetVirtualGatewaySpecListenerTlValidationTrust build() {
            final var o = new GetVirtualGatewaySpecListenerTlValidationTrust();
            o.files = files;
            o.sds = sds;
            return o;
        }
    }
}
