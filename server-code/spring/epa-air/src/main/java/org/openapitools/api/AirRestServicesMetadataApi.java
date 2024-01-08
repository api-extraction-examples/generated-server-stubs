/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.AirRestServicesMetadataGet200Response;
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
@Tag(name = "Metadata", description = "the Metadata API")
public interface AirRestServicesMetadataApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /air_rest_services.metadata : Clean Air Act Metadata Service
     * Returns the JSON Object Name and ColumnId for usage with the qcolumns parameter for get_qid, get_facility_info and other service endpoints.
     *
     * @param output Output Format Flag.  Enter one of the following keywords: - JSON &#x3D; Data model formatted as Javascript Object Notation (default). - JSONP &#x3D; Data model formatted as Javascript Object Notation with Padding.   - XML &#x3D; Data model formatted as Extensible Markup Language. (optional)
     * @param paramCallback JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
     * @return Results are an array of columns/objects. (status code 200)
     */
    @Operation(
        operationId = "airRestServicesMetadataGet",
        summary = "Clean Air Act Metadata Service",
        description = "Returns the JSON Object Name and ColumnId for usage with the qcolumns parameter for get_qid, get_facility_info and other service endpoints.",
        tags = { "Metadata" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Results are an array of columns/objects.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AirRestServicesMetadataGet200Response.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = AirRestServicesMetadataGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/air_rest_services.metadata",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<AirRestServicesMetadataGet200Response> airRestServicesMetadataGet(
        @Parameter(name = "output", description = "Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "output", required = false) String output,
        @Parameter(name = "callback", description = "JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "callback", required = false) String paramCallback
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Results\" : { \"Message\" : \"Success\", \"ResultColumns\" : [ { \"ColumnID\" : \"ColumnID\", \"ColumnName\" : \"ColumnName\", \"Description\" : \"Description\", \"DataLength\" : \"10\", \"DataType\" : \"NUMBER\", \"ObjectName\" : \"CaseName\" }, { \"ColumnID\" : \"ColumnID\", \"ColumnName\" : \"ColumnName\", \"Description\" : \"Description\", \"DataLength\" : \"10\", \"DataType\" : \"NUMBER\", \"ObjectName\" : \"CaseName\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Root> </Root>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /air_rest_services.metadata : Clean Air Act Metadata Service
     * Returns the JSON Object Name and ColumnId for usage with the qcolumns parameter for get_qid, get_facility_info and other service endpoints.
     *
     * @param output Output Format Flag.  Enter one of the following keywords: - JSON &#x3D; Data model formatted as Javascript Object Notation (default). - JSONP &#x3D; Data model formatted as Javascript Object Notation with Padding.   - XML &#x3D; Data model formatted as Extensible Markup Language. (optional)
     * @param paramCallback JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
     * @return Results are an array of columns/objects. (status code 200)
     */
    @Operation(
        operationId = "airRestServicesMetadataPost",
        summary = "Clean Air Act Metadata Service",
        description = "Returns the JSON Object Name and ColumnId for usage with the qcolumns parameter for get_qid, get_facility_info and other service endpoints.",
        tags = { "Metadata" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Results are an array of columns/objects.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AirRestServicesMetadataGet200Response.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = AirRestServicesMetadataGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/air_rest_services.metadata",
        produces = { "application/json", "application/xml" },
        consumes = { "application/x-www-form-urlencoded" }
    )
    
    default ResponseEntity<AirRestServicesMetadataGet200Response> airRestServicesMetadataPost(
        @Parameter(name = "output", description = "Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language.") @Valid @RequestParam(value = "output", required = false) String output,
        @Parameter(name = "callback", description = "JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response.") @Valid @RequestParam(value = "callback", required = false) String paramCallback
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Results\" : { \"Message\" : \"Success\", \"ResultColumns\" : [ { \"ColumnID\" : \"ColumnID\", \"ColumnName\" : \"ColumnName\", \"Description\" : \"Description\", \"DataLength\" : \"10\", \"DataType\" : \"NUMBER\", \"ObjectName\" : \"CaseName\" }, { \"ColumnID\" : \"ColumnID\", \"ColumnName\" : \"ColumnName\", \"Description\" : \"Description\", \"DataLength\" : \"10\", \"DataType\" : \"NUMBER\", \"ObjectName\" : \"CaseName\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<Root> </Root>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}