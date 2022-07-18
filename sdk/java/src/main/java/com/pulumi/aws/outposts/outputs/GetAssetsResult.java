// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.outposts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAssetsResult {
    private final String arn;
    /**
     * @return A list of all the subnet ids found. This data source will fail if none are found.
     * 
     */
    private final List<String> assetIds;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @CustomType.Constructor
    private GetAssetsResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("assetIds") List<String> assetIds,
        @CustomType.Parameter("id") String id) {
        this.arn = arn;
        this.assetIds = assetIds;
        this.id = id;
    }

    public String arn() {
        return this.arn;
    }
    /**
     * @return A list of all the subnet ids found. This data source will fail if none are found.
     * 
     */
    public List<String> assetIds() {
        return this.assetIds;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssetsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<String> assetIds;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssetsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assetIds = defaults.assetIds;
    	      this.id = defaults.id;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder assetIds(List<String> assetIds) {
            this.assetIds = Objects.requireNonNull(assetIds);
            return this;
        }
        public Builder assetIds(String... assetIds) {
            return assetIds(List.of(assetIds));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public GetAssetsResult build() {
            return new GetAssetsResult(arn, assetIds, id);
        }
    }
}