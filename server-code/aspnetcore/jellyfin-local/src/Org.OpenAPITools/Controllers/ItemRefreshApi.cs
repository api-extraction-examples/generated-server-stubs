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
    public class ItemRefreshApiController : ControllerBase
    { 
        /// <summary>
        /// Refreshes metadata for an item.
        /// </summary>
        /// <param name="itemId">Item id.</param>
        /// <param name="metadataRefreshMode">(Optional) Specifies the metadata refresh mode.</param>
        /// <param name="imageRefreshMode">(Optional) Specifies the image refresh mode.</param>
        /// <param name="replaceAllMetadata">(Optional) Determines if metadata should be replaced. Only applicable if mode is FullRefresh.</param>
        /// <param name="replaceAllImages">(Optional) Determines if images should be replaced. Only applicable if mode is FullRefresh.</param>
        /// <response code="204">Item metadata refresh queued.</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="403">Forbidden</response>
        /// <response code="404">Item to refresh not found.</response>
        [HttpPost]
        [Route("/Items/{itemId}/Refresh")]
        [Authorize(Policy = "CustomAuthentication")]
        [ValidateModelState]
        [SwaggerOperation("Post")]
        [SwaggerResponse(statusCode: 404, type: typeof(ProblemDetails), description: "Item to refresh not found.")]
        public virtual IActionResult Post([FromRoute (Name = "itemId")][Required]Guid itemId, [FromQuery (Name = "metadataRefreshMode")]MetadataRefreshMode metadataRefreshMode, [FromQuery (Name = "imageRefreshMode")]MetadataRefreshMode imageRefreshMode, [FromQuery (Name = "replaceAllMetadata")]bool? replaceAllMetadata, [FromQuery (Name = "replaceAllImages")]bool? replaceAllImages)
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
    }
}