/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// DeployAPIController binds http requests to an api service and writes the service results to the http response
type DeployAPIController struct {
	service DeployAPIServicer
	errorHandler ErrorHandler
}

// DeployAPIOption for how the controller is set up.
type DeployAPIOption func(*DeployAPIController)

// WithDeployAPIErrorHandler inject ErrorHandler into controller
func WithDeployAPIErrorHandler(h ErrorHandler) DeployAPIOption {
	return func(c *DeployAPIController) {
		c.errorHandler = h
	}
}

// NewDeployAPIController creates a default api controller
func NewDeployAPIController(s DeployAPIServicer, opts ...DeployAPIOption) Router {
	controller := &DeployAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DeployAPIController
func (c *DeployAPIController) Routes() Routes {
	return Routes{
		"CancelSiteDeploy": Route{
			strings.ToUpper("Post"),
			"/api/v1/deploys/{deploy_id}/cancel",
			c.CancelSiteDeploy,
		},
		"CreateSiteDeploy": Route{
			strings.ToUpper("Post"),
			"/api/v1/sites/{site_id}/deploys",
			c.CreateSiteDeploy,
		},
		"DeleteDeploy": Route{
			strings.ToUpper("Delete"),
			"/api/v1/deploys/{deploy_id}",
			c.DeleteDeploy,
		},
		"DeleteSiteDeploy": Route{
			strings.ToUpper("Delete"),
			"/api/v1/sites/{site_id}/deploys/{deploy_id}",
			c.DeleteSiteDeploy,
		},
		"GetDeploy": Route{
			strings.ToUpper("Get"),
			"/api/v1/deploys/{deploy_id}",
			c.GetDeploy,
		},
		"GetSiteDeploy": Route{
			strings.ToUpper("Get"),
			"/api/v1/sites/{site_id}/deploys/{deploy_id}",
			c.GetSiteDeploy,
		},
		"ListSiteDeploys": Route{
			strings.ToUpper("Get"),
			"/api/v1/sites/{site_id}/deploys",
			c.ListSiteDeploys,
		},
		"LockDeploy": Route{
			strings.ToUpper("Post"),
			"/api/v1/deploys/{deploy_id}/lock",
			c.LockDeploy,
		},
		"RestoreSiteDeploy": Route{
			strings.ToUpper("Post"),
			"/api/v1/sites/{site_id}/deploys/{deploy_id}/restore",
			c.RestoreSiteDeploy,
		},
		"RollbackSiteDeploy": Route{
			strings.ToUpper("Put"),
			"/api/v1/sites/{site_id}/rollback",
			c.RollbackSiteDeploy,
		},
		"UnlockDeploy": Route{
			strings.ToUpper("Post"),
			"/api/v1/deploys/{deploy_id}/unlock",
			c.UnlockDeploy,
		},
		"UpdateSiteDeploy": Route{
			strings.ToUpper("Put"),
			"/api/v1/sites/{site_id}/deploys/{deploy_id}",
			c.UpdateSiteDeploy,
		},
	}
}

// CancelSiteDeploy - 
func (c *DeployAPIController) CancelSiteDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	deployIdParam := params["deploy_id"]
	if deployIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"deploy_id"}, nil)
		return
	}
	result, err := c.service.CancelSiteDeploy(r.Context(), deployIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateSiteDeploy - 
func (c *DeployAPIController) CreateSiteDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	deployParam := DeployFiles{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&deployParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertDeployFilesRequired(deployParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertDeployFilesConstraints(deployParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var deployPreviewsParam bool
	if query.Has("deploy-previews") {
		param, err := parseBoolParameter(
			query.Get("deploy-previews"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		deployPreviewsParam = param
	} else {
	}
	var productionParam bool
	if query.Has("production") {
		param, err := parseBoolParameter(
			query.Get("production"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		productionParam = param
	} else {
	}
	var stateParam string
	if query.Has("state") {
		param := query.Get("state")

		stateParam = param
	} else {
	}
	var branchParam string
	if query.Has("branch") {
		param := query.Get("branch")

		branchParam = param
	} else {
	}
	var latestPublishedParam bool
	if query.Has("latest-published") {
		param, err := parseBoolParameter(
			query.Get("latest-published"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		latestPublishedParam = param
	} else {
	}
	var titleParam string
	if query.Has("title") {
		param := query.Get("title")

		titleParam = param
	} else {
	}
	result, err := c.service.CreateSiteDeploy(r.Context(), siteIdParam, deployParam, deployPreviewsParam, productionParam, stateParam, branchParam, latestPublishedParam, titleParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteDeploy - 
func (c *DeployAPIController) DeleteDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	deployIdParam := params["deploy_id"]
	if deployIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"deploy_id"}, nil)
		return
	}
	result, err := c.service.DeleteDeploy(r.Context(), deployIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteSiteDeploy - 
func (c *DeployAPIController) DeleteSiteDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	deployIdParam := params["deploy_id"]
	if deployIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"deploy_id"}, nil)
		return
	}
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	result, err := c.service.DeleteSiteDeploy(r.Context(), deployIdParam, siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetDeploy - 
func (c *DeployAPIController) GetDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	deployIdParam := params["deploy_id"]
	if deployIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"deploy_id"}, nil)
		return
	}
	result, err := c.service.GetDeploy(r.Context(), deployIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSiteDeploy - 
func (c *DeployAPIController) GetSiteDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	deployIdParam := params["deploy_id"]
	if deployIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"deploy_id"}, nil)
		return
	}
	result, err := c.service.GetSiteDeploy(r.Context(), siteIdParam, deployIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListSiteDeploys - 
func (c *DeployAPIController) ListSiteDeploys(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	var deployPreviewsParam bool
	if query.Has("deploy-previews") {
		param, err := parseBoolParameter(
			query.Get("deploy-previews"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		deployPreviewsParam = param
	} else {
	}
	var productionParam bool
	if query.Has("production") {
		param, err := parseBoolParameter(
			query.Get("production"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		productionParam = param
	} else {
	}
	var stateParam string
	if query.Has("state") {
		param := query.Get("state")

		stateParam = param
	} else {
	}
	var branchParam string
	if query.Has("branch") {
		param := query.Get("branch")

		branchParam = param
	} else {
	}
	var latestPublishedParam bool
	if query.Has("latest-published") {
		param, err := parseBoolParameter(
			query.Get("latest-published"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		latestPublishedParam = param
	} else {
	}
	var pageParam int32
	if query.Has("page") {
		param, err := parseNumericParameter[int32](
			query.Get("page"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		pageParam = param
	} else {
	}
	var perPageParam int32
	if query.Has("per_page") {
		param, err := parseNumericParameter[int32](
			query.Get("per_page"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		perPageParam = param
	} else {
	}
	result, err := c.service.ListSiteDeploys(r.Context(), siteIdParam, deployPreviewsParam, productionParam, stateParam, branchParam, latestPublishedParam, pageParam, perPageParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// LockDeploy - 
func (c *DeployAPIController) LockDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	deployIdParam := params["deploy_id"]
	if deployIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"deploy_id"}, nil)
		return
	}
	result, err := c.service.LockDeploy(r.Context(), deployIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RestoreSiteDeploy - 
func (c *DeployAPIController) RestoreSiteDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	deployIdParam := params["deploy_id"]
	if deployIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"deploy_id"}, nil)
		return
	}
	result, err := c.service.RestoreSiteDeploy(r.Context(), siteIdParam, deployIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RollbackSiteDeploy - 
func (c *DeployAPIController) RollbackSiteDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	result, err := c.service.RollbackSiteDeploy(r.Context(), siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UnlockDeploy - 
func (c *DeployAPIController) UnlockDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	deployIdParam := params["deploy_id"]
	if deployIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"deploy_id"}, nil)
		return
	}
	result, err := c.service.UnlockDeploy(r.Context(), deployIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateSiteDeploy - 
func (c *DeployAPIController) UpdateSiteDeploy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	deployIdParam := params["deploy_id"]
	if deployIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"deploy_id"}, nil)
		return
	}
	deployParam := DeployFiles{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&deployParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertDeployFilesRequired(deployParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertDeployFilesConstraints(deployParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateSiteDeploy(r.Context(), siteIdParam, deployIdParam, deployParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
