// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.vpclattice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServicePlainArgs Empty = new GetServicePlainArgs();

    /**
     * ID or Amazon Resource Name (ARN) of the service network
     * 
     */
    @Import(name="serviceIdentifier", required=true)
    private String serviceIdentifier;

    /**
     * @return ID or Amazon Resource Name (ARN) of the service network
     * 
     */
    public String serviceIdentifier() {
        return this.serviceIdentifier;
    }

    /**
     * List of tags associated with the service.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return List of tags associated with the service.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetServicePlainArgs() {}

    private GetServicePlainArgs(GetServicePlainArgs $) {
        this.serviceIdentifier = $.serviceIdentifier;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServicePlainArgs $;

        public Builder() {
            $ = new GetServicePlainArgs();
        }

        public Builder(GetServicePlainArgs defaults) {
            $ = new GetServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param serviceIdentifier ID or Amazon Resource Name (ARN) of the service network
         * 
         * @return builder
         * 
         */
        public Builder serviceIdentifier(String serviceIdentifier) {
            $.serviceIdentifier = serviceIdentifier;
            return this;
        }

        /**
         * @param tags List of tags associated with the service.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetServicePlainArgs build() {
            $.serviceIdentifier = Objects.requireNonNull($.serviceIdentifier, "expected parameter 'serviceIdentifier' to be non-null");
            return $;
        }
    }

}
