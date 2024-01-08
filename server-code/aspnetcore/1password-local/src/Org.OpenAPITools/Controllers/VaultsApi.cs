/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * The version of the OpenAPI document: 1.5.7
 * Contact: support@1password.com
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
    public class VaultsApiController : ControllerBase
    { 
        /// <summary>
        /// Get Vault details and metadata
        /// </summary>
        /// <param name="vaultUuid">The UUID of the Vault to fetch Items from</param>
        /// <response code="200">OK</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="403">Unauthorized access</response>
        /// <response code="404">Vault not found</response>
        [HttpGet]
        [Route("/vaults/{vaultUuid}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetVaultById")]
        [SwaggerResponse(statusCode: 200, type: typeof(Vault), description: "OK")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Unauthorized access")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Vault not found")]
        public virtual IActionResult GetVaultById([FromRoute (Name = "vaultUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string vaultUuid)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Vault));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"attributeVersion\" : 0,\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"type\" : \"USER_CREATED\",\n  \"contentVersion\" : 6,\n  \"items\" : 1,\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Vault>(exampleJson)
            : default(Vault);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all Vaults
        /// </summary>
        /// <param name="filter">Filter the Vault collection based on Vault name using SCIM eq filter</param>
        /// <response code="200">OK</response>
        /// <response code="401">Invalid or missing token</response>
        [HttpGet]
        [Route("/vaults")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetVaults")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Vault>), description: "OK")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        public virtual IActionResult GetVaults([FromQuery (Name = "filter")]string filter)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Vault>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "[ {\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"attributeVersion\" : 0,\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"type\" : \"USER_CREATED\",\n  \"contentVersion\" : 6,\n  \"items\" : 1,\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"attributeVersion\" : 0,\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"type\" : \"USER_CREATED\",\n  \"contentVersion\" : 6,\n  \"items\" : 1,\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Vault>>(exampleJson)
            : default(List<Vault>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}