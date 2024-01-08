/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Connection;
import org.openapitools.model.ConnectionCollection;
import org.openapitools.model.ConnectionTest;
import org.openapitools.model.Error;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Connection", description = "the Connection API")
public interface ConnectionsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /connections/{connection_id} : Delete a connection
     *
     * @param connectionId The connection ID. (required)
     * @return Success. (status code 204)
     *         or Client specified an invalid argument. (status code 400)
     *         or Request not authenticated due to missing, invalid, authentication info. (status code 401)
     *         or Client does not have sufficient permission. (status code 403)
     *         or A specified resource is not found. (status code 404)
     */
    @Operation(
        operationId = "deleteConnection",
        summary = "Delete a connection",
        tags = { "Connection" },
        responses = {
            @ApiResponse(responseCode = "204", description = "Success."),
            @ApiResponse(responseCode = "400", description = "Client specified an invalid argument.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "401", description = "Request not authenticated due to missing, invalid, authentication info.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "Client does not have sufficient permission.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "A specified resource is not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/connections/{connection_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Void> deleteConnection(
        @Parameter(name = "connection_id", description = "The connection ID.", required = true, in = ParameterIn.PATH) @PathVariable("connection_id") String connectionId
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /connections/{connection_id} : Get a connection
     *
     * @param connectionId The connection ID. (required)
     * @return Success. (status code 200)
     *         or Request not authenticated due to missing, invalid, authentication info. (status code 401)
     *         or Client does not have sufficient permission. (status code 403)
     *         or A specified resource is not found. (status code 404)
     */
    @Operation(
        operationId = "getConnection",
        summary = "Get a connection",
        tags = { "Connection" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Connection.class))
            }),
            @ApiResponse(responseCode = "401", description = "Request not authenticated due to missing, invalid, authentication info.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "Client does not have sufficient permission.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "A specified resource is not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/connections/{connection_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Connection> getConnection(
        @Parameter(name = "connection_id", description = "The connection ID.", required = true, in = ParameterIn.PATH) @PathVariable("connection_id") String connectionId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /connections : List connections
     *
     * @param limit The numbers of items to return. (optional, default to 100)
     * @param offset The number of items to skip before starting to collect the result set. (optional)
     * @param orderBy The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0*  (optional)
     * @return Success. (status code 200)
     *         or Request not authenticated due to missing, invalid, authentication info. (status code 401)
     *         or Client does not have sufficient permission. (status code 403)
     */
    @Operation(
        operationId = "getConnections",
        summary = "List connections",
        tags = { "Connection" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ConnectionCollection.class))
            }),
            @ApiResponse(responseCode = "401", description = "Request not authenticated due to missing, invalid, authentication info.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "Client does not have sufficient permission.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/connections",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ConnectionCollection> getConnections(
        @Parameter(name = "limit", description = "The numbers of items to return.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "limit", required = false, defaultValue = "100") Integer limit,
        @Min(0) @Parameter(name = "offset", description = "The number of items to skip before starting to collect the result set.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "offset", required = false) Integer offset,
        @Parameter(name = "order_by", description = "The name of the field to order the results by. Prefix a field name with `-` to reverse the sort order.  *New in version 2.1.0* ", in = ParameterIn.QUERY) @Valid @RequestParam(value = "order_by", required = false) String orderBy
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /connections/{connection_id} : Update a connection
     *
     * @param connectionId The connection ID. (required)
     * @param connection  (required)
     * @param updateMask The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields.  (optional)
     * @return Success. (status code 200)
     *         or Client specified an invalid argument. (status code 400)
     *         or Request not authenticated due to missing, invalid, authentication info. (status code 401)
     *         or Client does not have sufficient permission. (status code 403)
     *         or A specified resource is not found. (status code 404)
     */
    @Operation(
        operationId = "patchConnection",
        summary = "Update a connection",
        tags = { "Connection" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Connection.class))
            }),
            @ApiResponse(responseCode = "400", description = "Client specified an invalid argument.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "401", description = "Request not authenticated due to missing, invalid, authentication info.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "Client does not have sufficient permission.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "A specified resource is not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/connections/{connection_id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Connection> patchConnection(
        @Parameter(name = "connection_id", description = "The connection ID.", required = true, in = ParameterIn.PATH) @PathVariable("connection_id") String connectionId,
        @Parameter(name = "Connection", description = "", required = true) @Valid @RequestBody Connection connection,
        @Parameter(name = "update_mask", description = "The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. ", in = ParameterIn.QUERY) @Valid @RequestParam(value = "update_mask", required = false) List<String> updateMask
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /connections : Create a connection
     *
     * @param connection  (required)
     * @return Success. (status code 200)
     *         or Client specified an invalid argument. (status code 400)
     *         or Request not authenticated due to missing, invalid, authentication info. (status code 401)
     *         or Client does not have sufficient permission. (status code 403)
     */
    @Operation(
        operationId = "postConnection",
        summary = "Create a connection",
        tags = { "Connection" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Connection.class))
            }),
            @ApiResponse(responseCode = "400", description = "Client specified an invalid argument.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "401", description = "Request not authenticated due to missing, invalid, authentication info.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "Client does not have sufficient permission.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/connections",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Connection> postConnection(
        @Parameter(name = "Connection", description = "", required = true) @Valid @RequestBody Connection connection
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /connections/test : Test a connection
     * Test a connection.  *New in version 2.2.0* 
     *
     * @param connection  (required)
     * @return Success. (status code 200)
     *         or Client specified an invalid argument. (status code 400)
     *         or Request not authenticated due to missing, invalid, authentication info. (status code 401)
     *         or Client does not have sufficient permission. (status code 403)
     *         or A specified resource is not found. (status code 404)
     */
    @Operation(
        operationId = "testConnection",
        summary = "Test a connection",
        description = "Test a connection.  *New in version 2.2.0* ",
        tags = { "Connection" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Success.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ConnectionTest.class))
            }),
            @ApiResponse(responseCode = "400", description = "Client specified an invalid argument.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "401", description = "Request not authenticated due to missing, invalid, authentication info.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "403", description = "Client does not have sufficient permission.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            }),
            @ApiResponse(responseCode = "404", description = "A specified resource is not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/connections/test",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<ConnectionTest> testConnection(
        @Parameter(name = "Connection", description = "", required = true) @Valid @RequestBody Connection connection
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"message\" : \"message\", \"status\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
