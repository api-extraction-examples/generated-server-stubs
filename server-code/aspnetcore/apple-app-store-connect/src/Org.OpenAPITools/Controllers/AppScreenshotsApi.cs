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
    public class AppScreenshotsApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="appScreenshotCreateRequest">AppScreenshot representation</param>
        /// <response code="201">Single AppScreenshot</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="409">Request entity error(s)</response>
        [HttpPost]
        [Route("/v1/appScreenshots")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("AppScreenshotsCreateInstance")]
        [SwaggerResponse(statusCode: 201, type: typeof(AppScreenshotResponse), description: "Single AppScreenshot")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult AppScreenshotsCreateInstance([FromBody]AppScreenshotCreateRequest appScreenshotCreateRequest)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(AppScreenshotResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"appScreenshotSet\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appScreenshotSets\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"fileName\" : \"fileName\",\n      \"fileSize\" : 0,\n      \"assetDeliveryState\" : {\n        \"warnings\" : [ {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        }, {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        } ],\n        \"state\" : \"AWAITING_UPLOAD\",\n        \"errors\" : [ {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        }, {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        } ]\n      },\n      \"imageAsset\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"assetToken\" : \"assetToken\",\n      \"sourceFileChecksum\" : \"sourceFileChecksum\",\n      \"uploadOperations\" : [ {\n        \"requestHeaders\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ],\n        \"method\" : \"method\",\n        \"offset\" : 5,\n        \"length\" : 5,\n        \"url\" : \"url\"\n      }, {\n        \"requestHeaders\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ],\n        \"method\" : \"method\",\n        \"offset\" : 5,\n        \"length\" : 5,\n        \"url\" : \"url\"\n      } ],\n      \"assetType\" : \"assetType\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"appScreenshots\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<AppScreenshotResponse>(exampleJson)
            : default(AppScreenshotResponse);
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
        [Route("/v1/appScreenshots/{id}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("AppScreenshotsDeleteInstance")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult AppScreenshotsDeleteInstance([FromRoute (Name = "id")][Required]string id)
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
        /// <param name="fieldsAppScreenshots">the fields to include for returned resources of type appScreenshots</param>
        /// <param name="include">comma-separated list of relationships to include</param>
        /// <response code="200">Single AppScreenshot</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/appScreenshots/{id}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("AppScreenshotsGetInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(AppScreenshotResponse), description: "Single AppScreenshot")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult AppScreenshotsGetInstance([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[appScreenshots]")]List<string> fieldsAppScreenshots, [FromQuery (Name = "include")]List<string> include)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(AppScreenshotResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"appScreenshotSet\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appScreenshotSets\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"fileName\" : \"fileName\",\n      \"fileSize\" : 0,\n      \"assetDeliveryState\" : {\n        \"warnings\" : [ {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        }, {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        } ],\n        \"state\" : \"AWAITING_UPLOAD\",\n        \"errors\" : [ {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        }, {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        } ]\n      },\n      \"imageAsset\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"assetToken\" : \"assetToken\",\n      \"sourceFileChecksum\" : \"sourceFileChecksum\",\n      \"uploadOperations\" : [ {\n        \"requestHeaders\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ],\n        \"method\" : \"method\",\n        \"offset\" : 5,\n        \"length\" : 5,\n        \"url\" : \"url\"\n      }, {\n        \"requestHeaders\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ],\n        \"method\" : \"method\",\n        \"offset\" : 5,\n        \"length\" : 5,\n        \"url\" : \"url\"\n      } ],\n      \"assetType\" : \"assetType\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"appScreenshots\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<AppScreenshotResponse>(exampleJson)
            : default(AppScreenshotResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="appScreenshotUpdateRequest">AppScreenshot representation</param>
        /// <response code="200">Single AppScreenshot</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        /// <response code="409">Request entity error(s)</response>
        [HttpPatch]
        [Route("/v1/appScreenshots/{id}")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("AppScreenshotsUpdateInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(AppScreenshotResponse), description: "Single AppScreenshot")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult AppScreenshotsUpdateInstance([FromRoute (Name = "id")][Required]string id, [FromBody]AppScreenshotUpdateRequest appScreenshotUpdateRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(AppScreenshotResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"appScreenshotSet\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appScreenshotSets\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"fileName\" : \"fileName\",\n      \"fileSize\" : 0,\n      \"assetDeliveryState\" : {\n        \"warnings\" : [ {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        }, {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        } ],\n        \"state\" : \"AWAITING_UPLOAD\",\n        \"errors\" : [ {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        }, {\n          \"code\" : \"code\",\n          \"description\" : \"description\"\n        } ]\n      },\n      \"imageAsset\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"assetToken\" : \"assetToken\",\n      \"sourceFileChecksum\" : \"sourceFileChecksum\",\n      \"uploadOperations\" : [ {\n        \"requestHeaders\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ],\n        \"method\" : \"method\",\n        \"offset\" : 5,\n        \"length\" : 5,\n        \"url\" : \"url\"\n      }, {\n        \"requestHeaders\" : [ {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        }, {\n          \"name\" : \"name\",\n          \"value\" : \"value\"\n        } ],\n        \"method\" : \"method\",\n        \"offset\" : 5,\n        \"length\" : 5,\n        \"url\" : \"url\"\n      } ],\n      \"assetType\" : \"assetType\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"appScreenshots\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<AppScreenshotResponse>(exampleJson)
            : default(AppScreenshotResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
