/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.LatestpostsTopicSlugGet200Response;
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
public interface LatestpostsApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /latestposts/{topic_slug} : Get Latest Posts
     * Returns a list of latest posts (&#x60;article_ids&#x60;) for a topic/niche (as classified by the Medium platform). Example of a topic/niche can be: * blockchain * relationships * mental-health, etc …  These are known as &#x60;topic_slugs&#x60;. At any given moment, this endpoint will return a list of 25 articles (&#x60;article_ids&#x60;). 
     *
     * @param topicSlug It&#39;s a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "latestpostsTopicSlugGet",
        summary = "Get Latest Posts",
        description = "Returns a list of latest posts (`article_ids`) for a topic/niche (as classified by the Medium platform). Example of a topic/niche can be: * blockchain * relationships * mental-health, etc …  These are known as `topic_slugs`. At any given moment, this endpoint will return a list of 25 articles (`article_ids`). ",
        tags = { "Misc" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LatestpostsTopicSlugGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/latestposts/{topic_slug}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<LatestpostsTopicSlugGet200Response> latestpostsTopicSlugGet(
        @Parameter(name = "topic_slug", description = "It's a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium.", required = true, in = ParameterIn.PATH) @PathVariable("topic_slug") String topicSlug
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"latestposts\" : [ \"67fa62fc1971\", \"67fa62fc1971\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}