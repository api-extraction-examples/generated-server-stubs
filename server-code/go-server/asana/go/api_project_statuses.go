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

// ProjectStatusesAPIController binds http requests to an api service and writes the service results to the http response
type ProjectStatusesAPIController struct {
	service ProjectStatusesAPIServicer
	errorHandler ErrorHandler
}

// ProjectStatusesAPIOption for how the controller is set up.
type ProjectStatusesAPIOption func(*ProjectStatusesAPIController)

// WithProjectStatusesAPIErrorHandler inject ErrorHandler into controller
func WithProjectStatusesAPIErrorHandler(h ErrorHandler) ProjectStatusesAPIOption {
	return func(c *ProjectStatusesAPIController) {
		c.errorHandler = h
	}
}

// NewProjectStatusesAPIController creates a default api controller
func NewProjectStatusesAPIController(s ProjectStatusesAPIServicer, opts ...ProjectStatusesAPIOption) Router {
	controller := &ProjectStatusesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ProjectStatusesAPIController
func (c *ProjectStatusesAPIController) Routes() Routes {
	return Routes{
		"CreateProjectStatusForProject": Route{
			strings.ToUpper("Post"),
			"/api/1.0/projects/{project_gid}/project_statuses",
			c.CreateProjectStatusForProject,
		},
		"DeleteProjectStatus": Route{
			strings.ToUpper("Delete"),
			"/api/1.0/project_statuses/{project_status_gid}",
			c.DeleteProjectStatus,
		},
		"GetProjectStatus": Route{
			strings.ToUpper("Get"),
			"/api/1.0/project_statuses/{project_status_gid}",
			c.GetProjectStatus,
		},
		"GetProjectStatusesForProject": Route{
			strings.ToUpper("Get"),
			"/api/1.0/projects/{project_gid}/project_statuses",
			c.GetProjectStatusesForProject,
		},
	}
}

// CreateProjectStatusForProject - Create a project status
func (c *ProjectStatusesAPIController) CreateProjectStatusForProject(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectGidParam := params["project_gid"]
	if projectGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_gid"}, nil)
		return
	}
	createProjectStatusForProjectRequestParam := CreateProjectStatusForProjectRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createProjectStatusForProjectRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateProjectStatusForProjectRequestRequired(createProjectStatusForProjectRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateProjectStatusForProjectRequestConstraints(createProjectStatusForProjectRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
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
	result, err := c.service.CreateProjectStatusForProject(r.Context(), projectGidParam, createProjectStatusForProjectRequestParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteProjectStatus - Delete a project status
func (c *ProjectStatusesAPIController) DeleteProjectStatus(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectStatusGidParam := params["project_status_gid"]
	if projectStatusGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_status_gid"}, nil)
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
	result, err := c.service.DeleteProjectStatus(r.Context(), projectStatusGidParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetProjectStatus - Get a project status
func (c *ProjectStatusesAPIController) GetProjectStatus(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectStatusGidParam := params["project_status_gid"]
	if projectStatusGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_status_gid"}, nil)
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
	result, err := c.service.GetProjectStatus(r.Context(), projectStatusGidParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetProjectStatusesForProject - Get statuses from a project
func (c *ProjectStatusesAPIController) GetProjectStatusesForProject(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectGidParam := params["project_gid"]
	if projectGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_gid"}, nil)
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
	result, err := c.service.GetProjectStatusesForProject(r.Context(), projectGidParam, optPrettyParam, optFieldsParam, limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
