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
    public class TaskInstanceApiController : ControllerBase
    { 
        /// <summary>
        /// List extra links
        /// </summary>
        /// <remarks>List extra links for task instance. </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links")]
        [ValidateModelState]
        [SwaggerOperation("GetExtraLinks")]
        [SwaggerResponse(statusCode: 200, type: typeof(ExtraLinkCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetExtraLinks([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromRoute (Name = "task_id")][Required]string taskId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(ExtraLinkCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"extra_links\" : [ {\n    \"name\" : \"name\",\n    \"href\" : \"href\",\n    \"class_ref\" : {\n      \"class_name\" : \"class_name\",\n      \"module_path\" : \"module_path\"\n    }\n  }, {\n    \"name\" : \"name\",\n    \"href\" : \"href\",\n    \"class_ref\" : {\n      \"class_name\" : \"class_name\",\n      \"module_path\" : \"module_path\"\n    }\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<ExtraLinkCollection>(exampleJson)
            : default(ExtraLinkCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get logs
        /// </summary>
        /// <remarks>Get logs for a specific task instance and its try number.</remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <param name="taskTryNumber">The task try number.</param>
        /// <param name="fullContent">A full content will be returned. By default, only the first fragment will be returned. </param>
        /// <param name="mapIndex">Filter on map index for mapped task.</param>
        /// <param name="token">A token that allows you to continue fetching logs. If passed, it will specify the location from which the download should be continued. </param>
        /// <response code="200">Success.</response>
        /// <response code="400">Client specified an invalid argument.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}")]
        [ValidateModelState]
        [SwaggerOperation("GetLog")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetLog200Response), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "Client specified an invalid argument.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetLog([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromRoute (Name = "task_id")][Required]string taskId, [FromRoute (Name = "task_try_number")][Required]int taskTryNumber, [FromQuery (Name = "full_content")]bool? fullContent, [FromQuery (Name = "map_index")]int? mapIndex, [FromQuery (Name = "token")]string token)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetLog200Response));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"continuation_token\" : \"continuation_token\",\n  \"content\" : \"content\"\n}";
            exampleJson = "Custom MIME type example not yet supported: text/plain";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetLog200Response>(exampleJson)
            : default(GetLog200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a mapped task instance
        /// </summary>
        /// <remarks>Get details of a mapped task instance.  *New in version 2.3.0* </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <param name="mapIndex">The map index.</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/{map_index}")]
        [ValidateModelState]
        [SwaggerOperation("GetMappedTaskInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstance), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetMappedTaskInstance([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromRoute (Name = "task_id")][Required]string taskId, [FromRoute (Name = "map_index")][Required]int mapIndex)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstance));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"end_date\" : \"end_date\",\n  \"note\" : \"note\",\n  \"unixname\" : \"unixname\",\n  \"rendered_fields\" : \"{}\",\n  \"pid\" : 5,\n  \"task_id\" : \"task_id\",\n  \"operator\" : \"operator\",\n  \"sla_miss\" : {\n    \"notification_sent\" : true,\n    \"email_sent\" : true,\n    \"execution_date\" : \"execution_date\",\n    \"description\" : \"description\",\n    \"task_id\" : \"task_id\",\n    \"dag_id\" : \"dag_id\",\n    \"timestamp\" : \"timestamp\"\n  },\n  \"duration\" : 0.8008281904610115,\n  \"hostname\" : \"hostname\",\n  \"dag_id\" : \"dag_id\",\n  \"priority_weight\" : 2,\n  \"queued_when\" : \"queued_when\",\n  \"start_date\" : \"start_date\",\n  \"triggerer_job\" : {\n    \"end_date\" : \"end_date\",\n    \"job_type\" : \"job_type\",\n    \"unixname\" : \"unixname\",\n    \"hostname\" : \"hostname\",\n    \"latest_heartbeat\" : \"latest_heartbeat\",\n    \"dag_id\" : \"dag_id\",\n    \"id\" : 3,\n    \"state\" : \"state\",\n    \"executor_class\" : \"executor_class\",\n    \"start_date\" : \"start_date\"\n  },\n  \"execution_date\" : \"execution_date\",\n  \"pool_slots\" : 5,\n  \"pool\" : \"pool\",\n  \"map_index\" : 6,\n  \"max_tries\" : 1,\n  \"trigger\" : {\n    \"classpath\" : \"classpath\",\n    \"kwargs\" : \"kwargs\",\n    \"created_date\" : \"created_date\",\n    \"id\" : 7,\n    \"triggerer_id\" : 9\n  },\n  \"executor_config\" : \"executor_config\",\n  \"dag_run_id\" : \"dag_run_id\",\n  \"try_number\" : 2,\n  \"queue\" : \"queue\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstance>(exampleJson)
            : default(TaskInstance);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List mapped task instances
        /// </summary>
        /// <remarks>Get details of all mapped task instances.  *New in version 2.3.0* </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <param name="limit">The numbers of items to return.</param>
        /// <param name="offset">The number of items to skip before starting to collect the result set.</param>
        /// <param name="executionDateGte">Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte parameter to receive only the selected period. </param>
        /// <param name="executionDateLte">Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte parameter to receive only the selected period. </param>
        /// <param name="startDateGte">Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. </param>
        /// <param name="startDateLte">Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. </param>
        /// <param name="endDateGte">Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. </param>
        /// <param name="endDateLte">Returns objects less than or equal to the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. </param>
        /// <param name="durationGte">Returns objects greater than or equal to the specified values.  This can be combined with duration_lte parameter to receive only the selected period. </param>
        /// <param name="durationLte">Returns objects less than or equal to the specified values.  This can be combined with duration_gte parameter to receive only the selected range. </param>
        /// <param name="state">The value can be repeated to retrieve multiple matching values (OR condition).</param>
        /// <param name="pool">The value can be repeated to retrieve multiple matching values (OR condition).</param>
        /// <param name="queue">The value can be repeated to retrieve multiple matching values (OR condition).</param>
        /// <param name="orderBy">The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* </param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/listMapped")]
        [ValidateModelState]
        [SwaggerOperation("GetMappedTaskInstances")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstanceCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetMappedTaskInstances([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromRoute (Name = "task_id")][Required]string taskId, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]int? offset, [FromQuery (Name = "execution_date_gte")]DateTime? executionDateGte, [FromQuery (Name = "execution_date_lte")]DateTime? executionDateLte, [FromQuery (Name = "start_date_gte")]DateTime? startDateGte, [FromQuery (Name = "start_date_lte")]DateTime? startDateLte, [FromQuery (Name = "end_date_gte")]DateTime? endDateGte, [FromQuery (Name = "end_date_lte")]DateTime? endDateLte, [FromQuery (Name = "duration_gte")]decimal? durationGte, [FromQuery (Name = "duration_lte")]decimal? durationLte, [FromQuery (Name = "state")]List<string> state, [FromQuery (Name = "pool")]List<string> pool, [FromQuery (Name = "queue")]List<string> queue, [FromQuery (Name = "order_by")]string orderBy)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstanceCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstanceCollection>(exampleJson)
            : default(TaskInstanceCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a task instance
        /// </summary>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetTaskInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstance), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetTaskInstance([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromRoute (Name = "task_id")][Required]string taskId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstance));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"end_date\" : \"end_date\",\n  \"note\" : \"note\",\n  \"unixname\" : \"unixname\",\n  \"rendered_fields\" : \"{}\",\n  \"pid\" : 5,\n  \"task_id\" : \"task_id\",\n  \"operator\" : \"operator\",\n  \"sla_miss\" : {\n    \"notification_sent\" : true,\n    \"email_sent\" : true,\n    \"execution_date\" : \"execution_date\",\n    \"description\" : \"description\",\n    \"task_id\" : \"task_id\",\n    \"dag_id\" : \"dag_id\",\n    \"timestamp\" : \"timestamp\"\n  },\n  \"duration\" : 0.8008281904610115,\n  \"hostname\" : \"hostname\",\n  \"dag_id\" : \"dag_id\",\n  \"priority_weight\" : 2,\n  \"queued_when\" : \"queued_when\",\n  \"start_date\" : \"start_date\",\n  \"triggerer_job\" : {\n    \"end_date\" : \"end_date\",\n    \"job_type\" : \"job_type\",\n    \"unixname\" : \"unixname\",\n    \"hostname\" : \"hostname\",\n    \"latest_heartbeat\" : \"latest_heartbeat\",\n    \"dag_id\" : \"dag_id\",\n    \"id\" : 3,\n    \"state\" : \"state\",\n    \"executor_class\" : \"executor_class\",\n    \"start_date\" : \"start_date\"\n  },\n  \"execution_date\" : \"execution_date\",\n  \"pool_slots\" : 5,\n  \"pool\" : \"pool\",\n  \"map_index\" : 6,\n  \"max_tries\" : 1,\n  \"trigger\" : {\n    \"classpath\" : \"classpath\",\n    \"kwargs\" : \"kwargs\",\n    \"created_date\" : \"created_date\",\n    \"id\" : 7,\n    \"triggerer_id\" : 9\n  },\n  \"executor_config\" : \"executor_config\",\n  \"dag_run_id\" : \"dag_run_id\",\n  \"try_number\" : 2,\n  \"queue\" : \"queue\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstance>(exampleJson)
            : default(TaskInstance);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List task instances
        /// </summary>
        /// <remarks>This endpoint allows specifying &#x60;~&#x60; as the dag_id, dag_run_id to retrieve DAG runs for all DAGs and DAG runs. </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="executionDateGte">Returns objects greater or equal to the specified date.  This can be combined with execution_date_lte parameter to receive only the selected period. </param>
        /// <param name="executionDateLte">Returns objects less than or equal to the specified date.  This can be combined with execution_date_gte parameter to receive only the selected period. </param>
        /// <param name="startDateGte">Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. </param>
        /// <param name="startDateLte">Returns objects less or equal the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. </param>
        /// <param name="endDateGte">Returns objects greater or equal the specified date.  This can be combined with start_date_lte parameter to receive only the selected period. </param>
        /// <param name="endDateLte">Returns objects less than or equal to the specified date.  This can be combined with start_date_gte parameter to receive only the selected period. </param>
        /// <param name="durationGte">Returns objects greater than or equal to the specified values.  This can be combined with duration_lte parameter to receive only the selected period. </param>
        /// <param name="durationLte">Returns objects less than or equal to the specified values.  This can be combined with duration_gte parameter to receive only the selected range. </param>
        /// <param name="state">The value can be repeated to retrieve multiple matching values (OR condition).</param>
        /// <param name="pool">The value can be repeated to retrieve multiple matching values (OR condition).</param>
        /// <param name="queue">The value can be repeated to retrieve multiple matching values (OR condition).</param>
        /// <param name="limit">The numbers of items to return.</param>
        /// <param name="offset">The number of items to skip before starting to collect the result set.</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances")]
        [ValidateModelState]
        [SwaggerOperation("GetTaskInstances")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstanceCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        public virtual IActionResult GetTaskInstances([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromQuery (Name = "execution_date_gte")]DateTime? executionDateGte, [FromQuery (Name = "execution_date_lte")]DateTime? executionDateLte, [FromQuery (Name = "start_date_gte")]DateTime? startDateGte, [FromQuery (Name = "start_date_lte")]DateTime? startDateLte, [FromQuery (Name = "end_date_gte")]DateTime? endDateGte, [FromQuery (Name = "end_date_lte")]DateTime? endDateLte, [FromQuery (Name = "duration_gte")]decimal? durationGte, [FromQuery (Name = "duration_lte")]decimal? durationLte, [FromQuery (Name = "state")]List<string> state, [FromQuery (Name = "pool")]List<string> pool, [FromQuery (Name = "queue")]List<string> queue, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]int? offset)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstanceCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstanceCollection>(exampleJson)
            : default(TaskInstanceCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List task instances (batch)
        /// </summary>
        /// <remarks>List task instances from all DAGs and DAG runs. This endpoint is a POST to allow filtering across a large number of DAG IDs, where as a GET it would run in to maximum HTTP request URL length limits. </remarks>
        /// <param name="listTaskInstanceForm"></param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPost]
        [Route("/api/v1/dags/~/dagRuns/~/taskInstances/list")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("GetTaskInstancesBatch")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstanceCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetTaskInstancesBatch([FromBody]ListTaskInstanceForm listTaskInstanceForm)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstanceCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstanceCollection>(exampleJson)
            : default(TaskInstanceCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Updates the state of a mapped task instance
        /// </summary>
        /// <remarks>Updates the state for single mapped task instance. *New in version 2.5.0* </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <param name="mapIndex">The map index.</param>
        /// <param name="updateTaskInstance">Parameters of action</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPatch]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/{map_index}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchMappedTaskInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstanceReference), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult PatchMappedTaskInstance([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromRoute (Name = "task_id")][Required]string taskId, [FromRoute (Name = "map_index")][Required]int mapIndex, [FromBody]UpdateTaskInstance updateTaskInstance)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstanceReference));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"execution_date\" : \"execution_date\",\n  \"dag_run_id\" : \"dag_run_id\",\n  \"task_id\" : \"task_id\",\n  \"dag_id\" : \"dag_id\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstanceReference>(exampleJson)
            : default(TaskInstanceReference);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Updates the state of a task instance
        /// </summary>
        /// <remarks>Updates the state for single task instance. *New in version 2.5.0* </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <param name="updateTaskInstance">Parameters of action</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPatch]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchTaskInstance")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstanceReference), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult PatchTaskInstance([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromRoute (Name = "task_id")][Required]string taskId, [FromBody]UpdateTaskInstance updateTaskInstance)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstanceReference));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"execution_date\" : \"execution_date\",\n  \"dag_run_id\" : \"dag_run_id\",\n  \"task_id\" : \"task_id\",\n  \"dag_id\" : \"dag_id\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstanceReference>(exampleJson)
            : default(TaskInstanceReference);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update the TaskInstance note.
        /// </summary>
        /// <remarks>Update the manual user note of a mapped Task Instance.  *New in version 2.5.0* </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <param name="mapIndex">The map index.</param>
        /// <param name="setTaskInstanceNote">Parameters of set Task Instance note.</param>
        /// <response code="200">Success.</response>
        /// <response code="400">Client specified an invalid argument.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPatch]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/{map_index}/setNote")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("SetMappedTaskInstanceNote")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstance), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "Client specified an invalid argument.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult SetMappedTaskInstanceNote([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromRoute (Name = "task_id")][Required]string taskId, [FromRoute (Name = "map_index")][Required]int mapIndex, [FromBody]SetTaskInstanceNote setTaskInstanceNote)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstance));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"end_date\" : \"end_date\",\n  \"note\" : \"note\",\n  \"unixname\" : \"unixname\",\n  \"rendered_fields\" : \"{}\",\n  \"pid\" : 5,\n  \"task_id\" : \"task_id\",\n  \"operator\" : \"operator\",\n  \"sla_miss\" : {\n    \"notification_sent\" : true,\n    \"email_sent\" : true,\n    \"execution_date\" : \"execution_date\",\n    \"description\" : \"description\",\n    \"task_id\" : \"task_id\",\n    \"dag_id\" : \"dag_id\",\n    \"timestamp\" : \"timestamp\"\n  },\n  \"duration\" : 0.8008281904610115,\n  \"hostname\" : \"hostname\",\n  \"dag_id\" : \"dag_id\",\n  \"priority_weight\" : 2,\n  \"queued_when\" : \"queued_when\",\n  \"start_date\" : \"start_date\",\n  \"triggerer_job\" : {\n    \"end_date\" : \"end_date\",\n    \"job_type\" : \"job_type\",\n    \"unixname\" : \"unixname\",\n    \"hostname\" : \"hostname\",\n    \"latest_heartbeat\" : \"latest_heartbeat\",\n    \"dag_id\" : \"dag_id\",\n    \"id\" : 3,\n    \"state\" : \"state\",\n    \"executor_class\" : \"executor_class\",\n    \"start_date\" : \"start_date\"\n  },\n  \"execution_date\" : \"execution_date\",\n  \"pool_slots\" : 5,\n  \"pool\" : \"pool\",\n  \"map_index\" : 6,\n  \"max_tries\" : 1,\n  \"trigger\" : {\n    \"classpath\" : \"classpath\",\n    \"kwargs\" : \"kwargs\",\n    \"created_date\" : \"created_date\",\n    \"id\" : 7,\n    \"triggerer_id\" : 9\n  },\n  \"executor_config\" : \"executor_config\",\n  \"dag_run_id\" : \"dag_run_id\",\n  \"try_number\" : 2,\n  \"queue\" : \"queue\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstance>(exampleJson)
            : default(TaskInstance);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update the TaskInstance note.
        /// </summary>
        /// <remarks>Update the manual user note of a non-mapped Task Instance.  *New in version 2.5.0* </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="dagRunId">The DAG run ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <param name="setTaskInstanceNote">Parameters of set Task Instance note.</param>
        /// <response code="200">Success.</response>
        /// <response code="400">Client specified an invalid argument.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPatch]
        [Route("/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/setNote")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("SetTaskInstanceNote")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstance), description: "Success.")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "Client specified an invalid argument.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult SetTaskInstanceNote([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "dag_run_id")][Required]string dagRunId, [FromRoute (Name = "task_id")][Required]string taskId, [FromBody]SetTaskInstanceNote setTaskInstanceNote)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstance));
            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"end_date\" : \"end_date\",\n  \"note\" : \"note\",\n  \"unixname\" : \"unixname\",\n  \"rendered_fields\" : \"{}\",\n  \"pid\" : 5,\n  \"task_id\" : \"task_id\",\n  \"operator\" : \"operator\",\n  \"sla_miss\" : {\n    \"notification_sent\" : true,\n    \"email_sent\" : true,\n    \"execution_date\" : \"execution_date\",\n    \"description\" : \"description\",\n    \"task_id\" : \"task_id\",\n    \"dag_id\" : \"dag_id\",\n    \"timestamp\" : \"timestamp\"\n  },\n  \"duration\" : 0.8008281904610115,\n  \"hostname\" : \"hostname\",\n  \"dag_id\" : \"dag_id\",\n  \"priority_weight\" : 2,\n  \"queued_when\" : \"queued_when\",\n  \"start_date\" : \"start_date\",\n  \"triggerer_job\" : {\n    \"end_date\" : \"end_date\",\n    \"job_type\" : \"job_type\",\n    \"unixname\" : \"unixname\",\n    \"hostname\" : \"hostname\",\n    \"latest_heartbeat\" : \"latest_heartbeat\",\n    \"dag_id\" : \"dag_id\",\n    \"id\" : 3,\n    \"state\" : \"state\",\n    \"executor_class\" : \"executor_class\",\n    \"start_date\" : \"start_date\"\n  },\n  \"execution_date\" : \"execution_date\",\n  \"pool_slots\" : 5,\n  \"pool\" : \"pool\",\n  \"map_index\" : 6,\n  \"max_tries\" : 1,\n  \"trigger\" : {\n    \"classpath\" : \"classpath\",\n    \"kwargs\" : \"kwargs\",\n    \"created_date\" : \"created_date\",\n    \"id\" : 7,\n    \"triggerer_id\" : 9\n  },\n  \"executor_config\" : \"executor_config\",\n  \"dag_run_id\" : \"dag_run_id\",\n  \"try_number\" : 2,\n  \"queue\" : \"queue\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstance>(exampleJson)
            : default(TaskInstance);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
