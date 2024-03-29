/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * API version: 1.0.0
 * Contact: api-support@lyft.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// PublicAPIController binds http requests to an api service and writes the service results to the http response
type PublicAPIController struct {
	service PublicAPIServicer
	errorHandler ErrorHandler
}

// PublicAPIOption for how the controller is set up.
type PublicAPIOption func(*PublicAPIController)

// WithPublicAPIErrorHandler inject ErrorHandler into controller
func WithPublicAPIErrorHandler(h ErrorHandler) PublicAPIOption {
	return func(c *PublicAPIController) {
		c.errorHandler = h
	}
}

// NewPublicAPIController creates a default api controller
func NewPublicAPIController(s PublicAPIServicer, opts ...PublicAPIOption) Router {
	controller := &PublicAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the PublicAPIController
func (c *PublicAPIController) Routes() Routes {
	return Routes{
		"GetCost": Route{
			strings.ToUpper("Get"),
			"/v1/cost",
			c.GetCost,
		},
		"GetDrivers": Route{
			strings.ToUpper("Get"),
			"/v1/drivers",
			c.GetDrivers,
		},
		"GetETA": Route{
			strings.ToUpper("Get"),
			"/v1/eta",
			c.GetETA,
		},
		"GetRideTypes": Route{
			strings.ToUpper("Get"),
			"/v1/ridetypes",
			c.GetRideTypes,
		},
	}
}

// GetCost - Cost estimates
func (c *PublicAPIController) GetCost(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startLatParam float64
	if query.Has("start_lat") {
		param, err := parseNumericParameter[float64](
			query.Get("start_lat"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startLatParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "start_lat"}, nil)
		return
	}
	var startLngParam float64
	if query.Has("start_lng") {
		param, err := parseNumericParameter[float64](
			query.Get("start_lng"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startLngParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "start_lng"}, nil)
		return
	}
	var rideTypeParam string
	if query.Has("ride_type") {
		param := query.Get("ride_type")

		rideTypeParam = param
	} else {
	}
	var endLatParam float64
	if query.Has("end_lat") {
		param, err := parseNumericParameter[float64](
			query.Get("end_lat"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		endLatParam = param
	} else {
	}
	var endLngParam float64
	if query.Has("end_lng") {
		param, err := parseNumericParameter[float64](
			query.Get("end_lng"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		endLngParam = param
	} else {
	}
	result, err := c.service.GetCost(r.Context(), startLatParam, startLngParam, rideTypeParam, endLatParam, endLngParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetDrivers - Available drivers nearby
func (c *PublicAPIController) GetDrivers(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var latParam float64
	if query.Has("lat") {
		param, err := parseNumericParameter[float64](
			query.Get("lat"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		latParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "lat"}, nil)
		return
	}
	var lngParam float64
	if query.Has("lng") {
		param, err := parseNumericParameter[float64](
			query.Get("lng"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		lngParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "lng"}, nil)
		return
	}
	result, err := c.service.GetDrivers(r.Context(), latParam, lngParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetETA - Pickup ETAs
func (c *PublicAPIController) GetETA(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var latParam float64
	if query.Has("lat") {
		param, err := parseNumericParameter[float64](
			query.Get("lat"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		latParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "lat"}, nil)
		return
	}
	var lngParam float64
	if query.Has("lng") {
		param, err := parseNumericParameter[float64](
			query.Get("lng"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		lngParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "lng"}, nil)
		return
	}
	var destinationLatParam float64
	if query.Has("destination_lat") {
		param, err := parseNumericParameter[float64](
			query.Get("destination_lat"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		destinationLatParam = param
	} else {
	}
	var destinationLngParam float64
	if query.Has("destination_lng") {
		param, err := parseNumericParameter[float64](
			query.Get("destination_lng"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		destinationLngParam = param
	} else {
	}
	var rideTypeParam string
	if query.Has("ride_type") {
		param := query.Get("ride_type")

		rideTypeParam = param
	} else {
	}
	result, err := c.service.GetETA(r.Context(), latParam, lngParam, destinationLatParam, destinationLngParam, rideTypeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRideTypes - Types of rides
func (c *PublicAPIController) GetRideTypes(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var latParam float64
	if query.Has("lat") {
		param, err := parseNumericParameter[float64](
			query.Get("lat"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		latParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "lat"}, nil)
		return
	}
	var lngParam float64
	if query.Has("lng") {
		param, err := parseNumericParameter[float64](
			query.Get("lng"),
			WithParse[float64](parseFloat64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		lngParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "lng"}, nil)
		return
	}
	var rideTypeParam string
	if query.Has("ride_type") {
		param := query.Get("ride_type")

		rideTypeParam = param
	} else {
	}
	result, err := c.service.GetRideTypes(r.Context(), latParam, lngParam, rideTypeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
