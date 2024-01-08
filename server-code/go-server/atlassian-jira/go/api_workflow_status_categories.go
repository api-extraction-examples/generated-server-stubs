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

// WorkflowStatusCategoriesAPIController binds http requests to an api service and writes the service results to the http response
type WorkflowStatusCategoriesAPIController struct {
	service WorkflowStatusCategoriesAPIServicer
	errorHandler ErrorHandler
}

// WorkflowStatusCategoriesAPIOption for how the controller is set up.
type WorkflowStatusCategoriesAPIOption func(*WorkflowStatusCategoriesAPIController)

// WithWorkflowStatusCategoriesAPIErrorHandler inject ErrorHandler into controller
func WithWorkflowStatusCategoriesAPIErrorHandler(h ErrorHandler) WorkflowStatusCategoriesAPIOption {
	return func(c *WorkflowStatusCategoriesAPIController) {
		c.errorHandler = h
	}
}

// NewWorkflowStatusCategoriesAPIController creates a default api controller
func NewWorkflowStatusCategoriesAPIController(s WorkflowStatusCategoriesAPIServicer, opts ...WorkflowStatusCategoriesAPIOption) Router {
	controller := &WorkflowStatusCategoriesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the WorkflowStatusCategoriesAPIController
func (c *WorkflowStatusCategoriesAPIController) Routes() Routes {
	return Routes{
		"GetStatusCategories": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/statuscategory",
			c.GetStatusCategories,
		},
		"GetStatusCategory": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/statuscategory/{idOrKey}",
			c.GetStatusCategory,
		},
	}
}

// GetStatusCategories - Get all status categories
func (c *WorkflowStatusCategoriesAPIController) GetStatusCategories(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetStatusCategories(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetStatusCategory - Get status category
func (c *WorkflowStatusCategoriesAPIController) GetStatusCategory(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idOrKeyParam := params["idOrKey"]
	if idOrKeyParam == "" {
		c.errorHandler(w, r, &RequiredError{"idOrKey"}, nil)
		return
	}
	result, err := c.service.GetStatusCategory(r.Context(), idOrKeyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}