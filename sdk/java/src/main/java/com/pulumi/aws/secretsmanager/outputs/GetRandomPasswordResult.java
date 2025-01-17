// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.secretsmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRandomPasswordResult {
    private @Nullable String excludeCharacters;
    private @Nullable Boolean excludeLowercase;
    private @Nullable Boolean excludeNumbers;
    private @Nullable Boolean excludePunctuation;
    private @Nullable Boolean excludeUppercase;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable Boolean includeSpace;
    private @Nullable Integer passwordLength;
    /**
     * @return Random password.
     * 
     */
    private String randomPassword;
    private @Nullable Boolean requireEachIncludedType;

    private GetRandomPasswordResult() {}
    public Optional<String> excludeCharacters() {
        return Optional.ofNullable(this.excludeCharacters);
    }
    public Optional<Boolean> excludeLowercase() {
        return Optional.ofNullable(this.excludeLowercase);
    }
    public Optional<Boolean> excludeNumbers() {
        return Optional.ofNullable(this.excludeNumbers);
    }
    public Optional<Boolean> excludePunctuation() {
        return Optional.ofNullable(this.excludePunctuation);
    }
    public Optional<Boolean> excludeUppercase() {
        return Optional.ofNullable(this.excludeUppercase);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> includeSpace() {
        return Optional.ofNullable(this.includeSpace);
    }
    public Optional<Integer> passwordLength() {
        return Optional.ofNullable(this.passwordLength);
    }
    /**
     * @return Random password.
     * 
     */
    public String randomPassword() {
        return this.randomPassword;
    }
    public Optional<Boolean> requireEachIncludedType() {
        return Optional.ofNullable(this.requireEachIncludedType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRandomPasswordResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String excludeCharacters;
        private @Nullable Boolean excludeLowercase;
        private @Nullable Boolean excludeNumbers;
        private @Nullable Boolean excludePunctuation;
        private @Nullable Boolean excludeUppercase;
        private String id;
        private @Nullable Boolean includeSpace;
        private @Nullable Integer passwordLength;
        private String randomPassword;
        private @Nullable Boolean requireEachIncludedType;
        public Builder() {}
        public Builder(GetRandomPasswordResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeCharacters = defaults.excludeCharacters;
    	      this.excludeLowercase = defaults.excludeLowercase;
    	      this.excludeNumbers = defaults.excludeNumbers;
    	      this.excludePunctuation = defaults.excludePunctuation;
    	      this.excludeUppercase = defaults.excludeUppercase;
    	      this.id = defaults.id;
    	      this.includeSpace = defaults.includeSpace;
    	      this.passwordLength = defaults.passwordLength;
    	      this.randomPassword = defaults.randomPassword;
    	      this.requireEachIncludedType = defaults.requireEachIncludedType;
        }

        @CustomType.Setter
        public Builder excludeCharacters(@Nullable String excludeCharacters) {
            this.excludeCharacters = excludeCharacters;
            return this;
        }
        @CustomType.Setter
        public Builder excludeLowercase(@Nullable Boolean excludeLowercase) {
            this.excludeLowercase = excludeLowercase;
            return this;
        }
        @CustomType.Setter
        public Builder excludeNumbers(@Nullable Boolean excludeNumbers) {
            this.excludeNumbers = excludeNumbers;
            return this;
        }
        @CustomType.Setter
        public Builder excludePunctuation(@Nullable Boolean excludePunctuation) {
            this.excludePunctuation = excludePunctuation;
            return this;
        }
        @CustomType.Setter
        public Builder excludeUppercase(@Nullable Boolean excludeUppercase) {
            this.excludeUppercase = excludeUppercase;
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder includeSpace(@Nullable Boolean includeSpace) {
            this.includeSpace = includeSpace;
            return this;
        }
        @CustomType.Setter
        public Builder passwordLength(@Nullable Integer passwordLength) {
            this.passwordLength = passwordLength;
            return this;
        }
        @CustomType.Setter
        public Builder randomPassword(String randomPassword) {
            this.randomPassword = Objects.requireNonNull(randomPassword);
            return this;
        }
        @CustomType.Setter
        public Builder requireEachIncludedType(@Nullable Boolean requireEachIncludedType) {
            this.requireEachIncludedType = requireEachIncludedType;
            return this;
        }
        public GetRandomPasswordResult build() {
            final var o = new GetRandomPasswordResult();
            o.excludeCharacters = excludeCharacters;
            o.excludeLowercase = excludeLowercase;
            o.excludeNumbers = excludeNumbers;
            o.excludePunctuation = excludePunctuation;
            o.excludeUppercase = excludeUppercase;
            o.id = id;
            o.includeSpace = includeSpace;
            o.passwordLength = passwordLength;
            o.randomPassword = randomPassword;
            o.requireEachIncludedType = requireEachIncludedType;
            return o;
        }
    }
}
