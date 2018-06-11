# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import pulumi
import pulumi.runtime

class GetBrokerResult(object):
    """
    A collection of values returned by getBroker.
    """
    def __init__(__self__, arn=None, auto_minor_version_upgrade=None, broker_id=None, broker_name=None, configuration=None, deployment_mode=None, engine_type=None, engine_version=None, host_instance_type=None, instances=None, maintenance_window_start_time=None, publicly_accessible=None, security_groups=None, subnet_ids=None, users=None):
        if not arn:
            raise TypeError('Missing required argument arn')
        elif not isinstance(arn, basestring):
            raise TypeError('Expected argument arn to be a basestring')
        __self__.arn = arn
        if not auto_minor_version_upgrade:
            raise TypeError('Missing required argument auto_minor_version_upgrade')
        elif not isinstance(auto_minor_version_upgrade, bool):
            raise TypeError('Expected argument auto_minor_version_upgrade to be a bool')
        __self__.auto_minor_version_upgrade = auto_minor_version_upgrade
        if not broker_id:
            raise TypeError('Missing required argument broker_id')
        elif not isinstance(broker_id, basestring):
            raise TypeError('Expected argument broker_id to be a basestring')
        __self__.broker_id = broker_id
        if not broker_name:
            raise TypeError('Missing required argument broker_name')
        elif not isinstance(broker_name, basestring):
            raise TypeError('Expected argument broker_name to be a basestring')
        __self__.broker_name = broker_name
        if not configuration:
            raise TypeError('Missing required argument configuration')
        elif not isinstance(configuration, dict):
            raise TypeError('Expected argument configuration to be a dict')
        __self__.configuration = configuration
        if not deployment_mode:
            raise TypeError('Missing required argument deployment_mode')
        elif not isinstance(deployment_mode, basestring):
            raise TypeError('Expected argument deployment_mode to be a basestring')
        __self__.deployment_mode = deployment_mode
        if not engine_type:
            raise TypeError('Missing required argument engine_type')
        elif not isinstance(engine_type, basestring):
            raise TypeError('Expected argument engine_type to be a basestring')
        __self__.engine_type = engine_type
        if not engine_version:
            raise TypeError('Missing required argument engine_version')
        elif not isinstance(engine_version, basestring):
            raise TypeError('Expected argument engine_version to be a basestring')
        __self__.engine_version = engine_version
        if not host_instance_type:
            raise TypeError('Missing required argument host_instance_type')
        elif not isinstance(host_instance_type, basestring):
            raise TypeError('Expected argument host_instance_type to be a basestring')
        __self__.host_instance_type = host_instance_type
        if not instances:
            raise TypeError('Missing required argument instances')
        elif not isinstance(instances, list):
            raise TypeError('Expected argument instances to be a list')
        __self__.instances = instances
        if not maintenance_window_start_time:
            raise TypeError('Missing required argument maintenance_window_start_time')
        elif not isinstance(maintenance_window_start_time, dict):
            raise TypeError('Expected argument maintenance_window_start_time to be a dict')
        __self__.maintenance_window_start_time = maintenance_window_start_time
        if not publicly_accessible:
            raise TypeError('Missing required argument publicly_accessible')
        elif not isinstance(publicly_accessible, bool):
            raise TypeError('Expected argument publicly_accessible to be a bool')
        __self__.publicly_accessible = publicly_accessible
        if not security_groups:
            raise TypeError('Missing required argument security_groups')
        elif not isinstance(security_groups, list):
            raise TypeError('Expected argument security_groups to be a list')
        __self__.security_groups = security_groups
        if not subnet_ids:
            raise TypeError('Missing required argument subnet_ids')
        elif not isinstance(subnet_ids, list):
            raise TypeError('Expected argument subnet_ids to be a list')
        __self__.subnet_ids = subnet_ids
        if not users:
            raise TypeError('Missing required argument users')
        elif not isinstance(users, list):
            raise TypeError('Expected argument users to be a list')
        __self__.users = users

def get_broker(broker_id=None, broker_name=None):
    """
    Provides information about a MQ Broker.
    """
    __args__ = dict()

    __args__['brokerId'] = broker_id
    __args__['brokerName'] = broker_name
    __ret__ = pulumi.runtime.invoke('aws:mq/getBroker:getBroker', __args__)

    return GetBrokerResult(
        arn=__ret__['arn'],
        auto_minor_version_upgrade=__ret__['autoMinorVersionUpgrade'],
        broker_id=__ret__['brokerId'],
        broker_name=__ret__['brokerName'],
        configuration=__ret__['configuration'],
        deployment_mode=__ret__['deploymentMode'],
        engine_type=__ret__['engineType'],
        engine_version=__ret__['engineVersion'],
        host_instance_type=__ret__['hostInstanceType'],
        instances=__ret__['instances'],
        maintenance_window_start_time=__ret__['maintenanceWindowStartTime'],
        publicly_accessible=__ret__['publiclyAccessible'],
        security_groups=__ret__['securityGroups'],
        subnet_ids=__ret__['subnetIds'],
        users=__ret__['users'])