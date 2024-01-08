/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * API version: 4.4.12
 * Contact: admin@collegefootballdata.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// StatsAPIController binds http requests to an api service and writes the service results to the http response
type StatsAPIController struct {
	service StatsAPIServicer
	errorHandler ErrorHandler
}

// StatsAPIOption for how the controller is set up.
type StatsAPIOption func(*StatsAPIController)

// WithStatsAPIErrorHandler inject ErrorHandler into controller
func WithStatsAPIErrorHandler(h ErrorHandler) StatsAPIOption {
	return func(c *StatsAPIController) {
		c.errorHandler = h
	}
}

// NewStatsAPIController creates a default api controller
func NewStatsAPIController(s StatsAPIServicer, opts ...StatsAPIOption) Router {
	controller := &StatsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the StatsAPIController
func (c *StatsAPIController) Routes() Routes {
	return Routes{
		"GetAdvancedTeamGameStats": Route{
			strings.ToUpper("Get"),
			"/stats/game/advanced",
			c.GetAdvancedTeamGameStats,
		},
		"GetAdvancedTeamSeasonStats": Route{
			strings.ToUpper("Get"),
			"/stats/season/advanced",
			c.GetAdvancedTeamSeasonStats,
		},
		"GetStatCategories": Route{
			strings.ToUpper("Get"),
			"/stats/categories",
			c.GetStatCategories,
		},
		"GetTeamSeasonStats": Route{
			strings.ToUpper("Get"),
			"/stats/season",
			c.GetTeamSeasonStats,
		},
	}
}

// GetAdvancedTeamGameStats - Advanced team metrics by game
func (c *StatsAPIController) GetAdvancedTeamGameStats(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](2001),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		yearParam = param
	} else {
	}
	var weekParam int32
	if query.Has("week") {
		param, err := parseNumericParameter[int32](
			query.Get("week"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1),
			WithMaximum[int32](16),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		weekParam = param
	} else {
	}
	var teamParam string
	if query.Has("team") {
		param := query.Get("team")

		teamParam = param
	} else {
	}
	var opponentParam string
	if query.Has("opponent") {
		param := query.Get("opponent")

		opponentParam = param
	} else {
	}
	var excludeGarbageTimeParam bool
	if query.Has("excludeGarbageTime") {
		param, err := parseBoolParameter(
			query.Get("excludeGarbageTime"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		excludeGarbageTimeParam = param
	} else {
	}
	var seasonTypeParam string
	if query.Has("seasonType") {
		param := query.Get("seasonType")

		seasonTypeParam = param
	} else {
	}
	result, err := c.service.GetAdvancedTeamGameStats(r.Context(), yearParam, weekParam, teamParam, opponentParam, excludeGarbageTimeParam, seasonTypeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetAdvancedTeamSeasonStats - Advanced team metrics by season
func (c *StatsAPIController) GetAdvancedTeamSeasonStats(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](2001),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		yearParam = param
	} else {
	}
	var teamParam string
	if query.Has("team") {
		param := query.Get("team")

		teamParam = param
	} else {
	}
	var excludeGarbageTimeParam bool
	if query.Has("excludeGarbageTime") {
		param, err := parseBoolParameter(
			query.Get("excludeGarbageTime"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		excludeGarbageTimeParam = param
	} else {
	}
	var startWeekParam int32
	if query.Has("startWeek") {
		param, err := parseNumericParameter[int32](
			query.Get("startWeek"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1),
			WithMaximum[int32](16),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startWeekParam = param
	} else {
	}
	var endWeekParam int32
	if query.Has("endWeek") {
		param, err := parseNumericParameter[int32](
			query.Get("endWeek"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1),
			WithMaximum[int32](16),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		endWeekParam = param
	} else {
	}
	result, err := c.service.GetAdvancedTeamSeasonStats(r.Context(), yearParam, teamParam, excludeGarbageTimeParam, startWeekParam, endWeekParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetStatCategories - Team stat categories
func (c *StatsAPIController) GetStatCategories(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetStatCategories(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetTeamSeasonStats - Team statistics by season
func (c *StatsAPIController) GetTeamSeasonStats(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](2001),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		yearParam = param
	} else {
	}
	var teamParam string
	if query.Has("team") {
		param := query.Get("team")

		teamParam = param
	} else {
	}
	var conferenceParam string
	if query.Has("conference") {
		param := query.Get("conference")

		conferenceParam = param
	} else {
	}
	var startWeekParam int32
	if query.Has("startWeek") {
		param, err := parseNumericParameter[int32](
			query.Get("startWeek"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1),
			WithMaximum[int32](16),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startWeekParam = param
	} else {
	}
	var endWeekParam int32
	if query.Has("endWeek") {
		param, err := parseNumericParameter[int32](
			query.Get("endWeek"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1),
			WithMaximum[int32](16),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		endWeekParam = param
	} else {
	}
	result, err := c.service.GetTeamSeasonStats(r.Context(), yearParam, teamParam, conferenceParam, startWeekParam, endWeekParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}