// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppRunner.Inputs
{

    public sealed class ServiceNetworkConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Network configuration settings for outbound message traffic. See Egress Configuration below for more details.
        /// </summary>
        [Input("egressConfiguration")]
        public Input<Inputs.ServiceNetworkConfigurationEgressConfigurationArgs>? EgressConfiguration { get; set; }

        /// <summary>
        /// Network configuration settings for inbound network traffic. See Ingress Configuration below for more details.
        /// </summary>
        [Input("ingressConfiguration")]
        public Input<Inputs.ServiceNetworkConfigurationIngressConfigurationArgs>? IngressConfiguration { get; set; }

        public ServiceNetworkConfigurationArgs()
        {
        }
        public static new ServiceNetworkConfigurationArgs Empty => new ServiceNetworkConfigurationArgs();
    }
}
