// *** WARNING: this file was generated by the Lumi Terraform Bridge (TFGEN) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as lumi from "@lumi/lumi";
import * as lumirt from "@lumi/lumirt";

export class Project extends lumi.NamedResource implements ProjectArgs {
    public /*out*/ readonly arn: string;
    public readonly projectName?: string;

    constructor(name: string, args: ProjectArgs) {
        super(name);
        this.projectName = args.projectName;
    }
}

export interface ProjectArgs {
    readonly projectName?: string;
}
