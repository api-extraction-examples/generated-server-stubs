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
    public class IssueTypePropertiesApiController : ControllerBase
    { 
        /// <summary>
        /// Delete issue type property
        /// </summary>
        /// <remarks>Deletes the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeId">The ID of the issue type.</param>
        /// <param name="propertyKey">The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.</param>
        /// <response code="204">Returned if the issue type property is deleted.</response>
        /// <response code="400">Returned if the issue type ID is invalid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the issue type or property is not found.</response>
        [HttpDelete]
        [Route("/rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteIssueTypeProperty")]
        public virtual IActionResult DeleteIssueTypeProperty([FromRoute (Name = "issueTypeId")][Required]string issueTypeId, [FromRoute (Name = "propertyKey")][Required]string propertyKey)
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
        /// Get issue type property
        /// </summary>
        /// <remarks>Returns the key and value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the details of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the details of any issue types associated with the projects the user has permission to browse.</remarks>
        /// <param name="issueTypeId">The ID of the issue type.</param>
        /// <param name="propertyKey">The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the issue type ID is invalid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="404">Returned if the issue type or property is not found or the user does not have the required permissions.</response>
        [HttpGet]
        [Route("/rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey}")]
        [ValidateModelState]
        [SwaggerOperation("GetIssueTypeProperty")]
        [SwaggerResponse(statusCode: 200, type: typeof(EntityProperty), description: "Returned if the request is successful.")]
        public virtual IActionResult GetIssueTypeProperty([FromRoute (Name = "issueTypeId")][Required]string issueTypeId, [FromRoute (Name = "propertyKey")][Required]string propertyKey)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(EntityProperty));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
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
        /// Get issue type property keys
        /// </summary>
        /// <remarks>Returns all the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys of the issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the property keys of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the property keys of any issue types associated with the projects the user has permission to browse.</remarks>
        /// <param name="issueTypeId">The ID of the issue type.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the issue type ID is invalid.</response>
        /// <response code="404">Returned if:   *  the issue type is not found.  *  the user does not have the required permissions.</response>
        [HttpGet]
        [Route("/rest/api/3/issuetype/{issueTypeId}/properties")]
        [ValidateModelState]
        [SwaggerOperation("GetIssueTypePropertyKeys")]
        [SwaggerResponse(statusCode: 200, type: typeof(PropertyKeys), description: "Returned if the request is successful.")]
        public virtual IActionResult GetIssueTypePropertyKeys([FromRoute (Name = "issueTypeId")][Required]string issueTypeId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PropertyKeys));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
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
        /// Set issue type property
        /// </summary>
        /// <remarks>Creates or updates the value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). Use this resource to store and update data against an issue type.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeId">The ID of the issue type.</param>
        /// <param name="propertyKey">The key of the issue type property. The maximum length is 255 characters.</param>
        /// <param name="body"></param>
        /// <response code="200">Returned if the issue type property is updated.</response>
        /// <response code="201">Returned if the issue type property is created.</response>
        /// <response code="400">Returned if:   *  the issue type ID is invalid.  *  a property value is not provided.  *  the property value JSON content is invalid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have permission to modify the issue type.</response>
        /// <response code="404">Returned if:   *  the issue type is not found.  *  the user does not have the permission view the issue type.</response>
        [HttpPut]
        [Route("/rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("SetIssueTypeProperty")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "Returned if the issue type property is updated.")]
        [SwaggerResponse(statusCode: 201, type: typeof(Object), description: "Returned if the issue type property is created.")]
        public virtual IActionResult SetIssueTypeProperty([FromRoute (Name = "issueTypeId")][Required]string issueTypeId, [FromRoute (Name = "propertyKey")][Required]string propertyKey, [FromBody]Object body)
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
