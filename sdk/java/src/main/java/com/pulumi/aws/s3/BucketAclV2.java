// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketAclV2Args;
import com.pulumi.aws.s3.inputs.BucketAclV2State;
import com.pulumi.aws.s3.outputs.BucketAclV2AccessControlPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### With ACL
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
 *         var example = new BucketV2(&#34;example&#34;);
 * 
 *         var exampleBucketAcl = new BucketAclV2(&#34;exampleBucketAcl&#34;, BucketAclV2Args.builder()        
 *             .bucket(example.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### With Grants
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
 *         final var current = Output.of(S3Functions.getCanonicalUserId());
 * 
 *         var exampleBucketV2 = new BucketV2(&#34;exampleBucketV2&#34;);
 * 
 *         var exampleBucketAclV2 = new BucketAclV2(&#34;exampleBucketAclV2&#34;, BucketAclV2Args.builder()        
 *             .bucket(exampleBucketV2.id())
 *             .accessControlPolicy(BucketAclV2AccessControlPolicyArgs.builder()
 *                 .grants(                
 *                     BucketAclV2AccessControlPolicyGrantArgs.builder()
 *                         .grantee(BucketAclV2AccessControlPolicyGrantGranteeArgs.builder()
 *                             .id(current.apply(getCanonicalUserIdResult -&gt; getCanonicalUserIdResult.id()))
 *                             .type(&#34;CanonicalUser&#34;)
 *                             .build())
 *                         .permission(&#34;READ&#34;)
 *                         .build(),
 *                     BucketAclV2AccessControlPolicyGrantArgs.builder()
 *                         .grantee(BucketAclV2AccessControlPolicyGrantGranteeArgs.builder()
 *                             .type(&#34;Group&#34;)
 *                             .uri(&#34;http://acs.amazonaws.com/groups/s3/LogDelivery&#34;)
 *                             .build())
 *                         .permission(&#34;READ_ACP&#34;)
 *                         .build())
 *                 .owner(BucketAclV2AccessControlPolicyOwnerArgs.builder()
 *                     .id(current.apply(getCanonicalUserIdResult -&gt; getCanonicalUserIdResult.id()))
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
 * S3 bucket ACL can be imported in one of four ways. If the owner (account ID) of the source bucket is the _same_ account used to configure the Terraform AWS Provider, and the source bucket is **not configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket` e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name
 * ```
 * 
 *  If the owner (account ID) of the source bucket is the _same_ account used to configure the Terraform AWS Provider, and the source bucket is **configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket` and `acl` separated by a comma (`,`), e.g.
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,private
 * ```
 * 
 *  If the owner (account ID) of the source bucket _differs_ from the account used to configure the Terraform AWS Provider, and the source bucket is **not configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket` and `expected_bucket_owner` separated by a comma (`,`) e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012
 * ```
 * 
 *  If the owner (account ID) of the source bucket _differs_ from the account used to configure the Terraform AWS Provider, and the source bucket is **configured** with a [canned ACL][1] (i.e. predefined grant), the S3 bucket ACL resource should be imported using the `bucket`, `expected_bucket_owner`, and `acl` separated by commas (`,`), e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:s3/bucketAclV2:BucketAclV2 example bucket-name,123456789012,private
 * ```
 * 
 *  [1]https://docs.aws.amazon.com/AmazonS3/latest/userguide/acl-overview.html#canned-acl
 * 
 */
@ResourceType(type="aws:s3/bucketAclV2:BucketAclV2")
public class BucketAclV2 extends com.pulumi.resources.CustomResource {
    /**
     * A configuration block that sets the ACL permissions for an object per grantee documented below.
     * 
     */
    @Export(name="accessControlPolicy", type=BucketAclV2AccessControlPolicy.class, parameters={})
    private Output<BucketAclV2AccessControlPolicy> accessControlPolicy;

    /**
     * @return A configuration block that sets the ACL permissions for an object per grantee documented below.
     * 
     */
    public Output<BucketAclV2AccessControlPolicy> accessControlPolicy() {
        return this.accessControlPolicy;
    }
    /**
     * The canned ACL to apply to the bucket.
     * 
     */
    @Export(name="acl", type=String.class, parameters={})
    private Output</* @Nullable */ String> acl;

    /**
     * @return The canned ACL to apply to the bucket.
     * 
     */
    public Output<Optional<String>> acl() {
        return Codegen.optional(this.acl);
    }
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * The account ID of the expected bucket owner.
     * 
     */
    @Export(name="expectedBucketOwner", type=String.class, parameters={})
    private Output</* @Nullable */ String> expectedBucketOwner;

    /**
     * @return The account ID of the expected bucket owner.
     * 
     */
    public Output<Optional<String>> expectedBucketOwner() {
        return Codegen.optional(this.expectedBucketOwner);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketAclV2(String name) {
        this(name, BucketAclV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketAclV2(String name, BucketAclV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketAclV2(String name, BucketAclV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketAclV2:BucketAclV2", name, args == null ? BucketAclV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketAclV2(String name, Output<String> id, @Nullable BucketAclV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketAclV2:BucketAclV2", name, state, makeResourceOptions(options, id));
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
    public static BucketAclV2 get(String name, Output<String> id, @Nullable BucketAclV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketAclV2(name, id, state, options);
    }
}