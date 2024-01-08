/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * The version of the OpenAPI document: 2.10.50
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
    public class PublishedBinariesApiController : ControllerBase
    { 
        /// <summary>
        /// List all the published projects.
        /// </summary>
        /// <remarks>Get a list of all the projects, all of them are considered published. </remarks>
        /// <response code="200">OK. The request has succeeded.</response>
        /// <response code="401"></response>
        [HttpGet]
        [Route("/published")]
        [ValidateModelState]
        [SwaggerOperation("PublishedGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "OK. The request has succeeded.")]
        public virtual IActionResult PublishedGet()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Object));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "Custom MIME type example not yet supported: application/xml; charset=utf-8";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List the repositories of a project with published binaries
        /// </summary>
        /// <remarks>Get a list of the repositories of the project that already have published binaries. </remarks>
        /// <response code="200">OK. The request has succeeded.</response>
        /// <response code="401"></response>
        /// <response code="403">Forbidden.  XML Schema used for body validation: [status.xsd](../schema/status.xsd) </response>
        /// <response code="404">Not Found.</response>
        [HttpGet]
        [Route("/published/{project_name}")]
        [ValidateModelState]
        [SwaggerOperation("PublishedProjectNameGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "OK. The request has succeeded.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Object), description: "Forbidden.  XML Schema used for body validation: [status.xsd](../schema/status.xsd) ")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult PublishedProjectNameGet()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Object));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Object));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));
            string exampleJson = null;
            exampleJson = "Custom MIME type example not yet supported: application/xml; charset=utf-8";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Return the binary file itself.
        /// </summary>
        /// <remarks>Allow to download the binary file that was published and stored under the directory given by project/repository/architecture/. Can response with Media Types like application/x-rpm, text/xml, etc. NOTE: Use this only if you absolutely have to, as it doesn&#39;t use the redirector. </remarks>
        /// <param name="binaryFilename">Binary filename</param>
        /// <response code="200">OK</response>
        /// <response code="401"></response>
        /// <response code="403"></response>
        /// <response code="404">Not Found.</response>
        [HttpGet]
        [Route("/published/{project_name}/{repository_name}/{architecture_name}/{binary_filename}")]
        [ValidateModelState]
        [SwaggerOperation("PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(System.IO.Stream), description: "OK")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameGet([FromRoute (Name = "binary_filename")][Required]string binaryFilename)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(System.IO.Stream));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<System.IO.Stream>(exampleJson)
            : default(System.IO.Stream);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Generate a ymp pattern that includes the needed repositories to install the given binary.
        /// </summary>
        /// <remarks>Generate a ymp pattern, which contains the list of packages needed for intalling certain software without having to create dependencies between them. Read more about patterns [in this tutorial](https://en.opensuse.org/openSUSE:Build_Service_Tutorial#Create_Patterns). </remarks>
        /// <response code="200">OK.</response>
        /// <response code="401"></response>
        /// <response code="403"></response>
        /// <response code="404">Not Found.</response>
        [HttpGet]
        [Route("/published/{project_name}/{repository_name}/{architecture_name}/{binary_filename}/view=ymp")]
        [ValidateModelState]
        [SwaggerOperation("PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200Response), description: "OK.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameviewympGet()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));
            string exampleJson = null;
            exampleJson = "<metapackage xmlns=\"aeiou\" xmlns:os=\"aeiou\">\n</metapackage>";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200Response>(exampleJson)
            : default(PublishedProjectNameRepositoryNameArchitectureNameBinaryFilenameViewYmpGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List the content of the directory tree where the binaries are published at the level project/repository/architecture.
        /// </summary>
        /// <remarks>Get a list of binaries and other files present at the level project/repository/architecture of the directory tree as a result of successful building and publishing processes. </remarks>
        /// <response code="200">OK. The request has succeeded.</response>
        /// <response code="401"></response>
        /// <response code="403"></response>
        /// <response code="404">Not Found.</response>
        [HttpGet]
        [Route("/published/{project_name}/{repository_name}/{architecture_name}")]
        [ValidateModelState]
        [SwaggerOperation("PublishedProjectNameRepositoryNameArchitectureNameGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "OK. The request has succeeded.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult PublishedProjectNameRepositoryNameArchitectureNameGet()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Object));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));
            string exampleJson = null;
            exampleJson = "Custom MIME type example not yet supported: application/xml; charset=utf-8";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List the content of the directory tree where the binaries are published at the level project/repository.
        /// </summary>
        /// <remarks>Get a list of architectures&#39; directories and other files (.repo, .ymp, etc.) present at the level project/repository of the directory tree where the published binaries are stored. </remarks>
        /// <response code="200">OK. The request has succeeded.</response>
        /// <response code="401"></response>
        /// <response code="403"></response>
        /// <response code="404">Not Found.</response>
        [HttpGet]
        [Route("/published/{project_name}/{repository_name}")]
        [ValidateModelState]
        [SwaggerOperation("PublishedProjectNameRepositoryNameGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "OK. The request has succeeded.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult PublishedProjectNameRepositoryNameGet()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Object));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));
            string exampleJson = null;
            exampleJson = "Custom MIME type example not yet supported: application/xml; charset=utf-8";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Present information about the last publication of the pair project and repository.
        /// </summary>
        /// <remarks>Get information about the build process (build id, start time, etc.) for the pair project and repository. </remarks>
        /// <param name="view">Set this parameter to status in order to get details about the last publication.</param>
        /// <response code="200">OK. The request has succeeded.</response>
        /// <response code="401"></response>
        /// <response code="403"></response>
        /// <response code="404">Not Found.</response>
        [HttpGet]
        [Route("/published/{project_name}/{repository_name}/view=status")]
        [ValidateModelState]
        [SwaggerOperation("PublishedProjectNameRepositoryNameviewstatusGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(PublishedProjectNameRepositoryNameViewStatusGet200Response), description: "OK. The request has succeeded.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult PublishedProjectNameRepositoryNameviewstatusGet([FromQuery (Name = "view")]string view)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PublishedProjectNameRepositoryNameViewStatusGet200Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));
            string exampleJson = null;
            exampleJson = "<status code=\"succeeded\">\n  <buildid>1569496563</buildid>\n  <endtime>1617574611</endtime>\n  <starttime>1617574611</starttime>\n</status>";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PublishedProjectNameRepositoryNameViewStatusGet200Response>(exampleJson)
            : default(PublishedProjectNameRepositoryNameViewStatusGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}