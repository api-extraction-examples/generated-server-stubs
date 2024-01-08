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

// ApplicationRolesAPIController binds http requests to an api service and writes the service results to the http response
type ApplicationRolesAPIController struct {
	service ApplicationRolesAPIServicer
	errorHandler ErrorHandler
}

// ApplicationRolesAPIOption for how the controller is set up.
type ApplicationRolesAPIOption func(*ApplicationRolesAPIController)

// WithApplicationRolesAPIErrorHandler inject ErrorHandler into controller
func WithApplicationRolesAPIErrorHandler(h ErrorHandler) ApplicationRolesAPIOption {
	return func(c *ApplicationRolesAPIController) {
		c.errorHandler = h
	}
}

// NewApplicationRolesAPIController creates a default api controller
func NewApplicationRolesAPIController(s ApplicationRolesAPIServicer, opts ...ApplicationRolesAPIOption) Router {
	controller := &ApplicationRolesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ApplicationRolesAPIController
func (c *ApplicationRolesAPIController) Routes() Routes {
	return Routes{
		"GetAllApplicationRoles": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/applicationrole",
			c.GetAllApplicationRoles,
		},
		"GetApplicationRole": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/applicationrole/{key}",
			c.GetApplicationRole,
		},
	}
}

// GetAllApplicationRoles - Get all application roles
func (c *ApplicationRolesAPIController) GetAllApplicationRoles(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetAllApplicationRoles(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetApplicationRole - Get application role
func (c *ApplicationRolesAPIController) GetApplicationRole(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	keyParam := params["key"]
	if keyParam == "" {
		c.errorHandler(w, r, &RequiredError{"key"}, nil)
		return
	}
	result, err := c.service.GetApplicationRole(r.Context(), keyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}