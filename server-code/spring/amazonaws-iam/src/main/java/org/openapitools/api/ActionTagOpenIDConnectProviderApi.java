/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Tag;
import org.openapitools.model.TagOpenIDConnectProviderRequest;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "#Action=TagOpenIDConnectProvider", description = "the #Action=TagOpenIDConnectProvider API")
public interface ActionTagOpenIDConnectProviderApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=TagOpenIDConnectProvider
     * &lt;p&gt;Adds one or more tags to an OpenID Connect (OIDC)-compatible identity provider. For more information about these providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an OIDC provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt;
     *
     * @param openIDConnectProviderArn &lt;p&gt;The ARN of the OIDC identity provider in IAM to which you want to add tags.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt; (required)
     * @param tags The list of tags that you want to attach to the OIDC identity provider in IAM. Each tag consists of a key name and an associated value. (required)
     * @param action  (required)
     * @param version  (required)
     * @param xAmzContentSha256  (optional)
     * @param xAmzDate  (optional)
     * @param xAmzAlgorithm  (optional)
     * @param xAmzCredential  (optional)
     * @param xAmzSecurityToken  (optional)
     * @param xAmzSignature  (optional)
     * @param xAmzSignedHeaders  (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or LimitExceededException (status code 481)
     *         or InvalidInputException (status code 482)
     *         or ConcurrentModificationException (status code 483)
     *         or ServiceFailureException (status code 484)
     */
    @Operation(
        operationId = "gETTagOpenIDConnectProvider",
        description = "<p>Adds one or more tags to an OpenID Connect (OIDC)-compatible identity provider. For more information about these providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an OIDC provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "LimitExceededException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "InvalidInputException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "483", description = "ConcurrentModificationException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "484", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/#Action=TagOpenIDConnectProvider",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<Void> gETTagOpenIDConnectProvider(
        @NotNull @Size(min = 20, max = 2048) @Parameter(name = "OpenIDConnectProviderArn", description = "<p>The ARN of the OIDC identity provider in IAM to which you want to add tags.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "OpenIDConnectProviderArn", required = true) String openIDConnectProviderArn,
        @NotNull @Size(max = 50) @Parameter(name = "Tags", description = "The list of tags that you want to attach to the OIDC identity provider in IAM. Each tag consists of a key name and an associated value.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Tags", required = true) List<@Valid Tag> tags,
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /#Action=TagOpenIDConnectProvider
     * &lt;p&gt;Adds one or more tags to an OpenID Connect (OIDC)-compatible identity provider. For more information about these providers, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\&quot;&gt;About web identity federation&lt;/a&gt;. If a tag with the same key name already exists, then that tag is overwritten with the new value.&lt;/p&gt; &lt;p&gt;A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Administrative grouping and discovery&lt;/b&gt; - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name &lt;i&gt;Project&lt;/i&gt; and the value &lt;i&gt;MyImportantProject&lt;/i&gt;. Or search for all resources with the key name &lt;i&gt;Cost Center&lt;/i&gt; and the value &lt;i&gt;41200&lt;/i&gt;. &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Access control&lt;/b&gt; - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an OIDC provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\&quot;&gt;Control access using IAM tags&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Amazon Web Services always interprets the tag &lt;code&gt;Value&lt;/code&gt; as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;/note&gt;
     *
     * @param action  (required)
     * @param version  (required)
     * @param xAmzContentSha256  (optional)
     * @param xAmzDate  (optional)
     * @param xAmzAlgorithm  (optional)
     * @param xAmzCredential  (optional)
     * @param xAmzSecurityToken  (optional)
     * @param xAmzSignature  (optional)
     * @param xAmzSignedHeaders  (optional)
     * @param tagOpenIDConnectProviderRequest  (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or LimitExceededException (status code 481)
     *         or InvalidInputException (status code 482)
     *         or ConcurrentModificationException (status code 483)
     *         or ServiceFailureException (status code 484)
     */
    @Operation(
        operationId = "pOSTTagOpenIDConnectProvider",
        description = "<p>Adds one or more tags to an OpenID Connect (OIDC)-compatible identity provider. For more information about these providers, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_oidc.html\">About web identity federation</a>. If a tag with the same key name already exists, then that tag is overwritten with the new value.</p> <p>A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the following:</p> <ul> <li> <p> <b>Administrative grouping and discovery</b> - Attach tags to resources to aid in organization and search. For example, you could search for all resources with the key name <i>Project</i> and the value <i>MyImportantProject</i>. Or search for all resources with the key name <i>Cost Center</i> and the value <i>41200</i>. </p> </li> <li> <p> <b>Access control</b> - Include tags in IAM identity-based and resource-based policies. You can use tags to restrict access to only an OIDC provider that has a specified tag attached. For examples of policies that show how to use tags to control access, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_tags.html\">Control access using IAM tags</a> in the <i>IAM User Guide</i>.</p> </li> </ul> <note> <ul> <li> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> </li> <li> <p>Amazon Web Services always interprets the tag <code>Value</code> as a single string. If you need to store an array, you can store comma-separated values in the string. However, you must interpret the value in your code.</p> </li> </ul> </note>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "LimitExceededException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "InvalidInputException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "483", description = "ConcurrentModificationException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "484", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/#Action=TagOpenIDConnectProvider",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<Void> pOSTTagOpenIDConnectProvider(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "TagOpenIDConnectProviderRequest", description = "") @Valid @RequestBody(required = false) TagOpenIDConnectProviderRequest tagOpenIDConnectProviderRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
