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
    public class BundleIdCapabilitiesApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="bundleIdCapabilityCreateRequest">BundleIdCapability representation</param>
        /// <response code="201">Single BundleIdCapability</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="409">Request entity error(s)</response>
        [HttpPost]
        [Route("/v1/bundleIdCapabilities")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("BundleIdCapabilitiesCreateInstance")]
        [SwaggerResponse(statusCode: 201, type: typeof(BundleIdCapabilityResponse), description: "Single BundleIdCapability")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult BundleIdCapabilitiesCreateInstance([FromBody]BundleIdCapabilityCreateRequest bundleIdCapabilityCreateRequest)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(BundleIdCapabilityResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"attributes\" : {\n      \"settings\" : [ {\n        \"minInstances\" : 0,\n        \"visible\" : true,\n        \"allowedInstances\" : \"ENTRY\",\n        \"enabledByDefault\" : true,\n        \"name\" : \"name\",\n        \"options\" : [ {\n          \"supportsWildcard\" : true,\n          \"enabledByDefault\" : true,\n          \"name\" : \"name\",\n          \"description\" : \"description\",\n          \"enabled\" : true,\n          \"key\" : \"XCODE_5\"\n        }, {\n          \"supportsWildcard\" : true,\n          \"enabledByDefault\" : true,\n          \"name\" : \"name\",\n          \"description\" : \"description\",\n          \"enabled\" : true,\n          \"key\" : \"XCODE_5\"\n        } ],\n        \"description\" : \"description\",\n        \"key\" : \"ICLOUD_VERSION\"\n      }, {\n        \"minInstances\" : 0,\n        \"visible\" : true,\n        \"allowedInstances\" : \"ENTRY\",\n        \"enabledByDefault\" : true,\n        \"name\" : \"name\",\n        \"options\" : [ {\n          \"supportsWildcard\" : true,\n          \"enabledByDefault\" : true,\n          \"name\" : \"name\",\n          \"description\" : \"description\",\n          \"enabled\" : true,\n          \"key\" : \"XCODE_5\"\n        }, {\n          \"supportsWildcard\" : true,\n          \"enabledByDefault\" : true,\n          \"name\" : \"name\",\n          \"description\" : \"description\",\n          \"enabled\" : true,\n          \"key\" : \"XCODE_5\"\n        } ],\n        \"description\" : \"description\",\n        \"key\" : \"ICLOUD_VERSION\"\n      } ]\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"bundleIdCapabilities\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BundleIdCapabilityResponse>(exampleJson)
            : default(BundleIdCapabilityResponse);
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
        [Route("/v1/bundleIdCapabilities/{id}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("BundleIdCapabilitiesDeleteInstance")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult BundleIdCapabilitiesDeleteInstance([FromRoute (Name = "id")][Required]string id)
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
        /// <param name="bundleIdCapabilityUpdateRequest">BundleIdCapability representation</param>
        /// <response code="200">Single BundleIdCapability</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        /// <response code="409">Request entity error(s)</response>
        [HttpPatch]
        [Route("/v1/bundleIdCapabilities/{id}")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("BundleIdCapabilitiesUpdateInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(BundleIdCapabilityResponse), description: "Single BundleIdCapability")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult BundleIdCapabilitiesUpdateInstance([FromRoute (Name = "id")][Required]string id, [FromBody]BundleIdCapabilityUpdateRequest bundleIdCapabilityUpdateRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(BundleIdCapabilityResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"attributes\" : {\n      \"settings\" : [ {\n        \"minInstances\" : 0,\n        \"visible\" : true,\n        \"allowedInstances\" : \"ENTRY\",\n        \"enabledByDefault\" : true,\n        \"name\" : \"name\",\n        \"options\" : [ {\n          \"supportsWildcard\" : true,\n          \"enabledByDefault\" : true,\n          \"name\" : \"name\",\n          \"description\" : \"description\",\n          \"enabled\" : true,\n          \"key\" : \"XCODE_5\"\n        }, {\n          \"supportsWildcard\" : true,\n          \"enabledByDefault\" : true,\n          \"name\" : \"name\",\n          \"description\" : \"description\",\n          \"enabled\" : true,\n          \"key\" : \"XCODE_5\"\n        } ],\n        \"description\" : \"description\",\n        \"key\" : \"ICLOUD_VERSION\"\n      }, {\n        \"minInstances\" : 0,\n        \"visible\" : true,\n        \"allowedInstances\" : \"ENTRY\",\n        \"enabledByDefault\" : true,\n        \"name\" : \"name\",\n        \"options\" : [ {\n          \"supportsWildcard\" : true,\n          \"enabledByDefault\" : true,\n          \"name\" : \"name\",\n          \"description\" : \"description\",\n          \"enabled\" : true,\n          \"key\" : \"XCODE_5\"\n        }, {\n          \"supportsWildcard\" : true,\n          \"enabledByDefault\" : true,\n          \"name\" : \"name\",\n          \"description\" : \"description\",\n          \"enabled\" : true,\n          \"key\" : \"XCODE_5\"\n        } ],\n        \"description\" : \"description\",\n        \"key\" : \"ICLOUD_VERSION\"\n      } ]\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"bundleIdCapabilities\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BundleIdCapabilityResponse>(exampleJson)
            : default(BundleIdCapabilityResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}