/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// RssAPIController binds http requests to an api service and writes the service results to the http response
type RssAPIController struct {
	service RssAPIServicer
	errorHandler ErrorHandler
}

// RssAPIOption for how the controller is set up.
type RssAPIOption func(*RssAPIController)

// WithRssAPIErrorHandler inject ErrorHandler into controller
func WithRssAPIErrorHandler(h ErrorHandler) RssAPIOption {
	return func(c *RssAPIController) {
		c.errorHandler = h
	}
}

// NewRssAPIController creates a default api controller
func NewRssAPIController(s RssAPIServicer, opts ...RssAPIOption) Router {
	controller := &RssAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the RssAPIController
func (c *RssAPIController) Routes() Routes {
	return Routes{
		"ApiV1RssAllbillsRssGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/Rss/allbills.rss",
			c.ApiV1RssAllbillsRssGet,
		},
		"ApiV1RssBillsIdRssGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/Rss/Bills/{id}.rss",
			c.ApiV1RssBillsIdRssGet,
		},
		"ApiV1RssPrivatebillsRssGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/Rss/privatebills.rss",
			c.ApiV1RssPrivatebillsRssGet,
		},
		"ApiV1RssPublicbillsRssGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/Rss/publicbills.rss",
			c.ApiV1RssPublicbillsRssGet,
		},
	}
}

// ApiV1RssAllbillsRssGet - Returns an Rss feed of all Bills.
func (c *RssAPIController) ApiV1RssAllbillsRssGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ApiV1RssAllbillsRssGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ApiV1RssBillsIdRssGet - Returns an Rss feed of a certain Bill.
func (c *RssAPIController) ApiV1RssBillsIdRssGet(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int32](
		params["id"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.ApiV1RssBillsIdRssGet(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ApiV1RssPrivatebillsRssGet - Returns an Rss feed of private Bills.
func (c *RssAPIController) ApiV1RssPrivatebillsRssGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ApiV1RssPrivatebillsRssGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ApiV1RssPublicbillsRssGet - Returns an Rss feed of public Bills.
func (c *RssAPIController) ApiV1RssPublicbillsRssGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ApiV1RssPublicbillsRssGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
