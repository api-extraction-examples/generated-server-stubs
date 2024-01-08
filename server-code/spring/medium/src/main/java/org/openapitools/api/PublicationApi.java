/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.PublicationIdForPublicationSlugGet200Response;
import org.openapitools.model.PublicationPublicationIdArticlesGet200Response;
import org.openapitools.model.PublicationPublicationIdGet200Response;
import org.openapitools.model.PublicationPublicationIdNewsletterGet200Response;
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
@Tag(name = "Publication", description = "the Publication API")
public interface PublicationApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /publication/id_for/{publication_slug} : Get Publication ID
     * Returns the unique &#x60;publication_id&#x60; for the given &#x60;publication_slug&#x60;.  **Note:** You can find the &#x60;publication_slug&#x60; from the publication&#39;s homepage URL. - medium.com/_**publication_slug** 
     *
     * @param publicationSlug It&#39;s a lowercased hyphen-separated unique string alloted to each Medium Publication. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "publicationIdForPublicationSlugGet",
        summary = "Get Publication ID",
        description = "Returns the unique `publication_id` for the given `publication_slug`.  **Note:** You can find the `publication_slug` from the publication's homepage URL. - medium.com/_**publication_slug** ",
        tags = { "Publication" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PublicationIdForPublicationSlugGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/publication/id_for/{publication_slug}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PublicationIdForPublicationSlugGet200Response> publicationIdForPublicationSlugGet(
        @Parameter(name = "publication_slug", description = "It's a lowercased hyphen-separated unique string alloted to each Medium Publication.", required = true, in = ParameterIn.PATH) @PathVariable("publication_slug") String publicationSlug
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"publication_id\" : \"29038077e4c6\", \"publication_slug\" : \"codex\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /publication/{publication_id}/articles : Get Publication Articles
     * Returns the list of &#x60;articles_ids&#x60;, of the latest 25 articles, posted in that publication. 
     *
     * @param publicationId It&#39;s a unique hash id assigned to every Medium Publication. (required)
     * @param from To get the articles before specified date and time. (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "publicationPublicationIdArticlesGet",
        summary = "Get Publication Articles",
        description = "Returns the list of `articles_ids`, of the latest 25 articles, posted in that publication. ",
        tags = { "Publication" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PublicationPublicationIdArticlesGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/publication/{publication_id}/articles",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PublicationPublicationIdArticlesGet200Response> publicationPublicationIdArticlesGet(
        @Parameter(name = "publication_id", description = "It's a unique hash id assigned to every Medium Publication.", required = true, in = ParameterIn.PATH) @PathVariable("publication_id") String publicationId,
        @Parameter(name = "from", description = "To get the articles before specified date and time.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "from", required = false) String from
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"publication_articles\" : [ \"67fa62fc1971\", \"67fa62fc1971\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /publication/{publication_id} : Get Publication Info
     * Returns the publication related information such as *Publication name, Tagline, Description, Tags, Followers Count, Twitter username, Instagram username, Facebook Page name, etc …*  **Note:** If you don&#39;t know the &#x60;publication_id&#x60;, you can get it from any article published by it. Use endpoint \&quot;/article/{article_id}\&quot; to retrieve the &#x60;publication_id&#x60;. 
     *
     * @param publicationId It&#39;s a unique hash id assigned to every Medium Publication. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "publicationPublicationIdGet",
        summary = "Get Publication Info",
        description = "Returns the publication related information such as *Publication name, Tagline, Description, Tags, Followers Count, Twitter username, Instagram username, Facebook Page name, etc …*  **Note:** If you don't know the `publication_id`, you can get it from any article published by it. Use endpoint \"/article/{article_id}\" to retrieve the `publication_id`. ",
        tags = { "Publication" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PublicationPublicationIdGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/publication/{publication_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PublicationPublicationIdGet200Response> publicationPublicationIdGet(
        @Parameter(name = "publication_id", description = "It's a unique hash id assigned to every Medium Publication.", required = true, in = ParameterIn.PATH) @PathVariable("publication_id") String publicationId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"creator\" : \"8a819983d566\", \"twitter_username\" : \"towards_AI\", \"description\" : \"Towards AI is the world's leading AI and technology publication. Publishing unbiased AI and technology-related articles. Read by thought-leaders and decision-makers around the world.\", \"url\" : \"pub.towardsai.net\", \"tags\" : [ \"ARTIFICIAL INTELLIGENCE\", \"ARTIFICIAL INTELLIGENCE\" ], \"followers\" : 25260, \"facebook_pagename\" : \"towardsAl\", \"name\" : \"Towards AI\", \"tagline\" : \"The World's Leading AI and Technology Publication\", \"id\" : \"98111c9905da\", \"instagram_username\" : \"towards_ai\", \"editors\" : [ \"aea8a19ea239\", \"aea8a19ea239\" ], \"slug\" : \"towards-artificial-intelligence\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /publication/{publication_id}/newsletter : Get Publication Newsletter
     * Returns the newsletter related information such as *id, name, description, slug, creator_id, subscribers, image_url, etc …*  **Note:** If you don&#39;t know the &#x60;publication_id&#x60;, you can get it from any article published by it. Use endpoint \&quot;/article/{article_id}\&quot; to retrieve the &#x60;publication_id&#x60;. 
     *
     * @param publicationId It&#39;s a unique hash id assigned to every Medium Publication. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "publicationPublicationIdNewsletterGet",
        summary = "Get Publication Newsletter",
        description = "Returns the newsletter related information such as *id, name, description, slug, creator_id, subscribers, image_url, etc …*  **Note:** If you don't know the `publication_id`, you can get it from any article published by it. Use endpoint \"/article/{article_id}\" to retrieve the `publication_id`. ",
        tags = { "Publication" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PublicationPublicationIdNewsletterGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/publication/{publication_id}/newsletter",
        produces = { "application/json" }
    )
    
    default ResponseEntity<PublicationPublicationIdNewsletterGet200Response> publicationPublicationIdNewsletterGet(
        @Parameter(name = "publication_id", description = "It's a unique hash id assigned to every Medium Publication.", required = true, in = ParameterIn.PATH) @PathVariable("publication_id") String publicationId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"image\" : \"https://miro.medium.com/1*j2OVd7j2o2FHeE7T8TzpXw.png\", \"subscribers\" : 6752, \"creator_id\" : \"aea8a19ea239\", \"name\" : \"This AI newsletter is all you need\", \"description\" : \"We have moved our newsletter. Subscribe → https://ws.towardsai.net/subscribe\", \"id\" : \"d710a73cd042\", \"slug\" : \"this-ai-newsletter-is-all-you-need\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}