/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// ServiceAPIController binds http requests to an api service and writes the service results to the http response
type ServiceAPIController struct {
	service ServiceAPIServicer
	errorHandler ErrorHandler
}

// ServiceAPIOption for how the controller is set up.
type ServiceAPIOption func(*ServiceAPIController)

// WithServiceAPIErrorHandler inject ErrorHandler into controller
func WithServiceAPIErrorHandler(h ErrorHandler) ServiceAPIOption {
	return func(c *ServiceAPIController) {
		c.errorHandler = h
	}
}

// NewServiceAPIController creates a default api controller
func NewServiceAPIController(s ServiceAPIServicer, opts ...ServiceAPIOption) Router {
	controller := &ServiceAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ServiceAPIController
func (c *ServiceAPIController) Routes() Routes {
	return Routes{
		"GetServices": Route{
			strings.ToUpper("Get"),
			"/api/v1/services/",
			c.GetServices,
		},
		"ShowService": Route{
			strings.ToUpper("Get"),
			"/api/v1/services/{addonName}",
			c.ShowService,
		},
		"ShowServiceManifest": Route{
			strings.ToUpper("Get"),
			"/api/v1/services/{addonName}/manifest",
			c.ShowServiceManifest,
		},
	}
}

// GetServices - 
func (c *ServiceAPIController) GetServices(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var searchParam string
	if query.Has("search") {
		param := query.Get("search")

		searchParam = param
	} else {
	}
	result, err := c.service.GetServices(r.Context(), searchParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ShowService - 
func (c *ServiceAPIController) ShowService(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	addonNameParam := params["addonName"]
	if addonNameParam == "" {
		c.errorHandler(w, r, &RequiredError{"addonName"}, nil)
		return
	}
	result, err := c.service.ShowService(r.Context(), addonNameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ShowServiceManifest - 
func (c *ServiceAPIController) ShowServiceManifest(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	addonNameParam := params["addonName"]
	if addonNameParam == "" {
		c.errorHandler(w, r, &RequiredError{"addonName"}, nil)
		return
	}
	result, err := c.service.ShowServiceManifest(r.Context(), addonNameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}