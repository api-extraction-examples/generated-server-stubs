/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.UserIdForUsernameGet200Response;
import org.openapitools.model.UserUserIdArticlesGet200Response;
import org.openapitools.model.UserUserIdFollowersGet200Response;
import org.openapitools.model.UserUserIdFollowingGet200Response;
import org.openapitools.model.UserUserIdGet200Response;
import org.openapitools.model.UserUserIdInterestsGet200Response;
import org.openapitools.model.UserUserIdListsGet200Response;
import org.openapitools.model.UserUserIdPublicationsGet200Response;
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
@Tag(name = "User", description = "the User API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user/id_for/{username} : Get User ID
     * Returns the unique &#x60;user_id&#x60; for the given &#x60;username&#x60;.  **Note:** You can find the &#x60;username&#x60; from the user&#39;s/author&#39;s profile page URL.  - **username**.medium.com - medium.com/@**username** 
     *
     * @param username It&#39;s a unique string chosen by every single Medium user. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "userIdForUsernameGet",
        summary = "Get User ID",
        description = "Returns the unique `user_id` for the given `username`.  **Note:** You can find the `username` from the user's/author's profile page URL.  - **username**.medium.com - medium.com/@**username** ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserIdForUsernameGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/id_for/{username}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserIdForUsernameGet200Response> userIdForUsernameGet(
        @Parameter(name = "username", description = "It's a unique string chosen by every single Medium user.", required = true, in = ParameterIn.PATH) @PathVariable("username") String username
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"1985b61817c3\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{user_id}/articles : Get User&#39;s Articles
     * Returns the list of articles (&#x60;article_ids&#x60;) written by the user. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "userUserIdArticlesGet",
        summary = "Get User's Articles",
        description = "Returns the list of articles (`article_ids`) written by the user. ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserUserIdArticlesGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{user_id}/articles",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserUserIdArticlesGet200Response> userUserIdArticlesGet(
        @Parameter(name = "user_id", description = "Unique hash id assigned to every single Medium user.", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"associated_articles\" : [ \"562c5821b5f0\", \"562c5821b5f0\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{user_id}/followers : Get User Followers
     * Returns the list of &#x60;user_ids&#x60; of the user&#39;s followers.  **Note:** The length of this followers&#39; list might be different from what you get in  the \&quot;Get User Info\&quot; Endpoint. It&#39;s because, this list doesn&#39;t include Medium Users who  left the platform. If you really need the exact followers&#39; count, use this endpoint to get the followers&#39;  list and take its length as the exact followers&#39; count 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @param count To limit the number of results. (count &amp;lt; 1500) (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "userUserIdFollowersGet",
        summary = "Get User Followers",
        description = "Returns the list of `user_ids` of the user's followers.  **Note:** The length of this followers' list might be different from what you get in  the \"Get User Info\" Endpoint. It's because, this list doesn't include Medium Users who  left the platform. If you really need the exact followers' count, use this endpoint to get the followers'  list and take its length as the exact followers' count ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserUserIdFollowersGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{user_id}/followers",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserUserIdFollowersGet200Response> userUserIdFollowersGet(
        @Parameter(name = "user_id", description = "Unique hash id assigned to every single Medium user.", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId,
        @Parameter(name = "count", description = "To limit the number of results. (count &lt; 1500)", in = ParameterIn.QUERY) @Valid @RequestParam(value = "count", required = false) Integer count
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"followers\" : [ \"105e6602fb79\", \"105e6602fb79\" ], \"id\" : \"14d5c41e0264\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{user_id}/following : Get User Following
     * Returns the list of &#x60;user_ids&#x60; of the user&#39;s followings.  **Note:** Currently, this list does not contain the &#x60;publication_ids&#x60; of the publications that the user is following. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @param count To limit the number of results. (count &amp;lt; 1500) (optional)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "userUserIdFollowingGet",
        summary = "Get User Following",
        description = "Returns the list of `user_ids` of the user's followings.  **Note:** Currently, this list does not contain the `publication_ids` of the publications that the user is following. ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserUserIdFollowingGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{user_id}/following",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserUserIdFollowingGet200Response> userUserIdFollowingGet(
        @Parameter(name = "user_id", description = "Unique hash id assigned to every single Medium user.", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId,
        @Parameter(name = "count", description = "To limit the number of results. (count &lt; 1500)", in = ParameterIn.QUERY) @Valid @RequestParam(value = "count", required = false) Integer count
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"following\" : [ \"c61f93eeb8a5\", \"c61f93eeb8a5\" ], \"id\" : \"14d5c41e0264\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{user_id} : Get User Info
     * Returns user related information like *Full name, Bio, Followers count, Following count, Twitter username, Profile-image URL, User ID, etc...*   It takes &#x60;user_id&#x60; as the path parameter.  **Note:** If you don&#39;t know the &#x60;user_id&#x60;, then you can get it from the endpoint\\ &#39;/user/id_for/{&#x60;username&#x60;}&#39;. 
     *
     * @param userId It&#39;s a unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "userUserIdGet",
        summary = "Get User Info",
        description = "Returns user related information like *Full name, Bio, Followers count, Following count, Twitter username, Profile-image URL, User ID, etc...*   It takes `user_id` as the path parameter.  **Note:** If you don't know the `user_id`, then you can get it from the endpoint\\ '/user/id_for/{`username`}'. ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserUserIdGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{user_id}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserUserIdGet200Response> userUserIdGet(
        @Parameter(name = "user_id", description = "It's a unique hash id assigned to every single Medium user.", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"has_list\" : true, \"allow_notes\" : true, \"image_url\" : \"https://miro.medium.com/1*C92Hx7k9nRM7TPlrmhgW9w.jpeg\", \"is_book_author\" : false, \"top_writer_in\" : [ \"programming\", \"programming\" ], \"twitter_username\" : \"one_anachronism\", \"bio\" : \"Obsessed with Tech Biz Arts &amp; Words; Does NOT dumb down the writing; Skilled Wordsmith; Delivers the best\", \"is_suspended\" : false, \"medium_member_at\" : \"2020-06-24 16:05:46\", \"following_count\" : 4, \"is_writer_program_enrolled\" : true, \"followers_count\" : 450, \"fullname\" : \"Nishu Jain\", \"id\" : \"1985b61817c3\", \"username\" : \"nishu-jain\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{user_id}/interests : Get User&#39;s Interests
     * Returns a list of tags that the given user follows. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "userUserIdInterestsGet",
        summary = "Get User's Interests",
        description = "Returns a list of tags that the given user follows. ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserUserIdInterestsGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{user_id}/interests",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserUserIdInterestsGet200Response> userUserIdInterestsGet(
        @Parameter(name = "user_id", description = "Unique hash id assigned to every single Medium user.", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"tags_followed\" : [ \"software-engineering\", \"software-engineering\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{user_id}/lists : Get User&#39;s Lists
     * Returns an array of &#x60;list_ids&#x60; created by the user.  **Note:** You can check whether the use has created lists or not beforehand. Check the  &#x60;has_list&#x60; attribute in the \&quot;Article Info\&quot; endpoint. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "userUserIdListsGet",
        summary = "Get User's Lists",
        description = "Returns an array of `list_ids` created by the user.  **Note:** You can check whether the use has created lists or not beforehand. Check the  `has_list` attribute in the \"Article Info\" endpoint. ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserUserIdListsGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{user_id}/lists",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserUserIdListsGet200Response> userUserIdListsGet(
        @Parameter(name = "user_id", description = "Unique hash id assigned to every single Medium user.", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"user_id\" : \"5142451174a3\", \"lists\" : [ \"95b41261bee0\", \"95b41261bee0\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{user_id}/publications : Get User&#39;s Publications
     * Returns a list of &#x60;publication_ids&#x60; where the user is the editor and/or creator. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "userUserIdPublicationsGet",
        summary = "Get User's Publications",
        description = "Returns a list of `publication_ids` where the user is the editor and/or creator. ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserUserIdPublicationsGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{user_id}/publications",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserUserIdPublicationsGet200Response> userUserIdPublicationsGet(
        @Parameter(name = "user_id", description = "Unique hash id assigned to every single Medium user.", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"user_id\" : \"14d5c41e0264\", \"publications\" : [ \"bff2346ccdf1\", \"bff2346ccdf1\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /user/{user_id}/top_articles : Get User&#39;s Top Articles
     * Returns a list of &#x60;article_ids&#x60; of the top 10 articles on the user&#39;s profile, for a given &#x60;user_id&#x60;. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "userUserIdTopArticlesGet",
        summary = "Get User's Top Articles",
        description = "Returns a list of `article_ids` of the top 10 articles on the user's profile, for a given `user_id`. ",
        tags = { "User" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserUserIdArticlesGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/{user_id}/top_articles",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserUserIdArticlesGet200Response> userUserIdTopArticlesGet(
        @Parameter(name = "user_id", description = "Unique hash id assigned to every single Medium user.", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"associated_articles\" : [ \"562c5821b5f0\", \"562c5821b5f0\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
