/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.GetServiceLastAccessedDetailsRequest;
import org.openapitools.model.GetServiceLastAccessedDetailsResponse;
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
@Tag(name = "#Action=GetServiceLastAccessedDetails", description = "the #Action=GetServiceLastAccessedDetails API")
public interface ActionGetServiceLastAccessedDetailsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=GetServiceLastAccessedDetails
     * &lt;p&gt;Retrieves a service last accessed report that was created using the &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; operation. You can use the &lt;code&gt;JobId&lt;/code&gt; parameter in &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of Amazon Web Services services that the resource (user, group, role, or managed policy) can access.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; operation returns the reason that it failed.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;User&lt;/b&gt; – Returns the user ARN that you used to generate the report&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Group&lt;/b&gt; – Returns the ARN of the group member (user) that last attempted to access the service&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Role&lt;/b&gt; – Returns the role ARN that you used to generate the report&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Policy&lt;/b&gt; – Returns the ARN of the user or role that last used the policy to attempt to access the service&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;By default, the list is sorted by service namespace.&lt;/p&gt; &lt;p&gt;If you specified &lt;code&gt;ACTION_LEVEL&lt;/code&gt; granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data.&lt;/p&gt; &lt;p&gt;For more information about service and action last accessed data, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
     *
     * @param jobId The ID of the request generated by the &lt;a&gt;GenerateServiceLastAccessedDetails&lt;/a&gt; operation. The &lt;code&gt;JobId&lt;/code&gt; returned by &lt;code&gt;GenerateServiceLastAccessedDetail&lt;/code&gt; must be used by the same role within a session, or by the same user when used to call &lt;code&gt;GetServiceLastAccessedDetail&lt;/code&gt;. (required)
     * @param action  (required)
     * @param version  (required)
     * @param xAmzContentSha256  (optional)
     * @param xAmzDate  (optional)
     * @param xAmzAlgorithm  (optional)
     * @param xAmzCredential  (optional)
     * @param xAmzSecurityToken  (optional)
     * @param xAmzSignature  (optional)
     * @param xAmzSignedHeaders  (optional)
     * @param maxItems &lt;p&gt;Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the &lt;code&gt;IsTruncated&lt;/code&gt; response element is &lt;code&gt;true&lt;/code&gt;.&lt;/p&gt; &lt;p&gt;If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the &lt;code&gt;IsTruncated&lt;/code&gt; response element returns &lt;code&gt;true&lt;/code&gt;, and &lt;code&gt;Marker&lt;/code&gt; contains a value to include in the subsequent call that tells the service where to continue from.&lt;/p&gt; (optional)
     * @param marker Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the &lt;code&gt;Marker&lt;/code&gt; element in the response that you received to indicate where the next call should start. (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or InvalidInputException (status code 481)
     */
    @Operation(
        operationId = "gETGetServiceLastAccessedDetails",
        description = "<p>Retrieves a service last accessed report that was created using the <code>GenerateServiceLastAccessedDetails</code> operation. You can use the <code>JobId</code> parameter in <code>GetServiceLastAccessedDetails</code> to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of Amazon Web Services services that the resource (user, group, role, or managed policy) can access.</p> <note> <p>Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the <code>GetServiceLastAccessedDetails</code> operation returns the reason that it failed.</p> <p>The <code>GetServiceLastAccessedDetails</code> operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:</p> <ul> <li> <p> <b>User</b> – Returns the user ARN that you used to generate the report</p> </li> <li> <p> <b>Group</b> – Returns the ARN of the group member (user) that last attempted to access the service</p> </li> <li> <p> <b>Role</b> – Returns the role ARN that you used to generate the report</p> </li> <li> <p> <b>Policy</b> – Returns the ARN of the user or role that last used the policy to attempt to access the service</p> </li> </ul> <p>By default, the list is sorted by service namespace.</p> <p>If you specified <code>ACTION_LEVEL</code> granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data.</p> <p>For more information about service and action last accessed data, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = GetServiceLastAccessedDetailsResponse.class))
            }),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "InvalidInputException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/#Action=GetServiceLastAccessedDetails",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<GetServiceLastAccessedDetailsResponse> gETGetServiceLastAccessedDetails(
        @NotNull @Size(min = 36, max = 36) @Parameter(name = "JobId", description = "The ID of the request generated by the <a>GenerateServiceLastAccessedDetails</a> operation. The <code>JobId</code> returned by <code>GenerateServiceLastAccessedDetail</code> must be used by the same role within a session, or by the same user when used to call <code>GetServiceLastAccessedDetail</code>.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "JobId", required = true) String jobId,
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Min(1) @Max(1000) @Parameter(name = "MaxItems", description = "<p>Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the <code>IsTruncated</code> response element is <code>true</code>.</p> <p>If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the <code>IsTruncated</code> response element returns <code>true</code>, and <code>Marker</code> contains a value to include in the subsequent call that tells the service where to continue from.</p>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "MaxItems", required = false) Integer maxItems,
        @Pattern(regexp = "[\\u0020-\\u00FF]+") @Size(min = 1, max = 320) @Parameter(name = "Marker", description = "Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the <code>Marker</code> element in the response that you received to indicate where the next call should start.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "Marker", required = false) String marker
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
     * POST /#Action=GetServiceLastAccessedDetails
     * &lt;p&gt;Retrieves a service last accessed report that was created using the &lt;code&gt;GenerateServiceLastAccessedDetails&lt;/code&gt; operation. You can use the &lt;code&gt;JobId&lt;/code&gt; parameter in &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of Amazon Web Services services that the resource (user, group, role, or managed policy) can access.&lt;/p&gt; &lt;note&gt; &lt;p&gt;Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\&quot;&gt;Evaluating policies&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt; &lt;/note&gt; &lt;p&gt;For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; operation returns the reason that it failed.&lt;/p&gt; &lt;p&gt;The &lt;code&gt;GetServiceLastAccessedDetails&lt;/code&gt; operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;User&lt;/b&gt; – Returns the user ARN that you used to generate the report&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Group&lt;/b&gt; – Returns the ARN of the group member (user) that last attempted to access the service&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Role&lt;/b&gt; – Returns the role ARN that you used to generate the report&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;b&gt;Policy&lt;/b&gt; – Returns the ARN of the user or role that last used the policy to attempt to access the service&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;By default, the list is sorted by service namespace.&lt;/p&gt; &lt;p&gt;If you specified &lt;code&gt;ACTION_LEVEL&lt;/code&gt; granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data.&lt;/p&gt; &lt;p&gt;For more information about service and action last accessed data, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\&quot;&gt;Reducing permissions using service last accessed data&lt;/a&gt; in the &lt;i&gt;IAM User Guide&lt;/i&gt;.&lt;/p&gt;
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
     * @param getServiceLastAccessedDetailsRequest  (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or InvalidInputException (status code 481)
     */
    @Operation(
        operationId = "pOSTGetServiceLastAccessedDetails",
        description = "<p>Retrieves a service last accessed report that was created using the <code>GenerateServiceLastAccessedDetails</code> operation. You can use the <code>JobId</code> parameter in <code>GetServiceLastAccessedDetails</code> to retrieve the status of your report job. When the report is complete, you can retrieve the generated report. The report includes a list of Amazon Web Services services that the resource (user, group, role, or managed policy) can access.</p> <note> <p>Service last accessed data does not use other policy types when determining whether a resource could access a service. These other policy types include resource-based policies, access control lists, Organizations policies, IAM permissions boundaries, and STS assume role policies. It only applies permissions policy logic. For more about the evaluation of policy types, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_evaluation-logic.html#policy-eval-basics\">Evaluating policies</a> in the <i>IAM User Guide</i>.</p> </note> <p>For each service that the resource could access using permissions policies, the operation returns details about the most recent access attempt. If there was no attempt, the service is listed without details about the most recent attempt to access the service. If the operation fails, the <code>GetServiceLastAccessedDetails</code> operation returns the reason that it failed.</p> <p>The <code>GetServiceLastAccessedDetails</code> operation returns a list of services. This list includes the number of entities that have attempted to access the service and the date and time of the last attempt. It also returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:</p> <ul> <li> <p> <b>User</b> – Returns the user ARN that you used to generate the report</p> </li> <li> <p> <b>Group</b> – Returns the ARN of the group member (user) that last attempted to access the service</p> </li> <li> <p> <b>Role</b> – Returns the role ARN that you used to generate the report</p> </li> <li> <p> <b>Policy</b> – Returns the ARN of the user or role that last used the policy to attempt to access the service</p> </li> </ul> <p>By default, the list is sorted by service namespace.</p> <p>If you specified <code>ACTION_LEVEL</code> granularity when you generated the report, this operation returns service and action last accessed data. This includes the most recent access attempt for each tracked action within a service. Otherwise, this operation returns only service data.</p> <p>For more information about service and action last accessed data, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_access-advisor.html\">Reducing permissions using service last accessed data</a> in the <i>IAM User Guide</i>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = GetServiceLastAccessedDetailsResponse.class))
            }),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "InvalidInputException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/#Action=GetServiceLastAccessedDetails",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<GetServiceLastAccessedDetailsResponse> pOSTGetServiceLastAccessedDetails(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "GetServiceLastAccessedDetailsRequest", description = "") @Valid @RequestBody(required = false) GetServiceLastAccessedDetailsRequest getServiceLastAccessedDetailsRequest
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
