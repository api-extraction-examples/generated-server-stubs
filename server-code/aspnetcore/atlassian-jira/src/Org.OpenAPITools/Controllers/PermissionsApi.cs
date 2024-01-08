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
    public class PermissionsApiController : ControllerBase
    { 
        /// <summary>
        /// Get all permissions
        /// </summary>
        /// <remarks>Returns all permissions, including:   *  global permissions.  *  project permissions.  *  global permissions added by plugins.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        [HttpGet]
        [Route("/rest/api/3/permissions")]
        [ValidateModelState]
        [SwaggerOperation("GetAllPermissions")]
        [SwaggerResponse(statusCode: 200, type: typeof(Permissions), description: "Returned if the request is successful.")]
        public virtual IActionResult GetAllPermissions()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Permissions));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            string exampleJson = null;
            exampleJson = "{\n  \"permissions\" : {\n    \"key\" : {\n      \"havePermission\" : true,\n      \"name\" : \"name\",\n      \"description\" : \"description\",\n      \"deprecatedKey\" : true,\n      \"id\" : \"id\",\n      \"type\" : \"GLOBAL\",\n      \"key\" : \"key\"\n    }\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Permissions>(exampleJson)
            : default(Permissions);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get bulk permissions
        /// </summary>
        /// <remarks>Returns:   *  for a list of global permissions, the global permissions granted to a user.  *  for a list of project permissions and lists of projects and issues, for each project permission a list of the projects and issues a user can access or manipulate.  If no account ID is provided, the operation returns details for the logged in user.  Note that:   *  Invalid project and issue IDs are ignored.  *  A maximum of 1000 projects and 1000 issues can be checked.  *  Null values in &#x60;globalPermissions&#x60;, &#x60;projectPermissions&#x60;, &#x60;projectPermissions.projects&#x60;, and &#x60;projectPermissions.issues&#x60; are ignored.  *  Empty strings in &#x60;projectPermissions.permissions&#x60; are ignored.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to check the permissions for other users, otherwise none. However, Connect apps can make a call from the app server to the product to obtain permission details for any user, without admin permission. This Connect app ability doesn&#39;t apply to calls made using AP.request() in a browser.</remarks>
        /// <param name="bulkPermissionsRequestBean">Details of the permissions to check.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if:   *  &#x60;projectPermissions&#x60; is provided without at least one project permission being provided.  *  an invalid global permission is provided in the global permissions list.  *  an invalid project permission is provided in the project permissions list.  *  more than 1000 valid project IDs or more than 1000 valid issue IDs are provided.  *  an invalid account ID is provided.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        [HttpPost]
        [Route("/rest/api/3/permissions/check")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("GetBulkPermissions")]
        [SwaggerResponse(statusCode: 200, type: typeof(BulkPermissionGrants), description: "Returned if the request is successful.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorCollection), description: "Returned if:   *  &#x60;projectPermissions&#x60; is provided without at least one project permission being provided.  *  an invalid global permission is provided in the global permissions list.  *  an invalid project permission is provided in the project permissions list.  *  more than 1000 valid project IDs or more than 1000 valid issue IDs are provided.  *  an invalid account ID is provided.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorCollection), description: "Returned if the user does not have the necessary permission.")]
        public virtual IActionResult GetBulkPermissions([FromBody]BulkPermissionsRequestBean bulkPermissionsRequestBean)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(BulkPermissionGrants));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorCollection));
            string exampleJson = null;
            exampleJson = "{\n  \"globalPermissions\" : [ \"globalPermissions\", \"globalPermissions\" ],\n  \"projectPermissions\" : [ {\n    \"projects\" : [ 6, 6 ],\n    \"permission\" : \"permission\",\n    \"issues\" : [ 0, 0 ]\n  }, {\n    \"projects\" : [ 6, 6 ],\n    \"permission\" : \"permission\",\n    \"issues\" : [ 0, 0 ]\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<BulkPermissionGrants>(exampleJson)
            : default(BulkPermissionGrants);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get my permissions
        /// </summary>
        /// <remarks>Returns a list of permissions indicating which permissions the user has. Details of the user&#39;s permissions can be obtained in a global, project, issue or comment context.  The user is reported as having a project permission:   *  in the global context, if the user has the project permission in any project.  *  for a project, where the project permission is determined using issue data, if the user meets the permission&#39;s criteria for any issue in the project. Otherwise, if the user has the project permission in the project.  *  for an issue, where a project permission is determined using issue data, if the user has the permission in the issue. Otherwise, if the user has the project permission in the project containing the issue.  *  for a comment, where the user has both the permission to browse the comment and the project permission for the comment&#39;s parent issue. Only the BROWSE\\_PROJECTS permission is supported. If a &#x60;commentId&#x60; is provided whose &#x60;permissions&#x60; does not equal BROWSE\\_PROJECTS, a 400 error will be returned.  This means that users may be shown as having an issue permission (such as EDIT\\_ISSUES) in the global context or a project context but may not have the permission for any or all issues. For example, if Reporters have the EDIT\\_ISSUES permission a user would be shown as having this permission in the global context or the context of a project, because any user can be a reporter. However, if they are not the user who reported the issue queried they would not have EDIT\\_ISSUES permission for that issue.  Global permissions are unaffected by context.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.</remarks>
        /// <param name="projectKey">The key of project. Ignored if &#x60;projectId&#x60; is provided.</param>
        /// <param name="projectId">The ID of project.</param>
        /// <param name="issueKey">The key of the issue. Ignored if &#x60;issueId&#x60; is provided.</param>
        /// <param name="issueId">The ID of the issue.</param>
        /// <param name="permissions">A list of permission keys. (Required) This parameter accepts a comma-separated list. To get the list of available permissions, use [Get all permissions](#api-rest-api-3-permissions-get).</param>
        /// <param name="projectUuid"></param>
        /// <param name="projectConfigurationUuid"></param>
        /// <param name="commentId">The ID of the comment.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if &#x60;permissions&#x60; is empty, contains an invalid key, or does not equal BROWSE\\_PROJECTS when commentId is provided.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="404">Returned if the project or issue is not found or the user does not have permission to view the project or issue.</response>
        [HttpGet]
        [Route("/rest/api/3/mypermissions")]
        [ValidateModelState]
        [SwaggerOperation("GetMyPermissions")]
        [SwaggerResponse(statusCode: 200, type: typeof(Permissions), description: "Returned if the request is successful.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorCollection), description: "Returned if &#x60;permissions&#x60; is empty, contains an invalid key, or does not equal BROWSE\\_PROJECTS when commentId is provided.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorCollection), description: "Returned if the authentication credentials are incorrect or missing.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorCollection), description: "Returned if the project or issue is not found or the user does not have permission to view the project or issue.")]
        public virtual IActionResult GetMyPermissions([FromQuery (Name = "projectKey")]string projectKey, [FromQuery (Name = "projectId")]string projectId, [FromQuery (Name = "issueKey")]string issueKey, [FromQuery (Name = "issueId")]string issueId, [FromQuery (Name = "permissions")]string permissions, [FromQuery (Name = "projectUuid")]string projectUuid, [FromQuery (Name = "projectConfigurationUuid")]string projectConfigurationUuid, [FromQuery (Name = "commentId")]string commentId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Permissions));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorCollection));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorCollection));
            string exampleJson = null;
            exampleJson = "{\n  \"permissions\" : {\n    \"key\" : {\n      \"havePermission\" : true,\n      \"name\" : \"name\",\n      \"description\" : \"description\",\n      \"deprecatedKey\" : true,\n      \"id\" : \"id\",\n      \"type\" : \"GLOBAL\",\n      \"key\" : \"key\"\n    }\n  }\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Permissions>(exampleJson)
            : default(Permissions);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get permitted projects
        /// </summary>
        /// <remarks>Returns all the projects where the user is granted a list of project permissions.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.</remarks>
        /// <param name="permissionsKeysBean"></param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if a project permission is not found.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        [HttpPost]
        [Route("/rest/api/3/permissions/project")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("GetPermittedProjects")]
        [SwaggerResponse(statusCode: 200, type: typeof(PermittedProjects), description: "Returned if the request is successful.")]
        public virtual IActionResult GetPermittedProjects([FromBody]PermissionsKeysBean permissionsKeysBean)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PermittedProjects));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "{\n  \"projects\" : [ {\n    \"id\" : 0,\n    \"key\" : \"key\"\n  }, {\n    \"id\" : 0,\n    \"key\" : \"key\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PermittedProjects>(exampleJson)
            : default(PermittedProjects);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
