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

// AnythingAPIController binds http requests to an api service and writes the service results to the http response
type AnythingAPIController struct {
	service AnythingAPIServicer
	errorHandler ErrorHandler
}

// AnythingAPIOption for how the controller is set up.
type AnythingAPIOption func(*AnythingAPIController)

// WithAnythingAPIErrorHandler inject ErrorHandler into controller
func WithAnythingAPIErrorHandler(h ErrorHandler) AnythingAPIOption {
	return func(c *AnythingAPIController) {
		c.errorHandler = h
	}
}

// NewAnythingAPIController creates a default api controller
func NewAnythingAPIController(s AnythingAPIServicer, opts ...AnythingAPIOption) Router {
	controller := &AnythingAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AnythingAPIController
func (c *AnythingAPIController) Routes() Routes {
	return Routes{
		"AnythingAnythingDelete": Route{
			strings.ToUpper("Delete"),
			"/anything/{anything}",
			c.AnythingAnythingDelete,
		},
		"AnythingAnythingGet": Route{
			strings.ToUpper("Get"),
			"/anything/{anything}",
			c.AnythingAnythingGet,
		},
		"AnythingAnythingPatch": Route{
			strings.ToUpper("Patch"),
			"/anything/{anything}",
			c.AnythingAnythingPatch,
		},
		"AnythingAnythingPost": Route{
			strings.ToUpper("Post"),
			"/anything/{anything}",
			c.AnythingAnythingPost,
		},
		"AnythingAnythingPut": Route{
			strings.ToUpper("Put"),
			"/anything/{anything}",
			c.AnythingAnythingPut,
		},
		"AnythingAnythingTrace": Route{
			strings.ToUpper("Trace"),
			"/anything/{anything}",
			c.AnythingAnythingTrace,
		},
		"AnythingDelete": Route{
			strings.ToUpper("Delete"),
			"/anything",
			c.AnythingDelete,
		},
		"AnythingGet": Route{
			strings.ToUpper("Get"),
			"/anything",
			c.AnythingGet,
		},
		"AnythingPatch": Route{
			strings.ToUpper("Patch"),
			"/anything",
			c.AnythingPatch,
		},
		"AnythingPost": Route{
			strings.ToUpper("Post"),
			"/anything",
			c.AnythingPost,
		},
		"AnythingPut": Route{
			strings.ToUpper("Put"),
			"/anything",
			c.AnythingPut,
		},
		"AnythingTrace": Route{
			strings.ToUpper("Trace"),
			"/anything",
			c.AnythingTrace,
		},
	}
}

// AnythingAnythingDelete - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingAnythingDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	anythingParam := params["anything"]
	if anythingParam == "" {
		c.errorHandler(w, r, &RequiredError{"anything"}, nil)
		return
	}
	result, err := c.service.AnythingAnythingDelete(r.Context(), anythingParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingAnythingGet - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingAnythingGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	anythingParam := params["anything"]
	if anythingParam == "" {
		c.errorHandler(w, r, &RequiredError{"anything"}, nil)
		return
	}
	result, err := c.service.AnythingAnythingGet(r.Context(), anythingParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingAnythingPatch - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingAnythingPatch(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	anythingParam := params["anything"]
	if anythingParam == "" {
		c.errorHandler(w, r, &RequiredError{"anything"}, nil)
		return
	}
	result, err := c.service.AnythingAnythingPatch(r.Context(), anythingParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingAnythingPost - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingAnythingPost(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	anythingParam := params["anything"]
	if anythingParam == "" {
		c.errorHandler(w, r, &RequiredError{"anything"}, nil)
		return
	}
	result, err := c.service.AnythingAnythingPost(r.Context(), anythingParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingAnythingPut - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingAnythingPut(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	anythingParam := params["anything"]
	if anythingParam == "" {
		c.errorHandler(w, r, &RequiredError{"anything"}, nil)
		return
	}
	result, err := c.service.AnythingAnythingPut(r.Context(), anythingParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingAnythingTrace - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingAnythingTrace(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	anythingParam := params["anything"]
	if anythingParam == "" {
		c.errorHandler(w, r, &RequiredError{"anything"}, nil)
		return
	}
	result, err := c.service.AnythingAnythingTrace(r.Context(), anythingParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingDelete - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingDelete(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.AnythingDelete(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingGet - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.AnythingGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingPatch - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingPatch(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.AnythingPatch(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingPost - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingPost(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.AnythingPost(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingPut - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingPut(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.AnythingPut(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AnythingTrace - Returns anything passed in request data.
func (c *AnythingAPIController) AnythingTrace(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.AnythingTrace(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
