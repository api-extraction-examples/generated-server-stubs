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

// PoolAPIController binds http requests to an api service and writes the service results to the http response
type PoolAPIController struct {
	service PoolAPIServicer
	errorHandler ErrorHandler
}

// PoolAPIOption for how the controller is set up.
type PoolAPIOption func(*PoolAPIController)

// WithPoolAPIErrorHandler inject ErrorHandler into controller
func WithPoolAPIErrorHandler(h ErrorHandler) PoolAPIOption {
	return func(c *PoolAPIController) {
		c.errorHandler = h
	}
}

// NewPoolAPIController creates a default api controller
func NewPoolAPIController(s PoolAPIServicer, opts ...PoolAPIOption) Router {
	controller := &PoolAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the PoolAPIController
func (c *PoolAPIController) Routes() Routes {
	return Routes{
		"DeletePool": Route{
			strings.ToUpper("Delete"),
			"/api/v1/pools/{pool_name}",
			c.DeletePool,
		},
		"GetPool": Route{
			strings.ToUpper("Get"),
			"/api/v1/pools/{pool_name}",
			c.GetPool,
		},
		"GetPools": Route{
			strings.ToUpper("Get"),
			"/api/v1/pools",
			c.GetPools,
		},
		"PatchPool": Route{
			strings.ToUpper("Patch"),
			"/api/v1/pools/{pool_name}",
			c.PatchPool,
		},
		"PostPool": Route{
			strings.ToUpper("Post"),
			"/api/v1/pools",
			c.PostPool,
		},
	}
}

// DeletePool - Delete a pool
func (c *PoolAPIController) DeletePool(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	poolNameParam := params["pool_name"]
	if poolNameParam == "" {
		c.errorHandler(w, r, &RequiredError{"pool_name"}, nil)
		return
	}
	result, err := c.service.DeletePool(r.Context(), poolNameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetPool - Get a pool
func (c *PoolAPIController) GetPool(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	poolNameParam := params["pool_name"]
	if poolNameParam == "" {
		c.errorHandler(w, r, &RequiredError{"pool_name"}, nil)
		return
	}
	result, err := c.service.GetPool(r.Context(), poolNameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetPools - List pools
func (c *PoolAPIController) GetPools(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.GetPools(r.Context(), limitParam, offsetParam, orderByParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PatchPool - Update a pool
func (c *PoolAPIController) PatchPool(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	poolNameParam := params["pool_name"]
	if poolNameParam == "" {
		c.errorHandler(w, r, &RequiredError{"pool_name"}, nil)
		return
	}
	poolParam := Pool{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&poolParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPoolRequired(poolParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPoolConstraints(poolParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var updateMaskParam []string
	if query.Has("update_mask") {
		updateMaskParam = strings.Split(query.Get("update_mask"), ",")
	}
	result, err := c.service.PatchPool(r.Context(), poolNameParam, poolParam, updateMaskParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PostPool - Create a pool
func (c *PoolAPIController) PostPool(w http.ResponseWriter, r *http.Request) {
	poolParam := Pool{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&poolParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPoolRequired(poolParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPoolConstraints(poolParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PostPool(r.Context(), poolParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
