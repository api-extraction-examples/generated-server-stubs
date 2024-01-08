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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:00.699800-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Auth", description = "Auth methods")
public interface HiddenBasicAuthApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /hidden-basic-auth/{user}/{passwd} : Prompts the user for authorization using HTTP Basic Auth.
     *
     * @param user  (required)
     * @param passwd  (required)
     * @return Sucessful authentication. (status code 200)
     *         or Unsuccessful authentication. (status code 404)
     */
    @Operation(
        operationId = "hiddenBasicAuthUserPasswdGet",
        summary = "Prompts the user for authorization using HTTP Basic Auth.",
        tags = { "Auth" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Sucessful authentication."),
            @ApiResponse(responseCode = "404", description = "Unsuccessful authentication.")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/hidden-basic-auth/{user}/{passwd}"
    )
    
    default ResponseEntity<Void> hiddenBasicAuthUserPasswdGet(
        @Parameter(name = "user", description = "", required = true, in = ParameterIn.PATH) @PathVariable("user") String user,
        @Parameter(name = "passwd", description = "", required = true, in = ParameterIn.PATH) @PathVariable("passwd") String passwd
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
