// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigatewayv2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.apigatewayv2.IntegrationArgs;
import com.pulumi.aws.apigatewayv2.inputs.IntegrationState;
import com.pulumi.aws.apigatewayv2.outputs.IntegrationResponseParameter;
import com.pulumi.aws.apigatewayv2.outputs.IntegrationTlsConfig;
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
 * Manages an Amazon API Gateway Version 2 integration.
 * More information can be found in the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api.html).
 * 
 * ## Example Usage
 * ### Basic
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
 *         var example = new Integration(&#34;example&#34;, IntegrationArgs.builder()        
 *             .apiId(aws_apigatewayv2_api.example().id())
 *             .integrationType(&#34;MOCK&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Lambda Integration
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
 *         var exampleFunction = new Function(&#34;exampleFunction&#34;, FunctionArgs.builder()        
 *             .code(new FileArchive(&#34;example.zip&#34;))
 *             .role(aws_iam_role.example().arn())
 *             .handler(&#34;index.handler&#34;)
 *             .runtime(&#34;nodejs12.x&#34;)
 *             .build());
 * 
 *         var exampleIntegration = new Integration(&#34;exampleIntegration&#34;, IntegrationArgs.builder()        
 *             .apiId(aws_apigatewayv2_api.example().id())
 *             .integrationType(&#34;AWS&#34;)
 *             .connectionType(&#34;INTERNET&#34;)
 *             .contentHandlingStrategy(&#34;CONVERT_TO_TEXT&#34;)
 *             .description(&#34;Lambda example&#34;)
 *             .integrationMethod(&#34;POST&#34;)
 *             .integrationUri(exampleFunction.invokeArn())
 *             .passthroughBehavior(&#34;WHEN_NO_MATCH&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### AWS Service Integration
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
 *         var example = new Integration(&#34;example&#34;, IntegrationArgs.builder()        
 *             .apiId(aws_apigatewayv2_api.example().id())
 *             .credentialsArn(aws_iam_role.example().arn())
 *             .description(&#34;SQS example&#34;)
 *             .integrationType(&#34;AWS_PROXY&#34;)
 *             .integrationSubtype(&#34;SQS-SendMessage&#34;)
 *             .requestParameters(Map.ofEntries(
 *                 Map.entry(&#34;QueueUrl&#34;, &#34;$request.header.queueUrl&#34;),
 *                 Map.entry(&#34;MessageBody&#34;, &#34;$request.body.message&#34;)
 *             ))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Private Integration
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
 *         var example = new Integration(&#34;example&#34;, IntegrationArgs.builder()        
 *             .apiId(aws_apigatewayv2_api.example().id())
 *             .credentialsArn(aws_iam_role.example().arn())
 *             .description(&#34;Example with a load balancer&#34;)
 *             .integrationType(&#34;HTTP_PROXY&#34;)
 *             .integrationUri(aws_lb_listener.example().arn())
 *             .integrationMethod(&#34;ANY&#34;)
 *             .connectionType(&#34;VPC_LINK&#34;)
 *             .connectionId(aws_apigatewayv2_vpc_link.example().id())
 *             .tlsConfig(IntegrationTlsConfigArgs.builder()
 *                 .serverNameToVerify(&#34;example.com&#34;)
 *                 .build())
 *             .requestParameters(Map.ofEntries(
 *                 Map.entry(&#34;append:header.authforintegration&#34;, &#34;$context.authorizer.authorizerResponse&#34;),
 *                 Map.entry(&#34;overwrite:path&#34;, &#34;staticValueForIntegration&#34;)
 *             ))
 *             .responseParameters(            
 *                 IntegrationResponseParameterArgs.builder()
 *                     .statusCode(403)
 *                     .mappings(Map.of(&#34;append:header.auth&#34;, &#34;$context.authorizer.authorizerResponse&#34;))
 *                     .build(),
 *                 IntegrationResponseParameterArgs.builder()
 *                     .statusCode(200)
 *                     .mappings(Map.of(&#34;overwrite:statuscode&#34;, &#34;204&#34;))
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * `aws_apigatewayv2_integration` can be imported by using the API identifier and integration identifier, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:apigatewayv2/integration:Integration example aabbccddee/1122334
 * ```
 * 
 */
@ResourceType(type="aws:apigatewayv2/integration:Integration")
public class Integration extends com.pulumi.resources.CustomResource {
    /**
     * The API identifier.
     * 
     */
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    /**
     * @return The API identifier.
     * 
     */
    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * The ID of the VPC link for a private integration. Supported only for HTTP APIs. Must be between 1 and 1024 characters in length.
     * 
     */
    @Export(name="connectionId", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionId;

    /**
     * @return The ID of the VPC link for a private integration. Supported only for HTTP APIs. Must be between 1 and 1024 characters in length.
     * 
     */
    public Output<Optional<String>> connectionId() {
        return Codegen.optional(this.connectionId);
    }
    /**
     * The type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
     * 
     */
    @Export(name="connectionType", type=String.class, parameters={})
    private Output</* @Nullable */ String> connectionType;

    /**
     * @return The type of the network connection to the integration endpoint. Valid values: `INTERNET`, `VPC_LINK`. Default is `INTERNET`.
     * 
     */
    public Output<Optional<String>> connectionType() {
        return Codegen.optional(this.connectionType);
    }
    /**
     * How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
     * 
     */
    @Export(name="contentHandlingStrategy", type=String.class, parameters={})
    private Output</* @Nullable */ String> contentHandlingStrategy;

    /**
     * @return How to handle response payload content type conversions. Valid values: `CONVERT_TO_BINARY`, `CONVERT_TO_TEXT`. Supported only for WebSocket APIs.
     * 
     */
    public Output<Optional<String>> contentHandlingStrategy() {
        return Codegen.optional(this.contentHandlingStrategy);
    }
    /**
     * The credentials required for the integration, if any.
     * 
     */
    @Export(name="credentialsArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> credentialsArn;

    /**
     * @return The credentials required for the integration, if any.
     * 
     */
    public Output<Optional<String>> credentialsArn() {
        return Codegen.optional(this.credentialsArn);
    }
    /**
     * The description of the integration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the integration.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The integration&#39;s HTTP method. Must be specified if `integration_type` is not `MOCK`.
     * 
     */
    @Export(name="integrationMethod", type=String.class, parameters={})
    private Output</* @Nullable */ String> integrationMethod;

    /**
     * @return The integration&#39;s HTTP method. Must be specified if `integration_type` is not `MOCK`.
     * 
     */
    public Output<Optional<String>> integrationMethod() {
        return Codegen.optional(this.integrationMethod);
    }
    /**
     * The [integration response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions) for the integration.
     * 
     */
    @Export(name="integrationResponseSelectionExpression", type=String.class, parameters={})
    private Output<String> integrationResponseSelectionExpression;

    /**
     * @return The [integration response selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-integration-response-selection-expressions) for the integration.
     * 
     */
    public Output<String> integrationResponseSelectionExpression() {
        return this.integrationResponseSelectionExpression;
    }
    /**
     * Specifies the AWS service action to invoke. Supported only for HTTP APIs when `integration_type` is `AWS_PROXY`. See the [AWS service integration reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html) documentation for supported values. Must be between 1 and 128 characters in length.
     * 
     */
    @Export(name="integrationSubtype", type=String.class, parameters={})
    private Output</* @Nullable */ String> integrationSubtype;

    /**
     * @return Specifies the AWS service action to invoke. Supported only for HTTP APIs when `integration_type` is `AWS_PROXY`. See the [AWS service integration reference](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-aws-services-reference.html) documentation for supported values. Must be between 1 and 128 characters in length.
     * 
     */
    public Output<Optional<String>> integrationSubtype() {
        return Codegen.optional(this.integrationSubtype);
    }
    /**
     * The integration type of an integration.
     * Valid values: `AWS` (supported only for WebSocket APIs), `AWS_PROXY`, `HTTP` (supported only for WebSocket APIs), `HTTP_PROXY`, `MOCK` (supported only for WebSocket APIs). For an HTTP API private integration, use `HTTP_PROXY`.
     * 
     */
    @Export(name="integrationType", type=String.class, parameters={})
    private Output<String> integrationType;

    /**
     * @return The integration type of an integration.
     * Valid values: `AWS` (supported only for WebSocket APIs), `AWS_PROXY`, `HTTP` (supported only for WebSocket APIs), `HTTP_PROXY`, `MOCK` (supported only for WebSocket APIs). For an HTTP API private integration, use `HTTP_PROXY`.
     * 
     */
    public Output<String> integrationType() {
        return this.integrationType;
    }
    /**
     * The URI of the Lambda function for a Lambda proxy integration, when `integration_type` is `AWS_PROXY`.
     * For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
     * 
     */
    @Export(name="integrationUri", type=String.class, parameters={})
    private Output</* @Nullable */ String> integrationUri;

    /**
     * @return The URI of the Lambda function for a Lambda proxy integration, when `integration_type` is `AWS_PROXY`.
     * For an `HTTP` integration, specify a fully-qualified URL. For an HTTP API private integration, specify the ARN of an Application Load Balancer listener, Network Load Balancer listener, or AWS Cloud Map service.
     * 
     */
    public Output<Optional<String>> integrationUri() {
        return Codegen.optional(this.integrationUri);
    }
    /**
     * The pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `request_templates` attribute.
     * Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
     * 
     */
    @Export(name="passthroughBehavior", type=String.class, parameters={})
    private Output</* @Nullable */ String> passthroughBehavior;

    /**
     * @return The pass-through behavior for incoming requests based on the Content-Type header in the request, and the available mapping templates specified as the `request_templates` attribute.
     * Valid values: `WHEN_NO_MATCH`, `WHEN_NO_TEMPLATES`, `NEVER`. Default is `WHEN_NO_MATCH`. Supported only for WebSocket APIs.
     * 
     */
    public Output<Optional<String>> passthroughBehavior() {
        return Codegen.optional(this.passthroughBehavior);
    }
    /**
     * The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
     * 
     */
    @Export(name="payloadFormatVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> payloadFormatVersion;

    /**
     * @return The [format of the payload](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html#http-api-develop-integrations-lambda.proxy-format) sent to an integration. Valid values: `1.0`, `2.0`. Default is `1.0`.
     * 
     */
    public Output<Optional<String>> payloadFormatVersion() {
        return Codegen.optional(this.payloadFormatVersion);
    }
    /**
     * For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the backend.
     * For HTTP APIs with a specified `integration_subtype`, a key-value map specifying parameters that are passed to `AWS_PROXY` integrations.
     * For HTTP APIs without a specified `integration_subtype`, a key-value map specifying how to transform HTTP requests before sending them to the backend.
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
     * 
     */
    @Export(name="requestParameters", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> requestParameters;

    /**
     * @return For WebSocket APIs, a key-value map specifying request parameters that are passed from the method request to the backend.
     * For HTTP APIs with a specified `integration_subtype`, a key-value map specifying parameters that are passed to `AWS_PROXY` integrations.
     * For HTTP APIs without a specified `integration_subtype`, a key-value map specifying how to transform HTTP requests before sending them to the backend.
     * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html) for details.
     * 
     */
    public Output<Optional<Map<String,String>>> requestParameters() {
        return Codegen.optional(this.requestParameters);
    }
    /**
     * A map of [Velocity](https://velocity.apache.org/) templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
     * 
     */
    @Export(name="requestTemplates", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> requestTemplates;

    /**
     * @return A map of [Velocity](https://velocity.apache.org/) templates that are applied on the request payload based on the value of the Content-Type header sent by the client. Supported only for WebSocket APIs.
     * 
     */
    public Output<Optional<Map<String,String>>> requestTemplates() {
        return Codegen.optional(this.requestTemplates);
    }
    /**
     * Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
     * 
     */
    @Export(name="responseParameters", type=List.class, parameters={IntegrationResponseParameter.class})
    private Output</* @Nullable */ List<IntegrationResponseParameter>> responseParameters;

    /**
     * @return Mappings to transform the HTTP response from a backend integration before returning the response to clients. Supported only for HTTP APIs.
     * 
     */
    public Output<Optional<List<IntegrationResponseParameter>>> responseParameters() {
        return Codegen.optional(this.responseParameters);
    }
    /**
     * The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
     * 
     */
    @Export(name="templateSelectionExpression", type=String.class, parameters={})
    private Output</* @Nullable */ String> templateSelectionExpression;

    /**
     * @return The [template selection expression](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-selection-expressions.html#apigateway-websocket-api-template-selection-expressions) for the integration.
     * 
     */
    public Output<Optional<String>> templateSelectionExpression() {
        return Codegen.optional(this.templateSelectionExpression);
    }
    /**
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for HTTP APIs.
     * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * this provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    @Export(name="timeoutMilliseconds", type=Integer.class, parameters={})
    private Output<Integer> timeoutMilliseconds;

    /**
     * @return Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and 30,000 milliseconds for HTTP APIs.
     * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     * this provider will only perform drift detection of its value when present in a configuration.
     * 
     */
    public Output<Integer> timeoutMilliseconds() {
        return this.timeoutMilliseconds;
    }
    /**
     * The TLS configuration for a private integration. Supported only for HTTP APIs.
     * 
     */
    @Export(name="tlsConfig", type=IntegrationTlsConfig.class, parameters={})
    private Output</* @Nullable */ IntegrationTlsConfig> tlsConfig;

    /**
     * @return The TLS configuration for a private integration. Supported only for HTTP APIs.
     * 
     */
    public Output<Optional<IntegrationTlsConfig>> tlsConfig() {
        return Codegen.optional(this.tlsConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Integration(String name) {
        this(name, IntegrationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Integration(String name, IntegrationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Integration(String name, IntegrationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/integration:Integration", name, args == null ? IntegrationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Integration(String name, Output<String> id, @Nullable IntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:apigatewayv2/integration:Integration", name, state, makeResourceOptions(options, id));
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
    public static Integration get(String name, Output<String> id, @Nullable IntegrationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Integration(name, id, state, options);
    }
}