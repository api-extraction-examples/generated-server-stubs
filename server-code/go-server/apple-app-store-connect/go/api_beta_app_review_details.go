/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// BetaAppReviewDetailsAPIController binds http requests to an api service and writes the service results to the http response
type BetaAppReviewDetailsAPIController struct {
	service BetaAppReviewDetailsAPIServicer
	errorHandler ErrorHandler
}

// BetaAppReviewDetailsAPIOption for how the controller is set up.
type BetaAppReviewDetailsAPIOption func(*BetaAppReviewDetailsAPIController)

// WithBetaAppReviewDetailsAPIErrorHandler inject ErrorHandler into controller
func WithBetaAppReviewDetailsAPIErrorHandler(h ErrorHandler) BetaAppReviewDetailsAPIOption {
	return func(c *BetaAppReviewDetailsAPIController) {
		c.errorHandler = h
	}
}

// NewBetaAppReviewDetailsAPIController creates a default api controller
func NewBetaAppReviewDetailsAPIController(s BetaAppReviewDetailsAPIServicer, opts ...BetaAppReviewDetailsAPIOption) Router {
	controller := &BetaAppReviewDetailsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the BetaAppReviewDetailsAPIController
func (c *BetaAppReviewDetailsAPIController) Routes() Routes {
	return Routes{
		"BetaAppReviewDetailsAppGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/betaAppReviewDetails/{id}/app",
			c.BetaAppReviewDetailsAppGetToOneRelated,
		},
		"BetaAppReviewDetailsGetCollection": Route{
			strings.ToUpper("Get"),
			"/v1/betaAppReviewDetails",
			c.BetaAppReviewDetailsGetCollection,
		},
		"BetaAppReviewDetailsGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/betaAppReviewDetails/{id}",
			c.BetaAppReviewDetailsGetInstance,
		},
		"BetaAppReviewDetailsUpdateInstance": Route{
			strings.ToUpper("Patch"),
			"/v1/betaAppReviewDetails/{id}",
			c.BetaAppReviewDetailsUpdateInstance,
		},
	}
}

// BetaAppReviewDetailsAppGetToOneRelated - 
func (c *BetaAppReviewDetailsAPIController) BetaAppReviewDetailsAppGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppsParam []string
	if query.Has("fields[apps]") {
		fieldsAppsParam = strings.Split(query.Get("fields[apps]"), ",")
	}
	result, err := c.service.BetaAppReviewDetailsAppGetToOneRelated(r.Context(), idParam, fieldsAppsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BetaAppReviewDetailsGetCollection - 
func (c *BetaAppReviewDetailsAPIController) BetaAppReviewDetailsGetCollection(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var filterAppParam []string
	if query.Has("filter[app]") {
		filterAppParam = strings.Split(query.Get("filter[app]"), ",")
	}
	var fieldsBetaAppReviewDetailsParam []string
	if query.Has("fields[betaAppReviewDetails]") {
		fieldsBetaAppReviewDetailsParam = strings.Split(query.Get("fields[betaAppReviewDetails]"), ",")
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](200),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsAppsParam []string
	if query.Has("fields[apps]") {
		fieldsAppsParam = strings.Split(query.Get("fields[apps]"), ",")
	}
	result, err := c.service.BetaAppReviewDetailsGetCollection(r.Context(), filterAppParam, fieldsBetaAppReviewDetailsParam, limitParam, includeParam, fieldsAppsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BetaAppReviewDetailsGetInstance - 
func (c *BetaAppReviewDetailsAPIController) BetaAppReviewDetailsGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsBetaAppReviewDetailsParam []string
	if query.Has("fields[betaAppReviewDetails]") {
		fieldsBetaAppReviewDetailsParam = strings.Split(query.Get("fields[betaAppReviewDetails]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsAppsParam []string
	if query.Has("fields[apps]") {
		fieldsAppsParam = strings.Split(query.Get("fields[apps]"), ",")
	}
	result, err := c.service.BetaAppReviewDetailsGetInstance(r.Context(), idParam, fieldsBetaAppReviewDetailsParam, includeParam, fieldsAppsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BetaAppReviewDetailsUpdateInstance - 
func (c *BetaAppReviewDetailsAPIController) BetaAppReviewDetailsUpdateInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	betaAppReviewDetailUpdateRequestParam := BetaAppReviewDetailUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&betaAppReviewDetailUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertBetaAppReviewDetailUpdateRequestRequired(betaAppReviewDetailUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertBetaAppReviewDetailUpdateRequestConstraints(betaAppReviewDetailUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.BetaAppReviewDetailsUpdateInstance(r.Context(), idParam, betaAppReviewDetailUpdateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}