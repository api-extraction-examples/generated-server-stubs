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
    public class IssueCustomFieldOptionsApiController : ControllerBase
    { 
        /// <summary>
        /// Create custom field options (context)
        /// </summary>
        /// <remarks>Creates options and, where the custom select field is of the type Select List (cascading), cascading options for a custom select field. The options are added to a context of the field.  The maximum number of options that can be created per request is 1000 and each field can have a maximum of 10000 options.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options- -apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="fieldId">The ID of the custom field.</param>
        /// <param name="contextId">The ID of the context.</param>
        /// <param name="bulkCustomFieldOptionCreateRequest"></param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the custom field is not found or the context doesn&#39;t match the custom field.</response>
        [HttpPost]
        [Route("/rest/api/3/field/{fieldId}/context/{contextId}/option")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateCustomFieldOption")]
        [SwaggerResponse(statusCode: 200, type: typeof(CustomFieldCreatedContextOptionsList), description: "Returned if the request is successful.")]
        public virtual IActionResult CreateCustomFieldOption([FromRoute (Name = "fieldId")][Required]string fieldId, [FromRoute (Name = "contextId")][Required]long contextId, [FromBody]BulkCustomFieldOptionCreateRequest bulkCustomFieldOptionCreateRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CustomFieldCreatedContextOptionsList));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"options\" : [ {\n    \"disabled\" : true,\n    \"optionId\" : \"optionId\",\n    \"id\" : \"id\",\n    \"value\" : \"value\"\n  }, {\n    \"disabled\" : true,\n    \"optionId\" : \"optionId\",\n    \"id\" : \"id\",\n    \"value\" : \"value\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CustomFieldCreatedContextOptionsList>(exampleJson)
            : default(CustomFieldCreatedContextOptionsList);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete custom field options (context)
        /// </summary>
        /// <remarks>Deletes a custom field option.  Options with cascading options cannot be deleted without deleting the cascading options first.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options- -apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="fieldId">The ID of the custom field.</param>
        /// <param name="contextId">The ID of the context from which an option should be deleted.</param>
        /// <param name="optionId">The ID of the option to delete.</param>
        /// <response code="204">Returned if the option is deleted.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the field, the context, or the option is not found.</response>
        [HttpDelete]
        [Route("/rest/api/3/field/{fieldId}/context/{contextId}/option/{optionId}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteCustomFieldOption")]
        public virtual IActionResult DeleteCustomFieldOption([FromRoute (Name = "fieldId")][Required]string fieldId, [FromRoute (Name = "contextId")][Required]long contextId, [FromRoute (Name = "optionId")][Required]long optionId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get custom field option
        /// </summary>
        /// <remarks>Returns a custom field option. For example, an option in a select list.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The custom field option is returned as follows:   *  if the user has the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  if the user has the *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for at least one project the custom field is used in, and the field is visible in at least one layout the user has permission to view.</remarks>
        /// <param name="id">The ID of the custom field option.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="404">Returned if:   *  the custom field option is not found.  *  the user does not have permission to view the custom field.</response>
        [HttpGet]
        [Route("/rest/api/3/customFieldOption/{id}")]
        [ValidateModelState]
        [SwaggerOperation("GetCustomFieldOption")]
        [SwaggerResponse(statusCode: 200, type: typeof(CustomFieldOption), description: "Returned if the request is successful.")]
        public virtual IActionResult GetCustomFieldOption([FromRoute (Name = "id")][Required]string id)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CustomFieldOption));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"self\" : \"https://openapi-generator.tech\",\n  \"value\" : \"value\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CustomFieldOption>(exampleJson)
            : default(CustomFieldOption);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get custom field options (context)
        /// </summary>
        /// <remarks>Returns a [paginated](#pagination) list of all custom field option for a context. Options are returned first then cascading options, in the order they display in Jira.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options- -apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="fieldId">The ID of the custom field.</param>
        /// <param name="contextId">The ID of the context.</param>
        /// <param name="optionId">The ID of the option.</param>
        /// <param name="onlyOptions">Whether only options are returned.</param>
        /// <param name="startAt">The index of the first item to return in a page of results (page offset).</param>
        /// <param name="maxResults">The maximum number of items to return per page.</param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the custom field is not found or the context doesn&#39;t match the custom field.</response>
        [HttpGet]
        [Route("/rest/api/3/field/{fieldId}/context/{contextId}/option")]
        [ValidateModelState]
        [SwaggerOperation("GetOptionsForContext")]
        [SwaggerResponse(statusCode: 200, type: typeof(PageBeanCustomFieldContextOption), description: "Returned if the request is successful.")]
        public virtual IActionResult GetOptionsForContext([FromRoute (Name = "fieldId")][Required]string fieldId, [FromRoute (Name = "contextId")][Required]long contextId, [FromQuery (Name = "optionId")]long? optionId, [FromQuery (Name = "onlyOptions")]bool? onlyOptions, [FromQuery (Name = "startAt")]long? startAt, [FromQuery (Name = "maxResults")]int? maxResults)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(PageBeanCustomFieldContextOption));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"total\" : 1,\n  \"isLast\" : true,\n  \"maxResults\" : 0,\n  \"nextPage\" : \"https://openapi-generator.tech\",\n  \"values\" : [ {\n    \"disabled\" : true,\n    \"optionId\" : \"optionId\",\n    \"id\" : \"id\",\n    \"value\" : \"value\"\n  }, {\n    \"disabled\" : true,\n    \"optionId\" : \"optionId\",\n    \"id\" : \"id\",\n    \"value\" : \"value\"\n  } ],\n  \"self\" : \"https://openapi-generator.tech\",\n  \"startAt\" : 6\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<PageBeanCustomFieldContextOption>(exampleJson)
            : default(PageBeanCustomFieldContextOption);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Reorder custom field options (context)
        /// </summary>
        /// <remarks>Changes the order of custom field options or cascading options in a context.  This operation works for custom field options created in Jira or the operations from this resource. **To work with issue field select list options created for Connect apps use the [Issue custom field options (apps)](#api-group-issue-custom-field-options- -apps-) operations.**  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="fieldId">The ID of the custom field.</param>
        /// <param name="contextId">The ID of the context.</param>
        /// <param name="orderOfCustomFieldOptions"></param>
        /// <response code="204">Returned if options are reordered.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the field, the context, or one or more of the options is not found..</response>
        [HttpPut]
        [Route("/rest/api/3/field/{fieldId}/context/{contextId}/option/move")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("ReorderCustomFieldOptions")]
        [SwaggerResponse(statusCode: 204, type: typeof(Object), description: "Returned if options are reordered.")]
        public virtual IActionResult ReorderCustomFieldOptions([FromRoute (Name = "fieldId")][Required]string fieldId, [FromRoute (Name = "contextId")][Required]long contextId, [FromBody]OrderOfCustomFieldOptions orderOfCustomFieldOptions)
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
        /// Update custom field options (context)
        /// </summary>
        /// <remarks>Updates the options of a custom field.  If any of the options are not found, no options are updated. Options where the values in the request match the current values aren&#39;t updated and aren&#39;t reported in the response.  Note that this operation **only works for issue field select list options created in Jira or using operations from the [Issue custom field options](#api-group-Issue-custom-field-options) resource**, it cannot be used with issue field select list options created by Connect apps.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).</remarks>
        /// <param name="fieldId">The ID of the custom field.</param>
        /// <param name="contextId">The ID of the context.</param>
        /// <param name="bulkCustomFieldOptionUpdateRequest"></param>
        /// <response code="200">Returned if the request is successful.</response>
        /// <response code="400">Returned if the request is not valid.</response>
        /// <response code="401">Returned if the authentication credentials are incorrect or missing.</response>
        /// <response code="403">Returned if the user does not have the necessary permission.</response>
        /// <response code="404">Returned if the field, context, or one or more options is not found.</response>
        [HttpPut]
        [Route("/rest/api/3/field/{fieldId}/context/{contextId}/option")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("UpdateCustomFieldOption")]
        [SwaggerResponse(statusCode: 200, type: typeof(CustomFieldUpdatedContextOptionsList), description: "Returned if the request is successful.")]
        public virtual IActionResult UpdateCustomFieldOption([FromRoute (Name = "fieldId")][Required]string fieldId, [FromRoute (Name = "contextId")][Required]long contextId, [FromBody]BulkCustomFieldOptionUpdateRequest bulkCustomFieldOptionUpdateRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CustomFieldUpdatedContextOptionsList));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404);
            string exampleJson = null;
            exampleJson = "{\n  \"options\" : [ {\n    \"disabled\" : true,\n    \"id\" : \"id\",\n    \"value\" : \"value\"\n  }, {\n    \"disabled\" : true,\n    \"id\" : \"id\",\n    \"value\" : \"value\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CustomFieldUpdatedContextOptionsList>(exampleJson)
            : default(CustomFieldUpdatedContextOptionsList);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}