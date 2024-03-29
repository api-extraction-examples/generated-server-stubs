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
    public class TotalsApiController : ControllerBase
    { 
        /// <summary>
        /// getDailyReportTotals
        /// </summary>
        /// <remarks>Get daily report data for whole world.</remarks>
        /// <param name="date">Date of the report. If you don&#39;t put this field all dates will be returned.</param>
        /// <param name="dateFormat">Date format. If you dont want to use ISO 8601 standard (YYYY-MM-DD), you can provide different format.</param>
        /// <param name="format">Format of the response. If you don&#39;t put this field JSON will be response format.</param>
        /// <response code="200">Data about COVID-19 for whole world</response>
        [HttpGet]
        [Route("/report/totals")]
        [ValidateModelState]
        [SwaggerOperation("GetDailyReportTotals")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<GetDailyReportTotals200ResponseInner>), description: "Data about COVID-19 for whole world")]
        public virtual IActionResult GetDailyReportTotals([FromQuery (Name = "date")]string date, [FromQuery (Name = "date-format")]string dateFormat, [FromQuery (Name = "format")]string format)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<GetDailyReportTotals200ResponseInner>));
            string exampleJson = null;
            exampleJson = "[ {\n  \"date\" : \"date\",\n  \"recovered\" : 5,\n  \"critical\" : 1,\n  \"active\" : 0,\n  \"confirmed\" : 6,\n  \"deaths\" : 5\n}, {\n  \"date\" : \"date\",\n  \"recovered\" : 5,\n  \"critical\" : 1,\n  \"active\" : 0,\n  \"confirmed\" : 6,\n  \"deaths\" : 5\n} ]";
            exampleJson = "<null>\n  <active>123</active>\n  <confirmed>123</confirmed>\n  <critical>123</critical>\n  <date>aeiou</date>\n  <deaths>123</deaths>\n  <recovered>123</recovered>\n</null>";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<GetDailyReportTotals200ResponseInner>>(exampleJson)
            : default(List<GetDailyReportTotals200ResponseInner>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// getLatestTotals
        /// </summary>
        /// <remarks>Get latest data for whole world.</remarks>
        /// <param name="format">Format of the response</param>
        /// <response code="200">Latest data about COVID-19 for whole world</response>
        [HttpGet]
        [Route("/totals")]
        [ValidateModelState]
        [SwaggerOperation("GetLatestTotals")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<GetLatestTotals200ResponseInner>), description: "Latest data about COVID-19 for whole world")]
        public virtual IActionResult GetLatestTotals([FromQuery (Name = "format")]string format)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<GetLatestTotals200ResponseInner>));
            string exampleJson = null;
            exampleJson = "[ {\n  \"recovered\" : 5,\n  \"critical\" : 6,\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"lastChange\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"confirmed\" : 0,\n  \"deaths\" : 1\n}, {\n  \"recovered\" : 5,\n  \"critical\" : 6,\n  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"lastChange\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"confirmed\" : 0,\n  \"deaths\" : 1\n} ]";
            exampleJson = "<null>\n  <confirmed>123</confirmed>\n  <critical>123</critical>\n  <deaths>123</deaths>\n  <lastChange>2000-01-23T04:56:07.000Z</lastChange>\n  <lastUpdate>2000-01-23T04:56:07.000Z</lastUpdate>\n  <recovered>123</recovered>\n</null>";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<GetLatestTotals200ResponseInner>>(exampleJson)
            : default(List<GetLatestTotals200ResponseInner>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
