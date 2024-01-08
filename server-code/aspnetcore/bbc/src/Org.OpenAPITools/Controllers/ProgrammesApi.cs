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
    public class ProgrammesApiController : ControllerBase
    { 
        /// <summary>
        /// Popular Episodes &amp; Clips
        /// </summary>
        /// <remarks>Retrieve Popular Episodes &amp; Clips </remarks>
        /// <param name="xAPIKey">API_KEY</param>
        /// <param name="type">Programme type required. Accepts comma separated values</param>
        /// <param name="distinct">Filter by deduplication rule. E.g. &#39;tleo&#39; returns programmes with distinct top level episode objects</param>
        /// <param name="network">Filter by network master brand ID (mid). Accepts comma separated values</param>
        /// <param name="networkUrlKey">Filter by network URL key. Accepts comma separated values</param>
        /// <param name="category">Filter by category. Accepts comma separated values</param>
        /// <param name="format">Filter by format. Accepts comma separated values</param>
        /// <param name="group">Filter by group. Accepts comma separated values</param>
        /// <param name="mediaType">Filter by programme media type. Accepts comma separated values</param>
        /// <param name="container">Filter by container. Accepts any pid e.g. brand,series,episode</param>
        /// <param name="mediaSet">Filter by media set name. Accepts comma separated combinations of the following: pc,mobile-download,android-download-high,apple-ios-download-high,mobile-cellular-main,mobile-phone-main,iptv-all</param>
        /// <param name="q">Search query String</param>
        /// <response code="200">OK</response>
        /// <response code="0">Unexpected error</response>
        [HttpGet]
        [Route("/radio/popular")]
        [ValidateModelState]
        [SwaggerOperation("GetPopularEpisodesClips")]
        [SwaggerResponse(statusCode: 200, type: typeof(PopularResponse), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(PopularErrorResponse), description: "Unexpected error")]
        public virtual IActionResult GetPopularEpisodesClips([FromHeader (Name = "X-API-Key")][Required()]string xAPIKey, [FromQuery (Name = "type")]string type, [FromQuery (Name = "distinct")]string distinct, [FromQuery (Name = "network")]string network, [FromQuery (Name = "network_url_key")]string networkUrlKey, [FromQuery (Name = "category")]string category, [FromQuery (Name = "format")]string format, [FromQuery (Name = "group")]string group, [FromQuery (Name = "media_type")]string mediaType, [FromQuery (Name = "container")]string container, [FromQuery (Name = "media_set")]List<Object> mediaSet, [FromQuery (Name = "q")]string q)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PopularResponse));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(PopularErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 5,\n  \"$schema\" : \"$schema\",\n  \"offset\" : 6,\n  \"limit\" : 0,\n  \"results\" : [ {\n    \"score\" : 1,\n    \"data\" : {\n      \"pid\" : \"pid\",\n      \"type\" : \"brand_summary\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"type\"\n  }, {\n    \"score\" : 1,\n    \"data\" : {\n      \"pid\" : \"pid\",\n      \"type\" : \"brand_summary\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"type\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PopularResponse>(exampleJson)
            : default(PopularResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Radio programmes
        /// </summary>
        /// <remarks>Provides a paginated list of programmes by PID (brand, series, episode and clip). Accepts various filters and sorting methods.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining results as an array of Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification </remarks>
        /// <param name="xAPIKey">API_KEY</param>
        /// <param name="kind">Filter by provided query. E.g. &#39;tleo&#39; returns top level objects, ie. brands, orphaned series, and orphaned episodes</param>
        /// <param name="network">Filter by network master brand ID (mid). Accepts comma separated values</param>
        /// <param name="networkUrlKey">Filter by network URL key. Accepts comma separated values</param>
        /// <param name="category">Filter by category id. Accepts comma separated values. See /category endpoint below for the type of response provided</param>
        /// <param name="sort">Sort by provided query. E.g. &#39;title&#39; sorts in ascending order, and -title sorts in descending order</param>
        /// <param name="container">Filter by container. Accepts any brand or series pid</param>
        /// <param name="type">Filter by programme type. Accepts comma separated values</param>
        /// <response code="200">OK</response>
        /// <response code="0">Unexpected error</response>
        [HttpGet]
        [Route("/radio/programmes")]
        [ValidateModelState]
        [SwaggerOperation("GetRadioProgrammes")]
        [SwaggerResponse(statusCode: 200, type: typeof(ProgrammesResponse), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(RadioErrorResponse), description: "Unexpected error")]
        public virtual IActionResult GetRadioProgrammes([FromHeader (Name = "X-API-Key")][Required()]string xAPIKey, [FromQuery (Name = "kind")]string kind, [FromQuery (Name = "network")]string network, [FromQuery (Name = "network_url_key")]string networkUrlKey, [FromQuery (Name = "category")]string category, [FromQuery (Name = "sort")]string sort, [FromQuery (Name = "container")]string container, [FromQuery (Name = "type")]string type)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ProgrammesResponse));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(RadioErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"$schema\" : \"$schema\",\n  \"offset\" : 6,\n  \"limit\" : 0,\n  \"results\" : [ {\n    \"pid\" : \"pid\",\n    \"type\" : \"brand_summary\"\n  }, {\n    \"pid\" : \"pid\",\n    \"type\" : \"brand_summary\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ProgrammesResponse>(exampleJson)
            : default(ProgrammesResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Available radio programme by Pid
        /// </summary>
        /// <remarks>Find programmes by PID (brand, series, episode and clip)  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining results as an array of Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification </remarks>
        /// <param name="xAPIKey">API_KEY</param>
        /// <param name="pid">pid</param>
        /// <response code="200">OK</response>
        /// <response code="0">Unexpected error</response>
        [HttpGet]
        [Route("/radio/programmes/{pid}")]
        [ValidateModelState]
        [SwaggerOperation("GetRadioProgrammesByPid")]
        [SwaggerResponse(statusCode: 200, type: typeof(ProgrammesResponse), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(RadioErrorResponse), description: "Unexpected error")]
        public virtual IActionResult GetRadioProgrammesByPid([FromHeader (Name = "X-API-Key")][Required()]string xAPIKey, [FromRoute (Name = "pid")][Required]string pid)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ProgrammesResponse));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(RadioErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"$schema\" : \"$schema\",\n  \"offset\" : 6,\n  \"limit\" : 0,\n  \"results\" : [ {\n    \"pid\" : \"pid\",\n    \"type\" : \"brand_summary\"\n  }, {\n    \"pid\" : \"pid\",\n    \"type\" : \"brand_summary\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ProgrammesResponse>(exampleJson)
            : default(ProgrammesResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Recommended Programmes
        /// </summary>
        /// <remarks>Recommended Programmes from the Audience Platforms&#39; Recomendations Service </remarks>
        /// <param name="authorization">Bearer OAUTH_TOKEN</param>
        /// <param name="xAPIKey">API_KEY</param>
        /// <param name="rights">Only return available results for the web/mobile.</param>
        /// <param name="offset">Paginated results offset</param>
        /// <param name="limit">Paginated results limit</param>
        /// <response code="200">OK</response>
        /// <response code="401">There was an error with the supplied &#x60;Authorization&#x60; header.</response>
        /// <response code="0">Unexpected error</response>
        [HttpGet]
        [Route("/my/programmes/recommendations")]
        [ValidateModelState]
        [SwaggerOperation("GetRecommendations")]
        [SwaggerResponse(statusCode: 200, type: typeof(ProgrammesResponse), description: "OK")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "There was an error with the supplied &#x60;Authorization&#x60; header.")]
        [SwaggerResponse(statusCode: 0, type: typeof(ErrorResponse), description: "Unexpected error")]
        public virtual IActionResult GetRecommendations([FromHeader (Name = "Authorization")][Required()]string authorization, [FromHeader (Name = "X-API-Key")][Required()]string xAPIKey, [FromQuery (Name = "rights")][Required()]string rights, [FromQuery (Name = "offset")]int? offset, [FromQuery (Name = "limit")]int? limit)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ProgrammesResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"$schema\" : \"$schema\",\n  \"offset\" : 6,\n  \"limit\" : 0,\n  \"results\" : [ {\n    \"pid\" : \"pid\",\n    \"type\" : \"brand_summary\"\n  }, {\n    \"pid\" : \"pid\",\n    \"type\" : \"brand_summary\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ProgrammesResponse>(exampleJson)
            : default(ProgrammesResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
