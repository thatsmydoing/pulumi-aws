// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Manages a Service Catalog Constraint.
 *
 * > **NOTE:** This resource does not associate a Service Catalog product and portfolio. However, the product and portfolio must be associated (see the `aws.servicecatalog.ProductPortfolioAssociation` resource) prior to creating a constraint or you will receive an error.
 *
 * ## Example Usage
 * ### Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.servicecatalog.Constraint("example", {
 *     description: "Back off, man. I'm a scientist.",
 *     portfolioId: aws_servicecatalog_portfolio.example.id,
 *     productId: aws_servicecatalog_product.example.id,
 *     type: "LAUNCH",
 *     parameters: JSON.stringify({
 *         RoleArn: "arn:aws:iam::123456789012:role/LaunchRole",
 *     }),
 * });
 * ```
 *
 * ## Import
 *
 * `aws_servicecatalog_constraint` can be imported using the constraint ID, e.g.
 *
 * ```sh
 *  $ pulumi import aws:servicecatalog/constraint:Constraint example cons-nmdkb6cgxfcrs
 * ```
 */
export class Constraint extends pulumi.CustomResource {
    /**
     * Get an existing Constraint resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConstraintState, opts?: pulumi.CustomResourceOptions): Constraint {
        return new Constraint(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:servicecatalog/constraint:Constraint';

    /**
     * Returns true if the given object is an instance of Constraint.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Constraint {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Constraint.__pulumiType;
    }

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     */
    public readonly acceptLanguage!: pulumi.Output<string | undefined>;
    /**
     * Description of the constraint.
     */
    public readonly description!: pulumi.Output<string>;
    /**
     * Owner of the constraint.
     */
    public /*out*/ readonly owner!: pulumi.Output<string>;
    /**
     * Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     */
    public readonly parameters!: pulumi.Output<string>;
    /**
     * Portfolio identifier.
     */
    public readonly portfolioId!: pulumi.Output<string>;
    /**
     * Product identifier.
     */
    public readonly productId!: pulumi.Output<string>;
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a Constraint resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConstraintArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ConstraintArgs | ConstraintState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ConstraintState | undefined;
            inputs["acceptLanguage"] = state ? state.acceptLanguage : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["owner"] = state ? state.owner : undefined;
            inputs["parameters"] = state ? state.parameters : undefined;
            inputs["portfolioId"] = state ? state.portfolioId : undefined;
            inputs["productId"] = state ? state.productId : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ConstraintArgs | undefined;
            if ((!args || args.parameters === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parameters'");
            }
            if ((!args || args.portfolioId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'portfolioId'");
            }
            if ((!args || args.productId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'productId'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            inputs["acceptLanguage"] = args ? args.acceptLanguage : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["parameters"] = args ? args.parameters : undefined;
            inputs["portfolioId"] = args ? args.portfolioId : undefined;
            inputs["productId"] = args ? args.productId : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["owner"] = undefined /*out*/;
            inputs["status"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(Constraint.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Constraint resources.
 */
export interface ConstraintState {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     */
    acceptLanguage?: pulumi.Input<string>;
    /**
     * Description of the constraint.
     */
    description?: pulumi.Input<string>;
    /**
     * Owner of the constraint.
     */
    owner?: pulumi.Input<string>;
    /**
     * Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     */
    parameters?: pulumi.Input<string>;
    /**
     * Portfolio identifier.
     */
    portfolioId?: pulumi.Input<string>;
    /**
     * Product identifier.
     */
    productId?: pulumi.Input<string>;
    status?: pulumi.Input<string>;
    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Constraint resource.
 */
export interface ConstraintArgs {
    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     */
    acceptLanguage?: pulumi.Input<string>;
    /**
     * Description of the constraint.
     */
    description?: pulumi.Input<string>;
    /**
     * Constraint parameters in JSON format. The syntax depends on the constraint type. See details below.
     */
    parameters: pulumi.Input<string>;
    /**
     * Portfolio identifier.
     */
    portfolioId: pulumi.Input<string>;
    /**
     * Product identifier.
     */
    productId: pulumi.Input<string>;
    /**
     * Type of constraint. Valid values are `LAUNCH`, `NOTIFICATION`, `RESOURCE_UPDATE`, `STACKSET`, and `TEMPLATE`.
     */
    type: pulumi.Input<string>;
}