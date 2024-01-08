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

// RatingsAPIController binds http requests to an api service and writes the service results to the http response
type RatingsAPIController struct {
	service RatingsAPIServicer
	errorHandler ErrorHandler
}

// RatingsAPIOption for how the controller is set up.
type RatingsAPIOption func(*RatingsAPIController)

// WithRatingsAPIErrorHandler inject ErrorHandler into controller
func WithRatingsAPIErrorHandler(h ErrorHandler) RatingsAPIOption {
	return func(c *RatingsAPIController) {
		c.errorHandler = h
	}
}

// NewRatingsAPIController creates a default api controller
func NewRatingsAPIController(s RatingsAPIServicer, opts ...RatingsAPIOption) Router {
	controller := &RatingsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the RatingsAPIController
func (c *RatingsAPIController) Routes() Routes {
	return Routes{
		"GetConferenceSPRatings": Route{
			strings.ToUpper("Get"),
			"/ratings/sp/conferences",
			c.GetConferenceSPRatings,
		},
		"GetEloRatings": Route{
			strings.ToUpper("Get"),
			"/ratings/elo",
			c.GetEloRatings,
		},
		"GetSPRatings": Route{
			strings.ToUpper("Get"),
			"/ratings/sp",
			c.GetSPRatings,
		},
		"GetSRSRatings": Route{
			strings.ToUpper("Get"),
			"/ratings/srs",
			c.GetSRSRatings,
		},
	}
}

// GetConferenceSPRatings - Historical SP+ ratings by conference
func (c *RatingsAPIController) GetConferenceSPRatings(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1970),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		yearParam = param
	} else {
	}
	var conferenceParam string
	if query.Has("conference") {
		param := query.Get("conference")

		conferenceParam = param
	} else {
	}
	result, err := c.service.GetConferenceSPRatings(r.Context(), yearParam, conferenceParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetEloRatings - Historical Elo ratings
func (c *RatingsAPIController) GetEloRatings(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
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
	var conferenceParam string
	if query.Has("conference") {
		param := query.Get("conference")

		conferenceParam = param
	} else {
	}
	result, err := c.service.GetEloRatings(r.Context(), yearParam, weekParam, teamParam, conferenceParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSPRatings - Historical SP+ ratings
func (c *RatingsAPIController) GetSPRatings(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1970),
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
	result, err := c.service.GetSPRatings(r.Context(), yearParam, teamParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSRSRatings - Historical SRS ratings
func (c *RatingsAPIController) GetSRSRatings(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1897),
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
	result, err := c.service.GetSRSRatings(r.Context(), yearParam, teamParam, conferenceParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
