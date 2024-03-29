/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.AuditLogEntries;
import org.openapitools.model.AuditLogEntry;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Audit log", description = "the Audit log API")
public interface AuditlogApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /auditlog : Get a list of all audit log entries. The query parameters allow you to restrict the returned results by date ranges, resource specifiers, or a full-text search query.
     *
     * @param before A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have before this timestamp. (optional)
     * @param after A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occurred after this timestamp. (optional)
     * @param q Text to search for. You can search for the full or partial name of the resource involved or full or partial email address of the member who made the change. (optional)
     * @param limit A limit on the number of audit log entries to be returned, between 1 and 20. (optional)
     * @param spec A resource specifier, allowing you to filter audit log listings by resource. (optional)
     * @return Audit log entries response. (status code 200)
     *         or Invalid request body. (status code 400)
     *         or Invalid access token. (status code 401)
     */
    @Operation(
        operationId = "getAuditLogEntries",
        summary = "Get a list of all audit log entries. The query parameters allow you to restrict the returned results by date ranges, resource specifiers, or a full-text search query.",
        tags = { "Audit log" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Audit log entries response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AuditLogEntries.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid request body."),
            @ApiResponse(responseCode = "401", description = "Invalid access token.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/auditlog",
        produces = { "application/json" }
    )
    
    default ResponseEntity<AuditLogEntries> getAuditLogEntries(
        @Parameter(name = "before", description = "A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have before this timestamp.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "before", required = false) Long before,
        @Parameter(name = "after", description = "A timestamp filter, expressed as a Unix epoch time in milliseconds. All entries returned will have occurred after this timestamp.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "after", required = false) Long after,
        @Parameter(name = "q", description = "Text to search for. You can search for the full or partial name of the resource involved or full or partial email address of the member who made the change.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "q", required = false) String q,
        @Parameter(name = "limit", description = "A limit on the number of audit log entries to be returned, between 1 and 20.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false) BigDecimal limit,
        @Parameter(name = "spec", description = "A resource specifier, allowing you to filter audit log listings by resource.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "spec", required = false) String spec
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"items\" : [ { \"date\" : 1472243938774, \"titleVerb\" : \"changed the name of\", \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"kind\" : \"environment\", \"member\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"name\" : \"Testing\", \"description\" : \"Changed the name from Test to Testing\", \"comment\" : \"This is a comment string\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"shortDescription\" : \"\\"\\"\", \"title\" : \"[Reese Applebaum](mailto:refapp@launchdarkly.com) changed the name of [Testing](https://app.launchdarkly.com/settings#/projects)\", \"target\" : { \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"name\" : \"Testing\", \"resources\" : [ \"proj/alexis:env/test\", \"proj/alexis:env/test\" ] } }, { \"date\" : 1472243938774, \"titleVerb\" : \"changed the name of\", \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"kind\" : \"environment\", \"member\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"name\" : \"Testing\", \"description\" : \"Changed the name from Test to Testing\", \"comment\" : \"This is a comment string\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"shortDescription\" : \"\\"\\"\", \"title\" : \"[Reese Applebaum](mailto:refapp@launchdarkly.com) changed the name of [Testing](https://app.launchdarkly.com/settings#/projects)\", \"target\" : { \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"name\" : \"Testing\", \"resources\" : [ \"proj/alexis:env/test\", \"proj/alexis:env/test\" ] } } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /auditlog/{resourceId} : Use this endpoint to fetch a single audit log entry by its resouce ID.
     *
     * @param resourceId The resource ID. (required)
     * @return Audit log entry response. (status code 200)
     *         or Invalid access token. (status code 401)
     *         or Invalid resource specifier. (status code 404)
     */
    @Operation(
        operationId = "getAuditLogEntry",
        summary = "Use this endpoint to fetch a single audit log entry by its resouce ID.",
        tags = { "Audit log" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Audit log entry response.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AuditLogEntry.class))
            }),
            @ApiResponse(responseCode = "401", description = "Invalid access token."),
            @ApiResponse(responseCode = "404", description = "Invalid resource specifier.")
        },
        security = {
            @SecurityRequirement(name = "Token")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/auditlog/{resourceId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<AuditLogEntry> getAuditLogEntry(
        @Parameter(name = "resourceId", description = "The resource ID.", required = true, in = ParameterIn.PATH) @PathVariable("resourceId") String resourceId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"date\" : 1472243938774, \"titleVerb\" : \"changed the name of\", \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"kind\" : \"environment\", \"member\" : { \"firstName\" : \"Alan\", \"lastName\" : \"Turing\", \"_verified\" : true, \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"_pendingInvite\" : true, \"_lastSeen\" : 1469326565348, \"isBeta\" : true, \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"_lastSeenMetadata\" : { \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\" }, \"email\" : \"user@launchdarkly.com\", \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ] }, \"name\" : \"Testing\", \"description\" : \"Changed the name from Test to Testing\", \"comment\" : \"This is a comment string\", \"_id\" : \"5a580a01b4ff89217bdf9dc1\", \"shortDescription\" : \"\\"\\"\", \"title\" : \"[Reese Applebaum](mailto:refapp@launchdarkly.com) changed the name of [Testing](https://app.launchdarkly.com/settings#/projects)\", \"target\" : { \"_links\" : { \"next\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" }, \"self\" : { \"href\" : \"/api/v2/endpoint\", \"type\" : \"application/json\" } }, \"name\" : \"Testing\", \"resources\" : [ \"proj/alexis:env/test\", \"proj/alexis:env/test\" ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
