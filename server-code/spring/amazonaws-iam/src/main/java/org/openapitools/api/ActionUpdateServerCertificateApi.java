/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.UpdateServerCertificateRequest;
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
@Tag(name = "#Action=UpdateServerCertificate", description = "the #Action=UpdateServerCertificate API")
public interface ActionUpdateServerCertificateApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=UpdateServerCertificate
     * &lt;p&gt;Updates the name and/or the path of the specified server certificate stored in IAM.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;important&gt; &lt;p&gt;You should understand the implications of changing a server certificate&#39;s path or name. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts\&quot;&gt;Renaming a server certificate&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;note&gt; &lt;p&gt;The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named &lt;code&gt;ProductionCert&lt;/code&gt; to &lt;code&gt;ProdCert&lt;/code&gt;, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the &lt;code&gt;ProductionCert&lt;/code&gt; group, but not the &lt;code&gt;ProdCert&lt;/code&gt; certificate, then the update fails. For more information about permissions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\&quot;&gt;Access management&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt;
     *
     * @param serverCertificateName &lt;p&gt;The name of the server certificate that you want to update.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt; (required)
     * @param action  (required)
     * @param version  (required)
     * @param xAmzContentSha256  (optional)
     * @param xAmzDate  (optional)
     * @param xAmzAlgorithm  (optional)
     * @param xAmzCredential  (optional)
     * @param xAmzSecurityToken  (optional)
     * @param xAmzSignature  (optional)
     * @param xAmzSignedHeaders  (optional)
     * @param newPath &lt;p&gt;The new path for the server certificate. Include this only if you are updating the server certificate&#39;s path.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters.&lt;/p&gt; (optional)
     * @param newServerCertificateName &lt;p&gt;The new name for the server certificate. Include this only if you are updating the server certificate&#39;s name. The name of the certificate cannot contain any spaces.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt; (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or EntityAlreadyExistsException (status code 481)
     *         or LimitExceededException (status code 482)
     *         or ServiceFailureException (status code 483)
     */
    @Operation(
        operationId = "gETUpdateServerCertificate",
        description = "<p>Updates the name and/or the path of the specified server certificate stored in IAM.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <important> <p>You should understand the implications of changing a server certificate's path or name. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts\">Renaming a server certificate</a> in the <i>IAM User Guide</i>.</p> </important> <note> <p>The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named <code>ProductionCert</code> to <code>ProdCert</code>, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the <code>ProductionCert</code> group, but not the <code>ProdCert</code> certificate, then the update fails. For more information about permissions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\">Access management</a> in the <i>IAM User Guide</i>.</p> </note>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "EntityAlreadyExistsException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "LimitExceededException", content = {
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
        value = "/#Action=UpdateServerCertificate",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<Void> gETUpdateServerCertificate(
        @NotNull @Pattern(regexp = "[\\w+=,.@-]+") @Size(min = 1, max = 128) @Parameter(name = "ServerCertificateName", description = "<p>The name of the server certificate that you want to update.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "ServerCertificateName", required = true) String serverCertificateName,
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Pattern(regexp = "(\\u002F)|(\\u002F[\\u0021-\\u007E]+\\u002F)") @Size(min = 1, max = 512) @Parameter(name = "NewPath", description = "<p>The new path for the server certificate. Include this only if you are updating the server certificate's path.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.</p>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "NewPath", required = false) String newPath,
        @Pattern(regexp = "[\\w+=,.@-]+") @Size(min = 1, max = 128) @Parameter(name = "NewServerCertificateName", description = "<p>The new name for the server certificate. Include this only if you are updating the server certificate's name. The name of the certificate cannot contain any spaces.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "NewServerCertificateName", required = false) String newServerCertificateName
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /#Action=UpdateServerCertificate
     * &lt;p&gt;Updates the name and/or the path of the specified server certificate stored in IAM.&lt;/p&gt; &lt;p&gt;For more information about working with server certificates, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\&quot;&gt;Working with server certificates&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.&lt;/p&gt; &lt;important&gt; &lt;p&gt;You should understand the implications of changing a server certificate&#39;s path or name. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts\&quot;&gt;Renaming a server certificate&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/important&gt; &lt;note&gt; &lt;p&gt;The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named &lt;code&gt;ProductionCert&lt;/code&gt; to &lt;code&gt;ProdCert&lt;/code&gt;, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the &lt;code&gt;ProductionCert&lt;/code&gt; group, but not the &lt;code&gt;ProdCert&lt;/code&gt; certificate, then the update fails. For more information about permissions, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\&quot;&gt;Access management&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt;
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
     * @param updateServerCertificateRequest  (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or EntityAlreadyExistsException (status code 481)
     *         or LimitExceededException (status code 482)
     *         or ServiceFailureException (status code 483)
     */
    @Operation(
        operationId = "pOSTUpdateServerCertificate",
        description = "<p>Updates the name and/or the path of the specified server certificate stored in IAM.</p> <p>For more information about working with server certificates, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html\">Working with server certificates</a> in the <i>IAM User Guide</i>. This topic also includes a list of Amazon Web Services services that can use the server certificates that you manage with IAM.</p> <important> <p>You should understand the implications of changing a server certificate's path or name. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts\">Renaming a server certificate</a> in the <i>IAM User Guide</i>.</p> </important> <note> <p>The person making the request (the principal), must have permission to change the server certificate with the old name and the new name. For example, to change the certificate named <code>ProductionCert</code> to <code>ProdCert</code>, the principal must have a policy that allows them to update both certificates. If the principal has permission to update the <code>ProductionCert</code> group, but not the <code>ProdCert</code> certificate, then the update fails. For more information about permissions, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access.html\">Access management</a> in the <i>IAM User Guide</i>.</p> </note>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "EntityAlreadyExistsException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "LimitExceededException", content = {
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
        value = "/#Action=UpdateServerCertificate",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<Void> pOSTUpdateServerCertificate(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "UpdateServerCertificateRequest", description = "") @Valid @RequestBody(required = false) UpdateServerCertificateRequest updateServerCertificateRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
