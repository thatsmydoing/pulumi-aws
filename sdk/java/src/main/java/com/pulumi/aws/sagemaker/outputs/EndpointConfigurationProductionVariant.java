// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.EndpointConfigurationProductionVariantServerlessConfig;
import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointConfigurationProductionVariant {
    /**
     * @return The size of the Elastic Inference (EI) instance to use for the production variant.
     * 
     */
    private final @Nullable String acceleratorType;
    /**
     * @return Initial number of instances used for auto-scaling.
     * 
     */
    private final @Nullable Integer initialInstanceCount;
    /**
     * @return Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. If unspecified, it defaults to `1.0`.
     * 
     */
    private final @Nullable Double initialVariantWeight;
    /**
     * @return The type of instance to start.
     * 
     */
    private final @Nullable String instanceType;
    /**
     * @return The name of the model to use.
     * 
     */
    private final String modelName;
    /**
     * @return Specifies configuration for how an endpoint performs asynchronous inference.
     * 
     */
    private final @Nullable EndpointConfigurationProductionVariantServerlessConfig serverlessConfig;
    /**
     * @return The name of the variant. If omitted, this provider will assign a random, unique name.
     * 
     */
    private final @Nullable String variantName;

    @CustomType.Constructor
    private EndpointConfigurationProductionVariant(
        @CustomType.Parameter("acceleratorType") @Nullable String acceleratorType,
        @CustomType.Parameter("initialInstanceCount") @Nullable Integer initialInstanceCount,
        @CustomType.Parameter("initialVariantWeight") @Nullable Double initialVariantWeight,
        @CustomType.Parameter("instanceType") @Nullable String instanceType,
        @CustomType.Parameter("modelName") String modelName,
        @CustomType.Parameter("serverlessConfig") @Nullable EndpointConfigurationProductionVariantServerlessConfig serverlessConfig,
        @CustomType.Parameter("variantName") @Nullable String variantName) {
        this.acceleratorType = acceleratorType;
        this.initialInstanceCount = initialInstanceCount;
        this.initialVariantWeight = initialVariantWeight;
        this.instanceType = instanceType;
        this.modelName = modelName;
        this.serverlessConfig = serverlessConfig;
        this.variantName = variantName;
    }

    /**
     * @return The size of the Elastic Inference (EI) instance to use for the production variant.
     * 
     */
    public Optional<String> acceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }
    /**
     * @return Initial number of instances used for auto-scaling.
     * 
     */
    public Optional<Integer> initialInstanceCount() {
        return Optional.ofNullable(this.initialInstanceCount);
    }
    /**
     * @return Determines initial traffic distribution among all of the models that you specify in the endpoint configuration. If unspecified, it defaults to `1.0`.
     * 
     */
    public Optional<Double> initialVariantWeight() {
        return Optional.ofNullable(this.initialVariantWeight);
    }
    /**
     * @return The type of instance to start.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return The name of the model to use.
     * 
     */
    public String modelName() {
        return this.modelName;
    }
    /**
     * @return Specifies configuration for how an endpoint performs asynchronous inference.
     * 
     */
    public Optional<EndpointConfigurationProductionVariantServerlessConfig> serverlessConfig() {
        return Optional.ofNullable(this.serverlessConfig);
    }
    /**
     * @return The name of the variant. If omitted, this provider will assign a random, unique name.
     * 
     */
    public Optional<String> variantName() {
        return Optional.ofNullable(this.variantName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointConfigurationProductionVariant defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acceleratorType;
        private @Nullable Integer initialInstanceCount;
        private @Nullable Double initialVariantWeight;
        private @Nullable String instanceType;
        private String modelName;
        private @Nullable EndpointConfigurationProductionVariantServerlessConfig serverlessConfig;
        private @Nullable String variantName;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointConfigurationProductionVariant defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorType = defaults.acceleratorType;
    	      this.initialInstanceCount = defaults.initialInstanceCount;
    	      this.initialVariantWeight = defaults.initialVariantWeight;
    	      this.instanceType = defaults.instanceType;
    	      this.modelName = defaults.modelName;
    	      this.serverlessConfig = defaults.serverlessConfig;
    	      this.variantName = defaults.variantName;
        }

        public Builder acceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public Builder initialInstanceCount(@Nullable Integer initialInstanceCount) {
            this.initialInstanceCount = initialInstanceCount;
            return this;
        }
        public Builder initialVariantWeight(@Nullable Double initialVariantWeight) {
            this.initialVariantWeight = initialVariantWeight;
            return this;
        }
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public Builder modelName(String modelName) {
            this.modelName = Objects.requireNonNull(modelName);
            return this;
        }
        public Builder serverlessConfig(@Nullable EndpointConfigurationProductionVariantServerlessConfig serverlessConfig) {
            this.serverlessConfig = serverlessConfig;
            return this;
        }
        public Builder variantName(@Nullable String variantName) {
            this.variantName = variantName;
            return this;
        }        public EndpointConfigurationProductionVariant build() {
            return new EndpointConfigurationProductionVariant(acceleratorType, initialInstanceCount, initialVariantWeight, instanceType, modelName, serverlessConfig, variantName);
        }
    }
}