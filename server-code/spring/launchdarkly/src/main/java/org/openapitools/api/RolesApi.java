/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CustomRole;
import org.openapitools.model.CustomRoles;
import org.openapitools.model.PatchOperation;
import org.openapitools.model.PostCustomRoleRequest;
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
@Tag(name = "Custom roles", description = "the Custom roles API")
public interface RolesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /roles/{customRoleKey} : Delete a custom role by key.
     *
     * @param customRoleKey The custom role key. (required)
     * @return Action completed successfully. (status code 204)
     *         or Invalid access token. (status code 401)
     *         or Invalid resource specifier. (status code 404)
     */
    @Operation(
        operationId = "deleteCustomRole",
        summary = "Delete a custom role by key.",
        tags = { "Custom roles" },
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
        value = "/roles/{customRoleKey}"
    )
    
    default ResponseEntity<Void> deleteCustomRole(
        @Parameter(name = "customRoleKey", description = "The custom role key.", required = true, in = ParameterIn.PATH) @PathVariable("customRoleKey") String customRoleKey
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /roles/{customRoleKey} : Get one custom role by key.
     *
     * @param customRoleKey The custom role key. (required)
     * @return Custom role response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     */
    @Operation(
        operationId = "getCustomRole",
        summary = "Get one custom role by key.",
        tags = { "Custom roles" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Custom role response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CustomRole.class))
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
        value = "/roles/{customRoleKey}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<CustomRole> getCustomRole(
        @Parameter(name = "customRoleKey", description = "The custom role key.", required = true, in = ParameterIn.PATH) @PathVariable("customRoleKey") String customRoleKey
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"name\" : \"revenue team\", \"description\" : \"Description of revenue team role here\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"key\" : \"revenue-team\", \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /roles : Return a complete list of custom roles.
     *
     * @return Custom roles response. (status code 200)
     *         or Invalid access token. (status code 401)
     */
    @Operation(
        operationId = "getCustomRoles",
        summary = "Return a complete list of custom roles.",
        tags = { "Custom roles" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Custom roles response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CustomRoles.class))
            }),
            @ApiResponse(responseCode = "401", description = "Invalid access token.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/roles",
        produces = { "application/json" }
    )
    
    default ResponseEntity<CustomRoles> getCustomRoles(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"items\" : [ { \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"name\" : \"revenue team\", \"description\" : \"Description of revenue team role here\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"key\" : \"revenue-team\", \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] }, { \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"name\" : \"revenue team\", \"description\" : \"Description of revenue team role here\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"key\" : \"revenue-team\", \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /roles/{customRoleKey} : Modify a custom role by key.
     *
     * @param customRoleKey The custom role key. (required)
     * @param patchDelta Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; (required)
     * @return Custom role response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     *         or Invalid resource specifier. (status code 404)
     *         or Status conflict. (status code 409)
     */
    @Operation(
        operationId = "patchCustomRole",
        summary = "Modify a custom role by key.",
        tags = { "Custom roles" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Custom role response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CustomRole.class))
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
        value = "/roles/{customRoleKey}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<CustomRole> patchCustomRole(
        @Parameter(name = "customRoleKey", description = "The custom role key.", required = true, in = ParameterIn.PATH) @PathVariable("customRoleKey") String customRoleKey,
        @Parameter(name = "patchDelta", description = "Requires a JSON Patch representation of the desired changes to the project. 'http://jsonpatch.com/'", required = true) @Valid @RequestBody List<@Valid PatchOperation> patchDelta
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"name\" : \"revenue team\", \"description\" : \"Description of revenue team role here\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"key\" : \"revenue-team\", \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /roles : Create a new custom role.
     *
     * @param customRoleBody New role or roles to create. (required)
     * @return Custom role response. (status code 201)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     *         or Status conflict. (status code 409)
     */
    @Operation(
        operationId = "postCustomRole",
        summary = "Create a new custom role.",
        tags = { "Custom roles" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Custom role response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CustomRole.class))
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
        value = "/roles",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<CustomRole> postCustomRole(
        @Parameter(name = "customRoleBody", description = "New role or roles to create.", required = true) @Valid @RequestBody PostCustomRoleRequest customRoleBody
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"name\" : \"revenue team\", \"description\" : \"Description of revenue team role here\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"key\" : \"revenue-team\", \"policy\" : [ { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] }, { \"notActions\" : [ \"updateOn\", \"updateOn\" ], \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"effect\" : \"deny\", \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ], \"actions\" : [ \"updateOn\", \"updateOn\" ] } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
