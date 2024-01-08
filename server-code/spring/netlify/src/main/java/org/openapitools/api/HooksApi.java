/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.Hook;
import org.openapitools.model.HookType;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "hook", description = "the hook API")
public interface HooksApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /hooks
     *
     * @param siteId  (required)
     * @param hook  (required)
     * @return OK (status code 201)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "createHookBySiteId",
        tags = { "hook" },
        responses = {
            @ApiResponse(responseCode = "201", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Hook.class))
            }),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/hooks",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Hook> createHookBySiteId(
        @NotNull @Parameter(name = "site_id", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "site_id", required = true) String siteId,
        @Parameter(name = "hook", description = "", required = true) @Valid @RequestBody Hook hook
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : \"{}\", \"updated_at\" : \"updated_at\", \"site_id\" : \"site_id\", \"created_at\" : \"created_at\", \"disabled\" : true, \"id\" : \"id\", \"event\" : \"event\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /hooks/{hook_id}
     *
     * @param hookId  (required)
     * @return No content (status code 204)
     */
    @Operation(
        operationId = "deleteHook",
        tags = { "hook" },
        responses = {
            @ApiResponse(responseCode = "204", description = "No content")
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/hooks/{hook_id}"
    )
    
    default ResponseEntity<Void> deleteHook(
        @Parameter(name = "hook_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("hook_id") String hookId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /hooks/{hook_id}/enable
     *
     * @param hookId  (required)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "enableHook",
        tags = { "hook" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Hook.class))
            }),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/hooks/{hook_id}/enable",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Hook> enableHook(
        @Parameter(name = "hook_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("hook_id") String hookId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : \"{}\", \"updated_at\" : \"updated_at\", \"site_id\" : \"site_id\", \"created_at\" : \"created_at\", \"disabled\" : true, \"id\" : \"id\", \"event\" : \"event\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /hooks/{hook_id}
     *
     * @param hookId  (required)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "getHook",
        tags = { "hook" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Hook.class))
            }),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/hooks/{hook_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Hook> getHook(
        @Parameter(name = "hook_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("hook_id") String hookId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : \"{}\", \"updated_at\" : \"updated_at\", \"site_id\" : \"site_id\", \"created_at\" : \"created_at\", \"disabled\" : true, \"id\" : \"id\", \"event\" : \"event\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /hooks/types
     *
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "listHookTypes",
        tags = { "hookType" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = HookType.class)))
            }),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/hooks/types",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<HookType>> listHookTypes(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"name\" : \"name\", \"fields\" : [ \"{}\", \"{}\" ], \"events\" : [ \"events\", \"events\" ] }, { \"name\" : \"name\", \"fields\" : [ \"{}\", \"{}\" ], \"events\" : [ \"events\", \"events\" ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /hooks
     *
     * @param siteId  (required)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "listHooksBySiteId",
        tags = { "hook" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Hook.class)))
            }),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/hooks",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Hook>> listHooksBySiteId(
        @NotNull @Parameter(name = "site_id", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "site_id", required = true) String siteId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"data\" : \"{}\", \"updated_at\" : \"updated_at\", \"site_id\" : \"site_id\", \"created_at\" : \"created_at\", \"disabled\" : true, \"id\" : \"id\", \"event\" : \"event\", \"type\" : \"type\" }, { \"data\" : \"{}\", \"updated_at\" : \"updated_at\", \"site_id\" : \"site_id\", \"created_at\" : \"created_at\", \"disabled\" : true, \"id\" : \"id\", \"event\" : \"event\", \"type\" : \"type\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /hooks/{hook_id}
     *
     * @param hookId  (required)
     * @param hook  (required)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "updateHook",
        tags = { "hook" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Hook.class))
            }),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/hooks/{hook_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Hook> updateHook(
        @Parameter(name = "hook_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("hook_id") String hookId,
        @Parameter(name = "hook", description = "", required = true) @Valid @RequestBody Hook hook
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : \"{}\", \"updated_at\" : \"updated_at\", \"site_id\" : \"site_id\", \"created_at\" : \"created_at\", \"disabled\" : true, \"id\" : \"id\", \"event\" : \"event\", \"type\" : \"type\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}