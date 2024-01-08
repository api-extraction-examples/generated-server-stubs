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
    public class ProjectKeyAndNameValidationApiController : ControllerBase
    { 
        /// <summary>
        /// Get valid project key
        /// </summary>
        /// <remarks>Validates a project key and, if the key is invalid or in use, generates a valid random string for the project key.  **[Permissions](#permissions) required:** None.</remarks>
        /// <param name="key">The project key.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect.</response>
        [HttpGet]
        [Route("/rest/api/3/projectvalidate/validProjectKey")]
        [ValidateModelState]
        [SwaggerOperation("GetValidProjectKey")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "Returned if the request is successful.")]
        public virtual IActionResult GetValidProjectKey([FromQuery (Name = "key")]string key)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get valid project name
        /// </summary>
        /// <remarks>Checks that a project name isn&#39;t in use. If the name isn&#39;t in use, the passed string is returned. If the name is in use, this operation attempts to generate a valid project name based on the one supplied, usually by adding a sequence number. If a valid project name cannot be generated, a 404 response is returned.  **[Permissions](#permissions) required:** None.</remarks>
        /// <param name="name">The project name.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is invalid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect.</response>
        /// <response code="404">Returned if a valid project name cannot be generated.</response>
        [HttpGet]
        [Route("/rest/api/3/projectvalidate/validProjectName")]
        [ValidateModelState]
        [SwaggerOperation("GetValidProjectName")]
        [SwaggerResponse(statusCode: 200, type: typeof(string), description: "Returned if the request is successful.")]
        public virtual IActionResult GetValidProjectName([FromQuery (Name = "name")][Required()]string name)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(string));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<string>(exampleJson)
            : default(string);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Validate project key
        /// </summary>
        /// <remarks>Validates a project key by confirming the key is a valid string and not in use.  **[Permissions](#permissions) required:** None.</remarks>
        /// <param name="key">The project key.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect.</response>
        [HttpGet]
        [Route("/rest/api/3/projectvalidate/key")]
        [ValidateModelState]
        [SwaggerOperation("ValidateProjectKey")]
        [SwaggerResponse(statusCode: 200, type: typeof(ErrorCollection), description: "Returned if the request is successful.")]
        public virtual IActionResult ValidateProjectKey([FromQuery (Name = "key")]string key)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "{\n  \"errorMessages\" : [ \"errorMessages\", \"errorMessages\" ],\n  \"errors\" : {\n    \"key\" : \"errors\"\n  },\n  \"status\" : 0\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ErrorCollection>(exampleJson)
            : default(ErrorCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}