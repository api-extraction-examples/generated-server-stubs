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
    public class GoalRelationshipsApiController : ControllerBase
    { 
        /// <summary>
        /// Add a supporting goal relationship
        /// </summary>
        /// <remarks>Creates a goal relationship by adding a supporting resource to a given goal.  Returns the newly created goal relationship record.</remarks>
        /// <param name="goalGid">Globally unique identifier for the goal.</param>
        /// <param name="addSupportingRelationshipRequest">The supporting resource to be added to the goal</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <response code="200">Successfully created the goal relationship.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpPost]
        [Route("/api/1.0/goals/{goal_gid}/addSupportingRelationship")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("AddSupportingRelationship")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetGoalRelationship200Response), description: "Successfully created the goal relationship.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult AddSupportingRelationship([FromRoute (Name = "goal_gid")][Required]string goalGid, [FromBody]AddSupportingRelationshipRequest addSupportingRelationshipRequest, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetGoalRelationship200Response));
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
            ? JsonConvert.DeserializeObject<GetGoalRelationship200Response>(exampleJson)
            : default(GetGoalRelationship200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a goal relationship
        /// </summary>
        /// <remarks>Returns the complete updated goal relationship record for a single goal relationship.</remarks>
        /// <param name="goalRelationshipGid">Globally unique identifier for the goal relationship.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <response code="200">Successfully retrieved the record for the goal relationship.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/goal_relationships/{goal_relationship_gid}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetGoalRelationship")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetGoalRelationship200Response), description: "Successfully retrieved the record for the goal relationship.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult GetGoalRelationship([FromRoute (Name = "goal_relationship_gid")][Required]string goalRelationshipGid, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetGoalRelationship200Response));
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
            ? JsonConvert.DeserializeObject<GetGoalRelationship200Response>(exampleJson)
            : default(GetGoalRelationship200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get goal relationships
        /// </summary>
        /// <remarks>Returns compact goal relationship records.</remarks>
        /// <param name="supportedGoal">Globally unique identifier for the supported goal in the goal relationship.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <param name="resourceSubtype">If provided, filter to goal relationships with a given resource_subtype.</param>
        /// <response code="200">Successfully retrieved the requested goal relationships.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/goal_relationships")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetGoalRelationships")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetGoalRelationships200Response), description: "Successfully retrieved the requested goal relationships.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult GetGoalRelationships([FromQuery (Name = "supported_goal")][Required()]string supportedGoal, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields, [FromQuery (Name = "resource_subtype")]string resourceSubtype)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetGoalRelationships200Response));
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
            ? JsonConvert.DeserializeObject<GetGoalRelationships200Response>(exampleJson)
            : default(GetGoalRelationships200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Removes a supporting goal relationship
        /// </summary>
        /// <remarks>Removes a goal relationship for a given parent goal.</remarks>
        /// <param name="goalGid">Globally unique identifier for the goal.</param>
        /// <param name="removeSupportingRelationshipRequest">The supporting resource to be removed from the goal</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <response code="200">Successfully removed the goal relationship.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpPost]
        [Route("/api/1.0/goals/{goal_gid}/removeSupportingRelationship")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("RemoveSupportingRelationship")]
        [SwaggerResponse(statusCode: 200, type: typeof(DeleteAttachment200Response), description: "Successfully removed the goal relationship.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult RemoveSupportingRelationship([FromRoute (Name = "goal_gid")][Required]string goalGid, [FromBody]RemoveSupportingRelationshipRequest removeSupportingRelationshipRequest, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields)
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
        /// Update a goal relationship
        /// </summary>
        /// <remarks>An existing goal relationship can be updated by making a PUT request on the URL for that goal relationship. Only the fields provided in the &#x60;data&#x60; block will be updated; any unspecified fields will remain unchanged.  Returns the complete updated goal relationship record.</remarks>
        /// <param name="goalRelationshipGid">Globally unique identifier for the goal relationship.</param>
        /// <param name="updateGoalRelationshipRequest">The updated fields for the goal relationship.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <response code="200">Successfully updated the goal relationship.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpPut]
        [Route("/api/1.0/goal_relationships/{goal_relationship_gid}")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateGoalRelationship")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetGoalRelationship200Response), description: "Successfully updated the goal relationship.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult UpdateGoalRelationship([FromRoute (Name = "goal_relationship_gid")][Required]string goalRelationshipGid, [FromBody]UpdateGoalRelationshipRequest updateGoalRelationshipRequest, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetGoalRelationship200Response));
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
            ? JsonConvert.DeserializeObject<GetGoalRelationship200Response>(exampleJson)
            : default(GetGoalRelationship200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}