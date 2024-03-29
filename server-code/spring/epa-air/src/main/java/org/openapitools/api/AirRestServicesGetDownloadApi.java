/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import java.math.BigDecimal;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Facilities", description = "the Facilities API")
public interface AirRestServicesGetDownloadApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /air_rest_services.get_download : Clean Air Act Download Data Service
     * Based on the QID obtained from a get_facilities or get_facility_info query, return a comma sepated vaule (CSV) file of the facilities found.
     *
     * @param qid Query ID Selector.  Enter the QueryID number from a previously run query. (required)
     * @param output Output Format Flag.  Enter one of the following keywords: - CSV &#x3D; Facility results formatted as comma delimited file download (default). - GEOJSOND &#x3D; Facility results formatted as GeoJSON feature collection download. (optional)
     * @param qcolumns Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
     * @param pPrettyPrint Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
     * @return Results are a comma separated value (CSV) file or a file containing a GeoJSON feature collection. (status code 200)
     */
    @Operation(
        operationId = "airRestServicesGetDownloadGet",
        summary = "Clean Air Act Download Data Service",
        description = "Based on the QID obtained from a get_facilities or get_facility_info query, return a comma sepated vaule (CSV) file of the facilities found.",
        tags = { "Facilities" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Results are a comma separated value (CSV) file or a file containing a GeoJSON feature collection.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = org.springframework.core.io.Resource.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = org.springframework.core.io.Resource.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/air_rest_services.get_download",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<org.springframework.core.io.Resource> airRestServicesGetDownloadGet(
        @NotNull @Parameter(name = "qid", description = "Query ID Selector.  Enter the QueryID number from a previously run query.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "qid", required = true) String qid,
        @Parameter(name = "output", description = "Output Format Flag.  Enter one of the following keywords: - CSV = Facility results formatted as comma delimited file download (default). - GEOJSOND = Facility results formatted as GeoJSON feature collection download.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "output", required = false) String output,
        @Parameter(name = "qcolumns", description = "Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "qcolumns", required = false) String qcolumns,
        @Parameter(name = "p_pretty_print", description = "Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "p_pretty_print", required = false) BigDecimal pPrettyPrint
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /air_rest_services.get_download : Clean Air Act Download Data Service
     * Based on the QID obtained from a get_facilities or get_facility_info query, return a comma sepated vaule (CSV) file of the facilities found.
     *
     * @param qid Query ID Selector.  Enter the QueryID number from a previously run query. (required)
     * @param output Output Format Flag.  Enter one of the following keywords: - CSV &#x3D; Facility results formatted as comma delimited file download (default). - GEOJSOND &#x3D; Facility results formatted as GeoJSON feature collection download. (optional)
     * @param qcolumns Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
     * @param pPrettyPrint Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
     * @return Results are a comma separated value (CSV) file or a file containing a GeoJSON feature collection. (status code 200)
     */
    @Operation(
        operationId = "airRestServicesGetDownloadPost",
        summary = "Clean Air Act Download Data Service",
        description = "Based on the QID obtained from a get_facilities or get_facility_info query, return a comma sepated vaule (CSV) file of the facilities found.",
        tags = { "Facilities" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Results are a comma separated value (CSV) file or a file containing a GeoJSON feature collection.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = org.springframework.core.io.Resource.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = org.springframework.core.io.Resource.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/air_rest_services.get_download",
        produces = { "application/json", "application/xml" },
        consumes = { "application/x-www-form-urlencoded" }
    )
    
    default ResponseEntity<org.springframework.core.io.Resource> airRestServicesGetDownloadPost(
        @Parameter(name = "qid", description = "Query ID Selector.  Enter the QueryID number from a previously run query.", required = true) @Valid @RequestParam(value = "qid", required = true) String qid,
        @Parameter(name = "output", description = "Output Format Flag.  Enter one of the following keywords: - CSV = Facility results formatted as comma delimited file download (default). - GEOJSOND = Facility results formatted as GeoJSON feature collection download.") @Valid @RequestParam(value = "output", required = false) String output,
        @Parameter(name = "qcolumns", description = "Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions.") @Valid @RequestParam(value = "qcolumns", required = false) String qcolumns,
        @Parameter(name = "p_pretty_print", description = "Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost.") @Valid @RequestParam(value = "p_pretty_print", required = false) BigDecimal pPrettyPrint
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
