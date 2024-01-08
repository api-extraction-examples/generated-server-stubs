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

// CookiesAPIController binds http requests to an api service and writes the service results to the http response
type CookiesAPIController struct {
	service CookiesAPIServicer
	errorHandler ErrorHandler
}

// CookiesAPIOption for how the controller is set up.
type CookiesAPIOption func(*CookiesAPIController)

// WithCookiesAPIErrorHandler inject ErrorHandler into controller
func WithCookiesAPIErrorHandler(h ErrorHandler) CookiesAPIOption {
	return func(c *CookiesAPIController) {
		c.errorHandler = h
	}
}

// NewCookiesAPIController creates a default api controller
func NewCookiesAPIController(s CookiesAPIServicer, opts ...CookiesAPIOption) Router {
	controller := &CookiesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the CookiesAPIController
func (c *CookiesAPIController) Routes() Routes {
	return Routes{
		"CookiesDeleteGet": Route{
			strings.ToUpper("Get"),
			"/cookies/delete",
			c.CookiesDeleteGet,
		},
		"CookiesGet": Route{
			strings.ToUpper("Get"),
			"/cookies",
			c.CookiesGet,
		},
		"CookiesSetGet": Route{
			strings.ToUpper("Get"),
			"/cookies/set",
			c.CookiesSetGet,
		},
		"CookiesSetNameValueGet": Route{
			strings.ToUpper("Get"),
			"/cookies/set/{name}/{value}",
			c.CookiesSetNameValueGet,
		},
	}
}

// CookiesDeleteGet - Deletes cookie(s) as provided by the query string and redirects to cookie list.
func (c *CookiesAPIController) CookiesDeleteGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var freeformParam map[string]string
	if query.Has("freeform") {
		param := map[string]string(query.Get("freeform"))

		freeformParam = param
	} else {
	}
	result, err := c.service.CookiesDeleteGet(r.Context(), freeformParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CookiesGet - Returns cookie data.
func (c *CookiesAPIController) CookiesGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.CookiesGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CookiesSetGet - Sets cookie(s) as provided by the query string and redirects to cookie list.
func (c *CookiesAPIController) CookiesSetGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var freeformParam map[string]string
	if query.Has("freeform") {
		param := map[string]string(query.Get("freeform"))

		freeformParam = param
	} else {
	}
	result, err := c.service.CookiesSetGet(r.Context(), freeformParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CookiesSetNameValueGet - Sets a cookie and redirects to cookie list.
func (c *CookiesAPIController) CookiesSetNameValueGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	nameParam := params["name"]
	if nameParam == "" {
		c.errorHandler(w, r, &RequiredError{"name"}, nil)
		return
	}
	valueParam := params["value"]
	if valueParam == "" {
		c.errorHandler(w, r, &RequiredError{"value"}, nil)
		return
	}
	result, err := c.service.CookiesSetNameValueGet(r.Context(), nameParam, valueParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}