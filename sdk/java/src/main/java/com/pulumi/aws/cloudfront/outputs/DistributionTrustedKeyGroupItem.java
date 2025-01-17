// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DistributionTrustedKeyGroupItem {
    /**
     * @return ID of the key group that contains the public keys.
     * 
     */
    private @Nullable String keyGroupId;
    /**
     * @return Set of active CloudFront key pairs associated with the signer account
     * 
     */
    private @Nullable List<String> keyPairIds;

    private DistributionTrustedKeyGroupItem() {}
    /**
     * @return ID of the key group that contains the public keys.
     * 
     */
    public Optional<String> keyGroupId() {
        return Optional.ofNullable(this.keyGroupId);
    }
    /**
     * @return Set of active CloudFront key pairs associated with the signer account
     * 
     */
    public List<String> keyPairIds() {
        return this.keyPairIds == null ? List.of() : this.keyPairIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionTrustedKeyGroupItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String keyGroupId;
        private @Nullable List<String> keyPairIds;
        public Builder() {}
        public Builder(DistributionTrustedKeyGroupItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyGroupId = defaults.keyGroupId;
    	      this.keyPairIds = defaults.keyPairIds;
        }

        @CustomType.Setter
        public Builder keyGroupId(@Nullable String keyGroupId) {
            this.keyGroupId = keyGroupId;
            return this;
        }
        @CustomType.Setter
        public Builder keyPairIds(@Nullable List<String> keyPairIds) {
            this.keyPairIds = keyPairIds;
            return this;
        }
        public Builder keyPairIds(String... keyPairIds) {
            return keyPairIds(List.of(keyPairIds));
        }
        public DistributionTrustedKeyGroupItem build() {
            final var o = new DistributionTrustedKeyGroupItem();
            o.keyGroupId = keyGroupId;
            o.keyPairIds = keyPairIds;
            return o;
        }
    }
}
