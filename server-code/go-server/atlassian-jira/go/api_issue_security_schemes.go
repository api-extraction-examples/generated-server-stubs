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

// IssueSecuritySchemesAPIController binds http requests to an api service and writes the service results to the http response
type IssueSecuritySchemesAPIController struct {
	service IssueSecuritySchemesAPIServicer
	errorHandler ErrorHandler
}

// IssueSecuritySchemesAPIOption for how the controller is set up.
type IssueSecuritySchemesAPIOption func(*IssueSecuritySchemesAPIController)

// WithIssueSecuritySchemesAPIErrorHandler inject ErrorHandler into controller
func WithIssueSecuritySchemesAPIErrorHandler(h ErrorHandler) IssueSecuritySchemesAPIOption {
	return func(c *IssueSecuritySchemesAPIController) {
		c.errorHandler = h
	}
}

// NewIssueSecuritySchemesAPIController creates a default api controller
func NewIssueSecuritySchemesAPIController(s IssueSecuritySchemesAPIServicer, opts ...IssueSecuritySchemesAPIOption) Router {
	controller := &IssueSecuritySchemesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the IssueSecuritySchemesAPIController
func (c *IssueSecuritySchemesAPIController) Routes() Routes {
	return Routes{
		"AddSecurityLevel": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/issuesecurityschemes/{schemeId}/level",
			c.AddSecurityLevel,
		},
		"AddSecurityLevelMembers": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/issuesecurityschemes/{schemeId}/level/{levelId}/member",
			c.AddSecurityLevelMembers,
		},
		"CreateIssueSecurityScheme": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/issuesecurityschemes",
			c.CreateIssueSecurityScheme,
		},
		"DeleteSecurityScheme": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/issuesecurityschemes/{schemeId}",
			c.DeleteSecurityScheme,
		},
		"GetIssueSecurityScheme": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/issuesecurityschemes/{id}",
			c.GetIssueSecurityScheme,
		},
		"GetIssueSecuritySchemes": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/issuesecurityschemes",
			c.GetIssueSecuritySchemes,
		},
		"GetSecurityLevelMembers": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/issuesecurityschemes/level/member",
			c.GetSecurityLevelMembers,
		},
		"GetSecurityLevels": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/issuesecurityschemes/level",
			c.GetSecurityLevels,
		},
		"RemoveLevel": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/issuesecurityschemes/{schemeId}/level/{levelId}",
			c.RemoveLevel,
		},
		"RemoveMemberFromSecurityLevel": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/issuesecurityschemes/{schemeId}/level/{levelId}/member/{memberId}",
			c.RemoveMemberFromSecurityLevel,
		},
		"SearchProjectsUsingSecuritySchemes": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/issuesecurityschemes/project",
			c.SearchProjectsUsingSecuritySchemes,
		},
		"SearchSecuritySchemes": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/issuesecurityschemes/search",
			c.SearchSecuritySchemes,
		},
		"SetDefaultLevels": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/issuesecurityschemes/level/default",
			c.SetDefaultLevels,
		},
		"UpdateIssueSecurityScheme": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/issuesecurityschemes/{id}",
			c.UpdateIssueSecurityScheme,
		},
		"UpdateSecurityLevel": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/issuesecurityschemes/{schemeId}/level/{levelId}",
			c.UpdateSecurityLevel,
		},
	}
}

