/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
import org.openapitools.model.Member;
import org.openapitools.model.Members;
import org.openapitools.model.PatchOperation;
import org.openapitools.model.PostMembersRequestInner;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Team members", description = "the Team members API")
public interface MembersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /members/{memberId} : Delete a team member by ID.
     *
     * @param memberId The member ID. (required)
     * @return Action completed successfully. (status code 204)
     *         or Invalid access token. (status code 401)
     *         or Invalid resource specifier. (status code 404)
     */
    @Operation(
        operationId = "deleteMember",
        summary = "Delete a team member by ID.",
        tags = { "Team members" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Action completed successfully."),
            @ApiResponse(responseCode = "401", description = "Invalid access token."),
            @ApiResponse(responseCode = "404", description = "Invalid resource specifier.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/members/{memberId}"
    )
    
    default ResponseEntity<Void> deleteMember(
        @Parameter(name = "memberId", description = "The member ID.", required = true, in = ParameterIn.PATH) @PathVariable("memberId") String memberId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /members/me : Get the current team member associated with the token
     *
     * @return Member response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     */
    @Operation(
        operationId = "getMe",
        summary = "Get the current team member associated with the token",
        tags = { "Team members" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Member response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Member.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "401", description = "Invalid access token.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/members/me",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Member> getMe(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /members/{memberId} : Get a single team member by ID.
     *
     * @param memberId The member ID. (required)
     * @return Member response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     */
    @Operation(
        operationId = "getMember",
        summary = "Get a single team member by ID.",
        tags = { "Team members" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Member response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Member.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "401", description = "Invalid access token.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/members/{memberId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Member> getMember(
        @Parameter(name = "memberId", description = "The member ID.", required = true, in = ParameterIn.PATH) @PathVariable("memberId") String memberId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /members : Returns a list of all members in the account.
     *
     * @param limit The number of objects to return. Defaults to -1, which returns everything. (optional)
     * @param offset Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items. (optional)
     * @param filter A comma-separated list of filters. Each filter is of the form field:value. (optional)
     * @param sort A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order. (optional)
     * @return Members response. (status code 200)
     *         or Invalid access token. (status code 401)
     */
    @Operation(
        operationId = "getMembers",
        summary = "Returns a list of all members in the account.",
        tags = { "Team members" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Members response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Members.class))
            }),
            @ApiResponse(responseCode = "401", description = "Invalid access token.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/members",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Members> getMembers(
        @Parameter(name = "limit", description = "The number of objects to return. Defaults to -1, which returns everything.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
        @Parameter(name = "offset", description = "Where to start in the list. This is for use with pagination. For example, an offset of 10 would skip the first 10 items and then return the next limit items.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offset", required = false) BigDecimal offset,
        @Parameter(name = "filter", description = "A comma-separated list of filters. Each filter is of the form field:value.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "filter", required = false) String filter,
        @Parameter(name = "sort", description = "A comma-separated list of fields to sort by. A field prefixed by a - will be sorted in descending order.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "sort", required = false) String sort
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"totalCount\" : 0.8008281904610115, \"items\" : [ { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /members/{memberId} : Modify a team member by ID.
     *
     * @param memberId The member ID. (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @return Member response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     *         or Invalid resource specifier. (status code 404)
     *         or Status conflict. (status code 409)
     */
    @Operation(
        operationId = "patchMember",
        summary = "Modify a team member by ID.",
        tags = { "Team members" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Member response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Member.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "401", description = "Invalid access token."),
            @ApiResponse(responseCode = "404", description = "Invalid resource specifier."),
            @ApiResponse(responseCode = "409", description = "Status conflict.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/members/{memberId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Member> patchMember(
        @Parameter(name = "memberId", description = "The member ID.", required = true, in = ParameterIn.PATH) @PathVariable("memberId") String memberId,
        @Parameter(name = "patchDelta", description = "Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'", required = true) @Valid @RequestBody List<@Valid PatchOperation> patchDelta
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /members : Invite new members.
     *
     * @param membersBody New members to invite. (required)
     * @return Members response. (status code 201)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     *         or Status conflict. (status code 409)
     */
    @Operation(
        operationId = "postMembers",
        summary = "Invite new members.",
        tags = { "Team members" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Members response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Members.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "401", description = "Invalid access token."),
            @ApiResponse(responseCode = "409", description = "Status conflict.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/members",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Members> postMembers(
        @Parameter(name = "membersBody", description = "New members to invite.", required = true) @Valid @RequestBody List<@Valid PostMembersRequestInner> membersBody
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"totalCount\" : 0.8008281904610115, \"items\" : [ { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
