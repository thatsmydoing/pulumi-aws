# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = [
    'SecretRotationRotationRulesArgs',
    'SecretRotationRulesArgs',
]

@pulumi.input_type
class SecretRotationRotationRulesArgs:
    def __init__(__self__, *,
                 automatically_after_days: pulumi.Input[int]):
        """
        :param pulumi.Input[int] automatically_after_days: Specifies the number of days between automatic scheduled rotations of the secret.
        """
        pulumi.set(__self__, "automatically_after_days", automatically_after_days)

    @property
    @pulumi.getter(name="automaticallyAfterDays")
    def automatically_after_days(self) -> pulumi.Input[int]:
        """
        Specifies the number of days between automatic scheduled rotations of the secret.
        """
        return pulumi.get(self, "automatically_after_days")

    @automatically_after_days.setter
    def automatically_after_days(self, value: pulumi.Input[int]):
        pulumi.set(self, "automatically_after_days", value)


@pulumi.input_type
class SecretRotationRulesArgs:
    def __init__(__self__, *,
                 automatically_after_days: pulumi.Input[int]):
        """
        :param pulumi.Input[int] automatically_after_days: Specifies the number of days between automatic scheduled rotations of the secret.
        """
        pulumi.set(__self__, "automatically_after_days", automatically_after_days)

    @property
    @pulumi.getter(name="automaticallyAfterDays")
    def automatically_after_days(self) -> pulumi.Input[int]:
        """
        Specifies the number of days between automatic scheduled rotations of the secret.
        """
        return pulumi.get(self, "automatically_after_days")

    @automatically_after_days.setter
    def automatically_after_days(self, value: pulumi.Input[int]):
        pulumi.set(self, "automatically_after_days", value)

