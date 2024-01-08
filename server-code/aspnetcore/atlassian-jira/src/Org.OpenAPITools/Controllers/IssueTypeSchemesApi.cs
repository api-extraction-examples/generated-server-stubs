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
    public class IssueTypeSchemesApiController : ControllerBase
    { 
        /// <summary>
        /// Add issue types to issue type scheme
        /// </summary>
        /// <remarks>Adds issue types to an issue type scheme.  The added issue types are appended to the issue types list.  If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeSchemeId">The ID of the issue type scheme.</param>
        /// <param name="issueTypeIds"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type or the issue type scheme is not found.</response>
        [HttpPut]
        [Route("/rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("AddIssueTypesToIssueTypeScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult AddIssueTypesToIssueTypeScheme([FromRoute (Name = "issueTypeSchemeId")][Required]long issueTypeSchemeId, [FromBody]IssueTypeIds issueTypeIds)
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
        /// Assign issue type scheme to project
        /// </summary>
        /// <remarks>Assigns an issue type scheme to a project.  If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.  Issue type schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeSchemeProjectAssociation"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type scheme or the project is not found.</response>
        [HttpPut]
        [Route("/rest/api/3/issuetypescheme/project")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("AssignIssueTypeSchemeToProject")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult AssignIssueTypeSchemeToProject([FromBody]IssueTypeSchemeProjectAssociation issueTypeSchemeProjectAssociation)
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
        /// Create issue type scheme
        /// </summary>
        /// <remarks>Creates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeSchemeDetails"></param>
        /// <response code="201">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="409">Returned if the scheme name is used by another scheme.</response>
        [HttpPost]
        [Route("/rest/api/3/issuetypescheme")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateIssueTypeScheme")]
        [SwaggerResponse(statusCode: 201, type: typeof(IssueTypeSchemeID), description: "Returned if the request is successful.")]
        public virtual IActionResult CreateIssueTypeScheme([FromBody]IssueTypeSchemeDetails issueTypeSchemeDetails)
        {

            //TODO: Uncomment the next line to return response 201 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(201, default(IssueTypeSchemeID));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409);
            string exampleJson = null;
            exampleJson = "{\n  \"issueTypeSchemeId\" : \"issueTypeSchemeId\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<IssueTypeSchemeID>(exampleJson)
            : default(IssueTypeSchemeID);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete issue type scheme
        /// </summary>
        /// <remarks>Deletes an issue type scheme.  Only issue type schemes used in classic projects can be deleted.  Any projects assigned to the scheme are reassigned to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeSchemeId">The ID of the issue type scheme.</param>
        /// <response code="204">Returned if the issue type scheme is deleted.</response>
        /// <response code="400">Returned if the request is to delete the default issue type scheme.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type scheme is not found.</response>
        [HttpDelete]
        [Route("/rest/api/3/issuetypescheme/{issueTypeSchemeId}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteIssueTypeScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the issue type scheme is deleted.")]
        public virtual IActionResult DeleteIssueTypeScheme([FromRoute (Name = "issueTypeSchemeId")][Required]long issueTypeSchemeId)
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
        /// Get all issue type schemes
        /// </summary>
        /// <remarks>Returns a [paginated](#pagination) list of issue type schemes.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <param name="id">The list of issue type schemes IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.</param>
        /// <param name="orderBy">[Order](#ordering) the results by a field:   *  &#x60;name&#x60; Sorts by issue type scheme name.  *  &#x60;id&#x60; Sorts by issue type scheme ID.</param>
        /// <param name="expand">Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;projects&#x60; For each issue type schemes, returns information about the projects the issue type scheme is assigned to.  *  &#x60;issueTypes&#x60; For each issue type schemes, returns information about the issueTypes the issue type scheme have.</param>
        /// <param name="queryString">String used to perform a case-insensitive partial match with issue type scheme name.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        [HttpGet]
        [Route("/rest/api/3/issuetypescheme")]
        [ValidateModelState]
        [SwaggerOperation("GetAllIssueTypeSchemes")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanIssueTypeScheme), description: "Returned if the request is successful.")]
        public virtual IActionResult GetAllIssueTypeSchemes([FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults, [FromQuery (Name = "id")]List<long> id, [FromQuery (Name = "orderBy")]string orderBy, [FromQuery (Name = "expand")]string expand, [FromQuery (Name = "queryString")]string queryString)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanIssueTypeScheme));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"isDefault\" : true,\n    \"defaultIssueTypeId\" : \"defaultIssueTypeId\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\"\n  }, {\n    \"isDefault\" : true,\n    \"defaultIssueTypeId\" : \"defaultIssueTypeId\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"id\" : \"id\"\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanIssueTypeScheme>(exampleJson)
            : default(PageBeanIssueTypeScheme);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get issue type schemes for projects
        /// </summary>
        /// <remarks>Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="projectId">The list of project IDs. To include multiple project IDs, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;.</param>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        [HttpGet]
        [Route("/rest/api/3/issuetypescheme/project")]
        [ValidateModelState]
        [SwaggerOperation("GetIssueTypeSchemeForProjects")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanIssueTypeSchemeProjects), description: "Returned if the request is successful.")]
        public virtual IActionResult GetIssueTypeSchemeForProjects([FromQuery (Name = "projectId")][Required()]List<long> projectId, [FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanIssueTypeSchemeProjects));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"projectIds\" : [ \"projectIds\", \"projectIds\" ],\n    \"issueTypeScheme\" : \"\"\n  }, {\n    \"projectIds\" : [ \"projectIds\", \"projectIds\" ],\n    \"issueTypeScheme\" : \"\"\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanIssueTypeSchemeProjects>(exampleJson)
            : default(PageBeanIssueTypeSchemeProjects);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get issue type scheme items
        /// </summary>
        /// <remarks>Returns a [paginated](#pagination) list of issue type scheme items.  Only issue type scheme items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <param name="issueTypeSchemeId">The list of issue type scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;issueTypeSchemeId&#x3D;10000&amp;issueTypeSchemeId&#x3D;10001&#x60;.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        [HttpGet]
        [Route("/rest/api/3/issuetypescheme/mapping")]
        [ValidateModelState]
        [SwaggerOperation("GetIssueTypeSchemesMapping")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanIssueTypeSchemeMapping), description: "Returned if the request is successful.")]
        public virtual IActionResult GetIssueTypeSchemesMapping([FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults, [FromQuery (Name = "issueTypeSchemeId")]List<long> issueTypeSchemeId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanIssueTypeSchemeMapping));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"issueTypeId\" : \"issueTypeId\",\n    \"issueTypeSchemeId\" : \"issueTypeSchemeId\"\n  }, {\n    \"issueTypeId\" : \"issueTypeId\",\n    \"issueTypeSchemeId\" : \"issueTypeSchemeId\"\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanIssueTypeSchemeMapping>(exampleJson)
            : default(PageBeanIssueTypeSchemeMapping);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Remove issue type from issue type scheme
        /// </summary>
        /// <remarks>Removes an issue type from an issue type scheme.  This operation cannot remove:   *  any issue type used by issues.  *  any issue types from the default issue type scheme.  *  the last standard issue type from an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeSchemeId">The ID of the issue type scheme.</param>
        /// <param name="issueTypeId">The ID of the issue type.</param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type scheme is missing or the issue type is not found in the issue type scheme.</response>
        [HttpDelete]
        [Route("/rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype/{issueTypeId}")]
        [ValidateModelState]
        [SwaggerOperation("RemoveIssueTypeFromIssueTypeScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult RemoveIssueTypeFromIssueTypeScheme([FromRoute (Name = "issueTypeSchemeId")][Required]long issueTypeSchemeId, [FromRoute (Name = "issueTypeId")][Required]long issueTypeId)
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
        /// Change order of issue types
        /// </summary>
        /// <remarks>Changes the order of issue types in an issue type scheme.  The request body parameters must meet the following requirements:   *  all of the issue types must belong to the issue type scheme.  *  either &#x60;after&#x60; or &#x60;position&#x60; must be provided.  *  the issue type in &#x60;after&#x60; must not be in the issue type list.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeSchemeId">The ID of the issue type scheme.</param>
        /// <param name="orderOfIssueTypes"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type scheme is not found.</response>
        [HttpPut]
        [Route("/rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype/move")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("ReorderIssueTypesInIssueTypeScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult ReorderIssueTypesInIssueTypeScheme([FromRoute (Name = "issueTypeSchemeId")][Required]long issueTypeSchemeId, [FromBody]OrderOfIssueTypes orderOfIssueTypes)
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
        /// Update issue type scheme
        /// </summary>
        /// <remarks>Updates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueTypeSchemeId">The ID of the issue type scheme.</param>
        /// <param name="issueTypeSchemeUpdateDetails"></param>
        /// <response code="204">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the required permissions.</response>
        /// <response code="404">Returned if the issue type scheme is not found.</response>
        [HttpPut]
        [Route("/rest/api/3/issuetypescheme/{issueTypeSchemeId}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateIssueTypeScheme")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if the request is successful.")]
        public virtual IActionResult UpdateIssueTypeScheme([FromRoute (Name = "issueTypeSchemeId")][Required]long issueTypeSchemeId, [FromBody]IssueTypeSchemeUpdateDetails issueTypeSchemeUpdateDetails)
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
