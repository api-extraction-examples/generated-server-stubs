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

// BillNewsAPIController binds http requests to an api service and writes the service results to the http response
type BillNewsAPIController struct {
	service BillNewsAPIServicer
	errorHandler ErrorHandler
}

// BillNewsAPIOption for how the controller is set up.
type BillNewsAPIOption func(*BillNewsAPIController)

// WithBillNewsAPIErrorHandler inject ErrorHandler into controller
func WithBillNewsAPIErrorHandler(h ErrorHandler) BillNewsAPIOption {
	return func(c *BillNewsAPIController) {
		c.errorHandler = h
	}
}

// NewBillNewsAPIController creates a default api controller
func NewBillNewsAPIController(s BillNewsAPIServicer, opts ...BillNewsAPIOption) Router {
	controller := &BillNewsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the BillNewsAPIController
func (c *BillNewsAPIController) Routes() Routes {
	return Routes{
		"GetNewsArticles": Route{
			strings.ToUpper("Get"),
			"/api/v1/Bills/{billId}/NewsArticles",
			c.GetNewsArticles,
		},
	}
}

// GetNewsArticles - Returns a list of news articles for a Bill.
func (c *BillNewsAPIController) GetNewsArticles(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	billIdParam, err := parseNumericParameter[int32](
		params["billId"],
		WithRequire[int32](parseInt32),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var skipParam int32
	if query.Has("Skip") {
		param, err := parseNumericParameter[int32](
			query.Get("Skip"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		skipParam = param
	} else {
	}
	var takeParam int32
	if query.Has("Take") {
		param, err := parseNumericParameter[int32](
			query.Get("Take"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		takeParam = param
	} else {
	}
	result, err := c.service.GetNewsArticles(r.Context(), billIdParam, skipParam, takeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
