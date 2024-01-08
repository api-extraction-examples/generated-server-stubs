/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
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
    public class StatusApiController : ControllerBase
    { 
        /// <summary>
        /// Bulk create statuses
        /// </summary>
        /// <remarks>Creates statuses for a global or project scope.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)</remarks>
        /// <param name="statusCreateRequest">Details of the statuses being created and their scope.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation.</response>
        [HttpPost]
        [Route("/rest/api/3/statuses")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateStatuses")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<JiraStatus>), description: "Returned if the request is successful.")]
        public virtual IActionResult CreateStatuses([FromBody]StatusCreateRequest statusCreateRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<JiraStatus>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "[ {\n  \"scope\" : {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"type\" : \"PROJECT\"\n  },\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"usages\" : [ {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n  }, {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n  } ],\n  \"statusCategory\" : \"TODO\"\n}, {\n  \"scope\" : {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"type\" : \"PROJECT\"\n  },\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"usages\" : [ {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n  }, {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n  } ],\n  \"statusCategory\" : \"TODO\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<JiraStatus>>(exampleJson)
            : default(List<JiraStatus>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Bulk delete Statuses
        /// </summary>
        /// <remarks>Deletes statuses by ID.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)</remarks>
        /// <param name="id">The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id&#x3D;10000&amp;id&#x3D;10001.  Min items &#x60;1&#x60;, Max items &#x60;50&#x60;</param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation.</response>
        [HttpDelete]
        [Route("/rest/api/3/statuses")]
        [ValidateModelState]
        [SwaggerOperation("DeleteStatusesById")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult DeleteStatusesById([FromQuery (Name = "id")]List<string> id)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Bulk get statuses
        /// </summary>
        /// <remarks>Returns a list of the statuses specified by one or more status IDs.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)</remarks>
        /// <param name="expand">Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;usages&#x60; Returns the project and issue types that use the status in their workflow.</param>
        /// <param name="id">The list of status IDs. To include multiple IDs, provide an ampersand-separated list. For example, id&#x3D;10000&amp;id&#x3D;10001.  Min items &#x60;1&#x60;, Max items &#x60;50&#x60;</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation.</response>
        [HttpGet]
        [Route("/rest/api/3/statuses")]
        [ValidateModelState]
        [SwaggerOperation("GetStatusesById")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<JiraStatus>), description: "Returned if the request is successful.")]
        public virtual IActionResult GetStatusesById([FromQuery (Name = "expand")]string expand, [FromQuery (Name = "id")]List<string> id)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<JiraStatus>));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "[ {\n  \"scope\" : {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"type\" : \"PROJECT\"\n  },\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"usages\" : [ {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n  }, {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n  } ],\n  \"statusCategory\" : \"TODO\"\n}, {\n  \"scope\" : {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"type\" : \"PROJECT\"\n  },\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"id\" : \"id\",\n  \"usages\" : [ {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n  }, {\n    \"project\" : {\n      \"id\" : \"id\"\n    },\n    \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n  } ],\n  \"statusCategory\" : \"TODO\"\n} ]";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<JiraStatus>>(exampleJson)
            : default(List<JiraStatus>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Search statuses paginated
        /// </summary>
        /// <remarks>Returns a [paginated](https://developer.atlassian.com/cloud/jira/platform/rest/v3/intro/#pagination) list of statuses that match a search on name or project.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)</remarks>
        /// <param name="expand">Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;usages&#x60; Returns the project and issue types that use the status in their workflow.</param>
        /// <param name="projectId">The project the status is part of or null for global statuses.</param>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <param name="searchString">Term to match status names against or null to search for all statuses in the search scope.</param>
        /// <param name="statusCategory">Category of the status to filter by. The supported values are: &#x60;TODO&#x60;, &#x60;IN_PROGRESS&#x60;, and &#x60;DONE&#x60;.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation.</response>
        [HttpGet]
        [Route("/rest/api/3/statuses/search")]
        [ValidateModelState]
        [SwaggerOperation("Search")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageOfStatuses), description: "Returned if the request is successful.")]
        public virtual IActionResult Search([FromQuery (Name = "expand")]string expand, [FromQuery (Name = "projectId")]string projectId, [FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults, [FromQuery (Name = "searchString")] [MaxLength(255)]string searchString, [FromQuery (Name = "statusCategory")]string statusCategory)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageOfStatuses));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"nextPage\",\n  \"values\" : [ {\n    \"scope\" : {\n      \"project\" : {\n        \"id\" : \"id\"\n      },\n      \"type\" : \"PROJECT\"\n    },\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"usages\" : [ {\n      \"project\" : {\n        \"id\" : \"id\"\n      },\n      \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n    }, {\n      \"project\" : {\n        \"id\" : \"id\"\n      },\n      \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n    } ],\n    \"statusCategory\" : \"TODO\"\n  }, {\n    \"scope\" : {\n      \"project\" : {\n        \"id\" : \"id\"\n      },\n      \"type\" : \"PROJECT\"\n    },\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\",\n    \"usages\" : [ {\n      \"project\" : {\n        \"id\" : \"id\"\n      },\n      \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n    }, {\n      \"project\" : {\n        \"id\" : \"id\"\n      },\n      \"issueTypes\" : [ \"issueTypes\", \"issueTypes\" ]\n    } ],\n    \"statusCategory\" : \"TODO\"\n  } ],\n  \"self\" : \"self\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageOfStatuses>(exampleJson)
            : default(PageOfStatuses);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Bulk update statuses
        /// </summary>
        /// <remarks>Updates statuses by ID.  **[Permissions](#permissions) required:**   *  *Administer projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)  *  *Administer Jira* [project permission.](https://confluence.atlassian.com/x/yodKLg)</remarks>
        /// <param name="statusUpdateRequest">The list of statuses that will be updated.</param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing, or the caller doesn&#39;t have permissions to perform the operation.</response>
        [HttpPut]
        [Route("/rest/api/3/statuses")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateStatuses")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult UpdateStatuses([FromBody]StatusUpdateRequest statusUpdateRequest)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
