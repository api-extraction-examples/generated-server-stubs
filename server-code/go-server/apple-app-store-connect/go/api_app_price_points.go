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

// AppPricePointsAPIController binds http requests to an api service and writes the service results to the http response
type AppPricePointsAPIController struct {
	service AppPricePointsAPIServicer
	errorHandler ErrorHandler
}

// AppPricePointsAPIOption for how the controller is set up.
type AppPricePointsAPIOption func(*AppPricePointsAPIController)

// WithAppPricePointsAPIErrorHandler inject ErrorHandler into controller
func WithAppPricePointsAPIErrorHandler(h ErrorHandler) AppPricePointsAPIOption {
	return func(c *AppPricePointsAPIController) {
		c.errorHandler = h
	}
}

// NewAppPricePointsAPIController creates a default api controller
func NewAppPricePointsAPIController(s AppPricePointsAPIServicer, opts ...AppPricePointsAPIOption) Router {
	controller := &AppPricePointsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AppPricePointsAPIController
func (c *AppPricePointsAPIController) Routes() Routes {
	return Routes{
		"AppPricePointsGetCollection": Route{
			strings.ToUpper("Get"),
			"/v1/appPricePoints",
			c.AppPricePointsGetCollection,
		},
		"AppPricePointsGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/appPricePoints/{id}",
			c.AppPricePointsGetInstance,
		},
		"AppPricePointsTerritoryGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appPricePoints/{id}/territory",
			c.AppPricePointsTerritoryGetToOneRelated,
		},
	}
}

// AppPricePointsGetCollection - 
func (c *AppPricePointsAPIController) AppPricePointsGetCollection(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var filterPriceTierParam []string
	if query.Has("filter[priceTier]") {
		filterPriceTierParam = strings.Split(query.Get("filter[priceTier]"), ",")
	}
	var filterTerritoryParam []string
	if query.Has("filter[territory]") {
		filterTerritoryParam = strings.Split(query.Get("filter[territory]"), ",")
	}
	var fieldsAppPricePointsParam []string
	if query.Has("fields[appPricePoints]") {
		fieldsAppPricePointsParam = strings.Split(query.Get("fields[appPricePoints]"), ",")
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
	var fieldsTerritoriesParam []string
	if query.Has("fields[territories]") {
		fieldsTerritoriesParam = strings.Split(query.Get("fields[territories]"), ",")
	}
	result, err := c.service.AppPricePointsGetCollection(r.Context(), filterPriceTierParam, filterTerritoryParam, fieldsAppPricePointsParam, limitParam, includeParam, fieldsTerritoriesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPricePointsGetInstance - 
func (c *AppPricePointsAPIController) AppPricePointsGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppPricePointsParam []string
	if query.Has("fields[appPricePoints]") {
		fieldsAppPricePointsParam = strings.Split(query.Get("fields[appPricePoints]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsTerritoriesParam []string
	if query.Has("fields[territories]") {
		fieldsTerritoriesParam = strings.Split(query.Get("fields[territories]"), ",")
	}
	result, err := c.service.AppPricePointsGetInstance(r.Context(), idParam, fieldsAppPricePointsParam, includeParam, fieldsTerritoriesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPricePointsTerritoryGetToOneRelated - 
func (c *AppPricePointsAPIController) AppPricePointsTerritoryGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsTerritoriesParam []string
	if query.Has("fields[territories]") {
		fieldsTerritoriesParam = strings.Split(query.Get("fields[territories]"), ",")
	}
	result, err := c.service.AppPricePointsTerritoryGetToOneRelated(r.Context(), idParam, fieldsTerritoriesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
