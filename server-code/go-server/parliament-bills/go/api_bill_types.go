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

// BillTypesAPIController binds http requests to an api service and writes the service results to the http response
type BillTypesAPIController struct {
	service BillTypesAPIServicer
	errorHandler ErrorHandler
}

// BillTypesAPIOption for how the controller is set up.
type BillTypesAPIOption func(*BillTypesAPIController)

// WithBillTypesAPIErrorHandler inject ErrorHandler into controller
func WithBillTypesAPIErrorHandler(h ErrorHandler) BillTypesAPIOption {
	return func(c *BillTypesAPIController) {
		c.errorHandler = h
	}
}

// NewBillTypesAPIController creates a default api controller
func NewBillTypesAPIController(s BillTypesAPIServicer, opts ...BillTypesAPIOption) Router {
	controller := &BillTypesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the BillTypesAPIController
func (c *BillTypesAPIController) Routes() Routes {
	return Routes{
		"ApiV1BillTypesGet": Route{
			strings.ToUpper("Get"),
			"/api/v1/BillTypes",
			c.ApiV1BillTypesGet,
		},
	}
}

// ApiV1BillTypesGet - Returns a list of Bill types.
func (c *BillTypesAPIController) ApiV1BillTypesGet(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var categoryParam BillTypeCategory
	if query.Has("Category") {
		param := BillTypeCategory(query.Get("Category"))

		categoryParam = param
	} else {
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
	result, err := c.service.ApiV1BillTypesGet(r.Context(), categoryParam, skipParam, takeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}