/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.AccessToken;
import org.openapitools.model.Error;
import org.openapitools.model.Ticket;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "ticket", description = "the ticket API")
public interface OauthApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /oauth/tickets
     *
     * @param clientId  (required)
     * @return ok (status code 201)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "createTicket",
        tags = { "ticket" },
        responses = {
            @ApiResponse(responseCode = "201", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Ticket.class))
            }),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/oauth/tickets",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Ticket> createTicket(
        @NotNull @Parameter(name = "client_id", description = "", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "client_id", required = true) String clientId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"authorized\" : true, \"created_at\" : \"created_at\", \"id\" : \"id\", \"client_id\" : \"client_id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /oauth/tickets/{ticket_id}/exchange
     *
     * @param ticketId  (required)
     * @return ok (status code 201)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "exchangeTicket",
        tags = { "accessToken" },
        responses = {
            @ApiResponse(responseCode = "201", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = AccessToken.class))
            }),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/oauth/tickets/{ticket_id}/exchange",
        produces = { "application/json" }
    )
    
    default ResponseEntity<AccessToken> exchangeTicket(
        @Parameter(name = "ticket_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("ticket_id") String ticketId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"access_token\" : \"access_token\", \"user_email\" : \"user_email\", \"user_id\" : \"user_id\", \"created_at\" : \"created_at\", \"id\" : \"id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /oauth/tickets/{ticket_id}
     *
     * @param ticketId  (required)
     * @return ok (status code 200)
     *         or error (status code 200)
     */
    @Operation(
        operationId = "showTicket",
        tags = { "ticket" },
        responses = {
            @ApiResponse(responseCode = "200", description = "ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Ticket.class))
            }),
            @ApiResponse(responseCode = "default", description = "error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Error.class))
            })
        },
        security = {
            @SecurityRequirement(name = "netlifyAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/oauth/tickets/{ticket_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<Ticket> showTicket(
        @Parameter(name = "ticket_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("ticket_id") String ticketId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"authorized\" : true, \"created_at\" : \"created_at\", \"id\" : \"id\", \"client_id\" : \"client_id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
