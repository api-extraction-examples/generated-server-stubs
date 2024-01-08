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

// FormAPIController binds http requests to an api service and writes the service results to the http response
type FormAPIController struct {
	service FormAPIServicer
	errorHandler ErrorHandler
}

// FormAPIOption for how the controller is set up.
type FormAPIOption func(*FormAPIController)

// WithFormAPIErrorHandler inject ErrorHandler into controller
func WithFormAPIErrorHandler(h ErrorHandler) FormAPIOption {
	return func(c *FormAPIController) {
		c.errorHandler = h
	}
}

// NewFormAPIController creates a default api controller
func NewFormAPIController(s FormAPIServicer, opts ...FormAPIOption) Router {
	controller := &FormAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the FormAPIController
func (c *FormAPIController) Routes() Routes {
	return Routes{
		"DeleteSiteForm": Route{
			strings.ToUpper("Delete"),
			"/api/v1/sites/{site_id}/forms/{form_id}",
			c.DeleteSiteForm,
		},
		"ListSiteForms": Route{
			strings.ToUpper("Get"),
			"/api/v1/sites/{site_id}/forms",
			c.ListSiteForms,
		},
	}
}

// DeleteSiteForm - 
func (c *FormAPIController) DeleteSiteForm(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	formIdParam := params["form_id"]
	if formIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"form_id"}, nil)
		return
	}
	result, err := c.service.DeleteSiteForm(r.Context(), siteIdParam, formIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListSiteForms - 
func (c *FormAPIController) ListSiteForms(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	result, err := c.service.ListSiteForms(r.Context(), siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
