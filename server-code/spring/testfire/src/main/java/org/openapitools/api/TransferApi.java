/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.Transfer;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:43.475854-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "3. Transfer", description = "Transfer funds between accounts")
public interface TransferApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /transfer
     * Transfer money between two accounts
     *
     * @param authorization Authorization token (provided upon successful login) (required)
     * @param body Transfer details including ammount, sender and receiver (required)
     * @return Successful operation (status code 200)
     *         or Bad parameters: Please check provided values (status code 400)
     *         or Internal server error (status code 501)
     */
    @Operation(
        operationId = "trasnfer",
        description = "Transfer money between two accounts",
        tags = { "3. Transfer" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "400", description = "Bad parameters: Please check provided values"),
            @ApiResponse(responseCode = "501", description = "Internal server error")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/transfer",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> trasnfer(
        @NotNull @Parameter(name = "Authorization", description = "Authorization token (provided upon successful login)", required = true, in = ParameterIn.HEADER) @RequestHeader(value = "Authorization", required = true) String authorization,
        @Parameter(name = "body", description = "Transfer details including ammount, sender and receiver", required = true) @Valid @RequestBody Transfer body
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}