// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kms.AliasArgs;
import com.pulumi.aws.kms.inputs.AliasState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an alias for a KMS customer master key. AWS Console enforces 1-to-1 mapping between aliases &amp; keys,
 * but API (hence this provider too) allows you to create as many aliases as
 * the [account limits](http://docs.aws.amazon.com/kms/latest/developerguide/limits.html) allow you.
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
 *         var key = new Key(&#34;key&#34;);
 * 
 *         var alias = new Alias(&#34;alias&#34;, AliasArgs.builder()        
 *             .targetKeyId(key.keyId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * KMS aliases can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:kms/alias:Alias a alias/my-key-alias
 * ```
 * 
 */
@ResourceType(type="aws:kms/alias:Alias")
public class Alias extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the key alias.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the key alias.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The display name of the alias. The name must start with the word &#34;alias&#34; followed by a forward slash (alias/)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The display name of the alias. The name must start with the word &#34;alias&#34; followed by a forward slash (alias/)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Creates an unique alias beginning with the specified prefix.
     * The name must start with the word &#34;alias&#34; followed by a forward slash (alias/).  Conflicts with `name`.
     * 
     */
    @Export(name="namePrefix", type=String.class, parameters={})
    private Output<String> namePrefix;

    /**
     * @return Creates an unique alias beginning with the specified prefix.
     * The name must start with the word &#34;alias&#34; followed by a forward slash (alias/).  Conflicts with `name`.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }
    /**
     * The Amazon Resource Name (ARN) of the target key identifier.
     * 
     */
    @Export(name="targetKeyArn", type=String.class, parameters={})
    private Output<String> targetKeyArn;

    /**
     * @return The Amazon Resource Name (ARN) of the target key identifier.
     * 
     */
    public Output<String> targetKeyArn() {
        return this.targetKeyArn;
    }
    /**
     * Identifier for the key for which the alias is for, can be either an ARN or key_id.
     * 
     */
    @Export(name="targetKeyId", type=String.class, parameters={})
    private Output<String> targetKeyId;

    /**
     * @return Identifier for the key for which the alias is for, can be either an ARN or key_id.
     * 
     */
    public Output<String> targetKeyId() {
        return this.targetKeyId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Alias(String name) {
        this(name, AliasArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Alias(String name, AliasArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Alias(String name, AliasArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/alias:Alias", name, args == null ? AliasArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Alias(String name, Output<String> id, @Nullable AliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/alias:Alias", name, state, makeResourceOptions(options, id));
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
    public static Alias get(String name, Output<String> id, @Nullable AliasState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Alias(name, id, state, options);
    }
}