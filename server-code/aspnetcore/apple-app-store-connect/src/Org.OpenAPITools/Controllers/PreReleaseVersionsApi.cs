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
    public class PreReleaseVersionsApiController : ControllerBase
    { 
        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="fieldsApps">the fields to include for returned resources of type apps</param>
        /// <response code="200">Related resource</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/preReleaseVersions/{id}/app")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("PreReleaseVersionsAppGetToOneRelated")]
        [SwaggerResponse(statusCode: 200, type: typeof(AppResponse), description: "Related resource")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult PreReleaseVersionsAppGetToOneRelated([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[apps]")]List<string> fieldsApps)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(AppResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"betaGroups\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaGroups\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaGroups\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"endUserLicenseAgreement\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"endUserLicenseAgreements\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appInfos\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"appInfos\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"appInfos\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersions\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"inAppPurchases\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"inAppPurchases\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"inAppPurchases\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaLicenseAgreement\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaLicenseAgreements\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"gameCenterEnabledVersions\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"gameCenterEnabledVersions\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"gameCenterEnabledVersions\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersions\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"builds\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preOrder\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appPreOrders\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"availableTerritories\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"territories\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"territories\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"prices\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"appPrices\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"appPrices\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"bundleId\" : \"bundleId\",\n      \"name\" : \"name\",\n      \"isOrEverWasMadeForKids\" : true,\n      \"sku\" : \"sku\",\n      \"availableInNewTerritories\" : true,\n      \"contentRightsDeclaration\" : \"DOES_NOT_USE_THIRD_PARTY_CONTENT\",\n      \"primaryLocale\" : \"primaryLocale\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"apps\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  },\n  \"included\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<AppResponse>(exampleJson)
            : default(AppResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="fieldsBuilds">the fields to include for returned resources of type builds</param>
        /// <param name="limit">maximum resources per page</param>
        /// <response code="200">List of related resources</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/preReleaseVersions/{id}/builds")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("PreReleaseVersionsBuildsGetToManyRelated")]
        [SwaggerResponse(statusCode: 200, type: typeof(BuildsResponse), description: "List of related resources")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult PreReleaseVersionsBuildsGetToManyRelated([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[builds]")]List<string> fieldsBuilds, [FromQuery (Name = "limit")]int? limit)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(BuildsResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"individualTesters\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewSubmission\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewSubmissions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appEncryptionDeclaration\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appEncryptionDeclarations\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"buildBetaDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"buildBetaDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"icons\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaBuildLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"minOsVersion\" : \"minOsVersion\",\n      \"processingState\" : \"PROCESSING\",\n      \"expired\" : true,\n      \"iconAssetToken\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"usesNonExemptEncryption\" : true,\n      \"uploadedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"version\" : \"version\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"builds\"\n  }, {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"individualTesters\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaTesters\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"preReleaseVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"preReleaseVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaAppReviewSubmission\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"betaAppReviewSubmissions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appStoreVersion\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appStoreVersions\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"appEncryptionDeclaration\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"appEncryptionDeclarations\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"buildBetaDetail\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"buildBetaDetails\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"icons\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"buildIcons\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"betaBuildLocalizations\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"betaBuildLocalizations\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"minOsVersion\" : \"minOsVersion\",\n      \"processingState\" : \"PROCESSING\",\n      \"expired\" : true,\n      \"iconAssetToken\" : {\n        \"width\" : 1,\n        \"height\" : 6,\n        \"templateUrl\" : \"templateUrl\"\n      },\n      \"usesNonExemptEncryption\" : true,\n      \"uploadedDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"version\" : \"version\",\n      \"expirationDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"builds\"\n  } ],\n  \"meta\" : {\n    \"paging\" : {\n      \"total\" : 6,\n      \"limit\" : 0\n    }\n  },\n  \"links\" : {\n    \"next\" : \"next\",\n    \"self\" : \"self\",\n    \"first\" : \"first\"\n  },\n  \"included\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BuildsResponse>(exampleJson)
            : default(BuildsResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="filterBuildsExpired">filter by attribute &#39;builds.expired&#39;</param>
        /// <param name="filterBuildsProcessingState">filter by attribute &#39;builds.processingState&#39;</param>
        /// <param name="filterPlatform">filter by attribute &#39;platform&#39;</param>
        /// <param name="filterVersion">filter by attribute &#39;version&#39;</param>
        /// <param name="filterApp">filter by id(s) of related &#39;app&#39;</param>
        /// <param name="filterBuilds">filter by id(s) of related &#39;builds&#39;</param>
        /// <param name="sort">comma-separated list of sort expressions; resources will be sorted as specified</param>
        /// <param name="fieldsPreReleaseVersions">the fields to include for returned resources of type preReleaseVersions</param>
        /// <param name="limit">maximum resources per page</param>
        /// <param name="include">comma-separated list of relationships to include</param>
        /// <param name="fieldsBuilds">the fields to include for returned resources of type builds</param>
        /// <param name="fieldsApps">the fields to include for returned resources of type apps</param>
        /// <param name="limitBuilds">maximum number of related builds returned (when they are included)</param>
        /// <response code="200">List of PreReleaseVersions</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        [HttpGet]
        [Route("/v1/preReleaseVersions")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("PreReleaseVersionsGetCollection")]
        [SwaggerResponse(statusCode: 200, type: typeof(PreReleaseVersionsResponse), description: "List of PreReleaseVersions")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        public virtual IActionResult PreReleaseVersionsGetCollection([FromQuery (Name = "filter[builds.expired]")]List<string> filterBuildsExpired, [FromQuery (Name = "filter[builds.processingState]")]List<string> filterBuildsProcessingState, [FromQuery (Name = "filter[platform]")]List<string> filterPlatform, [FromQuery (Name = "filter[version]")]List<string> filterVersion, [FromQuery (Name = "filter[app]")]List<string> filterApp, [FromQuery (Name = "filter[builds]")]List<string> filterBuilds, [FromQuery (Name = "sort")]List<string> sort, [FromQuery (Name = "fields[preReleaseVersions]")]List<string> fieldsPreReleaseVersions, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "include")]List<string> include, [FromQuery (Name = "fields[builds]")]List<string> fieldsBuilds, [FromQuery (Name = "fields[apps]")]List<string> fieldsApps, [FromQuery (Name = "limit[builds]")]int? limitBuilds)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PreReleaseVersionsResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"builds\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"version\" : \"version\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"preReleaseVersions\"\n  }, {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"builds\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"version\" : \"version\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"preReleaseVersions\"\n  } ],\n  \"meta\" : {\n    \"paging\" : {\n      \"total\" : 6,\n      \"limit\" : 0\n    }\n  },\n  \"links\" : {\n    \"next\" : \"next\",\n    \"self\" : \"self\",\n    \"first\" : \"first\"\n  },\n  \"included\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PreReleaseVersionsResponse>(exampleJson)
            : default(PreReleaseVersionsResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// 
        /// </summary>
        /// <param name="id">the id of the requested resource</param>
        /// <param name="fieldsPreReleaseVersions">the fields to include for returned resources of type preReleaseVersions</param>
        /// <param name="include">comma-separated list of relationships to include</param>
        /// <param name="fieldsBuilds">the fields to include for returned resources of type builds</param>
        /// <param name="fieldsApps">the fields to include for returned resources of type apps</param>
        /// <param name="limitBuilds">maximum number of related builds returned (when they are included)</param>
        /// <response code="200">Single PrereleaseVersion</response>
        /// <response code="400">Parameter error(s)</response>
        /// <response code="403">Forbidden error</response>
        /// <response code="404">Not found error</response>
        [HttpGet]
        [Route("/v1/preReleaseVersions/{id}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("PreReleaseVersionsGetInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(PrereleaseVersionResponse), description: "Single PrereleaseVersion")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "Parameter error(s)")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "Forbidden error")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Not found error")]
        public virtual IActionResult PreReleaseVersionsGetInstance([FromRoute (Name = "id")][Required]string id, [FromQuery (Name = "fields[preReleaseVersions]")]List<string> fieldsPreReleaseVersions, [FromQuery (Name = "include")]List<string> include, [FromQuery (Name = "fields[builds]")]List<string> fieldsBuilds, [FromQuery (Name = "fields[apps]")]List<string> fieldsApps, [FromQuery (Name = "limit[builds]")]int? limitBuilds)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PrereleaseVersionResponse));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : {\n    \"relationships\" : {\n      \"app\" : {\n        \"data\" : {\n          \"id\" : \"id\",\n          \"type\" : \"apps\"\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      },\n      \"builds\" : {\n        \"data\" : [ {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        }, {\n          \"id\" : \"id\",\n          \"type\" : \"builds\"\n        } ],\n        \"meta\" : {\n          \"paging\" : {\n            \"total\" : 6,\n            \"limit\" : 0\n          }\n        },\n        \"links\" : {\n          \"related\" : \"related\",\n          \"self\" : \"self\"\n        }\n      }\n    },\n    \"attributes\" : {\n      \"version\" : \"version\"\n    },\n    \"links\" : {\n      \"self\" : \"self\"\n    },\n    \"id\" : \"id\",\n    \"type\" : \"preReleaseVersions\"\n  },\n  \"links\" : {\n    \"self\" : \"self\"\n  },\n  \"included\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PrereleaseVersionResponse>(exampleJson)
            : default(PrereleaseVersionResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
