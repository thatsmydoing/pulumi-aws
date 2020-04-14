// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Outputs
{

    [OutputType]
    public sealed class VpnConnectionVgwTelemetry
    {
        public readonly int? AcceptedRouteCount;
        public readonly string? LastStatusChange;
        public readonly string? OutsideIpAddress;
        public readonly string? Status;
        public readonly string? StatusMessage;

        [OutputConstructor]
        private VpnConnectionVgwTelemetry(
            int? acceptedRouteCount,

            string? lastStatusChange,

            string? outsideIpAddress,

            string? status,

            string? statusMessage)
        {
            AcceptedRouteCount = acceptedRouteCount;
            LastStatusChange = lastStatusChange;
            OutsideIpAddress = outsideIpAddress;
            Status = status;
            StatusMessage = statusMessage;
        }
    }
}