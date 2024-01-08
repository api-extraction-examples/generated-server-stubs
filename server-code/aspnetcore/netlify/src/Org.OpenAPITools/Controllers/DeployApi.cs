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
    public class DeployApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="deployId"></param>
        /// <response code="201">Cancelled</response>
        /// <response code="0">error</response>
        [HttpPost]
        [Route("/api/v1/deploys/{deploy_id}/cancel")]
        [ValidateModelState]
        [SwaggerOperation("CancelSiteDeploy")]
        [SwaggerResponse(statusCode: 201, type: typeof(Deploy), description: "Cancelled")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult CancelSiteDeploy([FromRoute (Name = "deploy_id")][Required]string deployId)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(Deploy));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Deploy>(exampleJson)
            : default(Deploy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <param name="deploy"></param>
        /// <param name="deployPreviews"></param>
        /// <param name="production"></param>
        /// <param name="state"></param>
        /// <param name="branch"></param>
        /// <param name="latestPublished"></param>
        /// <param name="title"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpPost]
        [Route("/api/v1/sites/{site_id}/deploys")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateSiteDeploy")]
        [SwaggerResponse(statusCode: 200, type: typeof(Deploy), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult CreateSiteDeploy([FromRoute (Name = "site_id")][Required]string siteId, [FromBody]DeployFiles deploy, [FromQuery (Name = "deploy-previews")]bool? deployPreviews, [FromQuery (Name = "production")]bool? production, [FromQuery (Name = "state")]string state, [FromQuery (Name = "branch")]string branch, [FromQuery (Name = "latest-published")]bool? latestPublished, [FromQuery (Name = "title")]string title)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Deploy));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Deploy>(exampleJson)
            : default(Deploy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="deployId"></param>
        /// <response code="204">No content</response>
        /// <response code="0">error</response>
        [HttpDelete]
        [Route("/api/v1/deploys/{deploy_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteDeploy")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult DeleteDeploy([FromRoute (Name = "deploy_id")][Required]string deployId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="deployId"></param>
        /// <param name="siteId"></param>
        /// <response code="204">No content</response>
        /// <response code="0">error</response>
        [HttpDelete]
        [Route("/api/v1/sites/{site_id}/deploys/{deploy_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteSiteDeploy")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult DeleteSiteDeploy([FromRoute (Name = "deploy_id")][Required]string deployId, [FromRoute (Name = "site_id")][Required]string siteId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="deployId"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpGet]
        [Route("/api/v1/deploys/{deploy_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetDeploy")]
        [SwaggerResponse(statusCode: 200, type: typeof(Deploy), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult GetDeploy([FromRoute (Name = "deploy_id")][Required]string deployId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Deploy));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Deploy>(exampleJson)
            : default(Deploy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <param name="deployId"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpGet]
        [Route("/api/v1/sites/{site_id}/deploys/{deploy_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetSiteDeploy")]
        [SwaggerResponse(statusCode: 200, type: typeof(Deploy), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult GetSiteDeploy([FromRoute (Name = "site_id")][Required]string siteId, [FromRoute (Name = "deploy_id")][Required]string deployId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Deploy));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Deploy>(exampleJson)
            : default(Deploy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <param name="deployPreviews"></param>
        /// <param name="production"></param>
        /// <param name="state"></param>
        /// <param name="branch"></param>
        /// <param name="latestPublished"></param>
        /// <param name="page"></param>
        /// <param name="perPage"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpGet]
        [Route("/api/v1/sites/{site_id}/deploys")]
        [ValidateModelState]
        [SwaggerOperation("ListSiteDeploys")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Deploy>), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult ListSiteDeploys([FromRoute (Name = "site_id")][Required]string siteId, [FromQuery (Name = "deploy-previews")]bool? deployPreviews, [FromQuery (Name = "production")]bool? production, [FromQuery (Name = "state")]string state, [FromQuery (Name = "branch")]string branch, [FromQuery (Name = "latest-published")]bool? latestPublished, [FromQuery (Name = "page")]int? page, [FromQuery (Name = "per_page")]int? perPage)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Deploy>));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "[ {\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n}, {\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Deploy>>(exampleJson)
            : default(List<Deploy>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="deployId"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpPost]
        [Route("/api/v1/deploys/{deploy_id}/lock")]
        [ValidateModelState]
        [SwaggerOperation("LockDeploy")]
        [SwaggerResponse(statusCode: 200, type: typeof(Deploy), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult LockDeploy([FromRoute (Name = "deploy_id")][Required]string deployId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Deploy));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Deploy>(exampleJson)
            : default(Deploy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <param name="deployId"></param>
        /// <response code="201">Created</response>
        /// <response code="0">error</response>
        [HttpPost]
        [Route("/api/v1/sites/{site_id}/deploys/{deploy_id}/restore")]
        [ValidateModelState]
        [SwaggerOperation("RestoreSiteDeploy")]
        [SwaggerResponse(statusCode: 201, type: typeof(Deploy), description: "Created")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult RestoreSiteDeploy([FromRoute (Name = "site_id")][Required]string siteId, [FromRoute (Name = "deploy_id")][Required]string deployId)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(Deploy));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Deploy>(exampleJson)
            : default(Deploy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <response code="204">No content</response>
        /// <response code="0">error</response>
        [HttpPut]
        [Route("/api/v1/sites/{site_id}/rollback")]
        [ValidateModelState]
        [SwaggerOperation("RollbackSiteDeploy")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult RollbackSiteDeploy([FromRoute (Name = "site_id")][Required]string siteId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="deployId"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpPost]
        [Route("/api/v1/deploys/{deploy_id}/unlock")]
        [ValidateModelState]
        [SwaggerOperation("UnlockDeploy")]
        [SwaggerResponse(statusCode: 200, type: typeof(Deploy), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult UnlockDeploy([FromRoute (Name = "deploy_id")][Required]string deployId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Deploy));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Deploy>(exampleJson)
            : default(Deploy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <param name="deployId"></param>
        /// <param name="deploy"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpPut]
        [Route("/api/v1/sites/{site_id}/deploys/{deploy_id}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateSiteDeploy")]
        [SwaggerResponse(statusCode: 200, type: typeof(Deploy), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult UpdateSiteDeploy([FromRoute (Name = "site_id")][Required]string siteId, [FromRoute (Name = "deploy_id")][Required]string deployId, [FromBody]DeployFiles deploy)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Deploy));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"review_id\" : 0.8008281904610115,\n  \"deploy_url\" : \"deploy_url\",\n  \"review_url\" : \"review_url\",\n  \"created_at\" : \"created_at\",\n  \"title\" : \"title\",\n  \"branch\" : \"branch\",\n  \"required\" : [ \"required\", \"required\" ],\n  \"skipped\" : true,\n  \"commit_url\" : \"commit_url\",\n  \"updated_at\" : \"updated_at\",\n  \"draft\" : true,\n  \"context\" : \"context\",\n  \"id\" : \"id\",\n  \"state\" : \"state\",\n  \"locked\" : true,\n  \"published_at\" : \"published_at\",\n  \"error_message\" : \"error_message\",\n  \"function_schedules\" : [ {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  }, {\n    \"cron\" : \"cron\",\n    \"name\" : \"name\"\n  } ],\n  \"admin_url\" : \"admin_url\",\n  \"site_capabilities\" : {\n    \"large_media_enabled\" : true\n  },\n  \"url\" : \"url\",\n  \"framework\" : \"framework\",\n  \"ssl_url\" : \"ssl_url\",\n  \"build_id\" : \"build_id\",\n  \"deploy_ssl_url\" : \"deploy_ssl_url\",\n  \"user_id\" : \"user_id\",\n  \"name\" : \"name\",\n  \"site_id\" : \"site_id\",\n  \"required_functions\" : [ \"required_functions\", \"required_functions\" ],\n  \"screenshot_url\" : \"screenshot_url\",\n  \"commit_ref\" : \"commit_ref\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Deploy>(exampleJson)
            : default(Deploy);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
