/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    public class ActivityLogApiController : ControllerBase
    { 
        /// <summary>
        /// Gets activity log entries.
        /// </summary>
        /// <param name="startIndex">Optional. The record index to start at. All items with a lower index will be dropped from the results.</param>
        /// <param name="limit">Optional. The maximum number of records to return.</param>
        /// <param name="minDate">Optional. The minimum date. Format &#x3D; ISO.</param>
        /// <param name="hasUserId">Optional. Filter log entries if it has user id, or not.</param>
        /// <response code="200">Activity log returned.</response>
        /// <response code="401">Unauthorized</response>
        /// <response code="403">Forbidden</response>
        [HttpGet]
        [Route("/System/ActivityLog/Entries")]
        [Authorize(Policy = "CustomAuthentication")]
        [ValidateModelState]
        [SwaggerOperation("GetLogEntries")]
        [SwaggerResponse(statusCode: 200, type: typeof(ActivityLogEntryQueryResult), description: "Activity log returned.")]
        public virtual IActionResult GetLogEntries([FromQuery (Name = "startIndex")]int? startIndex, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "minDate")]DateTime? minDate, [FromQuery (Name = "hasUserId")]bool? hasUserId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ActivityLogEntryQueryResult));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "{\n  \"TotalRecordCount\" : 1,\n  \"StartIndex\" : 6,\n  \"Items\" : [ {\n    \"Type\" : \"Type\",\n    \"UserId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"Overview\" : \"Overview\",\n    \"UserPrimaryImageTag\" : \"UserPrimaryImageTag\",\n    \"Id\" : 0,\n    \"ShortOverview\" : \"ShortOverview\",\n    \"ItemId\" : \"ItemId\",\n    \"Date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Type\" : \"Type\",\n    \"UserId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"Overview\" : \"Overview\",\n    \"UserPrimaryImageTag\" : \"UserPrimaryImageTag\",\n    \"Id\" : 0,\n    \"ShortOverview\" : \"ShortOverview\",\n    \"ItemId\" : \"ItemId\",\n    \"Date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"Name\" : \"Name\"\n  } ]\n}";
            exampleJson = "{\n  \"TotalRecordCount\" : 1,\n  \"StartIndex\" : 6,\n  \"Items\" : [ {\n    \"Type\" : \"Type\",\n    \"UserId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"Overview\" : \"Overview\",\n    \"UserPrimaryImageTag\" : \"UserPrimaryImageTag\",\n    \"Id\" : 0,\n    \"ShortOverview\" : \"ShortOverview\",\n    \"ItemId\" : \"ItemId\",\n    \"Date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Type\" : \"Type\",\n    \"UserId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"Overview\" : \"Overview\",\n    \"UserPrimaryImageTag\" : \"UserPrimaryImageTag\",\n    \"Id\" : 0,\n    \"ShortOverview\" : \"ShortOverview\",\n    \"ItemId\" : \"ItemId\",\n    \"Date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"Name\" : \"Name\"\n  } ]\n}";
            exampleJson = "{\n  \"TotalRecordCount\" : 1,\n  \"StartIndex\" : 6,\n  \"Items\" : [ {\n    \"Type\" : \"Type\",\n    \"UserId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"Overview\" : \"Overview\",\n    \"UserPrimaryImageTag\" : \"UserPrimaryImageTag\",\n    \"Id\" : 0,\n    \"ShortOverview\" : \"ShortOverview\",\n    \"ItemId\" : \"ItemId\",\n    \"Date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"Name\" : \"Name\"\n  }, {\n    \"Type\" : \"Type\",\n    \"UserId\" : \"046b6c7f-0b8a-43b9-b35d-6489e6daee91\",\n    \"Overview\" : \"Overview\",\n    \"UserPrimaryImageTag\" : \"UserPrimaryImageTag\",\n    \"Id\" : 0,\n    \"ShortOverview\" : \"ShortOverview\",\n    \"ItemId\" : \"ItemId\",\n    \"Date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"Name\" : \"Name\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ActivityLogEntryQueryResult>(exampleJson)
            : default(ActivityLogEntryQueryResult);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}