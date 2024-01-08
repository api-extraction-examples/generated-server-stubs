/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
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

// StudiosAPIController binds http requests to an api service and writes the service results to the http response
type StudiosAPIController struct {
	service StudiosAPIServicer
	errorHandler ErrorHandler
}

// StudiosAPIOption for how the controller is set up.
type StudiosAPIOption func(*StudiosAPIController)

// WithStudiosAPIErrorHandler inject ErrorHandler into controller
func WithStudiosAPIErrorHandler(h ErrorHandler) StudiosAPIOption {
	return func(c *StudiosAPIController) {
		c.errorHandler = h
	}
}

// NewStudiosAPIController creates a default api controller
func NewStudiosAPIController(s StudiosAPIServicer, opts ...StudiosAPIOption) Router {
	controller := &StudiosAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the StudiosAPIController
func (c *StudiosAPIController) Routes() Routes {
	return Routes{
		"GetStudio": Route{
			strings.ToUpper("Get"),
			"/Studios/{name}",
			c.GetStudio,
		},
		"GetStudios": Route{
			strings.ToUpper("Get"),
			"/Studios",
			c.GetStudios,
		},
	}
}

// GetStudio - Gets a studio by name.
func (c *StudiosAPIController) GetStudio(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	nameParam := params["name"]
	if nameParam == "" {
		c.errorHandler(w, r, &RequiredError{"name"}, nil)
		return
	}
	var userIdParam *string
	if query.Has("userId") {
		param := query.Get("userId")

		userIdParam = &param
	} else {
	}
	result, err := c.service.GetStudio(r.Context(), nameParam, userIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetStudios - Gets all studios from a given item, folder, or the entire library.
func (c *StudiosAPIController) GetStudios(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startIndexParam *int32
	if query.Has("startIndex") {
		param, err := parseNumericParameter[int32](
			query.Get("startIndex"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startIndexParam = &param
	} else {
	}
	var limitParam *int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = &param
	} else {
	}
	var searchTermParam *string
	if query.Has("searchTerm") {
		param := query.Get("searchTerm")

		searchTermParam = &param
	} else {
	}
	var parentIdParam *string
	if query.Has("parentId") {
		param := query.Get("parentId")

		parentIdParam = &param
	} else {
	}
	var fieldsParam []ItemFields
	if query.Has("fields") {
		paramSplits := strings.Split(query.Get("fields"), ",")
		fieldsParam = make([]ItemFields, 0, len(paramSplits))
		for _, param := range paramSplits {
			paramEnum, err := NewItemFieldsFromValue(param)
			if err != nil {
				c.errorHandler(w, r, &ParsingError{Err: err}, nil)
				return
			}
			fieldsParam = append(fieldsParam, paramEnum)
		}
	}
	var excludeItemTypesParam []string
	if query.Has("excludeItemTypes") {
		excludeItemTypesParam = strings.Split(query.Get("excludeItemTypes"), ",")
	}
	var includeItemTypesParam []string
	if query.Has("includeItemTypes") {
		includeItemTypesParam = strings.Split(query.Get("includeItemTypes"), ",")
	}
	var isFavoriteParam *bool
	if query.Has("isFavorite") {
		param, err := parseBoolParameter(
			query.Get("isFavorite"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isFavoriteParam = &param
	} else {
	}
	var enableUserDataParam *bool
	if query.Has("enableUserData") {
		param, err := parseBoolParameter(
			query.Get("enableUserData"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		enableUserDataParam = &param
	} else {
	}
	var imageTypeLimitParam *int32
	if query.Has("imageTypeLimit") {
		param, err := parseNumericParameter[int32](
			query.Get("imageTypeLimit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		imageTypeLimitParam = &param
	} else {
	}
	var enableImageTypesParam []ImageType
	if query.Has("enableImageTypes") {
		paramSplits := strings.Split(query.Get("enableImageTypes"), ",")
		enableImageTypesParam = make([]ImageType, 0, len(paramSplits))
		for _, param := range paramSplits {
			paramEnum, err := NewImageTypeFromValue(param)
			if err != nil {
				c.errorHandler(w, r, &ParsingError{Err: err}, nil)
				return
			}
			enableImageTypesParam = append(enableImageTypesParam, paramEnum)
		}
	}
	var userIdParam *string
	if query.Has("userId") {
		param := query.Get("userId")

		userIdParam = &param
	} else {
	}
	var nameStartsWithOrGreaterParam *string
	if query.Has("nameStartsWithOrGreater") {
		param := query.Get("nameStartsWithOrGreater")

		nameStartsWithOrGreaterParam = &param
	} else {
	}
	var nameStartsWithParam *string
	if query.Has("nameStartsWith") {
		param := query.Get("nameStartsWith")

		nameStartsWithParam = &param
	} else {
	}
	var nameLessThanParam *string
	if query.Has("nameLessThan") {
		param := query.Get("nameLessThan")

		nameLessThanParam = &param
	} else {
	}
	var enableImagesParam *bool
	if query.Has("enableImages") {
		param, err := parseBoolParameter(
			query.Get("enableImages"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		enableImagesParam = &param
	} else {
		var param bool = true
		enableImagesParam = &param
	}
	var enableTotalRecordCountParam bool
	if query.Has("enableTotalRecordCount") {
		param, err := parseBoolParameter(
			query.Get("enableTotalRecordCount"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		enableTotalRecordCountParam = param
	} else {
		var param bool = true
		enableTotalRecordCountParam = param
	}
	result, err := c.service.GetStudios(r.Context(), startIndexParam, limitParam, searchTermParam, parentIdParam, fieldsParam, excludeItemTypesParam, includeItemTypesParam, isFavoriteParam, enableUserDataParam, imageTypeLimitParam, enableImageTypesParam, userIdParam, nameStartsWithOrGreaterParam, nameStartsWithParam, nameLessThanParam, enableImagesParam, enableTotalRecordCountParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
