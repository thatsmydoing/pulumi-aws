// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package imagebuilder

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides details about an Image builder Container Recipe.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/imagebuilder"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := imagebuilder.LookupContainerRecipe(ctx, &imagebuilder.LookupContainerRecipeArgs{
// 			Arn: "arn:aws:imagebuilder:us-east-1:aws:container-recipe/example/1.0.0",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func LookupContainerRecipe(ctx *pulumi.Context, args *LookupContainerRecipeArgs, opts ...pulumi.InvokeOption) (*LookupContainerRecipeResult, error) {
	var rv LookupContainerRecipeResult
	err := ctx.Invoke("aws:imagebuilder/getContainerRecipe:getContainerRecipe", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getContainerRecipe.
type LookupContainerRecipeArgs struct {
	// Amazon Resource Name (ARN) of the container recipe.
	Arn string `pulumi:"arn"`
	// Key-value map of resource tags for the container recipe.
	Tags map[string]string `pulumi:"tags"`
}

// A collection of values returned by getContainerRecipe.
type LookupContainerRecipeResult struct {
	Arn string `pulumi:"arn"`
	// List of objects with components for the container recipe.
	Components []GetContainerRecipeComponent `pulumi:"components"`
	// Type of the container.
	ContainerType string `pulumi:"containerType"`
	// Date the container recipe was created.
	DateCreated string `pulumi:"dateCreated"`
	// Description of the container recipe.
	Description string `pulumi:"description"`
	// Dockerfile template used to build the image.
	DockerfileTemplateData string `pulumi:"dockerfileTemplateData"`
	// Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
	Encrypted bool `pulumi:"encrypted"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of objects with instance configurations for building and testing container images.
	InstanceConfigurations []GetContainerRecipeInstanceConfiguration `pulumi:"instanceConfigurations"`
	// KMS key used to encrypt the container image.
	KmsKeyId string `pulumi:"kmsKeyId"`
	// Name of the container recipe.
	Name string `pulumi:"name"`
	// Owner of the container recipe.
	Owner string `pulumi:"owner"`
	// Base image for the container recipe.
	ParentImage string `pulumi:"parentImage"`
	// Platform of the container recipe.
	Platform string `pulumi:"platform"`
	// Key-value map of resource tags for the container recipe.
	Tags map[string]string `pulumi:"tags"`
	// Destination repository for the container image.
	TargetRepositories []GetContainerRecipeTargetRepository `pulumi:"targetRepositories"`
	// Version of the container recipe.
	Version string `pulumi:"version"`
	// The working directory used during build and test workflows.
	WorkingDirectory string `pulumi:"workingDirectory"`
}

func LookupContainerRecipeOutput(ctx *pulumi.Context, args LookupContainerRecipeOutputArgs, opts ...pulumi.InvokeOption) LookupContainerRecipeResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupContainerRecipeResult, error) {
			args := v.(LookupContainerRecipeArgs)
			r, err := LookupContainerRecipe(ctx, &args, opts...)
			return *r, err
		}).(LookupContainerRecipeResultOutput)
}

// A collection of arguments for invoking getContainerRecipe.
type LookupContainerRecipeOutputArgs struct {
	// Amazon Resource Name (ARN) of the container recipe.
	Arn pulumi.StringInput `pulumi:"arn"`
	// Key-value map of resource tags for the container recipe.
	Tags pulumi.StringMapInput `pulumi:"tags"`
}

func (LookupContainerRecipeOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupContainerRecipeArgs)(nil)).Elem()
}

// A collection of values returned by getContainerRecipe.
type LookupContainerRecipeResultOutput struct{ *pulumi.OutputState }

func (LookupContainerRecipeResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupContainerRecipeResult)(nil)).Elem()
}

func (o LookupContainerRecipeResultOutput) ToLookupContainerRecipeResultOutput() LookupContainerRecipeResultOutput {
	return o
}

func (o LookupContainerRecipeResultOutput) ToLookupContainerRecipeResultOutputWithContext(ctx context.Context) LookupContainerRecipeResultOutput {
	return o
}

func (o LookupContainerRecipeResultOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.Arn }).(pulumi.StringOutput)
}

// List of objects with components for the container recipe.
func (o LookupContainerRecipeResultOutput) Components() GetContainerRecipeComponentArrayOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) []GetContainerRecipeComponent { return v.Components }).(GetContainerRecipeComponentArrayOutput)
}

// Type of the container.
func (o LookupContainerRecipeResultOutput) ContainerType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.ContainerType }).(pulumi.StringOutput)
}

// Date the container recipe was created.
func (o LookupContainerRecipeResultOutput) DateCreated() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.DateCreated }).(pulumi.StringOutput)
}

// Description of the container recipe.
func (o LookupContainerRecipeResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.Description }).(pulumi.StringOutput)
}

// Dockerfile template used to build the image.
func (o LookupContainerRecipeResultOutput) DockerfileTemplateData() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.DockerfileTemplateData }).(pulumi.StringOutput)
}

// Whether to encrypt the volume. Defaults to unset, which is the value inherited from the parent image.
func (o LookupContainerRecipeResultOutput) Encrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) bool { return v.Encrypted }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupContainerRecipeResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of objects with instance configurations for building and testing container images.
func (o LookupContainerRecipeResultOutput) InstanceConfigurations() GetContainerRecipeInstanceConfigurationArrayOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) []GetContainerRecipeInstanceConfiguration {
		return v.InstanceConfigurations
	}).(GetContainerRecipeInstanceConfigurationArrayOutput)
}

// KMS key used to encrypt the container image.
func (o LookupContainerRecipeResultOutput) KmsKeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.KmsKeyId }).(pulumi.StringOutput)
}

// Name of the container recipe.
func (o LookupContainerRecipeResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.Name }).(pulumi.StringOutput)
}

// Owner of the container recipe.
func (o LookupContainerRecipeResultOutput) Owner() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.Owner }).(pulumi.StringOutput)
}

// Base image for the container recipe.
func (o LookupContainerRecipeResultOutput) ParentImage() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.ParentImage }).(pulumi.StringOutput)
}

// Platform of the container recipe.
func (o LookupContainerRecipeResultOutput) Platform() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.Platform }).(pulumi.StringOutput)
}

// Key-value map of resource tags for the container recipe.
func (o LookupContainerRecipeResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Destination repository for the container image.
func (o LookupContainerRecipeResultOutput) TargetRepositories() GetContainerRecipeTargetRepositoryArrayOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) []GetContainerRecipeTargetRepository { return v.TargetRepositories }).(GetContainerRecipeTargetRepositoryArrayOutput)
}

// Version of the container recipe.
func (o LookupContainerRecipeResultOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.Version }).(pulumi.StringOutput)
}

// The working directory used during build and test workflows.
func (o LookupContainerRecipeResultOutput) WorkingDirectory() pulumi.StringOutput {
	return o.ApplyT(func(v LookupContainerRecipeResult) string { return v.WorkingDirectory }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupContainerRecipeResultOutput{})
}