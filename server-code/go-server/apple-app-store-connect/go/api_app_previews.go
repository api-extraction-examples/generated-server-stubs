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

// AppPreviewsAPIController binds http requests to an api service and writes the service results to the http response
type AppPreviewsAPIController struct {
	service AppPreviewsAPIServicer
	errorHandler ErrorHandler
}

// AppPreviewsAPIOption for how the controller is set up.
type AppPreviewsAPIOption func(*AppPreviewsAPIController)

// WithAppPreviewsAPIErrorHandler inject ErrorHandler into controller
func WithAppPreviewsAPIErrorHandler(h ErrorHandler) AppPreviewsAPIOption {
	return func(c *AppPreviewsAPIController) {
		c.errorHandler = h
	}
}

// NewAppPreviewsAPIController creates a default api controller
func NewAppPreviewsAPIController(s AppPreviewsAPIServicer, opts ...AppPreviewsAPIOption) Router {
	controller := &AppPreviewsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AppPreviewsAPIController
func (c *AppPreviewsAPIController) Routes() Routes {
	return Routes{
		"AppPreviewsCreateInstance": Route{
			strings.ToUpper("Post"),
			"/v1/appPreviews",
			c.AppPreviewsCreateInstance,
		},
		"AppPreviewsDeleteInstance": Route{
			strings.ToUpper("Delete"),
			"/v1/appPreviews/{id}",
			c.AppPreviewsDeleteInstance,
		},
		"AppPreviewsGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/appPreviews/{id}",
			c.AppPreviewsGetInstance,
		},
		"AppPreviewsUpdateInstance": Route{
			strings.ToUpper("Patch"),
			"/v1/appPreviews/{id}",
			c.AppPreviewsUpdateInstance,
		},
	}
}

// AppPreviewsCreateInstance - 
func (c *AppPreviewsAPIController) AppPreviewsCreateInstance(w http.ResponseWriter, r *http.Request) {
	appPreviewCreateRequestParam := AppPreviewCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appPreviewCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppPreviewCreateRequestRequired(appPreviewCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppPreviewCreateRequestConstraints(appPreviewCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppPreviewsCreateInstance(r.Context(), appPreviewCreateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPreviewsDeleteInstance - 
func (c *AppPreviewsAPIController) AppPreviewsDeleteInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.AppPreviewsDeleteInstance(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPreviewsGetInstance - 
func (c *AppPreviewsAPIController) AppPreviewsGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppPreviewsParam []string
	if query.Has("fields[appPreviews]") {
		fieldsAppPreviewsParam = strings.Split(query.Get("fields[appPreviews]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	result, err := c.service.AppPreviewsGetInstance(r.Context(), idParam, fieldsAppPreviewsParam, includeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPreviewsUpdateInstance - 
func (c *AppPreviewsAPIController) AppPreviewsUpdateInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	appPreviewUpdateRequestParam := AppPreviewUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appPreviewUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppPreviewUpdateRequestRequired(appPreviewUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppPreviewUpdateRequestConstraints(appPreviewUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppPreviewsUpdateInstance(r.Context(), idParam, appPreviewUpdateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
