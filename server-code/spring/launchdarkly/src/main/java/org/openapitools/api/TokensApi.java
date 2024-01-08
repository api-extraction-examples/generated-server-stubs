/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.PatchOperation;
import org.openapitools.model.PostTokenRequest;
import org.openapitools.model.Token;
import org.openapitools.model.Tokens;
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
@Tag(name = "Access tokens", description = "the Access tokens API")
public interface TokensApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /tokens/{tokenId} : Delete an access token by ID.
     *
     * @param tokenId The access token ID. (required)
     * @return Action completed successfully. (status code 204)
     *         or Invalid access token. (status code 401)
     *         or Invalid resource specifier. (status code 404)
     */
    @Operation(
        operationId = "deleteToken",
        summary = "Delete an access token by ID.",
        tags = { "Access tokens" },
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
        value = "/tokens/{tokenId}"
    )
    
    default ResponseEntity<Void> deleteToken(
        @Parameter(name = "tokenId", description = "The access token ID.", required = true, in = ParameterIn.PATH) @PathVariable("tokenId") String tokenId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tokens/{tokenId} : Get a single access token by ID.
     *
     * @param tokenId The access token ID. (required)
     * @return Token response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     */
    @Operation(
        operationId = "getToken",
        summary = "Get a single access token by ID.",
        tags = { "Access tokens" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Token response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Token.class))
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
        value = "/tokens/{tokenId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Token> getToken(
        @Parameter(name = "tokenId", description = "The access token ID.", required = true, in = ParameterIn.PATH) @PathVariable("tokenId") String tokenId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : \"writer\", \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ], \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_member\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"creationDate\" : 1443652232590, \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\", \"defaultApiVersion\" : 0, \"token\" : \"3243\", \"inlineRole\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ], \"lastUsed\" : 1469326565348, \"name\" : \"My access token\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"serviceToken\" : true, \"memberId\" : \"5a580a01b4ff89217bdf9dc1\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /tokens : Returns a list of tokens in the account.
     *
     * @param showAll If set to true, and the authentication access token has the \&quot;Admin\&quot; role, personal access tokens for all members will be retrieved. (optional)
     * @return Tokens response. (status code 200)
     *         or Invalid access token. (status code 401)
     */
    @Operation(
        operationId = "getTokens",
        summary = "Returns a list of tokens in the account.",
        tags = { "Access tokens" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Tokens response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Tokens.class))
            }),
            @ApiResponse(responseCode = "401", description = "Invalid access token.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/tokens",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Tokens> getTokens(
        @Parameter(name = "showAll", description = "If set to true, and the authentication access token has the \"Admin\" role, personal access tokens for all members will be retrieved.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "showAll", required = false) Boolean showAll
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"items\" : [ { \"role\" : \"writer\", \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ], \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_member\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"creationDate\" : 1443652232590, \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\", \"defaultApiVersion\" : 0, \"token\" : \"3243\", \"inlineRole\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ], \"lastUsed\" : 1469326565348, \"name\" : \"My access token\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"serviceToken\" : true, \"memberId\" : \"5a580a01b4ff89217bdf9dc1\" }, { \"role\" : \"writer\", \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ], \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_member\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"creationDate\" : 1443652232590, \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\", \"defaultApiVersion\" : 0, \"token\" : \"3243\", \"inlineRole\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ], \"lastUsed\" : 1469326565348, \"name\" : \"My access token\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"serviceToken\" : true, \"memberId\" : \"5a580a01b4ff89217bdf9dc1\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /tokens/{tokenId} : Modify an access token by ID.
     *
     * @param tokenId The access token ID. (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @return Token response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     *         or Invalid resource specifier. (status code 404)
     *         or Status conflict. (status code 409)
     */
    @Operation(
        operationId = "patchToken",
        summary = "Modify an access token by ID.",
        tags = { "Access tokens" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Token response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Token.class))
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
        value = "/tokens/{tokenId}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Token> patchToken(
        @Parameter(name = "tokenId", description = "The access token ID.", required = true, in = ParameterIn.PATH) @PathVariable("tokenId") String tokenId,
        @Parameter(name = "patchDelta", description = "Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'", required = true) @Valid @RequestBody List<@Valid PatchOperation> patchDelta
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : \"writer\", \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ], \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_member\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"creationDate\" : 1443652232590, \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\", \"defaultApiVersion\" : 0, \"token\" : \"3243\", \"inlineRole\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ], \"lastUsed\" : 1469326565348, \"name\" : \"My access token\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"serviceToken\" : true, \"memberId\" : \"5a580a01b4ff89217bdf9dc1\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /tokens : Create a new token.
     *
     * @param tokenBody Create a new access token. (required)
     * @return Token response. (status code 201)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     *         or Status conflict. (status code 409)
     */
    @Operation(
        operationId = "postToken",
        summary = "Create a new token.",
        tags = { "Access tokens" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Token response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Token.class))
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
        value = "/tokens",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Token> postToken(
        @Parameter(name = "tokenBody", description = "Create a new access token.", required = true) @Valid @RequestBody PostTokenRequest tokenBody
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : \"writer\", \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ], \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_member\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"creationDate\" : 1443652232590, \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\", \"defaultApiVersion\" : 0, \"token\" : \"3243\", \"inlineRole\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ], \"lastUsed\" : 1469326565348, \"name\" : \"My access token\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"serviceToken\" : true, \"memberId\" : \"5a580a01b4ff89217bdf9dc1\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /tokens/{tokenId}/reset : Reset an access token&#39;s secret key with an optional expiry time for the old key.
     *
     * @param tokenId The access token ID. (required)
     * @param expiry An expiration time for the old token key, expressed as a Unix epoch time in milliseconds. By default, the token will expire immediately. (optional)
     * @return Token response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     */
    @Operation(
        operationId = "resetToken",
        summary = "Reset an access token's secret key with an optional expiry time for the old key.",
        tags = { "Access tokens" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Token response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Token.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "401", description = "Invalid access token.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/tokens/{tokenId}/reset",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Token> resetToken(
        @Parameter(name = "tokenId", description = "The access token ID.", required = true, in = ParameterIn.PATH) @PathVariable("tokenId") String tokenId,
        @Parameter(name = "expiry", description = "An expiration time for the old token key, expressed as a Unix epoch time in milliseconds. By default, the token will expire immediately.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "expiry", required = false) Long expiry
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"role\" : \"writer\", \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ], \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_member\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"creationDate\" : 1443652232590, \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\", \"defaultApiVersion\" : 0, \"token\" : \"3243\", \"inlineRole\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"allow\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ], \"lastUsed\" : 1469326565348, \"name\" : \"My access token\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"serviceToken\" : true, \"memberId\" : \"5a580a01b4ff89217bdf9dc1\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}