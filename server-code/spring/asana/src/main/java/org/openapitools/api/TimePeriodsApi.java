/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.ErrorResponse;
import org.openapitools.model.GetTimePeriod200Response;
import org.openapitools.model.GetTimePeriods200Response;
import java.time.LocalDate;
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
@Tag(name = "Time periods", description = "A time period is an object that represents a domain-scoped date range that can be set on [goals](/docs/goals).")
public interface TimePeriodsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /time_periods/{time_period_gid} : Get a time period
     * Returns the full record for a single time period.
     *
     * @param timePeriodGid Globally unique identifier for the time period. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @return Successfully retrieved the record for a single time period. (status code 200)
     *         or This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again. (status code 400)
     *         or A valid authentication token was not provided with the request, so the API could not associate a user with the request. (status code 401)
     *         or The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to. (status code 403)
     *         or Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist. (status code 404)
     *         or There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase. (status code 500)
     */
    @Operation(
        operationId = "getTimePeriod",
        summary = "Get a time period",
        description = "Returns the full record for a single time period.",
        tags = { "Time periods" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the record for a single time period.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetTimePeriod200Response.class))
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
        value = "/time_periods/{time_period_gid}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<GetTimePeriod200Response> getTimePeriod(
        @Parameter(name = "time_period_gid", description = "Globally unique identifier for the time period.", required = true, in = ParameterIn.PATH) @PathVariable("time_period_gid") String timePeriodGid,
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
     * GET /time_periods : Get time periods
     * Returns compact time period records.
     *
     * @param workspace Globally unique identifier for the workspace. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @param limit Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
     * @param offset Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39; (optional)
     * @param startOn ISO 8601 date string (optional)
     * @param endOn ISO 8601 date string (optional)
     * @return Successfully retrieved the requested time periods. (status code 200)
     *         or This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again. (status code 400)
     *         or A valid authentication token was not provided with the request, so the API could not associate a user with the request. (status code 401)
     *         or The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to. (status code 403)
     *         or Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist. (status code 404)
     *         or There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase. (status code 500)
     */
    @Operation(
        operationId = "getTimePeriods",
        summary = "Get time periods",
        description = "Returns compact time period records.",
        tags = { "Time periods" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved the requested time periods.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = GetTimePeriods200Response.class))
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
        value = "/time_periods",
        produces = { "application/json" }
    )
    
    default ResponseEntity<GetTimePeriods200Response> getTimePeriods(
        @NotNull @Parameter(name = "workspace", description = "Globally unique identifier for the workspace.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "workspace", required = true) String workspace,
        @Parameter(name = "opt_pretty", description = "Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_pretty", required = false) Boolean optPretty,
        @Parameter(name = "opt_fields", description = "Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_fields", required = false) List<String> optFields,
        @Parameter(name = "limit", description = "Results per page. The number of objects to return per page. The value must be between 1 and 100.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) Integer limit,
        @Parameter(name = "offset", description = "Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.'", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offset", required = false) String offset,
        @Parameter(name = "start_on", description = "ISO 8601 date string", in = ParameterIn.QUERY) @Valid @RequestParam(value = "start_on", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startOn,
        @Parameter(name = "end_on", description = "ISO 8601 date string", in = ParameterIn.QUERY) @Valid @RequestParam(value = "end_on", required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endOn
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

}
