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

// DeployKeyAPIController binds http requests to an api service and writes the service results to the http response
type DeployKeyAPIController struct {
	service DeployKeyAPIServicer
	errorHandler ErrorHandler
}

// DeployKeyAPIOption for how the controller is set up.
type DeployKeyAPIOption func(*DeployKeyAPIController)

// WithDeployKeyAPIErrorHandler inject ErrorHandler into controller
func WithDeployKeyAPIErrorHandler(h ErrorHandler) DeployKeyAPIOption {
	return func(c *DeployKeyAPIController) {
		c.errorHandler = h
	}
}

// NewDeployKeyAPIController creates a default api controller
func NewDeployKeyAPIController(s DeployKeyAPIServicer, opts ...DeployKeyAPIOption) Router {
	controller := &DeployKeyAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DeployKeyAPIController
func (c *DeployKeyAPIController) Routes() Routes {
	return Routes{
		"CreateDeployKey": Route{
			strings.ToUpper("Post"),
			"/api/v1/deploy_keys",
			c.CreateDeployKey,
		},
		"DeleteDeployKey": Route{
			strings.ToUpper("Delete"),
			"/api/v1/deploy_keys/{key_id}",
			c.DeleteDeployKey,
		},
		"GetDeployKey": Route{
			strings.ToUpper("Get"),
			"/api/v1/deploy_keys/{key_id}",
			c.GetDeployKey,
		},
		"ListDeployKeys": Route{
			strings.ToUpper("Get"),
			"/api/v1/deploy_keys",
			c.ListDeployKeys,
		},
	}
}

// CreateDeployKey - 
func (c *DeployKeyAPIController) CreateDeployKey(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.CreateDeployKey(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteDeployKey - 
func (c *DeployKeyAPIController) DeleteDeployKey(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	keyIdParam := params["key_id"]
	if keyIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"key_id"}, nil)
		return
	}
	result, err := c.service.DeleteDeployKey(r.Context(), keyIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetDeployKey - 
func (c *DeployKeyAPIController) GetDeployKey(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	keyIdParam := params["key_id"]
	if keyIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"key_id"}, nil)
		return
	}
	result, err := c.service.GetDeployKey(r.Context(), keyIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListDeployKeys - 
func (c *DeployKeyAPIController) ListDeployKeys(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ListDeployKeys(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
