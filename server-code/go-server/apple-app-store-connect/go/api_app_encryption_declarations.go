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

// AppEncryptionDeclarationsAPIController binds http requests to an api service and writes the service results to the http response
type AppEncryptionDeclarationsAPIController struct {
	service AppEncryptionDeclarationsAPIServicer
	errorHandler ErrorHandler
}

// AppEncryptionDeclarationsAPIOption for how the controller is set up.
type AppEncryptionDeclarationsAPIOption func(*AppEncryptionDeclarationsAPIController)

// WithAppEncryptionDeclarationsAPIErrorHandler inject ErrorHandler into controller
func WithAppEncryptionDeclarationsAPIErrorHandler(h ErrorHandler) AppEncryptionDeclarationsAPIOption {
	return func(c *AppEncryptionDeclarationsAPIController) {
		c.errorHandler = h
	}
}

// NewAppEncryptionDeclarationsAPIController creates a default api controller
func NewAppEncryptionDeclarationsAPIController(s AppEncryptionDeclarationsAPIServicer, opts ...AppEncryptionDeclarationsAPIOption) Router {
	controller := &AppEncryptionDeclarationsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AppEncryptionDeclarationsAPIController
func (c *AppEncryptionDeclarationsAPIController) Routes() Routes {
	return Routes{
		"AppEncryptionDeclarationsAppGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appEncryptionDeclarations/{id}/app",
			c.AppEncryptionDeclarationsAppGetToOneRelated,
		},
		"AppEncryptionDeclarationsBuildsCreateToManyRelationship": Route{
			strings.ToUpper("Post"),
			"/v1/appEncryptionDeclarations/{id}/relationships/builds",
			c.AppEncryptionDeclarationsBuildsCreateToManyRelationship,
		},
		"AppEncryptionDeclarationsGetCollection": Route{
			strings.ToUpper("Get"),
			"/v1/appEncryptionDeclarations",
			c.AppEncryptionDeclarationsGetCollection,
		},
		"AppEncryptionDeclarationsGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/appEncryptionDeclarations/{id}",
			c.AppEncryptionDeclarationsGetInstance,
		},
	}
}

// AppEncryptionDeclarationsAppGetToOneRelated - 
func (c *AppEncryptionDeclarationsAPIController) AppEncryptionDeclarationsAppGetToOneRelated(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.AppEncryptionDeclarationsAppGetToOneRelated(r.Context(), idParam, fieldsAppsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppEncryptionDeclarationsBuildsCreateToManyRelationship - 
func (c *AppEncryptionDeclarationsAPIController) AppEncryptionDeclarationsBuildsCreateToManyRelationship(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	appEncryptionDeclarationBuildsLinkagesRequestParam := AppEncryptionDeclarationBuildsLinkagesRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appEncryptionDeclarationBuildsLinkagesRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppEncryptionDeclarationBuildsLinkagesRequestRequired(appEncryptionDeclarationBuildsLinkagesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppEncryptionDeclarationBuildsLinkagesRequestConstraints(appEncryptionDeclarationBuildsLinkagesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppEncryptionDeclarationsBuildsCreateToManyRelationship(r.Context(), idParam, appEncryptionDeclarationBuildsLinkagesRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppEncryptionDeclarationsGetCollection - 
func (c *AppEncryptionDeclarationsAPIController) AppEncryptionDeclarationsGetCollection(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var filterPlatformParam []string
	if query.Has("filter[platform]") {
		filterPlatformParam = strings.Split(query.Get("filter[platform]"), ",")
	}
	var filterAppParam []string
	if query.Has("filter[app]") {
		filterAppParam = strings.Split(query.Get("filter[app]"), ",")
	}
	var filterBuildsParam []string
	if query.Has("filter[builds]") {
		filterBuildsParam = strings.Split(query.Get("filter[builds]"), ",")
	}
	var fieldsAppEncryptionDeclarationsParam []string
	if query.Has("fields[appEncryptionDeclarations]") {
		fieldsAppEncryptionDeclarationsParam = strings.Split(query.Get("fields[appEncryptionDeclarations]"), ",")
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
	result, err := c.service.AppEncryptionDeclarationsGetCollection(r.Context(), filterPlatformParam, filterAppParam, filterBuildsParam, fieldsAppEncryptionDeclarationsParam, limitParam, includeParam, fieldsAppsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppEncryptionDeclarationsGetInstance - 
func (c *AppEncryptionDeclarationsAPIController) AppEncryptionDeclarationsGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppEncryptionDeclarationsParam []string
	if query.Has("fields[appEncryptionDeclarations]") {
		fieldsAppEncryptionDeclarationsParam = strings.Split(query.Get("fields[appEncryptionDeclarations]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsAppsParam []string
	if query.Has("fields[apps]") {
		fieldsAppsParam = strings.Split(query.Get("fields[apps]"), ",")
	}
	result, err := c.service.AppEncryptionDeclarationsGetInstance(r.Context(), idParam, fieldsAppEncryptionDeclarationsParam, includeParam, fieldsAppsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
