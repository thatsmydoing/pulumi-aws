// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class DistributionOriginOriginShieldGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// A flag that specifies whether Origin Shield is enabled.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        /// <summary>
        /// The AWS Region for Origin Shield. To specify a region, use the region code, not the region name. For example, specify the US East (Ohio) region as us-east-2.
        /// </summary>
        [Input("originShieldRegion", required: true)]
        public Input<string> OriginShieldRegion { get; set; } = null!;

        public DistributionOriginOriginShieldGetArgs()
        {
        }
    }
}