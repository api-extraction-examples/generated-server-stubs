/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
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
    public class IssueCommentPropertiesApiController : ControllerBase
    { 
        /// <summary>
        /// Delete comment property
        /// </summary>
        /// <remarks>Deletes a comment property.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to delete a property from a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.</remarks>
        /// <param name="commentId">The ID of the comment.</param>
        /// <param name="propertyKey">The key of the property.</param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is invalid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the comment or the property is not found or the user has the necessary project permissions but isn&#39;t a member of the role or group visibility of the comment is restricted to.</response>
        [HttpDelete]
        [Route("/rest/api/3/comment/{commentId}/properties/{propertyKey}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteCommentProperty")]
        public virtual IActionResult DeleteCommentProperty([FromRoute (Name = "commentId")][Required]string commentId, [FromRoute (Name = "propertyKey")][Required]string propertyKey)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get comment property
        /// </summary>
        /// <remarks>Returns the value of a comment property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.</remarks>
        /// <param name="commentId">The ID of the comment.</param>
        /// <param name="propertyKey">The key of the property.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is invalid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the comment or the property is not found.</response>
        [HttpGet]
        [Route("/rest/api/3/comment/{commentId}/properties/{propertyKey}")]
        [ValidateModelState]
        [SwaggerOperation("GetCommentProperty")]
        [SwaggerResponse(statusCode: 200, type: typeof(EntityProperty), description: "Returned if the request is successful.")]
        public virtual IActionResult GetCommentProperty([FromRoute (Name = "commentId")][Required]string commentId, [FromRoute (Name = "propertyKey")][Required]string propertyKey)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(EntityProperty));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"value\" : \"\",\n  \"key\" : \"key\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<EntityProperty>(exampleJson)
            : default(EntityProperty);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get comment property keys
        /// </summary>
        /// <remarks>Returns the keys of all the properties of a comment.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.</remarks>
        /// <param name="commentId">The ID of the comment.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the comment ID is invalid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the comment is not found.</response>
        [HttpGet]
        [Route("/rest/api/3/comment/{commentId}/properties")]
        [ValidateModelState]
        [SwaggerOperation("GetCommentPropertyKeys")]
        [SwaggerResponse(statusCode: 200, type: typeof(PropertyKeys), description: "Returned if the request is successful.")]
        public virtual IActionResult GetCommentPropertyKeys([FromRoute (Name = "commentId")][Required]string commentId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PropertyKeys));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"keys\" : [ {\n    \"self\" : \"self\",\n    \"key\" : \"key\"\n  }, {\n    \"self\" : \"self\",\n    \"key\" : \"key\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PropertyKeys>(exampleJson)
            : default(PropertyKeys);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Set comment property
        /// </summary>
        /// <remarks>Creates or updates the value of a property for a comment. Use this resource to store custom data against a comment.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** either of:   *  *Edit All Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on any comment.  *  *Edit Own Comments* [project permission](https://confluence.atlassian.com/x/yodKLg) to create or update the value of a property on a comment created by the user.  Also, when the visibility of a comment is restricted to a role or group the user must be a member of that role or group.</remarks>
        /// <param name="commentId">The ID of the comment.</param>
        /// <param name="propertyKey">The key of the property. The maximum length is 255 characters.</param>
        /// <param name="body"></param>
        /// <response code="200">Returned if the comment property is updated.</response>
        /// <response code="201">Returned if the comment property is created.</response>
        /// <response code="400">Returned if the request is invalid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the comment is not found.</response>
        [HttpPut]
        [Route("/rest/api/3/comment/{commentId}/properties/{propertyKey}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("SetCommentProperty")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "Returned if the comment property is updated.")]
        [SwaggerResponse(statusCode: 201, type: typeof(Object), description: "Returned if the comment property is created.")]
        public virtual IActionResult SetCommentProperty([FromRoute (Name = "commentId")][Required]string commentId, [FromRoute (Name = "propertyKey")][Required]string propertyKey, [FromBody]Object body)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Object));
            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
