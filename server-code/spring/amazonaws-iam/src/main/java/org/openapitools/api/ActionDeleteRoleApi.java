/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.DeleteRoleRequest;
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
@Tag(name = "#Action=DeleteRole", description = "the #Action=DeleteRole API")
public interface ActionDeleteRoleApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /#Action=DeleteRole
     * &lt;p&gt;Deletes the specified role. Unlike the Amazon Web Services Management Console, when you delete a role programmatically, you must delete the items attached to the role manually, or the deletion fails. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_manage_delete.html#roles-managingrole-deleting-cli\&quot;&gt;Deleting an IAM role&lt;/a&gt;. Before attempting to delete a role, remove the following attached items: &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Inline policies (&lt;a&gt;DeleteRolePolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Attached managed policies (&lt;a&gt;DetachRolePolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Instance profile (&lt;a&gt;RemoveRoleFromInstanceProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Optional – Delete instance profile after detaching from role for resource clean up (&lt;a&gt;DeleteInstanceProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;important&gt; &lt;p&gt;Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.&lt;/p&gt; &lt;/important&gt;
     *
     * @param roleName &lt;p&gt;The name of the role to delete.&lt;/p&gt; &lt;p&gt;This parameter allows (through its &lt;a href&#x3D;\&quot;http://wikipedia.org/wiki/regex\&quot;&gt;regex pattern&lt;/a&gt;) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+&#x3D;,.@-&lt;/p&gt; (required)
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
     *         or DeleteConflictException (status code 481)
     *         or LimitExceededException (status code 482)
     *         or UnmodifiableEntityException (status code 483)
     *         or ConcurrentModificationException (status code 484)
     *         or ServiceFailureException (status code 485)
     */
    @Operation(
        operationId = "gETDeleteRole",
        description = "<p>Deletes the specified role. Unlike the Amazon Web Services Management Console, when you delete a role programmatically, you must delete the items attached to the role manually, or the deletion fails. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_manage_delete.html#roles-managingrole-deleting-cli\">Deleting an IAM role</a>. Before attempting to delete a role, remove the following attached items: </p> <ul> <li> <p>Inline policies (<a>DeleteRolePolicy</a>)</p> </li> <li> <p>Attached managed policies (<a>DetachRolePolicy</a>)</p> </li> <li> <p>Instance profile (<a>RemoveRoleFromInstanceProfile</a>)</p> </li> <li> <p>Optional – Delete instance profile after detaching from role for resource clean up (<a>DeleteInstanceProfile</a>)</p> </li> </ul> <important> <p>Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.</p> </important>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "DeleteConflictException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "LimitExceededException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "483", description = "UnmodifiableEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "484", description = "ConcurrentModificationException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "485", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/#Action=DeleteRole",
        produces = { "text/xml" }
    )
    
    default ResponseEntity<Void> gETDeleteRole(
        @NotNull @Pattern(regexp = "[\\w+=,.@-]+") @Size(min = 1, max = 64) @Parameter(name = "RoleName", description = "<p>The name of the role to delete.</p> <p>This parameter allows (through its <a href=\"http://wikipedia.org/wiki/regex\">regex pattern</a>) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-</p>", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "RoleName", required = true) String roleName,
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
     * POST /#Action=DeleteRole
     * &lt;p&gt;Deletes the specified role. Unlike the Amazon Web Services Management Console, when you delete a role programmatically, you must delete the items attached to the role manually, or the deletion fails. For more information, see &lt;a href&#x3D;\&quot;https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_manage_delete.html#roles-managingrole-deleting-cli\&quot;&gt;Deleting an IAM role&lt;/a&gt;. Before attempting to delete a role, remove the following attached items: &lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt;Inline policies (&lt;a&gt;DeleteRolePolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Attached managed policies (&lt;a&gt;DetachRolePolicy&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Instance profile (&lt;a&gt;RemoveRoleFromInstanceProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt;Optional – Delete instance profile after detaching from role for resource clean up (&lt;a&gt;DeleteInstanceProfile&lt;/a&gt;)&lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;important&gt; &lt;p&gt;Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.&lt;/p&gt; &lt;/important&gt;
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
     * @param deleteRoleRequest  (optional)
     * @return Success (status code 200)
     *         or NoSuchEntityException (status code 480)
     *         or DeleteConflictException (status code 481)
     *         or LimitExceededException (status code 482)
     *         or UnmodifiableEntityException (status code 483)
     *         or ConcurrentModificationException (status code 484)
     *         or ServiceFailureException (status code 485)
     */
    @Operation(
        operationId = "pOSTDeleteRole",
        description = "<p>Deletes the specified role. Unlike the Amazon Web Services Management Console, when you delete a role programmatically, you must delete the items attached to the role manually, or the deletion fails. For more information, see <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_manage_delete.html#roles-managingrole-deleting-cli\">Deleting an IAM role</a>. Before attempting to delete a role, remove the following attached items: </p> <ul> <li> <p>Inline policies (<a>DeleteRolePolicy</a>)</p> </li> <li> <p>Attached managed policies (<a>DetachRolePolicy</a>)</p> </li> <li> <p>Instance profile (<a>RemoveRoleFromInstanceProfile</a>)</p> </li> <li> <p>Optional – Delete instance profile after detaching from role for resource clean up (<a>DeleteInstanceProfile</a>)</p> </li> </ul> <important> <p>Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a role or instance profile that is associated with a running instance will break any applications running on the instance.</p> </important>",
        responses = {
            @ApiResponse(responseCode = "200", description = "Success"),
            @ApiResponse(responseCode = "480", description = "NoSuchEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "481", description = "DeleteConflictException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "482", description = "LimitExceededException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "483", description = "UnmodifiableEntityException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "484", description = "ConcurrentModificationException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            }),
            @ApiResponse(responseCode = "485", description = "ServiceFailureException", content = {
                @Content(mediaType = "text/xml", schema = @Schema(implementation = Object.class))
            })
        },
        security = {
            @SecurityRequirement(name = "hmac")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/#Action=DeleteRole",
        produces = { "text/xml" },
        consumes = { "text/xml" }
    )
    
    default ResponseEntity<Void> pOSTDeleteRole(
        @NotNull @Parameter(name = "Action", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Action", required = true) String action,
        @NotNull @Parameter(name = "Version", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Version", required = true) String version,
        @Parameter(name = "X-Amz-Content-Sha256", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Content-Sha256", required = false) String xAmzContentSha256,
        @Parameter(name = "X-Amz-Date", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Date", required = false) String xAmzDate,
        @Parameter(name = "X-Amz-Algorithm", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Algorithm", required = false) String xAmzAlgorithm,
        @Parameter(name = "X-Amz-Credential", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Credential", required = false) String xAmzCredential,
        @Parameter(name = "X-Amz-Security-Token", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Security-Token", required = false) String xAmzSecurityToken,
        @Parameter(name = "X-Amz-Signature", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-Signature", required = false) String xAmzSignature,
        @Parameter(name = "X-Amz-SignedHeaders", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Amz-SignedHeaders", required = false) String xAmzSignedHeaders,
        @Parameter(name = "DeleteRoleRequest", description = "") @Valid @RequestBody(required = false) DeleteRoleRequest deleteRoleRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
