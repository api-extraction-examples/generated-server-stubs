/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.DeleteSigningCertificateRequest;
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
@Tag(name = "#Action=DeleteSigningCertificate", description = "the #Action=DeleteSigningCertificate API")
public interface ActionDeleteSigningCertificateApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=DeleteSigningCertificate
     * &lt;p&gt;Deletes a signing certificate associated with the specified IAM user.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated IAM users.&lt;/p&gt;
     *
     * @param certificateId &lt;p&gt;The ID of the signing certificate to delete.&lt;/p&gt; &lt;p&gt;The format of this parameter, as described by its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex&lt;/a&gt; pattern, is a string of characters that can be upper- or lower-cased letters or digits.&lt;/p&gt; (required)
     * @param action  (required)
     * @param version  (required)
     * @param xAmzContentSha256  (optional)
     * @param xAmzDate  (optional)
     * @param xAmzAlgorithm  (optional)
     * @param xAmzCredential  (optional)
     * @param xAmzSecurityToken  (optional)
     * @param xAmzSignature  (optional)
     * @param xAmzSignedHeaders  (optional)
     * @param userName &lt;p&gt;The name of the user the signing certificate belongs to.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt; (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or LimitExceededException (status code 481)
     *         or ConcurrentModificationException (status code 482)
     *         or ServiceFailureException (status code 483)
     */
    @Operation(
        operationId = "gETDeleteSigningCertificate",
        description = "<p>Deletes a signing certificate associated with the specified IAM user.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated IAM users.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "LimitExceededException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "ConcurrentModificationException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "483", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/#Action=DeleteSigningCertificate",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<Void> gETDeleteSigningCertificate(
        @NotNull @Pattern(regexp = "[\\w]+") @Size(min = 24, max = 128) @Parameter(name = "CertificateId", description = "<p>The ID of the signing certificate to delete.</p> <p>The format of this parameter, as described by its <a href=\"http://wikipedia.org/wiki/regex\">regex</a> pattern, is a string of characters that can be upper- or lower-cased letters or digits.</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "CertificateId", required = true) String certificateId,
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Pattern(regexp = "[\\w+=,.@-]+") @Size(min = 1, max = 128) @Parameter(name = "UserName", description = "<p>The name of the user the signing certificate belongs to.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "UserName", required = false) String userName
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /#Action=DeleteSigningCertificate
     * &lt;p&gt;Deletes a signing certificate associated with the specified IAM user.&lt;/p&gt; &lt;p&gt;If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated IAM users.&lt;/p&gt;
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
     * @param deleteSigningCertificateRequest  (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or LimitExceededException (status code 481)
     *         or ConcurrentModificationException (status code 482)
     *         or ServiceFailureException (status code 483)
     */
    @Operation(
        operationId = "pOSTDeleteSigningCertificate",
        description = "<p>Deletes a signing certificate associated with the specified IAM user.</p> <p>If you do not specify a user name, IAM determines the user name implicitly based on the Amazon Web Services access key ID signing the request. This operation works for access keys under the Amazon Web Services account. Consequently, you can use this operation to manage Amazon Web Services account root user credentials even if the Amazon Web Services account has no associated IAM users.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "LimitExceededException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "ConcurrentModificationException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "483", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/#Action=DeleteSigningCertificate",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<Void> pOSTDeleteSigningCertificate(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "DeleteSigningCertificateRequest", description = "") @Valid @RequestBody(required = false) DeleteSigningCertificateRequest deleteSigningCertificateRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
