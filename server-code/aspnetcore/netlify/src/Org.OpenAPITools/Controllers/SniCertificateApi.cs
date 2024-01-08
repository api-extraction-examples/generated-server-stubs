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
    public class SniCertificateApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <param name="certificate"></param>
        /// <param name="key"></param>
        /// <param name="caCertificates"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpPost]
        [Route("/api/v1/sites/{site_id}/ssl")]
        [ValidateModelState]
        [SwaggerOperation("ProvisionSiteTLSCertificate")]
        [SwaggerResponse(statusCode: 200, type: typeof(SniCertificate), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult ProvisionSiteTLSCertificate([FromRoute (Name = "site_id")][Required]string siteId, [FromQuery (Name = "certificate")]string certificate, [FromQuery (Name = "key")]string key, [FromQuery (Name = "ca_certificates")]string caCertificates)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SniCertificate));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"expires_at\" : \"expires_at\",\n  \"updated_at\" : \"updated_at\",\n  \"created_at\" : \"created_at\",\n  \"domains\" : [ \"domains\", \"domains\" ],\n  \"state\" : \"state\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SniCertificate>(exampleJson)
            : default(SniCertificate);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="siteId"></param>
        /// <response code="200">OK</response>
        /// <response code="0">error</response>
        [HttpGet]
        [Route("/api/v1/sites/{site_id}/ssl")]
        [ValidateModelState]
        [SwaggerOperation("ShowSiteTLSCertificate")]
        [SwaggerResponse(statusCode: 200, type: typeof(SniCertificate), description: "OK")]
        [SwaggerResponse(statusCode: 0, type: typeof(Error), description: "error")]
        public virtual IActionResult ShowSiteTLSCertificate([FromRoute (Name = "site_id")][Required]string siteId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SniCertificate));
            //TODO: Uncomment the next line to return response 0 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(0, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"expires_at\" : \"expires_at\",\n  \"updated_at\" : \"updated_at\",\n  \"created_at\" : \"created_at\",\n  \"domains\" : [ \"domains\", \"domains\" ],\n  \"state\" : \"state\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SniCertificate>(exampleJson)
            : default(SniCertificate);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
