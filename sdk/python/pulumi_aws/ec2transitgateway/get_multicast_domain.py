# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = [
    'GetMulticastDomainResult',
    'AwaitableGetMulticastDomainResult',
    'get_multicast_domain',
    'get_multicast_domain_output',
]

@pulumi.output_type
class GetMulticastDomainResult:
    """
    A collection of values returned by getMulticastDomain.
    """
    def __init__(__self__, arn=None, associations=None, auto_accept_shared_associations=None, filters=None, id=None, igmpv2_support=None, members=None, owner_id=None, sources=None, state=None, static_sources_support=None, tags=None, transit_gateway_attachment_id=None, transit_gateway_id=None, transit_gateway_multicast_domain_id=None):
        if arn and not isinstance(arn, str):
            raise TypeError("Expected argument 'arn' to be a str")
        pulumi.set(__self__, "arn", arn)
        if associations and not isinstance(associations, list):
            raise TypeError("Expected argument 'associations' to be a list")
        pulumi.set(__self__, "associations", associations)
        if auto_accept_shared_associations and not isinstance(auto_accept_shared_associations, str):
            raise TypeError("Expected argument 'auto_accept_shared_associations' to be a str")
        pulumi.set(__self__, "auto_accept_shared_associations", auto_accept_shared_associations)
        if filters and not isinstance(filters, list):
            raise TypeError("Expected argument 'filters' to be a list")
        pulumi.set(__self__, "filters", filters)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if igmpv2_support and not isinstance(igmpv2_support, str):
            raise TypeError("Expected argument 'igmpv2_support' to be a str")
        pulumi.set(__self__, "igmpv2_support", igmpv2_support)
        if members and not isinstance(members, list):
            raise TypeError("Expected argument 'members' to be a list")
        pulumi.set(__self__, "members", members)
        if owner_id and not isinstance(owner_id, str):
            raise TypeError("Expected argument 'owner_id' to be a str")
        pulumi.set(__self__, "owner_id", owner_id)
        if sources and not isinstance(sources, list):
            raise TypeError("Expected argument 'sources' to be a list")
        pulumi.set(__self__, "sources", sources)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if static_sources_support and not isinstance(static_sources_support, str):
            raise TypeError("Expected argument 'static_sources_support' to be a str")
        pulumi.set(__self__, "static_sources_support", static_sources_support)
        if tags and not isinstance(tags, dict):
            raise TypeError("Expected argument 'tags' to be a dict")
        pulumi.set(__self__, "tags", tags)
        if transit_gateway_attachment_id and not isinstance(transit_gateway_attachment_id, str):
            raise TypeError("Expected argument 'transit_gateway_attachment_id' to be a str")
        pulumi.set(__self__, "transit_gateway_attachment_id", transit_gateway_attachment_id)
        if transit_gateway_id and not isinstance(transit_gateway_id, str):
            raise TypeError("Expected argument 'transit_gateway_id' to be a str")
        pulumi.set(__self__, "transit_gateway_id", transit_gateway_id)
        if transit_gateway_multicast_domain_id and not isinstance(transit_gateway_multicast_domain_id, str):
            raise TypeError("Expected argument 'transit_gateway_multicast_domain_id' to be a str")
        pulumi.set(__self__, "transit_gateway_multicast_domain_id", transit_gateway_multicast_domain_id)

    @property
    @pulumi.getter
    def arn(self) -> str:
        """
        EC2 Transit Gateway Multicast Domain Amazon Resource Name (ARN).
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def associations(self) -> Sequence['outputs.GetMulticastDomainAssociationResult']:
        """
        EC2 Transit Gateway Multicast Domain Associations
        """
        return pulumi.get(self, "associations")

    @property
    @pulumi.getter(name="autoAcceptSharedAssociations")
    def auto_accept_shared_associations(self) -> str:
        """
        Whether to automatically accept cross-account subnet associations that are associated with the EC2 Transit Gateway Multicast Domain.
        """
        return pulumi.get(self, "auto_accept_shared_associations")

    @property
    @pulumi.getter
    def filters(self) -> Optional[Sequence['outputs.GetMulticastDomainFilterResult']]:
        return pulumi.get(self, "filters")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="igmpv2Support")
    def igmpv2_support(self) -> str:
        """
        Whether to enable Internet Group Management Protocol (IGMP) version 2 for the EC2 Transit Gateway Multicast Domain.
        """
        return pulumi.get(self, "igmpv2_support")

    @property
    @pulumi.getter
    def members(self) -> Sequence['outputs.GetMulticastDomainMemberResult']:
        """
        EC2 Multicast Domain Group Members
        """
        return pulumi.get(self, "members")

    @property
    @pulumi.getter(name="ownerId")
    def owner_id(self) -> str:
        """
        Identifier of the AWS account that owns the EC2 Transit Gateway Multicast Domain.
        """
        return pulumi.get(self, "owner_id")

    @property
    @pulumi.getter
    def sources(self) -> Sequence['outputs.GetMulticastDomainSourceResult']:
        """
        EC2 Multicast Domain Group Sources
        """
        return pulumi.get(self, "sources")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter(name="staticSourcesSupport")
    def static_sources_support(self) -> str:
        """
        Whether to enable support for statically configuring multicast group sources for the EC2 Transit Gateway Multicast Domain.
        """
        return pulumi.get(self, "static_sources_support")

    @property
    @pulumi.getter
    def tags(self) -> Mapping[str, str]:
        """
        Key-value tags for the EC2 Transit Gateway Multicast Domain.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="transitGatewayAttachmentId")
    def transit_gateway_attachment_id(self) -> str:
        """
        The ID of the transit gateway attachment.
        """
        return pulumi.get(self, "transit_gateway_attachment_id")

    @property
    @pulumi.getter(name="transitGatewayId")
    def transit_gateway_id(self) -> str:
        """
        EC2 Transit Gateway identifier.
        """
        return pulumi.get(self, "transit_gateway_id")

    @property
    @pulumi.getter(name="transitGatewayMulticastDomainId")
    def transit_gateway_multicast_domain_id(self) -> str:
        return pulumi.get(self, "transit_gateway_multicast_domain_id")


