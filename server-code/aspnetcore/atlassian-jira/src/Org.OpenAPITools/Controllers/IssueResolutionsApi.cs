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
    public class IssueResolutionsApiController : ControllerBase
    { 
        /// <summary>
        /// Create resolution
        /// </summary>
        /// <remarks>Creates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="createResolutionDetails"></param>
        /// <response code="201">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request isn&#39;t valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user doesn&#39;t have the necessary permission.</response>
        [HttpPost]
        [Route("/rest/api/3/resolution")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateResolution")]
        [SwaggerResponse(statusCode: 201, type: typeof(ResolutionId), description: "Returned if the request is successful.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorCollection), description: "Returned if the request isn&#39;t valid.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorCollection), description: "Returned if the authentication credentials are incorrect or missing.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorCollection), description: "Returned if the user doesn&#39;t have the necessary permission.")]
        public virtual IActionResult CreateResolution([FromBody]CreateResolutionDetails createResolutionDetails)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(ResolutionId));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorCollection));
            string exampleJson = null;
            exampleJson = "{\n  \"id\" : \"id\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ResolutionId>(exampleJson)
            : default(ResolutionId);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete resolution
        /// </summary>
        /// <remarks>Deletes an issue resolution.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="id">The ID of the issue resolution.</param>
        /// <param name="replaceWith">The ID of the issue resolution that will replace the currently selected resolution.</param>
        /// <response code="303">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request isn&#39;t valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user doesn&#39;t have the necessary permission.</response>
        /// <response code="404">Returned if the issue resolution isn&#39;t found.</response>
        /// <response code="409">Returned if a task to delete the issue resolution is already running.</response>
        [HttpDelete]
        [Route("/rest/api/3/resolution/{id}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteResolution")]
        [SwaggerResponse(statusCode: 303, type: typeof(TaskProgressBeanObject), description: "Returned if the request is successful.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorCollection), description: "Returned if the request isn&#39;t valid.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorCollection), description: "Returned if the authentication credentials are incorrect or missing.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorCollection), description: "Returned if the user doesn&#39;t have the necessary permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorCollection), description: "Returned if the issue resolution isn&#39;t found.")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorCollection), description: "Returned if a task to delete the issue resolution is already running.")]
        public virtual IActionResult DeleteResolution([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "replaceWith")][Required()]string replaceWith)
        {

            //TODO: Uncomment the next line to return response 303 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(303, default(TaskProgressBeanObject));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorCollection));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get resolution
        /// </summary>
        /// <remarks>Returns an issue resolution value.  **[Permissions](#permissions) required:** Permission to access Jira.</remarks>
        /// <param name="id">The ID of the issue resolution value.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="404">Returned if the issue resolution value is not found.</response>
        [HttpGet]
        [Route("/rest/api/3/resolution/{id}")]
        [ValidateModelState]
        [SwaggerOperation("GetResolution")]
        [SwaggerResponse(statusCode: 200, type: typeof(Resolution), description: "Returned if the request is successful.")]
        public virtual IActionResult GetResolution([FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Resolution));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"self\" : \"https://openapi-generator.tech\",\n  \"id\" : \"id\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Resolution>(exampleJson)
            : default(Resolution);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get resolutions
        /// </summary>
        /// <remarks>Returns a list of all issue resolution values.  **[Permissions](#permissions) required:** Permission to access Jira.</remarks>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        [HttpGet]
        [Route("/rest/api/3/resolution")]
        [ValidateModelState]
        [SwaggerOperation("GetResolutions")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Resolution>), description: "Returned if the request is successful.")]
        [Obsolete]
        public virtual IActionResult GetResolutions()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Resolution>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "[ {\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"self\" : \"https://openapi-generator.tech\",\n  \"id\" : \"id\"\n}, {\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"self\" : \"https://openapi-generator.tech\",\n  \"id\" : \"id\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Resolution>>(exampleJson)
            : default(List<Resolution>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Move resolutions
        /// </summary>
        /// <remarks>Changes the order of issue resolutions.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="reorderIssueResolutionsRequest"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request isn&#39;t valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user doesn&#39;t have the necessary permission.</response>
        /// <response code="404">Returned if the issue resolution isn&#39;t found.</response>
        [HttpPut]
        [Route("/rest/api/3/resolution/move")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("MoveResolutions")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorCollection), description: "Returned if the request isn&#39;t valid.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorCollection), description: "Returned if the authentication credentials are incorrect or missing.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorCollection), description: "Returned if the user doesn&#39;t have the necessary permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorCollection), description: "Returned if the issue resolution isn&#39;t found.")]
        public virtual IActionResult MoveResolutions([FromBody]ReorderIssueResolutionsRequest reorderIssueResolutionsRequest)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorCollection));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Search resolutions
        /// </summary>
        /// <remarks>Returns a [paginated](#pagination) list of resolutions. The list can contain all resolutions or a subset determined by any combination of these criteria:   *  a list of resolutions IDs.  *  whether the field configuration is a default. This returns resolutions from company-managed (classic) projects only, as there is no concept of default resolutions in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira.</remarks>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <param name="id">The list of resolutions IDs to be filtered out</param>
        /// <param name="onlyDefault">When set to true, return default only, when IDs provided, if none of them is default, return empty page. Default value is false</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        [HttpGet]
        [Route("/rest/api/3/resolution/search")]
        [ValidateModelState]
        [SwaggerOperation("SearchResolutions")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanResolutionJsonBean), description: "Returned if the request is successful.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorCollection), description: "Returned if the authentication credentials are incorrect or missing.")]
        public virtual IActionResult SearchResolutions([FromQuery (Name = "startAt")]string startAt, [FromQuery (Name = "maxResults")]string maxResults, [FromQuery (Name = "id")]List<string> id, [FromQuery (Name = "onlyDefault")]bool? onlyDefault)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanResolutionJsonBean));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorCollection));
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"default\" : true,\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"self\" : \"self\",\n    \"iconUrl\" : \"iconUrl\",\n    \"id\" : \"id\"\n  }, {\n    \"default\" : true,\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"self\" : \"self\",\n    \"iconUrl\" : \"iconUrl\",\n    \"id\" : \"id\"\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanResolutionJsonBean>(exampleJson)
            : default(PageBeanResolutionJsonBean);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Set default resolution
        /// </summary>
        /// <remarks>Sets default issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="setDefaultResolutionRequest"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request isn&#39;t valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user doesn&#39;t have the necessary permission.</response>
        /// <response code="404">Returned if the issue resolution isn&#39;t found.</response>
        [HttpPut]
        [Route("/rest/api/3/resolution/default")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("SetDefaultResolution")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorCollection), description: "Returned if the request isn&#39;t valid.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorCollection), description: "Returned if the authentication credentials are incorrect or missing.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorCollection), description: "Returned if the user doesn&#39;t have the necessary permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorCollection), description: "Returned if the issue resolution isn&#39;t found.")]
        public virtual IActionResult SetDefaultResolution([FromBody]SetDefaultResolutionRequest setDefaultResolutionRequest)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorCollection));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update resolution
        /// </summary>
        /// <remarks>Updates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="id">The ID of the issue resolution.</param>
        /// <param name="updateResolutionDetails"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request isn&#39;t valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user doesn&#39;t have the necessary permission.</response>
        /// <response code="404">Returned if the issue resolution isn&#39;t found.</response>
        [HttpPut]
        [Route("/rest/api/3/resolution/{id}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateResolution")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorCollection), description: "Returned if the request isn&#39;t valid.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorCollection), description: "Returned if the authentication credentials are incorrect or missing.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorCollection), description: "Returned if the user doesn&#39;t have the necessary permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorCollection), description: "Returned if the issue resolution isn&#39;t found.")]
        public virtual IActionResult UpdateResolution([FromRoute (Name = "id")][Required]string id, [FromBody]UpdateResolutionDetails updateResolutionDetails)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorCollection));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
