/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ErrorResponse;
import org.openapitools.model.ProgrammesResponse;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Collections", description = "the Collections API")
public interface CollectionsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /collections/{pid}/members : Collection Members
     * Episodes and Clips from Collection 
     *
     * @param xAPIKey API_KEY (required)
     * @param pid pid (required)
     * @param offset Paginated results offset (optional)
     * @param limit Paginated results limit (optional)
     * @return OK (status code 200)
     *         or Collection not found (status code 404)
     *         or Unexpected error (status code 200)
     */
    @Operation(
        operationId = "getCollectionMembers",
        summary = "Collection Members",
        description = "Episodes and Clips from Collection ",
        tags = { "Collections" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProgrammesResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Collection not found", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "default", description = "Unexpected error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/collections/{pid}/members",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ProgrammesResponse> getCollectionMembers(
        @NotNull @Parameter(name = "X-API-Key", description = "API_KEY", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "X-API-Key", required = true) String xAPIKey,
        @Parameter(name = "pid", description = "pid", required = true, in = ParameterIn.PATH) @PathVariable("pid") String pid,
        @Parameter(name = "offset", description = "Paginated results offset", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offset", required = false) Integer offset,
        @Parameter(name = "limit", description = "Paginated results limit", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) Integer limit
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"total\" : 1, \"$schema\" : \"$schema\", \"offset\" : 6, \"limit\" : 0, \"results\" : [ { \"pid\" : \"pid\", \"type\" : \"brand_summary\" }, { \"pid\" : \"pid\", \"type\" : \"brand_summary\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
