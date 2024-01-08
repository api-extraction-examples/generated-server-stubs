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

// IssueSearchAPIController binds http requests to an api service and writes the service results to the http response
type IssueSearchAPIController struct {
	service IssueSearchAPIServicer
	errorHandler ErrorHandler
}

// IssueSearchAPIOption for how the controller is set up.
type IssueSearchAPIOption func(*IssueSearchAPIController)

// WithIssueSearchAPIErrorHandler inject ErrorHandler into controller
func WithIssueSearchAPIErrorHandler(h ErrorHandler) IssueSearchAPIOption {
	return func(c *IssueSearchAPIController) {
		c.errorHandler = h
	}
}

// NewIssueSearchAPIController creates a default api controller
func NewIssueSearchAPIController(s IssueSearchAPIServicer, opts ...IssueSearchAPIOption) Router {
	controller := &IssueSearchAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the IssueSearchAPIController
func (c *IssueSearchAPIController) Routes() Routes {
	return Routes{
		"GetIssuePickerResource": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/issue/picker",
			c.GetIssuePickerResource,
		},
		"MatchIssues": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/jql/match",
			c.MatchIssues,
		},
		"SearchForIssuesUsingJql": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/search",
			c.SearchForIssuesUsingJql,
		},
		"SearchForIssuesUsingJqlPost": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/search",
			c.SearchForIssuesUsingJqlPost,
		},
	}
}

// GetIssuePickerResource - Get issue picker suggestions
func (c *IssueSearchAPIController) GetIssuePickerResource(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var currentJQLParam string
	if query.Has("currentJQL") {
		param := query.Get("currentJQL")

		currentJQLParam = param
	} else {
	}
	var currentIssueKeyParam string
	if query.Has("currentIssueKey") {
		param := query.Get("currentIssueKey")

		currentIssueKeyParam = param
	} else {
	}
	var currentProjectIdParam string
	if query.Has("currentProjectId") {
		param := query.Get("currentProjectId")

		currentProjectIdParam = param
	} else {
	}
	var showSubTasksParam bool
	if query.Has("showSubTasks") {
		param, err := parseBoolParameter(
			query.Get("showSubTasks"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		showSubTasksParam = param
	} else {
	}
	var showSubTaskParentParam bool
	if query.Has("showSubTaskParent") {
		param, err := parseBoolParameter(
			query.Get("showSubTaskParent"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		showSubTaskParentParam = param
	} else {
	}
	result, err := c.service.GetIssuePickerResource(r.Context(), queryParam, currentJQLParam, currentIssueKeyParam, currentProjectIdParam, showSubTasksParam, showSubTaskParentParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// MatchIssues - Check issues against JQL
func (c *IssueSearchAPIController) MatchIssues(w http.ResponseWriter, r *http.Request) {
	issuesAndJqlQueriesParam := IssuesAndJqlQueries{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&issuesAndJqlQueriesParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertIssuesAndJqlQueriesRequired(issuesAndJqlQueriesParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertIssuesAndJqlQueriesConstraints(issuesAndJqlQueriesParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.MatchIssues(r.Context(), issuesAndJqlQueriesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SearchForIssuesUsingJql - Search for issues using JQL (GET)
func (c *IssueSearchAPIController) SearchForIssuesUsingJql(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var jqlParam string
	if query.Has("jql") {
		param := query.Get("jql")

		jqlParam = param
	} else {
	}
	var startAtParam int32
	if query.Has("startAt") {
		param, err := parseNumericParameter[int32](
			query.Get("startAt"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int32 = 0
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
		var param int32 = 50
		maxResultsParam = param
	}
	var validateQueryParam string
	if query.Has("validateQuery") {
		param := query.Get("validateQuery")

		validateQueryParam = param
	} else {
		param := strict
		validateQueryParam = param
	}
	var fieldsParam []string
	if query.Has("fields") {
		fieldsParam = strings.Split(query.Get("fields"), ",")
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	var propertiesParam []string
	if query.Has("properties") {
		propertiesParam = strings.Split(query.Get("properties"), ",")
	}
	var fieldsByKeysParam bool
	if query.Has("fieldsByKeys") {
		param, err := parseBoolParameter(
			query.Get("fieldsByKeys"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		fieldsByKeysParam = param
	} else {
		var param bool = false
		fieldsByKeysParam = param
	}
	result, err := c.service.SearchForIssuesUsingJql(r.Context(), jqlParam, startAtParam, maxResultsParam, validateQueryParam, fieldsParam, expandParam, propertiesParam, fieldsByKeysParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SearchForIssuesUsingJqlPost - Search for issues using JQL (POST)
func (c *IssueSearchAPIController) SearchForIssuesUsingJqlPost(w http.ResponseWriter, r *http.Request) {
	searchRequestBeanParam := SearchRequestBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&searchRequestBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSearchRequestBeanRequired(searchRequestBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSearchRequestBeanConstraints(searchRequestBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SearchForIssuesUsingJqlPost(r.Context(), searchRequestBeanParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
