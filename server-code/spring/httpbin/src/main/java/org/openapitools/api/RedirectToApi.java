/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.RedirectToPutRequest;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:00.699800-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Redirects", description = "Returns different redirect responses")
public interface RedirectToApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /redirect-to : 302/3XX Redirects to the given URL.
     *
     * @return A redirection. (status code 302)
     */
    @Operation(
        operationId = "redirectToDelete",
        summary = "302/3XX Redirects to the given URL.",
        tags = { "Redirects" },
        responses = {
            @ApiResponse(responseCode = "302", description = "A redirection.")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/redirect-to"
    )
    
    default ResponseEntity<Void> redirectToDelete(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /redirect-to : 302/3XX Redirects to the given URL.
     *
     * @param url  (required)
     * @param statusCode  (optional)
     * @return A redirection. (status code 302)
     */
    @Operation(
        operationId = "redirectToGet",
        summary = "302/3XX Redirects to the given URL.",
        tags = { "Redirects" },
        responses = {
            @ApiResponse(responseCode = "302", description = "A redirection.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/redirect-to"
    )
    
    default ResponseEntity<Void> redirectToGet(
        @NotNull @Parameter(name = "url", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "url", required = true) String url,
        @Parameter(name = "status_code", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "status_code", required = false) Integer statusCode
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /redirect-to : 302/3XX Redirects to the given URL.
     *
     * @return A redirection. (status code 302)
     */
    @Operation(
        operationId = "redirectToPatch",
        summary = "302/3XX Redirects to the given URL.",
        tags = { "Redirects" },
        responses = {
            @ApiResponse(responseCode = "302", description = "A redirection.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/redirect-to"
    )
    
    default ResponseEntity<Void> redirectToPatch(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /redirect-to : 302/3XX Redirects to the given URL.
     *
     * @param redirectToPutRequest  (required)
     * @return A redirection. (status code 302)
     */
    @Operation(
        operationId = "redirectToPost",
        summary = "302/3XX Redirects to the given URL.",
        tags = { "Redirects" },
        responses = {
            @ApiResponse(responseCode = "302", description = "A redirection.")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/redirect-to",
        consumes = { "application/x-www-form-urlencoded" }
    )
    
    default ResponseEntity<Void> redirectToPost(
        @Parameter(name = "RedirectToPutRequest", description = "", required = true) @Valid @RequestBody RedirectToPutRequest redirectToPutRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /redirect-to : 302/3XX Redirects to the given URL.
     *
     * @param redirectToPutRequest  (required)
     * @return A redirection. (status code 302)
     */
    @Operation(
        operationId = "redirectToPut",
        summary = "302/3XX Redirects to the given URL.",
        tags = { "Redirects" },
        responses = {
            @ApiResponse(responseCode = "302", description = "A redirection.")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/redirect-to",
        consumes = { "application/x-www-form-urlencoded" }
    )
    
    default ResponseEntity<Void> redirectToPut(
        @Parameter(name = "RedirectToPutRequest", description = "", required = true) @Valid @RequestBody RedirectToPutRequest redirectToPutRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * TRACE /redirect-to : 302/3XX Redirects to the given URL.
     *
     * @return A redirection. (status code 302)
     */
    @Operation(
        operationId = "redirectToTrace",
        summary = "302/3XX Redirects to the given URL.",
        tags = { "Redirects" },
        responses = {
            @ApiResponse(responseCode = "302", description = "A redirection.")
        }
    )
    @RequestMapping(
        method = RequestMethod.TRACE,
        value = "/redirect-to"
    )
    
    default ResponseEntity<Void> redirectToTrace(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}