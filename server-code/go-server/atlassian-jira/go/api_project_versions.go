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

	"github.com/gorilla/mux"
)

// ProjectVersionsAPIController binds http requests to an api service and writes the service results to the http response
type ProjectVersionsAPIController struct {
	service ProjectVersionsAPIServicer
	errorHandler ErrorHandler
}

// ProjectVersionsAPIOption for how the controller is set up.
type ProjectVersionsAPIOption func(*ProjectVersionsAPIController)

// WithProjectVersionsAPIErrorHandler inject ErrorHandler into controller
func WithProjectVersionsAPIErrorHandler(h ErrorHandler) ProjectVersionsAPIOption {
	return func(c *ProjectVersionsAPIController) {
		c.errorHandler = h
	}
}

// NewProjectVersionsAPIController creates a default api controller
func NewProjectVersionsAPIController(s ProjectVersionsAPIServicer, opts ...ProjectVersionsAPIOption) Router {
	controller := &ProjectVersionsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ProjectVersionsAPIController
func (c *ProjectVersionsAPIController) Routes() Routes {
	return Routes{
		"CreateVersion": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/version",
			c.CreateVersion,
		},
		"DeleteAndReplaceVersion": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/version/{id}/removeAndSwap",
			c.DeleteAndReplaceVersion,
		},
		"DeleteVersion": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/version/{id}",
			c.DeleteVersion,
		},
		"GetProjectVersions": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/project/{projectIdOrKey}/versions",
			c.GetProjectVersions,
		},
		"GetProjectVersionsPaginated": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/project/{projectIdOrKey}/version",
			c.GetProjectVersionsPaginated,
		},
		"GetVersion": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/version/{id}",
			c.GetVersion,
		},
		"GetVersionRelatedIssues": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/version/{id}/relatedIssueCounts",
			c.GetVersionRelatedIssues,
		},
		"GetVersionUnresolvedIssues": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/version/{id}/unresolvedIssueCount",
			c.GetVersionUnresolvedIssues,
		},
		"MergeVersions": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/version/{id}/mergeto/{moveIssuesTo}",
			c.MergeVersions,
		},
		"MoveVersion": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/version/{id}/move",
			c.MoveVersion,
		},
		"UpdateVersion": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/version/{id}",
			c.UpdateVersion,
		},
	}
}

// CreateVersion - Create version
func (c *ProjectVersionsAPIController) CreateVersion(w http.ResponseWriter, r *http.Request) {
	versionParam := Version{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&versionParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertVersionRequired(versionParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertVersionConstraints(versionParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateVersion(r.Context(), versionParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteAndReplaceVersion - Delete and replace version
func (c *ProjectVersionsAPIController) DeleteAndReplaceVersion(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	deleteAndReplaceVersionBeanParam := DeleteAndReplaceVersionBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&deleteAndReplaceVersionBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertDeleteAndReplaceVersionBeanRequired(deleteAndReplaceVersionBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertDeleteAndReplaceVersionBeanConstraints(deleteAndReplaceVersionBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.DeleteAndReplaceVersion(r.Context(), idParam, deleteAndReplaceVersionBeanParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteVersion - Delete version
// Deprecated
func (c *ProjectVersionsAPIController) DeleteVersion(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var moveFixIssuesToParam string
	if query.Has("moveFixIssuesTo") {
		param := query.Get("moveFixIssuesTo")

		moveFixIssuesToParam = param
	} else {
	}
	var moveAffectedIssuesToParam string
	if query.Has("moveAffectedIssuesTo") {
		param := query.Get("moveAffectedIssuesTo")

		moveAffectedIssuesToParam = param
	} else {
	}
	result, err := c.service.DeleteVersion(r.Context(), idParam, moveFixIssuesToParam, moveAffectedIssuesToParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetProjectVersions - Get project versions
func (c *ProjectVersionsAPIController) GetProjectVersions(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectIdOrKeyParam := params["projectIdOrKey"]
	if projectIdOrKeyParam == "" {
		c.errorHandler(w, r, &RequiredError{"projectIdOrKey"}, nil)
		return
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetProjectVersions(r.Context(), projectIdOrKeyParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetProjectVersionsPaginated - Get project versions paginated
func (c *ProjectVersionsAPIController) GetProjectVersionsPaginated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectIdOrKeyParam := params["projectIdOrKey"]
	if projectIdOrKeyParam == "" {
		c.errorHandler(w, r, &RequiredError{"projectIdOrKey"}, nil)
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
		var param int32 = 50
		maxResultsParam = param
	}
	var orderByParam string
	if query.Has("orderBy") {
		param := query.Get("orderBy")

		orderByParam = param
	} else {
	}
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var statusParam string
	if query.Has("status") {
		param := query.Get("status")

		statusParam = param
	} else {
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetProjectVersionsPaginated(r.Context(), projectIdOrKeyParam, startAtParam, maxResultsParam, orderByParam, queryParam, statusParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetVersion - Get version
func (c *ProjectVersionsAPIController) GetVersion(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetVersion(r.Context(), idParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetVersionRelatedIssues - Get version's related issues count
func (c *ProjectVersionsAPIController) GetVersionRelatedIssues(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.GetVersionRelatedIssues(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetVersionUnresolvedIssues - Get version's unresolved issues count
func (c *ProjectVersionsAPIController) GetVersionUnresolvedIssues(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.GetVersionUnresolvedIssues(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// MergeVersions - Merge versions
func (c *ProjectVersionsAPIController) MergeVersions(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	moveIssuesToParam := params["moveIssuesTo"]
	if moveIssuesToParam == "" {
		c.errorHandler(w, r, &RequiredError{"moveIssuesTo"}, nil)
		return
	}
	result, err := c.service.MergeVersions(r.Context(), idParam, moveIssuesToParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// MoveVersion - Move version
func (c *ProjectVersionsAPIController) MoveVersion(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	versionMoveBeanParam := VersionMoveBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&versionMoveBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertVersionMoveBeanRequired(versionMoveBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertVersionMoveBeanConstraints(versionMoveBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.MoveVersion(r.Context(), idParam, versionMoveBeanParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateVersion - Update version
func (c *ProjectVersionsAPIController) UpdateVersion(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	versionParam := Version{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&versionParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertVersionRequired(versionParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertVersionConstraints(versionParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateVersion(r.Context(), idParam, versionParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
