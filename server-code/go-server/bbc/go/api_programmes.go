/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// ProgrammesAPIController binds http requests to an api service and writes the service results to the http response
type ProgrammesAPIController struct {
	service ProgrammesAPIServicer
	errorHandler ErrorHandler
}

// ProgrammesAPIOption for how the controller is set up.
type ProgrammesAPIOption func(*ProgrammesAPIController)

// WithProgrammesAPIErrorHandler inject ErrorHandler into controller
func WithProgrammesAPIErrorHandler(h ErrorHandler) ProgrammesAPIOption {
	return func(c *ProgrammesAPIController) {
		c.errorHandler = h
	}
}

// NewProgrammesAPIController creates a default api controller
func NewProgrammesAPIController(s ProgrammesAPIServicer, opts ...ProgrammesAPIOption) Router {
	controller := &ProgrammesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ProgrammesAPIController
func (c *ProgrammesAPIController) Routes() Routes {
	return Routes{
		"GetPopularEpisodesClips": Route{
			strings.ToUpper("Get"),
			"/radio/popular",
			c.GetPopularEpisodesClips,
		},
		"GetRadioProgrammes": Route{
			strings.ToUpper("Get"),
			"/radio/programmes",
			c.GetRadioProgrammes,
		},
		"GetRadioProgrammesByPid": Route{
			strings.ToUpper("Get"),
			"/radio/programmes/{pid}",
			c.GetRadioProgrammesByPid,
		},
		"GetRecommendations": Route{
			strings.ToUpper("Get"),
			"/my/programmes/recommendations",
			c.GetRecommendations,
		},
	}
}

// GetPopularEpisodesClips - Popular Episodes & Clips
func (c *ProgrammesAPIController) GetPopularEpisodesClips(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	xAPIKeyParam := r.Header.Get("X-API-Key")
	var type_Param string
	if query.Has("type") {
		param := query.Get("type")

		type_Param = param
	} else {
	}
	var distinctParam string
	if query.Has("distinct") {
		param := query.Get("distinct")

		distinctParam = param
	} else {
	}
	var networkParam string
	if query.Has("network") {
		param := query.Get("network")

		networkParam = param
	} else {
	}
	var networkUrlKeyParam string
	if query.Has("network_url_key") {
		param := query.Get("network_url_key")

		networkUrlKeyParam = param
	} else {
	}
	var categoryParam string
	if query.Has("category") {
		param := query.Get("category")

		categoryParam = param
	} else {
	}
	var formatParam string
	if query.Has("format") {
		param := query.Get("format")

		formatParam = param
	} else {
	}
	var groupParam string
	if query.Has("group") {
		param := query.Get("group")

		groupParam = param
	} else {
	}
	var mediaTypeParam string
	if query.Has("media_type") {
		param := query.Get("media_type")

		mediaTypeParam = param
	} else {
	}
	var containerParam string
	if query.Has("container") {
		param := query.Get("container")

		containerParam = param
	} else {
	}
	var mediaSetParam []string
	if query.Has("media_set") {
		mediaSetParam = strings.Split(query.Get("media_set"), ",")
	}
	var qParam string
	if query.Has("q") {
		param := query.Get("q")

		qParam = param
	} else {
	}
	result, err := c.service.GetPopularEpisodesClips(r.Context(), xAPIKeyParam, type_Param, distinctParam, networkParam, networkUrlKeyParam, categoryParam, formatParam, groupParam, mediaTypeParam, containerParam, mediaSetParam, qParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRadioProgrammes - Radio programmes
func (c *ProgrammesAPIController) GetRadioProgrammes(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	xAPIKeyParam := r.Header.Get("X-API-Key")
	var kindParam string
	if query.Has("kind") {
		param := query.Get("kind")

		kindParam = param
	} else {
	}
	var networkParam string
	if query.Has("network") {
		param := query.Get("network")

		networkParam = param
	} else {
	}
	var networkUrlKeyParam string
	if query.Has("network_url_key") {
		param := query.Get("network_url_key")

		networkUrlKeyParam = param
	} else {
	}
	var categoryParam string
	if query.Has("category") {
		param := query.Get("category")

		categoryParam = param
	} else {
	}
	var sortParam string
	if query.Has("sort") {
		param := query.Get("sort")

		sortParam = param
	} else {
	}
	var containerParam string
	if query.Has("container") {
		param := query.Get("container")

		containerParam = param
	} else {
	}
	var type_Param string
	if query.Has("type") {
		param := query.Get("type")

		type_Param = param
	} else {
	}
	result, err := c.service.GetRadioProgrammes(r.Context(), xAPIKeyParam, kindParam, networkParam, networkUrlKeyParam, categoryParam, sortParam, containerParam, type_Param)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRadioProgrammesByPid - Available radio programme by Pid
func (c *ProgrammesAPIController) GetRadioProgrammesByPid(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	xAPIKeyParam := r.Header.Get("X-API-Key")
	pidParam := params["pid"]
	if pidParam == "" {
		c.errorHandler(w, r, &RequiredError{"pid"}, nil)
		return
	}
	result, err := c.service.GetRadioProgrammesByPid(r.Context(), xAPIKeyParam, pidParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRecommendations - Recommended Programmes
func (c *ProgrammesAPIController) GetRecommendations(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	authorizationParam := r.Header.Get("Authorization")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	var rightsParam string
	if query.Has("rights") {
		param := query.Get("rights")

		rightsParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "rights"}, nil)
		return
	}
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
	}
	result, err := c.service.GetRecommendations(r.Context(), authorizationParam, xAPIKeyParam, rightsParam, offsetParam, limitParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
