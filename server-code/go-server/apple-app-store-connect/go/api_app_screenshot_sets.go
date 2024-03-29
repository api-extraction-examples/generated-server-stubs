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

// AppScreenshotSetsAPIController binds http requests to an api service and writes the service results to the http response
type AppScreenshotSetsAPIController struct {
	service AppScreenshotSetsAPIServicer
	errorHandler ErrorHandler
}

// AppScreenshotSetsAPIOption for how the controller is set up.
type AppScreenshotSetsAPIOption func(*AppScreenshotSetsAPIController)

// WithAppScreenshotSetsAPIErrorHandler inject ErrorHandler into controller
func WithAppScreenshotSetsAPIErrorHandler(h ErrorHandler) AppScreenshotSetsAPIOption {
	return func(c *AppScreenshotSetsAPIController) {
		c.errorHandler = h
	}
}

// NewAppScreenshotSetsAPIController creates a default api controller
func NewAppScreenshotSetsAPIController(s AppScreenshotSetsAPIServicer, opts ...AppScreenshotSetsAPIOption) Router {
	controller := &AppScreenshotSetsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AppScreenshotSetsAPIController
func (c *AppScreenshotSetsAPIController) Routes() Routes {
	return Routes{
		"AppScreenshotSetsAppScreenshotsGetToManyRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appScreenshotSets/{id}/appScreenshots",
			c.AppScreenshotSetsAppScreenshotsGetToManyRelated,
		},
		"AppScreenshotSetsAppScreenshotsGetToManyRelationship": Route{
			strings.ToUpper("Get"),
			"/v1/appScreenshotSets/{id}/relationships/appScreenshots",
			c.AppScreenshotSetsAppScreenshotsGetToManyRelationship,
		},
		"AppScreenshotSetsAppScreenshotsReplaceToManyRelationship": Route{
			strings.ToUpper("Patch"),
			"/v1/appScreenshotSets/{id}/relationships/appScreenshots",
			c.AppScreenshotSetsAppScreenshotsReplaceToManyRelationship,
		},
		"AppScreenshotSetsCreateInstance": Route{
			strings.ToUpper("Post"),
			"/v1/appScreenshotSets",
			c.AppScreenshotSetsCreateInstance,
		},
		"AppScreenshotSetsDeleteInstance": Route{
			strings.ToUpper("Delete"),
			"/v1/appScreenshotSets/{id}",
			c.AppScreenshotSetsDeleteInstance,
		},
		"AppScreenshotSetsGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/appScreenshotSets/{id}",
			c.AppScreenshotSetsGetInstance,
		},
	}
}

// AppScreenshotSetsAppScreenshotsGetToManyRelated - 
func (c *AppScreenshotSetsAPIController) AppScreenshotSetsAppScreenshotsGetToManyRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppScreenshotSetsParam []string
	if query.Has("fields[appScreenshotSets]") {
		fieldsAppScreenshotSetsParam = strings.Split(query.Get("fields[appScreenshotSets]"), ",")
	}
	var fieldsAppScreenshotsParam []string
	if query.Has("fields[appScreenshots]") {
		fieldsAppScreenshotsParam = strings.Split(query.Get("fields[appScreenshots]"), ",")
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
	result, err := c.service.AppScreenshotSetsAppScreenshotsGetToManyRelated(r.Context(), idParam, fieldsAppScreenshotSetsParam, fieldsAppScreenshotsParam, limitParam, includeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppScreenshotSetsAppScreenshotsGetToManyRelationship - 
func (c *AppScreenshotSetsAPIController) AppScreenshotSetsAppScreenshotsGetToManyRelationship(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
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
	result, err := c.service.AppScreenshotSetsAppScreenshotsGetToManyRelationship(r.Context(), idParam, limitParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppScreenshotSetsAppScreenshotsReplaceToManyRelationship - 
func (c *AppScreenshotSetsAPIController) AppScreenshotSetsAppScreenshotsReplaceToManyRelationship(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	appScreenshotSetAppScreenshotsLinkagesRequestParam := AppScreenshotSetAppScreenshotsLinkagesRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appScreenshotSetAppScreenshotsLinkagesRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppScreenshotSetAppScreenshotsLinkagesRequestRequired(appScreenshotSetAppScreenshotsLinkagesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppScreenshotSetAppScreenshotsLinkagesRequestConstraints(appScreenshotSetAppScreenshotsLinkagesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppScreenshotSetsAppScreenshotsReplaceToManyRelationship(r.Context(), idParam, appScreenshotSetAppScreenshotsLinkagesRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppScreenshotSetsCreateInstance - 
func (c *AppScreenshotSetsAPIController) AppScreenshotSetsCreateInstance(w http.ResponseWriter, r *http.Request) {
	appScreenshotSetCreateRequestParam := AppScreenshotSetCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appScreenshotSetCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppScreenshotSetCreateRequestRequired(appScreenshotSetCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppScreenshotSetCreateRequestConstraints(appScreenshotSetCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppScreenshotSetsCreateInstance(r.Context(), appScreenshotSetCreateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppScreenshotSetsDeleteInstance - 
func (c *AppScreenshotSetsAPIController) AppScreenshotSetsDeleteInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.AppScreenshotSetsDeleteInstance(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppScreenshotSetsGetInstance - 
func (c *AppScreenshotSetsAPIController) AppScreenshotSetsGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppScreenshotSetsParam []string
	if query.Has("fields[appScreenshotSets]") {
		fieldsAppScreenshotSetsParam = strings.Split(query.Get("fields[appScreenshotSets]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsAppScreenshotsParam []string
	if query.Has("fields[appScreenshots]") {
		fieldsAppScreenshotsParam = strings.Split(query.Get("fields[appScreenshots]"), ",")
	}
	var limitAppScreenshotsParam int32
	if query.Has("limit[appScreenshots]") {
		param, err := parseNumericParameter[int32](
			query.Get("limit[appScreenshots]"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](50),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitAppScreenshotsParam = param
	} else {
	}
	result, err := c.service.AppScreenshotSetsGetInstance(r.Context(), idParam, fieldsAppScreenshotSetsParam, includeParam, fieldsAppScreenshotsParam, limitAppScreenshotsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
