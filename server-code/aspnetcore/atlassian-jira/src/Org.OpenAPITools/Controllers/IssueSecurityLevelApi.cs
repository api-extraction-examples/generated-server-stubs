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
    public class IssueSecurityLevelApiController : ControllerBase
    { 
        /// <summary>
        /// Get issue security level
        /// </summary>
        /// <remarks>Returns details of an issue security level.  Use [Get issue security scheme](#api-rest-api-3-issuesecurityschemes-id-get) to obtain the IDs of issue security levels associated with the issue security scheme.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.</remarks>
        /// <param name="id">The ID of the issue security level.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect.</response>
        /// <response code="404">Returned if the issue security level is not found.</response>
        [HttpGet]
        [Route("/rest/api/3/securitylevel/{id}")]
        [ValidateModelState]
        [SwaggerOperation("GetIssueSecurityLevel")]
        [SwaggerResponse(statusCode: 200, type: typeof(SecurityLevel), description: "Returned if the request is successful.")]
        public virtual IActionResult GetIssueSecurityLevel([FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(SecurityLevel));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"isDefault\" : true,\n  \"issueSecuritySchemeId\" : \"issueSecuritySchemeId\",\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"self\" : \"self\",\n  \"id\" : \"id\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<SecurityLevel>(exampleJson)
            : default(SecurityLevel);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get issue security level members
        /// </summary>
        /// <remarks>Returns issue security level members.  Only issue security level members in context of classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="issueSecuritySchemeId">The ID of the issue security scheme. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) operation to get a list of issue security scheme IDs.</param>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <param name="issueSecurityLevelId">The list of issue security level IDs. To include multiple issue security levels separate IDs with ampersand: &#x60;issueSecurityLevelId&#x3D;10000&amp;issueSecurityLevelId&#x3D;10001&#x60;.</param>
        /// <param name="expand">Use expand to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about the custom field granted the permission.  *  &#x60;group&#x60; Returns information about the group that is granted the permission.  *  &#x60;projectRole&#x60; Returns information about the project role granted the permission.  *  &#x60;user&#x60; Returns information about the user who is granted the permission.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if no issue security level members are found.</response>
        [HttpGet]
        [Route("/rest/api/3/issuesecurityschemes/{issueSecuritySchemeId}/members")]
        [ValidateModelState]
        [SwaggerOperation("GetIssueSecurityLevelMembers")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanIssueSecurityLevelMember), description: "Returned if the request is successful.")]
        public virtual IActionResult GetIssueSecurityLevelMembers([FromRoute (Name = "issueSecuritySchemeId")][Required]long issueSecuritySchemeId, [FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults, [FromQuery (Name = "issueSecurityLevelId")]List<long> issueSecurityLevelId, [FromQuery (Name = "expand")]string expand)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanIssueSecurityLevelMember));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"holder\" : \"\",\n    \"id\" : 5,\n    \"issueSecurityLevelId\" : 5\n  }, {\n    \"holder\" : \"\",\n    \"id\" : 5,\n    \"issueSecurityLevelId\" : 5\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanIssueSecurityLevelMember>(exampleJson)
            : default(PageBeanIssueSecurityLevelMember);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
