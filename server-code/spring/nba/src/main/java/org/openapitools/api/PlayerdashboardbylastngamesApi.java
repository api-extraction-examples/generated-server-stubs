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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:33.355233-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "playerdashboardbylastngames", description = "the playerdashboardbylastngames API")
public interface PlayerdashboardbylastngamesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /playerdashboardbylastngames
     *
     * @param measureType  (required)
     * @param perMode  (required)
     * @param plusMinus  (required)
     * @param paceAdjust  (required)
     * @param rank  (required)
     * @param season  (required)
     * @param seasonType  (required)
     * @param playerID  (required)
     * @param outcome  (required)
     * @param location  (required)
     * @param month  (required)
     * @param seasonSegment  (required)
     * @param dateFrom  (required)
     * @param dateTo  (required)
     * @param opponentTeamID  (required)
     * @param vsConference  (required)
     * @param vsDivision  (required)
     * @param gameSegment  (required)
     * @param period  (required)
     * @param lastNGames  (required)
     * @return 200 OK (status code 200)
     *         or Bad request - bad parameters (status code 400)
     *         or &#39;No HTTP resource was found that matches the request URI&#39; - possible deprecated endpoint (status code 404)
     */
    @Operation(
        operationId = "playerdashboardbylastngamesGet",
        responses = {
            @ApiResponse(responseCode = "200", description = "200 OK"),
            @ApiResponse(responseCode = "400", description = "Bad request - bad parameters"),
            @ApiResponse(responseCode = "404", description = "'No HTTP resource was found that matches the request URI' - possible deprecated endpoint")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/playerdashboardbylastngames"
    )
    
    default ResponseEntity<Void> playerdashboardbylastngamesGet(
        @NotNull @Parameter(name = "MeasureType", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "MeasureType", required = true) String measureType,
        @NotNull @Parameter(name = "PerMode", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "PerMode", required = true) String perMode,
        @NotNull @Parameter(name = "PlusMinus", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "PlusMinus", required = true) String plusMinus,
        @NotNull @Parameter(name = "PaceAdjust", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "PaceAdjust", required = true) String paceAdjust,
        @NotNull @Parameter(name = "Rank", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Rank", required = true) String rank,
        @NotNull @Parameter(name = "Season", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Season", required = true) String season,
        @NotNull @Parameter(name = "SeasonType", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "SeasonType", required = true) String seasonType,
        @NotNull @Parameter(name = "PlayerID", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "PlayerID", required = true) String playerID,
        @NotNull @Parameter(name = "Outcome", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Outcome", required = true) String outcome,
        @NotNull @Parameter(name = "Location", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Location", required = true) String location,
        @NotNull @Parameter(name = "Month", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Month", required = true) String month,
        @NotNull @Parameter(name = "SeasonSegment", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "SeasonSegment", required = true) String seasonSegment,
        @NotNull @Parameter(name = "DateFrom", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "DateFrom", required = true) String dateFrom,
        @NotNull @Parameter(name = "DateTo", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "DateTo", required = true) String dateTo,
        @NotNull @Parameter(name = "OpponentTeamID", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "OpponentTeamID", required = true) String opponentTeamID,
        @NotNull @Parameter(name = "VsConference", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "VsConference", required = true) String vsConference,
        @NotNull @Parameter(name = "VsDivision", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "VsDivision", required = true) String vsDivision,
        @NotNull @Parameter(name = "GameSegment", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "GameSegment", required = true) String gameSegment,
        @NotNull @Parameter(name = "Period", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "Period", required = true) String period,
        @NotNull @Parameter(name = "LastNGames", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "LastNGames", required = true) String lastNGames
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
