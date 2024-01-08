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
    public class ImageByNameApiController : ControllerBase
    { 
        /// <summary>
        /// Get General Image.
        /// </summary>
        /// <param name="name">The name of the image.</param>
        /// <param name="type">Image Type (primary, backdrop, logo, etc).</param>
        /// <response code="200">Image stream retrieved.</response>
        /// <response code="404">Image not found.</response>
        [HttpGet]
        [Route("/Images/General/{name}/{type}")]
        [ValidateModelState]
        [SwaggerOperation("GetGeneralImage")]
        [SwaggerResponse(statusCode: 200, type: typeof(System.IO.Stream), description: "Image stream retrieved.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ProblemDetails), description: "Image not found.")]
        public virtual IActionResult GetGeneralImage([FromRoute (Name = "name")][Required]string name, [FromRoute (Name = "type")][Required]string type)
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
        /// Get all general images.
        /// </summary>
        /// <response code="200">Retrieved list of images.</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="403">Forbidden</response>
        [HttpGet]
        [Route("/Images/General")]
        [Authorize(Policy = "CustomAuthentication")]
        [ValidateModelState]
        [SwaggerOperation("GetGeneralImages")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<ImageByNameInfo>), description: "Retrieved list of images.")]
        public virtual IActionResult GetGeneralImages()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ImageByNameInfo>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "[ {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n}, {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n} ]";
            exampleJson = "[ {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n}, {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n} ]";
            exampleJson = "[ {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n}, {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ImageByNameInfo>>(exampleJson)
            : default(List<ImageByNameInfo>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get media info image.
        /// </summary>
        /// <param name="theme">The theme to get the image from.</param>
        /// <param name="name">The name of the image.</param>
        /// <response code="200">Image stream retrieved.</response>
        /// <response code="404">Image not found.</response>
        [HttpGet]
        [Route("/Images/MediaInfo/{theme}/{name}")]
        [ValidateModelState]
        [SwaggerOperation("GetMediaInfoImage")]
        [SwaggerResponse(statusCode: 200, type: typeof(System.IO.Stream), description: "Image stream retrieved.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ProblemDetails), description: "Image not found.")]
        public virtual IActionResult GetMediaInfoImage([FromRoute (Name = "theme")][Required]string theme, [FromRoute (Name = "name")][Required]string name)
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
        /// Get all media info images.
        /// </summary>
        /// <response code="200">Image list retrieved.</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="403">Forbidden</response>
        [HttpGet]
        [Route("/Images/MediaInfo")]
        [Authorize(Policy = "CustomAuthentication")]
        [ValidateModelState]
        [SwaggerOperation("GetMediaInfoImages")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<ImageByNameInfo>), description: "Image list retrieved.")]
        public virtual IActionResult GetMediaInfoImages()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ImageByNameInfo>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "[ {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n}, {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n} ]";
            exampleJson = "[ {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n}, {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n} ]";
            exampleJson = "[ {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n}, {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ImageByNameInfo>>(exampleJson)
            : default(List<ImageByNameInfo>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get rating image.
        /// </summary>
        /// <param name="theme">The theme to get the image from.</param>
        /// <param name="name">The name of the image.</param>
        /// <response code="200">Image stream retrieved.</response>
        /// <response code="404">Image not found.</response>
        [HttpGet]
        [Route("/Images/Ratings/{theme}/{name}")]
        [ValidateModelState]
        [SwaggerOperation("GetRatingImage")]
        [SwaggerResponse(statusCode: 200, type: typeof(System.IO.Stream), description: "Image stream retrieved.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ProblemDetails), description: "Image not found.")]
        public virtual IActionResult GetRatingImage([FromRoute (Name = "theme")][Required]string theme, [FromRoute (Name = "name")][Required]string name)
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
        /// Get all general images.
        /// </summary>
        /// <response code="200">Retrieved list of images.</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="403">Forbidden</response>
        [HttpGet]
        [Route("/Images/Ratings")]
        [Authorize(Policy = "CustomAuthentication")]
        [ValidateModelState]
        [SwaggerOperation("GetRatingImages")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<ImageByNameInfo>), description: "Retrieved list of images.")]
        public virtual IActionResult GetRatingImages()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<ImageByNameInfo>));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "[ {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n}, {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n} ]";
            exampleJson = "[ {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n}, {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n} ]";
            exampleJson = "[ {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n}, {\n  \"Context\" : \"Context\",\n  \"Format\" : \"Format\",\n  \"Theme\" : \"Theme\",\n  \"FileLength\" : 0,\n  \"Name\" : \"Name\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<ImageByNameInfo>>(exampleJson)
            : default(List<ImageByNameInfo>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}