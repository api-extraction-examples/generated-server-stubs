/*
 * httpbin.org
 *
 * A simple HTTP Request & Response Service.<br/> <br/> <b>Run locally: </b> <code>$ docker run -p 80:80 kennethreitz/httpbin</code>
 *
 * The version of the OpenAPI document: 0.9.2
 * Contact: me@kennethreitz.org
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
    public class CookiesApiController : ControllerBase
    { 
        /// <summary>
        /// Deletes cookie(s) as provided by the query string and redirects to cookie list.
        /// </summary>
        /// <param name="freeform"></param>
        /// <response code="200">Redirect to cookie list</response>
        [HttpGet]
        [Route("/cookies/delete")]
        [ValidateModelState]
        [SwaggerOperation("CookiesDeleteGet")]
        public virtual IActionResult CookiesDeleteGet([FromQuery (Name = "freeform")]Dictionary<string, string> freeform)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Returns cookie data.
        /// </summary>
        /// <response code="200">Set cookies.</response>
        [HttpGet]
        [Route("/cookies")]
        [ValidateModelState]
        [SwaggerOperation("CookiesGet")]
        public virtual IActionResult CookiesGet()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Sets cookie(s) as provided by the query string and redirects to cookie list.
        /// </summary>
        /// <param name="freeform"></param>
        /// <response code="200">Redirect to cookie list</response>
        [HttpGet]
        [Route("/cookies/set")]
        [ValidateModelState]
        [SwaggerOperation("CookiesSetGet")]
        public virtual IActionResult CookiesSetGet([FromQuery (Name = "freeform")]Dictionary<string, string> freeform)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Sets a cookie and redirects to cookie list.
        /// </summary>
        /// <param name="name"></param>
        /// <param name="value"></param>
        /// <response code="200">Set cookies and redirects to cookie list.</response>
        [HttpGet]
        [Route("/cookies/set/{name}/{value}")]
        [ValidateModelState]
        [SwaggerOperation("CookiesSetNameValueGet")]
        public virtual IActionResult CookiesSetNameValueGet([FromRoute (Name = "name")][Required]string name, [FromRoute (Name = "value")][Required]string value)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);

            throw new NotImplementedException();
        }
    }
}
