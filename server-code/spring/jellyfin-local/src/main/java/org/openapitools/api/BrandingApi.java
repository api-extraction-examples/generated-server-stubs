/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.BrandingOptions;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Branding", description = "the Branding API")
public interface BrandingApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /Branding/Css : Gets branding css.
     *
     * @return Branding css returned. (status code 200)
     *         or No branding css configured. (status code 204)
     */
    @Operation(
        operationId = "getBrandingCss",
        summary = "Gets branding css.",
        tags = { "Branding" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Branding css returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "application/json; profile=CamelCase", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "application/json; profile=PascalCase", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "text/css", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "204", description = "No branding css configured.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Branding/Css",
        produces = { "application/json", "application/json; profile=CamelCase", "application/json; profile=PascalCase", "text/css" }
    )
    
    default ResponseEntity<String> getBrandingCss(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /Branding/Css.css : Gets branding css.
     *
     * @return Branding css returned. (status code 200)
     *         or No branding css configured. (status code 204)
     */
    @Operation(
        operationId = "getBrandingCss2",
        summary = "Gets branding css.",
        tags = { "Branding" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Branding css returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "application/json; profile=CamelCase", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "application/json; profile=PascalCase", schema = @Schema(implementation = String.class)),
                @Content(mediaType = "text/css", schema = @Schema(implementation = String.class))
            }),
            @ApiResponse(responseCode = "204", description = "No branding css configured.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Branding/Css.css",
        produces = { "application/json", "application/json; profile=CamelCase", "application/json; profile=PascalCase", "text/css" }
    )
    
    default ResponseEntity<String> getBrandingCss2(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /Branding/Configuration : Gets branding configuration.
     *
     * @return Branding configuration returned. (status code 200)
     */
    @Operation(
        operationId = "getBrandingOptions",
        summary = "Gets branding configuration.",
        tags = { "Branding" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Branding configuration returned.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = BrandingOptions.class)),
                @Content(mediaType = "application/json; profile=CamelCase", schema = @Schema(implementation = BrandingOptions.class)),
                @Content(mediaType = "application/json; profile=PascalCase", schema = @Schema(implementation = BrandingOptions.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/Branding/Configuration",
        produces = { "application/json", "application/json; profile=CamelCase", "application/json; profile=PascalCase" }
    )
    
    default ResponseEntity<BrandingOptions> getBrandingOptions(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"CustomCss\" : \"CustomCss\", \"LoginDisclaimer\" : \"LoginDisclaimer\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json; profile="CamelCase""))) {
                    String exampleString = "{ \"CustomCss\" : \"CustomCss\", \"LoginDisclaimer\" : \"LoginDisclaimer\" }";
                    ApiUtil.setExampleResponse(request, "application/json; profile="CamelCase"", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json; profile="PascalCase""))) {
                    String exampleString = "{ \"CustomCss\" : \"CustomCss\", \"LoginDisclaimer\" : \"LoginDisclaimer\" }";
                    ApiUtil.setExampleResponse(request, "application/json; profile="PascalCase"", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
