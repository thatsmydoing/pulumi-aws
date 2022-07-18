// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lakeformation.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPermissionsTable {
    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final String catalogId;
    /**
     * @return Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    private final String databaseName;
    /**
     * @return Name of the table resource.
     * 
     */
    private final String name;
    /**
     * @return Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
     */
    private final @Nullable Boolean wildcard;

    @CustomType.Constructor
    private GetPermissionsTable(
        @CustomType.Parameter("catalogId") String catalogId,
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("wildcard") @Nullable Boolean wildcard) {
        this.catalogId = catalogId;
        this.databaseName = databaseName;
        this.name = name;
        this.wildcard = wildcard;
    }

    /**
     * @return Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public String catalogId() {
        return this.catalogId;
    }
    /**
     * @return Name of the database for the table with columns resource. Unique to the Data Catalog.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return Name of the table resource.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Whether to use a wildcard representing every table under a database. At least one of `name` or `wildcard` is required. Defaults to `false`.
     * 
     */
    public Optional<Boolean> wildcard() {
        return Optional.ofNullable(this.wildcard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private String databaseName;
        private String name;
        private @Nullable Boolean wildcard;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionsTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.databaseName = defaults.databaseName;
    	      this.name = defaults.name;
    	      this.wildcard = defaults.wildcard;
        }

        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder wildcard(@Nullable Boolean wildcard) {
            this.wildcard = wildcard;
            return this;
        }        public GetPermissionsTable build() {
            return new GetPermissionsTable(catalogId, databaseName, name, wildcard);
        }
    }
}