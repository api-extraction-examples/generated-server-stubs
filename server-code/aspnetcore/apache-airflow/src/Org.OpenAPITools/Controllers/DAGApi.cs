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
    public class DAGApiController : ControllerBase
    { 
        /// <summary>
        /// Delete a DAG
        /// </summary>
        /// <remarks>Deletes all metadata related to the DAG, including finished DAG Runs and Tasks. Logs are not deleted. This action cannot be undone.  *New in version 2.2.0* </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <response code="204">Success.</response>
        /// <response code="400">Client specified an invalid argument.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        /// <response code="409">An existing resource conflicts with the request.</response>
        [HttpDelete]
        [Route("/api/v1/dags/{dag_id}")]
        [ValidateModelState]
        [SwaggerOperation("DeleteDag")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "Client specified an invalid argument.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        [SwaggerResponse(statusCode: 409, type: typeof(Error), description: "An existing resource conflicts with the request.")]
        public virtual IActionResult DeleteDag([FromRoute (Name = "dag_id")][Required]string dagId)
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
            //TODO: Uncomment the next line to return response 409 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(409, default(Error));

            throw new NotImplementedException();
        }

        /// <summary>
        /// Get basic information about a DAG
        /// </summary>
        /// <remarks>Presents only information available in database (DAGModel). If you need detailed information, consider using GET /dags/{dag_id}/details. </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetDag")]
        [SwaggerResponse(statusCode: 200, type: typeof(DAG), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetDag([FromRoute (Name = "dag_id")][Required]string dagId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DAG));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"description\",\n  \"owners\" : [ \"owners\", \"owners\" ],\n  \"fileloc\" : \"fileloc\",\n  \"has_task_concurrency_limits\" : true,\n  \"root_dag_id\" : \"root_dag_id\",\n  \"has_import_errors\" : true,\n  \"last_pickled\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"last_parsed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"next_dagrun_create_after\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dag_id\" : \"dag_id\",\n  \"scheduler_lock\" : true,\n  \"default_view\" : \"default_view\",\n  \"next_dagrun_data_interval_end\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"next_dagrun_data_interval_start\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"is_active\" : true,\n  \"last_expired\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"max_active_runs\" : 0,\n  \"file_token\" : \"file_token\",\n  \"max_active_tasks\" : 6,\n  \"pickle_id\" : \"pickle_id\",\n  \"tags\" : [ {\n    \"name\" : \"name\"\n  }, {\n    \"name\" : \"name\"\n  } ],\n  \"timetable_description\" : \"timetable_description\",\n  \"is_paused\" : true,\n  \"is_subdag\" : true,\n  \"next_dagrun\" : \"2000-01-23T04:56:07.000+00:00\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DAG>(exampleJson)
            : default(DAG);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a simplified representation of DAG
        /// </summary>
        /// <remarks>The response contains many DAG attributes, so the response can be large. If possible, consider using GET /dags/{dag_id}. </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}/details")]
        [ValidateModelState]
        [SwaggerOperation("GetDagDetails")]
        [SwaggerResponse(statusCode: 200, type: typeof(DAGDetail), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetDagDetails([FromRoute (Name = "dag_id")][Required]string dagId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DAGDetail));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DAGDetail>(exampleJson)
            : default(DAGDetail);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get a source code
        /// </summary>
        /// <remarks>Get a source code using file token. </remarks>
        /// <param name="fileToken">The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. </param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        /// <response code="406">A specified Accept header is not allowed.</response>
        [HttpGet]
        [Route("/api/v1/dagSources/{file_token}")]
        [ValidateModelState]
        [SwaggerOperation("GetDagSource")]
        [SwaggerResponse(statusCode: 200, type: typeof(GetDagSource200Response), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        [SwaggerResponse(statusCode: 406, type: typeof(Error), description: "A specified Accept header is not allowed.")]
        public virtual IActionResult GetDagSource([FromRoute (Name = "file_token")][Required]string fileToken)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(GetDagSource200Response));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            //TODO: Uncomment the next line to return response 406 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(406, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"content\" : \"content\"\n}";
            exampleJson = "Custom MIME type example not yet supported: plain/text";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<GetDagSource200Response>(exampleJson)
            : default(GetDagSource200Response);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// List DAGs
        /// </summary>
        /// <remarks>List DAGs in the database. &#x60;dag_id_pattern&#x60; can be set to match dags of a specific pattern </remarks>
        /// <param name="limit">The numbers of items to return.</param>
        /// <param name="offset">The number of items to skip before starting to collect the result set.</param>
        /// <param name="orderBy">The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* </param>
        /// <param name="tags">List of tags to filter results.  *New in version 2.2.0* </param>
        /// <param name="onlyActive">Only filter active DAGs.  *New in version 2.1.1* </param>
        /// <param name="dagIdPattern">If set, only return DAGs with dag_ids matching this pattern. </param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        [HttpGet]
        [Route("/api/v1/dags")]
        [ValidateModelState]
        [SwaggerOperation("GetDags")]
        [SwaggerResponse(statusCode: 200, type: typeof(DAGCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        public virtual IActionResult GetDags([FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]int? offset, [FromQuery (Name = "order_by")]string orderBy, [FromQuery (Name = "tags")]List<string> tags, [FromQuery (Name = "only_active")]bool? onlyActive, [FromQuery (Name = "dag_id_pattern")]string dagIdPattern)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DAGCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DAGCollection>(exampleJson)
            : default(DAGCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get simplified representation of a task
        /// </summary>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="taskId">The task ID.</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}/tasks/{task_id}")]
        [ValidateModelState]
        [SwaggerOperation("GetTask")]
        [SwaggerResponse(statusCode: 200, type: typeof(Task), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetTask([FromRoute (Name = "dag_id")][Required]string dagId, [FromRoute (Name = "task_id")][Required]string taskId)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(Task));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"end_date\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"owner\" : \"owner\",\n  \"ui_fgcolor\" : \"ui_fgcolor\",\n  \"extra_links\" : [ {\n    \"class_ref\" : {\n      \"class_name\" : \"class_name\",\n      \"module_path\" : \"module_path\"\n    }\n  }, {\n    \"class_ref\" : {\n      \"class_name\" : \"class_name\",\n      \"module_path\" : \"module_path\"\n    }\n  } ],\n  \"depends_on_past\" : true,\n  \"ui_color\" : \"ui_color\",\n  \"pool_slots\" : 5.962133916683182,\n  \"pool\" : \"pool\",\n  \"retry_exponential_backoff\" : true,\n  \"task_id\" : \"task_id\",\n  \"downstream_task_ids\" : [ \"downstream_task_ids\", \"downstream_task_ids\" ],\n  \"sub_dag\" : {\n    \"description\" : \"description\",\n    \"owners\" : [ \"owners\", \"owners\" ],\n    \"fileloc\" : \"fileloc\",\n    \"has_task_concurrency_limits\" : true,\n    \"root_dag_id\" : \"root_dag_id\",\n    \"has_import_errors\" : true,\n    \"last_pickled\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"last_parsed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"next_dagrun_create_after\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"dag_id\" : \"dag_id\",\n    \"scheduler_lock\" : true,\n    \"default_view\" : \"default_view\",\n    \"next_dagrun_data_interval_end\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"next_dagrun_data_interval_start\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"is_active\" : true,\n    \"last_expired\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"max_active_runs\" : 0,\n    \"file_token\" : \"file_token\",\n    \"max_active_tasks\" : 6,\n    \"pickle_id\" : \"pickle_id\",\n    \"tags\" : [ {\n      \"name\" : \"name\"\n    }, {\n      \"name\" : \"name\"\n    } ],\n    \"timetable_description\" : \"timetable_description\",\n    \"is_paused\" : true,\n    \"is_subdag\" : true,\n    \"next_dagrun\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"retries\" : 2.3021358869347655,\n  \"template_fields\" : [ \"template_fields\", \"template_fields\" ],\n  \"retry_delay\" : {\n    \"seconds\" : 1,\n    \"__type\" : \"__type\",\n    \"days\" : 0,\n    \"microseconds\" : 6\n  },\n  \"is_mapped\" : true,\n  \"priority_weight\" : 5.637376656633329,\n  \"wait_for_downstream\" : true,\n  \"class_ref\" : {\n    \"class_name\" : \"class_name\",\n    \"module_path\" : \"module_path\"\n  },\n  \"execution_timeout\" : {\n    \"seconds\" : 1,\n    \"__type\" : \"__type\",\n    \"days\" : 0,\n    \"microseconds\" : 6\n  },\n  \"queue\" : \"queue\",\n  \"start_date\" : \"2000-01-23T04:56:07.000+00:00\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<Task>(exampleJson)
            : default(Task);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Get tasks for DAG
        /// </summary>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="orderBy">The name of the field to order the results by. Prefix a field name with &#x60;-&#x60; to reverse the sort order.  *New in version 2.1.0* </param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpGet]
        [Route("/api/v1/dags/{dag_id}/tasks")]
        [ValidateModelState]
        [SwaggerOperation("GetTasks")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult GetTasks([FromRoute (Name = "dag_id")][Required]string dagId, [FromQuery (Name = "order_by")]string orderBy)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"tasks\" : [ {\n    \"end_date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"owner\" : \"owner\",\n    \"ui_fgcolor\" : \"ui_fgcolor\",\n    \"extra_links\" : [ {\n      \"class_ref\" : {\n        \"class_name\" : \"class_name\",\n        \"module_path\" : \"module_path\"\n      }\n    }, {\n      \"class_ref\" : {\n        \"class_name\" : \"class_name\",\n        \"module_path\" : \"module_path\"\n      }\n    } ],\n    \"depends_on_past\" : true,\n    \"ui_color\" : \"ui_color\",\n    \"pool_slots\" : 5.962133916683182,\n    \"pool\" : \"pool\",\n    \"retry_exponential_backoff\" : true,\n    \"task_id\" : \"task_id\",\n    \"downstream_task_ids\" : [ \"downstream_task_ids\", \"downstream_task_ids\" ],\n    \"sub_dag\" : {\n      \"description\" : \"description\",\n      \"owners\" : [ \"owners\", \"owners\" ],\n      \"fileloc\" : \"fileloc\",\n      \"has_task_concurrency_limits\" : true,\n      \"root_dag_id\" : \"root_dag_id\",\n      \"has_import_errors\" : true,\n      \"last_pickled\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"last_parsed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"next_dagrun_create_after\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"dag_id\" : \"dag_id\",\n      \"scheduler_lock\" : true,\n      \"default_view\" : \"default_view\",\n      \"next_dagrun_data_interval_end\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"next_dagrun_data_interval_start\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"is_active\" : true,\n      \"last_expired\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"max_active_runs\" : 0,\n      \"file_token\" : \"file_token\",\n      \"max_active_tasks\" : 6,\n      \"pickle_id\" : \"pickle_id\",\n      \"tags\" : [ {\n        \"name\" : \"name\"\n      }, {\n        \"name\" : \"name\"\n      } ],\n      \"timetable_description\" : \"timetable_description\",\n      \"is_paused\" : true,\n      \"is_subdag\" : true,\n      \"next_dagrun\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"retries\" : 2.3021358869347655,\n    \"template_fields\" : [ \"template_fields\", \"template_fields\" ],\n    \"retry_delay\" : {\n      \"seconds\" : 1,\n      \"__type\" : \"__type\",\n      \"days\" : 0,\n      \"microseconds\" : 6\n    },\n    \"is_mapped\" : true,\n    \"priority_weight\" : 5.637376656633329,\n    \"wait_for_downstream\" : true,\n    \"class_ref\" : {\n      \"class_name\" : \"class_name\",\n      \"module_path\" : \"module_path\"\n    },\n    \"execution_timeout\" : {\n      \"seconds\" : 1,\n      \"__type\" : \"__type\",\n      \"days\" : 0,\n      \"microseconds\" : 6\n    },\n    \"queue\" : \"queue\",\n    \"start_date\" : \"2000-01-23T04:56:07.000+00:00\"\n  }, {\n    \"end_date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"owner\" : \"owner\",\n    \"ui_fgcolor\" : \"ui_fgcolor\",\n    \"extra_links\" : [ {\n      \"class_ref\" : {\n        \"class_name\" : \"class_name\",\n        \"module_path\" : \"module_path\"\n      }\n    }, {\n      \"class_ref\" : {\n        \"class_name\" : \"class_name\",\n        \"module_path\" : \"module_path\"\n      }\n    } ],\n    \"depends_on_past\" : true,\n    \"ui_color\" : \"ui_color\",\n    \"pool_slots\" : 5.962133916683182,\n    \"pool\" : \"pool\",\n    \"retry_exponential_backoff\" : true,\n    \"task_id\" : \"task_id\",\n    \"downstream_task_ids\" : [ \"downstream_task_ids\", \"downstream_task_ids\" ],\n    \"sub_dag\" : {\n      \"description\" : \"description\",\n      \"owners\" : [ \"owners\", \"owners\" ],\n      \"fileloc\" : \"fileloc\",\n      \"has_task_concurrency_limits\" : true,\n      \"root_dag_id\" : \"root_dag_id\",\n      \"has_import_errors\" : true,\n      \"last_pickled\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"last_parsed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"next_dagrun_create_after\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"dag_id\" : \"dag_id\",\n      \"scheduler_lock\" : true,\n      \"default_view\" : \"default_view\",\n      \"next_dagrun_data_interval_end\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"next_dagrun_data_interval_start\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"is_active\" : true,\n      \"last_expired\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"max_active_runs\" : 0,\n      \"file_token\" : \"file_token\",\n      \"max_active_tasks\" : 6,\n      \"pickle_id\" : \"pickle_id\",\n      \"tags\" : [ {\n        \"name\" : \"name\"\n      }, {\n        \"name\" : \"name\"\n      } ],\n      \"timetable_description\" : \"timetable_description\",\n      \"is_paused\" : true,\n      \"is_subdag\" : true,\n      \"next_dagrun\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"retries\" : 2.3021358869347655,\n    \"template_fields\" : [ \"template_fields\", \"template_fields\" ],\n    \"retry_delay\" : {\n      \"seconds\" : 1,\n      \"__type\" : \"__type\",\n      \"days\" : 0,\n      \"microseconds\" : 6\n    },\n    \"is_mapped\" : true,\n    \"priority_weight\" : 5.637376656633329,\n    \"wait_for_downstream\" : true,\n    \"class_ref\" : {\n      \"class_name\" : \"class_name\",\n      \"module_path\" : \"module_path\"\n    },\n    \"execution_timeout\" : {\n      \"seconds\" : 1,\n      \"__type\" : \"__type\",\n      \"days\" : 0,\n      \"microseconds\" : 6\n    },\n    \"queue\" : \"queue\",\n    \"start_date\" : \"2000-01-23T04:56:07.000+00:00\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskCollection>(exampleJson)
            : default(TaskCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update a DAG
        /// </summary>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="DAG"></param>
        /// <param name="updateMask">The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. </param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPatch]
        [Route("/api/v1/dags/{dag_id}")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchDag")]
        [SwaggerResponse(statusCode: 200, type: typeof(DAG), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult PatchDag([FromRoute (Name = "dag_id")][Required]string dagId, [FromBody]DAG DAG, [FromQuery (Name = "update_mask")]List<string> updateMask)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DAG));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"description\" : \"description\",\n  \"owners\" : [ \"owners\", \"owners\" ],\n  \"fileloc\" : \"fileloc\",\n  \"has_task_concurrency_limits\" : true,\n  \"root_dag_id\" : \"root_dag_id\",\n  \"has_import_errors\" : true,\n  \"last_pickled\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"last_parsed_time\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"next_dagrun_create_after\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"dag_id\" : \"dag_id\",\n  \"scheduler_lock\" : true,\n  \"default_view\" : \"default_view\",\n  \"next_dagrun_data_interval_end\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"next_dagrun_data_interval_start\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"is_active\" : true,\n  \"last_expired\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"max_active_runs\" : 0,\n  \"file_token\" : \"file_token\",\n  \"max_active_tasks\" : 6,\n  \"pickle_id\" : \"pickle_id\",\n  \"tags\" : [ {\n    \"name\" : \"name\"\n  }, {\n    \"name\" : \"name\"\n  } ],\n  \"timetable_description\" : \"timetable_description\",\n  \"is_paused\" : true,\n  \"is_subdag\" : true,\n  \"next_dagrun\" : \"2000-01-23T04:56:07.000+00:00\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DAG>(exampleJson)
            : default(DAG);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Update DAGs
        /// </summary>
        /// <remarks>Update DAGs of a given dag_id_pattern using UpdateMask. This endpoint allows specifying &#x60;~&#x60; as the dag_id_pattern to update all DAGs. *New in version 2.3.0* </remarks>
        /// <param name="dagIdPattern">If set, only update DAGs with dag_ids matching this pattern. </param>
        /// <param name="DAG"></param>
        /// <param name="limit">The numbers of items to return.</param>
        /// <param name="offset">The number of items to skip before starting to collect the result set.</param>
        /// <param name="tags">List of tags to filter results.  *New in version 2.2.0* </param>
        /// <param name="updateMask">The fields to update on the resource. If absent or empty, all modifiable fields are updated. A comma-separated list of fully qualified names of fields. </param>
        /// <param name="onlyActive">Only filter active DAGs.  *New in version 2.1.1* </param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPatch]
        [Route("/api/v1/dags")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PatchDags")]
        [SwaggerResponse(statusCode: 200, type: typeof(DAGCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult PatchDags([FromQuery (Name = "dag_id_pattern")][Required()]string dagIdPattern, [FromBody]DAG DAG, [FromQuery (Name = "limit")]int? limit, [FromQuery (Name = "offset")]int? offset, [FromQuery (Name = "tags")]List<string> tags, [FromQuery (Name = "update_mask")]List<string> updateMask, [FromQuery (Name = "only_active")]bool? onlyActive)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(DAGCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "null";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<DAGCollection>(exampleJson)
            : default(DAGCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Clear a set of task instances
        /// </summary>
        /// <remarks>Clears a set of task instances associated with the DAG for a specified date range. </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="clearTaskInstances">Parameters of action</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPost]
        [Route("/api/v1/dags/{dag_id}/clearTaskInstances")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PostClearTaskInstances")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstanceReferenceCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult PostClearTaskInstances([FromRoute (Name = "dag_id")][Required]string dagId, [FromBody]ClearTaskInstances clearTaskInstances)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstanceReferenceCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"task_instances\" : [ {\n    \"execution_date\" : \"execution_date\",\n    \"dag_run_id\" : \"dag_run_id\",\n    \"task_id\" : \"task_id\",\n    \"dag_id\" : \"dag_id\"\n  }, {\n    \"execution_date\" : \"execution_date\",\n    \"dag_run_id\" : \"dag_run_id\",\n    \"task_id\" : \"task_id\",\n    \"dag_id\" : \"dag_id\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstanceReferenceCollection>(exampleJson)
            : default(TaskInstanceReferenceCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Set a state of task instances
        /// </summary>
        /// <remarks>Updates the state for multiple task instances simultaneously. </remarks>
        /// <param name="dagId">The DAG ID.</param>
        /// <param name="updateTaskInstancesState">Parameters of action</param>
        /// <response code="200">Success.</response>
        /// <response code="401">Request not authenticated due to missing, invalid, authentication info.</response>
        /// <response code="403">Client does not have sufficient permission.</response>
        /// <response code="404">A specified resource is not found.</response>
        [HttpPost]
        [Route("/api/v1/dags/{dag_id}/updateTaskInstancesState")]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("PostSetTaskInstancesState")]
        [SwaggerResponse(statusCode: 200, type: typeof(TaskInstanceReferenceCollection), description: "Success.")]
        [SwaggerResponse(statusCode: 401, type: typeof(Error), description: "Request not authenticated due to missing, invalid, authentication info.")]
        [SwaggerResponse(statusCode: 403, type: typeof(Error), description: "Client does not have sufficient permission.")]
        [SwaggerResponse(statusCode: 404, type: typeof(Error), description: "A specified resource is not found.")]
        public virtual IActionResult PostSetTaskInstancesState([FromRoute (Name = "dag_id")][Required]string dagId, [FromBody]UpdateTaskInstancesState updateTaskInstancesState)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(TaskInstanceReferenceCollection));
            //TODO: Uncomment the next line to return response 401 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(401, default(Error));
            //TODO: Uncomment the next line to return response 403 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(403, default(Error));
            //TODO: Uncomment the next line to return response 404 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(404, default(Error));
            string exampleJson = null;
            exampleJson = "{\n  \"task_instances\" : [ {\n    \"execution_date\" : \"execution_date\",\n    \"dag_run_id\" : \"dag_run_id\",\n    \"task_id\" : \"task_id\",\n    \"dag_id\" : \"dag_id\"\n  }, {\n    \"execution_date\" : \"execution_date\",\n    \"dag_run_id\" : \"dag_run_id\",\n    \"task_id\" : \"task_id\",\n    \"dag_id\" : \"dag_id\"\n  } ]\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<TaskInstanceReferenceCollection>(exampleJson)
            : default(TaskInstanceReferenceCollection);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
