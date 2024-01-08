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
    public class ProjectPropertiesApiController : ControllerBase
    { 
        /// <summary>
        /// Delete project property
        /// </summary>
        /// <remarks>Deletes the [property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) from a project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.</remarks>
        /// <param name="projectIdOrKey">The project ID or project key (case sensitive).</param>
        /// <param name="propertyKey">The project property key. Use [Get project property keys](#api-rest-api-3-project-projectIdOrKey-properties-get) to get a list of all project property keys.</param>
        /// <response code="204">Returned if the project property is deleted.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect.</response>
        /// <response code="403">Returned if the user does not have permission to administer the project.</response>
        /// <response code="404">Returned if the project or property is not found.</response>
        [HttpDelete]
        [Route("/rest/api/3/project/{projectIdOrKey}/properties/{propertyKey}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteProjectProperty")]
        public virtual IActionResult DeleteProjectProperty([FromRoute (Name = "projectIdOrKey")][Required]string projectIdOrKey, [FromRoute (Name = "propertyKey")][Required]string propertyKey)
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
        /// Get project property
        /// </summary>
        /// <remarks>Returns the value of a [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the property.</remarks>
        /// <param name="projectIdOrKey">The project ID or project key (case sensitive).</param>
        /// <param name="propertyKey">The project property key. Use [Get project property keys](#api-rest-api-3-project-projectIdOrKey-properties-get) to get a list of all project property keys.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect.</response>
        /// <response code="403">Returned if the user does not have permission to view the project.</response>
        /// <response code="404">Returned if the project or property is not found.</response>
        [HttpGet]
        [Route("/rest/api/3/project/{projectIdOrKey}/properties/{propertyKey}")]
        [ValidateModelState]
        [SwaggerOperation("GetProjectProperty")]
        [SwaggerResponse(statusCode: 200, type: typeof(EntityProperty), description: "Returned if the request is successful.")]
        public virtual IActionResult GetProjectProperty([FromRoute (Name = "projectIdOrKey")][Required]string projectIdOrKey, [FromRoute (Name = "propertyKey")][Required]string propertyKey)
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
        /// Get project property keys
        /// </summary>
        /// <remarks>Returns all [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys for the project.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.</remarks>
        /// <param name="projectIdOrKey">The project ID or project key (case sensitive).</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect.</response>
        /// <response code="403">Returned if the user does not have permission to view the project.</response>
        /// <response code="404">Returned if the project is not found.</response>
        [HttpGet]
        [Route("/rest/api/3/project/{projectIdOrKey}/properties")]
        [ValidateModelState]
        [SwaggerOperation("GetProjectPropertyKeys")]
        [SwaggerResponse(statusCode: 200, type: typeof(PropertyKeys), description: "Returned if the request is successful.")]
        public virtual IActionResult GetProjectPropertyKeys([FromRoute (Name = "projectIdOrKey")][Required]string projectIdOrKey)
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
        /// Set project property
        /// </summary>
        /// <remarks>Sets the value of the [project property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). You can use project properties to store custom data against the project.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project in which the property is created.</remarks>
        /// <param name="projectIdOrKey">The project ID or project key (case sensitive).</param>
        /// <param name="propertyKey">The key of the project property. The maximum length is 255 characters.</param>
        /// <param name="body"></param>
        /// <response code="200">Returned if the project property is updated.</response>
        /// <response code="201">Returned if the project property is created.</response>
        /// <response code="400">Returned if the project key or id is invalid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect.</response>
        /// <response code="403">Returned if the user does not have permission to administer the project.</response>
        /// <response code="404">Returned if the project is not found.</response>
        [HttpPut]
        [Route("/rest/api/3/project/{projectIdOrKey}/properties/{propertyKey}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("SetProjectProperty")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "Returned if the project property is updated.")]
        [SwaggerResponse(statusCode: 201, type: typeof(Object), description: "Returned if the project property is created.")]
        public virtual IActionResult SetProjectProperty([FromRoute (Name = "projectIdOrKey")][Required]string projectIdOrKey, [FromRoute (Name = "propertyKey")][Required]string propertyKey, [FromBody]Object body)
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
