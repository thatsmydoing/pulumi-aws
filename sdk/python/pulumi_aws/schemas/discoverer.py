# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['DiscovererArgs', 'Discoverer']

@pulumi.input_type
class DiscovererArgs:
    def __init__(__self__, *,
                 source_arn: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a Discoverer resource.
        :param pulumi.Input[str] source_arn: The ARN of the event bus to discover event schemas on.
        :param pulumi.Input[str] description: The description of the discoverer. Maximum of 256 characters.
        """
        pulumi.set(__self__, "source_arn", source_arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="sourceArn")
    def source_arn(self) -> pulumi.Input[str]:
        """
        The ARN of the event bus to discover event schemas on.
        """
        return pulumi.get(self, "source_arn")

    @source_arn.setter
    def source_arn(self, value: pulumi.Input[str]):
        pulumi.set(self, "source_arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the discoverer. Maximum of 256 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _DiscovererState:
    def __init__(__self__, *,
                 arn: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 source_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering Discoverer resources.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the discoverer.
        :param pulumi.Input[str] description: The description of the discoverer. Maximum of 256 characters.
        :param pulumi.Input[str] source_arn: The ARN of the event bus to discover event schemas on.
        """
        if arn is not None:
            pulumi.set(__self__, "arn", arn)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if source_arn is not None:
            pulumi.set(__self__, "source_arn", source_arn)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if tags_all is not None:
            pulumi.set(__self__, "tags_all", tags_all)

    @property
    @pulumi.getter
    def arn(self) -> Optional[pulumi.Input[str]]:
        """
        The Amazon Resource Name (ARN) of the discoverer.
        """
        return pulumi.get(self, "arn")

    @arn.setter
    def arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "arn", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the discoverer. Maximum of 256 characters.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="sourceArn")
    def source_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the event bus to discover event schemas on.
        """
        return pulumi.get(self, "source_arn")

    @source_arn.setter
    def source_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "source_arn", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "tags_all")

    @tags_all.setter
    def tags_all(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "tags_all", value)


class Discoverer(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 source_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Provides an EventBridge Schema Discoverer resource.

        > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        messenger = aws.cloudwatch.EventBus("messenger")
        test = aws.schemas.Discoverer("test",
            source_arn=messenger.arn,
            description="Auto discover event schemas")
        ```

        ## Import

        EventBridge discoverers can be imported using the `id`, e.g. console

        ```sh
         $ pulumi import aws:schemas/discoverer:Discoverer test 123
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the discoverer. Maximum of 256 characters.
        :param pulumi.Input[str] source_arn: The ARN of the event bus to discover event schemas on.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DiscovererArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides an EventBridge Schema Discoverer resource.

        > **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_aws as aws

        messenger = aws.cloudwatch.EventBus("messenger")
        test = aws.schemas.Discoverer("test",
            source_arn=messenger.arn,
            description="Auto discover event schemas")
        ```

        ## Import

        EventBridge discoverers can be imported using the `id`, e.g. console

        ```sh
         $ pulumi import aws:schemas/discoverer:Discoverer test 123
        ```

        :param str resource_name: The name of the resource.
        :param DiscovererArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DiscovererArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 source_arn: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DiscovererArgs.__new__(DiscovererArgs)

            __props__.__dict__["description"] = description
            if source_arn is None and not opts.urn:
                raise TypeError("Missing required property 'source_arn'")
            __props__.__dict__["source_arn"] = source_arn
            __props__.__dict__["tags"] = tags
            __props__.__dict__["arn"] = None
            __props__.__dict__["tags_all"] = None
        super(Discoverer, __self__).__init__(
            'aws:schemas/discoverer:Discoverer',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            arn: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            source_arn: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            tags_all: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None) -> 'Discoverer':
        """
        Get an existing Discoverer resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] arn: The Amazon Resource Name (ARN) of the discoverer.
        :param pulumi.Input[str] description: The description of the discoverer. Maximum of 256 characters.
        :param pulumi.Input[str] source_arn: The ARN of the event bus to discover event schemas on.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DiscovererState.__new__(_DiscovererState)

        __props__.__dict__["arn"] = arn
        __props__.__dict__["description"] = description
        __props__.__dict__["source_arn"] = source_arn
        __props__.__dict__["tags"] = tags
        __props__.__dict__["tags_all"] = tags_all
        return Discoverer(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def arn(self) -> pulumi.Output[str]:
        """
        The Amazon Resource Name (ARN) of the discoverer.
        """
        return pulumi.get(self, "arn")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the discoverer. Maximum of 256 characters.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="sourceArn")
    def source_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the event bus to discover event schemas on.
        """
        return pulumi.get(self, "source_arn")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="tagsAll")
    def tags_all(self) -> pulumi.Output[Mapping[str, str]]:
        return pulumi.get(self, "tags_all")
