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

// SearchAPIController binds http requests to an api service and writes the service results to the http response
type SearchAPIController struct {
	service SearchAPIServicer
	errorHandler ErrorHandler
}

// SearchAPIOption for how the controller is set up.
type SearchAPIOption func(*SearchAPIController)

// WithSearchAPIErrorHandler inject ErrorHandler into controller
func WithSearchAPIErrorHandler(h ErrorHandler) SearchAPIOption {
	return func(c *SearchAPIController) {
		c.errorHandler = h
	}
}

// NewSearchAPIController creates a default api controller
func NewSearchAPIController(s SearchAPIServicer, opts ...SearchAPIOption) Router {
	controller := &SearchAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SearchAPIController
func (c *SearchAPIController) Routes() Routes {
	return Routes{
		"Get": Route{
			strings.ToUpper("Get"),
			"/Search/Hints",
			c.Get,
		},
	}
}

// Get - Gets the search hint result.
func (c *SearchAPIController) Get(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var searchTermParam string
	if query.Has("searchTerm") {
		param := query.Get("searchTerm")

		searchTermParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "searchTerm"}, nil)
		return
	}
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
	var userIdParam *string
	if query.Has("userId") {
		param := query.Get("userId")

		userIdParam = &param
	} else {
	}
	var includeItemTypesParam []string
	if query.Has("includeItemTypes") {
		includeItemTypesParam = strings.Split(query.Get("includeItemTypes"), ",")
	}
	var excludeItemTypesParam []string
	if query.Has("excludeItemTypes") {
		excludeItemTypesParam = strings.Split(query.Get("excludeItemTypes"), ",")
	}
	var mediaTypesParam []string
	if query.Has("mediaTypes") {
		mediaTypesParam = strings.Split(query.Get("mediaTypes"), ",")
	}
	var parentIdParam *string
	if query.Has("parentId") {
		param := query.Get("parentId")

		parentIdParam = &param
	} else {
	}
	var isMovieParam *bool
	if query.Has("isMovie") {
		param, err := parseBoolParameter(
			query.Get("isMovie"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isMovieParam = &param
	} else {
	}
	var isSeriesParam *bool
	if query.Has("isSeries") {
		param, err := parseBoolParameter(
			query.Get("isSeries"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isSeriesParam = &param
	} else {
	}
	var isNewsParam *bool
	if query.Has("isNews") {
		param, err := parseBoolParameter(
			query.Get("isNews"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isNewsParam = &param
	} else {
	}
	var isKidsParam *bool
	if query.Has("isKids") {
		param, err := parseBoolParameter(
			query.Get("isKids"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isKidsParam = &param
	} else {
	}
	var isSportsParam *bool
	if query.Has("isSports") {
		param, err := parseBoolParameter(
			query.Get("isSports"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isSportsParam = &param
	} else {
	}
	var includePeopleParam bool
	if query.Has("includePeople") {
		param, err := parseBoolParameter(
			query.Get("includePeople"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		includePeopleParam = param
	} else {
		var param bool = true
		includePeopleParam = param
	}
	var includeMediaParam bool
	if query.Has("includeMedia") {
		param, err := parseBoolParameter(
			query.Get("includeMedia"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		includeMediaParam = param
	} else {
		var param bool = true
		includeMediaParam = param
	}
	var includeGenresParam bool
	if query.Has("includeGenres") {
		param, err := parseBoolParameter(
			query.Get("includeGenres"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		includeGenresParam = param
	} else {
		var param bool = true
		includeGenresParam = param
	}
	var includeStudiosParam bool
	if query.Has("includeStudios") {
		param, err := parseBoolParameter(
			query.Get("includeStudios"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		includeStudiosParam = param
	} else {
		var param bool = true
		includeStudiosParam = param
	}
	var includeArtistsParam bool
	if query.Has("includeArtists") {
		param, err := parseBoolParameter(
			query.Get("includeArtists"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		includeArtistsParam = param
	} else {
		var param bool = true
		includeArtistsParam = param
	}
	result, err := c.service.Get(r.Context(), searchTermParam, startIndexParam, limitParam, userIdParam, includeItemTypesParam, excludeItemTypesParam, mediaTypesParam, parentIdParam, isMovieParam, isSeriesParam, isNewsParam, isKidsParam, isSportsParam, includePeopleParam, includeMediaParam, includeGenresParam, includeStudiosParam, includeArtistsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
