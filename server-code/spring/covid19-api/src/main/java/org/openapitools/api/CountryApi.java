/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.GetLatestCountryDataByName200ResponseInner;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:30.536179-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Country", description = "the Country API")
public interface CountryApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /country/all : getLatestAllCountries
     * Get latest data from all countries.
     *
     * @param format Format of the response (optional, default to json)
     * @return Returns all countries with latest data about COVID-19 (status code 200)
     */
    @Operation(
        operationId = "getLatestAllCountries",
        summary = "getLatestAllCountries",
        description = "Get latest data from all countries.",
        tags = { "Country" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Returns all countries with latest data about COVID-19", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = GetLatestCountryDataByName200ResponseInner.class))),
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = GetLatestCountryDataByName200ResponseInner.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/country/all",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<List<GetLatestCountryDataByName200ResponseInner>> getLatestAllCountries(
        @Parameter(name = "format", description = "Format of the response", in = ParameterIn.QUERY) @Valid @RequestParam(value = "format", required = false, defaultValue = "json") String format
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"country\" : \"country\", \"recovered\" : 2, \"critical\" : 6, \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\", \"latitude\" : 5.962134, \"lastChange\" : \"2000-01-23T04:56:07.000+00:00\", \"confirmed\" : 0, \"deaths\" : 1, \"longitude\" : 5.637377 }, { \"country\" : \"country\", \"recovered\" : 2, \"critical\" : 6, \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\", \"latitude\" : 5.962134, \"lastChange\" : \"2000-01-23T04:56:07.000+00:00\", \"confirmed\" : 0, \"deaths\" : 1, \"longitude\" : 5.637377 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <confirmed>123</confirmed> <country>aeiou</country> <critical>123</critical> <deaths>123</deaths> <lastChange>2000-01-23T04:56:07.000Z</lastChange> <lastUpdate>2000-01-23T04:56:07.000Z</lastUpdate> <latitude>1.3579</latitude> <longitude>1.3579</longitude> <recovered>123</recovered> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /country/code : getLatestCountryDataByCode
     * Get latest data for specific country. Country code and format are in parametars. Country code is in ISO 3166-1 standard. It can be 2 chars (Alpha-2) or 3 chars (Alpha-3) type.
     *
     * @param code Country code (required)
     * @param format Format of the response (optional, default to json)
     * @return Latest data about COVID-19 for selected country (status code 200)
     */
    @Operation(
        operationId = "getLatestCountryDataByCode",
        summary = "getLatestCountryDataByCode",
        description = "Get latest data for specific country. Country code and format are in parametars. Country code is in ISO 3166-1 standard. It can be 2 chars (Alpha-2) or 3 chars (Alpha-3) type.",
        tags = { "Country" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Latest data about COVID-19 for selected country", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = GetLatestCountryDataByName200ResponseInner.class))),
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = GetLatestCountryDataByName200ResponseInner.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/country/code",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<List<GetLatestCountryDataByName200ResponseInner>> getLatestCountryDataByCode(
        @NotNull @Parameter(name = "code", description = "Country code", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "code", required = true) String code,
        @Parameter(name = "format", description = "Format of the response", in = ParameterIn.QUERY) @Valid @RequestParam(value = "format", required = false, defaultValue = "json") String format
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"country\" : \"country\", \"recovered\" : 2, \"critical\" : 6, \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\", \"latitude\" : 5.962134, \"lastChange\" : \"2000-01-23T04:56:07.000+00:00\", \"confirmed\" : 0, \"deaths\" : 1, \"longitude\" : 5.637377 }, { \"country\" : \"country\", \"recovered\" : 2, \"critical\" : 6, \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\", \"latitude\" : 5.962134, \"lastChange\" : \"2000-01-23T04:56:07.000+00:00\", \"confirmed\" : 0, \"deaths\" : 1, \"longitude\" : 5.637377 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <confirmed>123</confirmed> <country>aeiou</country> <critical>123</critical> <deaths>123</deaths> <lastChange>2000-01-23T04:56:07.000Z</lastChange> <lastUpdate>2000-01-23T04:56:07.000Z</lastUpdate> <latitude>1.3579</latitude> <longitude>1.3579</longitude> <recovered>123</recovered> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /country : getLatestCountryDataByName
     * Get latest data for specific country. Country name and format are in parametars.
     *
     * @param name Name of the country (required)
     * @param format Format of the response (optional, default to json)
     * @return Latest data about COVID-19 for selected country (status code 200)
     */
    @Operation(
        operationId = "getLatestCountryDataByName",
        summary = "getLatestCountryDataByName",
        description = "Get latest data for specific country. Country name and format are in parametars.",
        tags = { "Country" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Latest data about COVID-19 for selected country", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = GetLatestCountryDataByName200ResponseInner.class))),
                @Content(mediaType = "application/xml", array = @ArraySchema(schema = @Schema(implementation = GetLatestCountryDataByName200ResponseInner.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/country",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<List<GetLatestCountryDataByName200ResponseInner>> getLatestCountryDataByName(
        @NotNull @Parameter(name = "name", description = "Name of the country", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "name", required = true) String name,
        @Parameter(name = "format", description = "Format of the response", in = ParameterIn.QUERY) @Valid @RequestParam(value = "format", required = false, defaultValue = "json") String format
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"country\" : \"country\", \"recovered\" : 2, \"critical\" : 6, \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\", \"latitude\" : 5.962134, \"lastChange\" : \"2000-01-23T04:56:07.000+00:00\", \"confirmed\" : 0, \"deaths\" : 1, \"longitude\" : 5.637377 }, { \"country\" : \"country\", \"recovered\" : 2, \"critical\" : 6, \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\", \"latitude\" : 5.962134, \"lastChange\" : \"2000-01-23T04:56:07.000+00:00\", \"confirmed\" : 0, \"deaths\" : 1, \"longitude\" : 5.637377 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <confirmed>123</confirmed> <country>aeiou</country> <critical>123</critical> <deaths>123</deaths> <lastChange>2000-01-23T04:56:07.000Z</lastChange> <lastUpdate>2000-01-23T04:56:07.000Z</lastUpdate> <latitude>1.3579</latitude> <longitude>1.3579</longitude> <recovered>123</recovered> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
