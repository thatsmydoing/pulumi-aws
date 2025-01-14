// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Efs.Outputs
{

    [OutputType]
    public sealed class FileSystemLifecyclePolicy
    {
        /// <summary>
        /// Indicates how long it takes to transition files to the IA storage class. Valid values: `AFTER_1_DAY`, `AFTER_7_DAYS`, `AFTER_14_DAYS`, `AFTER_30_DAYS`, `AFTER_60_DAYS`, or `AFTER_90_DAYS`.
        /// </summary>
        public readonly string? TransitionToIa;
        /// <summary>
        /// Describes the policy used to transition a file from infequent access storage to primary storage. Valid values: `AFTER_1_ACCESS`.
        /// </summary>
        public readonly string? TransitionToPrimaryStorageClass;

        [OutputConstructor]
        private FileSystemLifecyclePolicy(
            string? transitionToIa,

            string? transitionToPrimaryStorageClass)
        {
            TransitionToIa = transitionToIa;
            TransitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
        }
    }
}
