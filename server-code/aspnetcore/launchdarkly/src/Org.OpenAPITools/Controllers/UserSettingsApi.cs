/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: support@launchdarkly.com
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
    public class UserSettingsApiController : ControllerBase
    { 
        /// <summary>
        /// Get expiring dates on flags for user
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userKey">The user&#39;s key.</param>
        /// <response code="200">User targets of the requested feature flag.</response>
        /// <response code="401">Invalid access token.</response>
        [HttpGet]
        [Route("/api/v2/users/{projectKey}/{userKey}/expiring-user-targets/{environmentKey}")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("GetExpiringUserTargetsForUser")]
        [SwaggerResponse(statusCode: 200, type: typeof(UserTargetingExpirationOnFlagsForUser), description: "User targets of the requested feature flag.")]
        public virtual IActionResult GetExpiringUserTargetsForUser([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userKey")][Required]string userKey)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UserTargetingExpirationOnFlagsForUser));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"items\" : [ {\n    \"_resourceId\" : {\n      \"projectKey\" : \"projectKey\",\n      \"kind\" : \"kind\",\n      \"flagKey\" : \"flagKey\",\n      \"key\" : \"key\",\n      \"environmentKey\" : \"environmentKey\"\n    },\n    \"variationId\" : \"variationId\",\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_id\" : \"_id\",\n    \"_version\" : 0,\n    \"userKey\" : \"userKey\",\n    \"expirationDate\" : 1735689600000\n  }, {\n    \"_resourceId\" : {\n      \"projectKey\" : \"projectKey\",\n      \"kind\" : \"kind\",\n      \"flagKey\" : \"flagKey\",\n      \"key\" : \"key\",\n      \"environmentKey\" : \"environmentKey\"\n    },\n    \"variationId\" : \"variationId\",\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_id\" : \"_id\",\n    \"_version\" : 0,\n    \"userKey\" : \"userKey\",\n    \"expirationDate\" : 1735689600000\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserTargetingExpirationOnFlagsForUser>(exampleJson)
            : default(UserTargetingExpirationOnFlagsForUser);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Fetch a single flag setting for a user by key.
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userKey">The user&#39;s key.</param>
        /// <param name="featureFlagKey">The feature flag&#39;s key. The key identifies the flag in your code.</param>
        /// <response code="200">User flag setting response.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        [HttpGet]
        [Route("/api/v2/users/{projectKey}/{environmentKey}/{userKey}/flags/{featureFlagKey}")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("GetUserFlagSetting")]
        [SwaggerResponse(statusCode: 200, type: typeof(UserFlagSetting), description: "User flag setting response.")]
        public virtual IActionResult GetUserFlagSetting([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userKey")][Required]string userKey, [FromRoute (Name = "featureFlagKey")][Required]string featureFlagKey)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UserFlagSetting));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"_value\" : true,\n  \"setting\" : true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserFlagSetting>(exampleJson)
            : default(UserFlagSetting);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Fetch a single flag setting for a user by key.
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userKey">The user&#39;s key.</param>
        /// <response code="200">User flags settings response.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        [HttpGet]
        [Route("/api/v2/users/{projectKey}/{environmentKey}/{userKey}/flags")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("GetUserFlagSettings")]
        [SwaggerResponse(statusCode: 200, type: typeof(UserFlagSettings), description: "User flags settings response.")]
        public virtual IActionResult GetUserFlagSettings([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userKey")][Required]string userKey)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UserFlagSettings));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"items\" : {\n    \"alternate.page\" : {\n      \"_links\" : {\n        \"self\" : {\n          \"href\" : \"/api/v2/users/lacuna/production/Abbie_Braun/flags/alternate.page\",\n          \"type\" : \"application/json\"\n        }\n      },\n      \"_value\" : \"false,\"\n    },\n    \"sort.order\" : {\n      \"_links\" : {\n        \"_value\" : true,\n        \"self\" : {\n          \"href\" : \"/api/v2/users/lacuna/production/Abbie_Braun/flags/sort.order\",\n          \"type\" : \"application/json\"\n        }\n      }\n    }\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserFlagSettings>(exampleJson)
            : default(UserFlagSettings);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update, add, or delete expiring user targets for a single user on all flags
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userKey">The user&#39;s key.</param>
        /// <param name="semanticPatchWithComment">Requires a Semantic Patch representation of the desired changes to the resource. &#39;https://apidocs.launchdarkly.com/reference#updates-via-semantic-patches&#39;. The addition of comments is also supported.</param>
        /// <response code="200">User Targeting expiration for single user on all flags response.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        /// <response code="409">Status conflict.</response>
        [HttpPatch]
        [Route("/api/v2/users/{projectKey}/{userKey}/expiring-user-targets/{environmentKey}")]
        [Authorize(Policy = "Token")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchExpiringUserTargetsForFlags")]
        [SwaggerResponse(statusCode: 200, type: typeof(UserTargetingExpirationOnFlagsForUser), description: "User Targeting expiration for single user on all flags response.")]
        public virtual IActionResult PatchExpiringUserTargetsForFlags([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userKey")][Required]string userKey, [FromBody]List<SemanticPatchOperation> semanticPatchWithComment)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UserTargetingExpirationOnFlagsForUser));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"items\" : [ {\n    \"_resourceId\" : {\n      \"projectKey\" : \"projectKey\",\n      \"kind\" : \"kind\",\n      \"flagKey\" : \"flagKey\",\n      \"key\" : \"key\",\n      \"environmentKey\" : \"environmentKey\"\n    },\n    \"variationId\" : \"variationId\",\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_id\" : \"_id\",\n    \"_version\" : 0,\n    \"userKey\" : \"userKey\",\n    \"expirationDate\" : 1735689600000\n  }, {\n    \"_resourceId\" : {\n      \"projectKey\" : \"projectKey\",\n      \"kind\" : \"kind\",\n      \"flagKey\" : \"flagKey\",\n      \"key\" : \"key\",\n      \"environmentKey\" : \"environmentKey\"\n    },\n    \"variationId\" : \"variationId\",\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_id\" : \"_id\",\n    \"_version\" : 0,\n    \"userKey\" : \"userKey\",\n    \"expirationDate\" : 1735689600000\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserTargetingExpirationOnFlagsForUser>(exampleJson)
            : default(UserTargetingExpirationOnFlagsForUser);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Specifically enable or disable a feature flag for a user based on their key.
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userKey">The user&#39;s key.</param>
        /// <param name="featureFlagKey">The feature flag&#39;s key. The key identifies the flag in your code.</param>
        /// <param name="userSettingsBody"></param>
        /// <response code="204">Action completed successfully.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        [HttpPut]
        [Route("/api/v2/users/{projectKey}/{environmentKey}/{userKey}/flags/{featureFlagKey}")]
        [Authorize(Policy = "Token")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PutFlagSetting")]
        public virtual IActionResult PutFlagSetting([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userKey")][Required]string userKey, [FromRoute (Name = "featureFlagKey")][Required]string featureFlagKey, [FromBody]PutFlagSettingRequest userSettingsBody)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            throw new NotImplementedException();
        }
    }
}
