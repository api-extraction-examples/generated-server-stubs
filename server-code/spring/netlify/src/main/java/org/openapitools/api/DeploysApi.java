/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Deploy;
import org.openapitools.model.Error;
import org.openapitools.model.Function;
import org.openapitools.model.PluginRun;
import org.openapitools.model.PluginRunData;
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
@Tag(name = "deploy", description = "the deploy API")
public interface DeploysApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /deploys/{deploy_id}/cancel
     *
     * @param deployId  (required)
     * @return Cancelled (status code 201)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "cancelSiteDeploy",
        tags = { "deploy" },
        responses = {
            @ApiResponse(responseCode = "201", description = "Cancelled", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Deploy.class))
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
        value = "/deploys/{deploy_id}/cancel",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Deploy> cancelSiteDeploy(
        @Parameter(name = "deploy_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("deploy_id") String deployId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"review_id\" : 0.8008281904610115, \"deploy_url\" : \"deploy_url\", \"review_url\" : \"review_url\", \"created_at\" : \"created_at\", \"title\" : \"title\", \"branch\" : \"branch\", \"required\" : [ \"required\", \"required\" ], \"skipped\" : true, \"commit_url\" : \"commit_url\", \"updated_at\" : \"updated_at\", \"draft\" : true, \"context\" : \"context\", \"id\" : \"id\", \"state\" : \"state\", \"locked\" : true, \"published_at\" : \"published_at\", \"error_message\" : \"error_message\", \"function_schedules\" : [ { \"cron\" : \"cron\", \"name\" : \"name\" }, { \"cron\" : \"cron\", \"name\" : \"name\" } ], \"admin_url\" : \"admin_url\", \"site_capabilities\" : { \"large_media_enabled\" : true }, \"url\" : \"url\", \"framework\" : \"framework\", \"ssl_url\" : \"ssl_url\", \"build_id\" : \"build_id\", \"deploy_ssl_url\" : \"deploy_ssl_url\", \"user_id\" : \"user_id\", \"name\" : \"name\", \"site_id\" : \"site_id\", \"required_functions\" : [ \"required_functions\", \"required_functions\" ], \"screenshot_url\" : \"screenshot_url\", \"commit_ref\" : \"commit_ref\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /deploys/{deploy_id}/plugin_runs
     * This is an internal-only endpoint.
     *
     * @param deployId  (required)
     * @param pluginRun  (optional)
     * @return CREATED (status code 201)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "createPluginRun",
        description = "This is an internal-only endpoint.",
        tags = { "x-internal" },
        responses = {
            @ApiResponse(responseCode = "201", description = "CREATED", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PluginRun.class))
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
        value = "/deploys/{deploy_id}/plugin_runs",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<PluginRun> createPluginRun(
        @Parameter(name = "deploy_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("deploy_id") String deployId,
        @Parameter(name = "plugin_run", description = "") @Valid @RequestBody(required = false) PluginRunData pluginRun
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /deploys/{deploy_id}
     *
     * @param deployId  (required)
     * @return No content (status code 204)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "deleteDeploy",
        tags = { "deploy" },
        responses = {
            @ApiResponse(responseCode = "204", description = "No content"),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/deploys/{deploy_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Void> deleteDeploy(
        @Parameter(name = "deploy_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("deploy_id") String deployId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /deploys/{deploy_id}
     *
     * @param deployId  (required)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "getDeploy",
        tags = { "deploy" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Deploy.class))
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
        value = "/deploys/{deploy_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Deploy> getDeploy(
        @Parameter(name = "deploy_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("deploy_id") String deployId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"review_id\" : 0.8008281904610115, \"deploy_url\" : \"deploy_url\", \"review_url\" : \"review_url\", \"created_at\" : \"created_at\", \"title\" : \"title\", \"branch\" : \"branch\", \"required\" : [ \"required\", \"required\" ], \"skipped\" : true, \"commit_url\" : \"commit_url\", \"updated_at\" : \"updated_at\", \"draft\" : true, \"context\" : \"context\", \"id\" : \"id\", \"state\" : \"state\", \"locked\" : true, \"published_at\" : \"published_at\", \"error_message\" : \"error_message\", \"function_schedules\" : [ { \"cron\" : \"cron\", \"name\" : \"name\" }, { \"cron\" : \"cron\", \"name\" : \"name\" } ], \"admin_url\" : \"admin_url\", \"site_capabilities\" : { \"large_media_enabled\" : true }, \"url\" : \"url\", \"framework\" : \"framework\", \"ssl_url\" : \"ssl_url\", \"build_id\" : \"build_id\", \"deploy_ssl_url\" : \"deploy_ssl_url\", \"user_id\" : \"user_id\", \"name\" : \"name\", \"site_id\" : \"site_id\", \"required_functions\" : [ \"required_functions\", \"required_functions\" ], \"screenshot_url\" : \"screenshot_url\", \"commit_ref\" : \"commit_ref\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /deploys/{deploy_id}/lock
     *
     * @param deployId  (required)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "lockDeploy",
        tags = { "deploy" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Deploy.class))
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
        value = "/deploys/{deploy_id}/lock",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Deploy> lockDeploy(
        @Parameter(name = "deploy_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("deploy_id") String deployId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"review_id\" : 0.8008281904610115, \"deploy_url\" : \"deploy_url\", \"review_url\" : \"review_url\", \"created_at\" : \"created_at\", \"title\" : \"title\", \"branch\" : \"branch\", \"required\" : [ \"required\", \"required\" ], \"skipped\" : true, \"commit_url\" : \"commit_url\", \"updated_at\" : \"updated_at\", \"draft\" : true, \"context\" : \"context\", \"id\" : \"id\", \"state\" : \"state\", \"locked\" : true, \"published_at\" : \"published_at\", \"error_message\" : \"error_message\", \"function_schedules\" : [ { \"cron\" : \"cron\", \"name\" : \"name\" }, { \"cron\" : \"cron\", \"name\" : \"name\" } ], \"admin_url\" : \"admin_url\", \"site_capabilities\" : { \"large_media_enabled\" : true }, \"url\" : \"url\", \"framework\" : \"framework\", \"ssl_url\" : \"ssl_url\", \"build_id\" : \"build_id\", \"deploy_ssl_url\" : \"deploy_ssl_url\", \"user_id\" : \"user_id\", \"name\" : \"name\", \"site_id\" : \"site_id\", \"required_functions\" : [ \"required_functions\", \"required_functions\" ], \"screenshot_url\" : \"screenshot_url\", \"commit_ref\" : \"commit_ref\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /deploys/{deploy_id}/unlock
     *
     * @param deployId  (required)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "unlockDeploy",
        tags = { "deploy" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Deploy.class))
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
        value = "/deploys/{deploy_id}/unlock",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Deploy> unlockDeploy(
        @Parameter(name = "deploy_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("deploy_id") String deployId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"review_id\" : 0.8008281904610115, \"deploy_url\" : \"deploy_url\", \"review_url\" : \"review_url\", \"created_at\" : \"created_at\", \"title\" : \"title\", \"branch\" : \"branch\", \"required\" : [ \"required\", \"required\" ], \"skipped\" : true, \"commit_url\" : \"commit_url\", \"updated_at\" : \"updated_at\", \"draft\" : true, \"context\" : \"context\", \"id\" : \"id\", \"state\" : \"state\", \"locked\" : true, \"published_at\" : \"published_at\", \"error_message\" : \"error_message\", \"function_schedules\" : [ { \"cron\" : \"cron\", \"name\" : \"name\" }, { \"cron\" : \"cron\", \"name\" : \"name\" } ], \"admin_url\" : \"admin_url\", \"site_capabilities\" : { \"large_media_enabled\" : true }, \"url\" : \"url\", \"framework\" : \"framework\", \"ssl_url\" : \"ssl_url\", \"build_id\" : \"build_id\", \"deploy_ssl_url\" : \"deploy_ssl_url\", \"user_id\" : \"user_id\", \"name\" : \"name\", \"site_id\" : \"site_id\", \"required_functions\" : [ \"required_functions\", \"required_functions\" ], \"screenshot_url\" : \"screenshot_url\", \"commit_ref\" : \"commit_ref\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /deploys/{deploy_id}/files/{path}
     *
     * @param deployId  (required)
     * @param path  (required)
     * @param fileBody  (required)
     * @param size  (optional)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "uploadDeployFile",
        tags = { "file" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = org.springframework.core.io.Resource.class))
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
        value = "/deploys/{deploy_id}/files/{path}",
        produces = { "application/json" },
        consumes = { "application/octet-stream" }
    )
    
    default ResponseEntity<org.springframework.core.io.Resource> uploadDeployFile(
        @Parameter(name = "deploy_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("deploy_id") String deployId,
        @Parameter(name = "path", description = "", required = true, in = ParameterIn.PATH) @PathVariable("path") String path,
        @Parameter(name = "file_body", description = "", required = true) @Valid @RequestBody org.springframework.core.io.Resource fileBody,
        @Parameter(name = "size", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "size", required = false) Integer size
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"path\" : \"path\", \"size\" : 0, \"mime_type\" : \"mime_type\", \"id\" : \"id\", \"sha\" : \"sha\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /deploys/{deploy_id}/functions/{name}
     *
     * @param deployId  (required)
     * @param name  (required)
     * @param fileBody  (required)
     * @param runtime  (optional)
     * @param size  (optional)
     * @param xNfRetryCount  (optional)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "uploadDeployFunction",
        tags = { "function" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Function.class))
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
        value = "/deploys/{deploy_id}/functions/{name}",
        produces = { "application/json" },
        consumes = { "application/octet-stream" }
    )
    
    default ResponseEntity<Function> uploadDeployFunction(
        @Parameter(name = "deploy_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("deploy_id") String deployId,
        @Parameter(name = "name", description = "", required = true, in = ParameterIn.PATH) @PathVariable("name") String name,
        @Parameter(name = "file_body", description = "", required = true) @Valid @RequestBody org.springframework.core.io.Resource fileBody,
        @Parameter(name = "runtime", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "runtime", required = false) String runtime,
        @Parameter(name = "size", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "size", required = false) Integer size,
        @Parameter(name = "X-Nf-Retry-Count", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "X-Nf-Retry-Count", required = false) Integer xNfRetryCount
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"name\", \"id\" : \"id\", \"sha\" : \"sha\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
