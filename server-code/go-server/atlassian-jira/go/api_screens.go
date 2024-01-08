/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"
	"reflect"

	"github.com/gorilla/mux"
)

// ScreensAPIController binds http requests to an api service and writes the service results to the http response
type ScreensAPIController struct {
	service ScreensAPIServicer
	errorHandler ErrorHandler
}

// ScreensAPIOption for how the controller is set up.
type ScreensAPIOption func(*ScreensAPIController)

// WithScreensAPIErrorHandler inject ErrorHandler into controller
func WithScreensAPIErrorHandler(h ErrorHandler) ScreensAPIOption {
	return func(c *ScreensAPIController) {
		c.errorHandler = h
	}
}

// NewScreensAPIController creates a default api controller
func NewScreensAPIController(s ScreensAPIServicer, opts ...ScreensAPIOption) Router {
	controller := &ScreensAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ScreensAPIController
func (c *ScreensAPIController) Routes() Routes {
	return Routes{
		"AddFieldToDefaultScreen": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/screens/addToDefault/{fieldId}",
			c.AddFieldToDefaultScreen,
		},
		"CreateScreen": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/screens",
			c.CreateScreen,
		},
		"DeleteScreen": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/screens/{screenId}",
			c.DeleteScreen,
		},
		"GetAvailableScreenFields": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/screens/{screenId}/availableFields",
			c.GetAvailableScreenFields,
		},
		"GetScreens": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/screens",
			c.GetScreens,
		},
		"GetScreensForField": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/field/{fieldId}/screens",
			c.GetScreensForField,
		},
		"UpdateScreen": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/screens/{screenId}",
			c.UpdateScreen,
		},
	}
}

// AddFieldToDefaultScreen - Add field to default screen
func (c *ScreensAPIController) AddFieldToDefaultScreen(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	fieldIdParam := params["fieldId"]
	if fieldIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fieldId"}, nil)
		return
	}
	result, err := c.service.AddFieldToDefaultScreen(r.Context(), fieldIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateScreen - Create screen
func (c *ScreensAPIController) CreateScreen(w http.ResponseWriter, r *http.Request) {
	screenDetailsParam := ScreenDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&screenDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertScreenDetailsRequired(screenDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertScreenDetailsConstraints(screenDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateScreen(r.Context(), screenDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteScreen - Delete screen
func (c *ScreensAPIController) DeleteScreen(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	screenIdParam, err := parseNumericParameter[int64](
		params["screenId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.DeleteScreen(r.Context(), screenIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetAvailableScreenFields - Get available screen fields
func (c *ScreensAPIController) GetAvailableScreenFields(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	screenIdParam, err := parseNumericParameter[int64](
		params["screenId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.GetAvailableScreenFields(r.Context(), screenIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetScreens - Get screens
func (c *ScreensAPIController) GetScreens(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 100
		maxResultsParam = param
	}
	idParam, err := parseNumericArrayParameter[int64](
		query.Get("id"), ",", false,
		WithParse[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var queryStringParam string
	if query.Has("queryString") {
		param := query.Get("queryString")

		queryStringParam = param
	} else {
		param := 
		queryStringParam = param
	}
	var scopeParam []string
	if query.Has("scope") {
		scopeParam = strings.Split(query.Get("scope"), ",")
	}
	var orderByParam string
	if query.Has("orderBy") {
		param := query.Get("orderBy")

		orderByParam = param
	} else {
	}
	result, err := c.service.GetScreens(r.Context(), startAtParam, maxResultsParam, idParam, queryStringParam, scopeParam, orderByParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetScreensForField - Get screens for a field
func (c *ScreensAPIController) GetScreensForField(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	fieldIdParam := params["fieldId"]
	if fieldIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fieldId"}, nil)
		return
	}
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 100
		maxResultsParam = param
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetScreensForField(r.Context(), fieldIdParam, startAtParam, maxResultsParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateScreen - Update screen
func (c *ScreensAPIController) UpdateScreen(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	screenIdParam, err := parseNumericParameter[int64](
		params["screenId"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	updateScreenDetailsParam := UpdateScreenDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateScreenDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateScreenDetailsRequired(updateScreenDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateScreenDetailsConstraints(updateScreenDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateScreen(r.Context(), screenIdParam, updateScreenDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
