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

// SandboxAPIController binds http requests to an api service and writes the service results to the http response
type SandboxAPIController struct {
	service SandboxAPIServicer
	errorHandler ErrorHandler
}

// SandboxAPIOption for how the controller is set up.
type SandboxAPIOption func(*SandboxAPIController)

// WithSandboxAPIErrorHandler inject ErrorHandler into controller
func WithSandboxAPIErrorHandler(h ErrorHandler) SandboxAPIOption {
	return func(c *SandboxAPIController) {
		c.errorHandler = h
	}
}

// NewSandboxAPIController creates a default api controller
func NewSandboxAPIController(s SandboxAPIServicer, opts ...SandboxAPIOption) Router {
	controller := &SandboxAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SandboxAPIController
func (c *SandboxAPIController) Routes() Routes {
	return Routes{
		"SetPrimeTime": Route{
			strings.ToUpper("Put"),
			"/v1/sandbox/primetime",
			c.SetPrimeTime,
		},
		"SetRideStatus": Route{
			strings.ToUpper("Put"),
			"/v1/sandbox/rides/{id}",
			c.SetRideStatus,
		},
		"SetRideTypeAvailability": Route{
			strings.ToUpper("Put"),
			"/v1/sandbox/ridetypes/{ride_type}",
			c.SetRideTypeAvailability,
		},
		"SetRideTypes": Route{
			strings.ToUpper("Put"),
			"/v1/sandbox/ridetypes",
			c.SetRideTypes,
		},
	}
}

// SetPrimeTime - Preset Prime Time percentage
func (c *SandboxAPIController) SetPrimeTime(w http.ResponseWriter, r *http.Request) {
	requestParam := SandboxPrimetime{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&requestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSandboxPrimetimeRequired(requestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSandboxPrimetimeConstraints(requestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetPrimeTime(r.Context(), requestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetRideStatus - Propagate ride through ride status
func (c *SandboxAPIController) SetRideStatus(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	requestParam := SandboxRideStatus{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&requestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSandboxRideStatusRequired(requestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSandboxRideStatusConstraints(requestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetRideStatus(r.Context(), idParam, requestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetRideTypeAvailability - Driver availability for processing ride request
func (c *SandboxAPIController) SetRideTypeAvailability(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	rideTypeParam := params["ride_type"]
	if rideTypeParam == "" {
		c.errorHandler(w, r, &RequiredError{"ride_type"}, nil)
		return
	}
	requestParam := SandboxDriverAvailability{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&requestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSandboxDriverAvailabilityRequired(requestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSandboxDriverAvailabilityConstraints(requestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetRideTypeAvailability(r.Context(), rideTypeParam, requestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetRideTypes - Preset types of rides for sandbox
func (c *SandboxAPIController) SetRideTypes(w http.ResponseWriter, r *http.Request) {
	requestParam := SandboxRideType{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&requestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSandboxRideTypeRequired(requestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSandboxRideTypeConstraints(requestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetRideTypes(r.Context(), requestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
