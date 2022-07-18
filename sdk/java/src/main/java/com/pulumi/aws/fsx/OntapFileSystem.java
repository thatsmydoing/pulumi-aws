// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.fsx.OntapFileSystemArgs;
import com.pulumi.aws.fsx.inputs.OntapFileSystemState;
import com.pulumi.aws.fsx.outputs.OntapFileSystemDiskIopsConfiguration;
import com.pulumi.aws.fsx.outputs.OntapFileSystemEndpoint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an Amazon FSx for NetApp ONTAP file system.
 * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/what-is-fsx-ontap.html) for more information.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new OntapFileSystem(&#34;test&#34;, OntapFileSystemArgs.builder()        
 *             .storageCapacity(1024)
 *             .subnetIds(            
 *                 aws_subnet.test1().id(),
 *                 aws_subnet.test2().id())
 *             .deploymentType(&#34;MULTI_AZ_1&#34;)
 *             .throughputCapacity(512)
 *             .preferredSubnetId(aws_subnet.test1().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * FSx File Systems can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:fsx/ontapFileSystem:OntapFileSystem example fs-543ab12b1ca672f33
 * ```
 * 
 *  Certain resource arguments, like `security_group_ids`, do not have a FSx API method for reading the information after creation. If the argument is set in the Terraform configuration on an imported resource, Terraform will always show a difference. To workaround this behavior, either omit the argument from the Terraform configuration or use [`ignore_changes`](https://www.terraform.io/docs/configuration/meta-arguments/lifecycle.html#ignore_changes) to hide the difference, e.g., terraform resource &#34;aws_fsx_ontap_file_system&#34; &#34;example&#34; {
 * 
 * # ... other configuration ...
 * 
 *  security_group_ids = [aws_security_group.example.id]
 * 
 * # There is no FSx API for reading security_group_ids
 * 
 *  lifecycle {
 * 
 *  ignore_changes = [security_group_ids]
 * 
 *  } }
 * 
 */
@ResourceType(type="aws:fsx/ontapFileSystem:OntapFileSystem")
public class OntapFileSystem extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name of the file system.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the file system.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    @Export(name="automaticBackupRetentionDays", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> automaticBackupRetentionDays;

    /**
     * @return The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
     * 
     */
    public Output<Optional<Integer>> automaticBackupRetentionDays() {
        return Codegen.optional(this.automaticBackupRetentionDays);
    }
    /**
     * A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    @Export(name="dailyAutomaticBackupStartTime", type=String.class, parameters={})
    private Output<String> dailyAutomaticBackupStartTime;

    /**
     * @return A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
     * 
     */
    public Output<String> dailyAutomaticBackupStartTime() {
        return this.dailyAutomaticBackupStartTime;
    }
    /**
     * - The filesystem deployment type. Supports `MULTI_AZ_1` and `SINGLE_AZ_1`.
     * 
     */
    @Export(name="deploymentType", type=String.class, parameters={})
    private Output<String> deploymentType;

    /**
     * @return - The filesystem deployment type. Supports `MULTI_AZ_1` and `SINGLE_AZ_1`.
     * 
     */
    public Output<String> deploymentType() {
        return this.deploymentType;
    }
    /**
     * The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration Below.
     * 
     */
    @Export(name="diskIopsConfiguration", type=OntapFileSystemDiskIopsConfiguration.class, parameters={})
    private Output<OntapFileSystemDiskIopsConfiguration> diskIopsConfiguration;

    /**
     * @return The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration Below.
     * 
     */
    public Output<OntapFileSystemDiskIopsConfiguration> diskIopsConfiguration() {
        return this.diskIopsConfiguration;
    }
    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    @Export(name="dnsName", type=String.class, parameters={})
    private Output<String> dnsName;

    /**
     * @return The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    public Output<String> dnsName() {
        return this.dnsName;
    }
    /**
     * Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * 
     */
    @Export(name="endpointIpAddressRange", type=String.class, parameters={})
    private Output<String> endpointIpAddressRange;

    /**
     * @return Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
     * 
     */
    public Output<String> endpointIpAddressRange() {
        return this.endpointIpAddressRange;
    }
    /**
     * The endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * 
     */
    @Export(name="endpoints", type=List.class, parameters={OntapFileSystemEndpoint.class})
    private Output<List<OntapFileSystemEndpoint>> endpoints;

    /**
     * @return The endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * 
     */
    public Output<List<OntapFileSystemEndpoint>> endpoints() {
        return this.endpoints;
    }
    /**
     * The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
     * 
     */
    @Export(name="fsxAdminPassword", type=String.class, parameters={})
    private Output</* @Nullable */ String> fsxAdminPassword;

    /**
     * @return The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
     * 
     */
    public Output<Optional<String>> fsxAdminPassword() {
        return Codegen.optional(this.fsxAdminPassword);
    }
    /**
     * ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    @Export(name="kmsKeyId", type=String.class, parameters={})
    private Output<String> kmsKeyId;

    /**
     * @return ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
     * 
     */
    @Export(name="networkInterfaceIds", type=List.class, parameters={String.class})
    private Output<List<String>> networkInterfaceIds;

    /**
     * @return Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
     * 
     */
    public Output<List<String>> networkInterfaceIds() {
        return this.networkInterfaceIds;
    }
    /**
     * AWS account identifier that created the file system.
     * 
     */
    @Export(name="ownerId", type=String.class, parameters={})
    private Output<String> ownerId;

    /**
     * @return AWS account identifier that created the file system.
     * 
     */
    public Output<String> ownerId() {
        return this.ownerId;
    }
    /**
     * The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
     * 
     */
    @Export(name="preferredSubnetId", type=String.class, parameters={})
    private Output<String> preferredSubnetId;

    /**
     * @return The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
     * 
     */
    public Output<String> preferredSubnetId() {
        return this.preferredSubnetId;
    }
    /**
     * Specifies the VPC route tables in which your file system&#39;s endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC&#39;s default route table.
     * 
     */
    @Export(name="routeTableIds", type=List.class, parameters={String.class})
    private Output<List<String>> routeTableIds;

    /**
     * @return Specifies the VPC route tables in which your file system&#39;s endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC&#39;s default route table.
     * 
     */
    public Output<List<String>> routeTableIds() {
        return this.routeTableIds;
    }
    /**
     * A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    @Export(name="securityGroupIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
     * 
     */
    public Output<Optional<List<String>>> securityGroupIds() {
        return Codegen.optional(this.securityGroupIds);
    }
    /**
     * The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
     * 
     */
    @Export(name="storageCapacity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> storageCapacity;

    /**
     * @return The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
     * 
     */
    public Output<Optional<Integer>> storageCapacity() {
        return Codegen.optional(this.storageCapacity);
    }
    /**
     * - The filesystem storage type. defaults to `SSD`.
     * 
     */
    @Export(name="storageType", type=String.class, parameters={})
    private Output</* @Nullable */ String> storageType;

    /**
     * @return - The filesystem storage type. defaults to `SSD`.
     * 
     */
    public Output<Optional<String>> storageType() {
        return Codegen.optional(this.storageType);
    }
    /**
     * A list of IDs for the subnets that the file system will be accessible from. Upto 2 subnets can be provided.
     * 
     */
    @Export(name="subnetIds", type=List.class, parameters={String.class})
    private Output<List<String>> subnetIds;

    /**
     * @return A list of IDs for the subnets that the file system will be accessible from. Upto 2 subnets can be provided.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * Sets the throughput capacity (in MBps) for the file system that you&#39;re creating. Valid values are `128`, `256`, `512`, `1024`, and `2048`.
     * 
     */
    @Export(name="throughputCapacity", type=Integer.class, parameters={})
    private Output<Integer> throughputCapacity;

    /**
     * @return Sets the throughput capacity (in MBps) for the file system that you&#39;re creating. Valid values are `128`, `256`, `512`, `1024`, and `2048`.
     * 
     */
    public Output<Integer> throughputCapacity() {
        return this.throughputCapacity;
    }
    /**
     * Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    @Export(name="vpcId", type=String.class, parameters={})
    private Output<String> vpcId;

    /**
     * @return Identifier of the Virtual Private Cloud for the file system.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    @Export(name="weeklyMaintenanceStartTime", type=String.class, parameters={})
    private Output<String> weeklyMaintenanceStartTime;

    /**
     * @return The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
     * 
     */
    public Output<String> weeklyMaintenanceStartTime() {
        return this.weeklyMaintenanceStartTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OntapFileSystem(String name) {
        this(name, OntapFileSystemArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OntapFileSystem(String name, OntapFileSystemArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OntapFileSystem(String name, OntapFileSystemArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapFileSystem:OntapFileSystem", name, args == null ? OntapFileSystemArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OntapFileSystem(String name, Output<String> id, @Nullable OntapFileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapFileSystem:OntapFileSystem", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static OntapFileSystem get(String name, Output<String> id, @Nullable OntapFileSystemState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OntapFileSystem(name, id, state, options);
    }
}