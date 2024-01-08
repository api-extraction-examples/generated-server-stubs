/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Error;
import org.openapitools.model.Service;
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
@Tag(name = "service", description = "the service API")
public interface ServicesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /services/
     *
     * @param search  (optional)
     * @return services (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "getServices",
        tags = { "service" },
        responses = {
            @ApiResponse(responseCode = "200", description = "services", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Service.class)))
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
        value = "/services/",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Service>> getServices(
        @Parameter(name = "search", description = "", in = ParameterIn.QUERY) @Valid @RequestParam(value = "search", required = false) String search
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"environments\" : [ \"environments\", \"environments\" ], \"icon\" : \"icon\", \"created_at\" : \"created_at\", \"description\" : \"description\", \"long_description\" : \"long_description\", \"tags\" : [ \"tags\", \"tags\" ], \"updated_at\" : \"updated_at\", \"name\" : \"name\", \"manifest_url\" : \"manifest_url\", \"id\" : \"id\", \"service_path\" : \"service_path\", \"events\" : [ \"{}\", \"{}\" ], \"slug\" : \"slug\" }, { \"environments\" : [ \"environments\", \"environments\" ], \"icon\" : \"icon\", \"created_at\" : \"created_at\", \"description\" : \"description\", \"long_description\" : \"long_description\", \"tags\" : [ \"tags\", \"tags\" ], \"updated_at\" : \"updated_at\", \"name\" : \"name\", \"manifest_url\" : \"manifest_url\", \"id\" : \"id\", \"service_path\" : \"service_path\", \"events\" : [ \"{}\", \"{}\" ], \"slug\" : \"slug\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /services/{addonName}
     *
     * @param addonName  (required)
     * @return services (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "showService",
        tags = { "service" },
        responses = {
            @ApiResponse(responseCode = "200", description = "services", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Service.class))
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
        value = "/services/{addonName}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Service> showService(
        @Parameter(name = "addonName", description = "", required = true, in = ParameterIn.PATH) @PathVariable("addonName") String addonName
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"environments\" : [ \"environments\", \"environments\" ], \"icon\" : \"icon\", \"created_at\" : \"created_at\", \"description\" : \"description\", \"long_description\" : \"long_description\", \"tags\" : [ \"tags\", \"tags\" ], \"updated_at\" : \"updated_at\", \"name\" : \"name\", \"manifest_url\" : \"manifest_url\", \"id\" : \"id\", \"service_path\" : \"service_path\", \"events\" : [ \"{}\", \"{}\" ], \"slug\" : \"slug\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /services/{addonName}/manifest
     *
     * @param addonName  (required)
     * @return retrieving from provider (status code 201)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "showServiceManifest",
        tags = { "service" },
        responses = {
            @ApiResponse(responseCode = "201", description = "retrieving from provider", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Object.class))
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
        value = "/services/{addonName}/manifest",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Object> showServiceManifest(
        @Parameter(name = "addonName", description = "", required = true, in = ParameterIn.PATH) @PathVariable("addonName") String addonName
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}