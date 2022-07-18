// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.athena;

import com.pulumi.aws.athena.inputs.WorkgroupConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkgroupArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkgroupArgs Empty = new WorkgroupArgs();

    /**
     * Configuration block with various settings for the workgroup. Documented below.
     * 
     */
    @Import(name="configuration")
    private @Nullable Output<WorkgroupConfigurationArgs> configuration;

    /**
     * @return Configuration block with various settings for the workgroup. Documented below.
     * 
     */
    public Optional<Output<WorkgroupConfigurationArgs>> configuration() {
        return Optional.ofNullable(this.configuration);
    }

    /**
     * Description of the workgroup.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the workgroup.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    @Import(name="forceDestroy")
    private @Nullable Output<Boolean> forceDestroy;

    /**
     * @return The option to delete the workgroup and its contents even if the workgroup contains any named queries.
     * 
     */
    public Optional<Output<Boolean>> forceDestroy() {
        return Optional.ofNullable(this.forceDestroy);
    }

    /**
     * Name of the workgroup.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the workgroup.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Key-value map of resource tags for the workgroup. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags for the workgroup. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private WorkgroupArgs() {}

    private WorkgroupArgs(WorkgroupArgs $) {
        this.configuration = $.configuration;
        this.description = $.description;
        this.forceDestroy = $.forceDestroy;
        this.name = $.name;
        this.state = $.state;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkgroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkgroupArgs $;

        public Builder() {
            $ = new WorkgroupArgs();
        }

        public Builder(WorkgroupArgs defaults) {
            $ = new WorkgroupArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configuration Configuration block with various settings for the workgroup. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(@Nullable Output<WorkgroupConfigurationArgs> configuration) {
            $.configuration = configuration;
            return this;
        }

        /**
         * @param configuration Configuration block with various settings for the workgroup. Documented below.
         * 
         * @return builder
         * 
         */
        public Builder configuration(WorkgroupConfigurationArgs configuration) {
            return configuration(Output.of(configuration));
        }

        /**
         * @param description Description of the workgroup.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the workgroup.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param forceDestroy The option to delete the workgroup and its contents even if the workgroup contains any named queries.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            $.forceDestroy = forceDestroy;
            return this;
        }

        /**
         * @param forceDestroy The option to delete the workgroup and its contents even if the workgroup contains any named queries.
         * 
         * @return builder
         * 
         */
        public Builder forceDestroy(Boolean forceDestroy) {
            return forceDestroy(Output.of(forceDestroy));
        }

        /**
         * @param name Name of the workgroup.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the workgroup.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param state State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param tags Key-value map of resource tags for the workgroup. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Key-value map of resource tags for the workgroup. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public WorkgroupArgs build() {
            return $;
        }
    }

}