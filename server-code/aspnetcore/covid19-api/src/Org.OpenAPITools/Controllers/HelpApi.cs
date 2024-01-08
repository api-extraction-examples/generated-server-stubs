/*
 * COVID-19 data API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.2.6
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
    public class HelpApiController : ControllerBase
    { 
        /// <summary>
        /// getListOfCountries
        /// </summary>
        /// <remarks>Get name name, alpha-2, alpha-3 code, latitude and longitude for every country.</remarks>
        /// <param name="format">Format of the response</param>
        /// <response code="200">Get name name, alpha-2, alpha-3 code, latitude and longitude for every country</response>
        [HttpGet]
        [Route("/help/countries")]
        [ValidateModelState]
        [SwaggerOperation("GetListOfCountries")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<GetListOfCountries200ResponseInner>), description: "Get name name, alpha-2, alpha-3 code, latitude and longitude for every country")]
        public virtual IActionResult GetListOfCountries([FromQuery (Name = "format")]string format)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<GetListOfCountries200ResponseInner>));
            string exampleJson = null;
            exampleJson = "[ {\n  \"alpha-3-code\" : \"alpha-3-code\",\n  \"latitude\" : 0.8008282,\n  \"alpha-2-code\" : \"alpha-2-code\",\n  \"name\" : \"name\",\n  \"longitude\" : 6.0274563\n}, {\n  \"alpha-3-code\" : \"alpha-3-code\",\n  \"latitude\" : 0.8008282,\n  \"alpha-2-code\" : \"alpha-2-code\",\n  \"name\" : \"name\",\n  \"longitude\" : 6.0274563\n} ]";
            exampleJson = "<null>\n  <alpha-2-code>aeiou</alpha-2-code>\n  <alpha-3-code>aeiou</alpha-3-code>\n  <latitude>1.3579</latitude>\n  <longitude>1.3579</longitude>\n  <name>aeiou</name>\n</null>";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<GetListOfCountries200ResponseInner>>(exampleJson)
            : default(List<GetListOfCountries200ResponseInner>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
