// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Inputs
{

    public sealed class PipeSourceParametersArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The collection of event patterns used to filter events. Detailed below.
        /// </summary>
        [Input("filterCriteria")]
        public Input<Inputs.PipeSourceParametersFilterCriteriaArgs>? FilterCriteria { get; set; }

        public PipeSourceParametersArgs()
        {
        }
        public static new PipeSourceParametersArgs Empty => new PipeSourceParametersArgs();
    }
}
