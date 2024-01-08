/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// TODOSecurityAPIController binds http requests to an api service and writes the service results to the http response
type TODOSecurityAPIController struct {
	service TODOSecurityAPIServicer
	errorHandler ErrorHandler
}

// TODOSecurityAPIOption for how the controller is set up.
type TODOSecurityAPIOption func(*TODOSecurityAPIController)

// WithTODOSecurityAPIErrorHandler inject ErrorHandler into controller
func WithTODOSecurityAPIErrorHandler(h ErrorHandler) TODOSecurityAPIOption {
	return func(c *TODOSecurityAPIController) {
		c.errorHandler = h
	}
}

// NewTODOSecurityAPIController creates a default api controller
func NewTODOSecurityAPIController(s TODOSecurityAPIServicer, opts ...TODOSecurityAPIOption) Router {
	controller := &TODOSecurityAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the TODOSecurityAPIController
func (c *TODOSecurityAPIController) Routes() Routes {
	return Routes{
		"ApiV1AccountsPost": Route{
			strings.ToUpper("Post"),
			"/api/v1/accounts",
			c.ApiV1AccountsPost,
		},
	}
}

// ApiV1AccountsPost - 
func (c *TODOSecurityAPIController) ApiV1AccountsPost(w http.ResponseWriter, r *http.Request) {
	apiV1AccountsPostRequestParam := ApiV1AccountsPostRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&apiV1AccountsPostRequestParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertApiV1AccountsPostRequestRequired(apiV1AccountsPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertApiV1AccountsPostRequestConstraints(apiV1AccountsPostRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.ApiV1AccountsPost(r.Context(), apiV1AccountsPostRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}