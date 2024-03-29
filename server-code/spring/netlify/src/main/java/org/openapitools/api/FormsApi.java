/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.Submission;
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
@Tag(name = "submission", description = "the submission API")
public interface FormsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /forms/{form_id}/submissions
     *
     * @param formId  (required)
     * @param page  (optional)
     * @param perPage  (optional)
     * @return OK (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "listFormSubmissions",
        tags = { "submission" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Submission.class)))
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
        value = "/forms/{form_id}/submissions",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Submission>> listFormSubmissions(
        @Parameter(name = "form_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("form_id") String formId,
        @Parameter(name = "page", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "page", required = false) Integer page,
        @Parameter(name = "per_page", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "per_page", required = false) Integer perPage
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"summary\" : \"summary\", \"number\" : 0, \"data\" : \"{}\", \"site_url\" : \"site_url\", \"name\" : \"name\", \"created_at\" : \"created_at\", \"last_name\" : \"last_name\", \"company\" : \"company\", \"id\" : \"id\", \"body\" : \"body\", \"first_name\" : \"first_name\", \"email\" : \"email\" }, { \"summary\" : \"summary\", \"number\" : 0, \"data\" : \"{}\", \"site_url\" : \"site_url\", \"name\" : \"name\", \"created_at\" : \"created_at\", \"last_name\" : \"last_name\", \"company\" : \"company\", \"id\" : \"id\", \"body\" : \"body\", \"first_name\" : \"first_name\", \"email\" : \"email\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
