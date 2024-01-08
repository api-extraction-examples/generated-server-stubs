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

// HookAPIController binds http requests to an api service and writes the service results to the http response
type HookAPIController struct {
	service HookAPIServicer
	errorHandler ErrorHandler
}

// HookAPIOption for how the controller is set up.
type HookAPIOption func(*HookAPIController)

// WithHookAPIErrorHandler inject ErrorHandler into controller
func WithHookAPIErrorHandler(h ErrorHandler) HookAPIOption {
	return func(c *HookAPIController) {
		c.errorHandler = h
	}
}

// NewHookAPIController creates a default api controller
func NewHookAPIController(s HookAPIServicer, opts ...HookAPIOption) Router {
	controller := &HookAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the HookAPIController
func (c *HookAPIController) Routes() Routes {
	return Routes{
		"CreateHookBySiteId": Route{
			strings.ToUpper("Post"),
			"/api/v1/hooks",
			c.CreateHookBySiteId,
		},
		"DeleteHook": Route{
			strings.ToUpper("Delete"),
			"/api/v1/hooks/{hook_id}",
			c.DeleteHook,
		},
		"EnableHook": Route{
			strings.ToUpper("Post"),
			"/api/v1/hooks/{hook_id}/enable",
			c.EnableHook,
		},
		"GetHook": Route{
			strings.ToUpper("Get"),
			"/api/v1/hooks/{hook_id}",
			c.GetHook,
		},
		"ListHooksBySiteId": Route{
			strings.ToUpper("Get"),
			"/api/v1/hooks",
			c.ListHooksBySiteId,
		},
		"UpdateHook": Route{
			strings.ToUpper("Put"),
			"/api/v1/hooks/{hook_id}",
			c.UpdateHook,
		},
	}
}

// CreateHookBySiteId - 
func (c *HookAPIController) CreateHookBySiteId(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var siteIdParam string
	if query.Has("site_id") {
		param := query.Get("site_id")

		siteIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "site_id"}, nil)
		return
	}
	hookParam := Hook{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&hookParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertHookRequired(hookParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertHookConstraints(hookParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateHookBySiteId(r.Context(), siteIdParam, hookParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteHook - 
func (c *HookAPIController) DeleteHook(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	hookIdParam := params["hook_id"]
	if hookIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"hook_id"}, nil)
		return
	}
	result, err := c.service.DeleteHook(r.Context(), hookIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// EnableHook - 
func (c *HookAPIController) EnableHook(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	hookIdParam := params["hook_id"]
	if hookIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"hook_id"}, nil)
		return
	}
	result, err := c.service.EnableHook(r.Context(), hookIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetHook - 
func (c *HookAPIController) GetHook(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	hookIdParam := params["hook_id"]
	if hookIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"hook_id"}, nil)
		return
	}
	result, err := c.service.GetHook(r.Context(), hookIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListHooksBySiteId - 
func (c *HookAPIController) ListHooksBySiteId(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var siteIdParam string
	if query.Has("site_id") {
		param := query.Get("site_id")

		siteIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "site_id"}, nil)
		return
	}
	result, err := c.service.ListHooksBySiteId(r.Context(), siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateHook - 
func (c *HookAPIController) UpdateHook(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	hookIdParam := params["hook_id"]
	if hookIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"hook_id"}, nil)
		return
	}
	hookParam := Hook{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&hookParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertHookRequired(hookParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertHookConstraints(hookParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateHook(r.Context(), hookIdParam, hookParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}