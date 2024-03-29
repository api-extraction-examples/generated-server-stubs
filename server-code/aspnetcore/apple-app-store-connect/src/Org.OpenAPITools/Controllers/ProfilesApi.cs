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
    public class ProfilesApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="fieldsBundleIds">the fields to include for returned resources of type bundleIds</param>
        /// <response code="200">Related resource</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/profiles/{id}/bundleId")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("ProfilesBundleIdGetToOneRelated")]
        [SwaggerResponse(statusCode: 200, type: typeof(BundleIdResponse), description: "Related resource")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult ProfilesBundleIdGetToOneRelated([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[bundleIds]")]List<string> fieldsBundleIds)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(BundleIdResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"bundleIdCapabilities\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"bundleIdCapabilities\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"bundleIdCapabilities\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"profiles\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"profiles\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"profiles\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"identifier\" : \"identifier\",\n      \"seedId\" : \"seedId\",\n      \"name\" : \"name\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"bundleIds\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  },\n  \"included\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BundleIdResponse>(exampleJson)
            : default(BundleIdResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="fieldsCertificates">the fields to include for returned resources of type certificates</param>
        /// <param name="limit">maximum resources per page</param>
        /// <response code="200">List of related resources</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/profiles/{id}/certificates")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("ProfilesCertificatesGetToManyRelated")]
        [SwaggerResponse(statusCode: 200, type: typeof(CertificatesResponse), description: "List of related resources")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult ProfilesCertificatesGetToManyRelated([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[certificates]")]List<string> fieldsCertificates, [FromQuery (Name = "limit")]int? limit)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CertificatesResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ {\n    \"attributes\" : {\n      \"serialNumber\" : \"serialNumber\",\n      \"certificateContent\" : \"certificateContent\",\n      \"displayName\" : \"displayName\",\n      \"name\" : \"name\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"certificates\"\n  }, {\n    \"attributes\" : {\n      \"serialNumber\" : \"serialNumber\",\n      \"certificateContent\" : \"certificateContent\",\n      \"displayName\" : \"displayName\",\n      \"name\" : \"name\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"certificates\"\n  } ],\n  \"meta\" : {\n    \"paging\" : {\n      \"total\" : 6,\n      \"limit\" : 0\n    }\n  },\n  \"links\" : {\n    \"next\" : \"next\",\n    \"self\" : \"self\",\n    \"first\" : \"first\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CertificatesResponse>(exampleJson)
            : default(CertificatesResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="profileCreateRequest">Profile representation</param>
        /// <response code="201">Single Profile</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="409">Request entity error(s)</response>
        [HttpPost]
        [Route("/v1/profiles")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("ProfilesCreateInstance")]
        [SwaggerResponse(statusCode: 201, type: typeof(ProfileResponse), description: "Single Profile")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult ProfilesCreateInstance([FromBody]ProfileCreateRequest profileCreateRequest)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(ProfileResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"certificates\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"certificates\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"certificates\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"devices\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"devices\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"devices\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"bundleId\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"bundleIds\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"profileState\" : \"ACTIVE\",\n      \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"profileType\" : \"IOS_APP_DEVELOPMENT\",\n      \"name\" : \"name\",\n      \"profileContent\" : \"profileContent\",\n      \"uuid\" : \"uuid\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"profiles\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  },\n  \"included\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ProfileResponse>(exampleJson)
            : default(ProfileResponse);
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
        [Route("/v1/profiles/{id}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("ProfilesDeleteInstance")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult ProfilesDeleteInstance([FromRoute (Name = "id")][Required]string id)
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
        /// <param name="fieldsDevices">the fields to include for returned resources of type devices</param>
        /// <param name="limit">maximum resources per page</param>
        /// <response code="200">List of related resources</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/profiles/{id}/devices")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("ProfilesDevicesGetToManyRelated")]
        [SwaggerResponse(statusCode: 200, type: typeof(DevicesResponse), description: "List of related resources")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult ProfilesDevicesGetToManyRelated([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[devices]")]List<string> fieldsDevices, [FromQuery (Name = "limit")]int? limit)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DevicesResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ {\n    \"attributes\" : {\n      \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"name\" : \"name\",\n      \"deviceClass\" : \"APPLE_WATCH\",\n      \"model\" : \"model\",\n      \"udid\" : \"udid\",\n      \"status\" : \"ENABLED\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"devices\"\n  }, {\n    \"attributes\" : {\n      \"addedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"name\" : \"name\",\n      \"deviceClass\" : \"APPLE_WATCH\",\n      \"model\" : \"model\",\n      \"udid\" : \"udid\",\n      \"status\" : \"ENABLED\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"devices\"\n  } ],\n  \"meta\" : {\n    \"paging\" : {\n      \"total\" : 6,\n      \"limit\" : 0\n    }\n  },\n  \"links\" : {\n    \"next\" : \"next\",\n    \"self\" : \"self\",\n    \"first\" : \"first\"\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DevicesResponse>(exampleJson)
            : default(DevicesResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="filterName">filter by attribute &#39;name&#39;</param>
        /// <param name="filterProfileState">filter by attribute &#39;profileState&#39;</param>
        /// <param name="filterProfileType">filter by attribute &#39;profileType&#39;</param>
        /// <param name="filterId">filter by id(s)</param>
        /// <param name="sort">comma-separated list of sort expressions; resources will be sorted as specified</param>
        /// <param name="fieldsProfiles">the fields to include for returned resources of type profiles</param>
        /// <param name="limit">maximum resources per page</param>
        /// <param name="include">comma-separated list of relationships to include</param>
        /// <param name="fieldsCertificates">the fields to include for returned resources of type certificates</param>
        /// <param name="fieldsDevices">the fields to include for returned resources of type devices</param>
        /// <param name="fieldsBundleIds">the fields to include for returned resources of type bundleIds</param>
        /// <param name="limitCertificates">maximum number of related certificates returned (when they are included)</param>
        /// <param name="limitDevices">maximum number of related devices returned (when they are included)</param>
        /// <response code="200">List of Profiles</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        [HttpGet]
        [Route("/v1/profiles")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("ProfilesGetCollection")]
        [SwaggerResponse(statusCode: 200, type: typeof(ProfilesResponse), description: "List of Profiles")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        public virtual IActionResult ProfilesGetCollection([FromQuery (Name = "filter[name]")]List<string> filterName, [FromQuery (Name = "filter[profileState]")]List<string> filterProfileState, [FromQuery (Name = "filter[profileType]")]List<string> filterProfileType, [FromQuery (Name = "filter[id]")]List<string> filterId, [FromQuery (Name = "sort")]List<string> sort, [FromQuery (Name = "fields[profiles]")]List<string> fieldsProfiles, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "include")]List<string> include, [FromQuery (Name = "fields[certificates]")]List<string> fieldsCertificates, [FromQuery (Name = "fields[devices]")]List<string> fieldsDevices, [FromQuery (Name = "fields[bundleIds]")]List<string> fieldsBundleIds, [FromQuery (Name = "limit[certificates]")]int? limitCertificates, [FromQuery (Name = "limit[devices]")]int? limitDevices)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ProfilesResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ {\n    \"relationships\" : {\n      \"certificates\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"certificates\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"certificates\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"devices\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"devices\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"devices\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"bundleId\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"bundleIds\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"profileState\" : \"ACTIVE\",\n      \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"profileType\" : \"IOS_APP_DEVELOPMENT\",\n      \"name\" : \"name\",\n      \"profileContent\" : \"profileContent\",\n      \"uuid\" : \"uuid\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"profiles\"\n  }, {\n    \"relationships\" : {\n      \"certificates\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"certificates\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"certificates\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"devices\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"devices\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"devices\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"bundleId\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"bundleIds\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"profileState\" : \"ACTIVE\",\n      \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"profileType\" : \"IOS_APP_DEVELOPMENT\",\n      \"name\" : \"name\",\n      \"profileContent\" : \"profileContent\",\n      \"uuid\" : \"uuid\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"profiles\"\n  } ],\n  \"meta\" : {\n    \"paging\" : {\n      \"total\" : 6,\n      \"limit\" : 0\n    }\n  },\n  \"links\" : {\n    \"next\" : \"next\",\n    \"self\" : \"self\",\n    \"first\" : \"first\"\n  },\n  \"included\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ProfilesResponse>(exampleJson)
            : default(ProfilesResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="fieldsProfiles">the fields to include for returned resources of type profiles</param>
        /// <param name="include">comma-separated list of relationships to include</param>
        /// <param name="fieldsCertificates">the fields to include for returned resources of type certificates</param>
        /// <param name="fieldsDevices">the fields to include for returned resources of type devices</param>
        /// <param name="fieldsBundleIds">the fields to include for returned resources of type bundleIds</param>
        /// <param name="limitCertificates">maximum number of related certificates returned (when they are included)</param>
        /// <param name="limitDevices">maximum number of related devices returned (when they are included)</param>
        /// <response code="200">Single Profile</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/profiles/{id}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("ProfilesGetInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(ProfileResponse), description: "Single Profile")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult ProfilesGetInstance([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[profiles]")]List<string> fieldsProfiles, [FromQuery (Name = "include")]List<string> include, [FromQuery (Name = "fields[certificates]")]List<string> fieldsCertificates, [FromQuery (Name = "fields[devices]")]List<string> fieldsDevices, [FromQuery (Name = "fields[bundleIds]")]List<string> fieldsBundleIds, [FromQuery (Name = "limit[certificates]")]int? limitCertificates, [FromQuery (Name = "limit[devices]")]int? limitDevices)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ProfileResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"certificates\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"certificates\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"certificates\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"devices\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"devices\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"devices\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"bundleId\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"bundleIds\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"profileState\" : \"ACTIVE\",\n      \"createdDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"profileType\" : \"IOS_APP_DEVELOPMENT\",\n      \"name\" : \"name\",\n      \"profileContent\" : \"profileContent\",\n      \"uuid\" : \"uuid\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"profiles\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  },\n  \"included\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ProfileResponse>(exampleJson)
            : default(ProfileResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
