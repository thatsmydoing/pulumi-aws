// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetEndpointMongodbSetting extends com.pulumi.resources.InvokeArgs {

    public static final GetEndpointMongodbSetting Empty = new GetEndpointMongodbSetting();

    @Import(name="authMechanism", required=true)
    private String authMechanism;

    public String authMechanism() {
        return this.authMechanism;
    }

    @Import(name="authSource", required=true)
    private String authSource;

    public String authSource() {
        return this.authSource;
    }

    @Import(name="authType", required=true)
    private String authType;

    public String authType() {
        return this.authType;
    }

    @Import(name="docsToInvestigate", required=true)
    private String docsToInvestigate;

    public String docsToInvestigate() {
        return this.docsToInvestigate;
    }

    @Import(name="extractDocId", required=true)
    private String extractDocId;

    public String extractDocId() {
        return this.extractDocId;
    }

    @Import(name="nestingLevel", required=true)
    private String nestingLevel;

    public String nestingLevel() {
        return this.nestingLevel;
    }

    private GetEndpointMongodbSetting() {}

    private GetEndpointMongodbSetting(GetEndpointMongodbSetting $) {
        this.authMechanism = $.authMechanism;
        this.authSource = $.authSource;
        this.authType = $.authType;
        this.docsToInvestigate = $.docsToInvestigate;
        this.extractDocId = $.extractDocId;
        this.nestingLevel = $.nestingLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEndpointMongodbSetting defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEndpointMongodbSetting $;

        public Builder() {
            $ = new GetEndpointMongodbSetting();
        }

        public Builder(GetEndpointMongodbSetting defaults) {
            $ = new GetEndpointMongodbSetting(Objects.requireNonNull(defaults));
        }

        public Builder authMechanism(String authMechanism) {
            $.authMechanism = authMechanism;
            return this;
        }

        public Builder authSource(String authSource) {
            $.authSource = authSource;
            return this;
        }

        public Builder authType(String authType) {
            $.authType = authType;
            return this;
        }

        public Builder docsToInvestigate(String docsToInvestigate) {
            $.docsToInvestigate = docsToInvestigate;
            return this;
        }

        public Builder extractDocId(String extractDocId) {
            $.extractDocId = extractDocId;
            return this;
        }

        public Builder nestingLevel(String nestingLevel) {
            $.nestingLevel = nestingLevel;
            return this;
        }

        public GetEndpointMongodbSetting build() {
            $.authMechanism = Objects.requireNonNull($.authMechanism, "expected parameter 'authMechanism' to be non-null");
            $.authSource = Objects.requireNonNull($.authSource, "expected parameter 'authSource' to be non-null");
            $.authType = Objects.requireNonNull($.authType, "expected parameter 'authType' to be non-null");
            $.docsToInvestigate = Objects.requireNonNull($.docsToInvestigate, "expected parameter 'docsToInvestigate' to be non-null");
            $.extractDocId = Objects.requireNonNull($.extractDocId, "expected parameter 'extractDocId' to be non-null");
            $.nestingLevel = Objects.requireNonNull($.nestingLevel, "expected parameter 'nestingLevel' to be non-null");
            return $;
        }
    }

}
