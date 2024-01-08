/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.FeatureFlagStatusAcrossEnvironments;
import org.openapitools.model.UsageError;
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
@Tag(name = "Feature flags", description = "the Feature flags API")
public interface FlagStatusApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /flag-status/{projectKey}/{featureFlagKey} : Get the status for a particular feature flag across environments
     *
     * @param projectKey The project key, used to tie the flags together under one project so they can be managed together. (required)
     * @param featureFlagKey The feature flag&#39;s key. The key identifies the flag in your code. (required)
     * @return Status of the requested feature flag across environments (status code 200)
     *         or Invalid access token. (status code 401)
     *         or This is a beta API, you must pass beta in the LD-API-Version header to use it. (status code 403)
     */
    @Operation(
        operationId = "getFeatureFlagStatusAcrossEnvironments",
        summary = "Get the status for a particular feature flag across environments",
        tags = { "Feature flags" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Status of the requested feature flag across environments", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = FeatureFlagStatusAcrossEnvironments.class))
            }),
            @ApiResponse(responseCode = "401", description = "Invalid access token."),
            @ApiResponse(responseCode = "403", description = "This is a beta API, you must pass beta in the LD-API-Version header to use it.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UsageError.class))
            })
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/flag-status/{projectKey}/{featureFlagKey}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<FeatureFlagStatusAcrossEnvironments> getFeatureFlagStatusAcrossEnvironments(
        @Parameter(name = "projectKey", description = "The project key, used to tie the flags together under one project so they can be managed together.", required = true, in = ParameterIn.PATH) @PathVariable("projectKey") String projectKey,
        @Parameter(name = "featureFlagKey", description = "The feature flag's key. The key identifies the flag in your code.", required = true, in = ParameterIn.PATH) @PathVariable("featureFlagKey") String featureFlagKey
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"_links\" : { \"parent\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"environments\" : { \"key\" : { \"lastRequested\" : \"2016-08-16T21:10:11.886Z\", \"default\" : \"{}\", \"name\" : \"new\" } }, \"key\" : \"key\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
