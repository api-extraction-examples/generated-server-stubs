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

// GroupsAPIController binds http requests to an api service and writes the service results to the http response
type GroupsAPIController struct {
	service GroupsAPIServicer
	errorHandler ErrorHandler
}

// GroupsAPIOption for how the controller is set up.
type GroupsAPIOption func(*GroupsAPIController)

// WithGroupsAPIErrorHandler inject ErrorHandler into controller
func WithGroupsAPIErrorHandler(h ErrorHandler) GroupsAPIOption {
	return func(c *GroupsAPIController) {
		c.errorHandler = h
	}
}

// NewGroupsAPIController creates a default api controller
func NewGroupsAPIController(s GroupsAPIServicer, opts ...GroupsAPIOption) Router {
	controller := &GroupsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the GroupsAPIController
func (c *GroupsAPIController) Routes() Routes {
	return Routes{
		"AddUserToGroup": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/group/user",
			c.AddUserToGroup,
		},
		"BulkGetGroups": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/group/bulk",
			c.BulkGetGroups,
		},
		"CreateGroup": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/group",
			c.CreateGroup,
		},
		"FindGroups": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/groups/picker",
			c.FindGroups,
		},
		"GetGroup": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/group",
			c.GetGroup,
		},
		"GetUsersFromGroup": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/group/member",
			c.GetUsersFromGroup,
		},
		"RemoveGroup": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/group",
			c.RemoveGroup,
		},
		"RemoveUserFromGroup": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/group/user",
			c.RemoveUserFromGroup,
		},
	}
}

// AddUserToGroup - Add user to group
func (c *GroupsAPIController) AddUserToGroup(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	updateUserToGroupBeanParam := UpdateUserToGroupBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateUserToGroupBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateUserToGroupBeanRequired(updateUserToGroupBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateUserToGroupBeanConstraints(updateUserToGroupBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var groupnameParam string
	if query.Has("groupname") {
		param := query.Get("groupname")

		groupnameParam = param
	} else {
	}
	var groupIdParam string
	if query.Has("groupId") {
		param := query.Get("groupId")

		groupIdParam = param
	} else {
	}
	result, err := c.service.AddUserToGroup(r.Context(), updateUserToGroupBeanParam, groupnameParam, groupIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BulkGetGroups - Bulk get groups
func (c *GroupsAPIController) BulkGetGroups(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
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
	var groupIdParam []string
	if query.Has("groupId") {
		groupIdParam = strings.Split(query.Get("groupId"), ",")
	}
	var groupNameParam []string
	if query.Has("groupName") {
		groupNameParam = strings.Split(query.Get("groupName"), ",")
	}
	var accessTypeParam string
	if query.Has("accessType") {
		param := query.Get("accessType")

		accessTypeParam = param
	} else {
	}
	var applicationKeyParam string
	if query.Has("applicationKey") {
		param := query.Get("applicationKey")

		applicationKeyParam = param
	} else {
	}
	result, err := c.service.BulkGetGroups(r.Context(), startAtParam, maxResultsParam, groupIdParam, groupNameParam, accessTypeParam, applicationKeyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateGroup - Create group
func (c *GroupsAPIController) CreateGroup(w http.ResponseWriter, r *http.Request) {
	addGroupBeanParam := AddGroupBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&addGroupBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAddGroupBeanRequired(addGroupBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAddGroupBeanConstraints(addGroupBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateGroup(r.Context(), addGroupBeanParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// FindGroups - Find groups
func (c *GroupsAPIController) FindGroups(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
	}
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var excludeParam []string
	if query.Has("exclude") {
		excludeParam = strings.Split(query.Get("exclude"), ",")
	}
	var excludeIdParam []string
	if query.Has("excludeId") {
		excludeIdParam = strings.Split(query.Get("excludeId"), ",")
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
	}
	var caseInsensitiveParam bool
	if query.Has("caseInsensitive") {
		param, err := parseBoolParameter(
			query.Get("caseInsensitive"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		caseInsensitiveParam = param
	} else {
		var param bool = false
		caseInsensitiveParam = param
	}
	var userNameParam string
	if query.Has("userName") {
		param := query.Get("userName")

		userNameParam = param
	} else {
	}
	result, err := c.service.FindGroups(r.Context(), accountIdParam, queryParam, excludeParam, excludeIdParam, maxResultsParam, caseInsensitiveParam, userNameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetGroup - Get group
// Deprecated
func (c *GroupsAPIController) GetGroup(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var groupnameParam string
	if query.Has("groupname") {
		param := query.Get("groupname")

		groupnameParam = param
	} else {
	}
	var groupIdParam string
	if query.Has("groupId") {
		param := query.Get("groupId")

		groupIdParam = param
	} else {
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetGroup(r.Context(), groupnameParam, groupIdParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetUsersFromGroup - Get users from group
func (c *GroupsAPIController) GetUsersFromGroup(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var groupnameParam string
	if query.Has("groupname") {
		param := query.Get("groupname")

		groupnameParam = param
	} else {
	}
	var groupIdParam string
	if query.Has("groupId") {
		param := query.Get("groupId")

		groupIdParam = param
	} else {
	}
	var includeInactiveUsersParam bool
	if query.Has("includeInactiveUsers") {
		param, err := parseBoolParameter(
			query.Get("includeInactiveUsers"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		includeInactiveUsersParam = param
	} else {
		var param bool = false
		includeInactiveUsersParam = param
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
	result, err := c.service.GetUsersFromGroup(r.Context(), groupnameParam, groupIdParam, includeInactiveUsersParam, startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RemoveGroup - Remove group
func (c *GroupsAPIController) RemoveGroup(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var groupnameParam string
	if query.Has("groupname") {
		param := query.Get("groupname")

		groupnameParam = param
	} else {
	}
	var groupIdParam string
	if query.Has("groupId") {
		param := query.Get("groupId")

		groupIdParam = param
	} else {
	}
	var swapGroupParam string
	if query.Has("swapGroup") {
		param := query.Get("swapGroup")

		swapGroupParam = param
	} else {
	}
	var swapGroupIdParam string
	if query.Has("swapGroupId") {
		param := query.Get("swapGroupId")

		swapGroupIdParam = param
	} else {
	}
	result, err := c.service.RemoveGroup(r.Context(), groupnameParam, groupIdParam, swapGroupParam, swapGroupIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RemoveUserFromGroup - Remove user from group
func (c *GroupsAPIController) RemoveUserFromGroup(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "accountId"}, nil)
		return
	}
	var groupnameParam string
	if query.Has("groupname") {
		param := query.Get("groupname")

		groupnameParam = param
	} else {
	}
	var groupIdParam string
	if query.Has("groupId") {
		param := query.Get("groupId")

		groupIdParam = param
	} else {
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	result, err := c.service.RemoveUserFromGroup(r.Context(), accountIdParam, groupnameParam, groupIdParam, usernameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
