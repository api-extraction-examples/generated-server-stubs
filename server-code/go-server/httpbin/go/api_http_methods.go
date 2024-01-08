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

// HTTPMethodsAPIController binds http requests to an api service and writes the service results to the http response
type HTTPMethodsAPIController struct {
	service HTTPMethodsAPIServicer
	errorHandler ErrorHandler
}

// HTTPMethodsAPIOption for how the controller is set up.
type HTTPMethodsAPIOption func(*HTTPMethodsAPIController)

// WithHTTPMethodsAPIErrorHandler inject ErrorHandler into controller
func WithHTTPMethodsAPIErrorHandler(h ErrorHandler) HTTPMethodsAPIOption {
	return func(c *HTTPMethodsAPIController) {
		c.errorHandler = h
	}
}

// NewHTTPMethodsAPIController creates a default api controller
func NewHTTPMethodsAPIController(s HTTPMethodsAPIServicer, opts ...HTTPMethodsAPIOption) Router {
	controller := &HTTPMethodsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the HTTPMethodsAPIController
func (c *HTTPMethodsAPIController) Routes() Routes {
	return Routes{
		"DeleteDelete": Route{
			strings.ToUpper("Delete"),
			"/delete",
			c.DeleteDelete,
		},
		"GetGet": Route{
			strings.ToUpper("Get"),
			"/get",
			c.GetGet,
		},
		"PatchPatch": Route{
			strings.ToUpper("Patch"),
			"/patch",
			c.PatchPatch,
		},
		"PostPost": Route{
			strings.ToUpper("Post"),
			"/post",
			c.PostPost,
		},
		"PutPut": Route{
			strings.ToUpper("Put"),
			"/put",
			c.PutPut,
		},
	}
}

// DeleteDelete - The request's DELETE parameters.
func (c *HTTPMethodsAPIController) DeleteDelete(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.DeleteDelete(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetGet - The request's query parameters.
func (c *HTTPMethodsAPIController) GetGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PatchPatch - The request's PATCH parameters.
func (c *HTTPMethodsAPIController) PatchPatch(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.PatchPatch(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PostPost - The request's POST parameters.
func (c *HTTPMethodsAPIController) PostPost(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.PostPost(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PutPut - The request's PUT parameters.
func (c *HTTPMethodsAPIController) PutPut(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.PutPut(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}