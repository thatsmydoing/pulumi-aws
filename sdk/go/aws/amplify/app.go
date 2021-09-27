// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package amplify

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Amplify App can be imported using Amplify App ID (appId), e.g.
//
// ```sh
//  $ pulumi import aws:amplify/app:App example d2ypk4k47z8u6
// ```
//
//  App ID can be obtained from App ARN (e.g. `arn:aws:amplify:us-east-1:12345678:apps/d2ypk4k47z8u6`).
type App struct {
	pulumi.CustomResourceState

	// The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
	AccessToken pulumi.StringPtrOutput `pulumi:"accessToken"`
	// The Amazon Resource Name (ARN) of the Amplify app.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The automated branch creation configuration for an Amplify app. An `autoBranchCreationConfig` block is documented below.
	AutoBranchCreationConfig AppAutoBranchCreationConfigOutput `pulumi:"autoBranchCreationConfig"`
	// The automated branch creation glob patterns for an Amplify app.
	AutoBranchCreationPatterns pulumi.StringArrayOutput `pulumi:"autoBranchCreationPatterns"`
	// The credentials for basic authorization for an Amplify app.
	BasicAuthCredentials pulumi.StringPtrOutput `pulumi:"basicAuthCredentials"`
	// The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
	BuildSpec pulumi.StringOutput `pulumi:"buildSpec"`
	// The custom rewrite and redirect rules for an Amplify app. A `customRule` block is documented below.
	CustomRules AppCustomRuleArrayOutput `pulumi:"customRules"`
	// The default domain for the Amplify app.
	DefaultDomain pulumi.StringOutput `pulumi:"defaultDomain"`
	// The description for an Amplify app.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Enables automated branch creation for an Amplify app.
	EnableAutoBranchCreation pulumi.BoolPtrOutput `pulumi:"enableAutoBranchCreation"`
	// Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
	EnableBasicAuth pulumi.BoolPtrOutput `pulumi:"enableBasicAuth"`
	// Enables auto-building of branches for the Amplify App.
	EnableBranchAutoBuild pulumi.BoolPtrOutput `pulumi:"enableBranchAutoBuild"`
	// Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
	EnableBranchAutoDeletion pulumi.BoolPtrOutput `pulumi:"enableBranchAutoDeletion"`
	// The environment variables map for an Amplify app.
	EnvironmentVariables pulumi.StringMapOutput `pulumi:"environmentVariables"`
	// The AWS Identity and Access Management (IAM) service role for an Amplify app.
	IamServiceRoleArn pulumi.StringPtrOutput `pulumi:"iamServiceRoleArn"`
	// The name for an Amplify app.
	Name pulumi.StringOutput `pulumi:"name"`
	// The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
	OauthToken pulumi.StringPtrOutput `pulumi:"oauthToken"`
	// The platform or framework for an Amplify app. Valid values: `WEB`.
	Platform pulumi.StringPtrOutput `pulumi:"platform"`
	// Describes the information about a production branch for an Amplify app. A `productionBranch` block is documented below.
	ProductionBranches AppProductionBranchArrayOutput `pulumi:"productionBranches"`
	// The repository for an Amplify app.
	Repository pulumi.StringPtrOutput `pulumi:"repository"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewApp registers a new resource with the given unique name, arguments, and options.
func NewApp(ctx *pulumi.Context,
	name string, args *AppArgs, opts ...pulumi.ResourceOption) (*App, error) {
	if args == nil {
		args = &AppArgs{}
	}

	var resource App
	err := ctx.RegisterResource("aws:amplify/app:App", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApp gets an existing App resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppState, opts ...pulumi.ResourceOption) (*App, error) {
	var resource App
	err := ctx.ReadResource("aws:amplify/app:App", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering App resources.
type appState struct {
	// The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
	AccessToken *string `pulumi:"accessToken"`
	// The Amazon Resource Name (ARN) of the Amplify app.
	Arn *string `pulumi:"arn"`
	// The automated branch creation configuration for an Amplify app. An `autoBranchCreationConfig` block is documented below.
	AutoBranchCreationConfig *AppAutoBranchCreationConfig `pulumi:"autoBranchCreationConfig"`
	// The automated branch creation glob patterns for an Amplify app.
	AutoBranchCreationPatterns []string `pulumi:"autoBranchCreationPatterns"`
	// The credentials for basic authorization for an Amplify app.
	BasicAuthCredentials *string `pulumi:"basicAuthCredentials"`
	// The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
	BuildSpec *string `pulumi:"buildSpec"`
	// The custom rewrite and redirect rules for an Amplify app. A `customRule` block is documented below.
	CustomRules []AppCustomRule `pulumi:"customRules"`
	// The default domain for the Amplify app.
	DefaultDomain *string `pulumi:"defaultDomain"`
	// The description for an Amplify app.
	Description *string `pulumi:"description"`
	// Enables automated branch creation for an Amplify app.
	EnableAutoBranchCreation *bool `pulumi:"enableAutoBranchCreation"`
	// Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
	EnableBasicAuth *bool `pulumi:"enableBasicAuth"`
	// Enables auto-building of branches for the Amplify App.
	EnableBranchAutoBuild *bool `pulumi:"enableBranchAutoBuild"`
	// Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
	EnableBranchAutoDeletion *bool `pulumi:"enableBranchAutoDeletion"`
	// The environment variables map for an Amplify app.
	EnvironmentVariables map[string]string `pulumi:"environmentVariables"`
	// The AWS Identity and Access Management (IAM) service role for an Amplify app.
	IamServiceRoleArn *string `pulumi:"iamServiceRoleArn"`
	// The name for an Amplify app.
	Name *string `pulumi:"name"`
	// The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
	OauthToken *string `pulumi:"oauthToken"`
	// The platform or framework for an Amplify app. Valid values: `WEB`.
	Platform *string `pulumi:"platform"`
	// Describes the information about a production branch for an Amplify app. A `productionBranch` block is documented below.
	ProductionBranches []AppProductionBranch `pulumi:"productionBranches"`
	// The repository for an Amplify app.
	Repository *string `pulumi:"repository"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type AppState struct {
	// The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
	AccessToken pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the Amplify app.
	Arn pulumi.StringPtrInput
	// The automated branch creation configuration for an Amplify app. An `autoBranchCreationConfig` block is documented below.
	AutoBranchCreationConfig AppAutoBranchCreationConfigPtrInput
	// The automated branch creation glob patterns for an Amplify app.
	AutoBranchCreationPatterns pulumi.StringArrayInput
	// The credentials for basic authorization for an Amplify app.
	BasicAuthCredentials pulumi.StringPtrInput
	// The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
	BuildSpec pulumi.StringPtrInput
	// The custom rewrite and redirect rules for an Amplify app. A `customRule` block is documented below.
	CustomRules AppCustomRuleArrayInput
	// The default domain for the Amplify app.
	DefaultDomain pulumi.StringPtrInput
	// The description for an Amplify app.
	Description pulumi.StringPtrInput
	// Enables automated branch creation for an Amplify app.
	EnableAutoBranchCreation pulumi.BoolPtrInput
	// Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
	EnableBasicAuth pulumi.BoolPtrInput
	// Enables auto-building of branches for the Amplify App.
	EnableBranchAutoBuild pulumi.BoolPtrInput
	// Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
	EnableBranchAutoDeletion pulumi.BoolPtrInput
	// The environment variables map for an Amplify app.
	EnvironmentVariables pulumi.StringMapInput
	// The AWS Identity and Access Management (IAM) service role for an Amplify app.
	IamServiceRoleArn pulumi.StringPtrInput
	// The name for an Amplify app.
	Name pulumi.StringPtrInput
	// The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
	OauthToken pulumi.StringPtrInput
	// The platform or framework for an Amplify app. Valid values: `WEB`.
	Platform pulumi.StringPtrInput
	// Describes the information about a production branch for an Amplify app. A `productionBranch` block is documented below.
	ProductionBranches AppProductionBranchArrayInput
	// The repository for an Amplify app.
	Repository pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
}

func (AppState) ElementType() reflect.Type {
	return reflect.TypeOf((*appState)(nil)).Elem()
}

type appArgs struct {
	// The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
	AccessToken *string `pulumi:"accessToken"`
	// The automated branch creation configuration for an Amplify app. An `autoBranchCreationConfig` block is documented below.
	AutoBranchCreationConfig *AppAutoBranchCreationConfig `pulumi:"autoBranchCreationConfig"`
	// The automated branch creation glob patterns for an Amplify app.
	AutoBranchCreationPatterns []string `pulumi:"autoBranchCreationPatterns"`
	// The credentials for basic authorization for an Amplify app.
	BasicAuthCredentials *string `pulumi:"basicAuthCredentials"`
	// The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
	BuildSpec *string `pulumi:"buildSpec"`
	// The custom rewrite and redirect rules for an Amplify app. A `customRule` block is documented below.
	CustomRules []AppCustomRule `pulumi:"customRules"`
	// The description for an Amplify app.
	Description *string `pulumi:"description"`
	// Enables automated branch creation for an Amplify app.
	EnableAutoBranchCreation *bool `pulumi:"enableAutoBranchCreation"`
	// Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
	EnableBasicAuth *bool `pulumi:"enableBasicAuth"`
	// Enables auto-building of branches for the Amplify App.
	EnableBranchAutoBuild *bool `pulumi:"enableBranchAutoBuild"`
	// Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
	EnableBranchAutoDeletion *bool `pulumi:"enableBranchAutoDeletion"`
	// The environment variables map for an Amplify app.
	EnvironmentVariables map[string]string `pulumi:"environmentVariables"`
	// The AWS Identity and Access Management (IAM) service role for an Amplify app.
	IamServiceRoleArn *string `pulumi:"iamServiceRoleArn"`
	// The name for an Amplify app.
	Name *string `pulumi:"name"`
	// The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
	OauthToken *string `pulumi:"oauthToken"`
	// The platform or framework for an Amplify app. Valid values: `WEB`.
	Platform *string `pulumi:"platform"`
	// The repository for an Amplify app.
	Repository *string `pulumi:"repository"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a App resource.
type AppArgs struct {
	// The personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
	AccessToken pulumi.StringPtrInput
	// The automated branch creation configuration for an Amplify app. An `autoBranchCreationConfig` block is documented below.
	AutoBranchCreationConfig AppAutoBranchCreationConfigPtrInput
	// The automated branch creation glob patterns for an Amplify app.
	AutoBranchCreationPatterns pulumi.StringArrayInput
	// The credentials for basic authorization for an Amplify app.
	BasicAuthCredentials pulumi.StringPtrInput
	// The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
	BuildSpec pulumi.StringPtrInput
	// The custom rewrite and redirect rules for an Amplify app. A `customRule` block is documented below.
	CustomRules AppCustomRuleArrayInput
	// The description for an Amplify app.
	Description pulumi.StringPtrInput
	// Enables automated branch creation for an Amplify app.
	EnableAutoBranchCreation pulumi.BoolPtrInput
	// Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
	EnableBasicAuth pulumi.BoolPtrInput
	// Enables auto-building of branches for the Amplify App.
	EnableBranchAutoBuild pulumi.BoolPtrInput
	// Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
	EnableBranchAutoDeletion pulumi.BoolPtrInput
	// The environment variables map for an Amplify app.
	EnvironmentVariables pulumi.StringMapInput
	// The AWS Identity and Access Management (IAM) service role for an Amplify app.
	IamServiceRoleArn pulumi.StringPtrInput
	// The name for an Amplify app.
	Name pulumi.StringPtrInput
	// The OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
	OauthToken pulumi.StringPtrInput
	// The platform or framework for an Amplify app. Valid values: `WEB`.
	Platform pulumi.StringPtrInput
	// The repository for an Amplify app.
	Repository pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (AppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appArgs)(nil)).Elem()
}

type AppInput interface {
	pulumi.Input

	ToAppOutput() AppOutput
	ToAppOutputWithContext(ctx context.Context) AppOutput
}

func (*App) ElementType() reflect.Type {
	return reflect.TypeOf((*App)(nil))
}

func (i *App) ToAppOutput() AppOutput {
	return i.ToAppOutputWithContext(context.Background())
}

func (i *App) ToAppOutputWithContext(ctx context.Context) AppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppOutput)
}

func (i *App) ToAppPtrOutput() AppPtrOutput {
	return i.ToAppPtrOutputWithContext(context.Background())
}

func (i *App) ToAppPtrOutputWithContext(ctx context.Context) AppPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppPtrOutput)
}

type AppPtrInput interface {
	pulumi.Input

	ToAppPtrOutput() AppPtrOutput
	ToAppPtrOutputWithContext(ctx context.Context) AppPtrOutput
}

type appPtrType AppArgs

func (*appPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**App)(nil))
}

func (i *appPtrType) ToAppPtrOutput() AppPtrOutput {
	return i.ToAppPtrOutputWithContext(context.Background())
}

func (i *appPtrType) ToAppPtrOutputWithContext(ctx context.Context) AppPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppPtrOutput)
}

// AppArrayInput is an input type that accepts AppArray and AppArrayOutput values.
// You can construct a concrete instance of `AppArrayInput` via:
//
//          AppArray{ AppArgs{...} }
type AppArrayInput interface {
	pulumi.Input

	ToAppArrayOutput() AppArrayOutput
	ToAppArrayOutputWithContext(context.Context) AppArrayOutput
}

type AppArray []AppInput

func (AppArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*App)(nil)).Elem()
}

func (i AppArray) ToAppArrayOutput() AppArrayOutput {
	return i.ToAppArrayOutputWithContext(context.Background())
}

func (i AppArray) ToAppArrayOutputWithContext(ctx context.Context) AppArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppArrayOutput)
}

// AppMapInput is an input type that accepts AppMap and AppMapOutput values.
// You can construct a concrete instance of `AppMapInput` via:
//
//          AppMap{ "key": AppArgs{...} }
type AppMapInput interface {
	pulumi.Input

	ToAppMapOutput() AppMapOutput
	ToAppMapOutputWithContext(context.Context) AppMapOutput
}

type AppMap map[string]AppInput

func (AppMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*App)(nil)).Elem()
}

func (i AppMap) ToAppMapOutput() AppMapOutput {
	return i.ToAppMapOutputWithContext(context.Background())
}

func (i AppMap) ToAppMapOutputWithContext(ctx context.Context) AppMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppMapOutput)
}

type AppOutput struct{ *pulumi.OutputState }

func (AppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*App)(nil))
}

func (o AppOutput) ToAppOutput() AppOutput {
	return o
}

func (o AppOutput) ToAppOutputWithContext(ctx context.Context) AppOutput {
	return o
}

func (o AppOutput) ToAppPtrOutput() AppPtrOutput {
	return o.ToAppPtrOutputWithContext(context.Background())
}

func (o AppOutput) ToAppPtrOutputWithContext(ctx context.Context) AppPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v App) *App {
		return &v
	}).(AppPtrOutput)
}

type AppPtrOutput struct{ *pulumi.OutputState }

func (AppPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**App)(nil))
}

func (o AppPtrOutput) ToAppPtrOutput() AppPtrOutput {
	return o
}

func (o AppPtrOutput) ToAppPtrOutputWithContext(ctx context.Context) AppPtrOutput {
	return o
}

func (o AppPtrOutput) Elem() AppOutput {
	return o.ApplyT(func(v *App) App {
		if v != nil {
			return *v
		}
		var ret App
		return ret
	}).(AppOutput)
}

type AppArrayOutput struct{ *pulumi.OutputState }

func (AppArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]App)(nil))
}

func (o AppArrayOutput) ToAppArrayOutput() AppArrayOutput {
	return o
}

func (o AppArrayOutput) ToAppArrayOutputWithContext(ctx context.Context) AppArrayOutput {
	return o
}

func (o AppArrayOutput) Index(i pulumi.IntInput) AppOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) App {
		return vs[0].([]App)[vs[1].(int)]
	}).(AppOutput)
}

type AppMapOutput struct{ *pulumi.OutputState }

func (AppMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]App)(nil))
}

func (o AppMapOutput) ToAppMapOutput() AppMapOutput {
	return o
}

func (o AppMapOutput) ToAppMapOutputWithContext(ctx context.Context) AppMapOutput {
	return o
}

func (o AppMapOutput) MapIndex(k pulumi.StringInput) AppOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) App {
		return vs[0].(map[string]App)[vs[1].(string)]
	}).(AppOutput)
}

func init() {
	pulumi.RegisterOutputType(AppOutput{})
	pulumi.RegisterOutputType(AppPtrOutput{})
	pulumi.RegisterOutputType(AppArrayOutput{})
	pulumi.RegisterOutputType(AppMapOutput{})
}