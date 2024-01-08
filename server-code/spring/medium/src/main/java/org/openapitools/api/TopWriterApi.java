/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.TopWriterTopicSlugGet200Response;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Misc", description = "the Misc API")
public interface TopWriterApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /top_writer/{topic_slug} : Get Top Writers
     * Returns a list of top writers (&#x60;user_ids&#x60;) within a particular topic/niche (&#x60;topic_slug&#x60;).  e.g.  - blockchain - relationships - artificial-intelligence, etc ...  **Note:** You can use optional &#x60;count&#x60; query parameter to limit the number of results.  The maximum number of top writers within a topic/niche will be 250. 
     *
     * @param topicSlug It&#39;s a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium. (required)
     * @param count Limits the number of &#x60;article_ids&#x60; in the result. (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "topWriterTopicSlugGet",
        summary = "Get Top Writers",
        description = "Returns a list of top writers (`user_ids`) within a particular topic/niche (`topic_slug`).  e.g.  - blockchain - relationships - artificial-intelligence, etc ...  **Note:** You can use optional `count` query parameter to limit the number of results.  The maximum number of top writers within a topic/niche will be 250. ",
        tags = { "Misc" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = TopWriterTopicSlugGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/top_writer/{topic_slug}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<TopWriterTopicSlugGet200Response> topWriterTopicSlugGet(
        @Parameter(name = "topic_slug", description = "It's a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium.", required = true, in = ParameterIn.PATH) @PathVariable("topic_slug") String topicSlug,
        @Parameter(name = "count", description = "Limits the number of `article_ids` in the result.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "count", required = false) Integer count
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"top_writers\" : [ \"1985b61817c3\", \"1985b61817c3\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
