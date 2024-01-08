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
    public class PortfolioMembershipsApiController : ControllerBase
    { 
        /// <summary>
        /// Get a portfolio membership
        /// </summary>
        /// <remarks>Returns the complete portfolio record for a single portfolio membership.</remarks>
        /// <param name="portfolioMembershipGid"></param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <response code="200">Successfully retrieved the requested portfolio membership.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/portfolio_memberships/{portfolio_membership_gid}")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetPortfolioMembership")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetPortfolioMembership200Response), description: "Successfully retrieved the requested portfolio membership.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult GetPortfolioMembership([FromRoute (Name = "portfolio_membership_gid")][Required]string portfolioMembershipGid, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetPortfolioMembership200Response));
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
            exampleJson = "{ }";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetPortfolioMembership200Response>(exampleJson)
            : default(GetPortfolioMembership200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get multiple portfolio memberships
        /// </summary>
        /// <remarks>Returns a list of portfolio memberships in compact representation. You must specify &#x60;portfolio&#x60;, &#x60;portfolio&#x60; and &#x60;user&#x60;, or &#x60;workspace&#x60; and &#x60;user&#x60;.</remarks>
        /// <param name="portfolio">The portfolio to filter results on.</param>
        /// <param name="workspace">The workspace to filter results on.</param>
        /// <param name="user">A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <param name="limit">Results per page. The number of objects to return per page. The value must be between 1 and 100.</param>
        /// <param name="offset">Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;</param>
        /// <response code="200">Successfully retrieved portfolio memberships.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/portfolio_memberships")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetPortfolioMemberships")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetPortfolioMemberships200Response), description: "Successfully retrieved portfolio memberships.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult GetPortfolioMemberships([FromQuery (Name = "portfolio")]string portfolio, [FromQuery (Name = "workspace")]string workspace, [FromQuery (Name = "user")]string user, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]string offset)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetPortfolioMemberships200Response));
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
            ? JsonConvert.DeserializeObject<GetPortfolioMemberships200Response>(exampleJson)
            : default(GetPortfolioMemberships200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get memberships from a portfolio
        /// </summary>
        /// <remarks>Returns the compact portfolio membership records for the portfolio.</remarks>
        /// <param name="portfolioGid">Globally unique identifier for the portfolio.</param>
        /// <param name="user">A string identifying a user. This can either be the string \&quot;me\&quot;, an email, or the gid of a user.</param>
        /// <param name="optPretty">Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging.</param>
        /// <param name="optFields">Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options.</param>
        /// <param name="limit">Results per page. The number of objects to return per page. The value must be between 1 and 100.</param>
        /// <param name="offset">Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. &#39;Note: You can only pass in an offset that was returned to you via a previously paginated request.&#39;</param>
        /// <response code="200">Successfully retrieved the requested portfolio&#39;s memberships.</response>
        /// <response code="400">This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.</response>
        /// <response code="401">A valid authentication token was not provided with the request, so the API could not associate a user with the request.</response>
        /// <response code="403">The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.</response>
        /// <response code="404">Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.</response>
        /// <response code="500">There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.</response>
        [HttpGet]
        [Route("/api/1.0/portfolios/{portfolio_gid}/portfolio_memberships")]
        [Authorize]
        [ValidateModelState]
        [SwaggerOperation("GetPortfolioMembershipsForPortfolio")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetPortfolioMemberships200Response), description: "Successfully retrieved the requested portfolio&#39;s memberships.")]
        [SwaggerResponse(statusCode: 400, type: typeof(ErrorResponse), description: "This usually occurs because of a missing or malformed parameter. Check the documentation and the syntax of your request and try again.")]
        [SwaggerResponse(statusCode: 401, type: typeof(ErrorResponse), description: "A valid authentication token was not provided with the request, so the API could not associate a user with the request.")]
        [SwaggerResponse(statusCode: 403, type: typeof(ErrorResponse), description: "The authentication and request syntax was valid but the server is refusing to complete the request. This can happen if you try to read or write to objects or properties that the user does not have access to.")]
        [SwaggerResponse(statusCode: 404, type: typeof(ErrorResponse), description: "Either the request method and path supplied do not specify a known action in the API, or the object specified by the request does not exist.")]
        [SwaggerResponse(statusCode: 500, type: typeof(ErrorResponse), description: "There was a problem on Asana’s end. In the event of a server error the response body should contain an error phrase. These phrases can be used by Asana support to quickly look up the incident that caused the server error. Some errors are due to server load, and will not supply an error phrase.")]
        public virtual IActionResult GetPortfolioMembershipsForPortfolio([FromRoute (Name = "portfolio_gid")][Required]string portfolioGid, [FromQuery (Name = "user")]string user, [FromQuery (Name = "opt_pretty")]bool? optPretty, [FromQuery (Name = "opt_fields")]List<string> optFields, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]string offset)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetPortfolioMemberships200Response));
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
            ? JsonConvert.DeserializeObject<GetPortfolioMemberships200Response>(exampleJson)
            : default(GetPortfolioMemberships200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
