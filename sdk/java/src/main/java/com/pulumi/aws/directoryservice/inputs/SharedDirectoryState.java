// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice.inputs;

import com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SharedDirectoryState extends com.pulumi.resources.ResourceArgs {

    public static final SharedDirectoryState Empty = new SharedDirectoryState();

    /**
     * Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
     * 
     */
    @Import(name="directoryId")
    private @Nullable Output<String> directoryId;

    /**
     * @return Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
     * 
     */
    public Optional<Output<String>> directoryId() {
        return Optional.ofNullable(this.directoryId);
    }

    /**
     * Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
     * 
     */
    @Import(name="method")
    private @Nullable Output<String> method;

    /**
     * @return Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
     * 
     */
    public Optional<Output<String>> method() {
        return Optional.ofNullable(this.method);
    }

    /**
     * Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
     * 
     */
    @Import(name="notes")
    private @Nullable Output<String> notes;

    /**
     * @return Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
     * 
     */
    public Optional<Output<String>> notes() {
        return Optional.ofNullable(this.notes);
    }

    /**
     * Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
     * 
     */
    @Import(name="sharedDirectoryId")
    private @Nullable Output<String> sharedDirectoryId;

    /**
     * @return Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
     * 
     */
    public Optional<Output<String>> sharedDirectoryId() {
        return Optional.ofNullable(this.sharedDirectoryId);
    }

    /**
     * Identifier for the directory consumer account with whom the directory is to be shared. See below.
     * 
     */
    @Import(name="target")
    private @Nullable Output<SharedDirectoryTargetArgs> target;

    /**
     * @return Identifier for the directory consumer account with whom the directory is to be shared. See below.
     * 
     */
    public Optional<Output<SharedDirectoryTargetArgs>> target() {
        return Optional.ofNullable(this.target);
    }

    private SharedDirectoryState() {}

    private SharedDirectoryState(SharedDirectoryState $) {
        this.directoryId = $.directoryId;
        this.method = $.method;
        this.notes = $.notes;
        this.sharedDirectoryId = $.sharedDirectoryId;
        this.target = $.target;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedDirectoryState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedDirectoryState $;

        public Builder() {
            $ = new SharedDirectoryState();
        }

        public Builder(SharedDirectoryState defaults) {
            $ = new SharedDirectoryState(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryId Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(@Nullable Output<String> directoryId) {
            $.directoryId = directoryId;
            return this;
        }

        /**
         * @param directoryId Identifier of the Managed Microsoft AD directory that you want to share with other accounts.
         * 
         * @return builder
         * 
         */
        public Builder directoryId(String directoryId) {
            return directoryId(Output.of(directoryId));
        }

        /**
         * @param method Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
         * 
         * @return builder
         * 
         */
        public Builder method(@Nullable Output<String> method) {
            $.method = method;
            return this;
        }

        /**
         * @param method Method used when sharing a directory. Valid values are `ORGANIZATIONS` and `HANDSHAKE`. Default is `HANDSHAKE`.
         * 
         * @return builder
         * 
         */
        public Builder method(String method) {
            return method(Output.of(method));
        }

        /**
         * @param notes Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
         * 
         * @return builder
         * 
         */
        public Builder notes(@Nullable Output<String> notes) {
            $.notes = notes;
            return this;
        }

        /**
         * @param notes Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
         * 
         * @return builder
         * 
         */
        public Builder notes(String notes) {
            return notes(Output.of(notes));
        }

        /**
         * @param sharedDirectoryId Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
         * 
         * @return builder
         * 
         */
        public Builder sharedDirectoryId(@Nullable Output<String> sharedDirectoryId) {
            $.sharedDirectoryId = sharedDirectoryId;
            return this;
        }

        /**
         * @param sharedDirectoryId Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
         * 
         * @return builder
         * 
         */
        public Builder sharedDirectoryId(String sharedDirectoryId) {
            return sharedDirectoryId(Output.of(sharedDirectoryId));
        }

        /**
         * @param target Identifier for the directory consumer account with whom the directory is to be shared. See below.
         * 
         * @return builder
         * 
         */
        public Builder target(@Nullable Output<SharedDirectoryTargetArgs> target) {
            $.target = target;
            return this;
        }

        /**
         * @param target Identifier for the directory consumer account with whom the directory is to be shared. See below.
         * 
         * @return builder
         * 
         */
        public Builder target(SharedDirectoryTargetArgs target) {
            return target(Output.of(target));
        }

        public SharedDirectoryState build() {
            return $;
        }
    }

}