/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.LivePlayByPlay;
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
@Tag(name = "plays", description = "Play by play data")
public interface LiveApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /live/plays : Live metrics and PBP (Patreon only)
     * Get live metrics and PBP
     *
     * @param id Game id (required)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getLivePlays",
        summary = "Live metrics and PBP (Patreon only)",
        description = "Get live metrics and PBP",
        tags = { "plays" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LivePlayByPlay.class))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/live/plays",
        produces = { "application/json" }
    )
    
    default ResponseEntity<LivePlayByPlay> getLivePlays(
        @NotNull @Parameter(name = "id", description = "Game id", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "id", required = true) Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"period\" : 8, \"distance\" : 0, \"teams\" : [ { \"plays\" : 3, \"secondLevelYardsPerRush\" : 4.652396432933246, \"successRate\" : 7.740351818741173, \"totalEpa\" : 3.0576100241049344, \"openFieldYards\" : 6, \"passingDownSuccessRate\" : 6.704019297950036, \"epaPerRush\" : 6.965117697638846, \"passingEpa\" : 3.353193347011243, \"team\" : \"team\", \"epaPerPass\" : 6.438423552598547, \"secondLevelYards\" : 0, \"epaPerPlay\" : 3.5571952270680973, \"points\" : 7, \"lineYards\" : 2, \"lineYardsPerRush\" : 6.778324963048013, \"homeAway\" : \"homeAway\", \"pointsPerOpportunity\" : 0.8851374739011653, \"scoringOpportunities\" : 6, \"drives\" : 9, \"openFieldYardsPerRush\" : 5.944895607614016, \"standardDownSuccessRate\" : 8.969578798196912, \"teamId\" : 3, \"rushingEpa\" : 7.058770351582356, \"explosiveness\" : 1.284659006116532 }, { \"plays\" : 3, \"secondLevelYardsPerRush\" : 4.652396432933246, \"successRate\" : 7.740351818741173, \"totalEpa\" : 3.0576100241049344, \"openFieldYards\" : 6, \"passingDownSuccessRate\" : 6.704019297950036, \"epaPerRush\" : 6.965117697638846, \"passingEpa\" : 3.353193347011243, \"team\" : \"team\", \"epaPerPass\" : 6.438423552598547, \"secondLevelYards\" : 0, \"epaPerPlay\" : 3.5571952270680973, \"points\" : 7, \"lineYards\" : 2, \"lineYardsPerRush\" : 6.778324963048013, \"homeAway\" : \"homeAway\", \"pointsPerOpportunity\" : 0.8851374739011653, \"scoringOpportunities\" : 6, \"drives\" : 9, \"openFieldYardsPerRush\" : 5.944895607614016, \"standardDownSuccessRate\" : 8.969578798196912, \"teamId\" : 3, \"rushingEpa\" : 7.058770351582356, \"explosiveness\" : 1.284659006116532 } ], \"drives\" : [ { \"startClock\" : \"startClock\", \"plays\" : [ { \"period\" : 1, \"homeScore\" : 1, \"distance\" : 2, \"clock\" : \"clock\", \"team\" : \"team\", \"downType\" : \"downType\", \"down\" : 4, \"yardsGained\" : 1, \"playTypeId\" : 6, \"rushPass\" : \"rushPass\", \"awayScore\" : 3, \"playType\" : \"playType\", \"success\" : true, \"epa\" : 7.386281948385884, \"teamId\" : 7, \"wallclock\" : \"wallclock\", \"garbageTime\" : true, \"playText\" : \"playText\", \"yardsToGoal\" : 4, \"id\" : 1 }, { \"period\" : 1, \"homeScore\" : 1, \"distance\" : 2, \"clock\" : \"clock\", \"team\" : \"team\", \"downType\" : \"downType\", \"down\" : 4, \"yardsGained\" : 1, \"playTypeId\" : 6, \"rushPass\" : \"rushPass\", \"awayScore\" : 3, \"playType\" : \"playType\", \"success\" : true, \"epa\" : 7.386281948385884, \"teamId\" : 7, \"wallclock\" : \"wallclock\", \"garbageTime\" : true, \"playText\" : \"playText\", \"yardsToGoal\" : 4, \"id\" : 1 } ], \"endPeriod\" : 5, \"offense\" : \"offense\", \"yards\" : 9, \"defenseId\" : 1, \"duration\" : \"duration\", \"playCount\" : 9, \"startPeriod\" : 5, \"endYardsToGoal\" : 5, \"scoringOpportunity\" : true, \"defense\" : \"defense\", \"endClock\" : \"endClock\", \"offenseId\" : 7, \"id\" : 2, \"startYardsToGoal\" : 9 }, { \"startClock\" : \"startClock\", \"plays\" : [ { \"period\" : 1, \"homeScore\" : 1, \"distance\" : 2, \"clock\" : \"clock\", \"team\" : \"team\", \"downType\" : \"downType\", \"down\" : 4, \"yardsGained\" : 1, \"playTypeId\" : 6, \"rushPass\" : \"rushPass\", \"awayScore\" : 3, \"playType\" : \"playType\", \"success\" : true, \"epa\" : 7.386281948385884, \"teamId\" : 7, \"wallclock\" : \"wallclock\", \"garbageTime\" : true, \"playText\" : \"playText\", \"yardsToGoal\" : 4, \"id\" : 1 }, { \"period\" : 1, \"homeScore\" : 1, \"distance\" : 2, \"clock\" : \"clock\", \"team\" : \"team\", \"downType\" : \"downType\", \"down\" : 4, \"yardsGained\" : 1, \"playTypeId\" : 6, \"rushPass\" : \"rushPass\", \"awayScore\" : 3, \"playType\" : \"playType\", \"success\" : true, \"epa\" : 7.386281948385884, \"teamId\" : 7, \"wallclock\" : \"wallclock\", \"garbageTime\" : true, \"playText\" : \"playText\", \"yardsToGoal\" : 4, \"id\" : 1 } ], \"endPeriod\" : 5, \"offense\" : \"offense\", \"yards\" : 9, \"defenseId\" : 1, \"duration\" : \"duration\", \"playCount\" : 9, \"startPeriod\" : 5, \"endYardsToGoal\" : 5, \"scoringOpportunity\" : true, \"defense\" : \"defense\", \"endClock\" : \"endClock\", \"offenseId\" : 7, \"id\" : 2, \"startYardsToGoal\" : 9 } ], \"possession\" : \"possession\", \"yardsToGoal\" : 7, \"clock\" : \"clock\", \"id\" : 6, \"down\" : 6, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
