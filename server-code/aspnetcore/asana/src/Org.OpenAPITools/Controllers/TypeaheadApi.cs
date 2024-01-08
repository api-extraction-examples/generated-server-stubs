/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class TypeaheadApiController : ControllerBase
    { 
        /// <summary>
        /// Get objects via typeahead
        /// </summary>
        /// <remarks>Retrieves objects in the workspace based via an auto-completion/typeahead search algorithm. This feature is meant to provide results quickly, so do not rely on this API to provide extremely accurate search results. The result set is limited to a single page of results with a maximum size, so you won’t be able to fetch large numbers of results.  The typeahead search API provides search for objects from a single workspace. This endpoint should be used to query for objects when creating an auto-completion/typeahead search feature. This API is meant to provide results quickly and should not be relied upon for accurate or exhaustive search results. The results sets are limited in size and cannot be paginated.  Queries return a compact representation of each object which is typically the gid and name fields. Interested in a specific set of fields or all of the fields?! Of course you are. Use field selectors to manipulate what data is included in a response.  Resources with type &#x60;user&#x60; are returned in order of most contacted to least contacted. This is determined by task assignments, adding the user to projects, and adding the user as a follower to tasks, messages, etc.  Resources with type &#x60;project&#x60; are returned in order of recency. This is determined when the user visits the project, is added to the project, and completes tasks in the project.  Resources with type &#x60;task&#x60; are returned with priority placed on tasks the user is following, but no guarantee on the order of those tasks.  Resources with type &#x60;project_template&#x60; are returned with priority placed on favorited project templates.  Leaving the &#x60;query&#x60; string empty or omitted will give you results, still following the resource ordering above. This could be used to list users or projects that are relevant for the requesting user&#39;s api token.</remarks>
        /// <param name="workspaceGid">Globally unique identifier for the workspace or organization.</param>
        /// <param name="resourceType">The type of values the typeahead should return. You can choose from one of the following: &#x60;custom_field&#x60;, &#x60;project&#x60;, &#x60;project_template&#x60;, &#x60;portfolio&#x60;, &#x60;tag&#x60;, &#x60;task&#x60;, and &#x60;user&#x60;. Note that unlike in the names of endpoints, the types listed here are in singular form (e.g. &#x60;task&#x60;). Using multiple types is not yet supported.</param>
        /// <param name="type">*Deprecated: new integrations should prefer the resource_type field.*</param>
        /// <param name="query">The string that will be used to search for relevant objects. If an empty string is passed in, the API will return results.</param>
        /// <param name="count">The number of results to return. The default is 20 if this parameter is omitted, with a minimum of 1 and a maximum of 100. If there are fewer results found than requested, all will be returned.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <response code="200">Successfully retrieved objects via a typeahead search algorithm.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/workspaces/{workspace_gid}/typeahead")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("TypeaheadForWorkspace")]
        [SwaggerResponse(statusCode: 200, type: typeof(TypeaheadForWorkspace200Response), description: "Successfully retrieved objects via a typeahead search algorithm.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult TypeaheadForWorkspace([FromRoute (Name = "workspace_gid")][Required]string workspaceGid, [FromQuery (Name = "resource_type")][Required()]string resourceType, [FromQuery (Name = "type")]string type, [FromQuery (Name = "query")]string query, [FromQuery (Name = "count")]int? count, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TypeaheadForWorkspace200Response));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TypeaheadForWorkspace200Response>(exampleJson)
            : default(TypeaheadForWorkspace200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}