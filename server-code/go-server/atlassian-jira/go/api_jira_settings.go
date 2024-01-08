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

// JiraSettingsAPIController binds http requests to an api service and writes the service results to the http response
type JiraSettingsAPIController struct {
	service JiraSettingsAPIServicer
	errorHandler ErrorHandler
}

// JiraSettingsAPIOption for how the controller is set up.
type JiraSettingsAPIOption func(*JiraSettingsAPIController)

// WithJiraSettingsAPIErrorHandler inject ErrorHandler into controller
func WithJiraSettingsAPIErrorHandler(h ErrorHandler) JiraSettingsAPIOption {
	return func(c *JiraSettingsAPIController) {
		c.errorHandler = h
	}
}

// NewJiraSettingsAPIController creates a default api controller
func NewJiraSettingsAPIController(s JiraSettingsAPIServicer, opts ...JiraSettingsAPIOption) Router {
	controller := &JiraSettingsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the JiraSettingsAPIController
func (c *JiraSettingsAPIController) Routes() Routes {
	return Routes{
		"GetAdvancedSettings": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/application-properties/advanced-settings",
			c.GetAdvancedSettings,
		},
		"GetApplicationProperty": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/application-properties",
			c.GetApplicationProperty,
		},
		"GetConfiguration": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/configuration",
			c.GetConfiguration,
		},
		"SetApplicationProperty": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/application-properties/{id}",
			c.SetApplicationProperty,
		},
	}
}

// GetAdvancedSettings - Get advanced settings
func (c *JiraSettingsAPIController) GetAdvancedSettings(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetAdvancedSettings(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetApplicationProperty - Get application property
func (c *JiraSettingsAPIController) GetApplicationProperty(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var keyParam string
	if query.Has("key") {
		param := query.Get("key")

		keyParam = param
	} else {
	}
	var permissionLevelParam string
	if query.Has("permissionLevel") {
		param := query.Get("permissionLevel")

		permissionLevelParam = param
	} else {
	}
	var keyFilterParam string
	if query.Has("keyFilter") {
		param := query.Get("keyFilter")

		keyFilterParam = param
	} else {
	}
	result, err := c.service.GetApplicationProperty(r.Context(), keyParam, permissionLevelParam, keyFilterParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetConfiguration - Get global settings
func (c *JiraSettingsAPIController) GetConfiguration(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetConfiguration(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetApplicationProperty - Set application property
func (c *JiraSettingsAPIController) SetApplicationProperty(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	simpleApplicationPropertyBeanParam := SimpleApplicationPropertyBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&simpleApplicationPropertyBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSimpleApplicationPropertyBeanRequired(simpleApplicationPropertyBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSimpleApplicationPropertyBeanConstraints(simpleApplicationPropertyBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetApplicationProperty(r.Context(), idParam, simpleApplicationPropertyBeanParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}