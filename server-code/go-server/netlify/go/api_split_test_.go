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

// SplitTestAPIController binds http requests to an api service and writes the service results to the http response
type SplitTestAPIController struct {
	service SplitTestAPIServicer
	errorHandler ErrorHandler
}

// SplitTestAPIOption for how the controller is set up.
type SplitTestAPIOption func(*SplitTestAPIController)

// WithSplitTestAPIErrorHandler inject ErrorHandler into controller
func WithSplitTestAPIErrorHandler(h ErrorHandler) SplitTestAPIOption {
	return func(c *SplitTestAPIController) {
		c.errorHandler = h
	}
}

// NewSplitTestAPIController creates a default api controller
func NewSplitTestAPIController(s SplitTestAPIServicer, opts ...SplitTestAPIOption) Router {
	controller := &SplitTestAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SplitTestAPIController
func (c *SplitTestAPIController) Routes() Routes {
	return Routes{
		"CreateSplitTest": Route{
			strings.ToUpper("Post"),
			"/api/v1/sites/{site_id}/traffic_splits",
			c.CreateSplitTest,
		},
		"DisableSplitTest": Route{
			strings.ToUpper("Post"),
			"/api/v1/sites/{site_id}/traffic_splits/{split_test_id}/unpublish",
			c.DisableSplitTest,
		},
		"EnableSplitTest": Route{
			strings.ToUpper("Post"),
			"/api/v1/sites/{site_id}/traffic_splits/{split_test_id}/publish",
			c.EnableSplitTest,
		},
		"GetSplitTest": Route{
			strings.ToUpper("Get"),
			"/api/v1/sites/{site_id}/traffic_splits/{split_test_id}",
			c.GetSplitTest,
		},
		"GetSplitTests": Route{
			strings.ToUpper("Get"),
			"/api/v1/sites/{site_id}/traffic_splits",
			c.GetSplitTests,
		},
		"UpdateSplitTest": Route{
			strings.ToUpper("Put"),
			"/api/v1/sites/{site_id}/traffic_splits/{split_test_id}",
			c.UpdateSplitTest,
		},
	}
}

// CreateSplitTest - 
func (c *SplitTestAPIController) CreateSplitTest(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	branchTestsParam := SplitTestSetup{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&branchTestsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSplitTestSetupRequired(branchTestsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSplitTestSetupConstraints(branchTestsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateSplitTest(r.Context(), siteIdParam, branchTestsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DisableSplitTest - 
func (c *SplitTestAPIController) DisableSplitTest(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	splitTestIdParam := params["split_test_id"]
	if splitTestIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"split_test_id"}, nil)
		return
	}
	result, err := c.service.DisableSplitTest(r.Context(), siteIdParam, splitTestIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// EnableSplitTest - 
func (c *SplitTestAPIController) EnableSplitTest(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	splitTestIdParam := params["split_test_id"]
	if splitTestIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"split_test_id"}, nil)
		return
	}
	result, err := c.service.EnableSplitTest(r.Context(), siteIdParam, splitTestIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSplitTest - 
func (c *SplitTestAPIController) GetSplitTest(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	splitTestIdParam := params["split_test_id"]
	if splitTestIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"split_test_id"}, nil)
		return
	}
	result, err := c.service.GetSplitTest(r.Context(), siteIdParam, splitTestIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSplitTests - 
func (c *SplitTestAPIController) GetSplitTests(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	result, err := c.service.GetSplitTests(r.Context(), siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateSplitTest - 
func (c *SplitTestAPIController) UpdateSplitTest(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	splitTestIdParam := params["split_test_id"]
	if splitTestIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"split_test_id"}, nil)
		return
	}
	branchTestsParam := SplitTestSetup{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&branchTestsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSplitTestSetupRequired(branchTestsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSplitTestSetupConstraints(branchTestsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateSplitTest(r.Context(), siteIdParam, splitTestIdParam, branchTestsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}