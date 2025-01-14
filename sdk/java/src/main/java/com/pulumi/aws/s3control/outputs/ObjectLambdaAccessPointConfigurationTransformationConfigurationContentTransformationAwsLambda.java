// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3control.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda {
    /**
     * @return The Amazon Resource Name (ARN) of the AWS Lambda function.
     * 
     */
    private String functionArn;
    /**
     * @return Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     * 
     */
    private @Nullable String functionPayload;

    private ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda() {}
    /**
     * @return The Amazon Resource Name (ARN) of the AWS Lambda function.
     * 
     */
    public String functionArn() {
        return this.functionArn;
    }
    /**
     * @return Additional JSON that provides supplemental data to the Lambda function used to transform objects.
     * 
     */
    public Optional<String> functionPayload() {
        return Optional.ofNullable(this.functionPayload);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String functionArn;
        private @Nullable String functionPayload;
        public Builder() {}
        public Builder(ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.functionPayload = defaults.functionPayload;
        }

        @CustomType.Setter
        public Builder functionArn(String functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        @CustomType.Setter
        public Builder functionPayload(@Nullable String functionPayload) {
            this.functionPayload = functionPayload;
            return this;
        }
        public ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda build() {
            final var o = new ObjectLambdaAccessPointConfigurationTransformationConfigurationContentTransformationAwsLambda();
            o.functionArn = functionArn;
            o.functionPayload = functionPayload;
            return o;
        }
    }
}
