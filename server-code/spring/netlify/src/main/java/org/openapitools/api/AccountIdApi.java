/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.BuildStatus;
import org.openapitools.model.Error;
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
@Tag(name = "build", description = "the build API")
public interface AccountIdApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /{account_id}/builds/status
     *
     * @param accountId  (required)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "getAccountBuildStatus",
        tags = { "build" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = BuildStatus.class)))
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
        value = "/{account_id}/builds/status",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<BuildStatus>> getAccountBuildStatus(
        @Parameter(name = "account_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("account_id") String accountId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"enqueued\" : 1, \"minutes\" : { \"current\" : 5, \"previous\" : 2, \"last_updated_at\" : \"last_updated_at\", \"period_end_date\" : \"period_end_date\", \"included_minutes\" : \"included_minutes\", \"period_start_date\" : \"period_start_date\", \"included_minutes_with_packs\" : \"included_minutes_with_packs\", \"current_average_sec\" : 5 }, \"pending_concurrency\" : 7, \"active\" : 0, \"build_count\" : 6 }, { \"enqueued\" : 1, \"minutes\" : { \"current\" : 5, \"previous\" : 2, \"last_updated_at\" : \"last_updated_at\", \"period_end_date\" : \"period_end_date\", \"included_minutes\" : \"included_minutes\", \"period_start_date\" : \"period_start_date\", \"included_minutes_with_packs\" : \"included_minutes_with_packs\", \"current_average_sec\" : 5 }, \"pending_concurrency\" : 7, \"active\" : 0, \"build_count\" : 6 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
