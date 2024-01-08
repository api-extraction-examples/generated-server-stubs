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

	"github.com/gorilla/mux"
)

// DatasetAPIController binds http requests to an api service and writes the service results to the http response
type DatasetAPIController struct {
	service DatasetAPIServicer
	errorHandler ErrorHandler
}

// DatasetAPIOption for how the controller is set up.
type DatasetAPIOption func(*DatasetAPIController)

// WithDatasetAPIErrorHandler inject ErrorHandler into controller
func WithDatasetAPIErrorHandler(h ErrorHandler) DatasetAPIOption {
	return func(c *DatasetAPIController) {
		c.errorHandler = h
	}
}

// NewDatasetAPIController creates a default api controller
func NewDatasetAPIController(s DatasetAPIServicer, opts ...DatasetAPIOption) Router {
	controller := &DatasetAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DatasetAPIController
func (c *DatasetAPIController) Routes() Routes {
	return Routes{
		"GetDataset": Route{
			strings.ToUpper("Get"),
			"/api/v1/datasets/{uri}",
			c.GetDataset,
		},
		"GetDatasetEvents": Route{
			strings.ToUpper("Get"),
			"/api/v1/datasets/events",
			c.GetDatasetEvents,
		},
		"GetDatasets": Route{
			strings.ToUpper("Get"),
			"/api/v1/datasets",
			c.GetDatasets,
		},
		"GetUpstreamDatasetEvents": Route{
			strings.ToUpper("Get"),
			"/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/upstreamDatasetEvents",
			c.GetUpstreamDatasetEvents,
		},
	}
}

// GetDataset - Get a dataset
func (c *DatasetAPIController) GetDataset(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	uriParam := params["uri"]
	if uriParam == "" {
		c.errorHandler(w, r, &RequiredError{"uri"}, nil)
		return
	}
	result, err := c.service.GetDataset(r.Context(), uriParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetDatasetEvents - Get dataset events
func (c *DatasetAPIController) GetDatasetEvents(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
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
	var orderByParam string
	if query.Has("order_by") {
		param := query.Get("order_by")

		orderByParam = param
	} else {
	}
	var datasetIdParam int32
	if query.Has("dataset_id") {
		param, err := parseNumericParameter[int32](
			query.Get("dataset_id"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		datasetIdParam = param
	} else {
	}
	var sourceDagIdParam string
	if query.Has("source_dag_id") {
		param := query.Get("source_dag_id")

		sourceDagIdParam = param
	} else {
	}
	var sourceTaskIdParam string
	if query.Has("source_task_id") {
		param := query.Get("source_task_id")

		sourceTaskIdParam = param
	} else {
	}
	var sourceRunIdParam string
	if query.Has("source_run_id") {
		param := query.Get("source_run_id")

		sourceRunIdParam = param
	} else {
	}
	var sourceMapIndexParam int32
	if query.Has("source_map_index") {
		param, err := parseNumericParameter[int32](
			query.Get("source_map_index"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		sourceMapIndexParam = param
	} else {
	}
	result, err := c.service.GetDatasetEvents(r.Context(), limitParam, offsetParam, orderByParam, datasetIdParam, sourceDagIdParam, sourceTaskIdParam, sourceRunIdParam, sourceMapIndexParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetDatasets - List datasets
func (c *DatasetAPIController) GetDatasets(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
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
	var orderByParam string
	if query.Has("order_by") {
		param := query.Get("order_by")

		orderByParam = param
	} else {
	}
	var uriPatternParam string
	if query.Has("uri_pattern") {
		param := query.Get("uri_pattern")

		uriPatternParam = param
	} else {
	}
	result, err := c.service.GetDatasets(r.Context(), limitParam, offsetParam, orderByParam, uriPatternParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetUpstreamDatasetEvents - Get dataset events for a DAG run
func (c *DatasetAPIController) GetUpstreamDatasetEvents(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.GetUpstreamDatasetEvents(r.Context(), dagIdParam, dagRunIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
