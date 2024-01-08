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

// AppPreOrdersAPIController binds http requests to an api service and writes the service results to the http response
type AppPreOrdersAPIController struct {
	service AppPreOrdersAPIServicer
	errorHandler ErrorHandler
}

// AppPreOrdersAPIOption for how the controller is set up.
type AppPreOrdersAPIOption func(*AppPreOrdersAPIController)

// WithAppPreOrdersAPIErrorHandler inject ErrorHandler into controller
func WithAppPreOrdersAPIErrorHandler(h ErrorHandler) AppPreOrdersAPIOption {
	return func(c *AppPreOrdersAPIController) {
		c.errorHandler = h
	}
}

// NewAppPreOrdersAPIController creates a default api controller
func NewAppPreOrdersAPIController(s AppPreOrdersAPIServicer, opts ...AppPreOrdersAPIOption) Router {
	controller := &AppPreOrdersAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AppPreOrdersAPIController
func (c *AppPreOrdersAPIController) Routes() Routes {
	return Routes{
		"AppPreOrdersCreateInstance": Route{
			strings.ToUpper("Post"),
			"/v1/appPreOrders",
			c.AppPreOrdersCreateInstance,
		},
		"AppPreOrdersDeleteInstance": Route{
			strings.ToUpper("Delete"),
			"/v1/appPreOrders/{id}",
			c.AppPreOrdersDeleteInstance,
		},
		"AppPreOrdersGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/appPreOrders/{id}",
			c.AppPreOrdersGetInstance,
		},
		"AppPreOrdersUpdateInstance": Route{
			strings.ToUpper("Patch"),
			"/v1/appPreOrders/{id}",
			c.AppPreOrdersUpdateInstance,
		},
	}
}

// AppPreOrdersCreateInstance - 
func (c *AppPreOrdersAPIController) AppPreOrdersCreateInstance(w http.ResponseWriter, r *http.Request) {
	appPreOrderCreateRequestParam := AppPreOrderCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appPreOrderCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppPreOrderCreateRequestRequired(appPreOrderCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppPreOrderCreateRequestConstraints(appPreOrderCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppPreOrdersCreateInstance(r.Context(), appPreOrderCreateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPreOrdersDeleteInstance - 
func (c *AppPreOrdersAPIController) AppPreOrdersDeleteInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.AppPreOrdersDeleteInstance(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPreOrdersGetInstance - 
func (c *AppPreOrdersAPIController) AppPreOrdersGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppPreOrdersParam []string
	if query.Has("fields[appPreOrders]") {
		fieldsAppPreOrdersParam = strings.Split(query.Get("fields[appPreOrders]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	result, err := c.service.AppPreOrdersGetInstance(r.Context(), idParam, fieldsAppPreOrdersParam, includeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppPreOrdersUpdateInstance - 
func (c *AppPreOrdersAPIController) AppPreOrdersUpdateInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	appPreOrderUpdateRequestParam := AppPreOrderUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appPreOrderUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppPreOrderUpdateRequestRequired(appPreOrderUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppPreOrderUpdateRequestConstraints(appPreOrderUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppPreOrdersUpdateInstance(r.Context(), idParam, appPreOrderUpdateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
