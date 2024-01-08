/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    public class RemoteImageApiController : ControllerBase
    { 
        /// <summary>
        /// Downloads a remote image for an item.
        /// </summary>
        /// <param name="itemId">Item Id.</param>
        /// <param name="type">The image type.</param>
        /// <param name="imageUrl">The image url.</param>
        /// <response code="204">Remote image downloaded.</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="403">Forbidden</response>
        /// <response code="404">Remote image not found.</response>
        [HttpPost]
        [Route("/Items/{itemId}/RemoteImages/Download")]
        [Authorize(Policy = "CustomAuthentication")]
        [ValidateModelState]
        [SwaggerOperation("DownloadRemoteImage")]
        [SwaggerResponse(statusCode: 404, type: typeof(ProblemDetails), description: "Remote image not found.")]
        public virtual IActionResult DownloadRemoteImage([FromRoute (Name = "itemId")][Required]Guid itemId, [FromQuery (Name = "type")][Required()]ImageType type, [FromQuery (Name = "imageUrl")]string imageUrl)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ProblemDetails));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Gets a remote image.
        /// </summary>
        /// <param name="imageUrl">The image url.</param>
        /// <response code="200">Remote image returned.</response>
        /// <response code="404">Remote image not found.</response>
        [HttpGet]
        [Route("/Images/Remote")]
        [ValidateModelState]
        [SwaggerOperation("GetRemoteImage")]
        [SwaggerResponse(statusCode: 200, type: typeof(System.IO.Stream), description: "Remote image returned.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ProblemDetails), description: "Remote image not found.")]
        public virtual IActionResult GetRemoteImage([FromQuery (Name = "imageUrl")][Required()]string imageUrl)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(System.IO.Stream));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ProblemDetails));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<System.IO.Stream>(exampleJson)
            : default(System.IO.Stream);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Gets available remote image providers for an item.
        /// </summary>
        /// <param name="itemId">Item Id.</param>
        /// <response code="200">Returned remote image providers.</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="403">Forbidden</response>
        /// <response code="404">Item not found.</response>
        [HttpGet]
        [Route("/Items/{itemId}/RemoteImages/Providers")]
        [Authorize(Policy = "CustomAuthentication")]
        [ValidateModelState]
        [SwaggerOperation("GetRemoteImageProviders")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<ImageProviderInfo>), description: "Returned remote image providers.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ProblemDetails), description: "Item not found.")]
        public virtual IActionResult GetRemoteImageProviders([FromRoute (Name = "itemId")][Required]Guid itemId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ImageProviderInfo>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ProblemDetails));
            string exampleJson = null;
            exampleJson = "[ {\n  \"SupportedImages\" : [ null, null ],\n  \"Name\" : \"Name\"\n}, {\n  \"SupportedImages\" : [ null, null ],\n  \"Name\" : \"Name\"\n} ]";
            exampleJson = "[ {\n  \"SupportedImages\" : [ null, null ],\n  \"Name\" : \"Name\"\n}, {\n  \"SupportedImages\" : [ null, null ],\n  \"Name\" : \"Name\"\n} ]";
            exampleJson = "[ {\n  \"SupportedImages\" : [ null, null ],\n  \"Name\" : \"Name\"\n}, {\n  \"SupportedImages\" : [ null, null ],\n  \"Name\" : \"Name\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ImageProviderInfo>>(exampleJson)
            : default(List<ImageProviderInfo>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Gets available remote images for an item.
        /// </summary>
        /// <param name="itemId">Item Id.</param>
        /// <param name="type">The image type.</param>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results.</param>
        /// <param name="limit">Optional. The maximum number of records to return.</param>
        /// <param name="providerName">Optional. The image provider to use.</param>
        /// <param name="includeAllLanguages">Optional. Include all languages.</param>
        /// <response code="200">Remote Images returned.</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="403">Forbidden</response>
        /// <response code="404">Item not found.</response>
        [HttpGet]
        [Route("/Items/{itemId}/RemoteImages")]
        [Authorize(Policy = "CustomAuthentication")]
        [ValidateModelState]
        [SwaggerOperation("GetRemoteImages")]
        [SwaggerResponse(statusCode: 200, type: typeof(RemoteImageResult), description: "Remote Images returned.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ProblemDetails), description: "Item not found.")]
        public virtual IActionResult GetRemoteImages([FromRoute (Name = "itemId")][Required]Guid itemId, [FromQuery (Name = "type")]ImageType type, [FromQuery (Name = "startIndex")]int? startIndex, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "providerName")]string providerName, [FromQuery (Name = "includeAllLanguages")]bool? includeAllLanguages)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(RemoteImageResult));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ProblemDetails));
            string exampleJson = null;
            exampleJson = "{\n  \"TotalRecordCount\" : 5,\n  \"Images\" : [ {\n    \"ProviderName\" : \"ProviderName\",\n    \"Language\" : \"Language\",\n    \"ThumbnailUrl\" : \"ThumbnailUrl\",\n    \"VoteCount\" : 1,\n    \"CommunityRating\" : 0.8008281904610115,\n    \"Height\" : 6,\n    \"Width\" : 5,\n    \"Url\" : \"Url\"\n  }, {\n    \"ProviderName\" : \"ProviderName\",\n    \"Language\" : \"Language\",\n    \"ThumbnailUrl\" : \"ThumbnailUrl\",\n    \"VoteCount\" : 1,\n    \"CommunityRating\" : 0.8008281904610115,\n    \"Height\" : 6,\n    \"Width\" : 5,\n    \"Url\" : \"Url\"\n  } ],\n  \"Providers\" : [ \"Providers\", \"Providers\" ]\n}";
            exampleJson = "{\n  \"TotalRecordCount\" : 5,\n  \"Images\" : [ {\n    \"ProviderName\" : \"ProviderName\",\n    \"Language\" : \"Language\",\n    \"ThumbnailUrl\" : \"ThumbnailUrl\",\n    \"VoteCount\" : 1,\n    \"CommunityRating\" : 0.8008281904610115,\n    \"Height\" : 6,\n    \"Width\" : 5,\n    \"Url\" : \"Url\"\n  }, {\n    \"ProviderName\" : \"ProviderName\",\n    \"Language\" : \"Language\",\n    \"ThumbnailUrl\" : \"ThumbnailUrl\",\n    \"VoteCount\" : 1,\n    \"CommunityRating\" : 0.8008281904610115,\n    \"Height\" : 6,\n    \"Width\" : 5,\n    \"Url\" : \"Url\"\n  } ],\n  \"Providers\" : [ \"Providers\", \"Providers\" ]\n}";
            exampleJson = "{\n  \"TotalRecordCount\" : 5,\n  \"Images\" : [ {\n    \"ProviderName\" : \"ProviderName\",\n    \"Language\" : \"Language\",\n    \"ThumbnailUrl\" : \"ThumbnailUrl\",\n    \"VoteCount\" : 1,\n    \"CommunityRating\" : 0.8008281904610115,\n    \"Height\" : 6,\n    \"Width\" : 5,\n    \"Url\" : \"Url\"\n  }, {\n    \"ProviderName\" : \"ProviderName\",\n    \"Language\" : \"Language\",\n    \"ThumbnailUrl\" : \"ThumbnailUrl\",\n    \"VoteCount\" : 1,\n    \"CommunityRating\" : 0.8008281904610115,\n    \"Height\" : 6,\n    \"Width\" : 5,\n    \"Url\" : \"Url\"\n  } ],\n  \"Providers\" : [ \"Providers\", \"Providers\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<RemoteImageResult>(exampleJson)
            : default(RemoteImageResult);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}