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
    public class IssueTypeScreenSchemesApiController : ControllerBase
    { 
        /// <summary>
        /// Append mappings to issue type screen scheme
        /// </summary>
        /// <remarks>Appends issue type to screen scheme mappings to an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeScreenSchemeId">The ID of the issue type screen scheme.</param>
        /// <param name="issueTypeScreenSchemeMappingDetails"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type screen scheme, issue type, or screen scheme is not found.</response>
        /// <response code="409">Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings.</response>
        [HttpPut]
        [Route("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("AppendMappingsForIssueTypeScreenScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult AppendMappingsForIssueTypeScreenScheme([FromRoute (Name = "issueTypeScreenSchemeId")][Required]string issueTypeScreenSchemeId, [FromBody]IssueTypeScreenSchemeMappingDetails issueTypeScreenSchemeMappingDetails)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Assign issue type screen scheme to project
        /// </summary>
        /// <remarks>Assigns an issue type screen scheme to a project.  Issue type screen schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeScreenSchemeProjectAssociation"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if:   *  project is not found.  *  issue type screen scheme is not found.  *  the project is not a classic project.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type screen scheme or the project are missing.</response>
        [HttpPut]
        [Route("/rest/api/3/issuetypescreenscheme/project")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("AssignIssueTypeScreenSchemeToProject")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult AssignIssueTypeScreenSchemeToProject([FromBody]IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Create issue type screen scheme
        /// </summary>
        /// <remarks>Creates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeScreenSchemeDetails">An issue type screen scheme bean.</param>
        /// <response code="201">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type or screen scheme is not found.</response>
        /// <response code="409">Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings.</response>
        [HttpPost]
        [Route("/rest/api/3/issuetypescreenscheme")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateIssueTypeScreenScheme")]
        [SwaggerResponse(statusCode: 201, type: typeof(IssueTypeScreenSchemeId), description: "Returned if the request is successful.")]
        public virtual IActionResult CreateIssueTypeScreenScheme([FromBody]IssueTypeScreenSchemeDetails issueTypeScreenSchemeDetails)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(IssueTypeScreenSchemeId));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            string exampleJson = null;
            exampleJson = "{\n  \"id\" : \"id\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<IssueTypeScreenSchemeId>(exampleJson)
            : default(IssueTypeScreenSchemeId);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete issue type screen scheme
        /// </summary>
        /// <remarks>Deletes an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeScreenSchemeId">The ID of the issue type screen scheme.</param>
        /// <response code="204">Returned if the issue type screen scheme is deleted.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type screen scheme is not found.</response>
        [HttpDelete]
        [Route("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteIssueTypeScreenScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the issue type screen scheme is deleted.")]
        public virtual IActionResult DeleteIssueTypeScreenScheme([FromRoute (Name = "issueTypeScreenSchemeId")][Required]string issueTypeScreenSchemeId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get issue type screen scheme items
        /// </summary>
        /// <remarks>Returns a [paginated](#pagination) list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <param name="issueTypeScreenSchemeId">The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: &#x60;issueTypeScreenSchemeId&#x3D;10000&amp;issueTypeScreenSchemeId&#x3D;10001&#x60;.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        [HttpGet]
        [Route("/rest/api/3/issuetypescreenscheme/mapping")]
        [ValidateModelState]
        [SwaggerOperation("GetIssueTypeScreenSchemeMappings")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanIssueTypeScreenSchemeItem), description: "Returned if the request is successful.")]
        public virtual IActionResult GetIssueTypeScreenSchemeMappings([FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults, [FromQuery (Name = "issueTypeScreenSchemeId")]List<long> issueTypeScreenSchemeId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanIssueTypeScreenSchemeItem));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"issueTypeId\" : \"issueTypeId\",\n    \"issueTypeScreenSchemeId\" : \"issueTypeScreenSchemeId\",\n    \"screenSchemeId\" : \"screenSchemeId\"\n  }, {\n    \"issueTypeId\" : \"issueTypeId\",\n    \"issueTypeScreenSchemeId\" : \"issueTypeScreenSchemeId\",\n    \"screenSchemeId\" : \"screenSchemeId\"\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanIssueTypeScreenSchemeItem>(exampleJson)
            : default(PageBeanIssueTypeScreenSchemeItem);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get issue type screen schemes for projects
        /// </summary>
        /// <remarks>Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="projectId">The list of project IDs. To include multiple projects, separate IDs with ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;.</param>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        [HttpGet]
        [Route("/rest/api/3/issuetypescreenscheme/project")]
        [ValidateModelState]
        [SwaggerOperation("GetIssueTypeScreenSchemeProjectAssociations")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanIssueTypeScreenSchemesProjects), description: "Returned if the request is successful.")]
        public virtual IActionResult GetIssueTypeScreenSchemeProjectAssociations([FromQuery (Name = "projectId")][Required()]List<long> projectId, [FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanIssueTypeScreenSchemesProjects));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"issueTypeScreenScheme\" : \"\",\n    \"projectIds\" : [ \"projectIds\", \"projectIds\" ]\n  }, {\n    \"issueTypeScreenScheme\" : \"\",\n    \"projectIds\" : [ \"projectIds\", \"projectIds\" ]\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanIssueTypeScreenSchemesProjects>(exampleJson)
            : default(PageBeanIssueTypeScreenSchemesProjects);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get issue type screen schemes
        /// </summary>
        /// <remarks>Returns a [paginated](#pagination) list of issue type screen schemes.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <param name="id">The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.</param>
        /// <param name="queryString">String used to perform a case-insensitive partial match with issue type screen scheme name.</param>
        /// <param name="orderBy">[Order](#ordering) the results by a field:   *  &#x60;name&#x60; Sorts by issue type screen scheme name.  *  &#x60;id&#x60; Sorts by issue type screen scheme ID.</param>
        /// <param name="expand">Use [expand](#expansion) to include additional information in the response. This parameter accepts &#x60;projects&#x60; that, for each issue type screen schemes, returns information about the projects the issue type screen scheme is assigned to.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        [HttpGet]
        [Route("/rest/api/3/issuetypescreenscheme")]
        [ValidateModelState]
        [SwaggerOperation("GetIssueTypeScreenSchemes")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanIssueTypeScreenScheme), description: "Returned if the request is successful.")]
        public virtual IActionResult GetIssueTypeScreenSchemes([FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults, [FromQuery (Name = "id")]List<long> id, [FromQuery (Name = "queryString")]string queryString, [FromQuery (Name = "orderBy")]string orderBy, [FromQuery (Name = "expand")]string expand)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanIssueTypeScreenScheme));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\"\n  }, {\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\"\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanIssueTypeScreenScheme>(exampleJson)
            : default(PageBeanIssueTypeScreenScheme);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get issue type screen scheme projects
        /// </summary>
        /// <remarks>Returns a [paginated](#pagination) list of projects associated with an issue type screen scheme.  Only company-managed projects associated with an issue type screen scheme are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeScreenSchemeId">The ID of the issue type screen scheme.</param>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <param name="query"></param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        [HttpGet]
        [Route("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/project")]
        [ValidateModelState]
        [SwaggerOperation("GetProjectsForIssueTypeScreenScheme")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanProjectDetails), description: "Returned if the request is successful.")]
        public virtual IActionResult GetProjectsForIssueTypeScreenScheme([FromRoute (Name = "issueTypeScreenSchemeId")][Required]long issueTypeScreenSchemeId, [FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults, [FromQuery (Name = "query")]string query)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanProjectDetails));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"simplified\" : true,\n    \"name\" : \"name\",\n    \"self\" : \"self\",\n    \"id\" : \"id\",\n    \"projectTypeKey\" : \"software\",\n    \"key\" : \"key\"\n  }, {\n    \"simplified\" : true,\n    \"name\" : \"name\",\n    \"self\" : \"self\",\n    \"id\" : \"id\",\n    \"projectTypeKey\" : \"software\",\n    \"key\" : \"key\"\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanProjectDetails>(exampleJson)
            : default(PageBeanProjectDetails);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Remove mappings from issue type screen scheme
        /// </summary>
        /// <remarks>Removes issue type to screen scheme mappings from an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeScreenSchemeId">The ID of the issue type screen scheme.</param>
        /// <param name="issueTypeIds"></param>
        /// <response code="204">Returned if the screen scheme mappings are removed from the issue type screen scheme.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type screen scheme or one or more issue type mappings are not found.</response>
        [HttpPost]
        [Route("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/remove")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("RemoveMappingsFromIssueTypeScreenScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the screen scheme mappings are removed from the issue type screen scheme.")]
        public virtual IActionResult RemoveMappingsFromIssueTypeScreenScheme([FromRoute (Name = "issueTypeScreenSchemeId")][Required]string issueTypeScreenSchemeId, [FromBody]IssueTypeIds issueTypeIds)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update issue type screen scheme default screen scheme
        /// </summary>
        /// <remarks>Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeScreenSchemeId">The ID of the issue type screen scheme.</param>
        /// <param name="updateDefaultScreenScheme"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type screen scheme or the screen screen is not found, or the screen scheme isn&#39;t used in classic projects.</response>
        [HttpPut]
        [Route("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/default")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateDefaultScreenScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult UpdateDefaultScreenScheme([FromRoute (Name = "issueTypeScreenSchemeId")][Required]string issueTypeScreenSchemeId, [FromBody]UpdateDefaultScreenScheme updateDefaultScreenScheme)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update issue type screen scheme
        /// </summary>
        /// <remarks>Updates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeScreenSchemeId">The ID of the issue type screen scheme.</param>
        /// <param name="issueTypeScreenSchemeUpdateDetails">The issue type screen scheme update details.</param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type screen scheme is not found.</response>
        [HttpPut]
        [Route("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateIssueTypeScreenScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult UpdateIssueTypeScreenScheme([FromRoute (Name = "issueTypeScreenSchemeId")][Required]string issueTypeScreenSchemeId, [FromBody]IssueTypeScreenSchemeUpdateDetails issueTypeScreenSchemeUpdateDetails)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204, default(Object));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
