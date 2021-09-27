// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package servicecatalog

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides information on Service Catalog Portfolio Constraints.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/servicecatalog"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := servicecatalog.GetPortfolioConstraints(ctx, &servicecatalog.GetPortfolioConstraintsArgs{
// 			PortfolioId: "port-3lli3b3an",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
func GetPortfolioConstraints(ctx *pulumi.Context, args *GetPortfolioConstraintsArgs, opts ...pulumi.InvokeOption) (*GetPortfolioConstraintsResult, error) {
	var rv GetPortfolioConstraintsResult
	err := ctx.Invoke("aws:servicecatalog/getPortfolioConstraints:getPortfolioConstraints", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPortfolioConstraints.
type GetPortfolioConstraintsArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// Portfolio identifier.
	PortfolioId string `pulumi:"portfolioId"`
	// Product identifier.
	ProductId *string `pulumi:"productId"`
}

// A collection of values returned by getPortfolioConstraints.
type GetPortfolioConstraintsResult struct {
	AcceptLanguage *string `pulumi:"acceptLanguage"`
	// List of information about the constraints. See details below.
	Details []GetPortfolioConstraintsDetail `pulumi:"details"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the portfolio the product resides in. The constraint applies only to the instance of the product that lives within this portfolio.
	PortfolioId string `pulumi:"portfolioId"`
	// Identifier of the product the constraint applies to. A constraint applies to a specific instance of a product within a certain portfolio.
	ProductId *string `pulumi:"productId"`
}

func GetPortfolioConstraintsOutput(ctx *pulumi.Context, args GetPortfolioConstraintsOutputArgs, opts ...pulumi.InvokeOption) GetPortfolioConstraintsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetPortfolioConstraintsResult, error) {
			args := v.(GetPortfolioConstraintsArgs)
			r, err := GetPortfolioConstraints(ctx, &args, opts...)
			return *r, err
		}).(GetPortfolioConstraintsResultOutput)
}

// A collection of arguments for invoking getPortfolioConstraints.
type GetPortfolioConstraintsOutputArgs struct {
	// Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
	AcceptLanguage pulumi.StringPtrInput `pulumi:"acceptLanguage"`
	// Portfolio identifier.
	PortfolioId pulumi.StringInput `pulumi:"portfolioId"`
	// Product identifier.
	ProductId pulumi.StringPtrInput `pulumi:"productId"`
}

func (GetPortfolioConstraintsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPortfolioConstraintsArgs)(nil)).Elem()
}

// A collection of values returned by getPortfolioConstraints.
type GetPortfolioConstraintsResultOutput struct{ *pulumi.OutputState }

func (GetPortfolioConstraintsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetPortfolioConstraintsResult)(nil)).Elem()
}

func (o GetPortfolioConstraintsResultOutput) ToGetPortfolioConstraintsResultOutput() GetPortfolioConstraintsResultOutput {
	return o
}

func (o GetPortfolioConstraintsResultOutput) ToGetPortfolioConstraintsResultOutputWithContext(ctx context.Context) GetPortfolioConstraintsResultOutput {
	return o
}

func (o GetPortfolioConstraintsResultOutput) AcceptLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPortfolioConstraintsResult) *string { return v.AcceptLanguage }).(pulumi.StringPtrOutput)
}

// List of information about the constraints. See details below.
func (o GetPortfolioConstraintsResultOutput) Details() GetPortfolioConstraintsDetailArrayOutput {
	return o.ApplyT(func(v GetPortfolioConstraintsResult) []GetPortfolioConstraintsDetail { return v.Details }).(GetPortfolioConstraintsDetailArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetPortfolioConstraintsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortfolioConstraintsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the portfolio the product resides in. The constraint applies only to the instance of the product that lives within this portfolio.
func (o GetPortfolioConstraintsResultOutput) PortfolioId() pulumi.StringOutput {
	return o.ApplyT(func(v GetPortfolioConstraintsResult) string { return v.PortfolioId }).(pulumi.StringOutput)
}

// Identifier of the product the constraint applies to. A constraint applies to a specific instance of a product within a certain portfolio.
func (o GetPortfolioConstraintsResultOutput) ProductId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetPortfolioConstraintsResult) *string { return v.ProductId }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(GetPortfolioConstraintsResultOutput{})
}