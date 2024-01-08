/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * The version of the OpenAPI document: 2.10.50
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
    public class GroupsApiController : ControllerBase
    { 
        /// <summary>
        /// List available groups.
        /// </summary>
        /// <remarks>List available groups.</remarks>
        /// <response code="200">OK. The request has succeeded.  XML Schema used for body validation: [directory.xsd](../schema/directory.xsd) </response>
        /// <response code="401"></response>
        [HttpGet]
        [Route("/group")]
        [ValidateModelState]
        [SwaggerOperation("GroupGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(Object), description: "OK. The request has succeeded.  XML Schema used for body validation: [directory.xsd](../schema/directory.xsd) ")]
        public virtual IActionResult GroupGet()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Object));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            string exampleJson = null;
            exampleJson = "Custom MIME type example not yet supported: application/xml; charset=utf-8";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Object>(exampleJson)
            : default(Object);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Delete a group.
        /// </summary>
        /// <remarks>Delete a group.</remarks>
        /// <response code="200"></response>
        /// <response code="401"></response>
        /// <response code="404">Not Found.</response>
        [HttpDelete]
        [Route("/group/{group_title}")]
        [ValidateModelState]
        [SwaggerOperation("GroupGroupTitleDelete")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult GroupGroupTitleDelete()
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Read group data.
        /// </summary>
        /// <remarks>Read group data.</remarks>
        /// <param name="groupTitle">Group title</param>
        /// <response code="200">OK. The request has succeeded.  XML Schema used for body validation: [group.rng](../schema/group.rng) </response>
        /// <response code="401"></response>
        /// <response code="404">Not Found.</response>
        [HttpGet]
        [Route("/group/{group_title}")]
        [ValidateModelState]
        [SwaggerOperation("GroupGroupTitleGet")]
        [SwaggerResponse(statusCode: 200, type: typeof(GroupGroupTitleGet200Response), description: "OK. The request has succeeded.  XML Schema used for body validation: [group.rng](../schema/group.rng) ")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult GroupGroupTitleGet([FromRoute (Name = "group_title")][Required]string groupTitle)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GroupGroupTitleGet200Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));
            string exampleJson = null;
            exampleJson = "<group>\n  <person>\n  </person>\n  <title>group-test</title>\n</group>";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GroupGroupTitleGet200Response>(exampleJson)
            : default(GroupGroupTitleGet200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Modify group data.
        /// </summary>
        /// <remarks>Modify group data.</remarks>
        /// <param name="cmd">Command to be executed. It takes one of these available values: * &#x60;add_user&#x60;: add a user to a group. &#x60;userid&#x60; query parameter must be also used. * &#x60;remove_user&#x60;: remove a user from a group. &#x60;userid&#x60; query parameter must be also used. * &#x60;set_email&#x60;: set email adress of group. &#x60;email&#x60; query parameter must be also used. </param>
        /// <param name="userid">User login. Used with &#x60;cmd&#x3D;add_user&#x60; or &#x60;cmd&#x3D;remove_user&#x60;.</param>
        /// <param name="email">Group email. Used with &#x60;cmd&#x3D;set_email&#x60;.</param>
        /// <response code="200"></response>
        /// <response code="400">Bad Request.</response>
        /// <response code="401"></response>
        /// <response code="404">Not Found.</response>
        [HttpPost]
        [Route("/group/{group_title}")]
        [ValidateModelState]
        [SwaggerOperation("GroupGroupTitlePost")]
        [SwaggerResponse(statusCode: 400, type: typeof(Object), description: "Bad Request.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult GroupGroupTitlePost([FromQuery (Name = "cmd")]string cmd, [FromQuery (Name = "userid")]string userid, [FromQuery (Name = "email")]string email)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Object));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Write group data.
        /// </summary>
        /// <remarks>Write group data.</remarks>
        /// <param name="body">Group definition.  XML Schema used for body validation: [group.rng](../schema/group.rng) </param>
        /// <response code="200"></response>
        /// <response code="401"></response>
        /// <response code="404">Not Found.</response>
        [HttpPut]
        [Route("/group/{group_title}")]
        [Consumes("application/xml; charset=utf-8")]
        [ValidateModelState]
        [SwaggerOperation("GroupGroupTitlePut")]
        [SwaggerResponse(statusCode: 404, type: typeof(Object), description: "Not Found.")]
        public virtual IActionResult GroupGroupTitlePut([FromBody]Object body)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200);
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401);
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Object));

            throw new NotImplementedException();
        }
    }
}
