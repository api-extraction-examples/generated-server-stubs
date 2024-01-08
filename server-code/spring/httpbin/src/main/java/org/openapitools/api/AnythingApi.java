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
@Tag(name = "Anything", description = "Returns anything that is passed to request")
public interface AnythingApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /anything/{anything} : Returns anything passed in request data.
     *
     * @param anything Automatically added (required)
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingAnythingDelete",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/anything/{anything}"
    )
    
    default ResponseEntity<Void> anythingAnythingDelete(
        @Parameter(name = "anything", description = "Automatically added", required = true, in = ParameterIn.PATH) @PathVariable("anything") String anything
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /anything/{anything} : Returns anything passed in request data.
     *
     * @param anything Automatically added (required)
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingAnythingGet",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/anything/{anything}"
    )
    
    default ResponseEntity<Void> anythingAnythingGet(
        @Parameter(name = "anything", description = "Automatically added", required = true, in = ParameterIn.PATH) @PathVariable("anything") String anything
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /anything/{anything} : Returns anything passed in request data.
     *
     * @param anything Automatically added (required)
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingAnythingPatch",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/anything/{anything}"
    )
    
    default ResponseEntity<Void> anythingAnythingPatch(
        @Parameter(name = "anything", description = "Automatically added", required = true, in = ParameterIn.PATH) @PathVariable("anything") String anything
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /anything/{anything} : Returns anything passed in request data.
     *
     * @param anything Automatically added (required)
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingAnythingPost",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/anything/{anything}"
    )
    
    default ResponseEntity<Void> anythingAnythingPost(
        @Parameter(name = "anything", description = "Automatically added", required = true, in = ParameterIn.PATH) @PathVariable("anything") String anything
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /anything/{anything} : Returns anything passed in request data.
     *
     * @param anything Automatically added (required)
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingAnythingPut",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/anything/{anything}"
    )
    
    default ResponseEntity<Void> anythingAnythingPut(
        @Parameter(name = "anything", description = "Automatically added", required = true, in = ParameterIn.PATH) @PathVariable("anything") String anything
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * TRACE /anything/{anything} : Returns anything passed in request data.
     *
     * @param anything Automatically added (required)
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingAnythingTrace",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.TRACE,
        value = "/anything/{anything}"
    )
    
    default ResponseEntity<Void> anythingAnythingTrace(
        @Parameter(name = "anything", description = "Automatically added", required = true, in = ParameterIn.PATH) @PathVariable("anything") String anything
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /anything : Returns anything passed in request data.
     *
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingDelete",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/anything"
    )
    
    default ResponseEntity<Void> anythingDelete(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /anything : Returns anything passed in request data.
     *
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingGet",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/anything"
    )
    
    default ResponseEntity<Void> anythingGet(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PATCH /anything : Returns anything passed in request data.
     *
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingPatch",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.PATCH,
        value = "/anything"
    )
    
    default ResponseEntity<Void> anythingPatch(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /anything : Returns anything passed in request data.
     *
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingPost",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/anything"
    )
    
    default ResponseEntity<Void> anythingPost(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /anything : Returns anything passed in request data.
     *
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingPut",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/anything"
    )
    
    default ResponseEntity<Void> anythingPut(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * TRACE /anything : Returns anything passed in request data.
     *
     * @return Anything passed in request (status code 200)
     */
    @Operation(
        operationId = "anythingTrace",
        summary = "Returns anything passed in request data.",
        tags = { "Anything" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Anything passed in request")
        }
    )
    @RequestMapping(
        method = RequestMethod.TRACE,
        value = "/anything"
    )
    
    default ResponseEntity<Void> anythingTrace(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
