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

	"github.com/gorilla/mux"
)

// IssueCustomFieldValuesAppsAPIController binds http requests to an api service and writes the service results to the http response
type IssueCustomFieldValuesAppsAPIController struct {
	service IssueCustomFieldValuesAppsAPIServicer
	errorHandler ErrorHandler
}

// IssueCustomFieldValuesAppsAPIOption for how the controller is set up.
type IssueCustomFieldValuesAppsAPIOption func(*IssueCustomFieldValuesAppsAPIController)

// WithIssueCustomFieldValuesAppsAPIErrorHandler inject ErrorHandler into controller
func WithIssueCustomFieldValuesAppsAPIErrorHandler(h ErrorHandler) IssueCustomFieldValuesAppsAPIOption {
	return func(c *IssueCustomFieldValuesAppsAPIController) {
		c.errorHandler = h
	}
}

// NewIssueCustomFieldValuesAppsAPIController creates a default api controller
func NewIssueCustomFieldValuesAppsAPIController(s IssueCustomFieldValuesAppsAPIServicer, opts ...IssueCustomFieldValuesAppsAPIOption) Router {
	controller := &IssueCustomFieldValuesAppsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the IssueCustomFieldValuesAppsAPIController
func (c *IssueCustomFieldValuesAppsAPIController) Routes() Routes {
	return Routes{
		"UpdateCustomFieldValue": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/app/field/{fieldIdOrKey}/value",
			c.UpdateCustomFieldValue,
		},
		"UpdateMultipleCustomFieldValues": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/app/field/value",
			c.UpdateMultipleCustomFieldValues,
		},
	}
}

// UpdateCustomFieldValue - Update custom field value
func (c *IssueCustomFieldValuesAppsAPIController) UpdateCustomFieldValue(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	fieldIdOrKeyParam := params["fieldIdOrKey"]
	if fieldIdOrKeyParam == "" {
		c.errorHandler(w, r, &RequiredError{"fieldIdOrKey"}, nil)
		return
	}
	customFieldValueUpdateDetailsParam := CustomFieldValueUpdateDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&customFieldValueUpdateDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCustomFieldValueUpdateDetailsRequired(customFieldValueUpdateDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCustomFieldValueUpdateDetailsConstraints(customFieldValueUpdateDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var generateChangelogParam bool
	if query.Has("generateChangelog") {
		param, err := parseBoolParameter(
			query.Get("generateChangelog"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		generateChangelogParam = param
	} else {
		var param bool = true
		generateChangelogParam = param
	}
	result, err := c.service.UpdateCustomFieldValue(r.Context(), fieldIdOrKeyParam, customFieldValueUpdateDetailsParam, generateChangelogParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateMultipleCustomFieldValues - Update custom fields
func (c *IssueCustomFieldValuesAppsAPIController) UpdateMultipleCustomFieldValues(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	multipleCustomFieldValuesUpdateDetailsParam := MultipleCustomFieldValuesUpdateDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&multipleCustomFieldValuesUpdateDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertMultipleCustomFieldValuesUpdateDetailsRequired(multipleCustomFieldValuesUpdateDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertMultipleCustomFieldValuesUpdateDetailsConstraints(multipleCustomFieldValuesUpdateDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var generateChangelogParam bool
	if query.Has("generateChangelog") {
		param, err := parseBoolParameter(
			query.Get("generateChangelog"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		generateChangelogParam = param
	} else {
		var param bool = true
		generateChangelogParam = param
	}
	result, err := c.service.UpdateMultipleCustomFieldValues(r.Context(), multipleCustomFieldValuesUpdateDetailsParam, generateChangelogParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
