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

// UsersAPIController binds http requests to an api service and writes the service results to the http response
type UsersAPIController struct {
	service UsersAPIServicer
	errorHandler ErrorHandler
}

// UsersAPIOption for how the controller is set up.
type UsersAPIOption func(*UsersAPIController)

// WithUsersAPIErrorHandler inject ErrorHandler into controller
func WithUsersAPIErrorHandler(h ErrorHandler) UsersAPIOption {
	return func(c *UsersAPIController) {
		c.errorHandler = h
	}
}

// NewUsersAPIController creates a default api controller
func NewUsersAPIController(s UsersAPIServicer, opts ...UsersAPIOption) Router {
	controller := &UsersAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the UsersAPIController
func (c *UsersAPIController) Routes() Routes {
	return Routes{
		"BulkGetUsers": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/bulk",
			c.BulkGetUsers,
		},
		"BulkGetUsersMigration": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/bulk/migration",
			c.BulkGetUsersMigration,
		},
		"CreateUser": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/user",
			c.CreateUser,
		},
		"GetAllUsers": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/users/search",
			c.GetAllUsers,
		},
		"GetAllUsersDefault": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/users",
			c.GetAllUsersDefault,
		},
		"GetUser": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user",
			c.GetUser,
		},
		"GetUserDefaultColumns": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/columns",
			c.GetUserDefaultColumns,
		},
		"GetUserEmail": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/email",
			c.GetUserEmail,
		},
		"GetUserEmailBulk": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/email/bulk",
			c.GetUserEmailBulk,
		},
		"GetUserGroups": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/user/groups",
			c.GetUserGroups,
		},
		"RemoveUser": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/user",
			c.RemoveUser,
		},
		"ResetUserColumns": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/user/columns",
			c.ResetUserColumns,
		},
		"SetUserColumns": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/user/columns",
			c.SetUserColumns,
		},
	}
}

// BulkGetUsers - Bulk get users
func (c *UsersAPIController) BulkGetUsers(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam []string
	if query.Has("accountId") {
		accountIdParam = strings.Split(query.Get("accountId"), ",")
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
		var param int32 = 10
		maxResultsParam = param
	}
	var usernameParam []string
	if query.Has("username") {
		usernameParam = strings.Split(query.Get("username"), ",")
	}
	var keyParam []string
	if query.Has("key") {
		keyParam = strings.Split(query.Get("key"), ",")
	}
	result, err := c.service.BulkGetUsers(r.Context(), accountIdParam, startAtParam, maxResultsParam, usernameParam, keyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// BulkGetUsersMigration - Get account IDs for users
func (c *UsersAPIController) BulkGetUsersMigration(w http.ResponseWriter, r *http.Request) {
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
		var param int32 = 10
		maxResultsParam = param
	}
	var usernameParam []string
	if query.Has("username") {
		usernameParam = strings.Split(query.Get("username"), ",")
	}
	var keyParam []string
	if query.Has("key") {
		keyParam = strings.Split(query.Get("key"), ",")
	}
	result, err := c.service.BulkGetUsersMigration(r.Context(), startAtParam, maxResultsParam, usernameParam, keyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateUser - Create user
func (c *UsersAPIController) CreateUser(w http.ResponseWriter, r *http.Request) {
	newUserDetailsParam := NewUserDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&newUserDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertNewUserDetailsRequired(newUserDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertNewUserDetailsConstraints(newUserDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateUser(r.Context(), newUserDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetAllUsers - Get all users
func (c *UsersAPIController) GetAllUsers(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
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
	result, err := c.service.GetAllUsers(r.Context(), startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetAllUsersDefault - Get all users default
func (c *UsersAPIController) GetAllUsersDefault(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
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
	result, err := c.service.GetAllUsersDefault(r.Context(), startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetUser - Get user
func (c *UsersAPIController) GetUser(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	var keyParam string
	if query.Has("key") {
		param := query.Get("key")

		keyParam = param
	} else {
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetUser(r.Context(), accountIdParam, usernameParam, keyParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetUserDefaultColumns - Get user default columns
func (c *UsersAPIController) GetUserDefaultColumns(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	result, err := c.service.GetUserDefaultColumns(r.Context(), accountIdParam, usernameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetUserEmail - Get user email
func (c *UsersAPIController) GetUserEmail(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "accountId"}, nil)
		return
	}
	result, err := c.service.GetUserEmail(r.Context(), accountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetUserEmailBulk - Get user email bulk
func (c *UsersAPIController) GetUserEmailBulk(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam []string
	if query.Has("accountId") {
		accountIdParam = strings.Split(query.Get("accountId"), ",")
	}
	result, err := c.service.GetUserEmailBulk(r.Context(), accountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetUserGroups - Get user groups
func (c *UsersAPIController) GetUserGroups(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "accountId"}, nil)
		return
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	var keyParam string
	if query.Has("key") {
		param := query.Get("key")

		keyParam = param
	} else {
	}
	result, err := c.service.GetUserGroups(r.Context(), accountIdParam, usernameParam, keyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RemoveUser - Delete user
func (c *UsersAPIController) RemoveUser(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "accountId"}, nil)
		return
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	var keyParam string
	if query.Has("key") {
		param := query.Get("key")

		keyParam = param
	} else {
	}
	result, err := c.service.RemoveUser(r.Context(), accountIdParam, usernameParam, keyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ResetUserColumns - Reset user default columns
func (c *UsersAPIController) ResetUserColumns(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
	}
	var usernameParam string
	if query.Has("username") {
		param := query.Get("username")

		usernameParam = param
	} else {
	}
	result, err := c.service.ResetUserColumns(r.Context(), accountIdParam, usernameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetUserColumns - Set user default columns
func (c *UsersAPIController) SetUserColumns(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountIdParam string
	if query.Has("accountId") {
		param := query.Get("accountId")

		accountIdParam = param
	} else {
	}
	requestBodyParam := []string{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&requestBodyParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.SetUserColumns(r.Context(), accountIdParam, requestBodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
