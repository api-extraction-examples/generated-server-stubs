/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CreateBatchRequest200Response;
import org.openapitools.model.CreateBatchRequestRequest;
import org.openapitools.model.ErrorResponse;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
@Validated
@Tag(name = "Batch API", description = "There are many cases where you want to accomplish a variety of work in the Asana API but want to minimize the number of HTTP requests you make. For example:  * Modern browsers limit the number of requests that a single web page can   make at once. * Mobile apps will use more battery life to keep the cellular radio on   when making a series of requests. * There is an overhead cost to developing software that can make multiple   requests in parallel. * Some cloud platforms handle parallelism poorly, or disallow it   entirely.   To make development easier in these use cases, Asana provides a **batch API** that enables developers to perform multiple “actions” by making only a single HTTP request.  #### Making a batch request  To make a batch request, send a `POST` request to `/batch`. Like other `POST` endpoints, the body should contain a `data` envelope. Inside this envelope should be a single `actions` field, containing a list of “action” objects.  Each action represents a standard request to an existing endpoint in the Asana API.  **The maximum number of actions allowed in a single batch request is 10**. Making a batch request with no actions in it will result in a `400 Bad Request`.  When the batch API receives the list of actions to execute, it will dispatch those actions to the already-implemented endpoints specified by the `relative_path` and `method` for each action. This happens in parallel, so all actions in the request will be processed simultaneously. There is no guarantee of the execution order for these actions, nor is there a way to use the output of one action as the input of another action (such as creating a task and then commenting on it).  The response to the batch request will contain (within the `data` envelope) a list of result objects, one for each action. The results are guaranteed to be in the same order as the actions in the request (e.g., the first result in the response corresponds to the first action in the request)  The batch API will always attempt to return a `200 Success` response with individual result objects for each individual action in the request. Only in certain cases (such as missing authorization or malformed JSON in the body) will the entire request fail with another status code. Even if every individual action in the request fails, the batch API will still return a `200 Success` response, and each result object in the response will contain the errors encountered with each action.  #### Rate limiting  The batch API fully respects all of our rate limiting. This means that a batch request counts against *both* the standard rate limiter and the concurrent request limiter as though you had made a separate HTTP request for every individual action. For example, a batch request with five actions counts as five separate requests in the standard rate limiter, and counts as five concurrent requests in the concurrent request limiter. The batch request itself incurs no cost.  If any of the actions in a batch request would exceed any of the enforced limits, the *entire* request will fail with a `429 Too Many Requests` error. This is to prevent the unpredictability of which actions might succeed if not all of them could succeed.  #### Restrictions  Not every endpoint can be accessed through the batch API. Specifically, the following actions cannot be taken and will result in a `400 Bad Request` for that action:  * Uploading attachments * Creating, getting, or deleting organization exports * Any SCIM operations * Nested calls to the batch API")
public interface BatchApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /batch : Submit parallel requests
     * Make multiple requests in parallel to Asana&#39;s API.
     *
     * @param createBatchRequestRequest The requests to batch together via the Batch API. (required)
     * @param optPretty Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
     * @param optFields Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
     * @return Successfully completed the requested batch API operations. (status code 200)
     *         or This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again. (status code 400)
     *         or A valid authentication token was not provided with the request, so the API could not associate a user with the request. (status code 401)
     *         or The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to. (status code 403)
     *         or Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist. (status code 404)
     *         or There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase. (status code 500)
     */
    @Operation(
        operationId = "createBatchRequest",
        summary = "Submit parallel requests",
        description = "Make multiple requests in parallel to Asana's API.",
        tags = { "Batch API" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successfully completed the requested batch API operations.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = CreateBatchRequest200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "401", description = "A valid authentication token was not provided with the request, so the API could not associate a user with the request.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "404", description = "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))
            })
        },
        security = {
            @SecurityRequirement(name = "personalAccessToken"),
            @SecurityRequirement(name = "oauth2")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/batch",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<CreateBatchRequest200Response> createBatchRequest(
        @Parameter(name = "CreateBatchRequestRequest", description = "The requests to batch together via the Batch API.", required = true) @Valid @RequestBody CreateBatchRequestRequest createBatchRequestRequest,
        @Parameter(name = "opt_pretty", description = "Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_pretty", required = false) Boolean optPretty,
        @Parameter(name = "opt_fields", description = "Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "opt_fields", required = false) List<String> optFields
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"headers\" : { \"location\" : \"/tasks/1234\" }, \"status_code\" : 200, \"body\" : { \"data\" : { \"completed\" : false, \"gid\" : \"1967\", \"name\" : \"Hello, world!\", \"notes\" : \"How are you today?\" } } }, { \"headers\" : { \"location\" : \"/tasks/1234\" }, \"status_code\" : 200, \"body\" : { \"data\" : { \"completed\" : false, \"gid\" : \"1967\", \"name\" : \"Hello, world!\", \"notes\" : \"How are you today?\" } } } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
