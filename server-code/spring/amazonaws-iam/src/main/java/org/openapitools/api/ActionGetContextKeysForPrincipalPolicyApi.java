/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.GetContextKeysForPolicyResponse;
import org.openapitools.model.GetContextKeysForPrincipalPolicyRequest;
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
@Tag(name = "#Action=GetContextKeysForPrincipalPolicy", description = "the #Action=GetContextKeysForPrincipalPolicy API")
public interface ActionGetContextKeysForPrincipalPolicyApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=GetContextKeysForPrincipalPolicy
     * &lt;p&gt;Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of.&lt;/p&gt; &lt;p&gt;You can optionally include a list of one or more additional policies, specified as strings. If you want to include &lt;i&gt;only&lt;/i&gt; a list of policies by string, use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; This operation discloses information about the permissions granted to other users. If you do not want users to see other user&#39;s permissions, then consider allowing them to use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use &lt;a&gt;GetContextKeysForPrincipalPolicy&lt;/a&gt; to understand what key names and values you must supply when you call &lt;a&gt;SimulatePrincipalPolicy&lt;/a&gt;.&lt;/p&gt;
     *
     * @param policySourceArn &lt;p&gt;The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a user, the list includes context keys that are found in all policies that are attached to the user. The list also includes all groups that the user is a member of. If you pick a group or a role, then it includes only those context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded form here for clarity, but must be URL encoded to be included as a part of a real HTML request.&lt;/p&gt; &lt;p&gt;For more information about ARNs, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\&quot;&gt;Amazon Resource Names (ARNs)&lt;/a&gt; in the &lt;i&gt;Amazon Web Services General Reference&lt;/i&gt;.&lt;/p&gt; (required)
     * @param action  (required)
     * @param version  (required)
     * @param xAmzContentSha256  (optional)
     * @param xAmzDate  (optional)
     * @param xAmzAlgorithm  (optional)
     * @param xAmzCredential  (optional)
     * @param xAmzSecurityToken  (optional)
     * @param xAmzSignature  (optional)
     * @param xAmzSignedHeaders  (optional)
     * @param policyInputList &lt;p&gt;An optional list of additional policies for which you want the list of context keys that are referenced.&lt;/p&gt; &lt;p&gt;The &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt; used to validate this parameter is a string of characters consisting of the following:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Any printable ASCII character ranging from the space character (&lt;code&gt;\\u0020&lt;/code&gt;) through the end of the ASCII character range&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The printable characters in the Basic Latin and Latin-1 Supplement character set (through &lt;code&gt;\\u00FF&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;The special characters tab (&lt;code&gt;\\u0009&lt;/code&gt;), line feed (&lt;code&gt;\\u000A&lt;/code&gt;), and carriage return (&lt;code&gt;\\u000D&lt;/code&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or InvalidInputException (status code 481)
     */
    @Operation(
        operationId = "gETGetContextKeysForPrincipalPolicy",
        description = "<p>Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of.</p> <p>You can optionally include a list of one or more additional policies, specified as strings. If you want to include <i>only</i> a list of policies by string, use <a>GetContextKeysForCustomPolicy</a> instead.</p> <p> <b>Note:</b> This operation discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use <a>GetContextKeysForCustomPolicy</a> instead.</p> <p>Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use <a>GetContextKeysForPrincipalPolicy</a> to understand what key names and values you must supply when you call <a>SimulatePrincipalPolicy</a>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = GetContextKeysForPolicyResponse.class))
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
        value = "/#Action=GetContextKeysForPrincipalPolicy",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<GetContextKeysForPolicyResponse> gETGetContextKeysForPrincipalPolicy(
        @NotNull @Size(min = 20, max = 2048) @Parameter(name = "PolicySourceArn", description = "<p>The ARN of a user, group, or role whose policies contain the context keys that you want listed. If you specify a user, the list includes context keys that are found in all policies that are attached to the user. The list also includes all groups that the user is a member of. If you pick a group or a role, then it includes only those context keys that are found in policies attached to that entity. Note that all parameters are shown in unencoded form here for clarity, but must be URL encoded to be included as a part of a real HTML request.</p> <p>For more information about ARNs, see <a href=\"https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html\">Amazon Resource Names (ARNs)</a> in the <i>Amazon Web Services General Reference</i>.</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "PolicySourceArn", required = true) String policySourceArn,
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "PolicyInputList", description = "<p>An optional list of additional policies for which you want the list of context keys that are referenced.</p> <p>The <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a> used to validate this parameter is a string of characters consisting of the following:</p> <ul> <li> <p>Any printable ASCII character ranging from the space character (<code>\\u0020</code>) through the end of the ASCII character range</p> </li> <li> <p>The printable characters in the Basic Latin and Latin-1 Supplement character set (through <code>\\u00FF</code>)</p> </li> <li> <p>The special characters tab (<code>\\u0009</code>), line feed (<code>\\u000A</code>), and carriage return (<code>\\u000D</code>)</p> </li> </ul>", in = ParameterIn.QUERY) @Valid @RequestParam(value = "PolicyInputList", required = false) List<@Valid String> policyInputList
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
     * POST /#Action=GetContextKeysForPrincipalPolicy
     * &lt;p&gt;Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of.&lt;/p&gt; &lt;p&gt;You can optionally include a list of one or more additional policies, specified as strings. If you want to include &lt;i&gt;only&lt;/i&gt; a list of policies by string, use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; This operation discloses information about the permissions granted to other users. If you do not want users to see other user&#39;s permissions, then consider allowing them to use &lt;a&gt;GetContextKeysForCustomPolicy&lt;/a&gt; instead.&lt;/p&gt; &lt;p&gt;Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use &lt;a&gt;GetContextKeysForPrincipalPolicy&lt;/a&gt; to understand what key names and values you must supply when you call &lt;a&gt;SimulatePrincipalPolicy&lt;/a&gt;.&lt;/p&gt;
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
     * @param getContextKeysForPrincipalPolicyRequest  (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or InvalidInputException (status code 481)
     */
    @Operation(
        operationId = "pOSTGetContextKeysForPrincipalPolicy",
        description = "<p>Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all of the policies attached to groups that the user is a member of.</p> <p>You can optionally include a list of one or more additional policies, specified as strings. If you want to include <i>only</i> a list of policies by string, use <a>GetContextKeysForCustomPolicy</a> instead.</p> <p> <b>Note:</b> This operation discloses information about the permissions granted to other users. If you do not want users to see other user's permissions, then consider allowing them to use <a>GetContextKeysForCustomPolicy</a> instead.</p> <p>Context keys are variables maintained by Amazon Web Services and its services that provide details about the context of an API query request. Context keys can be evaluated by testing against a value in an IAM policy. Use <a>GetContextKeysForPrincipalPolicy</a> to understand what key names and values you must supply when you call <a>SimulatePrincipalPolicy</a>.</p>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = GetContextKeysForPolicyResponse.class))
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
        value = "/#Action=GetContextKeysForPrincipalPolicy",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<GetContextKeysForPolicyResponse> pOSTGetContextKeysForPrincipalPolicy(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "GetContextKeysForPrincipalPolicyRequest", description = "") @Valid @RequestBody(required = false) GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest
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
