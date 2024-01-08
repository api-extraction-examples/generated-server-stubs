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

// TeamsAPIController binds http requests to an api service and writes the service results to the http response
type TeamsAPIController struct {
	service TeamsAPIServicer
	errorHandler ErrorHandler
}

// TeamsAPIOption for how the controller is set up.
type TeamsAPIOption func(*TeamsAPIController)

// WithTeamsAPIErrorHandler inject ErrorHandler into controller
func WithTeamsAPIErrorHandler(h ErrorHandler) TeamsAPIOption {
	return func(c *TeamsAPIController) {
		c.errorHandler = h
	}
}

// NewTeamsAPIController creates a default api controller
func NewTeamsAPIController(s TeamsAPIServicer, opts ...TeamsAPIOption) Router {
	controller := &TeamsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the TeamsAPIController
func (c *TeamsAPIController) Routes() Routes {
	return Routes{
		"GetFbsTeams": Route{
			strings.ToUpper("Get"),
			"/teams/fbs",
			c.GetFbsTeams,
		},
		"GetRoster": Route{
			strings.ToUpper("Get"),
			"/roster",
			c.GetRoster,
		},
		"GetTalent": Route{
			strings.ToUpper("Get"),
			"/talent",
			c.GetTalent,
		},
		"GetTeamMatchup": Route{
			strings.ToUpper("Get"),
			"/teams/matchup",
			c.GetTeamMatchup,
		},
		"GetTeams": Route{
			strings.ToUpper("Get"),
			"/teams",
			c.GetTeams,
		},
	}
}

// GetFbsTeams - FBS team list
func (c *TeamsAPIController) GetFbsTeams(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1869),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		yearParam = param
	} else {
	}
	result, err := c.service.GetFbsTeams(r.Context(), yearParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRoster - Team rosters
func (c *TeamsAPIController) GetRoster(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var teamParam string
	if query.Has("team") {
		param := query.Get("team")

		teamParam = param
	} else {
	}
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](2009),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		yearParam = param
	} else {
	}
	result, err := c.service.GetRoster(r.Context(), teamParam, yearParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetTalent - Team talent composite rankings
func (c *TeamsAPIController) GetTalent(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](2015),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		yearParam = param
	} else {
	}
	result, err := c.service.GetTalent(r.Context(), yearParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetTeamMatchup - Team matchup history
func (c *TeamsAPIController) GetTeamMatchup(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var team1Param string
	if query.Has("team1") {
		param := query.Get("team1")

		team1Param = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "team1"}, nil)
		return
	}
	var team2Param string
	if query.Has("team2") {
		param := query.Get("team2")

		team2Param = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "team2"}, nil)
		return
	}
	var minYearParam int32
	if query.Has("minYear") {
		param, err := parseNumericParameter[int32](
			query.Get("minYear"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1869),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		minYearParam = param
	} else {
	}
	var maxYearParam int32
	if query.Has("maxYear") {
		param, err := parseNumericParameter[int32](
			query.Get("maxYear"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1869),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxYearParam = param
	} else {
	}
	result, err := c.service.GetTeamMatchup(r.Context(), team1Param, team2Param, minYearParam, maxYearParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetTeams - Team information
func (c *TeamsAPIController) GetTeams(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var conferenceParam string
	if query.Has("conference") {
		param := query.Get("conference")

		conferenceParam = param
	} else {
	}
	result, err := c.service.GetTeams(r.Context(), conferenceParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
