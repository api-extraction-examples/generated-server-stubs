/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ErrorResponse;
import org.openapitools.model.GetGoalRelationship200Response;
import org.openapitools.model.GetGoalRelationships200Response;
import org.openapitools.model.UpdateGoalRelationshipRequest;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Goal relationships", description = "A goal relationship is an object representing the relationship between a goal and another goal, a project, or a portfolio.")
public interface GoalRelationshipsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /goal_relationships/{goal_relationship_gid} : Get a goal relationship
     * Returns the complete updated goal relationship record for a single goal relationship.
     *
     * @param goalRelationshipGid Globally unique identifier for the goal relationship. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @return Successfully retrieved the record for the goal relationship. (status code 200)
     *         or This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again. (status code 400)
     *         or A valid authentication token was not provided with the request, so the API could not associate a user with the request. (status code 401)
     *         or The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to. (status code 403)
     *         or Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist. (status code 404)
     *         or There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase. (status code 500)
     */
    @Operation(
        operationId = "getGoalRelationship",
        summary = "Get a goal relationship",
        description = "Returns the complete updated goal relationship record for a single goal relationship.",
        tags = { "Goal relationships" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the record for the goal relationship.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetGoalRelationship200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "A valid authentication token was not provided with the request, so the API could not associate a user with the request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "personalAccessToken"),
            @SecurityRequirement(name = "oauth2")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/goal_relationships/{goal_relationship_gid}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<GetGoalRelationship200Response> getGoalRelationship(
        @Parameter(name = "goal_relationship_gid", description = "Globally unique identifier for the goal relationship.", required = true, in = ParameterIn.PATH) @PathVariable("goal_relationship_gid") String goalRelationshipGid,
        @Parameter(name = "opt_pretty", description = "Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_pretty", required = false) Boolean optPretty,
        @Parameter(name = "opt_fields", description = "Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_fields", required = false) List<String> optFields
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /goal_relationships : Get goal relationships
     * Returns compact goal relationship records.
     *
     * @param supportedGoal Globally unique identifier for the supported goal in the goal relationship. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param resourceSubtype If provided, filter to goal relationships with a given resource_subtype. (optional)
     * @return Successfully retrieved the requested goal relationships. (status code 200)
     *         or This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again. (status code 400)
     *         or A valid authentication token was not provided with the request, so the API could not associate a user with the request. (status code 401)
     *         or The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to. (status code 403)
     *         or Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist. (status code 404)
     *         or There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase. (status code 500)
     */
    @Operation(
        operationId = "getGoalRelationships",
        summary = "Get goal relationships",
        description = "Returns compact goal relationship records.",
        tags = { "Goal relationships" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the requested goal relationships.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetGoalRelationships200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "A valid authentication token was not provided with the request, so the API could not associate a user with the request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "personalAccessToken"),
            @SecurityRequirement(name = "oauth2")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/goal_relationships",
        produces = { "application/json" }
    )
    
    default ResponseEntity<GetGoalRelationships200Response> getGoalRelationships(
        @NotNull @Parameter(name = "supported_goal", description = "Globally unique identifier for the supported goal in the goal relationship.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "supported_goal", required = true) String supportedGoal,
        @Parameter(name = "opt_pretty", description = "Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_pretty", required = false) Boolean optPretty,
        @Parameter(name = "opt_fields", description = "Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_fields", required = false) List<String> optFields,
        @Parameter(name = "resource_subtype", description = "If provided, filter to goal relationships with a given resource_subtype.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "resource_subtype", required = false) String resourceSubtype
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ null, null ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /goal_relationships/{goal_relationship_gid} : Update a goal relationship
     * An existing goal relationship can be updated by making a PUT request on the URL for that goal relationship. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated goal relationship record.
     *
     * @param goalRelationshipGid Globally unique identifier for the goal relationship. (required)
     * @param updateGoalRelationshipRequest The updated fields for the goal relationship. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @return Successfully updated the goal relationship. (status code 200)
     *         or This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again. (status code 400)
     *         or A valid authentication token was not provided with the request, so the API could not associate a user with the request. (status code 401)
     *         or The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to. (status code 403)
     *         or Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist. (status code 404)
     *         or There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase. (status code 500)
     */
    @Operation(
        operationId = "updateGoalRelationship",
        summary = "Update a goal relationship",
        description = "An existing goal relationship can be updated by making a PUT request on the URL for that goal relationship. Only the fields provided in the `data` block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated goal relationship record.",
        tags = { "Goal relationships" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully updated the goal relationship.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetGoalRelationship200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "A valid authentication token was not provided with the request, so the API could not associate a user with the request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "personalAccessToken"),
            @SecurityRequirement(name = "oauth2")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/goal_relationships/{goal_relationship_gid}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<GetGoalRelationship200Response> updateGoalRelationship(
        @Parameter(name = "goal_relationship_gid", description = "Globally unique identifier for the goal relationship.", required = true, in = ParameterIn.PATH) @PathVariable("goal_relationship_gid") String goalRelationshipGid,
        @Parameter(name = "UpdateGoalRelationshipRequest", description = "The updated fields for the goal relationship.", required = true) @Valid @RequestBody UpdateGoalRelationshipRequest updateGoalRelationshipRequest,
        @Parameter(name = "opt_pretty", description = "Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_pretty", required = false) Boolean optPretty,
        @Parameter(name = "opt_fields", description = "Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_fields", required = false) List<String> optFields
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}