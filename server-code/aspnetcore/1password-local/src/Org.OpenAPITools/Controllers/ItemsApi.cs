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
    public class ItemsApiController : ControllerBase
    { 
        /// <summary>
        /// Create a new Item
        /// </summary>
        /// <param name="vaultUuid">The UUID of the Vault to create an Item in</param>
        /// <param name="fullItem"></param>
        /// <response code="200">OK</response>
        /// <response code="400">Unable to create item due to invalid input</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="403">Unauthorized access</response>
        /// <response code="404">Item not found</response>
        [HttpPost]
        [Route("/vaults/{vaultUuid}/items")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateVaultItem")]
        [SwaggerResponse(statusCode: 200, type: typeof(FullItem), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Unable to create item due to invalid input")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Unauthorized access")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Item not found")]
        public virtual IActionResult CreateVaultItem([FromRoute (Name = "vaultUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string vaultUuid, [FromBody]FullItem fullItem)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(FullItem));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<FullItem>(exampleJson)
            : default(FullItem);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete an Item
        /// </summary>
        /// <param name="vaultUuid">The UUID of the Vault the item is in</param>
        /// <param name="itemUuid">The UUID of the Item to update</param>
        /// <response code="204">Successfully deleted an item</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="403">Unauthorized access</response>
        /// <response code="404">Item not found</response>
        [HttpDelete]
        [Route("/vaults/{vaultUuid}/items/{itemUuid}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("DeleteVaultItem")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Unauthorized access")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Item not found")]
        public virtual IActionResult DeleteVaultItem([FromRoute (Name = "vaultUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string vaultUuid, [FromRoute (Name = "itemUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string itemUuid)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get the details of an Item
        /// </summary>
        /// <param name="vaultUuid">The UUID of the Vault to fetch Item from</param>
        /// <param name="itemUuid">The UUID of the Item to fetch</param>
        /// <response code="200">OK</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="403">Unauthorized access</response>
        /// <response code="404">Item not found</response>
        [HttpGet]
        [Route("/vaults/{vaultUuid}/items/{itemUuid}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetVaultItemById")]
        [SwaggerResponse(statusCode: 200, type: typeof(FullItem), description: "OK")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Unauthorized access")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Item not found")]
        public virtual IActionResult GetVaultItemById([FromRoute (Name = "vaultUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string vaultUuid, [FromRoute (Name = "itemUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string itemUuid)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(FullItem));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<FullItem>(exampleJson)
            : default(FullItem);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all items for inside a Vault
        /// </summary>
        /// <param name="vaultUuid">The UUID of the Vault to fetch Items from</param>
        /// <param name="filter">Filter the Item collection based on Item name using SCIM eq filter</param>
        /// <response code="200">OK</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="404">Vault not found</response>
        [HttpGet]
        [Route("/vaults/{vaultUuid}/items")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetVaultItems")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Item>), description: "OK")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Vault not found")]
        public virtual IActionResult GetVaultItems([FromRoute (Name = "vaultUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string vaultUuid, [FromQuery (Name = "filter")]string filter)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Item>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "[ {\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"urls\" : [ {\n    \"href\" : \"https://example.com\",\n    \"primary\" : true\n  }, {\n    \"href\" : \"https://example.org\"\n  } ],\n  \"id\" : \"id\",\n  \"state\" : \"ARCHIVED\",\n  \"category\" : \"LOGIN\",\n  \"title\" : \"title\",\n  \"favorite\" : false,\n  \"version\" : 0,\n  \"lastEditedBy\" : \"lastEditedBy\",\n  \"vault\" : {\n    \"id\" : \"id\"\n  },\n  \"tags\" : [ \"tags\", \"tags\" ],\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n}, {\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"urls\" : [ {\n    \"href\" : \"https://example.com\",\n    \"primary\" : true\n  }, {\n    \"href\" : \"https://example.org\"\n  } ],\n  \"id\" : \"id\",\n  \"state\" : \"ARCHIVED\",\n  \"category\" : \"LOGIN\",\n  \"title\" : \"title\",\n  \"favorite\" : false,\n  \"version\" : 0,\n  \"lastEditedBy\" : \"lastEditedBy\",\n  \"vault\" : {\n    \"id\" : \"id\"\n  },\n  \"tags\" : [ \"tags\", \"tags\" ],\n  \"updatedAt\" : \"2000-01-23T04:56:07.000+00:00\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Item>>(exampleJson)
            : default(List<Item>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update a subset of Item attributes
        /// </summary>
        /// <remarks>Applies a modified [RFC6902 JSON Patch](https://tools.ietf.org/html/rfc6902) document to an Item or ItemField. This endpoint only supports &#x60;add&#x60;, &#x60;remove&#x60; and &#x60;replace&#x60; operations.  When modifying a specific ItemField, the ItemField&#39;s ID in the &#x60;path&#x60; attribute of the operation object: &#x60;/fields/{fieldId}&#x60; </remarks>
        /// <param name="vaultUuid">The UUID of the Vault the item is in</param>
        /// <param name="itemUuid">The UUID of the Item to update</param>
        /// <param name="patchInner"></param>
        /// <response code="200">OK - Item updated. If no Patch operations were provided, Item is unmodified.</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="403">Unauthorized access</response>
        /// <response code="404">Item not found</response>
        [HttpPatch]
        [Route("/vaults/{vaultUuid}/items/{itemUuid}")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchVaultItem")]
        [SwaggerResponse(statusCode: 200, type: typeof(FullItem), description: "OK - Item updated. If no Patch operations were provided, Item is unmodified.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Unauthorized access")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Item not found")]
        public virtual IActionResult PatchVaultItem([FromRoute (Name = "vaultUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string vaultUuid, [FromRoute (Name = "itemUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string itemUuid, [FromBody]List<PatchInner> patchInner)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(FullItem));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<FullItem>(exampleJson)
            : default(FullItem);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update an Item
        /// </summary>
        /// <param name="vaultUuid">The UUID of the Item&#39;s Vault</param>
        /// <param name="itemUuid">The UUID of the Item to update</param>
        /// <param name="fullItem"></param>
        /// <response code="200">OK</response>
        /// <response code="400">Unable to create item due to invalid input</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="403">Unauthorized access</response>
        /// <response code="404">Item not found</response>
        [HttpPut]
        [Route("/vaults/{vaultUuid}/items/{itemUuid}")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateVaultItem")]
        [SwaggerResponse(statusCode: 200, type: typeof(FullItem), description: "OK")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Unable to create item due to invalid input")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Unauthorized access")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Item not found")]
        public virtual IActionResult UpdateVaultItem([FromRoute (Name = "vaultUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string vaultUuid, [FromRoute (Name = "itemUuid")][Required][RegularExpression("^[\\da-z]{26}$")]string itemUuid, [FromBody]FullItem fullItem)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(FullItem));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<FullItem>(exampleJson)
            : default(FullItem);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
