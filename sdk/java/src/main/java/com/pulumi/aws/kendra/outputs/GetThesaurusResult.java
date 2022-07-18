// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kendra.outputs;

import com.pulumi.aws.kendra.outputs.GetThesaurusSourceS3Path;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetThesaurusResult {
    /**
     * @return The Amazon Resource Name (ARN) of the Thesaurus.
     * 
     */
    private final String arn;
    /**
     * @return The Unix datetime that the Thesaurus was created.
     * 
     */
    private final String createdAt;
    /**
     * @return The description of the Thesaurus.
     * 
     */
    private final String description;
    /**
     * @return When the `status` field value is `FAILED`, this contains a message that explains why.
     * 
     */
    private final String errorMessage;
    /**
     * @return The size of the Thesaurus file in bytes.
     * 
     */
    private final Integer fileSizeBytes;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String indexId;
    /**
     * @return Specifies the name of the Thesaurus.
     * 
     */
    private final String name;
    /**
     * @return The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the Thesaurus. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    private final String roleArn;
    /**
     * @return The S3 location of the Thesaurus input data. Detailed below.
     * 
     */
    private final List<GetThesaurusSourceS3Path> sourceS3Paths;
    /**
     * @return The status of the Thesaurus. It is ready to use when the status is `ACTIVE`.
     * 
     */
    private final String status;
    /**
     * @return The number of synonym rules in the Thesaurus file.
     * 
     */
    private final Integer synonymRuleCount;
    /**
     * @return Metadata that helps organize the Thesaurus you create.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The number of unique terms in the Thesaurus file. For example, the synonyms `a,b,c` and `a=&gt;d`, the term count would be 4.
     * 
     */
    private final Integer termCount;
    private final String thesaurusId;
    /**
     * @return The date and time that the Thesaurus was last updated.
     * 
     */
    private final String updatedAt;

    @CustomType.Constructor
    private GetThesaurusResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("errorMessage") String errorMessage,
        @CustomType.Parameter("fileSizeBytes") Integer fileSizeBytes,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("indexId") String indexId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("roleArn") String roleArn,
        @CustomType.Parameter("sourceS3Paths") List<GetThesaurusSourceS3Path> sourceS3Paths,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("synonymRuleCount") Integer synonymRuleCount,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("termCount") Integer termCount,
        @CustomType.Parameter("thesaurusId") String thesaurusId,
        @CustomType.Parameter("updatedAt") String updatedAt) {
        this.arn = arn;
        this.createdAt = createdAt;
        this.description = description;
        this.errorMessage = errorMessage;
        this.fileSizeBytes = fileSizeBytes;
        this.id = id;
        this.indexId = indexId;
        this.name = name;
        this.roleArn = roleArn;
        this.sourceS3Paths = sourceS3Paths;
        this.status = status;
        this.synonymRuleCount = synonymRuleCount;
        this.tags = tags;
        this.termCount = termCount;
        this.thesaurusId = thesaurusId;
        this.updatedAt = updatedAt;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the Thesaurus.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The Unix datetime that the Thesaurus was created.
     * 
     */
    public String createdAt() {
        return this.createdAt;
    }
    /**
     * @return The description of the Thesaurus.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return When the `status` field value is `FAILED`, this contains a message that explains why.
     * 
     */
    public String errorMessage() {
        return this.errorMessage;
    }
    /**
     * @return The size of the Thesaurus file in bytes.
     * 
     */
    public Integer fileSizeBytes() {
        return this.fileSizeBytes;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String indexId() {
        return this.indexId;
    }
    /**
     * @return Specifies the name of the Thesaurus.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The Amazon Resource Name (ARN) of a role with permission to access the S3 bucket that contains the Thesaurus. For more information, see [IAM Roles for Amazon Kendra](https://docs.aws.amazon.com/kendra/latest/dg/iam-roles.html).
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }
    /**
     * @return The S3 location of the Thesaurus input data. Detailed below.
     * 
     */
    public List<GetThesaurusSourceS3Path> sourceS3Paths() {
        return this.sourceS3Paths;
    }
    /**
     * @return The status of the Thesaurus. It is ready to use when the status is `ACTIVE`.
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return The number of synonym rules in the Thesaurus file.
     * 
     */
    public Integer synonymRuleCount() {
        return this.synonymRuleCount;
    }
    /**
     * @return Metadata that helps organize the Thesaurus you create.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The number of unique terms in the Thesaurus file. For example, the synonyms `a,b,c` and `a=&gt;d`, the term count would be 4.
     * 
     */
    public Integer termCount() {
        return this.termCount;
    }
    public String thesaurusId() {
        return this.thesaurusId;
    }
    /**
     * @return The date and time that the Thesaurus was last updated.
     * 
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetThesaurusResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String createdAt;
        private String description;
        private String errorMessage;
        private Integer fileSizeBytes;
        private String id;
        private String indexId;
        private String name;
        private String roleArn;
        private List<GetThesaurusSourceS3Path> sourceS3Paths;
        private String status;
        private Integer synonymRuleCount;
        private Map<String,String> tags;
        private Integer termCount;
        private String thesaurusId;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetThesaurusResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.errorMessage = defaults.errorMessage;
    	      this.fileSizeBytes = defaults.fileSizeBytes;
    	      this.id = defaults.id;
    	      this.indexId = defaults.indexId;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.sourceS3Paths = defaults.sourceS3Paths;
    	      this.status = defaults.status;
    	      this.synonymRuleCount = defaults.synonymRuleCount;
    	      this.tags = defaults.tags;
    	      this.termCount = defaults.termCount;
    	      this.thesaurusId = defaults.thesaurusId;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }
        public Builder fileSizeBytes(Integer fileSizeBytes) {
            this.fileSizeBytes = Objects.requireNonNull(fileSizeBytes);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder indexId(String indexId) {
            this.indexId = Objects.requireNonNull(indexId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public Builder sourceS3Paths(List<GetThesaurusSourceS3Path> sourceS3Paths) {
            this.sourceS3Paths = Objects.requireNonNull(sourceS3Paths);
            return this;
        }
        public Builder sourceS3Paths(GetThesaurusSourceS3Path... sourceS3Paths) {
            return sourceS3Paths(List.of(sourceS3Paths));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder synonymRuleCount(Integer synonymRuleCount) {
            this.synonymRuleCount = Objects.requireNonNull(synonymRuleCount);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder termCount(Integer termCount) {
            this.termCount = Objects.requireNonNull(termCount);
            return this;
        }
        public Builder thesaurusId(String thesaurusId) {
            this.thesaurusId = Objects.requireNonNull(thesaurusId);
            return this;
        }
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }        public GetThesaurusResult build() {
            return new GetThesaurusResult(arn, createdAt, description, errorMessage, fileSizeBytes, id, indexId, name, roleArn, sourceS3Paths, status, synonymRuleCount, tags, termCount, thesaurusId, updatedAt);
        }
    }
}