/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// ProjectsAPIController binds http requests to an api service and writes the service results to the http response
type ProjectsAPIController struct {
	service ProjectsAPIServicer
	errorHandler ErrorHandler
}

// ProjectsAPIOption for how the controller is set up.
type ProjectsAPIOption func(*ProjectsAPIController)

// WithProjectsAPIErrorHandler inject ErrorHandler into controller
func WithProjectsAPIErrorHandler(h ErrorHandler) ProjectsAPIOption {
	return func(c *ProjectsAPIController) {
		c.errorHandler = h
	}
}

// NewProjectsAPIController creates a default api controller
func NewProjectsAPIController(s ProjectsAPIServicer, opts ...ProjectsAPIOption) Router {
	controller := &ProjectsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ProjectsAPIController
func (c *ProjectsAPIController) Routes() Routes {
	return Routes{
		"DeleteProject": Route{
			strings.ToUpper("Delete"),
			"/api/v2/projects/{projectKey}",
			c.DeleteProject,
		},
		"GetProject": Route{
			strings.ToUpper("Get"),
			"/api/v2/projects/{projectKey}",
			c.GetProject,
		},
		"GetProjects": Route{
			strings.ToUpper("Get"),
			"/api/v2/projects",
			c.GetProjects,
		},
		"PatchProject": Route{
			strings.ToUpper("Patch"),
			"/api/v2/projects/{projectKey}",
			c.PatchProject,
		},
		"PostProject": Route{
			strings.ToUpper("Post"),
			"/api/v2/projects",
			c.PostProject,
		},
	}
}

// DeleteProject - Delete a project by key. Caution-- deleting a project will delete all associated environments and feature flags. You cannot delete the last project in an account.
func (c *ProjectsAPIController) DeleteProject(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	projectKeyParam := params["projectKey"]
	if projectKeyParam == "" {
		c.errorHandler(w, r, &RequiredError{"projectKey"}, nil)
		return
	}
	result, err := c.service.DeleteProject(r.Context(), projectKeyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetProject - Fetch a single project by key.
func (c *ProjectsAPIController) GetProject(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	projectKeyParam := params["projectKey"]
	if projectKeyParam == "" {
		c.errorHandler(w, r, &RequiredError{"projectKey"}, nil)
		return
	}
	result, err := c.service.GetProject(r.Context(), projectKeyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetProjects - Returns a list of all projects in the account.
func (c *ProjectsAPIController) GetProjects(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetProjects(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PatchProject - Modify a project by ID.
func (c *ProjectsAPIController) PatchProject(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	projectKeyParam := params["projectKey"]
	if projectKeyParam == "" {
		c.errorHandler(w, r, &RequiredError{"projectKey"}, nil)
		return
	}
	patchDeltaParam := []PatchOperation{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&patchDeltaParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	for _, el := range patchDeltaParam {
		if err := AssertPatchOperationRequired(el); err != nil {
			c.errorHandler(w, r, err, nil)
			return
		}
	}
	result, err := c.service.PatchProject(r.Context(), projectKeyParam, patchDeltaParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PostProject - Create a new project with the given key and name.
func (c *ProjectsAPIController) PostProject(w http.ResponseWriter, r *http.Request) {
	projectBodyParam := PostProjectRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&projectBodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPostProjectRequestRequired(projectBodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPostProjectRequestConstraints(projectBodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PostProject(r.Context(), projectBodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
