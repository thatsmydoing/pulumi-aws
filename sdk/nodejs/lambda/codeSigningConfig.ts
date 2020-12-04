// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Lambda Code Signing Config resource. A code signing configuration defines a list of allowed signing profiles and defines the code-signing validation policy (action to be taken if deployment validation checks fail).
 *
 * For information about Lambda code signing configurations and how to use them, see [configuring code signing for Lambda functions](https://docs.aws.amazon.com/lambda/latest/dg/configuration-codesigning.html)
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const newCsc = new aws.lambda.CodeSigningConfig("newCsc", {
 *     allowedPublishers: {
 *         signingProfileVersionArns: [
 *             aws_signer_signing_profile.example1.arn,
 *             aws_signer_signing_profile.example2.arn,
 *         ],
 *     },
 *     policies: {
 *         untrustedArtifactOnDeployment: "Warn",
 *     },
 *     description: "My awesome code signing config.",
 * });
 * ```
 *
 * ## Import
 *
 * Code Signing Configs can be imported using their ARN, e.g.
 *
 * ```sh
 *  $ pulumi import aws:lambda/codeSigningConfig:CodeSigningConfig imported_csc arn:aws:lambda:us-west-2:123456789012:code-signing-config:csc-0f6c334abcdea4d8b
 * ```
 */
export class CodeSigningConfig extends pulumi.CustomResource {
    /**
     * Get an existing CodeSigningConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CodeSigningConfigState, opts?: pulumi.CustomResourceOptions): CodeSigningConfig {
        return new CodeSigningConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:lambda/codeSigningConfig:CodeSigningConfig';

    /**
     * Returns true if the given object is an instance of CodeSigningConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CodeSigningConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CodeSigningConfig.__pulumiType;
    }

    /**
     * A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
     */
    public readonly allowedPublishers!: pulumi.Output<outputs.lambda.CodeSigningConfigAllowedPublishers>;
    /**
     * The Amazon Resource Name (ARN) of the code signing configuration.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Unique identifier for the code signing configuration.
     */
    public /*out*/ readonly configId!: pulumi.Output<string>;
    /**
     * Descriptive name for this code signing configuration.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The date and time that the code signing configuration was last modified.
     */
    public /*out*/ readonly lastModified!: pulumi.Output<string>;
    /**
     * A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
     */
    public readonly policies!: pulumi.Output<outputs.lambda.CodeSigningConfigPolicies>;

    /**
     * Create a CodeSigningConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CodeSigningConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CodeSigningConfigArgs | CodeSigningConfigState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as CodeSigningConfigState | undefined;
            inputs["allowedPublishers"] = state ? state.allowedPublishers : undefined;
            inputs["arn"] = state ? state.arn : undefined;
            inputs["configId"] = state ? state.configId : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["lastModified"] = state ? state.lastModified : undefined;
            inputs["policies"] = state ? state.policies : undefined;
        } else {
            const args = argsOrState as CodeSigningConfigArgs | undefined;
            if ((!args || args.allowedPublishers === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'allowedPublishers'");
            }
            inputs["allowedPublishers"] = args ? args.allowedPublishers : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["policies"] = args ? args.policies : undefined;
            inputs["arn"] = undefined /*out*/;
            inputs["configId"] = undefined /*out*/;
            inputs["lastModified"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(CodeSigningConfig.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CodeSigningConfig resources.
 */
export interface CodeSigningConfigState {
    /**
     * A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
     */
    readonly allowedPublishers?: pulumi.Input<inputs.lambda.CodeSigningConfigAllowedPublishers>;
    /**
     * The Amazon Resource Name (ARN) of the code signing configuration.
     */
    readonly arn?: pulumi.Input<string>;
    /**
     * Unique identifier for the code signing configuration.
     */
    readonly configId?: pulumi.Input<string>;
    /**
     * Descriptive name for this code signing configuration.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The date and time that the code signing configuration was last modified.
     */
    readonly lastModified?: pulumi.Input<string>;
    /**
     * A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
     */
    readonly policies?: pulumi.Input<inputs.lambda.CodeSigningConfigPolicies>;
}

/**
 * The set of arguments for constructing a CodeSigningConfig resource.
 */
export interface CodeSigningConfigArgs {
    /**
     * A configuration block of allowed publishers as signing profiles for this code signing configuration. Detailed below.
     */
    readonly allowedPublishers: pulumi.Input<inputs.lambda.CodeSigningConfigAllowedPublishers>;
    /**
     * Descriptive name for this code signing configuration.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * A configuration block of code signing policies that define the actions to take if the validation checks fail. Detailed below.
     */
    readonly policies?: pulumi.Input<inputs.lambda.CodeSigningConfigPolicies>;
}