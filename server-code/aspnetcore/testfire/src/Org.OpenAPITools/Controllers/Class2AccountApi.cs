/*
 * AltoroJ REST API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.2
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
    public class Class2AccountApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Returns a list of all the accounts owned by the user</remarks>
        /// <param name="authorization">Authorization token (provided upon successful login)</param>
        /// <response code="200">Successful operation</response>
        /// <response code="401">Unauthorized request</response>
        /// <response code="500">Internal server error</response>
        [HttpGet]
        [Route("/api/account")]
        [ValidateModelState]
        [SwaggerOperation("GetAccount")]
        public virtual IActionResult GetAccount([FromHeader (Name = "Authorization")][Required()]string authorization)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Returns details about a specific account</remarks>
        /// <param name="authorization">Authorization token (provided upon successful login)</param>
        /// <param name="accountNo">Account id</param>
        /// <response code="200">Successful operation</response>
        /// <response code="401">Unauthorized request</response>
        /// <response code="500">Internal server error</response>
        [HttpGet]
        [Route("/api/account/{accountNo}")]
        [ValidateModelState]
        [SwaggerOperation("GetAccountBalance")]
        public virtual IActionResult GetAccountBalance([FromHeader (Name = "Authorization")][Required()]string authorization, [FromRoute (Name = "accountNo")][Required]string accountNo)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Return transactions between 2 specific dates</remarks>
        /// <param name="authorization">Authorization token (provided upon successful login)</param>
        /// <param name="accountNo">Account id</param>
        /// <param name="body">A start date and an end date</param>
        /// <response code="200">Successful operation</response>
        /// <response code="400">Bad parameters: Please check provided values</response>
        /// <response code="401">Unauthorized request</response>
        /// <response code="501">Internal server error</response>
        [HttpPost]
        [Route("/api/account/{accountNo}/transactions")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("GetTransactions")]
        public virtual IActionResult GetTransactions([FromHeader (Name = "Authorization")][Required()]string authorization, [FromRoute (Name = "accountNo")][Required]string accountNo, [FromBody]Dates body)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 501 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(501);

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>Returns the last 10 transactions attached to an account</remarks>
        /// <param name="authorization">Authorization token (provided upon successful login)</param>
        /// <param name="accountNo">Account id</param>
        /// <response code="200">Successful operation</response>
        /// <response code="401">Unauthorized request</response>
        /// <response code="500">Internal server error</response>
        [HttpGet]
        [Route("/api/account/{accountNo}/transactions")]
        [ValidateModelState]
        [SwaggerOperation("ShowLastTenTransactions")]
        public virtual IActionResult ShowLastTenTransactions([FromHeader (Name = "Authorization")][Required()]string authorization, [FromRoute (Name = "accountNo")][Required]string accountNo)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500);

            throw new NotImplementedException();
        }
    }
}
