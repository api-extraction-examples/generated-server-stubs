/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * The version of the OpenAPI document: 1.0
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
    public class CustomFieldSettingsApiController : ControllerBase
    { 
        /// <summary>
        /// Get a portfolio&#39;s custom fields
        /// </summary>
        /// <remarks>Returns a list of all of the custom fields settings on a portfolio, in compact form.</remarks>
        /// <param name="portfolioGid">Globally unique identifier for the portfolio.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <param name="limit">Results per page. The number of objects to return per page. The value must be between 1 and 100.</param>
        /// <param name="offset">Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;</param>
        /// <response code="200">Successfully retrieved custom field settings objects for a portfolio.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/portfolios/{portfolio_gid}/custom_field_settings")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetCustomFieldSettingsForPortfolio")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetCustomFieldSettingsForPortfolio200Response), description: "Successfully retrieved custom field settings objects for a portfolio.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult GetCustomFieldSettingsForPortfolio([FromRoute (Name = "portfolio_gid")][Required]string portfolioGid, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]string offset)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetCustomFieldSettingsForPortfolio200Response));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetCustomFieldSettingsForPortfolio200Response>(exampleJson)
            : default(GetCustomFieldSettingsForPortfolio200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a project&#39;s custom fields
        /// </summary>
        /// <remarks>Returns a list of all of the custom fields settings on a project, in compact form. Note that, as in all queries to collections which return compact representation, &#x60;opt_fields&#x60; can be used to include more data than is returned in the compact representation. See the [getting started guide on input/output options](https://developers.asana.com/docs/#input-output-options) for more information.</remarks>
        /// <param name="projectGid">Globally unique identifier for the project.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <param name="limit">Results per page. The number of objects to return per page. The value must be between 1 and 100.</param>
        /// <param name="offset">Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;</param>
        /// <response code="200">Successfully retrieved custom field settings objects for a project.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/projects/{project_gid}/custom_field_settings")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetCustomFieldSettingsForProject")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetCustomFieldSettingsForPortfolio200Response), description: "Successfully retrieved custom field settings objects for a project.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult GetCustomFieldSettingsForProject([FromRoute (Name = "project_gid")][Required]string projectGid, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]string offset)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetCustomFieldSettingsForPortfolio200Response));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(ErrorResponse));
            //TODO: Uncomment the next line to return response 500 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(500, default(ErrorResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"data\" : [ null, null ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetCustomFieldSettingsForPortfolio200Response>(exampleJson)
            : default(GetCustomFieldSettingsForPortfolio200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
