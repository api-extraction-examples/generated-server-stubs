/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * The version of the OpenAPI document: 4.4.12
 * Contact: admin@collegefootballdata.com
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
    public class VenuesApiController : ControllerBase
    { 
        /// <summary>
        /// Arena and venue information
        /// </summary>
        /// <remarks>Venues</remarks>
        /// <response code="200">successful operation</response>
        /// <response code="400">error</response>
        [HttpGet]
        [Route("/venues")]
        [Authorize(Policy = "ApiKeyAuth")]
        [ValidateModelState]
        [SwaggerOperation("GetVenues")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Venue>), description: "successful operation")]
        public virtual IActionResult GetVenues()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Venue>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            string exampleJson = null;
            exampleJson = "[ {\n  \"elevation\" : 6.027456183070403,\n  \"zip\" : \"zip\",\n  \"city\" : \"city\",\n  \"timezone\" : \"timezone\",\n  \"dome\" : true,\n  \"capacity\" : 0,\n  \"year_constructed\" : 2,\n  \"country_code\" : \"country_code\",\n  \"grass\" : true,\n  \"name\" : \"name\",\n  \"location\" : {\n    \"x\" : 5.962133916683182,\n    \"y\" : 5.637376656633329\n  },\n  \"id\" : 1,\n  \"state\" : \"state\"\n}, {\n  \"elevation\" : 6.027456183070403,\n  \"zip\" : \"zip\",\n  \"city\" : \"city\",\n  \"timezone\" : \"timezone\",\n  \"dome\" : true,\n  \"capacity\" : 0,\n  \"year_constructed\" : 2,\n  \"country_code\" : \"country_code\",\n  \"grass\" : true,\n  \"name\" : \"name\",\n  \"location\" : {\n    \"x\" : 5.962133916683182,\n    \"y\" : 5.637376656633329\n  },\n  \"id\" : 1,\n  \"state\" : \"state\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Venue>>(exampleJson)
            : default(List<Venue>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
