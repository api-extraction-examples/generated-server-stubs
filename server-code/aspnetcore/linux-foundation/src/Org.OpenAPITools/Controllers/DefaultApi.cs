/*
 * Reimbursements API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
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
    public class DefaultApiController : ControllerBase
    { 
        /// <summary>
        /// Expense Action
        /// </summary>
        /// <remarks>approves or rejects expense report</remarks>
        /// <param name="action"></param>
        /// <param name="reportId"></param>
        /// <response code="200">OK</response>
        /// <response code="400">Invalid Request</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="500">Server Error</response>
        [HttpPost]
        [Route("/v1/expense/{action}/{reportId}")]
        [Authorize(Policy = "ApiKeyAuth")]
        [ValidateModelState]
        [SwaggerOperation("ExpenseAction")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Invalid Request")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Unauthorized")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "Server Error")]
        public virtual IActionResult ExpenseAction([FromRoute (Name = "action")][Required]string action, [FromRoute (Name = "reportId")][Required]string reportId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get API Health Status
        /// </summary>
        /// <response code="200">OK</response>
        /// <response code="503">Service Unavailable</response>
        [HttpGet]
        [Route("/v1/health")]
        [ValidateModelState]
        [SwaggerOperation("HealthCheck")]
        [SwaggerResponse(statusCode: 200, type: typeof(Health), description: "OK")]
        [SwaggerResponse(statusCode: 503, type: typeof(Health), description: "Service Unavailable")]
        public virtual IActionResult HealthCheck()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Health));
            //TODO: Uncomment the next line to return response 503 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(503, default(Health));
            string exampleJson = null;
            exampleJson = "{\n  \"Status\" : \"healthy\",\n  \"Healths\" : [ {\n    \"Error\" : \"Error\",\n    \"Duration\" : \"Duration\",\n    \"Healthy\" : true,\n    \"TimeStamp\" : \"2019-06-07 15:37:43.131120884 +0000 UTC m=+0.257965506\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Error\" : \"Error\",\n    \"Duration\" : \"Duration\",\n    \"Healthy\" : true,\n    \"TimeStamp\" : \"2019-06-07 15:37:43.131120884 +0000 UTC m=+0.257965506\",\n    \"Name\" : \"Name\"\n  } ],\n  \"BuildTimeStamp\" : \"2019-06-06_02:59:49PM\",\n  \"Githash\" : \"62009963c9e1cedaf7a24649208983163f8c439e\",\n  \"TimeStamp\" : \"2019-06-07 15:37:43.131125775 +0000 UTC m=+0.257970409\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Health>(exampleJson)
            : default(Health);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Reset Policy
        /// </summary>
        /// <remarks>Reset an existing policy to match with templatePolicy</remarks>
        /// <param name="body"></param>
        /// <response code="200">OK</response>
        /// <response code="400">Invalid Request</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="500">Server Error</response>
        [HttpPost]
        [Route("/v1/reset")]
        [Authorize(Policy = "ApiKeyAuth")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("ResetPolicy")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Invalid Request")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Unauthorized")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "Server Error")]
        public virtual IActionResult ResetPolicy([FromBody]PolicyResetInput body)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Tag Policy
        /// </summary>
        /// <remarks>Tag adds a tag to the policy</remarks>
        /// <param name="body"></param>
        /// <response code="200">OK</response>
        /// <response code="400">Invalid Request</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="500">Server Error</response>
        [HttpPost]
        [Route("/v1/tag")]
        [Authorize(Policy = "ApiKeyAuth")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("TagPolicy")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Invalid Request")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Unauthorized")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "Server Error")]
        public virtual IActionResult TagPolicy([FromBody]PolicyTagInput body)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));

            throw new NotImplementedException();
        }
    }
}
