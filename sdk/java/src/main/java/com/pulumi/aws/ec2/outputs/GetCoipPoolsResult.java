// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetCoipPoolsFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetCoipPoolsResult {
    private final @Nullable List<GetCoipPoolsFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Set of COIP Pool Identifiers
     * 
     */
    private final List<String> poolIds;
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetCoipPoolsResult(
        @CustomType.Parameter("filters") @Nullable List<GetCoipPoolsFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("poolIds") List<String> poolIds,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.poolIds = poolIds;
        this.tags = tags;
    }

    public List<GetCoipPoolsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set of COIP Pool Identifiers
     * 
     */
    public List<String> poolIds() {
        return this.poolIds;
    }
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCoipPoolsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetCoipPoolsFilter> filters;
        private String id;
        private List<String> poolIds;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCoipPoolsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.poolIds = defaults.poolIds;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetCoipPoolsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetCoipPoolsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder poolIds(List<String> poolIds) {
            this.poolIds = Objects.requireNonNull(poolIds);
            return this;
        }
        public Builder poolIds(String... poolIds) {
            return poolIds(List.of(poolIds));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetCoipPoolsResult build() {
            return new GetCoipPoolsResult(filters, id, poolIds, tags);
        }
    }
}