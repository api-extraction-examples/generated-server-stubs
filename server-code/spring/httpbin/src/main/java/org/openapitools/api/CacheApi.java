/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

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
@Tag(name = "Response inspection", description = "Inspect the response data like caching and headers")
public interface CacheApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /cache : Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise.
     *
     * @param ifModifiedSince  (optional)
     * @param ifNoneMatch  (optional)
     * @return Cached response (status code 200)
     *         or Modified (status code 304)
     */
    @Operation(
        operationId = "cacheGet",
        summary = "Returns a 304 if an If-Modified-Since header or If-None-Match is present. Returns the same as a GET otherwise.",
        tags = { "Response inspection" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Cached response"),
            @ApiResponse(responseCode = "304", description = "Modified")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cache"
    )
    
    default ResponseEntity<Void> cacheGet(
        @Parameter(name = "If-Modified-Since", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "If-Modified-Since", required = false) String ifModifiedSince,
        @Parameter(name = "If-None-Match", description = "", in = ParameterIn.HEADER) @RequestHeader(value = "If-None-Match", required = false) String ifNoneMatch
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /cache/{value} : Sets a Cache-Control header for n seconds.
     *
     * @param value  (required)
     * @return Cache control set (status code 200)
     */
    @Operation(
        operationId = "cacheValueGet",
        summary = "Sets a Cache-Control header for n seconds.",
        tags = { "Response inspection" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Cache control set")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/cache/{value}"
    )
    
    default ResponseEntity<Void> cacheValueGet(
        @Parameter(name = "value", description = "", required = true, in = ParameterIn.PATH) @PathVariable("value") Integer value
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
