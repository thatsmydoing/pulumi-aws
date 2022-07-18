// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.macie2.inputs;

import com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingExcludesArgs;
import com.pulumi.aws.macie2.inputs.ClassificationJobS3JobDefinitionScopingIncludesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClassificationJobS3JobDefinitionScopingArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClassificationJobS3JobDefinitionScopingArgs Empty = new ClassificationJobS3JobDefinitionScopingArgs();

    /**
     * The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
     * 
     */
    @Import(name="excludes")
    private @Nullable Output<ClassificationJobS3JobDefinitionScopingExcludesArgs> excludes;

    /**
     * @return The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
     * 
     */
    public Optional<Output<ClassificationJobS3JobDefinitionScopingExcludesArgs>> excludes() {
        return Optional.ofNullable(this.excludes);
    }

    /**
     * The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
     * 
     */
    @Import(name="includes")
    private @Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesArgs> includes;

    /**
     * @return The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
     * 
     */
    public Optional<Output<ClassificationJobS3JobDefinitionScopingIncludesArgs>> includes() {
        return Optional.ofNullable(this.includes);
    }

    private ClassificationJobS3JobDefinitionScopingArgs() {}

    private ClassificationJobS3JobDefinitionScopingArgs(ClassificationJobS3JobDefinitionScopingArgs $) {
        this.excludes = $.excludes;
        this.includes = $.includes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClassificationJobS3JobDefinitionScopingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClassificationJobS3JobDefinitionScopingArgs $;

        public Builder() {
            $ = new ClassificationJobS3JobDefinitionScopingArgs();
        }

        public Builder(ClassificationJobS3JobDefinitionScopingArgs defaults) {
            $ = new ClassificationJobS3JobDefinitionScopingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludes The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder excludes(@Nullable Output<ClassificationJobS3JobDefinitionScopingExcludesArgs> excludes) {
            $.excludes = excludes;
            return this;
        }

        /**
         * @param excludes The property- or tag-based conditions that determine which objects to exclude from the analysis. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder excludes(ClassificationJobS3JobDefinitionScopingExcludesArgs excludes) {
            return excludes(Output.of(excludes));
        }

        /**
         * @param includes The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder includes(@Nullable Output<ClassificationJobS3JobDefinitionScopingIncludesArgs> includes) {
            $.includes = includes;
            return this;
        }

        /**
         * @param includes The property- or tag-based conditions that determine which objects to include in the analysis. (documented below)
         * 
         * @return builder
         * 
         */
        public Builder includes(ClassificationJobS3JobDefinitionScopingIncludesArgs includes) {
            return includes(Output.of(includes));
        }

        public ClassificationJobS3JobDefinitionScopingArgs build() {
            return $;
        }
    }

}