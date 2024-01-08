/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CreateSAMLProviderRequest;
import org.openapitools.model.CreateSAMLProviderResponse;
import org.openapitools.model.Tag;
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
@Tag(name = "#Action=CreateSAMLProvider", description = "the #Action=CreateSAMLProvider API")
public interface ActionCreateSAMLProviderApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=CreateSAMLProvider
     * &lt;p&gt;Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.&lt;/p&gt; &lt;p&gt;The SAML provider resource that you create with this operation can be used as a principal in an IAM role&#39;s trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the Amazon Web Services Management Console or one that supports API access to Amazon Web Services.&lt;/p&gt; &lt;p&gt;When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer&#39;s name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization&#39;s IdP.&lt;/p&gt; &lt;note&gt; &lt;p&gt; This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html\&quot;&gt;Enabling SAML 2.0 federated users to access the Amazon Web Services Management Console&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
     *
     * @param saMLMetadataDocument &lt;p&gt;An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer&#39;s name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization&#39;s IdP.&lt;/p&gt; &lt;p&gt;For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt; &lt;/p&gt; (required)
     * @param name &lt;p&gt;The name of the provider to create.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt; (required)
     * @param action  (required)
     * @param version  (required)
     * @param xAmzContentSha256  (optional)
     * @param xAmzDate  (optional)
     * @param xAmzAlgorithm  (optional)
     * @param xAmzCredential  (optional)
     * @param xAmzSecurityToken  (optional)
     * @param xAmzSignature  (optional)
     * @param xAmzSignedHeaders  (optional)
     * @param tags &lt;p&gt;A list of tags that you want to attach to the new IAM SAML provider. Each tag consists of a key name and an associated value. For more information about tagging, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\&quot;&gt;Tagging IAM resources&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.&lt;/p&gt; &lt;/note&gt; (optional)
     * @return Success (status code 200)
     *         or InvalidInputException (status code 480)
     *         or EntityAlreadyExistsException (status code 481)
     *         or LimitExceededException (status code 482)
     *         or ConcurrentModificationException (status code 483)
     *         or ServiceFailureException (status code 484)
     */
    @Operation(
        operationId = "gETCreateSAMLProvider",
        description = "<p>Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.</p> <p>The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the Amazon Web Services Management Console or one that supports API access to Amazon Web Services.</p> <p>When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.</p> <note> <p> This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note> <p> For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html\">Enabling SAML 2.0 federated users to access the Amazon Web Services Management Console</a> and <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation</a> in the <i>IAM User Guide</i>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = CreateSAMLProviderResponse.class))
            }),
            @ApiResponse(responseCode = "480", description = "InvalidInputException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "EntityAlreadyExistsException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "LimitExceededException", content = {
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
        value = "/#Action=CreateSAMLProvider",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<CreateSAMLProviderResponse> gETCreateSAMLProvider(
        @NotNull @Size(min = 1000, max = 10000000) @Parameter(name = "SAMLMetadataDocument", description = "<p>An XML document generated by an identity provider (IdP) that supports SAML 2.0. The document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that are received from the IdP. You must generate the metadata document using the identity management software that is used as your organization's IdP.</p> <p>For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation</a> in the <i>IAM User Guide</i> </p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "SAMLMetadataDocument", required = true) String saMLMetadataDocument,
        @NotNull @Pattern(regexp = "[\\w._-]+") @Size(min = 1, max = 128) @Parameter(name = "Name", description = "<p>The name of the provider to create.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Name", required = true) String name,
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Size(max = 50) @Parameter(name = "Tags", description = "<p>A list of tags that you want to attach to the new IAM SAML provider. Each tag consists of a key name and an associated value. For more information about tagging, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_tags.html\">Tagging IAM resources</a> in the <i>IAM User Guide</i>.</p> <note> <p>If any one of the tags is invalid or if you exceed the allowed maximum number of tags, then the entire request fails and the resource is not created.</p> </note>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "Tags", required = false) List<@Valid Tag> tags
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("text/xml"))) {
                    String exampleString = "Custom MIME type example not yet supported: text/xml";
                    ApiUtil.setExampleResponse(request, "text/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /#Action=CreateSAMLProvider
     * &lt;p&gt;Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.&lt;/p&gt; &lt;p&gt;The SAML provider resource that you create with this operation can be used as a principal in an IAM role&#39;s trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the Amazon Web Services Management Console or one that supports API access to Amazon Web Services.&lt;/p&gt; &lt;p&gt;When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer&#39;s name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization&#39;s IdP.&lt;/p&gt; &lt;note&gt; &lt;p&gt; This operation requires &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\&quot;&gt;Signature Version 4&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt; For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html\&quot;&gt;Enabling SAML 2.0 federated users to access the Amazon Web Services Management Console&lt;/a&gt; and &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\&quot;&gt;About SAML 2.0-based federation&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
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
     * @param createSAMLProviderRequest  (optional)
     * @return Success (status code 200)
     *         or InvalidInputException (status code 480)
     *         or EntityAlreadyExistsException (status code 481)
     *         or LimitExceededException (status code 482)
     *         or ConcurrentModificationException (status code 483)
     *         or ServiceFailureException (status code 484)
     */
    @Operation(
        operationId = "pOSTCreateSAMLProvider",
        description = "<p>Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.</p> <p>The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can create an IAM role that supports Web-based single sign-on (SSO) to the Amazon Web Services Management Console or one that supports API access to Amazon Web Services.</p> <p>When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That document includes the issuer's name, expiration information, and keys that can be used to validate the SAML authentication response (assertions) that the IdP sends. You must generate the metadata document using the identity management software that is used as your organization's IdP.</p> <note> <p> This operation requires <a href=\"https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html\">Signature Version 4</a>.</p> </note> <p> For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html\">Enabling SAML 2.0 federated users to access the Amazon Web Services Management Console</a> and <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html\">About SAML 2.0-based federation</a> in the <i>IAM User Guide</i>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = CreateSAMLProviderResponse.class))
            }),
            @ApiResponse(responseCode = "480", description = "InvalidInputException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "EntityAlreadyExistsException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "LimitExceededException", content = {
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
        value = "/#Action=CreateSAMLProvider",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<CreateSAMLProviderResponse> pOSTCreateSAMLProvider(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "CreateSAMLProviderRequest", description = "") @Valid @RequestBody(required = false) CreateSAMLProviderRequest createSAMLProviderRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("text/xml"))) {
                    String exampleString = "Custom MIME type example not yet supported: text/xml";
                    ApiUtil.setExampleResponse(request, "text/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}