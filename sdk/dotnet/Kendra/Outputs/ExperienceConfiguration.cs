// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Kendra.Outputs
{

    [OutputType]
    public sealed class ExperienceConfiguration
    {
        public readonly Outputs.ExperienceConfigurationContentSourceConfiguration? ContentSourceConfiguration;
        /// <summary>
        /// The AWS SSO field name that contains the identifiers of your users, such as their emails. Detailed below.
        /// </summary>
        public readonly Outputs.ExperienceConfigurationUserIdentityConfiguration? UserIdentityConfiguration;

        [OutputConstructor]
        private ExperienceConfiguration(
            Outputs.ExperienceConfigurationContentSourceConfiguration? contentSourceConfiguration,

            Outputs.ExperienceConfigurationUserIdentityConfiguration? userIdentityConfiguration)
        {
            ContentSourceConfiguration = contentSourceConfiguration;
            UserIdentityConfiguration = userIdentityConfiguration;
        }
    }
}