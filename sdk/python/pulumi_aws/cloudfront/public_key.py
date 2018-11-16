# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime
from .. import utilities, tables

class PublicKey(pulumi.CustomResource):
    def __init__(__self__, __name__, __opts__=None, comment=None, encoded_key=None, name=None, name_prefix=None):
        """Create a PublicKey resource with the given unique name, props, and options."""
        if not __name__:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(__name__, str):
            raise TypeError('Expected resource name to be a string')
        if __opts__ and not isinstance(__opts__, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        __props__['comment'] = comment

        if not encoded_key:
            raise TypeError('Missing required property encoded_key')
        __props__['encoded_key'] = encoded_key

        __props__['name'] = name

        __props__['name_prefix'] = name_prefix

        __props__['caller_reference'] = None
        __props__['etag'] = None

        super(PublicKey, __self__).__init__(
            'aws:cloudfront/publicKey:PublicKey',
            __name__,
            __props__,
            __opts__)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
