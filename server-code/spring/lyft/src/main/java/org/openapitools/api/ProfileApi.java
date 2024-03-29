/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Profile;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "User", description = "Endpoints that require a user context")
public interface ProfileApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /profile : The user&#39;s general info
     * The v1 of this endpoint returns the user&#39;s ID, v2 will return more general info about the user. We require authentication for this endpoint, so we extract the user ID from the access token. 
     *
     * @return User ID was found and returned (status code 200)
     */
    @Operation(
        operationId = "getProfile",
        summary = "The user's general info",
        description = "The v1 of this endpoint returns the user's ID, v2 will return more general info about the user. We require authentication for this endpoint, so we extract the user ID from the access token. ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "User ID was found and returned", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Profile.class))
            })
        },
        security = {
            @SecurityRequirement(name = "User Authentication", scopes={ "profile" })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/profile",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Profile> getProfile(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"has_taken_a_ride\" : true, \"last_name\" : \"last_name\", \"id\" : \"id\", \"first_name\" : \"first_name\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
