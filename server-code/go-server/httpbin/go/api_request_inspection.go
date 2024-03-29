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

// RequestInspectionAPIController binds http requests to an api service and writes the service results to the http response
type RequestInspectionAPIController struct {
	service RequestInspectionAPIServicer
	errorHandler ErrorHandler
}

// RequestInspectionAPIOption for how the controller is set up.
type RequestInspectionAPIOption func(*RequestInspectionAPIController)

// WithRequestInspectionAPIErrorHandler inject ErrorHandler into controller
func WithRequestInspectionAPIErrorHandler(h ErrorHandler) RequestInspectionAPIOption {
	return func(c *RequestInspectionAPIController) {
		c.errorHandler = h
	}
}

// NewRequestInspectionAPIController creates a default api controller
func NewRequestInspectionAPIController(s RequestInspectionAPIServicer, opts ...RequestInspectionAPIOption) Router {
	controller := &RequestInspectionAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the RequestInspectionAPIController
func (c *RequestInspectionAPIController) Routes() Routes {
	return Routes{
		"HeadersGet": Route{
			strings.ToUpper("Get"),
			"/headers",
			c.HeadersGet,
		},
		"IpGet": Route{
			strings.ToUpper("Get"),
			"/ip",
			c.IpGet,
		},
		"UserAgentGet": Route{
			strings.ToUpper("Get"),
			"/user-agent",
			c.UserAgentGet,
		},
	}
}

// HeadersGet - Return the incoming request's HTTP headers.
func (c *RequestInspectionAPIController) HeadersGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.HeadersGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// IpGet - Returns the requester's IP Address.
func (c *RequestInspectionAPIController) IpGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.IpGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UserAgentGet - Return the incoming requests's User-Agent header.
func (c *RequestInspectionAPIController) UserAgentGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.UserAgentGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
