// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream;

import com.pulumi.aws.appstream.inputs.DirectoryConfigServiceAccountCredentialsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DirectoryConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final DirectoryConfigArgs Empty = new DirectoryConfigArgs();

    /**
     * Fully qualified name of the directory.
     * 
     */
    @Import(name="directoryName", required=true)
    private Output<String> directoryName;

    /**
     * @return Fully qualified name of the directory.
     * 
     */
    public Output<String> directoryName() {
        return this.directoryName;
    }

    /**
     * Distinguished names of the organizational units for computer accounts.
     * 
     */
    @Import(name="organizationalUnitDistinguishedNames", required=true)
    private Output<List<String>> organizationalUnitDistinguishedNames;

    /**
     * @return Distinguished names of the organizational units for computer accounts.
     * 
     */
    public Output<List<String>> organizationalUnitDistinguishedNames() {
        return this.organizationalUnitDistinguishedNames;
    }

    /**
     * Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `service_account_credentials` below.
     * 
     */
    @Import(name="serviceAccountCredentials", required=true)
    private Output<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials;

    /**
     * @return Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `service_account_credentials` below.
     * 
     */
    public Output<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials() {
        return this.serviceAccountCredentials;
    }

    private DirectoryConfigArgs() {}

    private DirectoryConfigArgs(DirectoryConfigArgs $) {
        this.directoryName = $.directoryName;
        this.organizationalUnitDistinguishedNames = $.organizationalUnitDistinguishedNames;
        this.serviceAccountCredentials = $.serviceAccountCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DirectoryConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DirectoryConfigArgs $;

        public Builder() {
            $ = new DirectoryConfigArgs();
        }

        public Builder(DirectoryConfigArgs defaults) {
            $ = new DirectoryConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param directoryName Fully qualified name of the directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryName(Output<String> directoryName) {
            $.directoryName = directoryName;
            return this;
        }

        /**
         * @param directoryName Fully qualified name of the directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryName(String directoryName) {
            return directoryName(Output.of(directoryName));
        }

        /**
         * @param organizationalUnitDistinguishedNames Distinguished names of the organizational units for computer accounts.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnitDistinguishedNames(Output<List<String>> organizationalUnitDistinguishedNames) {
            $.organizationalUnitDistinguishedNames = organizationalUnitDistinguishedNames;
            return this;
        }

        /**
         * @param organizationalUnitDistinguishedNames Distinguished names of the organizational units for computer accounts.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnitDistinguishedNames(List<String> organizationalUnitDistinguishedNames) {
            return organizationalUnitDistinguishedNames(Output.of(organizationalUnitDistinguishedNames));
        }

        /**
         * @param organizationalUnitDistinguishedNames Distinguished names of the organizational units for computer accounts.
         * 
         * @return builder
         * 
         */
        public Builder organizationalUnitDistinguishedNames(String... organizationalUnitDistinguishedNames) {
            return organizationalUnitDistinguishedNames(List.of(organizationalUnitDistinguishedNames));
        }

        /**
         * @param serviceAccountCredentials Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `service_account_credentials` below.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountCredentials(Output<DirectoryConfigServiceAccountCredentialsArgs> serviceAccountCredentials) {
            $.serviceAccountCredentials = serviceAccountCredentials;
            return this;
        }

        /**
         * @param serviceAccountCredentials Configuration block for the name of the directory and organizational unit (OU) to use to join the directory config to a Microsoft Active Directory domain. See `service_account_credentials` below.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountCredentials(DirectoryConfigServiceAccountCredentialsArgs serviceAccountCredentials) {
            return serviceAccountCredentials(Output.of(serviceAccountCredentials));
        }

        public DirectoryConfigArgs build() {
            $.directoryName = Objects.requireNonNull($.directoryName, "expected parameter 'directoryName' to be non-null");
            $.organizationalUnitDistinguishedNames = Objects.requireNonNull($.organizationalUnitDistinguishedNames, "expected parameter 'organizationalUnitDistinguishedNames' to be non-null");
            $.serviceAccountCredentials = Objects.requireNonNull($.serviceAccountCredentials, "expected parameter 'serviceAccountCredentials' to be non-null");
            return $;
        }
    }

}