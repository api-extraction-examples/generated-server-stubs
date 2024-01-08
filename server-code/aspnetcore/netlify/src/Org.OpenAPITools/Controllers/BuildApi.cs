/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * The version of the OpenAPI document: 2.16.0
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
    public class BuildApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <param name="build"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpPost]
        [Route("/api/v1/sites/{site_id}/builds")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateSiteBuild")]
        [SwaggerResponse(statusCode: 200, type: typeof(Build), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult CreateSiteBuild([FromRoute (Name = "site_id")][Required]string siteId, [FromBody]BuildSetup build)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Build));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"created_at\" : \"created_at\",\n  \"id\" : \"id\",\n  \"error\" : \"error\",\n  \"done\" : true,\n  \"sha\" : \"sha\",\n  \"deploy_id\" : \"deploy_id\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Build>(exampleJson)
            : default(Build);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="accountId"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpGet]
        [Route("/api/v1/{account_id}/builds/status")]
        [ValidateModelState]
        [SwaggerOperation("GetAccountBuildStatus")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<BuildStatus>), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult GetAccountBuildStatus([FromRoute (Name = "account_id")][Required]string accountId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<BuildStatus>));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "[ {\n  \"enqueued\" : 1,\n  \"minutes\" : {\n    \"current\" : 5,\n    \"previous\" : 2,\n    \"last_updated_at\" : \"last_updated_at\",\n    \"period_end_date\" : \"period_end_date\",\n    \"included_minutes\" : \"included_minutes\",\n    \"period_start_date\" : \"period_start_date\",\n    \"included_minutes_with_packs\" : \"included_minutes_with_packs\",\n    \"current_average_sec\" : 5\n  },\n  \"pending_concurrency\" : 7,\n  \"active\" : 0,\n  \"build_count\" : 6\n}, {\n  \"enqueued\" : 1,\n  \"minutes\" : {\n    \"current\" : 5,\n    \"previous\" : 2,\n    \"last_updated_at\" : \"last_updated_at\",\n    \"period_end_date\" : \"period_end_date\",\n    \"included_minutes\" : \"included_minutes\",\n    \"period_start_date\" : \"period_start_date\",\n    \"included_minutes_with_packs\" : \"included_minutes_with_packs\",\n    \"current_average_sec\" : 5\n  },\n  \"pending_concurrency\" : 7,\n  \"active\" : 0,\n  \"build_count\" : 6\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<BuildStatus>>(exampleJson)
            : default(List<BuildStatus>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="buildId"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpGet]
        [Route("/api/v1/builds/{build_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetSiteBuild")]
        [SwaggerResponse(statusCode: 200, type: typeof(Build), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult GetSiteBuild([FromRoute (Name = "build_id")][Required]string buildId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Build));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"created_at\" : \"created_at\",\n  \"id\" : \"id\",\n  \"error\" : \"error\",\n  \"done\" : true,\n  \"sha\" : \"sha\",\n  \"deploy_id\" : \"deploy_id\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Build>(exampleJson)
            : default(Build);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <param name="page"></param>
        /// <param name="perPage"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpGet]
        [Route("/api/v1/sites/{site_id}/builds")]
        [ValidateModelState]
        [SwaggerOperation("ListSiteBuilds")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Build>), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult ListSiteBuilds([FromRoute (Name = "site_id")][Required]string siteId, [FromQuery (Name = "page")]int? page, [FromQuery (Name = "per_page")]int? perPage)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Build>));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "[ {\n  \"created_at\" : \"created_at\",\n  \"id\" : \"id\",\n  \"error\" : \"error\",\n  \"done\" : true,\n  \"sha\" : \"sha\",\n  \"deploy_id\" : \"deploy_id\"\n}, {\n  \"created_at\" : \"created_at\",\n  \"id\" : \"id\",\n  \"error\" : \"error\",\n  \"done\" : true,\n  \"sha\" : \"sha\",\n  \"deploy_id\" : \"deploy_id\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Build>>(exampleJson)
            : default(List<Build>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="buildId"></param>
        /// <response code="204">No content</response>
        /// <response code="0">error</response>
        [HttpPost]
        [Route("/api/v1/builds/{build_id}/start")]
        [ValidateModelState]
        [SwaggerOperation("NotifyBuildStart")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult NotifyBuildStart([FromRoute (Name = "build_id")][Required]string buildId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));

            throw new NotImplementedException();
        }
    }
}
