/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ListPolicyVersionsRequest;
import org.openapitools.model.ListPolicyVersionsResponse;
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
@Tag(name = "#Action=ListPolicyVersions", description = "the #Action=ListPolicyVersions API")
public interface ActionListPolicyVersionsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=ListPolicyVersions
     * &lt;p&gt;Lists information about the versions of the specified managed policy, including the version that is currently set as the policy&#39;s default version.&lt;/p&gt; &lt;p&gt;For more information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
     *
     * @param policyArn &lt;p&gt;The Amazon Resource Name (ARN) of the IAM policy for which you want the versions.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt; (required)
     * @param action  (required)
     * @param version  (required)
     * @param xAmzContentSha256  (optional)
     * @param xAmzDate  (optional)
     * @param xAmzAlgorithm  (optional)
     * @param xAmzCredential  (optional)
     * @param xAmzSecurityToken  (optional)
     * @param xAmzSignature  (optional)
     * @param xAmzSignedHeaders  (optional)
     * @param marker Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start. (optional)
     * @param maxItems &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt; (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or InvalidInputException (status code 481)
     *         or ServiceFailureException (status code 482)
     */
    @Operation(
        operationId = "gETListPolicyVersions",
        description = "<p>Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version.</p> <p>For more information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = ListPolicyVersionsResponse.class))
            }),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "InvalidInputException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/#Action=ListPolicyVersions",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<ListPolicyVersionsResponse> gETListPolicyVersions(
        @NotNull @Size(min = 20, max = 2048) @Parameter(name = "PolicyArn", description = "<p>The Amazon Resource Name (ARN) of the IAM policy for which you want the versions.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "PolicyArn", required = true) String policyArn,
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Pattern(regexp = "[\\u0020-\\u00FF]+") @Size(min = 1, max = 320) @Parameter(name = "Marker", description = "Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "Marker", required = false) String marker,
        @Min(1) @Max(1000) @Parameter(name = "MaxItems", description = "<p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "MaxItems", required = false) Integer maxItems
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
     * POST /#Action=ListPolicyVersions
     * &lt;p&gt;Lists information about the versions of the specified managed policy, including the version that is currently set as the policy&#39;s default version.&lt;/p&gt; &lt;p&gt;For more information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
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
     * @param maxItems Pagination limit (optional)
     * @param marker Pagination token (optional)
     * @param listPolicyVersionsRequest  (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or InvalidInputException (status code 481)
     *         or ServiceFailureException (status code 482)
     */
    @Operation(
        operationId = "pOSTListPolicyVersions",
        description = "<p>Lists information about the versions of the specified managed policy, including the version that is currently set as the policy's default version.</p> <p>For more information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = ListPolicyVersionsResponse.class))
            }),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "InvalidInputException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/#Action=ListPolicyVersions",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<ListPolicyVersionsResponse> pOSTListPolicyVersions(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "MaxItems", description = "Pagination limit", in = ParameterIn.QUERY) @Valid @RequestParam(value = "MaxItems", required = false) String maxItems,
        @Parameter(name = "Marker", description = "Pagination token", in = ParameterIn.QUERY) @Valid @RequestParam(value = "Marker", required = false) String marker,
        @Parameter(name = "ListPolicyVersionsRequest", description = "") @Valid @RequestBody(required = false) ListPolicyVersionsRequest listPolicyVersionsRequest
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
