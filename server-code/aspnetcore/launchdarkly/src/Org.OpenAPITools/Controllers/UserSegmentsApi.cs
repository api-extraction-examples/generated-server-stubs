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
    public class UserSegmentsApiController : ControllerBase
    { 
        /// <summary>
        /// Delete a user segment.
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userSegmentKey">The user segment&#39;s key. The key identifies the user segment in your code.</param>
        /// <response code="204">Action completed successfully.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        [HttpDelete]
        [Route("/api/v2/segments/{projectKey}/{environmentKey}/{userSegmentKey}")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("DeleteUserSegment")]
        public virtual IActionResult DeleteUserSegment([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userSegmentKey")][Required]string userSegmentKey)
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
        /// Get expiring user targets for user segment
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userSegmentKey">The user segment&#39;s key. The key identifies the user segment in your code.</param>
        /// <response code="200">User targeting expirations on user segment response.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        [HttpGet]
        [Route("/api/v2/segments/{projectKey}/{userSegmentKey}/expiring-user-targets/{environmentKey}")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("GetExpiringUserTargetsOnSegment")]
        [SwaggerResponse(statusCode: 200, type: typeof(UserTargetingExpirationForSegment), description: "User targeting expirations on user segment response.")]
        public virtual IActionResult GetExpiringUserTargetsOnSegment([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userSegmentKey")][Required]string userSegmentKey)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UserTargetingExpirationForSegment));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"_resourceId\" : {\n    \"projectKey\" : \"projectKey\",\n    \"kind\" : \"kind\",\n    \"flagKey\" : \"flagKey\",\n    \"key\" : \"key\",\n    \"environmentKey\" : \"environmentKey\"\n  },\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"targetType\" : \"targetType\",\n  \"_id\" : \"_id\",\n  \"_version\" : 0,\n  \"userKey\" : \"userKey\",\n  \"expirationDate\" : 1735689600000\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserTargetingExpirationForSegment>(exampleJson)
            : default(UserTargetingExpirationForSegment);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a single user segment by key.
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userSegmentKey">The user segment&#39;s key. The key identifies the user segment in your code.</param>
        /// <response code="200">User segment response.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        [HttpGet]
        [Route("/api/v2/segments/{projectKey}/{environmentKey}/{userSegmentKey}")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("GetUserSegment")]
        [SwaggerResponse(statusCode: 200, type: typeof(UserSegment), description: "User segment response.")]
        public virtual IActionResult GetUserSegment([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userSegmentKey")][Required]string userSegmentKey)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UserSegment));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"excluded\" : [ \"excluded\", \"excluded\" ],\n  \"_flags\" : [ {\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_site\" : {\n      \"href\" : \"/features/sort.order\",\n      \"type\" : \"text/html\"\n    },\n    \"name\" : \"name\",\n    \"key\" : \"key\"\n  }, {\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_site\" : {\n      \"href\" : \"/features/sort.order\",\n      \"type\" : \"text/html\"\n    },\n    \"name\" : \"name\",\n    \"key\" : \"key\"\n  } ],\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"name\" : \"Beta Testers\",\n  \"description\" : \"Users in this segment can access beta features.\",\n  \"rules\" : [ {\n    \"clauses\" : [ {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    }, {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    } ],\n    \"weight\" : 0,\n    \"bucketBy\" : \"bucketBy\"\n  }, {\n    \"clauses\" : [ {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    }, {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    } ],\n    \"weight\" : 0,\n    \"bucketBy\" : \"bucketBy\"\n  } ],\n  \"creationDate\" : 1443652232590,\n  \"unbounded\" : false,\n  \"included\" : [ \"included\", \"included\" ],\n  \"version\" : 6,\n  \"key\" : \"beta-testers\",\n  \"tags\" : [ \"dev\", \"ops\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserSegment>(exampleJson)
            : default(UserSegment);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a list of all user segments in the given project.
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="tag">Filter by tag. A tag can be used to group flags across projects.</param>
        /// <response code="200">Segments response.</response>
        /// <response code="401">Invalid access token.</response>
        [HttpGet]
        [Route("/api/v2/segments/{projectKey}/{environmentKey}")]
        [Authorize(Policy = "Token")]
        [ValidateModelState]
        [SwaggerOperation("GetUserSegments")]
        [SwaggerResponse(statusCode: 200, type: typeof(UserSegments), description: "Segments response.")]
        public virtual IActionResult GetUserSegments([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromQuery (Name = "tag")]string tag)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UserSegments));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "{\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"items\" : [ {\n    \"excluded\" : [ \"excluded\", \"excluded\" ],\n    \"_flags\" : [ {\n      \"_links\" : {\n        \"next\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        },\n        \"self\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        }\n      },\n      \"_site\" : {\n        \"href\" : \"/features/sort.order\",\n        \"type\" : \"text/html\"\n      },\n      \"name\" : \"name\",\n      \"key\" : \"key\"\n    }, {\n      \"_links\" : {\n        \"next\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        },\n        \"self\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        }\n      },\n      \"_site\" : {\n        \"href\" : \"/features/sort.order\",\n        \"type\" : \"text/html\"\n      },\n      \"name\" : \"name\",\n      \"key\" : \"key\"\n    } ],\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"name\" : \"Beta Testers\",\n    \"description\" : \"Users in this segment can access beta features.\",\n    \"rules\" : [ {\n      \"clauses\" : [ {\n        \"op\" : \"in\",\n        \"negate\" : true,\n        \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n        \"_id\" : \"_id\",\n        \"attribute\" : \"groups\"\n      }, {\n        \"op\" : \"in\",\n        \"negate\" : true,\n        \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n        \"_id\" : \"_id\",\n        \"attribute\" : \"groups\"\n      } ],\n      \"weight\" : 0,\n      \"bucketBy\" : \"bucketBy\"\n    }, {\n      \"clauses\" : [ {\n        \"op\" : \"in\",\n        \"negate\" : true,\n        \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n        \"_id\" : \"_id\",\n        \"attribute\" : \"groups\"\n      }, {\n        \"op\" : \"in\",\n        \"negate\" : true,\n        \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n        \"_id\" : \"_id\",\n        \"attribute\" : \"groups\"\n      } ],\n      \"weight\" : 0,\n      \"bucketBy\" : \"bucketBy\"\n    } ],\n    \"creationDate\" : 1443652232590,\n    \"unbounded\" : false,\n    \"included\" : [ \"included\", \"included\" ],\n    \"version\" : 6,\n    \"key\" : \"beta-testers\",\n    \"tags\" : [ \"dev\", \"ops\" ]\n  }, {\n    \"excluded\" : [ \"excluded\", \"excluded\" ],\n    \"_flags\" : [ {\n      \"_links\" : {\n        \"next\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        },\n        \"self\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        }\n      },\n      \"_site\" : {\n        \"href\" : \"/features/sort.order\",\n        \"type\" : \"text/html\"\n      },\n      \"name\" : \"name\",\n      \"key\" : \"key\"\n    }, {\n      \"_links\" : {\n        \"next\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        },\n        \"self\" : {\n          \"href\" : \"/api/v2/endpoint\",\n          \"type\" : \"application/json\"\n        }\n      },\n      \"_site\" : {\n        \"href\" : \"/features/sort.order\",\n        \"type\" : \"text/html\"\n      },\n      \"name\" : \"name\",\n      \"key\" : \"key\"\n    } ],\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"name\" : \"Beta Testers\",\n    \"description\" : \"Users in this segment can access beta features.\",\n    \"rules\" : [ {\n      \"clauses\" : [ {\n        \"op\" : \"in\",\n        \"negate\" : true,\n        \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n        \"_id\" : \"_id\",\n        \"attribute\" : \"groups\"\n      }, {\n        \"op\" : \"in\",\n        \"negate\" : true,\n        \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n        \"_id\" : \"_id\",\n        \"attribute\" : \"groups\"\n      } ],\n      \"weight\" : 0,\n      \"bucketBy\" : \"bucketBy\"\n    }, {\n      \"clauses\" : [ {\n        \"op\" : \"in\",\n        \"negate\" : true,\n        \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n        \"_id\" : \"_id\",\n        \"attribute\" : \"groups\"\n      }, {\n        \"op\" : \"in\",\n        \"negate\" : true,\n        \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n        \"_id\" : \"_id\",\n        \"attribute\" : \"groups\"\n      } ],\n      \"weight\" : 0,\n      \"bucketBy\" : \"bucketBy\"\n    } ],\n    \"creationDate\" : 1443652232590,\n    \"unbounded\" : false,\n    \"included\" : [ \"included\", \"included\" ],\n    \"version\" : 6,\n    \"key\" : \"beta-testers\",\n    \"tags\" : [ \"dev\", \"ops\" ]\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserSegments>(exampleJson)
            : default(UserSegments);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update, add, or delete expiring user targets on user segment
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userSegmentKey">The user segment&#39;s key. The key identifies the user segment in your code.</param>
        /// <param name="semanticPatchWithComment">Requires a Semantic Patch representation of the desired changes to the resource. &#39;https://apidocs.launchdarkly.com/reference#updates-via-semantic-patches&#39;. The addition of comments is also supported.</param>
        /// <response code="200">User targeting expirations on user segment response.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        /// <response code="409">Status conflict.</response>
        [HttpPatch]
        [Route("/api/v2/segments/{projectKey}/{userSegmentKey}/expiring-user-targets/{environmentKey}")]
        [Authorize(Policy = "Token")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchExpiringUserTargetsOnSegment")]
        [SwaggerResponse(statusCode: 200, type: typeof(UserTargetingExpirationForSegment), description: "User targeting expirations on user segment response.")]
        public virtual IActionResult PatchExpiringUserTargetsOnSegment([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userSegmentKey")][Required]string userSegmentKey, [FromBody]List<SemanticPatchOperation> semanticPatchWithComment)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UserTargetingExpirationForSegment));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            string exampleJson = null;
            exampleJson = "{\n  \"_resourceId\" : {\n    \"projectKey\" : \"projectKey\",\n    \"kind\" : \"kind\",\n    \"flagKey\" : \"flagKey\",\n    \"key\" : \"key\",\n    \"environmentKey\" : \"environmentKey\"\n  },\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"targetType\" : \"targetType\",\n  \"_id\" : \"_id\",\n  \"_version\" : 0,\n  \"userKey\" : \"userKey\",\n  \"expirationDate\" : 1735689600000\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserTargetingExpirationForSegment>(exampleJson)
            : default(UserTargetingExpirationForSegment);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Perform a partial update to a user segment.
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userSegmentKey">The user segment&#39;s key. The key identifies the user segment in your code.</param>
        /// <param name="patchOnly">Requires a JSON Patch representation of the desired changes to the project. &#39;http://jsonpatch.com/&#39; Feature flag patches also support JSON Merge Patch format. &#39;https://tools.ietf.org/html/rfc7386&#39; The addition of comments is also supported.</param>
        /// <response code="200">User segment response.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="404">Invalid resource specifier.</response>
        /// <response code="409">Status conflict.</response>
        [HttpPatch]
        [Route("/api/v2/segments/{projectKey}/{environmentKey}/{userSegmentKey}")]
        [Authorize(Policy = "Token")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchUserSegment")]
        [SwaggerResponse(statusCode: 200, type: typeof(UserSegment), description: "User segment response.")]
        public virtual IActionResult PatchUserSegment([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userSegmentKey")][Required]string userSegmentKey, [FromBody]List<PatchOperation> patchOnly)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(UserSegment));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            string exampleJson = null;
            exampleJson = "{\n  \"excluded\" : [ \"excluded\", \"excluded\" ],\n  \"_flags\" : [ {\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_site\" : {\n      \"href\" : \"/features/sort.order\",\n      \"type\" : \"text/html\"\n    },\n    \"name\" : \"name\",\n    \"key\" : \"key\"\n  }, {\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_site\" : {\n      \"href\" : \"/features/sort.order\",\n      \"type\" : \"text/html\"\n    },\n    \"name\" : \"name\",\n    \"key\" : \"key\"\n  } ],\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"name\" : \"Beta Testers\",\n  \"description\" : \"Users in this segment can access beta features.\",\n  \"rules\" : [ {\n    \"clauses\" : [ {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    }, {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    } ],\n    \"weight\" : 0,\n    \"bucketBy\" : \"bucketBy\"\n  }, {\n    \"clauses\" : [ {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    }, {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    } ],\n    \"weight\" : 0,\n    \"bucketBy\" : \"bucketBy\"\n  } ],\n  \"creationDate\" : 1443652232590,\n  \"unbounded\" : false,\n  \"included\" : [ \"included\", \"included\" ],\n  \"version\" : 6,\n  \"key\" : \"beta-testers\",\n  \"tags\" : [ \"dev\", \"ops\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserSegment>(exampleJson)
            : default(UserSegment);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Creates a new user segment.
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userSegmentBody">Create a new user segment.</param>
        /// <response code="201">User segment response.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        /// <response code="409">Status conflict.</response>
        [HttpPost]
        [Route("/api/v2/segments/{projectKey}/{environmentKey}")]
        [Authorize(Policy = "Token")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PostUserSegment")]
        [SwaggerResponse(statusCode: 201, type: typeof(UserSegment), description: "User segment response.")]
        public virtual IActionResult PostUserSegment([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromBody]PostUserSegmentRequest userSegmentBody)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(UserSegment));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            string exampleJson = null;
            exampleJson = "{\n  \"excluded\" : [ \"excluded\", \"excluded\" ],\n  \"_flags\" : [ {\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_site\" : {\n      \"href\" : \"/features/sort.order\",\n      \"type\" : \"text/html\"\n    },\n    \"name\" : \"name\",\n    \"key\" : \"key\"\n  }, {\n    \"_links\" : {\n      \"next\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      },\n      \"self\" : {\n        \"href\" : \"/api/v2/endpoint\",\n        \"type\" : \"application/json\"\n      }\n    },\n    \"_site\" : {\n      \"href\" : \"/features/sort.order\",\n      \"type\" : \"text/html\"\n    },\n    \"name\" : \"name\",\n    \"key\" : \"key\"\n  } ],\n  \"_links\" : {\n    \"next\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    },\n    \"self\" : {\n      \"href\" : \"/api/v2/endpoint\",\n      \"type\" : \"application/json\"\n    }\n  },\n  \"name\" : \"Beta Testers\",\n  \"description\" : \"Users in this segment can access beta features.\",\n  \"rules\" : [ {\n    \"clauses\" : [ {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    }, {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    } ],\n    \"weight\" : 0,\n    \"bucketBy\" : \"bucketBy\"\n  }, {\n    \"clauses\" : [ {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    }, {\n      \"op\" : \"in\",\n      \"negate\" : true,\n      \"values\" : [ \"Top Customers\", \"Top Customers\" ],\n      \"_id\" : \"_id\",\n      \"attribute\" : \"groups\"\n    } ],\n    \"weight\" : 0,\n    \"bucketBy\" : \"bucketBy\"\n  } ],\n  \"creationDate\" : 1443652232590,\n  \"unbounded\" : false,\n  \"included\" : [ \"included\", \"included\" ],\n  \"version\" : 6,\n  \"key\" : \"beta-testers\",\n  \"tags\" : [ \"dev\", \"ops\" ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<UserSegment>(exampleJson)
            : default(UserSegment);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update targets included or excluded in a big segment
        /// </summary>
        /// <param name="projectKey">The project key, used to tie the flags together under one project so they can be managed together.</param>
        /// <param name="environmentKey">The environment key, used to tie together flag configuration and users under one environment so they can be managed together.</param>
        /// <param name="userSegmentKey">The user segment&#39;s key. The key identifies the user segment in your code.</param>
        /// <param name="bigSegmentTargetsBody">Add or remove user targets to the included or excluded lists on a big segment. Contact your account manager for early access to this feature.</param>
        /// <response code="204">Action completed successfully.</response>
        /// <response code="400">Invalid request body.</response>
        /// <response code="401">Invalid access token.</response>
        [HttpPost]
        [Route("/api/v2/segments/{projectKey}/{environmentKey}/{userSegmentKey}/users")]
        [Authorize(Policy = "Token")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateBigSegmentTargets")]
        public virtual IActionResult UpdateBigSegmentTargets([FromRoute (Name = "projectKey")][Required]string projectKey, [FromRoute (Name = "environmentKey")][Required]string environmentKey, [FromRoute (Name = "userSegmentKey")][Required]string userSegmentKey, [FromBody]UpdateBigSegmentTargetsRequest bigSegmentTargetsBody)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);

            throw new NotImplementedException();
        }
    }
}
