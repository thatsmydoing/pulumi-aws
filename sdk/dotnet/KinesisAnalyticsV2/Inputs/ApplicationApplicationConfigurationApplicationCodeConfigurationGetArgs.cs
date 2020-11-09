// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.KinesisAnalyticsV2.Inputs
{

    public sealed class ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The location and type of the application code.
        /// </summary>
        [Input("codeContent")]
        public Input<Inputs.ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentGetArgs>? CodeContent { get; set; }

        /// <summary>
        /// Specifies whether the code content is in text or zip format. Valid values: `PLAINTEXT`, `ZIPFILE`.
        /// </summary>
        [Input("codeContentType", required: true)]
        public Input<string> CodeContentType { get; set; } = null!;

        public ApplicationApplicationConfigurationApplicationCodeConfigurationGetArgs()
        {
        }
    }
}