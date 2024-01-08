/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * The version of the OpenAPI document: 1.0.0
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
    public class PersonalisedNetworksApiController : ControllerBase
    { 
        /// <summary>
        /// Unfollow network
        /// </summary>
        /// <param name="authorization">Bearer OAUTH_TOKEN</param>
        /// <param name="xAPIKey">API_KEY</param>
        /// <param name="body"></param>
        /// <param name="offset">Paginated results offset</param>
        /// <param name="limit">Paginated results limit</param>
        /// <response code="202">Request successfully sent to UAS.</response>
        /// <response code="400">The request was malformed.</response>
        /// <response code="401">There was an error with the supplied &#x60;Authorization&#x60; header.</response>
        [HttpDelete]
        [Route("/my/networks/follows")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("MyNetworksFollowsDelete")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "The request was malformed.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "There was an error with the supplied &#x60;Authorization&#x60; header.")]
        public virtual IActionResult MyNetworksFollowsDelete([FromHeader (Name = "Authorization")][Required()]string authorization, [FromHeader (Name = "X-API-Key")][Required()]string xAPIKey, [FromBody]Body3 body, [FromQuery (Name = "offset")]int? offset, [FromQuery (Name = "limit")]int? limit)
        {

            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));

            throw new NotImplementedException();
        }

        /// <summary>
        /// List of followed networks
        /// </summary>
        /// <remarks>List of followed networks for a given user. </remarks>
        /// <param name="authorization">Bearer OAUTH_TOKEN</param>
        /// <param name="xAPIKey">API_KEY</param>
        /// <param name="offset">Paginated results offset</param>
        /// <param name="limit">Paginated results limit</param>
        /// <response code="200">OK</response>
        /// <response code="0">Unexpected error</response>
        [HttpGet]
        [Route("/my/networks/follows")]
        [ValidateModelState]
        [SwaggerOperation("MyNetworksFollowsGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(PersonalisedNetworksResponse), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error")]
        public virtual IActionResult MyNetworksFollowsGet([FromHeader (Name = "Authorization")][Required()]string authorization, [FromHeader (Name = "X-API-Key")][Required()]string xAPIKey, [FromQuery (Name = "offset")]int? offset, [FromQuery (Name = "limit")]int? limit)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PersonalisedNetworksResponse));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"$schema\" : \"$schema\",\n  \"offset\" : 6,\n  \"limit\" : 0,\n  \"results\" : [ {\n    \"created\" : \"created\",\n    \"type\" : \"type\"\n  }, {\n    \"created\" : \"created\",\n    \"type\" : \"type\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PersonalisedNetworksResponse>(exampleJson)
            : default(PersonalisedNetworksResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Follow network
        /// </summary>
        /// <param name="authorization">Bearer OAUTH_TOKEN</param>
        /// <param name="xAPIKey">API_KEY</param>
        /// <param name="body"></param>
        /// <param name="offset">Paginated results offset</param>
        /// <param name="limit">Paginated results limit</param>
        /// <response code="202">Request successfully sent to UAS.</response>
        /// <response code="400">The request was malformed.</response>
        /// <response code="401">There was an error with the supplied &#x60;Authorization&#x60; header.</response>
        [HttpPost]
        [Route("/my/networks/follows")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("MyNetworksFollowsPost")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "The request was malformed.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "There was an error with the supplied &#x60;Authorization&#x60; header.")]
        public virtual IActionResult MyNetworksFollowsPost([FromHeader (Name = "Authorization")][Required()]string authorization, [FromHeader (Name = "X-API-Key")][Required()]string xAPIKey, [FromBody]Body2 body, [FromQuery (Name = "offset")]int? offset, [FromQuery (Name = "limit")]int? limit)
        {

            //TODO: Uncomment the next line to return response 202 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(202);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));

            throw new NotImplementedException();
        }
    }
}