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
    public class AuthApiController : ControllerBase
    { 
        /// <summary>
        /// Prompts the user for authorization using HTTP Basic Auth.
        /// </summary>
        /// <param name="user"></param>
        /// <param name="passwd"></param>
        /// <response code="200">Sucessful authentication.</response>
        /// <response code="401">Unsuccessful authentication.</response>
        [HttpGet]
        [Route("/basic-auth/{user}/{passwd}")]
        [ValidateModelState]
        [SwaggerOperation("BasicAuthUserPasswdGet")]
        public virtual IActionResult BasicAuthUserPasswdGet([FromRoute (Name = "user")][Required]string user, [FromRoute (Name = "passwd")][Required]string passwd)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Prompts the user for authorization using bearer authentication.
        /// </summary>
        /// <param name="authorization"></param>
        /// <response code="200">Sucessful authentication.</response>
        /// <response code="401">Unsuccessful authentication.</response>
        [HttpGet]
        [Route("/bearer")]
        [ValidateModelState]
        [SwaggerOperation("BearerGet")]
        public virtual IActionResult BearerGet([FromHeader (Name = "Authorization")]string authorization)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Prompts the user for authorization using Digest Auth + Algorithm.
        /// </summary>
        /// <param name="qop">auth or auth-int</param>
        /// <param name="user"></param>
        /// <param name="passwd"></param>
        /// <param name="algorithm">MD5, SHA-256, SHA-512</param>
        /// <response code="200">Sucessful authentication.</response>
        /// <response code="401">Unsuccessful authentication.</response>
        [HttpGet]
        [Route("/digest-auth/{qop}/{user}/{passwd}/{algorithm}")]
        [ValidateModelState]
        [SwaggerOperation("DigestAuthQopUserPasswdAlgorithmGet")]
        public virtual IActionResult DigestAuthQopUserPasswdAlgorithmGet([FromRoute (Name = "qop")][Required]string qop, [FromRoute (Name = "user")][Required]string user, [FromRoute (Name = "passwd")][Required]string passwd, [FromRoute (Name = "algorithm")][Required]string algorithm)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Prompts the user for authorization using Digest Auth + Algorithm.
        /// </summary>
        /// <remarks>allow settings the stale_after argument. </remarks>
        /// <param name="qop">auth or auth-int</param>
        /// <param name="user"></param>
        /// <param name="passwd"></param>
        /// <param name="algorithm">MD5, SHA-256, SHA-512</param>
        /// <param name="staleAfter"></param>
        /// <response code="200">Sucessful authentication.</response>
        /// <response code="401">Unsuccessful authentication.</response>
        [HttpGet]
        [Route("/digest-auth/{qop}/{user}/{passwd}/{algorithm}/{stale_after}")]
        [ValidateModelState]
        [SwaggerOperation("DigestAuthQopUserPasswdAlgorithmStaleAfterGet")]
        public virtual IActionResult DigestAuthQopUserPasswdAlgorithmStaleAfterGet([FromRoute (Name = "qop")][Required]string qop, [FromRoute (Name = "user")][Required]string user, [FromRoute (Name = "passwd")][Required]string passwd, [FromRoute (Name = "algorithm")][Required]string algorithm, [FromRoute (Name = "stale_after")][Required]string staleAfter)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Prompts the user for authorization using Digest Auth.
        /// </summary>
        /// <param name="qop">auth or auth-int</param>
        /// <param name="user"></param>
        /// <param name="passwd"></param>
        /// <response code="200">Sucessful authentication.</response>
        /// <response code="401">Unsuccessful authentication.</response>
        [HttpGet]
        [Route("/digest-auth/{qop}/{user}/{passwd}")]
        [ValidateModelState]
        [SwaggerOperation("DigestAuthQopUserPasswdGet")]
        public virtual IActionResult DigestAuthQopUserPasswdGet([FromRoute (Name = "qop")][Required]string qop, [FromRoute (Name = "user")][Required]string user, [FromRoute (Name = "passwd")][Required]string passwd)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Prompts the user for authorization using HTTP Basic Auth.
        /// </summary>
        /// <param name="user"></param>
        /// <param name="passwd"></param>
        /// <response code="200">Sucessful authentication.</response>
        /// <response code="404">Unsuccessful authentication.</response>
        [HttpGet]
        [Route("/hidden-basic-auth/{user}/{passwd}")]
        [ValidateModelState]
        [SwaggerOperation("HiddenBasicAuthUserPasswdGet")]
        public virtual IActionResult HiddenBasicAuthUserPasswdGet([FromRoute (Name = "user")][Required]string user, [FromRoute (Name = "passwd")][Required]string passwd)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            throw new NotImplementedException();
        }
    }
}
