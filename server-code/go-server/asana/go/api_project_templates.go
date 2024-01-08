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

// ProjectTemplatesAPIController binds http requests to an api service and writes the service results to the http response
type ProjectTemplatesAPIController struct {
	service ProjectTemplatesAPIServicer
	errorHandler ErrorHandler
}

// ProjectTemplatesAPIOption for how the controller is set up.
type ProjectTemplatesAPIOption func(*ProjectTemplatesAPIController)

// WithProjectTemplatesAPIErrorHandler inject ErrorHandler into controller
func WithProjectTemplatesAPIErrorHandler(h ErrorHandler) ProjectTemplatesAPIOption {
	return func(c *ProjectTemplatesAPIController) {
		c.errorHandler = h
	}
}

// NewProjectTemplatesAPIController creates a default api controller
func NewProjectTemplatesAPIController(s ProjectTemplatesAPIServicer, opts ...ProjectTemplatesAPIOption) Router {
	controller := &ProjectTemplatesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ProjectTemplatesAPIController
func (c *ProjectTemplatesAPIController) Routes() Routes {
	return Routes{
		"GetProjectTemplate": Route{
			strings.ToUpper("Get"),
			"/api/1.0/project_templates/{project_template_gid}",
			c.GetProjectTemplate,
		},
		"GetProjectTemplates": Route{
			strings.ToUpper("Get"),
			"/api/1.0/project_templates",
			c.GetProjectTemplates,
		},
		"GetProjectTemplatesForTeam": Route{
			strings.ToUpper("Get"),
			"/api/1.0/teams/{team_gid}/project_templates",
			c.GetProjectTemplatesForTeam,
		},
		"InstantiateProject": Route{
			strings.ToUpper("Post"),
			"/api/1.0/project_templates/{project_template_gid}/instantiateProject",
			c.InstantiateProject,
		},
	}
}

// GetProjectTemplate - Get a project template
func (c *ProjectTemplatesAPIController) GetProjectTemplate(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectTemplateGidParam := params["project_template_gid"]
	if projectTemplateGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_template_gid"}, nil)
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
	result, err := c.service.GetProjectTemplate(r.Context(), projectTemplateGidParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetProjectTemplates - Get multiple project templates
func (c *ProjectTemplatesAPIController) GetProjectTemplates(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
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
	var workspaceParam string
	if query.Has("workspace") {
		param := query.Get("workspace")

		workspaceParam = param
	} else {
	}
	var teamParam string
	if query.Has("team") {
		param := query.Get("team")

		teamParam = param
	} else {
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
	result, err := c.service.GetProjectTemplates(r.Context(), optPrettyParam, optFieldsParam, workspaceParam, teamParam, limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetProjectTemplatesForTeam - Get a team's project templates
func (c *ProjectTemplatesAPIController) GetProjectTemplatesForTeam(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	teamGidParam := params["team_gid"]
	if teamGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"team_gid"}, nil)
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
	result, err := c.service.GetProjectTemplatesForTeam(r.Context(), teamGidParam, optPrettyParam, optFieldsParam, limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// InstantiateProject - Instantiate a project from a project template
func (c *ProjectTemplatesAPIController) InstantiateProject(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectTemplateGidParam := params["project_template_gid"]
	if projectTemplateGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_template_gid"}, nil)
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
	instantiateProjectRequestParam := InstantiateProjectRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&instantiateProjectRequestParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertInstantiateProjectRequestRequired(instantiateProjectRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertInstantiateProjectRequestConstraints(instantiateProjectRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.InstantiateProject(r.Context(), projectTemplateGidParam, optPrettyParam, optFieldsParam, instantiateProjectRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
