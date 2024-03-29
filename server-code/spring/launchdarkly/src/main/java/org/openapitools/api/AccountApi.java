/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.PatchOperation;
import org.openapitools.model.PostRelayAutoConfigRequest;
import org.openapitools.model.RelayProxyConfig;
import org.openapitools.model.RelayProxyConfigs;
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
@Tag(name = "Relay proxy configurations", description = "the Relay proxy configurations API")
public interface AccountApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /account/relay-auto-configs/{id} : Delete a relay proxy configuration by ID.
     *
     * @param id The relay proxy configuration ID (required)
     * @return Action completed successfully. (status code 204)
     *         or Invalid request body. (status code 400)
     *         or Invalid resource specifier. (status code 404)
     */
    @Operation(
        operationId = "deleteRelayProxyConfig",
        summary = "Delete a relay proxy configuration by ID.",
        tags = { "Relay proxy configurations" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Action completed successfully."),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "404", description = "Invalid resource specifier.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/account/relay-auto-configs/{id}"
    )
    
    default ResponseEntity<Void> deleteRelayProxyConfig(
        @Parameter(name = "id", description = "The relay proxy configuration ID", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /account/relay-auto-configs/{id} : Get a single relay proxy configuration by ID.
     *
     * @param id The relay proxy configuration ID (required)
     * @return Relay proxy config response. (status code 200)
     *         or Invalid resource specifier. (status code 404)
     */
    @Operation(
        operationId = "getRelayProxyConfig",
        summary = "Get a single relay proxy configuration by ID.",
        tags = { "Relay proxy configurations" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Relay proxy config response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RelayProxyConfig.class))
            }),
            @ApiResponse(responseCode = "404", description = "Invalid resource specifier.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/account/relay-auto-configs/{id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<RelayProxyConfig> getRelayProxyConfig(
        @Parameter(name = "id", description = "The relay proxy configuration ID", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"displayKey\" : \"66eo\", \"_creator\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"fullKey\" : \"rel-8a3a773d-b75e-48eb-a850-492cda9266eo\", \"name\" : \"My relay proxy config\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"creationDate\" : 1443652232590, \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /account/relay-auto-configs : Returns a list of relay proxy configurations in the account.
     *
     * @return Relay proxy configs response. (status code 200)
     */
    @Operation(
        operationId = "getRelayProxyConfigs",
        summary = "Returns a list of relay proxy configurations in the account.",
        tags = { "Relay proxy configurations" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Relay proxy configs response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RelayProxyConfigs.class))
            })
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/account/relay-auto-configs",
        produces = { "application/json" }
    )
    
    default ResponseEntity<RelayProxyConfigs> getRelayProxyConfigs(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"items\" : [ { \"displayKey\" : \"66eo\", \"_creator\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"fullKey\" : \"rel-8a3a773d-b75e-48eb-a850-492cda9266eo\", \"name\" : \"My relay proxy config\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"creationDate\" : 1443652232590, \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] }, { \"displayKey\" : \"66eo\", \"_creator\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"fullKey\" : \"rel-8a3a773d-b75e-48eb-a850-492cda9266eo\", \"name\" : \"My relay proxy config\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"creationDate\" : 1443652232590, \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /account/relay-auto-configs/{id} : Modify a relay proxy configuration by ID.
     *
     * @param id The relay proxy configuration ID (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @return Relay proxy config response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid resource specifier. (status code 404)
     *         or Status conflict. (status code 409)
     */
    @Operation(
        operationId = "patchRelayProxyConfig",
        summary = "Modify a relay proxy configuration by ID.",
        tags = { "Relay proxy configurations" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Relay proxy config response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RelayProxyConfig.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "404", description = "Invalid resource specifier."),
            @ApiResponse(responseCode = "409", description = "Status conflict.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/account/relay-auto-configs/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<RelayProxyConfig> patchRelayProxyConfig(
        @Parameter(name = "id", description = "The relay proxy configuration ID", required = true, in = ParameterIn.PATH) @PathVariable("id") String id,
        @Parameter(name = "patchDelta", description = "Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'", required = true) @Valid @RequestBody List<@Valid PatchOperation> patchDelta
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"displayKey\" : \"66eo\", \"_creator\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"fullKey\" : \"rel-8a3a773d-b75e-48eb-a850-492cda9266eo\", \"name\" : \"My relay proxy config\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"creationDate\" : 1443652232590, \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /account/relay-auto-configs : Create a new relay proxy config.
     *
     * @param relayProxyConfigBody Create a new relay proxy configuration (required)
     * @return Relay proxy config response. (status code 201)
     *         or Invalid request body. (status code 400)
     *         or Access to the requested resource was denied. (status code 403)
     */
    @Operation(
        operationId = "postRelayAutoConfig",
        summary = "Create a new relay proxy config.",
        tags = { "Relay proxy configurations" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Relay proxy config response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RelayProxyConfig.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "403", description = "Access to the requested resource was denied.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/account/relay-auto-configs",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<RelayProxyConfig> postRelayAutoConfig(
        @Parameter(name = "relayProxyConfigBody", description = "Create a new relay proxy configuration", required = true) @Valid @RequestBody PostRelayAutoConfigRequest relayProxyConfigBody
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"displayKey\" : \"66eo\", \"_creator\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"fullKey\" : \"rel-8a3a773d-b75e-48eb-a850-492cda9266eo\", \"name\" : \"My relay proxy config\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"creationDate\" : 1443652232590, \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /account/relay-auto-configs/{id}/reset : Reset a relay proxy configuration&#39;s secret key with an optional expiry time for the old key.
     *
     * @param id The relay proxy configuration ID (required)
     * @param expiry An expiration time for the old relay proxy configuration key, expressed as a Unix epoch time in milliseconds. By default, the relay proxy configuration will expire immediately (optional)
     * @return Relay proxy config response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid resource specifier. (status code 404)
     */
    @Operation(
        operationId = "resetRelayProxyConfig",
        summary = "Reset a relay proxy configuration's secret key with an optional expiry time for the old key.",
        tags = { "Relay proxy configurations" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Relay proxy config response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = RelayProxyConfig.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "404", description = "Invalid resource specifier.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/account/relay-auto-configs/{id}/reset",
        produces = { "application/json" }
    )
    
    default ResponseEntity<RelayProxyConfig> resetRelayProxyConfig(
        @Parameter(name = "id", description = "The relay proxy configuration ID", required = true, in = ParameterIn.PATH) @PathVariable("id") String id,
        @Parameter(name = "expiry", description = "An expiration time for the old relay proxy configuration key, expressed as a Unix epoch time in milliseconds. By default, the relay proxy configuration will expire immediately", in = ParameterIn.QUERY) @Valid @RequestParam(value = "expiry", required = false) Long expiry
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"displayKey\" : \"66eo\", \"_creator\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"fullKey\" : \"rel-8a3a773d-b75e-48eb-a850-492cda9266eo\", \"name\" : \"My relay proxy config\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"lastModified\" : 1469326565348, \"creationDate\" : 1443652232590, \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
