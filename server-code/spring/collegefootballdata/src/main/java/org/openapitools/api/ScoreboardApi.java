/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.ScoreboardGame;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "games", description = "Games scores and statistics")
public interface ScoreboardApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /scoreboard : Live game results (Patreon only)
     * Get live game results
     *
     * @param classification Classification filter (fbs, fcs, ii, or iii). Defaults to fbs. (optional)
     * @param conference Conference abbreviation filter. (optional)
     * @return successful operation (status code 200)
     *         or error (status code 400)
     */
    @Operation(
        operationId = "getScoreboard",
        summary = "Live game results (Patreon only)",
        description = "Get live game results",
        tags = { "games" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ScoreboardGame.class)))
            }),
            @ApiResponse(responseCode = "400", description = "error")
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/scoreboard",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<ScoreboardGame>> getScoreboard(
        @Parameter(name = "classification", description = "Classification filter (fbs, fcs, ii, or iii). Defaults to fbs.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "classification", required = false) String classification,
        @Parameter(name = "conference", description = "Conference abbreviation filter.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "conference", required = false) String conference
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"venue\" : { \"city\" : \"city\", \"name\" : \"name\", \"state\" : \"state\" }, \"period\" : 9, \"tv\" : \"tv\", \"awayTeam\" : { \"conference\" : \"conference\", \"name\" : \"name\", \"id\" : 0, \"classification\" : \"classification\", \"points\" : 6 }, \"possession\" : \"possession\", \"betting\" : { \"homeMoneyline\" : 5, \"overUnder\" : 5.637376656633329, \"awayMoneyline\" : 1, \"spread\" : 2.3021358869347655 }, \"clock\" : \"clock\", \"startTimeTBD\" : true, \"conferenceGame\" : true, \"weather\" : { \"temperature\" : 3.616076749251911, \"description\" : \"description\", \"windDirection\" : 2.027123023002322, \"windSpeed\" : 4.145608029883936 }, \"homeTeam\" : { \"conference\" : \"conference\", \"name\" : \"name\", \"id\" : 0, \"classification\" : \"classification\", \"points\" : 6 }, \"id\" : 7, \"neutralSite\" : true, \"situation\" : \"situation\", \"startDate\" : \"startDate\", \"status\" : \"status\" }, { \"venue\" : { \"city\" : \"city\", \"name\" : \"name\", \"state\" : \"state\" }, \"period\" : 9, \"tv\" : \"tv\", \"awayTeam\" : { \"conference\" : \"conference\", \"name\" : \"name\", \"id\" : 0, \"classification\" : \"classification\", \"points\" : 6 }, \"possession\" : \"possession\", \"betting\" : { \"homeMoneyline\" : 5, \"overUnder\" : 5.637376656633329, \"awayMoneyline\" : 1, \"spread\" : 2.3021358869347655 }, \"clock\" : \"clock\", \"startTimeTBD\" : true, \"conferenceGame\" : true, \"weather\" : { \"temperature\" : 3.616076749251911, \"description\" : \"description\", \"windDirection\" : 2.027123023002322, \"windSpeed\" : 4.145608029883936 }, \"homeTeam\" : { \"conference\" : \"conference\", \"name\" : \"name\", \"id\" : 0, \"classification\" : \"classification\", \"points\" : 6 }, \"id\" : 7, \"neutralSite\" : true, \"situation\" : \"situation\", \"startDate\" : \"startDate\", \"status\" : \"status\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
