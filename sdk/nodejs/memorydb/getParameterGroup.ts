// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides information about a MemoryDB Parameter Group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = pulumi.output(aws.memorydb.getParameterGroup({
 *     name: "my-parameter-group",
 * }));
 * ```
 */
export function getParameterGroup(args: GetParameterGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetParameterGroupResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("aws:memorydb/getParameterGroup:getParameterGroup", {
        "name": args.name,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getParameterGroup.
 */
export interface GetParameterGroupArgs {
    /**
     * Name of the parameter group.
     */
    name: string;
    /**
     * A map of tags assigned to the parameter group.
     */
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getParameterGroup.
 */
export interface GetParameterGroupResult {
    /**
     * ARN of the parameter group.
     */
    readonly arn: string;
    /**
     * Description of the parameter group.
     */
    readonly description: string;
    /**
     * The engine version that the parameter group can be used with.
     */
    readonly family: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Name of the parameter.
     */
    readonly name: string;
    /**
     * Set of user-defined MemoryDB parameters applied by the parameter group.
     */
    readonly parameters: outputs.memorydb.GetParameterGroupParameter[];
    /**
     * A map of tags assigned to the parameter group.
     */
    readonly tags: {[key: string]: string};
}

export function getParameterGroupOutput(args: GetParameterGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetParameterGroupResult> {
    return pulumi.output(args).apply(a => getParameterGroup(a, opts))
}

/**
 * A collection of arguments for invoking getParameterGroup.
 */
export interface GetParameterGroupOutputArgs {
    /**
     * Name of the parameter group.
     */
    name: pulumi.Input<string>;
    /**
     * A map of tags assigned to the parameter group.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}