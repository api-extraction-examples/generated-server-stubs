/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Drive;
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
@Tag(name = "drives", description = "Drive data")
public interface DrivesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /drives : Drive data and results
     * Get game drives
     *
     * @param year Year filter (required)
     * @param seasonType Season type filter (optional, default to regular)
     * @param week Week filter (optional)
     * @param team Team filter (optional)
     * @param offense Offensive team filter (optional)
     * @param defense Defensive team filter (optional)
     * @param conference Conference filter (optional)
     * @param offenseConference Offensive conference filter (optional)
     * @param defenseConference Defensive conference filter (optional)
     * @param classification Division classification filter (fbs/fcs/ii/iii) (optional)
     * @return successful operation (status code 200)
     */
    @Operation(
        operationId = "getDrives",
        summary = "Drive data and results",
        description = "Get game drives",
        tags = { "drives" },
        responses = {
            @ApiResponse(responseCode = "200", description = "successful operation", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Drive.class)))
            })
        },
        security = {
            @SecurityRequirement(name = "ApiKeyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/drives",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<Drive>> getDrives(
        @NotNull @Min(2001) @Parameter(name = "year", description = "Year filter", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "year", required = true) Integer year,
        @Parameter(name = "seasonType", description = "Season type filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "seasonType", required = false, defaultValue = "regular") String seasonType,
        @Min(1) @Max(16) @Parameter(name = "week", description = "Week filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "week", required = false) Integer week,
        @Parameter(name = "team", description = "Team filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "team", required = false) String team,
        @Parameter(name = "offense", description = "Offensive team filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offense", required = false) String offense,
        @Parameter(name = "defense", description = "Defensive team filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "defense", required = false) String defense,
        @Parameter(name = "conference", description = "Conference filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "conference", required = false) String conference,
        @Parameter(name = "offenseConference", description = "Offensive conference filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offenseConference", required = false) String offenseConference,
        @Parameter(name = "defenseConference", description = "Defensive conference filter", in = ParameterIn.QUERY) @Valid @RequestParam(value = "defenseConference", required = false) String defenseConference,
        @Parameter(name = "classification", description = "Division classification filter (fbs/fcs/ii/iii)", in = ParameterIn.QUERY) @Valid @RequestParam(value = "classification", required = false) String classification
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"scoring\" : true, \"plays\" : 4, \"offense\" : \"offense\", \"start_offense_score\" : 1, \"end_yardline\" : 7, \"start_defense_score\" : 7, \"end_time\" : { \"seconds\" : 2, \"minutes\" : 5 }, \"is_home_offense\" : true, \"drive_result\" : \"drive_result\", \"start_period\" : 1, \"offense_conference\" : \"offense_conference\", \"end_period\" : 5, \"yards\" : 7, \"end_offense_score\" : 1, \"start_yardline\" : 1, \"start_time\" : { \"seconds\" : 2, \"minutes\" : 5 }, \"defense\" : \"defense\", \"defense_conference\" : \"defense_conference\", \"drive_number\" : 0, \"end_defense_score\" : 6, \"id\" : 2, \"end_yards_to_goal\" : 9, \"game_id\" : 3, \"start_yards_to_goal\" : 6 }, { \"scoring\" : true, \"plays\" : 4, \"offense\" : \"offense\", \"start_offense_score\" : 1, \"end_yardline\" : 7, \"start_defense_score\" : 7, \"end_time\" : { \"seconds\" : 2, \"minutes\" : 5 }, \"is_home_offense\" : true, \"drive_result\" : \"drive_result\", \"start_period\" : 1, \"offense_conference\" : \"offense_conference\", \"end_period\" : 5, \"yards\" : 7, \"end_offense_score\" : 1, \"start_yardline\" : 1, \"start_time\" : { \"seconds\" : 2, \"minutes\" : 5 }, \"defense\" : \"defense\", \"defense_conference\" : \"defense_conference\", \"drive_number\" : 0, \"end_defense_score\" : 6, \"id\" : 2, \"end_yards_to_goal\" : 9, \"game_id\" : 3, \"start_yards_to_goal\" : 6 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}