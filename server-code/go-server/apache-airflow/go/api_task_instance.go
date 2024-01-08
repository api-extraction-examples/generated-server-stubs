/*
 * Airflow API (Stable)
 *
 * # Overview  To facilitate management, Apache Airflow supports a range of REST API endpoints across its objects. This section provides an overview of the API design, methods, and supported use cases.  Most of the endpoints accept `JSON` as input and return `JSON` responses. This means that you must usually add the following headers to your request: ``` Content-type: application/json Accept: application/json ```  ## Resources  The term `resource` refers to a single type of object in the Airflow metadata. An API is broken up by its endpoint's corresponding resource. The name of a resource is typically plural and expressed in camelCase. Example: `dagRuns`.  Resource names are used as part of endpoint URLs, as well as in API parameters and responses.  ## CRUD Operations  The platform supports **C**reate, **R**ead, **U**pdate, and **D**elete operations on most resources. You can review the standards for these operations and their standard parameters below.  Some endpoints have special behavior as exceptions.  ### Create  To create a resource, you typically submit an HTTP `POST` request with the resource's required metadata in the request body. The response returns a `201 Created` response code upon success with the resource's metadata, including its internal `id`, in the response body.  ### Read  The HTTP `GET` request can be used to read a resource or to list a number of resources.  A resource's `id` can be submitted in the request parameters to read a specific resource. The response usually returns a `200 OK` response code upon success, with the resource's metadata in the response body.  If a `GET` request does not include a specific resource `id`, it is treated as a list request. The response usually returns a `200 OK` response code upon success, with an object containing a list of resources' metadata in the response body.  When reading resources, some common query parameters are usually available. e.g.: ``` v1/connections?limit=25&offset=25 ```  |Query Parameter|Type|Description| |---------------|----|-----------| |limit|integer|Maximum number of objects to fetch. Usually 25 by default| |offset|integer|Offset after which to start returning objects. For use with limit query parameter.|  ### Update  Updating a resource requires the resource `id`, and is typically done using an HTTP `PATCH` request, with the fields to modify in the request body. The response usually returns a `200 OK` response code upon success, with information about the modified resource in the response body.  ### Delete  Deleting a resource requires the resource `id` and is typically executing via an HTTP `DELETE` request. The response usually returns a `204 No Content` response code upon success.  ## Conventions  - Resource names are plural and expressed in camelCase. - Names are consistent between URL parameter name and field name.  - Field names are in snake_case. ```json {     \"name\": \"string\",     \"slots\": 0,     \"occupied_slots\": 0,     \"used_slots\": 0,     \"queued_slots\": 0,     \"open_slots\": 0 } ```  ### Update Mask  Update mask is available as a query parameter in patch endpoints. It is used to notify the API which fields you want to update. Using `update_mask` makes it easier to update objects by helping the server know which fields to update in an object instead of updating all fields. The update request ignores any fields that aren't specified in the field mask, leaving them with their current values.  Example: ```   resource = request.get('/resource/my-id').json()   resource['my_field'] = 'new-value'   request.patch('/resource/my-id?update_mask=my_field', data=json.dumps(resource)) ```  ## Versioning and Endpoint Lifecycle  - API versioning is not synchronized to specific releases of the Apache Airflow. - APIs are designed to be backward compatible. - Any changes to the API will first go through a deprecation phase.  # Trying the API  You can use a third party client, such as [curl](https://curl.haxx.se/), [HTTPie](https://httpie.org/), [Postman](https://www.postman.com/) or [the Insomnia rest client](https://insomnia.rest/) to test the Apache Airflow API.  Note that you will need to pass credentials data.  For e.g., here is how to pause a DAG with [curl](https://curl.haxx.se/), when basic authorization is used: ```bash curl -X PATCH 'https://example.com/api/v1/dags/{dag_id}?update_mask=is_paused' \\ -H 'Content-Type: application/json' \\ --user \"username:password\" \\ -d '{     \"is_paused\": true }' ```  Using a graphical tool such as [Postman](https://www.postman.com/) or [Insomnia](https://insomnia.rest/), it is possible to import the API specifications directly:  1. Download the API specification by clicking the **Download** button at top of this document 2. Import the JSON specification in the graphical tool of your choice.   - In *Postman*, you can click the **import** button at the top   - With *Insomnia*, you can just drag-and-drop the file on the UI  Note that with *Postman*, you can also generate code snippets by selecting a request and clicking on the **Code** button.  ## Enabling CORS  [Cross-origin resource sharing (CORS)](https://developer.mozilla.org/en-US/docs/Web/HTTP/CORS) is a browser security feature that restricts HTTP requests that are initiated from scripts running in the browser.  For details on enabling/configuring CORS, see [Enabling CORS](https://airflow.apache.org/docs/apache-airflow/stable/security/api.html).  # Authentication  To be able to meet the requirements of many organizations, Airflow supports many authentication methods, and it is even possible to add your own method.  If you want to check which auth backend is currently set, you can use `airflow config get-value api auth_backends` command as in the example below. ```bash $ airflow config get-value api auth_backends airflow.api.auth.backend.basic_auth ``` The default is to deny all requests.  For details on configuring the authentication, see [API Authorization](https://airflow.apache.org/docs/apache-airflow/stable/security/api.html).  # Errors  We follow the error response format proposed in [RFC 7807](https://tools.ietf.org/html/rfc7807) also known as Problem Details for HTTP APIs. As with our normal API responses, your client must be prepared to gracefully handle additional members of the response.  ## Unauthenticated  This indicates that the request has not been applied because it lacks valid authentication credentials for the target resource. Please check that you have valid credentials.  ## PermissionDenied  This response means that the server understood the request but refuses to authorize it because it lacks sufficient rights to the resource. It happens when you do not have the necessary permission to execute the action you performed. You need to get the appropriate permissions in other to resolve this error.  ## BadRequest  This response means that the server cannot or will not process the request due to something that is perceived to be a client error (e.g., malformed request syntax, invalid request message framing, or deceptive request routing). To resolve this, please ensure that your syntax is correct.  ## NotFound  This client error response indicates that the server cannot find the requested resource.  ## MethodNotAllowed  Indicates that the request method is known by the server but is not supported by the target resource.  ## NotAcceptable  The target resource does not have a current representation that would be acceptable to the user agent, according to the proactive negotiation header fields received in the request, and the server is unwilling to supply a default representation.  ## AlreadyExists  The request could not be completed due to a conflict with the current state of the target resource, e.g. the resource it tries to create already exists.  ## Unknown  This means that the server encountered an unexpected condition that prevented it from fulfilling the request. 
 *
 * API version: 2.5.3
 * Contact: dev@airflow.apache.org
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"
	"time"
	"reflect"

	"github.com/gorilla/mux"
)

// TaskInstanceAPIController binds http requests to an api service and writes the service results to the http response
type TaskInstanceAPIController struct {
	service TaskInstanceAPIServicer
	errorHandler ErrorHandler
}

// TaskInstanceAPIOption for how the controller is set up.
type TaskInstanceAPIOption func(*TaskInstanceAPIController)

// WithTaskInstanceAPIErrorHandler inject ErrorHandler into controller
func WithTaskInstanceAPIErrorHandler(h ErrorHandler) TaskInstanceAPIOption {
	return func(c *TaskInstanceAPIController) {
		c.errorHandler = h
	}
}

// NewTaskInstanceAPIController creates a default api controller
func NewTaskInstanceAPIController(s TaskInstanceAPIServicer, opts ...TaskInstanceAPIOption) Router {
	controller := &TaskInstanceAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the TaskInstanceAPIController
func (c *TaskInstanceAPIController) Routes() Routes {
	return Routes{
		"GetExtraLinks": Route{
			strings.ToUpper("Get"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links",
			c.GetExtraLinks,
		},
		"GetLog": Route{
			strings.ToUpper("Get"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}",
			c.GetLog,
		},
		"GetMappedTaskInstance": Route{
			strings.ToUpper("Get"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/{map_index}",
			c.GetMappedTaskInstance,
		},
		"GetMappedTaskInstances": Route{
			strings.ToUpper("Get"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/listMapped",
			c.GetMappedTaskInstances,
		},
		"GetTaskInstance": Route{
			strings.ToUpper("Get"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}",
			c.GetTaskInstance,
		},
		"GetTaskInstances": Route{
			strings.ToUpper("Get"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances",
			c.GetTaskInstances,
		},
		"GetTaskInstancesBatch": Route{
			strings.ToUpper("Post"),
			"/api/v1/dags/~/dagRuns/~/taskInstances/list",
			c.GetTaskInstancesBatch,
		},
		"PatchMappedTaskInstance": Route{
			strings.ToUpper("Patch"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/{map_index}",
			c.PatchMappedTaskInstance,
		},
		"PatchTaskInstance": Route{
			strings.ToUpper("Patch"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}",
			c.PatchTaskInstance,
		},
		"SetMappedTaskInstanceNote": Route{
			strings.ToUpper("Patch"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/{map_index}/setNote",
			c.SetMappedTaskInstanceNote,
		},
		"SetTaskInstanceNote": Route{
			strings.ToUpper("Patch"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/setNote",
			c.SetTaskInstanceNote,
		},
	}
}

// GetExtraLinks - List extra links
func (c *TaskInstanceAPIController) GetExtraLinks(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	taskIdParam := params["task_id"]
	if taskIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"task_id"}, nil)
		return
	}
	result, err := c.service.GetExtraLinks(r.Context(), dagIdParam, dagRunIdParam, taskIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetLog - Get logs
func (c *TaskInstanceAPIController) GetLog(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	taskIdParam := params["task_id"]
	if taskIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"task_id"}, nil)
		return
	}
	taskTryNumberParam, err := parseNumericParameter[int32](
		params["task_try_number"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var fullContentParam bool
	if query.Has("full_content") {
		param, err := parseBoolParameter(
			query.Get("full_content"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		fullContentParam = param
	} else {
	}
	var mapIndexParam int32
	if query.Has("map_index") {
		param, err := parseNumericParameter[int32](
			query.Get("map_index"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		mapIndexParam = param
	} else {
	}
	var tokenParam string
	if query.Has("token") {
		param := query.Get("token")

		tokenParam = param
	} else {
	}
	result, err := c.service.GetLog(r.Context(), dagIdParam, dagRunIdParam, taskIdParam, taskTryNumberParam, fullContentParam, mapIndexParam, tokenParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetMappedTaskInstance - Get a mapped task instance
func (c *TaskInstanceAPIController) GetMappedTaskInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	taskIdParam := params["task_id"]
	if taskIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"task_id"}, nil)
		return
	}
	mapIndexParam, err := parseNumericParameter[int32](
		params["map_index"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.GetMappedTaskInstance(r.Context(), dagIdParam, dagRunIdParam, taskIdParam, mapIndexParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetMappedTaskInstances - List mapped task instances
func (c *TaskInstanceAPIController) GetMappedTaskInstances(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	taskIdParam := params["task_id"]
	if taskIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"task_id"}, nil)
		return
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
		var param int32 = 100
		limitParam = param
	}
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](0),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
	}
	var executionDateGteParam time.Time
	if query.Has("execution_date_gte"){
		param, err := parseTime(query.Get("execution_date_gte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		executionDateGteParam = param
	} else {
	}
	var executionDateLteParam time.Time
	if query.Has("execution_date_lte"){
		param, err := parseTime(query.Get("execution_date_lte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		executionDateLteParam = param
	} else {
	}
	var startDateGteParam time.Time
	if query.Has("start_date_gte"){
		param, err := parseTime(query.Get("start_date_gte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startDateGteParam = param
	} else {
	}
	var startDateLteParam time.Time
	if query.Has("start_date_lte"){
		param, err := parseTime(query.Get("start_date_lte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startDateLteParam = param
	} else {
	}
	var endDateGteParam time.Time
	if query.Has("end_date_gte"){
		param, err := parseTime(query.Get("end_date_gte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		endDateGteParam = param
	} else {
	}
	var endDateLteParam time.Time
	if query.Has("end_date_lte"){
		param, err := parseTime(query.Get("end_date_lte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		endDateLteParam = param
	} else {
	}
	var durationGteParam float32
	if query.Has("duration_gte") {
		param, err := parseNumericParameter[float32](
			query.Get("duration_gte"),
			WithParse[float32](parseFloat32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		durationGteParam = param
	} else {
	}
	var durationLteParam float32
	if query.Has("duration_lte") {
		param, err := parseNumericParameter[float32](
			query.Get("duration_lte"),
			WithParse[float32](parseFloat32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		durationLteParam = param
	} else {
	}
	var stateParam []string
	if query.Has("state") {
		stateParam = strings.Split(query.Get("state"), ",")
	}
	var poolParam []string
	if query.Has("pool") {
		poolParam = strings.Split(query.Get("pool"), ",")
	}
	var queueParam []string
	if query.Has("queue") {
		queueParam = strings.Split(query.Get("queue"), ",")
	}
	var orderByParam string
	if query.Has("order_by") {
		param := query.Get("order_by")

		orderByParam = param
	} else {
	}
	result, err := c.service.GetMappedTaskInstances(r.Context(), dagIdParam, dagRunIdParam, taskIdParam, limitParam, offsetParam, executionDateGteParam, executionDateLteParam, startDateGteParam, startDateLteParam, endDateGteParam, endDateLteParam, durationGteParam, durationLteParam, stateParam, poolParam, queueParam, orderByParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetTaskInstance - Get a task instance
func (c *TaskInstanceAPIController) GetTaskInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	taskIdParam := params["task_id"]
	if taskIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"task_id"}, nil)
		return
	}
	result, err := c.service.GetTaskInstance(r.Context(), dagIdParam, dagRunIdParam, taskIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetTaskInstances - List task instances
func (c *TaskInstanceAPIController) GetTaskInstances(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	var executionDateGteParam time.Time
	if query.Has("execution_date_gte"){
		param, err := parseTime(query.Get("execution_date_gte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		executionDateGteParam = param
	} else {
	}
	var executionDateLteParam time.Time
	if query.Has("execution_date_lte"){
		param, err := parseTime(query.Get("execution_date_lte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		executionDateLteParam = param
	} else {
	}
	var startDateGteParam time.Time
	if query.Has("start_date_gte"){
		param, err := parseTime(query.Get("start_date_gte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startDateGteParam = param
	} else {
	}
	var startDateLteParam time.Time
	if query.Has("start_date_lte"){
		param, err := parseTime(query.Get("start_date_lte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startDateLteParam = param
	} else {
	}
	var endDateGteParam time.Time
	if query.Has("end_date_gte"){
		param, err := parseTime(query.Get("end_date_gte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		endDateGteParam = param
	} else {
	}
	var endDateLteParam time.Time
	if query.Has("end_date_lte"){
		param, err := parseTime(query.Get("end_date_lte"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		endDateLteParam = param
	} else {
	}
	var durationGteParam float32
	if query.Has("duration_gte") {
		param, err := parseNumericParameter[float32](
			query.Get("duration_gte"),
			WithParse[float32](parseFloat32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		durationGteParam = param
	} else {
	}
	var durationLteParam float32
	if query.Has("duration_lte") {
		param, err := parseNumericParameter[float32](
			query.Get("duration_lte"),
			WithParse[float32](parseFloat32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		durationLteParam = param
	} else {
	}
	var stateParam []string
	if query.Has("state") {
		stateParam = strings.Split(query.Get("state"), ",")
	}
	var poolParam []string
	if query.Has("pool") {
		poolParam = strings.Split(query.Get("pool"), ",")
	}
	var queueParam []string
	if query.Has("queue") {
		queueParam = strings.Split(query.Get("queue"), ",")
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
		var param int32 = 100
		limitParam = param
	}
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](0),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
	}
	result, err := c.service.GetTaskInstances(r.Context(), dagIdParam, dagRunIdParam, executionDateGteParam, executionDateLteParam, startDateGteParam, startDateLteParam, endDateGteParam, endDateLteParam, durationGteParam, durationLteParam, stateParam, poolParam, queueParam, limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetTaskInstancesBatch - List task instances (batch)
func (c *TaskInstanceAPIController) GetTaskInstancesBatch(w http.ResponseWriter, r *http.Request) {
	listTaskInstanceFormParam := ListTaskInstanceForm{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&listTaskInstanceFormParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertListTaskInstanceFormRequired(listTaskInstanceFormParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertListTaskInstanceFormConstraints(listTaskInstanceFormParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.GetTaskInstancesBatch(r.Context(), listTaskInstanceFormParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PatchMappedTaskInstance - Updates the state of a mapped task instance
func (c *TaskInstanceAPIController) PatchMappedTaskInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	taskIdParam := params["task_id"]
	if taskIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"task_id"}, nil)
		return
	}
	mapIndexParam, err := parseNumericParameter[int32](
		params["map_index"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	updateTaskInstanceParam := UpdateTaskInstance{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateTaskInstanceParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateTaskInstanceRequired(updateTaskInstanceParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateTaskInstanceConstraints(updateTaskInstanceParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PatchMappedTaskInstance(r.Context(), dagIdParam, dagRunIdParam, taskIdParam, mapIndexParam, updateTaskInstanceParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PatchTaskInstance - Updates the state of a task instance
func (c *TaskInstanceAPIController) PatchTaskInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	taskIdParam := params["task_id"]
	if taskIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"task_id"}, nil)
		return
	}
	updateTaskInstanceParam := UpdateTaskInstance{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateTaskInstanceParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateTaskInstanceRequired(updateTaskInstanceParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateTaskInstanceConstraints(updateTaskInstanceParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PatchTaskInstance(r.Context(), dagIdParam, dagRunIdParam, taskIdParam, updateTaskInstanceParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetMappedTaskInstanceNote - Update the TaskInstance note.
func (c *TaskInstanceAPIController) SetMappedTaskInstanceNote(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	taskIdParam := params["task_id"]
	if taskIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"task_id"}, nil)
		return
	}
	mapIndexParam, err := parseNumericParameter[int32](
		params["map_index"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	setTaskInstanceNoteParam := SetTaskInstanceNote{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&setTaskInstanceNoteParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSetTaskInstanceNoteRequired(setTaskInstanceNoteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSetTaskInstanceNoteConstraints(setTaskInstanceNoteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetMappedTaskInstanceNote(r.Context(), dagIdParam, dagRunIdParam, taskIdParam, mapIndexParam, setTaskInstanceNoteParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetTaskInstanceNote - Update the TaskInstance note.
func (c *TaskInstanceAPIController) SetTaskInstanceNote(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	dagIdParam := params["dag_id"]
	if dagIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_id"}, nil)
		return
	}
	dagRunIdParam := params["dag_run_id"]
	if dagRunIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dag_run_id"}, nil)
		return
	}
	taskIdParam := params["task_id"]
	if taskIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"task_id"}, nil)
		return
	}
	setTaskInstanceNoteParam := SetTaskInstanceNote{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&setTaskInstanceNoteParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSetTaskInstanceNoteRequired(setTaskInstanceNoteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSetTaskInstanceNoteConstraints(setTaskInstanceNoteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetTaskInstanceNote(r.Context(), dagIdParam, dagRunIdParam, taskIdParam, setTaskInstanceNoteParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
