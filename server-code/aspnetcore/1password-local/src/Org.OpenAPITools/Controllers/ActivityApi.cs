/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * The version of the OpenAPI document: 1.5.7
 * Contact: support@1password.com
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
    public class ActivityApiController : ControllerBase
    { 
        /// <summary>
        /// Retrieve a list of API Requests that have been made.
        /// </summary>
        /// <param name="limit">How many API Events should be retrieved in a single request.</param>
        /// <param name="offset">How far into the collection of API Events should the response start</param>
        /// <response code="200">OK</response>
        /// <response code="401">Invalid or missing token</response>
        [HttpGet]
        [Route("/activity")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetApiActivity")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<APIRequest>), description: "OK")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        public virtual IActionResult GetApiActivity([FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]int? offset)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<APIRequest>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "[ {\n  \"actor\" : {\n    \"requestIp\" : \"requestIp\",\n    \"userAgent\" : \"userAgent\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"account\" : \"account\",\n    \"jti\" : \"jti\"\n  },\n  \"result\" : \"SUCCESS\",\n  \"resource\" : {\n    \"item\" : {\n      \"id\" : \"id\"\n    },\n    \"itemVersion\" : 0,\n    \"type\" : \"ITEM\",\n    \"vault\" : {\n      \"id\" : \"id\"\n    }\n  },\n  \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"action\" : \"READ\",\n  \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"actor\" : {\n    \"requestIp\" : \"requestIp\",\n    \"userAgent\" : \"userAgent\",\n    \"id\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"account\" : \"account\",\n    \"jti\" : \"jti\"\n  },\n  \"result\" : \"SUCCESS\",\n  \"resource\" : {\n    \"item\" : {\n      \"id\" : \"id\"\n    },\n    \"itemVersion\" : 0,\n    \"type\" : \"ITEM\",\n    \"vault\" : {\n      \"id\" : \"id\"\n    }\n  },\n  \"requestId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n  \"action\" : \"READ\",\n  \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<APIRequest>>(exampleJson)
            : default(List<APIRequest>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
