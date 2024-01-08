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

// UserSearchAPIController binds http requests to an api service and writes the service results to the http response
type UserSearchAPIController struct {
	service UserSearchAPIServicer
	errorHandler ErrorHandler
}

// UserSearchAPIOption for how the controller is set up.
type UserSearchAPIOption func(*UserSearchAPIController)

// WithUserSearchAPIErrorHandler inject ErrorHandler into controller
func WithUserSearchAPIErrorHandler(h ErrorHandler) UserSearchAPIOption {
	return func(c *UserSearchAPIController) {
		c.errorHandler = h
	}
}

// NewUserSearchAPIController creates a default api controller
func NewUserSearchAPIController(s UserSearchAPIServicer, opts ...UserSearchAPIOption) Router {
	controller := &UserSearchAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the UserSearchAPIController
func (c *UserSearchAPIController) Routes() Routes {
	return Routes{
		"FindAssignableUsers": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/assignable/search",
			c.FindAssignableUsers,
		},
		"FindBulkAssignableUsers": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/assignable/multiProjectSearch",
			c.FindBulkAssignableUsers,
		},
		"FindUserKeysByQuery": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/search/query/key",
			c.FindUserKeysByQuery,
		},
		"FindUsers": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/search",
			c.FindUsers,
		},
		"FindUsersByQuery": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/search/query",
			c.FindUsersByQuery,
		},
		"FindUsersForPicker": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/picker",
			c.FindUsersForPicker,
		},
		"FindUsersWithAllPermissions": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/permission/search",
			c.FindUsersWithAllPermissions,
		},
		"FindUsersWithBrowsePermission": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/viewissue/search",
			c.FindUsersWithBrowsePermission,
		},
	}
}

// FindAssignableUsers - Find users assignable to issues
func (c *UserSearchAPIController) FindAssignableUsers(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var sessionIdParam string
	if query.Has("sessionId") {
		param := query.Get("sessionId")

		sessionIdParam = param
	} else {
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
	}
	var projectParam string
	if query.Has("project") {
		param := query.Get("project")

		projectParam = param
	} else {
	}
	var issueKeyParam string
	if query.Has("issueKey") {
		param := query.Get("issueKey")

		issueKeyParam = param
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
	var actionDescriptorIdParam int32
	if query.Has("actionDescriptorId") {
		param, err := parseNumericParameter[int32](
			query.Get("actionDescriptorId"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		actionDescriptorIdParam = param
	} else {
	}
	var recommendParam bool
	if query.Has("recommend") {
		param, err := parseBoolParameter(
			query.Get("recommend"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		recommendParam = param
	} else {
		var param bool = false
		recommendParam = param
	}
	result, err := c.service.FindAssignableUsers(r.Context(), queryParam, sessionIdParam, usernameParam, accountIdParam, projectParam, issueKeyParam, startAtParam, maxResultsParam, actionDescriptorIdParam, recommendParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// FindBulkAssignableUsers - Find users assignable to projects
func (c *UserSearchAPIController) FindBulkAssignableUsers(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var projectKeysParam string
	if query.Has("projectKeys") {
		param := query.Get("projectKeys")

		projectKeysParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "projectKeys"}, nil)
		return
	}
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
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
	result, err := c.service.FindBulkAssignableUsers(r.Context(), projectKeysParam, queryParam, usernameParam, accountIdParam, startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// FindUserKeysByQuery - Find user keys by query
func (c *UserSearchAPIController) FindUserKeysByQuery(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "query"}, nil)
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
		var param int32 = 100
		maxResultsParam = param
	}
	result, err := c.service.FindUserKeysByQuery(r.Context(), queryParam, startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// FindUsers - Find users
func (c *UserSearchAPIController) FindUsers(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
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
	var propertyParam string
	if query.Has("property") {
		param := query.Get("property")

		propertyParam = param
	} else {
	}
	result, err := c.service.FindUsers(r.Context(), queryParam, usernameParam, accountIdParam, startAtParam, maxResultsParam, propertyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// FindUsersByQuery - Find users by query
func (c *UserSearchAPIController) FindUsersByQuery(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "query"}, nil)
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
		var param int32 = 100
		maxResultsParam = param
	}
	result, err := c.service.FindUsersByQuery(r.Context(), queryParam, startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// FindUsersForPicker - Find users for picker
func (c *UserSearchAPIController) FindUsersForPicker(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "query"}, nil)
		return
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
	var showAvatarParam bool
	if query.Has("showAvatar") {
		param, err := parseBoolParameter(
			query.Get("showAvatar"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		showAvatarParam = param
	} else {
		var param bool = false
		showAvatarParam = param
	}
	var excludeParam []string
	if query.Has("exclude") {
		excludeParam = strings.Split(query.Get("exclude"), ",")
	}
	var excludeAccountIdsParam []string
	if query.Has("excludeAccountIds") {
		excludeAccountIdsParam = strings.Split(query.Get("excludeAccountIds"), ",")
	}
	var avatarSizeParam string
	if query.Has("avatarSize") {
		param := query.Get("avatarSize")

		avatarSizeParam = param
	} else {
	}
	var excludeConnectUsersParam bool
	if query.Has("excludeConnectUsers") {
		param, err := parseBoolParameter(
			query.Get("excludeConnectUsers"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		excludeConnectUsersParam = param
	} else {
		var param bool = false
		excludeConnectUsersParam = param
	}
	result, err := c.service.FindUsersForPicker(r.Context(), queryParam, maxResultsParam, showAvatarParam, excludeParam, excludeAccountIdsParam, avatarSizeParam, excludeConnectUsersParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// FindUsersWithAllPermissions - Find users with permissions
func (c *UserSearchAPIController) FindUsersWithAllPermissions(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var permissionsParam string
	if query.Has("permissions") {
		param := query.Get("permissions")

		permissionsParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "permissions"}, nil)
		return
	}
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
	}
	var issueKeyParam string
	if query.Has("issueKey") {
		param := query.Get("issueKey")

		issueKeyParam = param
	} else {
	}
	var projectKeyParam string
	if query.Has("projectKey") {
		param := query.Get("projectKey")

		projectKeyParam = param
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
	result, err := c.service.FindUsersWithAllPermissions(r.Context(), permissionsParam, queryParam, usernameParam, accountIdParam, issueKeyParam, projectKeyParam, startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// FindUsersWithBrowsePermission - Find users with browse permission
func (c *UserSearchAPIController) FindUsersWithBrowsePermission(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
	}
	var issueKeyParam string
	if query.Has("issueKey") {
		param := query.Get("issueKey")

		issueKeyParam = param
	} else {
	}
	var projectKeyParam string
	if query.Has("projectKey") {
		param := query.Get("projectKey")

		projectKeyParam = param
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
	result, err := c.service.FindUsersWithBrowsePermission(r.Context(), queryParam, usernameParam, accountIdParam, issueKeyParam, projectKeyParam, startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
