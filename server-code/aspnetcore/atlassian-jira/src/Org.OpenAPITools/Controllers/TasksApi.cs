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
    public class TasksApiController : ControllerBase
    { 
        /// <summary>
        /// Cancel task
        /// </summary>
        /// <remarks>Cancels a task.  **[Permissions](#permissions) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task.</remarks>
        /// <param name="taskId">The ID of the task.</param>
        /// <response code="202">Returned if the request is successful.</response>
        /// <response code="400">Returned if cancellation of the task is not possible.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the task is not found.</response>
        [HttpPost]
        [Route("/rest/api/3/task/{taskId}/cancel")]
        [ValidateModelState]
        [SwaggerOperation("CancelTask")]
        [SwaggerResponse(statusCode: 202, type: typeof(Object), description: "Returned if the request is successful.")]
        [SwaggerResponse(statusCode: 400, type: typeof(List<string>), description: "Returned if cancellation of the task is not possible.")]
        [SwaggerResponse(statusCode: 401, type: typeof(List<string>), description: "Returned if the authentication credentials are incorrect or missing.")]
        [SwaggerResponse(statusCode: 403, type: typeof(List<string>), description: "Returned if the user does not have the necessary permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(List<string>), description: "Returned if the task is not found.")]
        public virtual IActionResult CancelTask([FromRoute (Name = "taskId")][Required]string taskId)
        {

            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(List<string>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(List<string>));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(List<string>));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(List<string>));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get task
        /// </summary>
        /// <remarks>Returns the status of a [long-running asynchronous task](#async).  When a task has finished, this operation returns the JSON blob applicable to the task. See the documentation of the operation that created the task for details. Task details are not permanently retained. As of September 2019, details are retained for 14 days although this period may change without notice.  **[Permissions](#permissions) required:** either of:   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  Creator of the task.</remarks>
        /// <param name="taskId">The ID of the task.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the task is not found.</response>
        [HttpGet]
        [Route("/rest/api/3/task/{taskId}")]
        [ValidateModelState]
        [SwaggerOperation("GetTask")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskProgressBeanObject), description: "Returned if the request is successful.")]
        public virtual IActionResult GetTask([FromRoute (Name = "taskId")][Required]string taskId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskProgressBeanObject));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"submittedBy\" : 7,\n  \"description\" : \"description\",\n  \"finished\" : 6,\n  \"started\" : 5,\n  \"message\" : \"message\",\n  \"result\" : \"\",\n  \"submitted\" : 2,\n  \"lastUpdate\" : 1,\n  \"progress\" : 5,\n  \"self\" : \"https://openapi-generator.tech\",\n  \"id\" : \"id\",\n  \"elapsedRuntime\" : 0,\n  \"status\" : \"ENQUEUED\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskProgressBeanObject>(exampleJson)
            : default(TaskProgressBeanObject);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
