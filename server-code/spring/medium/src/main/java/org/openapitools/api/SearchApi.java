/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.SearchArticlesQueryQueryGet200Response;
import org.openapitools.model.SearchListsQueryQueryGet200Response;
import org.openapitools.model.SearchPublicationsQueryQueryGet200Response;
import org.openapitools.model.SearchTagsQueryQueryGet200Response;
import org.openapitools.model.SearchUsersQueryQueryGet200Response;
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
@Tag(name = "Search", description = "the Search API")
public interface SearchApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /search/articles?query={query} : Search Articles
     * Returns the list of &#x60;articles_ids&#x60; for the given search query results. (Max Length &#x3D; 1000) 
     *
     * @param query Search query (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "searchArticlesqueryqueryGet",
        summary = "Search Articles",
        description = "Returns the list of `articles_ids` for the given search query results. (Max Length = 1000) ",
        tags = { "Search" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SearchArticlesQueryQueryGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/search/articles?query={query}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<SearchArticlesQueryQueryGet200Response> searchArticlesqueryqueryGet(
        @NotNull @Parameter(name = "query", description = "Search query", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "query", required = true) String query
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"search_query\" : \"startup\", \"articles\" : [ \"6556feb21311\", \"6556feb21311\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /search/lists?query={query} : Search Lists
     * Returns an array of &#x60;list_ids&#x60; for the given search query results. (Max Length &#x3D; 1000) 
     *
     * @param query Search query (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "searchListsqueryqueryGet",
        summary = "Search Lists",
        description = "Returns an array of `list_ids` for the given search query results. (Max Length = 1000) ",
        tags = { "Search" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SearchListsQueryQueryGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/search/lists?query={query}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<SearchListsQueryQueryGet200Response> searchListsqueryqueryGet(
        @NotNull @Parameter(name = "query", description = "Search query", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "query", required = true) String query
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lists\" : [ \"a8266c175cda\", \"a8266c175cda\" ], \"search_query\" : \"artificial intelligence\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /search/publications?query={query} : Search Publications
     * Returns the list of &#x60;publication_ids&#x60; for the given search query results. (Max Length &#x3D; 1000) 
     *
     * @param query Search query (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "searchPublicationsqueryqueryGet",
        summary = "Search Publications",
        description = "Returns the list of `publication_ids` for the given search query results. (Max Length = 1000) ",
        tags = { "Search" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SearchPublicationsQueryQueryGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/search/publications?query={query}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<SearchPublicationsQueryQueryGet200Response> searchPublicationsqueryqueryGet(
        @NotNull @Parameter(name = "query", description = "Search query", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "query", required = true) String query
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"search_query\" : \"mental health\", \"publications\" : [ \"8d6b8a439e32\", \"8d6b8a439e32\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /search/tags?query={query} : Search Tags
     * Returns a list of &#x60;tags&#x60; for the given search query results. (Max Length &#x3D; 1000) 
     *
     * @param query Search query (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "searchTagsqueryqueryGet",
        summary = "Search Tags",
        description = "Returns a list of `tags` for the given search query results. (Max Length = 1000) ",
        tags = { "Search" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SearchTagsQueryQueryGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/search/tags?query={query}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<SearchTagsQueryQueryGet200Response> searchTagsqueryqueryGet(
        @NotNull @Parameter(name = "query", description = "Search query", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "query", required = true) String query
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"search_query\" : \"blockchain\", \"tags\" : [ \"blockchain-technology\", \"blockchain-technology\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /search/users?query={query} : Search Users
     * Returns a list of &#x60;user_ids&#x60; for the given search query results. (Max Length &#x3D; 1000) 
     *
     * @param query Search query (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "searchUsersqueryqueryGet",
        summary = "Search Users",
        description = "Returns a list of `user_ids` for the given search query results. (Max Length = 1000) ",
        tags = { "Search" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = SearchUsersQueryQueryGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/search/users?query={query}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<SearchUsersQueryQueryGet200Response> searchUsersqueryqueryGet(
        @NotNull @Parameter(name = "query", description = "Search query", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "query", required = true) String query
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"search_query\" : \"data engineer\", \"users\" : [ \"1985b61817c3\", \"1985b61817c3\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
