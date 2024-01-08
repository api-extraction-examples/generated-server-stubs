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

// RankingsAPIController binds http requests to an api service and writes the service results to the http response
type RankingsAPIController struct {
	service RankingsAPIServicer
	errorHandler ErrorHandler
}

// RankingsAPIOption for how the controller is set up.
type RankingsAPIOption func(*RankingsAPIController)

// WithRankingsAPIErrorHandler inject ErrorHandler into controller
func WithRankingsAPIErrorHandler(h ErrorHandler) RankingsAPIOption {
	return func(c *RankingsAPIController) {
		c.errorHandler = h
	}
}

// NewRankingsAPIController creates a default api controller
func NewRankingsAPIController(s RankingsAPIServicer, opts ...RankingsAPIOption) Router {
	controller := &RankingsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the RankingsAPIController
func (c *RankingsAPIController) Routes() Routes {
	return Routes{
		"GetRankings": Route{
			strings.ToUpper("Get"),
			"/rankings",
			c.GetRankings,
		},
	}
}

// GetRankings - Historical polls and rankings
func (c *RankingsAPIController) GetRankings(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var yearParam int32
	if query.Has("year") {
		param, err := parseNumericParameter[int32](
			query.Get("year"),
			WithParse[int32](parseInt32),
			WithMinimum[int32](1936),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		yearParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "year"}, nil)
		return
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
	var seasonTypeParam string
	if query.Has("seasonType") {
		param := query.Get("seasonType")

		seasonTypeParam = param
	} else {
		param := regular
		seasonTypeParam = param
	}
	result, err := c.service.GetRankings(r.Context(), yearParam, weekParam, seasonTypeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
