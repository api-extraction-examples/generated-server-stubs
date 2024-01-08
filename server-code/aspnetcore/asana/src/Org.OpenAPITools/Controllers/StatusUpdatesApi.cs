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
    public class StatusUpdatesApiController : ControllerBase
    { 
        /// <summary>
        /// Create a status update
        /// </summary>
        /// <remarks>Creates a new status update on an object. Returns the full record of the newly created status update.</remarks>
        /// <param name="createStatusForObjectRequest">The status update to create.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <param name="limit">Results per page. The number of objects to return per page. The value must be between 1 and 100.</param>
        /// <param name="offset">Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;</param>
        /// <response code="201">Successfully created a new status update.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpPost]
        [Route("/api/1.0/status_updates")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateStatusForObject")]
        [SwaggerResponse(statusCode: 201, type: typeof(CreateStatusForObject201Response), description: "Successfully created a new status update.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult CreateStatusForObject([FromBody]CreateStatusForObjectRequest createStatusForObjectRequest, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]string offset)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(CreateStatusForObject201Response));
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
            exampleJson = "{ }";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CreateStatusForObject201Response>(exampleJson)
            : default(CreateStatusForObject201Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete a status update
        /// </summary>
        /// <remarks>Deletes a specific, existing status update.  Returns an empty data record.</remarks>
        /// <param name="statusGid">The status update to get.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <response code="200">Successfully deleted the specified status.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpDelete]
        [Route("/api/1.0/status_updates/{status_gid}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("DeleteStatus")]
        [SwaggerResponse(statusCode: 200, type: typeof(DeleteAttachment200Response), description: "Successfully deleted the specified status.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult DeleteStatus([FromRoute (Name = "status_gid")][Required]string statusGid, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DeleteAttachment200Response));
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
            exampleJson = "{\n  \"data\" : \"{}\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DeleteAttachment200Response>(exampleJson)
            : default(DeleteAttachment200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a status update
        /// </summary>
        /// <remarks>Returns the complete record for a single status update.</remarks>
        /// <param name="statusGid">The status update to get.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <response code="200">Successfully retrieved the specified object&#39;s status updates.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/status_updates/{status_gid}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetStatus")]
        [SwaggerResponse(statusCode: 200, type: typeof(CreateStatusForObject201Response), description: "Successfully retrieved the specified object&#39;s status updates.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult GetStatus([FromRoute (Name = "status_gid")][Required]string statusGid, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CreateStatusForObject201Response));
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
            exampleJson = "{ }";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CreateStatusForObject201Response>(exampleJson)
            : default(CreateStatusForObject201Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get status updates from an object
        /// </summary>
        /// <remarks>Returns the compact status update records for all updates on the object.</remarks>
        /// <param name="parent">Globally unique identifier for object to fetch statuses from. Must be a GID for a project, portfolio, or goal.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <param name="limit">Results per page. The number of objects to return per page. The value must be between 1 and 100.</param>
        /// <param name="offset">Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;</param>
        /// <param name="createdSince">Only return statuses that have been created since the given time.</param>
        /// <response code="200">Successfully retrieved the specified object&#39;s status updates.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/status_updates")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetStatusesForObject")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetStatusesForObject200Response), description: "Successfully retrieved the specified object&#39;s status updates.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult GetStatusesForObject([FromQuery (Name = "parent")][Required()]string parent, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]string offset, [FromQuery (Name = "created_since")]DateTime? createdSince)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetStatusesForObject200Response));
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
            ? JsonConvert.DeserializeObject<GetStatusesForObject200Response>(exampleJson)
            : default(GetStatusesForObject200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
