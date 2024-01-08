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

// IssueNotificationSchemesAPIController binds http requests to an api service and writes the service results to the http response
type IssueNotificationSchemesAPIController struct {
	service IssueNotificationSchemesAPIServicer
	errorHandler ErrorHandler
}

// IssueNotificationSchemesAPIOption for how the controller is set up.
type IssueNotificationSchemesAPIOption func(*IssueNotificationSchemesAPIController)

// WithIssueNotificationSchemesAPIErrorHandler inject ErrorHandler into controller
func WithIssueNotificationSchemesAPIErrorHandler(h ErrorHandler) IssueNotificationSchemesAPIOption {
	return func(c *IssueNotificationSchemesAPIController) {
		c.errorHandler = h
	}
}

// NewIssueNotificationSchemesAPIController creates a default api controller
func NewIssueNotificationSchemesAPIController(s IssueNotificationSchemesAPIServicer, opts ...IssueNotificationSchemesAPIOption) Router {
	controller := &IssueNotificationSchemesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the IssueNotificationSchemesAPIController
func (c *IssueNotificationSchemesAPIController) Routes() Routes {
	return Routes{
		"AddNotifications": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/notificationscheme/{id}/notification",
			c.AddNotifications,
		},
		"CreateNotificationScheme": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/notificationscheme",
			c.CreateNotificationScheme,
		},
		"DeleteNotificationScheme": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/notificationscheme/{notificationSchemeId}",
			c.DeleteNotificationScheme,
		},
		"GetNotificationScheme": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/notificationscheme/{id}",
			c.GetNotificationScheme,
		},
		"GetNotificationSchemeToProjectMappings": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/notificationscheme/project",
			c.GetNotificationSchemeToProjectMappings,
		},
		"GetNotificationSchemes": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/notificationscheme",
			c.GetNotificationSchemes,
		},
		"RemoveNotificationFromNotificationScheme": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/notificationscheme/{notificationSchemeId}/notification/{notificationId}",
			c.RemoveNotificationFromNotificationScheme,
		},
		"UpdateNotificationScheme": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/notificationscheme/{id}",
			c.UpdateNotificationScheme,
		},
	}
}

// AddNotifications - Add notifications to notification scheme
func (c *IssueNotificationSchemesAPIController) AddNotifications(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	addNotificationsDetailsParam := AddNotificationsDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&addNotificationsDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAddNotificationsDetailsRequired(addNotificationsDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAddNotificationsDetailsConstraints(addNotificationsDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AddNotifications(r.Context(), idParam, addNotificationsDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateNotificationScheme - Create notification scheme
func (c *IssueNotificationSchemesAPIController) CreateNotificationScheme(w http.ResponseWriter, r *http.Request) {
	createNotificationSchemeDetailsParam := CreateNotificationSchemeDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createNotificationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateNotificationSchemeDetailsRequired(createNotificationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateNotificationSchemeDetailsConstraints(createNotificationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateNotificationScheme(r.Context(), createNotificationSchemeDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteNotificationScheme - Delete notification scheme
func (c *IssueNotificationSchemesAPIController) DeleteNotificationScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	notificationSchemeIdParam := params["notificationSchemeId"]
	if notificationSchemeIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"notificationSchemeId"}, nil)
		return
	}
	result, err := c.service.DeleteNotificationScheme(r.Context(), notificationSchemeIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetNotificationScheme - Get notification scheme
func (c *IssueNotificationSchemesAPIController) GetNotificationScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetNotificationScheme(r.Context(), idParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetNotificationSchemeToProjectMappings - Get projects using notification schemes paginated
func (c *IssueNotificationSchemesAPIController) GetNotificationSchemeToProjectMappings(w http.ResponseWriter, r *http.Request) {
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
	var notificationSchemeIdParam []string
	if query.Has("notificationSchemeId") {
		notificationSchemeIdParam = strings.Split(query.Get("notificationSchemeId"), ",")
	}
	var projectIdParam []string
	if query.Has("projectId") {
		projectIdParam = strings.Split(query.Get("projectId"), ",")
	}
	result, err := c.service.GetNotificationSchemeToProjectMappings(r.Context(), startAtParam, maxResultsParam, notificationSchemeIdParam, projectIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetNotificationSchemes - Get notification schemes paginated
func (c *IssueNotificationSchemesAPIController) GetNotificationSchemes(w http.ResponseWriter, r *http.Request) {
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
	var expandParam string
	if query.Has("expand") {
		param := query.Get("expand")

		expandParam = param
	} else {
	}
	result, err := c.service.GetNotificationSchemes(r.Context(), startAtParam, maxResultsParam, idParam, projectIdParam, onlyDefaultParam, expandParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RemoveNotificationFromNotificationScheme - Remove notification from notification scheme
func (c *IssueNotificationSchemesAPIController) RemoveNotificationFromNotificationScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	notificationSchemeIdParam := params["notificationSchemeId"]
	if notificationSchemeIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"notificationSchemeId"}, nil)
		return
	}
	notificationIdParam := params["notificationId"]
	if notificationIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"notificationId"}, nil)
		return
	}
	result, err := c.service.RemoveNotificationFromNotificationScheme(r.Context(), notificationSchemeIdParam, notificationIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateNotificationScheme - Update notification scheme
func (c *IssueNotificationSchemesAPIController) UpdateNotificationScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	updateNotificationSchemeDetailsParam := UpdateNotificationSchemeDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateNotificationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateNotificationSchemeDetailsRequired(updateNotificationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateNotificationSchemeDetailsConstraints(updateNotificationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateNotificationScheme(r.Context(), idParam, updateNotificationSchemeDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}