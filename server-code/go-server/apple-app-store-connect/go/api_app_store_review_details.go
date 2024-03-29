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

// AppStoreReviewDetailsAPIController binds http requests to an api service and writes the service results to the http response
type AppStoreReviewDetailsAPIController struct {
	service AppStoreReviewDetailsAPIServicer
	errorHandler ErrorHandler
}

// AppStoreReviewDetailsAPIOption for how the controller is set up.
type AppStoreReviewDetailsAPIOption func(*AppStoreReviewDetailsAPIController)

// WithAppStoreReviewDetailsAPIErrorHandler inject ErrorHandler into controller
func WithAppStoreReviewDetailsAPIErrorHandler(h ErrorHandler) AppStoreReviewDetailsAPIOption {
	return func(c *AppStoreReviewDetailsAPIController) {
		c.errorHandler = h
	}
}

// NewAppStoreReviewDetailsAPIController creates a default api controller
func NewAppStoreReviewDetailsAPIController(s AppStoreReviewDetailsAPIServicer, opts ...AppStoreReviewDetailsAPIOption) Router {
	controller := &AppStoreReviewDetailsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AppStoreReviewDetailsAPIController
func (c *AppStoreReviewDetailsAPIController) Routes() Routes {
	return Routes{
		"AppStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreReviewDetails/{id}/appStoreReviewAttachments",
			c.AppStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelated,
		},
		"AppStoreReviewDetailsCreateInstance": Route{
			strings.ToUpper("Post"),
			"/v1/appStoreReviewDetails",
			c.AppStoreReviewDetailsCreateInstance,
		},
		"AppStoreReviewDetailsGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreReviewDetails/{id}",
			c.AppStoreReviewDetailsGetInstance,
		},
		"AppStoreReviewDetailsUpdateInstance": Route{
			strings.ToUpper("Patch"),
			"/v1/appStoreReviewDetails/{id}",
			c.AppStoreReviewDetailsUpdateInstance,
		},
	}
}

// AppStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelated - 
func (c *AppStoreReviewDetailsAPIController) AppStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppStoreReviewDetailsParam []string
	if query.Has("fields[appStoreReviewDetails]") {
		fieldsAppStoreReviewDetailsParam = strings.Split(query.Get("fields[appStoreReviewDetails]"), ",")
	}
	var fieldsAppStoreReviewAttachmentsParam []string
	if query.Has("fields[appStoreReviewAttachments]") {
		fieldsAppStoreReviewAttachmentsParam = strings.Split(query.Get("fields[appStoreReviewAttachments]"), ",")
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
	result, err := c.service.AppStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelated(r.Context(), idParam, fieldsAppStoreReviewDetailsParam, fieldsAppStoreReviewAttachmentsParam, limitParam, includeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreReviewDetailsCreateInstance - 
func (c *AppStoreReviewDetailsAPIController) AppStoreReviewDetailsCreateInstance(w http.ResponseWriter, r *http.Request) {
	appStoreReviewDetailCreateRequestParam := AppStoreReviewDetailCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appStoreReviewDetailCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppStoreReviewDetailCreateRequestRequired(appStoreReviewDetailCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppStoreReviewDetailCreateRequestConstraints(appStoreReviewDetailCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppStoreReviewDetailsCreateInstance(r.Context(), appStoreReviewDetailCreateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreReviewDetailsGetInstance - 
func (c *AppStoreReviewDetailsAPIController) AppStoreReviewDetailsGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppStoreReviewDetailsParam []string
	if query.Has("fields[appStoreReviewDetails]") {
		fieldsAppStoreReviewDetailsParam = strings.Split(query.Get("fields[appStoreReviewDetails]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsAppStoreReviewAttachmentsParam []string
	if query.Has("fields[appStoreReviewAttachments]") {
		fieldsAppStoreReviewAttachmentsParam = strings.Split(query.Get("fields[appStoreReviewAttachments]"), ",")
	}
	var limitAppStoreReviewAttachmentsParam int32
	if query.Has("limit[appStoreReviewAttachments]") {
		param, err := parseNumericParameter[int32](
			query.Get("limit[appStoreReviewAttachments]"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](50),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitAppStoreReviewAttachmentsParam = param
	} else {
	}
	result, err := c.service.AppStoreReviewDetailsGetInstance(r.Context(), idParam, fieldsAppStoreReviewDetailsParam, includeParam, fieldsAppStoreReviewAttachmentsParam, limitAppStoreReviewAttachmentsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreReviewDetailsUpdateInstance - 
func (c *AppStoreReviewDetailsAPIController) AppStoreReviewDetailsUpdateInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	appStoreReviewDetailUpdateRequestParam := AppStoreReviewDetailUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appStoreReviewDetailUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppStoreReviewDetailUpdateRequestRequired(appStoreReviewDetailUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppStoreReviewDetailUpdateRequestConstraints(appStoreReviewDetailUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppStoreReviewDetailsUpdateInstance(r.Context(), idParam, appStoreReviewDetailUpdateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
