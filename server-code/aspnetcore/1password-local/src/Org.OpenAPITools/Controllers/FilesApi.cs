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
    public class FilesApiController : ControllerBase
    { 
        /// <summary>
        /// Get the content of a File
        /// </summary>
        /// <param name="vaultUuid">The UUID of the Vault the item is in</param>
        /// <param name="itemUuid">The UUID of the Item the File is in</param>
        /// <param name="fileUuid">UUID of the file to get content from</param>
        /// <response code="200">Success</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="404">File not found</response>
        [HttpGet]
        [Route("/vaults/{vaultUuid}/items/{itemUuid}/files/{fileUuid}/content")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("DownloadFileByID")]
        [SwaggerResponse(statusCode: 200, type: typeof(System.IO.Stream), description: "Success")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "File not found")]
        public virtual IActionResult DownloadFileByID([FromRoute (Name = "vaultUuid")][Required]Guid vaultUuid, [FromRoute (Name = "itemUuid")][Required]Guid itemUuid, [FromRoute (Name = "fileUuid")][Required]string fileUuid)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(System.IO.Stream));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<System.IO.Stream>(exampleJson)
            : default(System.IO.Stream);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get the details of a File
        /// </summary>
        /// <param name="vaultUuid">The UUID of the Vault to fetch Item from</param>
        /// <param name="itemUuid">The UUID of the Item to fetch File from</param>
        /// <param name="fileUuid">The UUID of the File to fetch</param>
        /// <param name="inlineFiles">Tells server to return the base64-encoded file contents in the response.</param>
        /// <response code="200">OK</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="403">Unauthorized access</response>
        /// <response code="404">File not found</response>
        /// <response code="413">File content too large to display</response>
        [HttpGet]
        [Route("/vaults/{vaultUuid}/items/{itemUuid}/files/{fileUuid}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetDetailsOfFileById")]
        [SwaggerResponse(statusCode: 200, type: typeof(File), description: "OK")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Unauthorized access")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "File not found")]
        [SwaggerResponse(statusCode: 413, type: typeof(ErrorResponse), description: "File content too large to display")]
        public virtual IActionResult GetDetailsOfFileById([FromRoute (Name = "vaultUuid")][Required]Guid vaultUuid, [FromRoute (Name = "itemUuid")][Required]Guid itemUuid, [FromRoute (Name = "fileUuid")][Required]Guid fileUuid, [FromQuery (Name = "inline_files")]bool? inlineFiles)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(File));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 413 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(413, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"content\" : \"VGhlIGZ1dHVyZSBiZWxvbmdzIHRvIHRoZSBjdXJpb3VzLgo=\",\n  \"content_path\" : \"v1/vaults/ionaiwtdvgclrixbt6ztpqcxnq/items/p7eflcy7f5mk7vg6zrzf5rjjyu/files/6r65pjq33banznomn7q22sj44e/content\",\n  \"id\" : \"6r65pjq33banznomn7q22sj44e\",\n  \"name\" : \"foo.txt\",\n  \"size\" : 35\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<File>(exampleJson)
            : default(File);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get all the files inside an Item
        /// </summary>
        /// <param name="vaultUuid">The UUID of the Vault to fetch Items from</param>
        /// <param name="itemUuid">The UUID of the Item to fetch files from</param>
        /// <param name="inlineFiles">Tells server to return the base64-encoded file contents in the response.</param>
        /// <response code="200">OK</response>
        /// <response code="401">Invalid or missing token</response>
        /// <response code="404">Item not found</response>
        /// <response code="413">File content too large to display</response>
        [HttpGet]
        [Route("/vaults/{vaultUuid}/items/{itemUuid}/files")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetItemFiles")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<File>), description: "OK")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "Invalid or missing token")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Item not found")]
        [SwaggerResponse(statusCode: 413, type: typeof(ErrorResponse), description: "File content too large to display")]
        public virtual IActionResult GetItemFiles([FromRoute (Name = "vaultUuid")][Required]Guid vaultUuid, [FromRoute (Name = "itemUuid")][Required]Guid itemUuid, [FromQuery (Name = "inline_files")]bool? inlineFiles)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<File>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 413 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(413, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "[ {\n  \"content\" : \"VGhlIGZ1dHVyZSBiZWxvbmdzIHRvIHRoZSBjdXJpb3VzLgo=\",\n  \"content_path\" : \"v1/vaults/ionaiwtdvgclrixbt6ztpqcxnq/items/p7eflcy7f5mk7vg6zrzf5rjjyu/files/6r65pjq33banznomn7q22sj44e/content\",\n  \"id\" : \"6r65pjq33banznomn7q22sj44e\",\n  \"name\" : \"foo.txt\",\n  \"size\" : 35\n}, {\n  \"content\" : \"VGhlIGZ1dHVyZSBiZWxvbmdzIHRvIHRoZSBjdXJpb3VzLgo=\",\n  \"content_path\" : \"v1/vaults/ionaiwtdvgclrixbt6ztpqcxnq/items/p7eflcy7f5mk7vg6zrzf5rjjyu/files/6r65pjq33banznomn7q22sj44e/content\",\n  \"id\" : \"6r65pjq33banznomn7q22sj44e\",\n  \"name\" : \"foo.txt\",\n  \"size\" : 35\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<File>>(exampleJson)
            : default(List<File>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
