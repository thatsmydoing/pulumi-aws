// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.VirtualNodeSpecLoggingAccessLogFile;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecLoggingAccessLog {
    /**
     * @return The file object to send virtual node access logs to.
     * 
     */
    private final @Nullable VirtualNodeSpecLoggingAccessLogFile file;

    @CustomType.Constructor
    private VirtualNodeSpecLoggingAccessLog(@CustomType.Parameter("file") @Nullable VirtualNodeSpecLoggingAccessLogFile file) {
        this.file = file;
    }

    /**
     * @return The file object to send virtual node access logs to.
     * 
     */
    public Optional<VirtualNodeSpecLoggingAccessLogFile> file() {
        return Optional.ofNullable(this.file);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecLoggingAccessLog defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecLoggingAccessLogFile file;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecLoggingAccessLog defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.file = defaults.file;
        }

        public Builder file(@Nullable VirtualNodeSpecLoggingAccessLogFile file) {
            this.file = file;
            return this;
        }        public VirtualNodeSpecLoggingAccessLog build() {
            return new VirtualNodeSpecLoggingAccessLog(file);
        }
    }
}