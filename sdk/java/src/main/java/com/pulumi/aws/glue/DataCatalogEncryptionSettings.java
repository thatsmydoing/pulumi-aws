// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.glue.DataCatalogEncryptionSettingsArgs;
import com.pulumi.aws.glue.inputs.DataCatalogEncryptionSettingsState;
import com.pulumi.aws.glue.outputs.DataCatalogEncryptionSettingsDataCatalogEncryptionSettings;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Glue Data Catalog Encryption Settings resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new DataCatalogEncryptionSettings(&#34;example&#34;, DataCatalogEncryptionSettingsArgs.builder()        
 *             .dataCatalogEncryptionSettings(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsArgs.builder()
 *                 .connectionPasswordEncryption(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionArgs.builder()
 *                     .awsKmsKeyId(aws_kms_key.test().arn())
 *                     .returnConnectionPasswordEncrypted(true)
 *                     .build())
 *                 .encryptionAtRest(DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestArgs.builder()
 *                     .catalogEncryptionMode(&#34;SSE-KMS&#34;)
 *                     .sseAwsKmsKeyId(aws_kms_key.test().arn())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Glue Data Catalog Encryption Settings can be imported using `CATALOG-ID` (AWS account ID if not custom), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings example 123456789012
 * ```
 * 
 */
@ResourceType(type="aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings")
public class DataCatalogEncryptionSettings extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
     * 
     */
    @Export(name="catalogId", type=String.class, parameters={})
    private Output<String> catalogId;

    /**
     * @return The ID of the Data Catalog to set the security configuration for. If none is provided, the AWS account ID is used by default.
     * 
     */
    public Output<String> catalogId() {
        return this.catalogId;
    }
    /**
     * The security configuration to set. see Data Catalog Encryption Settings.
     * 
     */
    @Export(name="dataCatalogEncryptionSettings", type=DataCatalogEncryptionSettingsDataCatalogEncryptionSettings.class, parameters={})
    private Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettings> dataCatalogEncryptionSettings;

    /**
     * @return The security configuration to set. see Data Catalog Encryption Settings.
     * 
     */
    public Output<DataCatalogEncryptionSettingsDataCatalogEncryptionSettings> dataCatalogEncryptionSettings() {
        return this.dataCatalogEncryptionSettings;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataCatalogEncryptionSettings(String name) {
        this(name, DataCatalogEncryptionSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataCatalogEncryptionSettings(String name, DataCatalogEncryptionSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataCatalogEncryptionSettings(String name, DataCatalogEncryptionSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings", name, args == null ? DataCatalogEncryptionSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataCatalogEncryptionSettings(String name, Output<String> id, @Nullable DataCatalogEncryptionSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/dataCatalogEncryptionSettings:DataCatalogEncryptionSettings", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DataCatalogEncryptionSettings get(String name, Output<String> id, @Nullable DataCatalogEncryptionSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataCatalogEncryptionSettings(name, id, state, options);
    }
}