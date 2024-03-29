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

// SectionsAPIController binds http requests to an api service and writes the service results to the http response
type SectionsAPIController struct {
	service SectionsAPIServicer
	errorHandler ErrorHandler
}

// SectionsAPIOption for how the controller is set up.
type SectionsAPIOption func(*SectionsAPIController)

// WithSectionsAPIErrorHandler inject ErrorHandler into controller
func WithSectionsAPIErrorHandler(h ErrorHandler) SectionsAPIOption {
	return func(c *SectionsAPIController) {
		c.errorHandler = h
	}
}

// NewSectionsAPIController creates a default api controller
func NewSectionsAPIController(s SectionsAPIServicer, opts ...SectionsAPIOption) Router {
	controller := &SectionsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SectionsAPIController
func (c *SectionsAPIController) Routes() Routes {
	return Routes{
		"AddTaskForSection": Route{
			strings.ToUpper("Post"),
			"/api/1.0/sections/{section_gid}/addTask",
			c.AddTaskForSection,
		},
		"CreateSectionForProject": Route{
			strings.ToUpper("Post"),
			"/api/1.0/projects/{project_gid}/sections",
			c.CreateSectionForProject,
		},
		"DeleteSection": Route{
			strings.ToUpper("Delete"),
			"/api/1.0/sections/{section_gid}",
			c.DeleteSection,
		},
		"GetSection": Route{
			strings.ToUpper("Get"),
			"/api/1.0/sections/{section_gid}",
			c.GetSection,
		},
		"GetSectionsForProject": Route{
			strings.ToUpper("Get"),
			"/api/1.0/projects/{project_gid}/sections",
			c.GetSectionsForProject,
		},
		"InsertSectionForProject": Route{
			strings.ToUpper("Post"),
			"/api/1.0/projects/{project_gid}/sections/insert",
			c.InsertSectionForProject,
		},
		"UpdateSection": Route{
			strings.ToUpper("Put"),
			"/api/1.0/sections/{section_gid}",
			c.UpdateSection,
		},
	}
}

// AddTaskForSection - Add task to section
func (c *SectionsAPIController) AddTaskForSection(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	sectionGidParam := params["section_gid"]
	if sectionGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"section_gid"}, nil)
		return
	}
	addTaskForSectionRequestParam := AddTaskForSectionRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&addTaskForSectionRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAddTaskForSectionRequestRequired(addTaskForSectionRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAddTaskForSectionRequestConstraints(addTaskForSectionRequestParam); err != nil {
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
	result, err := c.service.AddTaskForSection(r.Context(), sectionGidParam, addTaskForSectionRequestParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateSectionForProject - Create a section in a project
func (c *SectionsAPIController) CreateSectionForProject(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectGidParam := params["project_gid"]
	if projectGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_gid"}, nil)
		return
	}
	createSectionForProjectRequestParam := CreateSectionForProjectRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createSectionForProjectRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateSectionForProjectRequestRequired(createSectionForProjectRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateSectionForProjectRequestConstraints(createSectionForProjectRequestParam); err != nil {
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
	result, err := c.service.CreateSectionForProject(r.Context(), projectGidParam, createSectionForProjectRequestParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteSection - Delete a section
func (c *SectionsAPIController) DeleteSection(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	sectionGidParam := params["section_gid"]
	if sectionGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"section_gid"}, nil)
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
	result, err := c.service.DeleteSection(r.Context(), sectionGidParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSection - Get a section
func (c *SectionsAPIController) GetSection(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	sectionGidParam := params["section_gid"]
	if sectionGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"section_gid"}, nil)
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
	result, err := c.service.GetSection(r.Context(), sectionGidParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSectionsForProject - Get sections in a project
func (c *SectionsAPIController) GetSectionsForProject(w http.ResponseWriter, r *http.Request) {
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
	result, err := c.service.GetSectionsForProject(r.Context(), projectGidParam, optPrettyParam, optFieldsParam, limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// InsertSectionForProject - Move or Insert sections
func (c *SectionsAPIController) InsertSectionForProject(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	projectGidParam := params["project_gid"]
	if projectGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"project_gid"}, nil)
		return
	}
	insertSectionForProjectRequestParam := InsertSectionForProjectRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&insertSectionForProjectRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertInsertSectionForProjectRequestRequired(insertSectionForProjectRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertInsertSectionForProjectRequestConstraints(insertSectionForProjectRequestParam); err != nil {
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
	result, err := c.service.InsertSectionForProject(r.Context(), projectGidParam, insertSectionForProjectRequestParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateSection - Update a section
func (c *SectionsAPIController) UpdateSection(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	sectionGidParam := params["section_gid"]
	if sectionGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"section_gid"}, nil)
		return
	}
	createSectionForProjectRequestParam := CreateSectionForProjectRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createSectionForProjectRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateSectionForProjectRequestRequired(createSectionForProjectRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateSectionForProjectRequestConstraints(createSectionForProjectRequestParam); err != nil {
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
	result, err := c.service.UpdateSection(r.Context(), sectionGidParam, createSectionForProjectRequestParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
