/*
 * Discovery Market Research
 *
 * <p>This API drives the <a href=\"https://discovery.gsa.gov\">Discovery Market Research Tool</a>. It contains information on the vendors that are part of the OASIS and OASIS Small Business contracting vehicles, such as their contracting history, their elligibility for contract awards, and their small business designations. To learn more about the tool, please visit <a href=\"https://discovery.gsa.gov\">Discovery</a> or see the README on our <a href=\"https://github.com/PSHCDevOps/discovery\">GitHub repository</a>.</p> <p><strong>Please note that the base path for this API is <code>https://api.data.gov/gsa/discovery/</code></strong></p> <p>It requires an API key, obtainable at <a href=\"http://api.data.gov/\">api.data.gov</a>. It must be passed in the <code>api_key</code> parameter with each request.</p>
 *
 * The version of the OpenAPI document: 0.1
 * Contact: discovery-18f@gsa.gov
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
    public class VendorsApiController : ControllerBase
    { 
        /// <summary>
        /// This endpoint returns a list of vendors filtered by a NAICS code
        /// </summary>
        /// <remarks>&lt;p&gt;This endpoint returns a list of vendors filtered by a NAICS code. The NAICS code maps to an OASIS pool and is used to retrieve vendors in that pool only.&lt;/p&gt; &lt;p&gt;OASIS pools are groupings of NAICS codes that have the same small business size standard. Because contracts solicited to OASIS vendors can only be issued to one pool, much of the data is presented as part of a pool grouping. Using the NAICS code is a shortcut, so that you don&#39;t have to explicitly map the NAICS code to a pool in OASIS yourself.&lt;/p&gt; &lt;p&gt;Vendors can also be filtered by a particular setaside. Valid values for the setasides are two-character codes which include:&lt;/p&gt; &lt;ul&gt; &lt;li&gt;A6 (8(a))&lt;/li&gt; &lt;li&gt;XX (Hubzone)&lt;/li&gt; &lt;li&gt;QF (service disabled veteran owned)&lt;/li&gt; &lt;li&gt;A2 (women owned)&lt;/li&gt; &lt;li&gt;A5 (veteran owned)&lt;/li&gt; &lt;li&gt;27 (small disadvantaged business).&lt;/li&gt; &lt;/ul&gt;</remarks>
        /// <param name="naics">a six digit NAICS code (required)</param>
        /// <param name="setasides">a comma delimited list of two character setaside codes to filter by.  Ex. setasides&#x3D;A6,A5  will filter by 8a and veteran owned business.</param>
        /// <param name="vehicle">Choices are either oasis or oasissb. Will filter vendors by their presence in either the OASIS unrestricted vehicle or the OASIS Small Business vehicle.</param>
        /// <response code="200">No response was specified</response>
        [HttpGet]
        [Route("/api/vendors/")]
        [ValidateModelState]
        [SwaggerOperation("ListVendorsGET")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "No response was specified")]
        public virtual IActionResult ListVendorsGET([FromQuery (Name = "naics")][Required()]string naics, [FromQuery (Name = "setasides")]List<string> setasides, [FromQuery (Name = "vehicle")]string vehicle)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Object));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