class AwaitableGetMulticastDomainResult(GetMulticastDomainResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMulticastDomainResult(
            arn=self.arn,
            associations=self.associations,
            auto_accept_shared_associations=self.auto_accept_shared_associations,
            filters=self.filters,
            id=self.id,
            igmpv2_support=self.igmpv2_support,
            members=self.members,
            owner_id=self.owner_id,
            sources=self.sources,
            state=self.state,
            static_sources_support=self.static_sources_support,
            tags=self.tags,
            transit_gateway_attachment_id=self.transit_gateway_attachment_id,
            transit_gateway_id=self.transit_gateway_id,
            transit_gateway_multicast_domain_id=self.transit_gateway_multicast_domain_id)


def get_multicast_domain(filters: Optional[Sequence[pulumi.InputType['GetMulticastDomainFilterArgs']]] = None,
                         tags: Optional[Mapping[str, str]] = None,
                         transit_gateway_multicast_domain_id: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMulticastDomainResult:
    """
    Get information on an EC2 Transit Gateway Multicast Domain.

    ## Example Usage
    ### By Filter

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2transitgateway.get_multicast_domain(filters=[aws.ec2transitgateway.GetMulticastDomainFilterArgs(
        name="transit-gateway-multicast-domain-id",
        values=["tgw-mcast-domain-12345678"],
    )])
    ```
    ### By Identifier

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2transitgateway.get_multicast_domain(transit_gateway_multicast_domain_id="tgw-mcast-domain-12345678")
    ```


    :param Sequence[pulumi.InputType['GetMulticastDomainFilterArgs']] filters: One or more configuration blocks containing name-values filters. Detailed below.
    :param Mapping[str, str] tags: Key-value tags for the EC2 Transit Gateway Multicast Domain.
    :param str transit_gateway_multicast_domain_id: Identifier of the EC2 Transit Gateway Multicast Domain.
    """
    __args__ = dict()
    __args__['filters'] = filters
    __args__['tags'] = tags
    __args__['transitGatewayMulticastDomainId'] = transit_gateway_multicast_domain_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('aws:ec2transitgateway/getMulticastDomain:getMulticastDomain', __args__, opts=opts, typ=GetMulticastDomainResult).value

    return AwaitableGetMulticastDomainResult(
        arn=__ret__.arn,
        associations=__ret__.associations,
        auto_accept_shared_associations=__ret__.auto_accept_shared_associations,
        filters=__ret__.filters,
        id=__ret__.id,
        igmpv2_support=__ret__.igmpv2_support,
        members=__ret__.members,
        owner_id=__ret__.owner_id,
        sources=__ret__.sources,
        state=__ret__.state,
        static_sources_support=__ret__.static_sources_support,
        tags=__ret__.tags,
        transit_gateway_attachment_id=__ret__.transit_gateway_attachment_id,
        transit_gateway_id=__ret__.transit_gateway_id,
        transit_gateway_multicast_domain_id=__ret__.transit_gateway_multicast_domain_id)


@_utilities.lift_output_func(get_multicast_domain)
def get_multicast_domain_output(filters: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['GetMulticastDomainFilterArgs']]]]] = None,
                                tags: Optional[pulumi.Input[Optional[Mapping[str, str]]]] = None,
                                transit_gateway_multicast_domain_id: Optional[pulumi.Input[Optional[str]]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMulticastDomainResult]:
    """
    Get information on an EC2 Transit Gateway Multicast Domain.

    ## Example Usage
    ### By Filter

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2transitgateway.get_multicast_domain(filters=[aws.ec2transitgateway.GetMulticastDomainFilterArgs(
        name="transit-gateway-multicast-domain-id",
        values=["tgw-mcast-domain-12345678"],
    )])
    ```
    ### By Identifier

    ```python
    import pulumi
    import pulumi_aws as aws

    example = aws.ec2transitgateway.get_multicast_domain(transit_gateway_multicast_domain_id="tgw-mcast-domain-12345678")
    ```


    :param Sequence[pulumi.InputType['GetMulticastDomainFilterArgs']] filters: One or more configuration blocks containing name-values filters. Detailed below.
    :param Mapping[str, str] tags: Key-value tags for the EC2 Transit Gateway Multicast Domain.
    :param str transit_gateway_multicast_domain_id: Identifier of the EC2 Transit Gateway Multicast Domain.
    """
    ...