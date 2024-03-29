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

// EndUserLicenseAgreementsAPIController binds http requests to an api service and writes the service results to the http response
type EndUserLicenseAgreementsAPIController struct {
	service EndUserLicenseAgreementsAPIServicer
	errorHandler ErrorHandler
}

// EndUserLicenseAgreementsAPIOption for how the controller is set up.
type EndUserLicenseAgreementsAPIOption func(*EndUserLicenseAgreementsAPIController)

// WithEndUserLicenseAgreementsAPIErrorHandler inject ErrorHandler into controller
func WithEndUserLicenseAgreementsAPIErrorHandler(h ErrorHandler) EndUserLicenseAgreementsAPIOption {
	return func(c *EndUserLicenseAgreementsAPIController) {
		c.errorHandler = h
	}
}

// NewEndUserLicenseAgreementsAPIController creates a default api controller
func NewEndUserLicenseAgreementsAPIController(s EndUserLicenseAgreementsAPIServicer, opts ...EndUserLicenseAgreementsAPIOption) Router {
	controller := &EndUserLicenseAgreementsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the EndUserLicenseAgreementsAPIController
func (c *EndUserLicenseAgreementsAPIController) Routes() Routes {
	return Routes{
		"EndUserLicenseAgreementsCreateInstance": Route{
			strings.ToUpper("Post"),
			"/v1/endUserLicenseAgreements",
			c.EndUserLicenseAgreementsCreateInstance,
		},
		"EndUserLicenseAgreementsDeleteInstance": Route{
			strings.ToUpper("Delete"),
			"/v1/endUserLicenseAgreements/{id}",
			c.EndUserLicenseAgreementsDeleteInstance,
		},
		"EndUserLicenseAgreementsGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/endUserLicenseAgreements/{id}",
			c.EndUserLicenseAgreementsGetInstance,
		},
		"EndUserLicenseAgreementsTerritoriesGetToManyRelated": Route{
			strings.ToUpper("Get"),
			"/v1/endUserLicenseAgreements/{id}/territories",
			c.EndUserLicenseAgreementsTerritoriesGetToManyRelated,
		},
		"EndUserLicenseAgreementsUpdateInstance": Route{
			strings.ToUpper("Patch"),
			"/v1/endUserLicenseAgreements/{id}",
			c.EndUserLicenseAgreementsUpdateInstance,
		},
	}
}

// EndUserLicenseAgreementsCreateInstance - 
func (c *EndUserLicenseAgreementsAPIController) EndUserLicenseAgreementsCreateInstance(w http.ResponseWriter, r *http.Request) {
	endUserLicenseAgreementCreateRequestParam := EndUserLicenseAgreementCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&endUserLicenseAgreementCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertEndUserLicenseAgreementCreateRequestRequired(endUserLicenseAgreementCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertEndUserLicenseAgreementCreateRequestConstraints(endUserLicenseAgreementCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.EndUserLicenseAgreementsCreateInstance(r.Context(), endUserLicenseAgreementCreateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// EndUserLicenseAgreementsDeleteInstance - 
func (c *EndUserLicenseAgreementsAPIController) EndUserLicenseAgreementsDeleteInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.EndUserLicenseAgreementsDeleteInstance(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// EndUserLicenseAgreementsGetInstance - 
func (c *EndUserLicenseAgreementsAPIController) EndUserLicenseAgreementsGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsEndUserLicenseAgreementsParam []string
	if query.Has("fields[endUserLicenseAgreements]") {
		fieldsEndUserLicenseAgreementsParam = strings.Split(query.Get("fields[endUserLicenseAgreements]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsTerritoriesParam []string
	if query.Has("fields[territories]") {
		fieldsTerritoriesParam = strings.Split(query.Get("fields[territories]"), ",")
	}
	var limitTerritoriesParam int32
	if query.Has("limit[territories]") {
		param, err := parseNumericParameter[int32](
			query.Get("limit[territories]"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](50),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitTerritoriesParam = param
	} else {
	}
	result, err := c.service.EndUserLicenseAgreementsGetInstance(r.Context(), idParam, fieldsEndUserLicenseAgreementsParam, includeParam, fieldsTerritoriesParam, limitTerritoriesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// EndUserLicenseAgreementsTerritoriesGetToManyRelated - 
func (c *EndUserLicenseAgreementsAPIController) EndUserLicenseAgreementsTerritoriesGetToManyRelated(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.EndUserLicenseAgreementsTerritoriesGetToManyRelated(r.Context(), idParam, fieldsTerritoriesParam, limitParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// EndUserLicenseAgreementsUpdateInstance - 
func (c *EndUserLicenseAgreementsAPIController) EndUserLicenseAgreementsUpdateInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	endUserLicenseAgreementUpdateRequestParam := EndUserLicenseAgreementUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&endUserLicenseAgreementUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertEndUserLicenseAgreementUpdateRequestRequired(endUserLicenseAgreementUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertEndUserLicenseAgreementUpdateRequestConstraints(endUserLicenseAgreementUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.EndUserLicenseAgreementsUpdateInstance(r.Context(), idParam, endUserLicenseAgreementUpdateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
