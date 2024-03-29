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

// BetaBuildLocalizationsAPIController binds http requests to an api service and writes the service results to the http response
type BetaBuildLocalizationsAPIController struct {
	service BetaBuildLocalizationsAPIServicer
	errorHandler ErrorHandler
}

// BetaBuildLocalizationsAPIOption for how the controller is set up.
type BetaBuildLocalizationsAPIOption func(*BetaBuildLocalizationsAPIController)

// WithBetaBuildLocalizationsAPIErrorHandler inject ErrorHandler into controller
func WithBetaBuildLocalizationsAPIErrorHandler(h ErrorHandler) BetaBuildLocalizationsAPIOption {
	return func(c *BetaBuildLocalizationsAPIController) {
		c.errorHandler = h
	}
}

// NewBetaBuildLocalizationsAPIController creates a default api controller
func NewBetaBuildLocalizationsAPIController(s BetaBuildLocalizationsAPIServicer, opts ...BetaBuildLocalizationsAPIOption) Router {
	controller := &BetaBuildLocalizationsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the BetaBuildLocalizationsAPIController
func (c *BetaBuildLocalizationsAPIController) Routes() Routes {
	return Routes{
		"BetaBuildLocalizationsBuildGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/betaBuildLocalizations/{id}/build",
			c.BetaBuildLocalizationsBuildGetToOneRelated,
		},
		"BetaBuildLocalizationsCreateInstance": Route{
			strings.ToUpper("Post"),
			"/v1/betaBuildLocalizations",
			c.BetaBuildLocalizationsCreateInstance,
		},
		"BetaBuildLocalizationsDeleteInstance": Route{
			strings.ToUpper("Delete"),
			"/v1/betaBuildLocalizations/{id}",
			c.BetaBuildLocalizationsDeleteInstance,
		},
		"BetaBuildLocalizationsGetCollection": Route{
			strings.ToUpper("Get"),
			"/v1/betaBuildLocalizations",
			c.BetaBuildLocalizationsGetCollection,
		},
		"BetaBuildLocalizationsGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/betaBuildLocalizations/{id}",
			c.BetaBuildLocalizationsGetInstance,
		},
		"BetaBuildLocalizationsUpdateInstance": Route{
			strings.ToUpper("Patch"),
			"/v1/betaBuildLocalizations/{id}",
			c.BetaBuildLocalizationsUpdateInstance,
		},
	}
}

// BetaBuildLocalizationsBuildGetToOneRelated - 
func (c *BetaBuildLocalizationsAPIController) BetaBuildLocalizationsBuildGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsBuildsParam []string
	if query.Has("fields[builds]") {
		fieldsBuildsParam = strings.Split(query.Get("fields[builds]"), ",")
	}
	result, err := c.service.BetaBuildLocalizationsBuildGetToOneRelated(r.Context(), idParam, fieldsBuildsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BetaBuildLocalizationsCreateInstance - 
func (c *BetaBuildLocalizationsAPIController) BetaBuildLocalizationsCreateInstance(w http.ResponseWriter, r *http.Request) {
	betaBuildLocalizationCreateRequestParam := BetaBuildLocalizationCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&betaBuildLocalizationCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertBetaBuildLocalizationCreateRequestRequired(betaBuildLocalizationCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertBetaBuildLocalizationCreateRequestConstraints(betaBuildLocalizationCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.BetaBuildLocalizationsCreateInstance(r.Context(), betaBuildLocalizationCreateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BetaBuildLocalizationsDeleteInstance - 
func (c *BetaBuildLocalizationsAPIController) BetaBuildLocalizationsDeleteInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.BetaBuildLocalizationsDeleteInstance(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BetaBuildLocalizationsGetCollection - 
func (c *BetaBuildLocalizationsAPIController) BetaBuildLocalizationsGetCollection(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var filterLocaleParam []string
	if query.Has("filter[locale]") {
		filterLocaleParam = strings.Split(query.Get("filter[locale]"), ",")
	}
	var filterBuildParam []string
	if query.Has("filter[build]") {
		filterBuildParam = strings.Split(query.Get("filter[build]"), ",")
	}
	var fieldsBetaBuildLocalizationsParam []string
	if query.Has("fields[betaBuildLocalizations]") {
		fieldsBetaBuildLocalizationsParam = strings.Split(query.Get("fields[betaBuildLocalizations]"), ",")
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
	var fieldsBuildsParam []string
	if query.Has("fields[builds]") {
		fieldsBuildsParam = strings.Split(query.Get("fields[builds]"), ",")
	}
	result, err := c.service.BetaBuildLocalizationsGetCollection(r.Context(), filterLocaleParam, filterBuildParam, fieldsBetaBuildLocalizationsParam, limitParam, includeParam, fieldsBuildsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BetaBuildLocalizationsGetInstance - 
func (c *BetaBuildLocalizationsAPIController) BetaBuildLocalizationsGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsBetaBuildLocalizationsParam []string
	if query.Has("fields[betaBuildLocalizations]") {
		fieldsBetaBuildLocalizationsParam = strings.Split(query.Get("fields[betaBuildLocalizations]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsBuildsParam []string
	if query.Has("fields[builds]") {
		fieldsBuildsParam = strings.Split(query.Get("fields[builds]"), ",")
	}
	result, err := c.service.BetaBuildLocalizationsGetInstance(r.Context(), idParam, fieldsBetaBuildLocalizationsParam, includeParam, fieldsBuildsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BetaBuildLocalizationsUpdateInstance - 
func (c *BetaBuildLocalizationsAPIController) BetaBuildLocalizationsUpdateInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	betaBuildLocalizationUpdateRequestParam := BetaBuildLocalizationUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&betaBuildLocalizationUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertBetaBuildLocalizationUpdateRequestRequired(betaBuildLocalizationUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertBetaBuildLocalizationUpdateRequestConstraints(betaBuildLocalizationUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.BetaBuildLocalizationsUpdateInstance(r.Context(), idParam, betaBuildLocalizationUpdateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
