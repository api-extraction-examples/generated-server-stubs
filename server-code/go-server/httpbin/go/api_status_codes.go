/*
 * httpbin.org
 *
 * A simple HTTP Request & Response Service.<br/> <br/> <b>Run locally: </b> <code>$ docker run -p 80:80 kennethreitz/httpbin</code>
 *
 * API version: 0.9.2
 * Contact: me@kennethreitz.org
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// StatusCodesAPIController binds http requests to an api service and writes the service results to the http response
type StatusCodesAPIController struct {
	service StatusCodesAPIServicer
	errorHandler ErrorHandler
}

// StatusCodesAPIOption for how the controller is set up.
type StatusCodesAPIOption func(*StatusCodesAPIController)

// WithStatusCodesAPIErrorHandler inject ErrorHandler into controller
func WithStatusCodesAPIErrorHandler(h ErrorHandler) StatusCodesAPIOption {
	return func(c *StatusCodesAPIController) {
		c.errorHandler = h
	}
}

// NewStatusCodesAPIController creates a default api controller
func NewStatusCodesAPIController(s StatusCodesAPIServicer, opts ...StatusCodesAPIOption) Router {
	controller := &StatusCodesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the StatusCodesAPIController
func (c *StatusCodesAPIController) Routes() Routes {
	return Routes{
		"StatusCodesDelete": Route{
			strings.ToUpper("Delete"),
			"/status/{codes}",
			c.StatusCodesDelete,
		},
		"StatusCodesGet": Route{
			strings.ToUpper("Get"),
			"/status/{codes}",
			c.StatusCodesGet,
		},
		"StatusCodesPatch": Route{
			strings.ToUpper("Patch"),
			"/status/{codes}",
			c.StatusCodesPatch,
		},
		"StatusCodesPost": Route{
			strings.ToUpper("Post"),
			"/status/{codes}",
			c.StatusCodesPost,
		},
		"StatusCodesPut": Route{
			strings.ToUpper("Put"),
			"/status/{codes}",
			c.StatusCodesPut,
		},
		"StatusCodesTrace": Route{
			strings.ToUpper("Trace"),
			"/status/{codes}",
			c.StatusCodesTrace,
		},
	}
}

// StatusCodesDelete - Return status code or random status code if more than one are given
func (c *StatusCodesAPIController) StatusCodesDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	codesParam := params["codes"]
	if codesParam == "" {
		c.errorHandler(w, r, &RequiredError{"codes"}, nil)
		return
	}
	result, err := c.service.StatusCodesDelete(r.Context(), codesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// StatusCodesGet - Return status code or random status code if more than one are given
func (c *StatusCodesAPIController) StatusCodesGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	codesParam := params["codes"]
	if codesParam == "" {
		c.errorHandler(w, r, &RequiredError{"codes"}, nil)
		return
	}
	result, err := c.service.StatusCodesGet(r.Context(), codesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// StatusCodesPatch - Return status code or random status code if more than one are given
func (c *StatusCodesAPIController) StatusCodesPatch(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	codesParam := params["codes"]
	if codesParam == "" {
		c.errorHandler(w, r, &RequiredError{"codes"}, nil)
		return
	}
	result, err := c.service.StatusCodesPatch(r.Context(), codesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// StatusCodesPost - Return status code or random status code if more than one are given
func (c *StatusCodesAPIController) StatusCodesPost(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	codesParam := params["codes"]
	if codesParam == "" {
		c.errorHandler(w, r, &RequiredError{"codes"}, nil)
		return
	}
	result, err := c.service.StatusCodesPost(r.Context(), codesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// StatusCodesPut - Return status code or random status code if more than one are given
func (c *StatusCodesAPIController) StatusCodesPut(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	codesParam := params["codes"]
	if codesParam == "" {
		c.errorHandler(w, r, &RequiredError{"codes"}, nil)
		return
	}
	result, err := c.service.StatusCodesPut(r.Context(), codesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// StatusCodesTrace - Return status code or random status code if more than one are given
func (c *StatusCodesAPIController) StatusCodesTrace(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	codesParam := params["codes"]
	if codesParam == "" {
		c.errorHandler(w, r, &RequiredError{"codes"}, nil)
		return
	}
	result, err := c.service.StatusCodesTrace(r.Context(), codesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
