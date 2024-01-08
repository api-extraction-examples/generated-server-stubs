/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.AirRestServicesGetGeojsonGet200Response;
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
public interface AirRestServicesGetGeojsonApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /air_rest_services.get_geojson : Clean Air Act GeoJSON Service
     * Based on the QID obtained from a get_facilities or get_facility_info query, return GeoJSON of the facilities found.
     *
     * @param qid Query ID Selector.  Enter the QueryID number from a previously run query. (required)
     * @param output Output Format Flag.  Enter one of the following keywords: - GEOJSON &#x3D; Facility results formatted as GeoJSON feature collection (default). - GEOJSONP &#x3D; Facility results formatted as GeoJSON feature collection with Padding. - GEOJSOND &#x3D; Facility results formatted as GeoJSON feature collection download. (optional)
     * @param paramCallback JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
     * @param newsort Output Sort Column.  Enter the number of the column on which the data will be sorted. If unpopulated results will sort on the first column. (optional)
     * @param descending Output Sort Column Descending Flag.  Enter Y to column identified in the newsort parameter descending.  Enter N to use ascending sort order. Used only when newsort parameter is populated. (optional)
     * @param qcolumns Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
     * @param pPrettyPrint Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
     * @return Results are formatted as a GeoJSON feature collection. (status code 200)
     */
    @Operation(
        operationId = "airRestServicesGetGeojsonGet",
        summary = "Clean Air Act GeoJSON Service",
        description = "Based on the QID obtained from a get_facilities or get_facility_info query, return GeoJSON of the facilities found.",
        tags = { "Facilities" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Results are formatted as a GeoJSON feature collection.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AirRestServicesGetGeojsonGet200Response.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = AirRestServicesGetGeojsonGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/air_rest_services.get_geojson",
        produces = { "application/json", "application/xml" }
    )
    
    default ResponseEntity<AirRestServicesGetGeojsonGet200Response> airRestServicesGetGeojsonGet(
        @NotNull @Parameter(name = "qid", description = "Query ID Selector.  Enter the QueryID number from a previously run query.", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "qid", required = true) String qid,
        @Parameter(name = "output", description = "Output Format Flag.  Enter one of the following keywords: - GEOJSON = Facility results formatted as GeoJSON feature collection (default). - GEOJSONP = Facility results formatted as GeoJSON feature collection with Padding. - GEOJSOND = Facility results formatted as GeoJSON feature collection download.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "output", required = false) String output,
        @Parameter(name = "callback", description = "JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "callback", required = false) String paramCallback,
        @Parameter(name = "newsort", description = "Output Sort Column.  Enter the number of the column on which the data will be sorted. If unpopulated results will sort on the first column.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "newsort", required = false) BigDecimal newsort,
        @Parameter(name = "descending", description = "Output Sort Column Descending Flag.  Enter Y to column identified in the newsort parameter descending.  Enter N to use ascending sort order. Used only when newsort parameter is populated.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "descending", required = false) String descending,
        @Parameter(name = "qcolumns", description = "Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "qcolumns", required = false) String qcolumns,
        @Parameter(name = "p_pretty_print", description = "Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "p_pretty_print", required = false) BigDecimal pPrettyPrint
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"features\" : [ { \"geometry\" : { \"coordinates\" : -87.86253, \"type\" : \"Point\" }, \"type\" : \"Feature\", \"properties\" : { \"LocalControlRegionCode\" : \"LocalControlRegionCode\", \"RmpIDs\" : \"110000\", \"EPASystem\" : \"ICP\", \"FacUsMexBorderFlg\" : \"Y\", \"MaxPctileUs\" : 54.7, \"OtherPermitIDs\" : \"OtherPermitIDs\", \"Ea5yrFlag\" : 0.0, \"AIRState\" : \"WI\", \"LastDatePce\" : \"04/25/2014\", \"AIRLastStckTestResults\" : \"04/25/2014\", \"AIRLastPenaltyDate\" : \"05/16/2014\", \"ReferencePoint\" : \"ENTRANCE POINT OF A FACILITY OR STATION\", \"AIRHpvStatus\" : \"true\", \"CurrVioFlag\" : 1.0, \"AIRDaysLastEval\" : 2806.0, \"AIRTRIbalEPAids\" : \"AIRTRIbalEPAids\", \"AIRCity\" : \"Washington\", \"AIRStackTest5YrAll\" : \"AIRStackTest5YrAll\", \"PctileProximityRmpUs\" : 54.7, \"AIRLastEvalDateEPA\" : \"05/16/2014\", \"AIRQtrsWithHpv\" : 4.0, \"AIRMnthsWithHpv\" : 3.0, \"RCRAIDs\" : \"VAD981111784\", \"AIRMacts\" : \"ZZZZZ\", \"GHGIDs\" : \"110000\", \"AIRLastFeaDateEPA\" : \"05/16/2014\", \"FacFederalAgencyCode\" : \"E\", \"AIRQtrsWithViol\" : 2.0, \"AIRStatus\" : \"Permanently Closed\", \"Map\" : \"Map\", \"FacCamdReporter\" : \"Y\", \"FacEisAIRReleases\" : \"2.35\", \"FacDerivedWBD\" : \"20700100204\", \"FacGHGCO2Releases\" : \"100\", \"Over80CountUs\" : 3.0, \"AIRStreet\" : \"2130 P STREET N.W.\", \"FacIndianSpatialFlg\" : \"Y\", \"NaaPollutants\" : \"OZONE\", \"AIRLastStckDateEPA\" : \"04/25/2014\", \"AIRComplStatus\" : \"No Viol\", \"FacDerivedHuc\" : \"552968\", \"AIRFacilityTypeDesc\" : \"AIRFacilityTypeDesc\", \"FacTRICarcAIRReleases\" : \"24\", \"NaStandardsNaa\" : \"NaStandardsNaa\", \"NaaCategories\" : \"8-HOUR OZONE(2015)\", \"AIRIDs\" : \"DC0000001100195254\", \"PctileCancerUs\" : 99.0, \"RegistryID\" : \"110020837601\", \"ChesapeakeBayFlag\" : \"Y\", \"AIRMajorFlag\" : \"N\", \"PctileProximityNPDESUs\" : 45.3, \"AIRLastIeaDateState\" : \"04/25/2014\", \"PctilePctpre1960Us\" : 14.6, \"AIRFIPSCode\" : \"11001\", \"AIRLastStckTestDate\" : \"04/25/2014\", \"SourceID\" : \"ALR040033\", \"AIRCaseIDs\" : \"05-1993-1585 05-2014-5021\", \"AIREPARegion\" : \"05\", \"SDWAIDs\" : \"DC0000001\", \"Insp5yrFlag\" : 1.0, \"AIRLastIeaDateEPA\" : \"04/25/2014\", \"FacMapFlg\" : \"Y\", \"AIRLastFeaDateState\" : \"05/16/2014\", \"AIRPenalties\" : \"$435\", \"CWAIDs\" : \"DC0000001\", \"CensusBlockGroup\" : \"110010096022\", \"AIRName\" : \"WEST PARK CLEANERS\", \"PctileProximityTsdfUs\" : 42.4, \"AIRNsps\" : \"NSPS Part 60\", \"AIRLastViolDate\" : \"04/25/2014\", \"AIRTRIbalNames\" : \"AIRTRIbalNames\", \"AIRZip\" : \"20037\", \"PctileTrafficScoreUs\" : 7.0, \"AIRLastFeaDate\" : \"05/16/2014\", \"MaintPollutantsNaa\" : \"MaintPollutantsNaa\", \"AIRPollRecentViol\" : \"Sulfur\", \"AIRIeaCnt\" : \"2\", \"FacDerivedTRIbes\" : \"Cherokee Nation\", \"MaintStatusNaa\" : \"MaintStatusNaa\", \"AIRStackTest5YrFail\" : \"AIRStackTest5YrFail\", \"EisIDs\" : \"12620001\", \"WebDocs\" : \"C6\", \"AIRIndianCntryFlg\" : \"N\", \"Statute\" : \"CWA\", \"AIRLastIeaDate\" : \"04/25/2014\", \"AIRNspsm\" : \"NSPS Part 60\", \"AIREvalCnt\" : 0.0, \"FacPopulationDensity\" : 9611.17, \"AIRClassification\" : \"AIRClassification\", \"PctileO3Us\" : 52.4, \"AIRPrograms\" : \"MACT, SIP\", \"Lower48\" : \"Y\", \"AIR3yrComplQtrsHistory\" : \"VV__SS_U__V_\", \"ActiveLower48\" : \"ActiveLower48\", \"NaStatusNaa\" : \"NaStatusNaa\", \"FacNaaFlag\" : \"Y\", \"EjscreenFlagUs\" : \"EjscreenFlagUs\", \"FacEisReporter\" : \"Y\", \"PctileProximityNplUs\" : 38.9, \"TRIIDs\" : \"20011FRTTT5001F\", \"Score\" : 1.0, \"AIRLastEvalDateState\" : \"05/18/2009\", \"PctileDpmUs\" : 99.0, \"FacFIPSCode\" : \"55001\", \"NaPollutantsNaa\" : \"NaPollutantsNaa\", \"PctilePmUs\" : 52.4, \"AIRLastStckDateState\" : \"04/25/2014\", \"FacIndianCntryFlg\" : \"FacIndianCntryFlg\", \"FacMapIcon\" : \"CWA-NC-MJ-2.png\", \"LastDatePceSta\" : \"04/25/2014\", \"AIRLastEvalDate\" : \"05/18/2009\", \"EjscreenFlag\" : \"EjscreenFlag\", \"MaxScore\" : 1.0, \"Infea5yrFlag\" : 1.0, \"AIRFeaCnt\" : \"2\", \"FacSICCodes\" : \"811\", \"AIRNAICS\" : \"812320\", \"LastDatePceEPA\" : \"04/25/2014\", \"TRIbalFlag\" : 1.0, \"FacTRIReporter\" : \"B\", \"MaintStandardsNaa\" : \"MaintStandardsNaa\", \"FacTRIHapsReleases\" : \"35.5\", \"HasPollRpt\" : \"Y\", \"FacFederalAgencyName\" : \"EPA\", \"FacStdCountyName\" : \"Fairfax County\", \"CalculatedAccuracyMeters\" : 50.0, \"LocalControlRegionName\" : \"LocalControlRegionName\", \"AIRCounty\" : \"Racine\", \"FacDerivedWBDName\" : \"Fourmile Run-Potomac River\", \"FacGHGReporter\" : \"Y\", \"ViolFlag\" : 1.0, \"FacCountyName\" : \"Fairfax County\", \"CurrSvFlag\" : 1.0, \"FacPercentMinority\" : 45.379, \"AIRRecentViolCnt\" : 2.0, \"AIRUniverse\" : \"Minor Emissions\", \"CamdIDs\" : \"CamdIDs\", \"FacTRIAIRReleases\" : \"36\", \"AIRFacilityTypeCode\" : \"POF\", \"PctileRespUs\" : 41.9, \"CollectionMethod\" : \"ADDRESS MATCHING-HOUSE NUMBER\" } }, { \"geometry\" : { \"coordinates\" : -87.86253, \"type\" : \"Point\" }, \"type\" : \"Feature\", \"properties\" : { \"LocalControlRegionCode\" : \"LocalControlRegionCode\", \"RmpIDs\" : \"110000\", \"EPASystem\" : \"ICP\", \"FacUsMexBorderFlg\" : \"Y\", \"MaxPctileUs\" : 54.7, \"OtherPermitIDs\" : \"OtherPermitIDs\", \"Ea5yrFlag\" : 0.0, \"AIRState\" : \"WI\", \"LastDatePce\" : \"04/25/2014\", \"AIRLastStckTestResults\" : \"04/25/2014\", \"AIRLastPenaltyDate\" : \"05/16/2014\", \"ReferencePoint\" : \"ENTRANCE POINT OF A FACILITY OR STATION\", \"AIRHpvStatus\" : \"true\", \"CurrVioFlag\" : 1.0, \"AIRDaysLastEval\" : 2806.0, \"AIRTRIbalEPAids\" : \"AIRTRIbalEPAids\", \"AIRCity\" : \"Washington\", \"AIRStackTest5YrAll\" : \"AIRStackTest5YrAll\", \"PctileProximityRmpUs\" : 54.7, \"AIRLastEvalDateEPA\" : \"05/16/2014\", \"AIRQtrsWithHpv\" : 4.0, \"AIRMnthsWithHpv\" : 3.0, \"RCRAIDs\" : \"VAD981111784\", \"AIRMacts\" : \"ZZZZZ\", \"GHGIDs\" : \"110000\", \"AIRLastFeaDateEPA\" : \"05/16/2014\", \"FacFederalAgencyCode\" : \"E\", \"AIRQtrsWithViol\" : 2.0, \"AIRStatus\" : \"Permanently Closed\", \"Map\" : \"Map\", \"FacCamdReporter\" : \"Y\", \"FacEisAIRReleases\" : \"2.35\", \"FacDerivedWBD\" : \"20700100204\", \"FacGHGCO2Releases\" : \"100\", \"Over80CountUs\" : 3.0, \"AIRStreet\" : \"2130 P STREET N.W.\", \"FacIndianSpatialFlg\" : \"Y\", \"NaaPollutants\" : \"OZONE\", \"AIRLastStckDateEPA\" : \"04/25/2014\", \"AIRComplStatus\" : \"No Viol\", \"FacDerivedHuc\" : \"552968\", \"AIRFacilityTypeDesc\" : \"AIRFacilityTypeDesc\", \"FacTRICarcAIRReleases\" : \"24\", \"NaStandardsNaa\" : \"NaStandardsNaa\", \"NaaCategories\" : \"8-HOUR OZONE(2015)\", \"AIRIDs\" : \"DC0000001100195254\", \"PctileCancerUs\" : 99.0, \"RegistryID\" : \"110020837601\", \"ChesapeakeBayFlag\" : \"Y\", \"AIRMajorFlag\" : \"N\", \"PctileProximityNPDESUs\" : 45.3, \"AIRLastIeaDateState\" : \"04/25/2014\", \"PctilePctpre1960Us\" : 14.6, \"AIRFIPSCode\" : \"11001\", \"AIRLastStckTestDate\" : \"04/25/2014\", \"SourceID\" : \"ALR040033\", \"AIRCaseIDs\" : \"05-1993-1585 05-2014-5021\", \"AIREPARegion\" : \"05\", \"SDWAIDs\" : \"DC0000001\", \"Insp5yrFlag\" : 1.0, \"AIRLastIeaDateEPA\" : \"04/25/2014\", \"FacMapFlg\" : \"Y\", \"AIRLastFeaDateState\" : \"05/16/2014\", \"AIRPenalties\" : \"$435\", \"CWAIDs\" : \"DC0000001\", \"CensusBlockGroup\" : \"110010096022\", \"AIRName\" : \"WEST PARK CLEANERS\", \"PctileProximityTsdfUs\" : 42.4, \"AIRNsps\" : \"NSPS Part 60\", \"AIRLastViolDate\" : \"04/25/2014\", \"AIRTRIbalNames\" : \"AIRTRIbalNames\", \"AIRZip\" : \"20037\", \"PctileTrafficScoreUs\" : 7.0, \"AIRLastFeaDate\" : \"05/16/2014\", \"MaintPollutantsNaa\" : \"MaintPollutantsNaa\", \"AIRPollRecentViol\" : \"Sulfur\", \"AIRIeaCnt\" : \"2\", \"FacDerivedTRIbes\" : \"Cherokee Nation\", \"MaintStatusNaa\" : \"MaintStatusNaa\", \"AIRStackTest5YrFail\" : \"AIRStackTest5YrFail\", \"EisIDs\" : \"12620001\", \"WebDocs\" : \"C6\", \"AIRIndianCntryFlg\" : \"N\", \"Statute\" : \"CWA\", \"AIRLastIeaDate\" : \"04/25/2014\", \"AIRNspsm\" : \"NSPS Part 60\", \"AIREvalCnt\" : 0.0, \"FacPopulationDensity\" : 9611.17, \"AIRClassification\" : \"AIRClassification\", \"PctileO3Us\" : 52.4, \"AIRPrograms\" : \"MACT, SIP\", \"Lower48\" : \"Y\", \"AIR3yrComplQtrsHistory\" : \"VV__SS_U__V_\", \"ActiveLower48\" : \"ActiveLower48\", \"NaStatusNaa\" : \"NaStatusNaa\", \"FacNaaFlag\" : \"Y\", \"EjscreenFlagUs\" : \"EjscreenFlagUs\", \"FacEisReporter\" : \"Y\", \"PctileProximityNplUs\" : 38.9, \"TRIIDs\" : \"20011FRTTT5001F\", \"Score\" : 1.0, \"AIRLastEvalDateState\" : \"05/18/2009\", \"PctileDpmUs\" : 99.0, \"FacFIPSCode\" : \"55001\", \"NaPollutantsNaa\" : \"NaPollutantsNaa\", \"PctilePmUs\" : 52.4, \"AIRLastStckDateState\" : \"04/25/2014\", \"FacIndianCntryFlg\" : \"FacIndianCntryFlg\", \"FacMapIcon\" : \"CWA-NC-MJ-2.png\", \"LastDatePceSta\" : \"04/25/2014\", \"AIRLastEvalDate\" : \"05/18/2009\", \"EjscreenFlag\" : \"EjscreenFlag\", \"MaxScore\" : 1.0, \"Infea5yrFlag\" : 1.0, \"AIRFeaCnt\" : \"2\", \"FacSICCodes\" : \"811\", \"AIRNAICS\" : \"812320\", \"LastDatePceEPA\" : \"04/25/2014\", \"TRIbalFlag\" : 1.0, \"FacTRIReporter\" : \"B\", \"MaintStandardsNaa\" : \"MaintStandardsNaa\", \"FacTRIHapsReleases\" : \"35.5\", \"HasPollRpt\" : \"Y\", \"FacFederalAgencyName\" : \"EPA\", \"FacStdCountyName\" : \"Fairfax County\", \"CalculatedAccuracyMeters\" : 50.0, \"LocalControlRegionName\" : \"LocalControlRegionName\", \"AIRCounty\" : \"Racine\", \"FacDerivedWBDName\" : \"Fourmile Run-Potomac River\", \"FacGHGReporter\" : \"Y\", \"ViolFlag\" : 1.0, \"FacCountyName\" : \"Fairfax County\", \"CurrSvFlag\" : 1.0, \"FacPercentMinority\" : 45.379, \"AIRRecentViolCnt\" : 2.0, \"AIRUniverse\" : \"Minor Emissions\", \"CamdIDs\" : \"CamdIDs\", \"FacTRIAIRReleases\" : \"36\", \"AIRFacilityTypeCode\" : \"POF\", \"PctileRespUs\" : 41.9, \"CollectionMethod\" : \"ADDRESS MATCHING-HOUSE NUMBER\" } } ], \"type\" : \"FeatureCollection\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <type>FeatureCollection</type> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /air_rest_services.get_geojson : Clean Air Act GeoJSON Service
     * Based on the QID obtained from a get_facilities or get_facility_info query, return GeoJSON of the facilities found.
     *
     * @param qid Query ID Selector.  Enter the QueryID number from a previously run query. (required)
     * @param output Output Format Flag.  Enter one of the following keywords: - GEOJSON &#x3D; Facility results formatted as GeoJSON feature collection (default). - GEOJSONP &#x3D; Facility results formatted as GeoJSON feature collection with Padding. - GEOJSOND &#x3D; Facility results formatted as GeoJSON feature collection download. (optional)
     * @param paramCallback JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
     * @param newsort Output Sort Column.  Enter the number of the column on which the data will be sorted. If unpopulated results will sort on the first column. (optional)
     * @param descending Output Sort Column Descending Flag.  Enter Y to column identified in the newsort parameter descending.  Enter N to use ascending sort order. Used only when newsort parameter is populated. (optional)
     * @param qcolumns Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
     * @param pPrettyPrint Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
     * @return Results are formatted as a GeoJSON feature collection. (status code 200)
     */
    @Operation(
        operationId = "airRestServicesGetGeojsonPost",
        summary = "Clean Air Act GeoJSON Service",
        description = "Based on the QID obtained from a get_facilities or get_facility_info query, return GeoJSON of the facilities found.",
        tags = { "Facilities" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Results are formatted as a GeoJSON feature collection.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AirRestServicesGetGeojsonGet200Response.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = AirRestServicesGetGeojsonGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/air_rest_services.get_geojson",
        produces = { "application/json", "application/xml" },
        consumes = { "application/x-www-form-urlencoded" }
    )
    
    default ResponseEntity<AirRestServicesGetGeojsonGet200Response> airRestServicesGetGeojsonPost(
        @Parameter(name = "qid", description = "Query ID Selector.  Enter the QueryID number from a previously run query.", required = true) @Valid @RequestParam(value = "qid", required = true) String qid,
        @Parameter(name = "output", description = "Output Format Flag.  Enter one of the following keywords: - GEOJSON = Facility results formatted as GeoJSON feature collection (default). - GEOJSONP = Facility results formatted as GeoJSON feature collection with Padding. - GEOJSOND = Facility results formatted as GeoJSON feature collection download.") @Valid @RequestParam(value = "output", required = false) String output,
        @Parameter(name = "callback", description = "JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response.") @Valid @RequestParam(value = "callback", required = false) String paramCallback,
        @Parameter(name = "newsort", description = "Output Sort Column.  Enter the number of the column on which the data will be sorted. If unpopulated results will sort on the first column.") @Valid @RequestParam(value = "newsort", required = false) BigDecimal newsort,
        @Parameter(name = "descending", description = "Output Sort Column Descending Flag.  Enter Y to column identified in the newsort parameter descending.  Enter N to use ascending sort order. Used only when newsort parameter is populated.") @Valid @RequestParam(value = "descending", required = false) String descending,
        @Parameter(name = "qcolumns", description = "Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions.") @Valid @RequestParam(value = "qcolumns", required = false) String qcolumns,
        @Parameter(name = "p_pretty_print", description = "Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost.") @Valid @RequestParam(value = "p_pretty_print", required = false) BigDecimal pPrettyPrint
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"features\" : [ { \"geometry\" : { \"coordinates\" : -87.86253, \"type\" : \"Point\" }, \"type\" : \"Feature\", \"properties\" : { \"LocalControlRegionCode\" : \"LocalControlRegionCode\", \"RmpIDs\" : \"110000\", \"EPASystem\" : \"ICP\", \"FacUsMexBorderFlg\" : \"Y\", \"MaxPctileUs\" : 54.7, \"OtherPermitIDs\" : \"OtherPermitIDs\", \"Ea5yrFlag\" : 0.0, \"AIRState\" : \"WI\", \"LastDatePce\" : \"04/25/2014\", \"AIRLastStckTestResults\" : \"04/25/2014\", \"AIRLastPenaltyDate\" : \"05/16/2014\", \"ReferencePoint\" : \"ENTRANCE POINT OF A FACILITY OR STATION\", \"AIRHpvStatus\" : \"true\", \"CurrVioFlag\" : 1.0, \"AIRDaysLastEval\" : 2806.0, \"AIRTRIbalEPAids\" : \"AIRTRIbalEPAids\", \"AIRCity\" : \"Washington\", \"AIRStackTest5YrAll\" : \"AIRStackTest5YrAll\", \"PctileProximityRmpUs\" : 54.7, \"AIRLastEvalDateEPA\" : \"05/16/2014\", \"AIRQtrsWithHpv\" : 4.0, \"AIRMnthsWithHpv\" : 3.0, \"RCRAIDs\" : \"VAD981111784\", \"AIRMacts\" : \"ZZZZZ\", \"GHGIDs\" : \"110000\", \"AIRLastFeaDateEPA\" : \"05/16/2014\", \"FacFederalAgencyCode\" : \"E\", \"AIRQtrsWithViol\" : 2.0, \"AIRStatus\" : \"Permanently Closed\", \"Map\" : \"Map\", \"FacCamdReporter\" : \"Y\", \"FacEisAIRReleases\" : \"2.35\", \"FacDerivedWBD\" : \"20700100204\", \"FacGHGCO2Releases\" : \"100\", \"Over80CountUs\" : 3.0, \"AIRStreet\" : \"2130 P STREET N.W.\", \"FacIndianSpatialFlg\" : \"Y\", \"NaaPollutants\" : \"OZONE\", \"AIRLastStckDateEPA\" : \"04/25/2014\", \"AIRComplStatus\" : \"No Viol\", \"FacDerivedHuc\" : \"552968\", \"AIRFacilityTypeDesc\" : \"AIRFacilityTypeDesc\", \"FacTRICarcAIRReleases\" : \"24\", \"NaStandardsNaa\" : \"NaStandardsNaa\", \"NaaCategories\" : \"8-HOUR OZONE(2015)\", \"AIRIDs\" : \"DC0000001100195254\", \"PctileCancerUs\" : 99.0, \"RegistryID\" : \"110020837601\", \"ChesapeakeBayFlag\" : \"Y\", \"AIRMajorFlag\" : \"N\", \"PctileProximityNPDESUs\" : 45.3, \"AIRLastIeaDateState\" : \"04/25/2014\", \"PctilePctpre1960Us\" : 14.6, \"AIRFIPSCode\" : \"11001\", \"AIRLastStckTestDate\" : \"04/25/2014\", \"SourceID\" : \"ALR040033\", \"AIRCaseIDs\" : \"05-1993-1585 05-2014-5021\", \"AIREPARegion\" : \"05\", \"SDWAIDs\" : \"DC0000001\", \"Insp5yrFlag\" : 1.0, \"AIRLastIeaDateEPA\" : \"04/25/2014\", \"FacMapFlg\" : \"Y\", \"AIRLastFeaDateState\" : \"05/16/2014\", \"AIRPenalties\" : \"$435\", \"CWAIDs\" : \"DC0000001\", \"CensusBlockGroup\" : \"110010096022\", \"AIRName\" : \"WEST PARK CLEANERS\", \"PctileProximityTsdfUs\" : 42.4, \"AIRNsps\" : \"NSPS Part 60\", \"AIRLastViolDate\" : \"04/25/2014\", \"AIRTRIbalNames\" : \"AIRTRIbalNames\", \"AIRZip\" : \"20037\", \"PctileTrafficScoreUs\" : 7.0, \"AIRLastFeaDate\" : \"05/16/2014\", \"MaintPollutantsNaa\" : \"MaintPollutantsNaa\", \"AIRPollRecentViol\" : \"Sulfur\", \"AIRIeaCnt\" : \"2\", \"FacDerivedTRIbes\" : \"Cherokee Nation\", \"MaintStatusNaa\" : \"MaintStatusNaa\", \"AIRStackTest5YrFail\" : \"AIRStackTest5YrFail\", \"EisIDs\" : \"12620001\", \"WebDocs\" : \"C6\", \"AIRIndianCntryFlg\" : \"N\", \"Statute\" : \"CWA\", \"AIRLastIeaDate\" : \"04/25/2014\", \"AIRNspsm\" : \"NSPS Part 60\", \"AIREvalCnt\" : 0.0, \"FacPopulationDensity\" : 9611.17, \"AIRClassification\" : \"AIRClassification\", \"PctileO3Us\" : 52.4, \"AIRPrograms\" : \"MACT, SIP\", \"Lower48\" : \"Y\", \"AIR3yrComplQtrsHistory\" : \"VV__SS_U__V_\", \"ActiveLower48\" : \"ActiveLower48\", \"NaStatusNaa\" : \"NaStatusNaa\", \"FacNaaFlag\" : \"Y\", \"EjscreenFlagUs\" : \"EjscreenFlagUs\", \"FacEisReporter\" : \"Y\", \"PctileProximityNplUs\" : 38.9, \"TRIIDs\" : \"20011FRTTT5001F\", \"Score\" : 1.0, \"AIRLastEvalDateState\" : \"05/18/2009\", \"PctileDpmUs\" : 99.0, \"FacFIPSCode\" : \"55001\", \"NaPollutantsNaa\" : \"NaPollutantsNaa\", \"PctilePmUs\" : 52.4, \"AIRLastStckDateState\" : \"04/25/2014\", \"FacIndianCntryFlg\" : \"FacIndianCntryFlg\", \"FacMapIcon\" : \"CWA-NC-MJ-2.png\", \"LastDatePceSta\" : \"04/25/2014\", \"AIRLastEvalDate\" : \"05/18/2009\", \"EjscreenFlag\" : \"EjscreenFlag\", \"MaxScore\" : 1.0, \"Infea5yrFlag\" : 1.0, \"AIRFeaCnt\" : \"2\", \"FacSICCodes\" : \"811\", \"AIRNAICS\" : \"812320\", \"LastDatePceEPA\" : \"04/25/2014\", \"TRIbalFlag\" : 1.0, \"FacTRIReporter\" : \"B\", \"MaintStandardsNaa\" : \"MaintStandardsNaa\", \"FacTRIHapsReleases\" : \"35.5\", \"HasPollRpt\" : \"Y\", \"FacFederalAgencyName\" : \"EPA\", \"FacStdCountyName\" : \"Fairfax County\", \"CalculatedAccuracyMeters\" : 50.0, \"LocalControlRegionName\" : \"LocalControlRegionName\", \"AIRCounty\" : \"Racine\", \"FacDerivedWBDName\" : \"Fourmile Run-Potomac River\", \"FacGHGReporter\" : \"Y\", \"ViolFlag\" : 1.0, \"FacCountyName\" : \"Fairfax County\", \"CurrSvFlag\" : 1.0, \"FacPercentMinority\" : 45.379, \"AIRRecentViolCnt\" : 2.0, \"AIRUniverse\" : \"Minor Emissions\", \"CamdIDs\" : \"CamdIDs\", \"FacTRIAIRReleases\" : \"36\", \"AIRFacilityTypeCode\" : \"POF\", \"PctileRespUs\" : 41.9, \"CollectionMethod\" : \"ADDRESS MATCHING-HOUSE NUMBER\" } }, { \"geometry\" : { \"coordinates\" : -87.86253, \"type\" : \"Point\" }, \"type\" : \"Feature\", \"properties\" : { \"LocalControlRegionCode\" : \"LocalControlRegionCode\", \"RmpIDs\" : \"110000\", \"EPASystem\" : \"ICP\", \"FacUsMexBorderFlg\" : \"Y\", \"MaxPctileUs\" : 54.7, \"OtherPermitIDs\" : \"OtherPermitIDs\", \"Ea5yrFlag\" : 0.0, \"AIRState\" : \"WI\", \"LastDatePce\" : \"04/25/2014\", \"AIRLastStckTestResults\" : \"04/25/2014\", \"AIRLastPenaltyDate\" : \"05/16/2014\", \"ReferencePoint\" : \"ENTRANCE POINT OF A FACILITY OR STATION\", \"AIRHpvStatus\" : \"true\", \"CurrVioFlag\" : 1.0, \"AIRDaysLastEval\" : 2806.0, \"AIRTRIbalEPAids\" : \"AIRTRIbalEPAids\", \"AIRCity\" : \"Washington\", \"AIRStackTest5YrAll\" : \"AIRStackTest5YrAll\", \"PctileProximityRmpUs\" : 54.7, \"AIRLastEvalDateEPA\" : \"05/16/2014\", \"AIRQtrsWithHpv\" : 4.0, \"AIRMnthsWithHpv\" : 3.0, \"RCRAIDs\" : \"VAD981111784\", \"AIRMacts\" : \"ZZZZZ\", \"GHGIDs\" : \"110000\", \"AIRLastFeaDateEPA\" : \"05/16/2014\", \"FacFederalAgencyCode\" : \"E\", \"AIRQtrsWithViol\" : 2.0, \"AIRStatus\" : \"Permanently Closed\", \"Map\" : \"Map\", \"FacCamdReporter\" : \"Y\", \"FacEisAIRReleases\" : \"2.35\", \"FacDerivedWBD\" : \"20700100204\", \"FacGHGCO2Releases\" : \"100\", \"Over80CountUs\" : 3.0, \"AIRStreet\" : \"2130 P STREET N.W.\", \"FacIndianSpatialFlg\" : \"Y\", \"NaaPollutants\" : \"OZONE\", \"AIRLastStckDateEPA\" : \"04/25/2014\", \"AIRComplStatus\" : \"No Viol\", \"FacDerivedHuc\" : \"552968\", \"AIRFacilityTypeDesc\" : \"AIRFacilityTypeDesc\", \"FacTRICarcAIRReleases\" : \"24\", \"NaStandardsNaa\" : \"NaStandardsNaa\", \"NaaCategories\" : \"8-HOUR OZONE(2015)\", \"AIRIDs\" : \"DC0000001100195254\", \"PctileCancerUs\" : 99.0, \"RegistryID\" : \"110020837601\", \"ChesapeakeBayFlag\" : \"Y\", \"AIRMajorFlag\" : \"N\", \"PctileProximityNPDESUs\" : 45.3, \"AIRLastIeaDateState\" : \"04/25/2014\", \"PctilePctpre1960Us\" : 14.6, \"AIRFIPSCode\" : \"11001\", \"AIRLastStckTestDate\" : \"04/25/2014\", \"SourceID\" : \"ALR040033\", \"AIRCaseIDs\" : \"05-1993-1585 05-2014-5021\", \"AIREPARegion\" : \"05\", \"SDWAIDs\" : \"DC0000001\", \"Insp5yrFlag\" : 1.0, \"AIRLastIeaDateEPA\" : \"04/25/2014\", \"FacMapFlg\" : \"Y\", \"AIRLastFeaDateState\" : \"05/16/2014\", \"AIRPenalties\" : \"$435\", \"CWAIDs\" : \"DC0000001\", \"CensusBlockGroup\" : \"110010096022\", \"AIRName\" : \"WEST PARK CLEANERS\", \"PctileProximityTsdfUs\" : 42.4, \"AIRNsps\" : \"NSPS Part 60\", \"AIRLastViolDate\" : \"04/25/2014\", \"AIRTRIbalNames\" : \"AIRTRIbalNames\", \"AIRZip\" : \"20037\", \"PctileTrafficScoreUs\" : 7.0, \"AIRLastFeaDate\" : \"05/16/2014\", \"MaintPollutantsNaa\" : \"MaintPollutantsNaa\", \"AIRPollRecentViol\" : \"Sulfur\", \"AIRIeaCnt\" : \"2\", \"FacDerivedTRIbes\" : \"Cherokee Nation\", \"MaintStatusNaa\" : \"MaintStatusNaa\", \"AIRStackTest5YrFail\" : \"AIRStackTest5YrFail\", \"EisIDs\" : \"12620001\", \"WebDocs\" : \"C6\", \"AIRIndianCntryFlg\" : \"N\", \"Statute\" : \"CWA\", \"AIRLastIeaDate\" : \"04/25/2014\", \"AIRNspsm\" : \"NSPS Part 60\", \"AIREvalCnt\" : 0.0, \"FacPopulationDensity\" : 9611.17, \"AIRClassification\" : \"AIRClassification\", \"PctileO3Us\" : 52.4, \"AIRPrograms\" : \"MACT, SIP\", \"Lower48\" : \"Y\", \"AIR3yrComplQtrsHistory\" : \"VV__SS_U__V_\", \"ActiveLower48\" : \"ActiveLower48\", \"NaStatusNaa\" : \"NaStatusNaa\", \"FacNaaFlag\" : \"Y\", \"EjscreenFlagUs\" : \"EjscreenFlagUs\", \"FacEisReporter\" : \"Y\", \"PctileProximityNplUs\" : 38.9, \"TRIIDs\" : \"20011FRTTT5001F\", \"Score\" : 1.0, \"AIRLastEvalDateState\" : \"05/18/2009\", \"PctileDpmUs\" : 99.0, \"FacFIPSCode\" : \"55001\", \"NaPollutantsNaa\" : \"NaPollutantsNaa\", \"PctilePmUs\" : 52.4, \"AIRLastStckDateState\" : \"04/25/2014\", \"FacIndianCntryFlg\" : \"FacIndianCntryFlg\", \"FacMapIcon\" : \"CWA-NC-MJ-2.png\", \"LastDatePceSta\" : \"04/25/2014\", \"AIRLastEvalDate\" : \"05/18/2009\", \"EjscreenFlag\" : \"EjscreenFlag\", \"MaxScore\" : 1.0, \"Infea5yrFlag\" : 1.0, \"AIRFeaCnt\" : \"2\", \"FacSICCodes\" : \"811\", \"AIRNAICS\" : \"812320\", \"LastDatePceEPA\" : \"04/25/2014\", \"TRIbalFlag\" : 1.0, \"FacTRIReporter\" : \"B\", \"MaintStandardsNaa\" : \"MaintStandardsNaa\", \"FacTRIHapsReleases\" : \"35.5\", \"HasPollRpt\" : \"Y\", \"FacFederalAgencyName\" : \"EPA\", \"FacStdCountyName\" : \"Fairfax County\", \"CalculatedAccuracyMeters\" : 50.0, \"LocalControlRegionName\" : \"LocalControlRegionName\", \"AIRCounty\" : \"Racine\", \"FacDerivedWBDName\" : \"Fourmile Run-Potomac River\", \"FacGHGReporter\" : \"Y\", \"ViolFlag\" : 1.0, \"FacCountyName\" : \"Fairfax County\", \"CurrSvFlag\" : 1.0, \"FacPercentMinority\" : 45.379, \"AIRRecentViolCnt\" : 2.0, \"AIRUniverse\" : \"Minor Emissions\", \"CamdIDs\" : \"CamdIDs\", \"FacTRIAIRReleases\" : \"36\", \"AIRFacilityTypeCode\" : \"POF\", \"PctileRespUs\" : 41.9, \"CollectionMethod\" : \"ADDRESS MATCHING-HOUSE NUMBER\" } } ], \"type\" : \"FeatureCollection\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<null> <type>FeatureCollection</type> </null>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}