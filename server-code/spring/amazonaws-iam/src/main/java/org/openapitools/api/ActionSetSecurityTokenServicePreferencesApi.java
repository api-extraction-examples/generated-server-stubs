/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.SetSecurityTokenServicePreferencesRequest;
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
@Tag(name = "#Action=SetSecurityTokenServicePreferences", description = "the #Action=SetSecurityTokenServicePreferences API")
public interface ActionSetSecurityTokenServicePreferencesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=SetSecurityTokenServicePreferences
     * &lt;p&gt;Sets the specified version of the global endpoint token as the token version used for the Amazon Web Services account.&lt;/p&gt; &lt;p&gt;By default, Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at &lt;code&gt;https://sts.amazonaws.com&lt;/code&gt;. Amazon Web Services recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/sts.html\&quot;&gt;Security Token Service endpoints and quotas&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\&quot;&gt;Activating and deactivating STS in an Amazon Web Services Region&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;To view the current session token version, see the &lt;code&gt;GlobalEndpointTokenVersion&lt;/code&gt; entry in the response of the &lt;a&gt;GetAccountSummary&lt;/a&gt; operation.&lt;/p&gt;
     *
     * @param globalEndpointTokenVersion &lt;p&gt;The version of the global endpoint token. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens.&lt;/p&gt; &lt;p&gt;For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\&quot;&gt;Activating and deactivating STS in an Amazon Web Services Region&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; (required)
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
     *         or ServiceFailureException (status code 480)
     */
    @Operation(
        operationId = "gETSetSecurityTokenServicePreferences",
        description = "<p>Sets the specified version of the global endpoint token as the token version used for the Amazon Web Services account.</p> <p>By default, Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at <code>https://sts.amazonaws.com</code>. Amazon Web Services recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/sts.html\">Security Token Service endpoints and quotas</a> in the <i>Amazon Web Services General Reference</i>.</p> <p>If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\">Activating and deactivating STS in an Amazon Web Services Region</a> in the <i>IAM User Guide</i>.</p> <p>To view the current session token version, see the <code>GlobalEndpointTokenVersion</code> entry in the response of the <a>GetAccountSummary</a> operation.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/#Action=SetSecurityTokenServicePreferences",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<Void> gETSetSecurityTokenServicePreferences(
        @NotNull @Parameter(name = "GlobalEndpointTokenVersion", description = "<p>The version of the global endpoint token. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens.</p> <p>For information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\">Activating and deactivating STS in an Amazon Web Services Region</a> in the <i>IAM User Guide</i>.</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "GlobalEndpointTokenVersion", required = true) String globalEndpointTokenVersion,
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
     * POST /#Action=SetSecurityTokenServicePreferences
     * &lt;p&gt;Sets the specified version of the global endpoint token as the token version used for the Amazon Web Services account.&lt;/p&gt; &lt;p&gt;By default, Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at &lt;code&gt;https://sts.amazonaws.com&lt;/code&gt;. Amazon Web Services recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/sts.html\&quot;&gt;Security Token Service endpoints and quotas&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\&quot;&gt;Activating and deactivating STS in an Amazon Web Services Region&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;p&gt;To view the current session token version, see the &lt;code&gt;GlobalEndpointTokenVersion&lt;/code&gt; entry in the response of the &lt;a&gt;GetAccountSummary&lt;/a&gt; operation.&lt;/p&gt;
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
     * @param setSecurityTokenServicePreferencesRequest  (optional)
     * @return Success (status code 200)
     *         or ServiceFailureException (status code 480)
     */
    @Operation(
        operationId = "pOSTSetSecurityTokenServicePreferences",
        description = "<p>Sets the specified version of the global endpoint token as the token version used for the Amazon Web Services account.</p> <p>By default, Security Token Service (STS) is available as a global service, and all STS requests go to a single endpoint at <code>https://sts.amazonaws.com</code>. Amazon Web Services recommends using Regional STS endpoints to reduce latency, build in redundancy, and increase session token availability. For information about Regional endpoints for STS, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/sts.html\">Security Token Service endpoints and quotas</a> in the <i>Amazon Web Services General Reference</i>.</p> <p>If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in Amazon Web Services Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect systems where you temporarily store tokens. For information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html\">Activating and deactivating STS in an Amazon Web Services Region</a> in the <i>IAM User Guide</i>.</p> <p>To view the current session token version, see the <code>GlobalEndpointTokenVersion</code> entry in the response of the <a>GetAccountSummary</a> operation.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/#Action=SetSecurityTokenServicePreferences",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<Void> pOSTSetSecurityTokenServicePreferences(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "SetSecurityTokenServicePreferencesRequest", description = "") @Valid @RequestBody(required = false) SetSecurityTokenServicePreferencesRequest setSecurityTokenServicePreferencesRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}