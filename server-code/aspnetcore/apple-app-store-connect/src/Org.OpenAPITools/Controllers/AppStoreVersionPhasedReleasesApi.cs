/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.4.1
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
    public class AppStoreVersionPhasedReleasesApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="appStoreVersionPhasedReleaseCreateRequest">AppStoreVersionPhasedRelease representation</param>
        /// <response code="201">Single AppStoreVersionPhasedRelease</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="409">Request entity error(s)</response>
        [HttpPost]
        [Route("/v1/appStoreVersionPhasedReleases")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("AppStoreVersionPhasedReleasesCreateInstance")]
        [SwaggerResponse(statusCode: 201, type: typeof(AppStoreVersionPhasedReleaseResponse), description: "Single AppStoreVersionPhasedRelease")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult AppStoreVersionPhasedReleasesCreateInstance([FromBody]AppStoreVersionPhasedReleaseCreateRequest appStoreVersionPhasedReleaseCreateRequest)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(AppStoreVersionPhasedReleaseResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"attributes\" : {\n      \"currentDayNumber\" : 0,\n      \"totalPauseDuration\" : 6,\n      \"startDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"appStoreVersionPhasedReleases\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<AppStoreVersionPhasedReleaseResponse>(exampleJson)
            : default(AppStoreVersionPhasedReleaseResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <response code="204">Success (no content)</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        /// <response code="409">Request entity error(s)</response>
        [HttpDelete]
        [Route("/v1/appStoreVersionPhasedReleases/{id}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("AppStoreVersionPhasedReleasesDeleteInstance")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult AppStoreVersionPhasedReleasesDeleteInstance([FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));

            throw new NotImplementedException();
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="appStoreVersionPhasedReleaseUpdateRequest">AppStoreVersionPhasedRelease representation</param>
        /// <response code="200">Single AppStoreVersionPhasedRelease</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        /// <response code="409">Request entity error(s)</response>
        [HttpPatch]
        [Route("/v1/appStoreVersionPhasedReleases/{id}")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("AppStoreVersionPhasedReleasesUpdateInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(AppStoreVersionPhasedReleaseResponse), description: "Single AppStoreVersionPhasedRelease")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult AppStoreVersionPhasedReleasesUpdateInstance([FromRoute (Name = "id")][Required]string id, [FromBody]AppStoreVersionPhasedReleaseUpdateRequest appStoreVersionPhasedReleaseUpdateRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(AppStoreVersionPhasedReleaseResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"attributes\" : {\n      \"currentDayNumber\" : 0,\n      \"totalPauseDuration\" : 6,\n      \"startDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"appStoreVersionPhasedReleases\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<AppStoreVersionPhasedReleaseResponse>(exampleJson)
            : default(AppStoreVersionPhasedReleaseResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}