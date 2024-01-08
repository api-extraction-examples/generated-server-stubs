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

// AppPriceTiersAPIController binds http requests to an api service and writes the service results to the http response
type AppPriceTiersAPIController struct {
	service AppPriceTiersAPIServicer
	errorHandler ErrorHandler
}

// AppPriceTiersAPIOption for how the controller is set up.
type AppPriceTiersAPIOption func(*AppPriceTiersAPIController)

// WithAppPriceTiersAPIErrorHandler inject ErrorHandler into controller
func WithAppPriceTiersAPIErrorHandler(h ErrorHandler) AppPriceTiersAPIOption {
	return func(c *AppPriceTiersAPIController) {
		c.errorHandler = h
	}
}

// NewAppPriceTiersAPIController creates a default api controller
func NewAppPriceTiersAPIController(s AppPriceTiersAPIServicer, opts ...AppPriceTiersAPIOption) Router {
	controller := &AppPriceTiersAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AppPriceTiersAPIController
func (c *AppPriceTiersAPIController) Routes() Routes {
	return Routes{
		"AppPriceTiersGetCollection": Route{
			strings.ToUpper("Get"),
			"/v1/appPriceTiers",
			c.AppPriceTiersGetCollection,
		},
		"AppPriceTiersGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/appPriceTiers/{id}",
			c.AppPriceTiersGetInstance,
		},
		"AppPriceTiersPricePointsGetToManyRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appPriceTiers/{id}/pricePoints",
			c.AppPriceTiersPricePointsGetToManyRelated,
		},
	}
}

// AppPriceTiersGetCollection - 
func (c *AppPriceTiersAPIController) AppPriceTiersGetCollection(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var filterIdParam []string
	if query.Has("filter[id]") {
		filterIdParam = strings.Split(query.Get("filter[id]"), ",")
	}
	var fieldsAppPriceTiersParam []string
	if query.Has("fields[appPriceTiers]") {
		fieldsAppPriceTiersParam = strings.Split(query.Get("fields[appPriceTiers]"), ",")
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
	var fieldsAppPricePointsParam []string
	if query.Has("fields[appPricePoints]") {
		fieldsAppPricePointsParam = strings.Split(query.Get("fields[appPricePoints]"), ",")
	}
	var limitPricePointsParam int32
	if query.Has("limit[pricePoints]") {
		param, err := parseNumericParameter[int32](
			query.Get("limit[pricePoints]"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](50),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitPricePointsParam = param
	} else {
	}
	result, err := c.service.AppPriceTiersGetCollection(r.Context(), filterIdParam, fieldsAppPriceTiersParam, limitParam, includeParam, fieldsAppPricePointsParam, limitPricePointsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPriceTiersGetInstance - 
func (c *AppPriceTiersAPIController) AppPriceTiersGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppPriceTiersParam []string
	if query.Has("fields[appPriceTiers]") {
		fieldsAppPriceTiersParam = strings.Split(query.Get("fields[appPriceTiers]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsAppPricePointsParam []string
	if query.Has("fields[appPricePoints]") {
		fieldsAppPricePointsParam = strings.Split(query.Get("fields[appPricePoints]"), ",")
	}
	var limitPricePointsParam int32
	if query.Has("limit[pricePoints]") {
		param, err := parseNumericParameter[int32](
			query.Get("limit[pricePoints]"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](50),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitPricePointsParam = param
	} else {
	}
	result, err := c.service.AppPriceTiersGetInstance(r.Context(), idParam, fieldsAppPriceTiersParam, includeParam, fieldsAppPricePointsParam, limitPricePointsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPriceTiersPricePointsGetToManyRelated - 
func (c *AppPriceTiersAPIController) AppPriceTiersPricePointsGetToManyRelated(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.AppPriceTiersPricePointsGetToManyRelated(r.Context(), idParam, fieldsAppPricePointsParam, limitParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
