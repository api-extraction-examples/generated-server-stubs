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

// DraftAPIController binds http requests to an api service and writes the service results to the http response
type DraftAPIController struct {
	service DraftAPIServicer
	errorHandler ErrorHandler
}

// DraftAPIOption for how the controller is set up.
type DraftAPIOption func(*DraftAPIController)

// WithDraftAPIErrorHandler inject ErrorHandler into controller
func WithDraftAPIErrorHandler(h ErrorHandler) DraftAPIOption {
	return func(c *DraftAPIController) {
		c.errorHandler = h
	}
}

// NewDraftAPIController creates a default api controller
func NewDraftAPIController(s DraftAPIServicer, opts ...DraftAPIOption) Router {
	controller := &DraftAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DraftAPIController
func (c *DraftAPIController) Routes() Routes {
	return Routes{
		"GetDraftPicks": Route{
			strings.ToUpper("Get"),
			"/draft/picks",
			c.GetDraftPicks,
		},
		"GetNFLPositions": Route{
			strings.ToUpper("Get"),
			"/draft/positions",
			c.GetNFLPositions,
		},
		"GetNFLTeams": Route{
			strings.ToUpper("Get"),
			"/draft/teams",
			c.GetNFLTeams,
		},
	}
}

// GetDraftPicks - List of NFL Draft picks
func (c *DraftAPIController) GetDraftPicks(w http.ResponseWriter, r *http.Request) {
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
	var nflTeamParam string
	if query.Has("nflTeam") {
		param := query.Get("nflTeam")

		nflTeamParam = param
	} else {
	}
	var collegeParam string
	if query.Has("college") {
		param := query.Get("college")

		collegeParam = param
	} else {
	}
	var conferenceParam string
	if query.Has("conference") {
		param := query.Get("conference")

		conferenceParam = param
	} else {
	}
	var positionParam string
	if query.Has("position") {
		param := query.Get("position")

		positionParam = param
	} else {
	}
	result, err := c.service.GetDraftPicks(r.Context(), yearParam, nflTeamParam, collegeParam, conferenceParam, positionParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetNFLPositions - List of NFL positions
func (c *DraftAPIController) GetNFLPositions(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetNFLPositions(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetNFLTeams - List of NFL teams
func (c *DraftAPIController) GetNFLTeams(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetNFLTeams(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}