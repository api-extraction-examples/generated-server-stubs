/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// ProjectMembershipsAPIController binds http requests to an api service and writes the service results to the http response
type ProjectMembershipsAPIController struct {
	service ProjectMembershipsAPIServicer
	errorHandler ErrorHandler
}

// ProjectMembershipsAPIOption for how the controller is set up.
type ProjectMembershipsAPIOption func(*ProjectMembershipsAPIController)

// WithProjectMembershipsAPIErrorHandler inject ErrorHandler into controller
func WithProjectMembershipsAPIErrorHandler(h ErrorHandler) ProjectMembershipsAPIOption {
	return func(c *ProjectMembershipsAPIController) {
		c.errorHandler = h
	}
}

// NewProjectMembershipsAPIController creates a default api controller
func NewProjectMembershipsAPIController(s ProjectMembershipsAPIServicer, opts ...ProjectMembershipsAPIOption) Router {
	controller := &ProjectMembershipsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ProjectMembershipsAPIController
func (c *ProjectMembershipsAPIController) Routes() Routes {
	return Routes{
		"GetProjectMembership": Route{
			strings.ToUpper("Get"),
			"/api/1.0/project_memberships/{project_membership_gid}",
			c.GetProjectMembership,
		},
		"GetProjectMembershipsForProject": Route{
			strings.ToUpper("Get"),
			"/api/1.0/projects/{project_gid}/project_memberships",
			c.GetProjectMembershipsForProject,
		},
	}
}

// GetProjectMembership - Get a project membership
func (c *ProjectMembershipsAPIController) GetProjectMembership(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectMembershipGidParam := params["project_membership_gid"]
	if projectMembershipGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_membership_gid"}, nil)
		return
	}
	var optPrettyParam bool
	if query.Has("opt_pretty") {
		param, err := parseBoolParameter(
			query.Get("opt_pretty"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		optPrettyParam = param
	} else {
	}
	var optFieldsParam []string
	if query.Has("opt_fields") {
		optFieldsParam = strings.Split(query.Get("opt_fields"), ",")
	}
	result, err := c.service.GetProjectMembership(r.Context(), projectMembershipGidParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetProjectMembershipsForProject - Get memberships from a project
func (c *ProjectMembershipsAPIController) GetProjectMembershipsForProject(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectGidParam := params["project_gid"]
	if projectGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_gid"}, nil)
		return
	}
	var userParam string
	if query.Has("user") {
		param := query.Get("user")

		userParam = param
	} else {
	}
	var optPrettyParam bool
	if query.Has("opt_pretty") {
		param, err := parseBoolParameter(
			query.Get("opt_pretty"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		optPrettyParam = param
	} else {
	}
	var optFieldsParam []string
	if query.Has("opt_fields") {
		optFieldsParam = strings.Split(query.Get("opt_fields"), ",")
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
	}
	var offsetParam string
	if query.Has("offset") {
		param := query.Get("offset")

		offsetParam = param
	} else {
	}
	result, err := c.service.GetProjectMembershipsForProject(r.Context(), projectGidParam, userParam, optPrettyParam, optFieldsParam, limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}