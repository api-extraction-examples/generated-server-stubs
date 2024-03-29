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
    public class BuildBetaDetailsApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="fieldsBuilds">the fields to include for returned resources of type builds</param>
        /// <response code="200">Related resource</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/buildBetaDetails/{id}/build")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("BuildBetaDetailsBuildGetToOneRelated")]
        [SwaggerResponse(statusCode: 200, type: typeof(BuildResponse), description: "Related resource")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult BuildBetaDetailsBuildGetToOneRelated([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[builds]")]List<string> fieldsBuilds)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(BuildResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"individualTesters\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewSubmission\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewSubmissions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appEncryptionDeclaration\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appEncryptionDeclarations\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"buildBetaDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"buildBetaDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"icons\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaBuildLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"minOsVersion\" : \"minOsVersion\",\n      \"processingState\" : \"PROCESSING\",\n      \"expired\" : true,\n      \"iconAssetToken\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"usesNonExemptEncryption\" : true,\n      \"uploadedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"version\" : \"version\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"builds\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  },\n  \"included\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BuildResponse>(exampleJson)
            : default(BuildResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="filterBuild">filter by id(s) of related &#39;build&#39;</param>
        /// <param name="filterId">filter by id(s)</param>
        /// <param name="fieldsBuildBetaDetails">the fields to include for returned resources of type buildBetaDetails</param>
        /// <param name="limit">maximum resources per page</param>
        /// <param name="include">comma-separated list of relationships to include</param>
        /// <param name="fieldsBuilds">the fields to include for returned resources of type builds</param>
        /// <response code="200">List of BuildBetaDetails</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        [HttpGet]
        [Route("/v1/buildBetaDetails")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("BuildBetaDetailsGetCollection")]
        [SwaggerResponse(statusCode: 200, type: typeof(BuildBetaDetailsResponse), description: "List of BuildBetaDetails")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        public virtual IActionResult BuildBetaDetailsGetCollection([FromQuery (Name = "filter[build]")]List<string> filterBuild, [FromQuery (Name = "filter[id]")]List<string> filterId, [FromQuery (Name = "fields[buildBetaDetails]")]List<string> fieldsBuildBetaDetails, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "include")]List<string> include, [FromQuery (Name = "fields[builds]")]List<string> fieldsBuilds)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(BuildBetaDetailsResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ {\n    \"relationships\" : {\n      \"build\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"autoNotifyEnabled\" : true\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"buildBetaDetails\"\n  }, {\n    \"relationships\" : {\n      \"build\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"autoNotifyEnabled\" : true\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"buildBetaDetails\"\n  } ],\n  \"meta\" : {\n    \"paging\" : {\n      \"total\" : 6,\n      \"limit\" : 0\n    }\n  },\n  \"links\" : {\n    \"next\" : \"next\",\n    \"self\" : \"self\",\n    \"first\" : \"first\"\n  },\n  \"included\" : [ {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"individualTesters\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewSubmission\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewSubmissions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appEncryptionDeclaration\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appEncryptionDeclarations\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"buildBetaDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"buildBetaDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"icons\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaBuildLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"minOsVersion\" : \"minOsVersion\",\n      \"processingState\" : \"PROCESSING\",\n      \"expired\" : true,\n      \"iconAssetToken\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"usesNonExemptEncryption\" : true,\n      \"uploadedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"version\" : \"version\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"builds\"\n  }, {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"individualTesters\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewSubmission\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewSubmissions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appEncryptionDeclaration\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appEncryptionDeclarations\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"buildBetaDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"buildBetaDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"icons\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaBuildLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"minOsVersion\" : \"minOsVersion\",\n      \"processingState\" : \"PROCESSING\",\n      \"expired\" : true,\n      \"iconAssetToken\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"usesNonExemptEncryption\" : true,\n      \"uploadedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"version\" : \"version\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"builds\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BuildBetaDetailsResponse>(exampleJson)
            : default(BuildBetaDetailsResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="fieldsBuildBetaDetails">the fields to include for returned resources of type buildBetaDetails</param>
        /// <param name="include">comma-separated list of relationships to include</param>
        /// <param name="fieldsBuilds">the fields to include for returned resources of type builds</param>
        /// <response code="200">Single BuildBetaDetail</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/buildBetaDetails/{id}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("BuildBetaDetailsGetInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(BuildBetaDetailResponse), description: "Single BuildBetaDetail")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult BuildBetaDetailsGetInstance([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[buildBetaDetails]")]List<string> fieldsBuildBetaDetails, [FromQuery (Name = "include")]List<string> include, [FromQuery (Name = "fields[builds]")]List<string> fieldsBuilds)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(BuildBetaDetailResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"build\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"autoNotifyEnabled\" : true\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"buildBetaDetails\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  },\n  \"included\" : [ {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"individualTesters\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewSubmission\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewSubmissions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appEncryptionDeclaration\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appEncryptionDeclarations\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"buildBetaDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"buildBetaDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"icons\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaBuildLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"minOsVersion\" : \"minOsVersion\",\n      \"processingState\" : \"PROCESSING\",\n      \"expired\" : true,\n      \"iconAssetToken\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"usesNonExemptEncryption\" : true,\n      \"uploadedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"version\" : \"version\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"builds\"\n  }, {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"individualTesters\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewSubmission\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewSubmissions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appEncryptionDeclaration\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appEncryptionDeclarations\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"buildBetaDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"buildBetaDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"icons\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaBuildLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"minOsVersion\" : \"minOsVersion\",\n      \"processingState\" : \"PROCESSING\",\n      \"expired\" : true,\n      \"iconAssetToken\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"usesNonExemptEncryption\" : true,\n      \"uploadedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"version\" : \"version\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"builds\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BuildBetaDetailResponse>(exampleJson)
            : default(BuildBetaDetailResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="buildBetaDetailUpdateRequest">BuildBetaDetail representation</param>
        /// <response code="200">Single BuildBetaDetail</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        /// <response code="409">Request entity error(s)</response>
        [HttpPatch]
        [Route("/v1/buildBetaDetails/{id}")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("BuildBetaDetailsUpdateInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(BuildBetaDetailResponse), description: "Single BuildBetaDetail")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        [SwaggerResponse(statusCode: 409, type: typeof(ErrorResponse), description: "Request entity error(s)")]
        public virtual IActionResult BuildBetaDetailsUpdateInstance([FromRoute (Name = "id")][Required]string id, [FromBody]BuildBetaDetailUpdateRequest buildBetaDetailUpdateRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(BuildBetaDetailResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"build\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"autoNotifyEnabled\" : true\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"buildBetaDetails\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  },\n  \"included\" : [ {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"individualTesters\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewSubmission\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewSubmissions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appEncryptionDeclaration\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appEncryptionDeclarations\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"buildBetaDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"buildBetaDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"icons\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaBuildLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"minOsVersion\" : \"minOsVersion\",\n      \"processingState\" : \"PROCESSING\",\n      \"expired\" : true,\n      \"iconAssetToken\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"usesNonExemptEncryption\" : true,\n      \"uploadedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"version\" : \"version\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"builds\"\n  }, {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"individualTesters\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewSubmission\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewSubmissions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appEncryptionDeclaration\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appEncryptionDeclarations\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"buildBetaDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"buildBetaDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"icons\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaBuildLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"minOsVersion\" : \"minOsVersion\",\n      \"processingState\" : \"PROCESSING\",\n      \"expired\" : true,\n      \"iconAssetToken\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"usesNonExemptEncryption\" : true,\n      \"uploadedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"version\" : \"version\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"builds\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BuildBetaDetailResponse>(exampleJson)
            : default(BuildBetaDetailResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
