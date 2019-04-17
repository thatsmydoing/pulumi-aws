# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from .. import utilities, tables

class Selection(pulumi.CustomResource):
    iam_role_arn: pulumi.Output[str]
    name: pulumi.Output[str]
    """
    The display name of a resource selection document.
    """
    plan_id: pulumi.Output[str]
    """
    The backup plan ID to be associated with the selection of resources.
    """
    resources: pulumi.Output[list]
    """
    An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
    """
    selection_tags: pulumi.Output[list]
    """
    Tag-based conditions used to specify a set of resources to assign to a backup plan.
    """
    def __init__(__self__, resource_name, opts=None, iam_role_arn=None, name=None, plan_id=None, resources=None, selection_tags=None, __name__=None, __opts__=None):
        """
        Manages selection conditions for AWS Backup plan resources.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] name: The display name of a resource selection document.
        :param pulumi.Input[str] plan_id: The backup plan ID to be associated with the selection of resources.
        :param pulumi.Input[list] resources: An array of strings that either contain Amazon Resource Names (ARNs) or match patterns of resources to assign to a backup plan..
        :param pulumi.Input[list] selection_tags: Tag-based conditions used to specify a set of resources to assign to a backup plan.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        if iam_role_arn is None:
            raise TypeError("Missing required property 'iam_role_arn'")
        __props__['iam_role_arn'] = iam_role_arn

        __props__['name'] = name

        if plan_id is None:
            raise TypeError("Missing required property 'plan_id'")
        __props__['plan_id'] = plan_id

        __props__['resources'] = resources

        __props__['selection_tags'] = selection_tags

        super(Selection, __self__).__init__(
            'aws:backup/selection:Selection',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
