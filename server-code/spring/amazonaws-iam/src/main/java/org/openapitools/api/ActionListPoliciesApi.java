/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ListPoliciesRequest;
import org.openapitools.model.ListPoliciesResponse;
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
@Tag(name = "#Action=ListPolicies", description = "the #Action=ListPolicies API")
public interface ActionListPoliciesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=ListPolicies
     * &lt;p&gt;Lists all the managed policies that are available in your Amazon Web Services account, including your own customer-defined managed policies and all Amazon Web Services managed policies.&lt;/p&gt; &lt;p&gt;You can filter the list of policies that is returned using the optional &lt;code&gt;OnlyAttached&lt;/code&gt;, &lt;code&gt;Scope&lt;/code&gt;, and &lt;code&gt;PathPrefix&lt;/code&gt; parameters. For example, to list only the customer managed policies in your Amazon Web Services account, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;Local&lt;/code&gt;. To list only Amazon Web Services managed policies, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;AWS&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;For more information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a customer manged policy, see &lt;a&gt;GetPolicy&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt;
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
     * @param scope &lt;p&gt;The scope to use for filtering the results.&lt;/p&gt; &lt;p&gt;To list only Amazon Web Services managed policies, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;AWS&lt;/code&gt;. To list only the customer managed policies in your Amazon Web Services account, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;Local&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, or if it is set to &lt;code&gt;All&lt;/code&gt;, all policies are returned.&lt;/p&gt; (optional)
     * @param onlyAttached &lt;p&gt;A flag to filter the results to only the attached policies.&lt;/p&gt; &lt;p&gt;When &lt;code&gt;OnlyAttached&lt;/code&gt; is &lt;code&gt;true&lt;/code&gt;, the returned list contains only the policies that are attached to an IAM user, group, or role. When &lt;code&gt;OnlyAttached&lt;/code&gt; is &lt;code&gt;false&lt;/code&gt;, or when the parameter is not included, all policies are returned.&lt;/p&gt; (optional)
     * @param pathPrefix The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies. This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (&lt;code&gt;\\u0021&lt;/code&gt;) through the DEL character (&lt;code&gt;\\u007F&lt;/code&gt;), including most punctuation characters, digits, and upper and lowercased letters. (optional)
     * @param policyUsageFilter &lt;p&gt;The policy usage method to use for filtering the results.&lt;/p&gt; &lt;p&gt;To list only permissions policies, set &lt;code&gt;PolicyUsageFilter&lt;/code&gt; to &lt;code&gt;PermissionsPolicy&lt;/code&gt;. To list only the policies used to set permissions boundaries, set the value to &lt;code&gt;PermissionsBoundary&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;This parameter is optional. If it is not included, all policies are returned. &lt;/p&gt; (optional)
     * @param marker Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start. (optional)
     * @param maxItems &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt; (optional)
     * @return Success (status code 200)
     *         or ServiceFailureException (status code 480)
     */
    @Operation(
        operationId = "gETListPolicies",
        description = "<p>Lists all the managed policies that are available in your Amazon Web Services account, including your own customer-defined managed policies and all Amazon Web Services managed policies.</p> <p>You can filter the list of policies that is returned using the optional <code>OnlyAttached</code>, <code>Scope</code>, and <code>PathPrefix</code> parameters. For example, to list only the customer managed policies in your Amazon Web Services account, set <code>Scope</code> to <code>Local</code>. To list only Amazon Web Services managed policies, set <code>Scope</code> to <code>AWS</code>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>For more information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a customer manged policy, see <a>GetPolicy</a>.</p> </note>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = ListPoliciesResponse.class))
            }),
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
        value = "/#Action=ListPolicies",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<ListPoliciesResponse> gETListPolicies(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "Scope", description = "<p>The scope to use for filtering the results.</p> <p>To list only Amazon Web Services managed policies, set <code>Scope</code> to <code>AWS</code>. To list only the customer managed policies in your Amazon Web Services account, set <code>Scope</code> to <code>Local</code>.</p> <p>This parameter is optional. If it is not included, or if it is set to <code>All</code>, all policies are returned.</p>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "Scope", required = false) String scope,
        @Parameter(name = "OnlyAttached", description = "<p>A flag to filter the results to only the attached policies.</p> <p>When <code>OnlyAttached</code> is <code>true</code>, the returned list contains only the policies that are attached to an IAM user, group, or role. When <code>OnlyAttached</code> is <code>false</code>, or when the parameter is not included, all policies are returned.</p>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "OnlyAttached", required = false) Boolean onlyAttached,
        @Pattern(regexp = "((/[A-Za-z0-9\\.,\\+@=_-]+)*)/") @Size(min = 1, max = 512) @Parameter(name = "PathPrefix", description = "The path prefix for filtering the results. This parameter is optional. If it is not included, it defaults to a slash (/), listing all policies. This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (<code>\\u0021</code>) through the DEL character (<code>\\u007F</code>), including most punctuation characters, digits, and upper and lowercased letters.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "PathPrefix", required = false) String pathPrefix,
        @Parameter(name = "PolicyUsageFilter", description = "<p>The policy usage method to use for filtering the results.</p> <p>To list only permissions policies, set <code>PolicyUsageFilter</code> to <code>PermissionsPolicy</code>. To list only the policies used to set permissions boundaries, set the value to <code>PermissionsBoundary</code>.</p> <p>This parameter is optional. If it is not included, all policies are returned. </p>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "PolicyUsageFilter", required = false) String policyUsageFilter,
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
     * POST /#Action=ListPolicies
     * &lt;p&gt;Lists all the managed policies that are available in your Amazon Web Services account, including your own customer-defined managed policies and all Amazon Web Services managed policies.&lt;/p&gt; &lt;p&gt;You can filter the list of policies that is returned using the optional &lt;code&gt;OnlyAttached&lt;/code&gt;, &lt;code&gt;Scope&lt;/code&gt;, and &lt;code&gt;PathPrefix&lt;/code&gt; parameters. For example, to list only the customer managed policies in your Amazon Web Services account, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;Local&lt;/code&gt;. To list only Amazon Web Services managed policies, set &lt;code&gt;Scope&lt;/code&gt; to &lt;code&gt;AWS&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;You can paginate the results using the &lt;code&gt;MaxItems&lt;/code&gt; and &lt;code&gt;Marker&lt;/code&gt; parameters.&lt;/p&gt; &lt;p&gt;For more information about managed policies, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\&quot;&gt;Managed policies and inline policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;note&gt; &lt;p&gt;IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a customer manged policy, see &lt;a&gt;GetPolicy&lt;/a&gt;.&lt;/p&gt; &lt;/note&gt;
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
     * @param listPoliciesRequest  (optional)
     * @return Success (status code 200)
     *         or ServiceFailureException (status code 480)
     */
    @Operation(
        operationId = "pOSTListPolicies",
        description = "<p>Lists all the managed policies that are available in your Amazon Web Services account, including your own customer-defined managed policies and all Amazon Web Services managed policies.</p> <p>You can filter the list of policies that is returned using the optional <code>OnlyAttached</code>, <code>Scope</code>, and <code>PathPrefix</code> parameters. For example, to list only the customer managed policies in your Amazon Web Services account, set <code>Scope</code> to <code>Local</code>. To list only Amazon Web Services managed policies, set <code>Scope</code> to <code>AWS</code>.</p> <p>You can paginate the results using the <code>MaxItems</code> and <code>Marker</code> parameters.</p> <p>For more information about managed policies, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html\">Managed policies and inline policies</a> in the <i>IAM User Guide</i>.</p> <note> <p>IAM resource-listing operations return a subset of the available attributes for the resource. For example, this operation does not return tags, even though they are an attribute of the returned object. To view all of the information for a customer manged policy, see <a>GetPolicy</a>.</p> </note>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = ListPoliciesResponse.class))
            }),
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
        value = "/#Action=ListPolicies",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<ListPoliciesResponse> pOSTListPolicies(
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
        @Parameter(name = "ListPoliciesRequest", description = "") @Valid @RequestBody(required = false) ListPoliciesRequest listPoliciesRequest
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
