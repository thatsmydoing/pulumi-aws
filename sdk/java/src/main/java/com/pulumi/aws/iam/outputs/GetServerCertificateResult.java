// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServerCertificateResult {
    private final String arn;
    private final String certificateBody;
    private final String certificateChain;
    private final String expirationDate;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final @Nullable Boolean latest;
    private final String name;
    private final @Nullable String namePrefix;
    private final String path;
    private final @Nullable String pathPrefix;
    private final String uploadDate;

    @CustomType.Constructor
    private GetServerCertificateResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("certificateBody") String certificateBody,
        @CustomType.Parameter("certificateChain") String certificateChain,
        @CustomType.Parameter("expirationDate") String expirationDate,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("latest") @Nullable Boolean latest,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("namePrefix") @Nullable String namePrefix,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("pathPrefix") @Nullable String pathPrefix,
        @CustomType.Parameter("uploadDate") String uploadDate) {
        this.arn = arn;
        this.certificateBody = certificateBody;
        this.certificateChain = certificateChain;
        this.expirationDate = expirationDate;
        this.id = id;
        this.latest = latest;
        this.name = name;
        this.namePrefix = namePrefix;
        this.path = path;
        this.pathPrefix = pathPrefix;
        this.uploadDate = uploadDate;
    }

    public String arn() {
        return this.arn;
    }
    public String certificateBody() {
        return this.certificateBody;
    }
    public String certificateChain() {
        return this.certificateChain;
    }
    public String expirationDate() {
        return this.expirationDate;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<Boolean> latest() {
        return Optional.ofNullable(this.latest);
    }
    public String name() {
        return this.name;
    }
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }
    public String path() {
        return this.path;
    }
    public Optional<String> pathPrefix() {
        return Optional.ofNullable(this.pathPrefix);
    }
    public String uploadDate() {
        return this.uploadDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificateBody;
        private String certificateChain;
        private String expirationDate;
        private String id;
        private @Nullable Boolean latest;
        private String name;
        private @Nullable String namePrefix;
        private String path;
        private @Nullable String pathPrefix;
        private String uploadDate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificateBody = defaults.certificateBody;
    	      this.certificateChain = defaults.certificateChain;
    	      this.expirationDate = defaults.expirationDate;
    	      this.id = defaults.id;
    	      this.latest = defaults.latest;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.path = defaults.path;
    	      this.pathPrefix = defaults.pathPrefix;
    	      this.uploadDate = defaults.uploadDate;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder certificateBody(String certificateBody) {
            this.certificateBody = Objects.requireNonNull(certificateBody);
            return this;
        }
        public Builder certificateChain(String certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = Objects.requireNonNull(expirationDate);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder latest(@Nullable Boolean latest) {
            this.latest = latest;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder pathPrefix(@Nullable String pathPrefix) {
            this.pathPrefix = pathPrefix;
            return this;
        }
        public Builder uploadDate(String uploadDate) {
            this.uploadDate = Objects.requireNonNull(uploadDate);
            return this;
        }        public GetServerCertificateResult build() {
            return new GetServerCertificateResult(arn, certificateBody, certificateChain, expirationDate, id, latest, name, namePrefix, path, pathPrefix, uploadDate);
        }
    }
}