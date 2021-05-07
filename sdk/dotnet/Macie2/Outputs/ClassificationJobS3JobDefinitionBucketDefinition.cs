// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Macie2.Outputs
{

    [OutputType]
    public sealed class ClassificationJobS3JobDefinitionBucketDefinition
    {
        /// <summary>
        /// The unique identifier for the AWS account that owns the buckets.
        /// </summary>
        public readonly string AccountId;
        /// <summary>
        /// An array that lists the names of the buckets.
        /// </summary>
        public readonly ImmutableArray<string> Buckets;

        [OutputConstructor]
        private ClassificationJobS3JobDefinitionBucketDefinition(
            string accountId,

            ImmutableArray<string> buckets)
        {
            AccountId = accountId;
            Buckets = buckets;
        }
    }
}