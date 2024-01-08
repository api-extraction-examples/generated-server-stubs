/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"
	"reflect"

	"github.com/gorilla/mux"
)

// IssueFieldsAPIController binds http requests to an api service and writes the service results to the http response
type IssueFieldsAPIController struct {
	service IssueFieldsAPIServicer
	errorHandler ErrorHandler
}

// IssueFieldsAPIOption for how the controller is set up.
type IssueFieldsAPIOption func(*IssueFieldsAPIController)

// WithIssueFieldsAPIErrorHandler inject ErrorHandler into controller
func WithIssueFieldsAPIErrorHandler(h ErrorHandler) IssueFieldsAPIOption {
	return func(c *IssueFieldsAPIController) {
		c.errorHandler = h
	}
}

// NewIssueFieldsAPIController creates a default api controller
func NewIssueFieldsAPIController(s IssueFieldsAPIServicer, opts ...IssueFieldsAPIOption) Router {
	controller := &IssueFieldsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the IssueFieldsAPIController
func (c *IssueFieldsAPIController) Routes() Routes {
	return Routes{
		"CreateCustomField": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/field",
			c.CreateCustomField,
		},
		"DeleteCustomField": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/field/{id}",
			c.DeleteCustomField,
		},
		"GetContextsForFieldDeprecated": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/field/{fieldId}/contexts",
			c.GetContextsForFieldDeprecated,
		},
		"GetFields": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/field",
			c.GetFields,
		},
		"GetFieldsPaginated": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/field/search",
			c.GetFieldsPaginated,
		},
		"GetTrashedFieldsPaginated": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/field/search/trashed",
			c.GetTrashedFieldsPaginated,
		},
		"RestoreCustomField": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/field/{id}/restore",
			c.RestoreCustomField,
		},
		"TrashCustomField": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/field/{id}/trash",
			c.TrashCustomField,
		},
		"UpdateCustomField": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/field/{fieldId}",
			c.UpdateCustomField,
		},
	}
}

// CreateCustomField - Create custom field
func (c *IssueFieldsAPIController) CreateCustomField(w http.ResponseWriter, r *http.Request) {
	customFieldDefinitionJsonBeanParam := CustomFieldDefinitionJsonBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&customFieldDefinitionJsonBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCustomFieldDefinitionJsonBeanRequired(customFieldDefinitionJsonBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCustomFieldDefinitionJsonBeanConstraints(customFieldDefinitionJsonBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateCustomField(r.Context(), customFieldDefinitionJsonBeanParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteCustomField - Delete custom field
func (c *IssueFieldsAPIController) DeleteCustomField(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.DeleteCustomField(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetContextsForFieldDeprecated - Get contexts for a field
// Deprecated
func (c *IssueFieldsAPIController) GetContextsForFieldDeprecated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	fieldIdParam := params["fieldId"]
	if fieldIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fieldId"}, nil)
		return
	}
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 20
		maxResultsParam = param
	}
	result, err := c.service.GetContextsForFieldDeprecated(r.Context(), fieldIdParam, startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetFields - Get fields
func (c *IssueFieldsAPIController) GetFields(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetFields(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetFieldsPaginated - Get fields paginated
func (c *IssueFieldsAPIController) GetFieldsPaginated(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 50
		maxResultsParam = param
	}
	var type_Param []string
	if query.Has("type") {
		type_Param = strings.Split(query.Get("type"), ",")
	}
	var idParam []string
	if query.Has("id") {
		idParam = strings.Split(query.Get("id"), ",")
	}
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var orderByParam string
	if query.Has("orderBy") {
		param := query.Get("orderBy")

		orderByParam = param
	} else {
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetFieldsPaginated(r.Context(), startAtParam, maxResultsParam, type_Param, idParam, queryParam, orderByParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetTrashedFieldsPaginated - Get fields in trash paginated
func (c *IssueFieldsAPIController) GetTrashedFieldsPaginated(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 50
		maxResultsParam = param
	}
	var idParam []string
	if query.Has("id") {
		idParam = strings.Split(query.Get("id"), ",")
	}
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	var orderByParam string
	if query.Has("orderBy") {
		param := query.Get("orderBy")

		orderByParam = param
	} else {
	}
	result, err := c.service.GetTrashedFieldsPaginated(r.Context(), startAtParam, maxResultsParam, idParam, queryParam, expandParam, orderByParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RestoreCustomField - Restore custom field from trash
func (c *IssueFieldsAPIController) RestoreCustomField(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.RestoreCustomField(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// TrashCustomField - Move custom field to trash
func (c *IssueFieldsAPIController) TrashCustomField(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.TrashCustomField(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateCustomField - Update custom field
func (c *IssueFieldsAPIController) UpdateCustomField(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	fieldIdParam := params["fieldId"]
	if fieldIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fieldId"}, nil)
		return
	}
	updateCustomFieldDetailsParam := UpdateCustomFieldDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateCustomFieldDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateCustomFieldDetailsRequired(updateCustomFieldDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateCustomFieldDetailsConstraints(updateCustomFieldDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateCustomField(r.Context(), fieldIdParam, updateCustomFieldDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