// AddSecurityLevel - Add issue security levels
func (c *IssueSecuritySchemesAPIController) AddSecurityLevel(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	schemeIdParam := params["schemeId"]
	if schemeIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"schemeId"}, nil)
		return
	}
	addSecuritySchemeLevelsRequestBeanParam := AddSecuritySchemeLevelsRequestBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&addSecuritySchemeLevelsRequestBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAddSecuritySchemeLevelsRequestBeanRequired(addSecuritySchemeLevelsRequestBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAddSecuritySchemeLevelsRequestBeanConstraints(addSecuritySchemeLevelsRequestBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AddSecurityLevel(r.Context(), schemeIdParam, addSecuritySchemeLevelsRequestBeanParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AddSecurityLevelMembers - Add issue security level members
func (c *IssueSecuritySchemesAPIController) AddSecurityLevelMembers(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	schemeIdParam := params["schemeId"]
	if schemeIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"schemeId"}, nil)
		return
	}
	levelIdParam := params["levelId"]
	if levelIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"levelId"}, nil)
		return
	}
	securitySchemeMembersRequestParam := SecuritySchemeMembersRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&securitySchemeMembersRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSecuritySchemeMembersRequestRequired(securitySchemeMembersRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSecuritySchemeMembersRequestConstraints(securitySchemeMembersRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AddSecurityLevelMembers(r.Context(), schemeIdParam, levelIdParam, securitySchemeMembersRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateIssueSecurityScheme - Create issue security scheme
func (c *IssueSecuritySchemesAPIController) CreateIssueSecurityScheme(w http.ResponseWriter, r *http.Request) {
	createIssueSecuritySchemeDetailsParam := CreateIssueSecuritySchemeDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createIssueSecuritySchemeDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateIssueSecuritySchemeDetailsRequired(createIssueSecuritySchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateIssueSecuritySchemeDetailsConstraints(createIssueSecuritySchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateIssueSecurityScheme(r.Context(), createIssueSecuritySchemeDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteSecurityScheme - Delete issue security scheme
func (c *IssueSecuritySchemesAPIController) DeleteSecurityScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	schemeIdParam := params["schemeId"]
	if schemeIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"schemeId"}, nil)
		return
	}
	result, err := c.service.DeleteSecurityScheme(r.Context(), schemeIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetIssueSecurityScheme - Get issue security scheme
func (c *IssueSecuritySchemesAPIController) GetIssueSecurityScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.GetIssueSecurityScheme(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetIssueSecuritySchemes - Get issue security schemes
func (c *IssueSecuritySchemesAPIController) GetIssueSecuritySchemes(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetIssueSecuritySchemes(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSecurityLevelMembers - Get issue security level members
func (c *IssueSecuritySchemesAPIController) GetSecurityLevelMembers(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam string
	if query.Has("startAt") {
		param := query.Get("startAt")

		startAtParam = param
	} else {
		param := 0
		startAtParam = param
	}
	var maxResultsParam string
	if query.Has("maxResults") {
		param := query.Get("maxResults")

		maxResultsParam = param
	} else {
		param := 50
		maxResultsParam = param
	}
	var idParam []string
	if query.Has("id") {
		idParam = strings.Split(query.Get("id"), ",")
	}
	var schemeIdParam []string
	if query.Has("schemeId") {
		schemeIdParam = strings.Split(query.Get("schemeId"), ",")
	}
	var levelIdParam []string
	if query.Has("levelId") {
		levelIdParam = strings.Split(query.Get("levelId"), ",")
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetSecurityLevelMembers(r.Context(), startAtParam, maxResultsParam, idParam, schemeIdParam, levelIdParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSecurityLevels - Get issue security levels
func (c *IssueSecuritySchemesAPIController) GetSecurityLevels(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam string
	if query.Has("startAt") {
		param := query.Get("startAt")

		startAtParam = param
	} else {
		param := 0
		startAtParam = param
	}
	var maxResultsParam string
	if query.Has("maxResults") {
		param := query.Get("maxResults")

		maxResultsParam = param
	} else {
		param := 50
		maxResultsParam = param
	}
	var idParam []string
	if query.Has("id") {
		idParam = strings.Split(query.Get("id"), ",")
	}
	var schemeIdParam []string
	if query.Has("schemeId") {
		schemeIdParam = strings.Split(query.Get("schemeId"), ",")
	}
	var onlyDefaultParam bool
	if query.Has("onlyDefault") {
		param, err := parseBoolParameter(
			query.Get("onlyDefault"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		onlyDefaultParam = param
	} else {
		var param bool = false
		onlyDefaultParam = param
	}
	result, err := c.service.GetSecurityLevels(r.Context(), startAtParam, maxResultsParam, idParam, schemeIdParam, onlyDefaultParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RemoveLevel - Remove issue security level
func (c *IssueSecuritySchemesAPIController) RemoveLevel(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	schemeIdParam := params["schemeId"]
	if schemeIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"schemeId"}, nil)
		return
	}
	levelIdParam := params["levelId"]
	if levelIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"levelId"}, nil)
		return
	}
	var replaceWithParam string
	if query.Has("replaceWith") {
		param := query.Get("replaceWith")

		replaceWithParam = param
	} else {
	}
	result, err := c.service.RemoveLevel(r.Context(), schemeIdParam, levelIdParam, replaceWithParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RemoveMemberFromSecurityLevel - Remove member from issue security level
func (c *IssueSecuritySchemesAPIController) RemoveMemberFromSecurityLevel(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	schemeIdParam := params["schemeId"]
	if schemeIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"schemeId"}, nil)
		return
	}
	levelIdParam := params["levelId"]
	if levelIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"levelId"}, nil)
		return
	}
	memberIdParam := params["memberId"]
	if memberIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"memberId"}, nil)
		return
	}
	result, err := c.service.RemoveMemberFromSecurityLevel(r.Context(), schemeIdParam, levelIdParam, memberIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SearchProjectsUsingSecuritySchemes - Get projects using issue security schemes
func (c *IssueSecuritySchemesAPIController) SearchProjectsUsingSecuritySchemes(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam string
	if query.Has("startAt") {
		param := query.Get("startAt")

		startAtParam = param
	} else {
		param := 0
		startAtParam = param
	}
	var maxResultsParam string
	if query.Has("maxResults") {
		param := query.Get("maxResults")

		maxResultsParam = param
	} else {
		param := 50
		maxResultsParam = param
	}
	var issueSecuritySchemeIdParam []string
	if query.Has("issueSecuritySchemeId") {
		issueSecuritySchemeIdParam = strings.Split(query.Get("issueSecuritySchemeId"), ",")
	}
	var projectIdParam []string
	if query.Has("projectId") {
		projectIdParam = strings.Split(query.Get("projectId"), ",")
	}
	result, err := c.service.SearchProjectsUsingSecuritySchemes(r.Context(), startAtParam, maxResultsParam, issueSecuritySchemeIdParam, projectIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SearchSecuritySchemes - Search issue security schemes
func (c *IssueSecuritySchemesAPIController) SearchSecuritySchemes(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam string
	if query.Has("startAt") {
		param := query.Get("startAt")

		startAtParam = param
	} else {
		param := 0
		startAtParam = param
	}
	var maxResultsParam string
	if query.Has("maxResults") {
		param := query.Get("maxResults")

		maxResultsParam = param
	} else {
		param := 50
		maxResultsParam = param
	}
	var idParam []string
	if query.Has("id") {
		idParam = strings.Split(query.Get("id"), ",")
	}
	var projectIdParam []string
	if query.Has("projectId") {
		projectIdParam = strings.Split(query.Get("projectId"), ",")
	}
	result, err := c.service.SearchSecuritySchemes(r.Context(), startAtParam, maxResultsParam, idParam, projectIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetDefaultLevels - Set default issue security levels
func (c *IssueSecuritySchemesAPIController) SetDefaultLevels(w http.ResponseWriter, r *http.Request) {
	setDefaultLevelsRequestParam := SetDefaultLevelsRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&setDefaultLevelsRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSetDefaultLevelsRequestRequired(setDefaultLevelsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSetDefaultLevelsRequestConstraints(setDefaultLevelsRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetDefaultLevels(r.Context(), setDefaultLevelsRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateIssueSecurityScheme - Update issue security scheme
func (c *IssueSecuritySchemesAPIController) UpdateIssueSecurityScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	updateIssueSecuritySchemeRequestBeanParam := UpdateIssueSecuritySchemeRequestBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateIssueSecuritySchemeRequestBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateIssueSecuritySchemeRequestBeanRequired(updateIssueSecuritySchemeRequestBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateIssueSecuritySchemeRequestBeanConstraints(updateIssueSecuritySchemeRequestBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateIssueSecurityScheme(r.Context(), idParam, updateIssueSecuritySchemeRequestBeanParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateSecurityLevel - Update issue security level
func (c *IssueSecuritySchemesAPIController) UpdateSecurityLevel(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	schemeIdParam := params["schemeId"]
	if schemeIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"schemeId"}, nil)
		return
	}
	levelIdParam := params["levelId"]
	if levelIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"levelId"}, nil)
		return
	}
	updateIssueSecurityLevelDetailsParam := UpdateIssueSecurityLevelDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateIssueSecurityLevelDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateIssueSecurityLevelDetailsRequired(updateIssueSecurityLevelDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateIssueSecurityLevelDetailsConstraints(updateIssueSecurityLevelDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateSecurityLevel(r.Context(), schemeIdParam, levelIdParam, updateIssueSecurityLevelDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
