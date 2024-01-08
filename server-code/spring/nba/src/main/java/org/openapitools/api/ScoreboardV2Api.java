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
@Tag(name = "scoreboardV2", description = "the scoreboardV2 API")
public interface ScoreboardV2Api {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /scoreboardV2
     *
     * @param gameDate  (required)
     * @param leagueID  (required)
     * @param dayOffset  (required)
     * @return 200 OK (status code 200)
     *         or Bad request - bad parameters (status code 400)
     *         or &#39;No HTTP resource was found that matches the request URI&#39; - possible deprecated endpoint (status code 404)
     */
    @Operation(
        operationId = "scoreboardV2Get",
        responses = {
            @ApiResponse(responseCode = "200", description = "200 OK"),
            @ApiResponse(responseCode = "400", description = "Bad request - bad parameters"),
            @ApiResponse(responseCode = "404", description = "'No HTTP resource was found that matches the request URI' - possible deprecated endpoint")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/scoreboardV2"
    )
    
    default ResponseEntity<Void> scoreboardV2Get(
        @NotNull @Parameter(name = "GameDate", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "GameDate", required = true) String gameDate,
        @NotNull @Parameter(name = "LeagueID", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "LeagueID", required = true) String leagueID,
        @NotNull @Parameter(name = "DayOffset", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "DayOffset", required = true) String dayOffset
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}