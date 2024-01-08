/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.DeactivateMFADeviceRequest;
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
@Tag(name = "#Action=DeactivateMFADevice", description = "the #Action=DeactivateMFADevice API")
public interface ActionDeactivateMFADeviceApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=DeactivateMFADevice
     * &lt;p&gt;Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.&lt;/p&gt; &lt;p&gt;For more information about creating and working with virtual MFA devices, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\&quot;&gt;Enabling a virtual multi-factor authentication (MFA) device&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
     *
     * @param userName &lt;p&gt;The name of the user whose MFA device you want to deactivate.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt; (required)
     * @param serialNumber &lt;p&gt;The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: &#x3D;,.@:/-&lt;/p&gt; (required)
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
     *         or EntityTemporarilyUnmodifiableException (status code 480)
     *         or NoSuchEntityException (status code 481)
     *         or LimitExceededException (status code 482)
     *         or ServiceFailureException (status code 483)
     *         or ConcurrentModificationException (status code 484)
     */
    @Operation(
        operationId = "gETDeactivateMFADevice",
        description = "<p>Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.</p> <p>For more information about creating and working with virtual MFA devices, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\">Enabling a virtual multi-factor authentication (MFA) device</a> in the <i>IAM User Guide</i>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "EntityTemporarilyUnmodifiableException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "LimitExceededException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "483", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "484", description = "ConcurrentModificationException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/#Action=DeactivateMFADevice",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<Void> gETDeactivateMFADevice(
        @NotNull @Pattern(regexp = "[\\w+=,.@-]+") @Size(min = 1, max = 128) @Parameter(name = "UserName", description = "<p>The name of the user whose MFA device you want to deactivate.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "UserName", required = true) String userName,
        @NotNull @Pattern(regexp = "[\\w+=/:,.@-]+") @Size(min = 9, max = 256) @Parameter(name = "SerialNumber", description = "<p>The serial number that uniquely identifies the MFA device. For virtual MFA devices, the serial number is the device ARN.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: =,.@:/-</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "SerialNumber", required = true) String serialNumber,
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
     * POST /#Action=DeactivateMFADevice
     * &lt;p&gt;Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.&lt;/p&gt; &lt;p&gt;For more information about creating and working with virtual MFA devices, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\&quot;&gt;Enabling a virtual multi-factor authentication (MFA) device&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
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
     * @param deactivateMFADeviceRequest  (optional)
     * @return Success (status code 200)
     *         or EntityTemporarilyUnmodifiableException (status code 480)
     *         or NoSuchEntityException (status code 481)
     *         or LimitExceededException (status code 482)
     *         or ServiceFailureException (status code 483)
     *         or ConcurrentModificationException (status code 484)
     */
    @Operation(
        operationId = "pOSTDeactivateMFADevice",
        description = "<p>Deactivates the specified MFA device and removes it from association with the user name for which it was originally enabled.</p> <p>For more information about creating and working with virtual MFA devices, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html\">Enabling a virtual multi-factor authentication (MFA) device</a> in the <i>IAM User Guide</i>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "EntityTemporarilyUnmodifiableException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "LimitExceededException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "483", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "484", description = "ConcurrentModificationException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/#Action=DeactivateMFADevice",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<Void> pOSTDeactivateMFADevice(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "DeactivateMFADeviceRequest", description = "") @Valid @RequestBody(required = false) DeactivateMFADeviceRequest deactivateMFADeviceRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
