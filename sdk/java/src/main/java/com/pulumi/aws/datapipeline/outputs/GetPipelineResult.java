// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datapipeline.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetPipelineResult {
    /**
     * @return Description of Pipeline.
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Name of Pipeline.
     * 
     */
    private final String name;
    private final String pipelineId;
    /**
     * @return A map of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;

    @CustomType.Constructor
    private GetPipelineResult(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("pipelineId") String pipelineId,
        @CustomType.Parameter("tags") Map<String,String> tags) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.pipelineId = pipelineId;
        this.tags = tags;
    }

    /**
     * @return Description of Pipeline.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Name of Pipeline.
     * 
     */
    public String name() {
        return this.name;
    }
    public String pipelineId() {
        return this.pipelineId;
    }
    /**
     * @return A map of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String id;
        private String name;
        private String pipelineId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.pipelineId = defaults.pipelineId;
    	      this.tags = defaults.tags;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder pipelineId(String pipelineId) {
            this.pipelineId = Objects.requireNonNull(pipelineId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetPipelineResult build() {
            return new GetPipelineResult(description, id, name, pipelineId, tags);
        }
    }
}