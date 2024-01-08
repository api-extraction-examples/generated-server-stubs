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
    public class AccessTokensApiController : ControllerBase
    { 
        /// <summary>
        /// Delete an access token by ID.
        /// </summary>
        /// <param name="tokenId">The access token ID.</param>
        /// <response code="204">Action completed successfully.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        [HttpDelete]
        [Route("/api/v2/tokens/{tokenId}")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("DeleteToken")]
        public virtual IActionResult DeleteToken([FromRoute (Name = "tokenId")][Required]string tokenId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get a single access token by ID.
        /// </summary>
        /// <param name="tokenId">The access token ID.</param>
        /// <response code="200">Token response.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        [HttpGet]
        [Route("/api/v2/tokens/{tokenId}")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("GetToken")]
        [SwaggerResponse(statusCode: 200, type: typeof(Token), description: "Token response.")]
        public virtual IActionResult GetToken([FromRoute (Name = "tokenId")][Required]string tokenId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Token));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "{\n  \"role\" : \"writer\",\n  \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ],\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"_member\" : {\n    \"firstName\" : \"Alan\",\n    \"lastName\" : \"Turing\",\n    \"_verified\" : true,\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_pendingInvite\" : true,\n    \"_lastSeen\" : 1469326565348,\n    \"isBeta\" : true,\n    \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n    \"_lastSeenMetadata\" : {\n      \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\"\n    },\n    \"email\" : \"user@launchdarkly.com\",\n    \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ]\n  },\n  \"creationDate\" : 1443652232590,\n  \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\",\n  \"defaultApiVersion\" : 0,\n  \"token\" : \"3243\",\n  \"inlineRole\" : [ {\n    \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n    \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"effect\" : \"allow\",\n    \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"actions\" : [ \"updateOn\", \"updateOn\" ]\n  }, {\n    \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n    \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"effect\" : \"allow\",\n    \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"actions\" : [ \"updateOn\", \"updateOn\" ]\n  } ],\n  \"lastUsed\" : 1469326565348,\n  \"name\" : \"My access token\",\n  \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n  \"lastModified\" : 1469326565348,\n  \"serviceToken\" : true,\n  \"memberId\" : \"5a580a01b4ff89217bdf9dc1\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Token>(exampleJson)
            : default(Token);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Returns a list of tokens in the account.
        /// </summary>
        /// <param name="showAll">If set to true, and the authentication access token has the \&quot;Admin\&quot; role, personal access tokens for all members will be retrieved.</param>
        /// <response code="200">Tokens response.</response>
        /// <response code="401">Invalid access token.</response>
        [HttpGet]
        [Route("/api/v2/tokens")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("GetTokens")]
        [SwaggerResponse(statusCode: 200, type: typeof(Tokens), description: "Tokens response.")]
        public virtual IActionResult GetTokens([FromQuery (Name = "showAll")]bool? showAll)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Tokens));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"items\" : [ {\n    \"role\" : \"writer\",\n    \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ],\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_member\" : {\n      \"firstName\" : \"Alan\",\n      \"lastName\" : \"Turing\",\n      \"_verified\" : true,\n      \"_links\" : {\n        \"next\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        },\n        \"self\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        }\n      },\n      \"_pendingInvite\" : true,\n      \"_lastSeen\" : 1469326565348,\n      \"isBeta\" : true,\n      \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n      \"_lastSeenMetadata\" : {\n        \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\"\n      },\n      \"email\" : \"user@launchdarkly.com\",\n      \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ]\n    },\n    \"creationDate\" : 1443652232590,\n    \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\",\n    \"defaultApiVersion\" : 0,\n    \"token\" : \"3243\",\n    \"inlineRole\" : [ {\n      \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n      \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n      \"effect\" : \"allow\",\n      \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n      \"actions\" : [ \"updateOn\", \"updateOn\" ]\n    }, {\n      \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n      \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n      \"effect\" : \"allow\",\n      \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n      \"actions\" : [ \"updateOn\", \"updateOn\" ]\n    } ],\n    \"lastUsed\" : 1469326565348,\n    \"name\" : \"My access token\",\n    \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n    \"lastModified\" : 1469326565348,\n    \"serviceToken\" : true,\n    \"memberId\" : \"5a580a01b4ff89217bdf9dc1\"\n  }, {\n    \"role\" : \"writer\",\n    \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ],\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_member\" : {\n      \"firstName\" : \"Alan\",\n      \"lastName\" : \"Turing\",\n      \"_verified\" : true,\n      \"_links\" : {\n        \"next\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        },\n        \"self\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        }\n      },\n      \"_pendingInvite\" : true,\n      \"_lastSeen\" : 1469326565348,\n      \"isBeta\" : true,\n      \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n      \"_lastSeenMetadata\" : {\n        \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\"\n      },\n      \"email\" : \"user@launchdarkly.com\",\n      \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ]\n    },\n    \"creationDate\" : 1443652232590,\n    \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\",\n    \"defaultApiVersion\" : 0,\n    \"token\" : \"3243\",\n    \"inlineRole\" : [ {\n      \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n      \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n      \"effect\" : \"allow\",\n      \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n      \"actions\" : [ \"updateOn\", \"updateOn\" ]\n    }, {\n      \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n      \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n      \"effect\" : \"allow\",\n      \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n      \"actions\" : [ \"updateOn\", \"updateOn\" ]\n    } ],\n    \"lastUsed\" : 1469326565348,\n    \"name\" : \"My access token\",\n    \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n    \"lastModified\" : 1469326565348,\n    \"serviceToken\" : true,\n    \"memberId\" : \"5a580a01b4ff89217bdf9dc1\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Tokens>(exampleJson)
            : default(Tokens);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Modify an access token by ID.
        /// </summary>
        /// <param name="tokenId">The access token ID.</param>
        /// <param name="patchDelta">Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39;</param>
        /// <response code="200">Token response.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        /// <response code="409">Status conflict.</response>
        [HttpPatch]
        [Route("/api/v2/tokens/{tokenId}")]
        [Authorize(Policy = "Token")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchToken")]
        [SwaggerResponse(statusCode: 200, type: typeof(Token), description: "Token response.")]
        public virtual IActionResult PatchToken([FromRoute (Name = "tokenId")][Required]string tokenId, [FromBody]List<PatchOperation> patchDelta)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Token));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            string exampleJson = null;
            exampleJson = "{\n  \"role\" : \"writer\",\n  \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ],\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"_member\" : {\n    \"firstName\" : \"Alan\",\n    \"lastName\" : \"Turing\",\n    \"_verified\" : true,\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_pendingInvite\" : true,\n    \"_lastSeen\" : 1469326565348,\n    \"isBeta\" : true,\n    \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n    \"_lastSeenMetadata\" : {\n      \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\"\n    },\n    \"email\" : \"user@launchdarkly.com\",\n    \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ]\n  },\n  \"creationDate\" : 1443652232590,\n  \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\",\n  \"defaultApiVersion\" : 0,\n  \"token\" : \"3243\",\n  \"inlineRole\" : [ {\n    \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n    \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"effect\" : \"allow\",\n    \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"actions\" : [ \"updateOn\", \"updateOn\" ]\n  }, {\n    \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n    \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"effect\" : \"allow\",\n    \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"actions\" : [ \"updateOn\", \"updateOn\" ]\n  } ],\n  \"lastUsed\" : 1469326565348,\n  \"name\" : \"My access token\",\n  \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n  \"lastModified\" : 1469326565348,\n  \"serviceToken\" : true,\n  \"memberId\" : \"5a580a01b4ff89217bdf9dc1\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Token>(exampleJson)
            : default(Token);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Create a new token.
        /// </summary>
        /// <param name="tokenBody">Create a new access token.</param>
        /// <response code="201">Token response.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="409">Status conflict.</response>
        [HttpPost]
        [Route("/api/v2/tokens")]
        [Authorize(Policy = "Token")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PostToken")]
        [SwaggerResponse(statusCode: 201, type: typeof(Token), description: "Token response.")]
        public virtual IActionResult PostToken([FromBody]PostTokenRequest tokenBody)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(Token));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            string exampleJson = null;
            exampleJson = "{\n  \"role\" : \"writer\",\n  \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ],\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"_member\" : {\n    \"firstName\" : \"Alan\",\n    \"lastName\" : \"Turing\",\n    \"_verified\" : true,\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_pendingInvite\" : true,\n    \"_lastSeen\" : 1469326565348,\n    \"isBeta\" : true,\n    \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n    \"_lastSeenMetadata\" : {\n      \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\"\n    },\n    \"email\" : \"user@launchdarkly.com\",\n    \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ]\n  },\n  \"creationDate\" : 1443652232590,\n  \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\",\n  \"defaultApiVersion\" : 0,\n  \"token\" : \"3243\",\n  \"inlineRole\" : [ {\n    \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n    \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"effect\" : \"allow\",\n    \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"actions\" : [ \"updateOn\", \"updateOn\" ]\n  }, {\n    \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n    \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"effect\" : \"allow\",\n    \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"actions\" : [ \"updateOn\", \"updateOn\" ]\n  } ],\n  \"lastUsed\" : 1469326565348,\n  \"name\" : \"My access token\",\n  \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n  \"lastModified\" : 1469326565348,\n  \"serviceToken\" : true,\n  \"memberId\" : \"5a580a01b4ff89217bdf9dc1\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Token>(exampleJson)
            : default(Token);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Reset an access token&#39;s secret key with an optional expiry time for the old key.
        /// </summary>
        /// <param name="tokenId">The access token ID.</param>
        /// <param name="expiry">An expiration time for the old token key, expressed as a Unix epoch time in milliseconds. By default, the token will expire immediately.</param>
        /// <response code="200">Token response.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        [HttpPost]
        [Route("/api/v2/tokens/{tokenId}/reset")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("ResetToken")]
        [SwaggerResponse(statusCode: 200, type: typeof(Token), description: "Token response.")]
        public virtual IActionResult ResetToken([FromRoute (Name = "tokenId")][Required]string tokenId, [FromQuery (Name = "expiry")]long? expiry)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Token));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "{\n  \"role\" : \"writer\",\n  \"customRoleIds\" : [ \"customRoleIds\", \"customRoleIds\" ],\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"_member\" : {\n    \"firstName\" : \"Alan\",\n    \"lastName\" : \"Turing\",\n    \"_verified\" : true,\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_pendingInvite\" : true,\n    \"_lastSeen\" : 1469326565348,\n    \"isBeta\" : true,\n    \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n    \"_lastSeenMetadata\" : {\n      \"tokenId\" : \"5fd2a1ee05600316d5cb3e96\"\n    },\n    \"email\" : \"user@launchdarkly.com\",\n    \"customRoles\" : [ \"5a580a01b4ff89217bdf9dc1\", \"5a580a01b4ff89217bdf9dc1\" ]\n  },\n  \"creationDate\" : 1443652232590,\n  \"ownerId\" : \"5a580a01b4ff89217bdf9dc1\",\n  \"defaultApiVersion\" : 0,\n  \"token\" : \"3243\",\n  \"inlineRole\" : [ {\n    \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n    \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"effect\" : \"allow\",\n    \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"actions\" : [ \"updateOn\", \"updateOn\" ]\n  }, {\n    \"notActions\" : [ \"updateOn\", \"updateOn\" ],\n    \"notResources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"effect\" : \"allow\",\n    \"resources\" : [ \"proj/*:env/*:flag/my-flag\", \"proj/*:env/*:flag/my-flag\" ],\n    \"actions\" : [ \"updateOn\", \"updateOn\" ]\n  } ],\n  \"lastUsed\" : 1469326565348,\n  \"name\" : \"My access token\",\n  \"_id\" : \"5a580a01b4ff89217bdf9dc1\",\n  \"lastModified\" : 1469326565348,\n  \"serviceToken\" : true,\n  \"memberId\" : \"5a580a01b4ff89217bdf9dc1\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Token>(exampleJson)
            : default(Token);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}