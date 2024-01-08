/*
 * Airflow API (Stable)
 *
 * # Overview  To facilitate management, Apache Airflow supports a range of REST API endpoints across its objects. This section provides an overview of the API design, methods, and supported use cases.  Most of the endpoints accept `JSON` as input and return `JSON` responses. This means that you must usually add the following headers to your request: ``` Content-type: application/json Accept: application/json ```  ## Resources  The term `resource` refers to a single type of object in the Airflow metadata. An API is broken up by its endpoint's corresponding resource. The name of a resource is typically plural and expressed in camelCase. Example: `dagRuns`.  Resource names are used as part of endpoint URLs, as well as in API parameters and responses.  ## CRUD Operations  The platform supports **C**reate, **R**ead, **U**pdate, and **D**elete operations on most resources. You can review the standards for these operations and their standard parameters below.  Some endpoints have special behavior as exceptions.  ### Create  To create a resource, you typically submit an HTTP `POST` request with the resource's required metadata in the request body. The response returns a `201 Created` response code upon success with the resource's metadata, including its internal `id`, in the response body.  ### Read  The HTTP `GET` request can be used to read a resource or to list a number of resources.  A resource's `id` can be submitted in the request parameters to read a specific resource. The response usually returns a `200 OK` response code upon success, with the resource's metadata in the response body.  If a `GET` request does not include a specific resource `id`, it is treated as a list request. The response usually returns a `200 OK` response code upon success, with an object containing a list of resources' metadata in the response body.  When reading resources, some common query parameters are usually available. e.g.: ``` v1/connections?limit=25&offset=25 ```  |Query Parameter|Type|Description| |- -- -- -- -- -- -- --|- -- -|- -- -- -- -- --| |limit|integer|Maximum number of objects to fetch. Usually 25 by default| |offset|integer|Offset after which to start returning objects. For use with limit query parameter.|  ### Update  Updating a resource requires the resource `id`, and is typically done using an HTTP `PATCH` request, with the fields to modify in the request body. The response usually returns a `200 OK` response code upon success, with information about the modified resource in the response body.  ### Delete  Deleting a resource requires the resource `id` and is typically executing via an HTTP `DELETE` request. The response usually returns a `204 No Content` response code upon success.  ## Conventions  - Resource names are plural and expressed in camelCase. - Names are consistent between URL parameter name and field name.  - Field names are in snake_case. ```json {     \"name\": \"string\",     \"slots\": 0,     \"occupied_slots\": 0,     \"used_slots\": 0,     \"queued_slots\": 0,     \"open_slots\": 0 } ```  ### Update Mask  Update mask is available as a query parameter in patch endpoints. It is used to notify the API which fields you want to update. Using `update_mask` makes it easier to update objects by helping the server know which fields to update in an object instead of updating all fields. The update request ignores any fields that aren't specified in the field mask, leaving them with their current values.  Example: ```   resource = request.get('/resource/my-id').json()   resource['my_field'] = 'new-value'   request.patch('/resource/my-id?update_mask=my_field', data=json.dumps(resource)) ```  ## Versioning and Endpoint Lifecycle  - API versioning is not synchronized to specific releases of the Apache Airflow. - APIs are designed to be backward compatible. - Any changes to the API will first go through a deprecation phase.  # Trying the API  You can use a third party client, such as [curl](https://curl.haxx.se/), [HTTPie](https://httpie.org/), [Postman](https://www.postman.com/) or [the Insomnia rest client](https://insomnia.rest/) to test the Apache Airflow API.  Note that you will need to pass credentials data.  For e.g., here is how to pause a DAG with [curl](https://curl.haxx.se/), when basic authorization is used: ```bash curl -X PATCH 'https://example.com/api/v1/dags/{dag_id}?update_mask=is_paused' \\ -H 'Content-Type: application/json' \\ - -user \"username:password\" \\ -d '{     \"is_paused\": true }' ```  Using a graphical tool such as [Postman](https://www.postman.com/) or [Insomnia](https://insomnia.rest/), it is possible to import the API specifications directly:  1. Download the API specification by clicking the **Download** button at top of this document 2. Import the JSON specification in the graphical tool of your choice.   - In *Postman*, you can click the **import** button at the top   - With *Insomnia*, you can just drag-and-drop the file on the UI  Note that with *Postman*, you can also generate code snippets by selecting a request and clicking on the **Code** button.  ## Enabling CORS  [Cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) is a browser security feature that restricts HTTP requests that are initiated from scripts running in the browser.  For details on enabling/configuring CORS, see [Enabling CORS](https://airflow.apache.org/docs/apache-airflow/stable/security/api.html).  # Authentication  To be able to meet the requirements of many organizations, Airflow supports many authentication methods, and it is even possible to add your own method.  If you want to check which auth backend is currently set, you can use `airflow config get-value api auth_backends` command as in the example below. ```bash $ airflow config get-value api auth_backends airflow.api.auth.backend.basic_auth ``` The default is to deny all requests.  For details on configuring the authentication, see [API Authorization](https://airflow.apache.org/docs/apache-airflow/stable/security/api.html).  # Errors  We follow the error response format proposed in [RFC 7807](https://tools.ietf.org/html/rfc7807) also known as Problem Details for HTTP APIs. As with our normal API responses, your client must be prepared to gracefully handle additional members of the response.  ## Unauthenticated  This indicates that the request has not been applied because it lacks valid authentication credentials for the target resource. Please check that you have valid credentials.  ## PermissionDenied  This response means that the server understood the request but refuses to authorize it because it lacks sufficient rights to the resource. It happens when you do not have the necessary permission to execute the action you performed. You need to get the appropriate permissions in other to resolve this error.  ## BadRequest  This response means that the server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). To resolve this, please ensure that your syntax is correct.  ## NotFound  This client error response indicates that the server cannot find the requested resource.  ## MethodNotAllowed  Indicates that the request method is known by the server but is not supported by the target resource.  ## NotAcceptable  The target resource does not have a current representation that would be acceptable to the user agent, according to the proactive negotiation header fields received in the request, and the server is unwilling to supply a default representation.  ## AlreadyExists  The request could not be completed due to a conflict with the current state of the target resource, e.g. the resource it tries to create already exists.  ## Unknown  This means that the server encountered an unexpected condition that prevented it from fulfilling the request. 
 *
 * The version of the OpenAPI document: 2.5.3
 * Contact: dev@airflow.apache.org
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
    public class ConnectionApiController : ControllerBase
    { 
        /// <summary>
        /// Delete a connection
        /// </summary>
        /// <param name="connectionId">The connection ID.</param>
        /// <response code="204">Success.</response>
        /// <response code="400">Client specified an invalid argument.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpDelete]
        [Route("/api/v1/connections/{connection_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteConnection")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "Client specified an invalid argument.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult DeleteConnection([FromRoute (Name = "connection_id")][Required]string connectionId)
        {

            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get a connection
        /// </summary>
        /// <param name="connectionId">The connection ID.</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/connections/{connection_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetConnection")]
        [SwaggerResponse(statusCode: 200, type: typeof(Connection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetConnection([FromRoute (Name = "connection_id")][Required]string connectionId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Connection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Connection>(exampleJson)
            : default(Connection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List connections
        /// </summary>
        /// <param name="limit">The numbers of items to return.</param>
        /// <param name="offset">The number of items to skip before starting to collect the result set.</param>
        /// <param name="orderBy">The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* </param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        [HttpGet]
        [Route("/api/v1/connections")]
        [ValidateModelState]
        [SwaggerOperation("GetConnections")]
        [SwaggerResponse(statusCode: 200, type: typeof(ConnectionCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        public virtual IActionResult GetConnections([FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]int? offset, [FromQuery (Name = "order_by")]string orderBy)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ConnectionCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ConnectionCollection>(exampleJson)
            : default(ConnectionCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update a connection
        /// </summary>
        /// <param name="connectionId">The connection ID.</param>
        /// <param name="connection"></param>
        /// <param name="updateMask">The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Client specified an invalid argument.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPatch]
        [Route("/api/v1/connections/{connection_id}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchConnection")]
        [SwaggerResponse(statusCode: 200, type: typeof(Connection), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "Client specified an invalid argument.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult PatchConnection([FromRoute (Name = "connection_id")][Required]string connectionId, [FromBody]Connection connection, [FromQuery (Name = "update_mask")]List<string> updateMask)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Connection));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Connection>(exampleJson)
            : default(Connection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Create a connection
        /// </summary>
        /// <param name="connection"></param>
        /// <response code="200">Success.</response>
        /// <response code="400">Client specified an invalid argument.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        [HttpPost]
        [Route("/api/v1/connections")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PostConnection")]
        [SwaggerResponse(statusCode: 200, type: typeof(Connection), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "Client specified an invalid argument.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        public virtual IActionResult PostConnection([FromBody]Connection connection)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Connection));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Connection>(exampleJson)
            : default(Connection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Test a connection
        /// </summary>
        /// <remarks>Test a connection.  *New in version 2.2.0* </remarks>
        /// <param name="connection"></param>
        /// <response code="200">Success.</response>
        /// <response code="400">Client specified an invalid argument.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPost]
        [Route("/api/v1/connections/test")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("TestConnection")]
        [SwaggerResponse(statusCode: 200, type: typeof(ConnectionTest), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "Client specified an invalid argument.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult TestConnection([FromBody]Connection connection)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ConnectionTest));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"message\" : \"message\",\n  \"status\" : true\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ConnectionTest>(exampleJson)
            : default(ConnectionTest);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
