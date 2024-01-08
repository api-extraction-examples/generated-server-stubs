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

	"github.com/gorilla/mux"
)

// IssueLinksAPIController binds http requests to an api service and writes the service results to the http response
type IssueLinksAPIController struct {
	service IssueLinksAPIServicer
	errorHandler ErrorHandler
}

// IssueLinksAPIOption for how the controller is set up.
type IssueLinksAPIOption func(*IssueLinksAPIController)

// WithIssueLinksAPIErrorHandler inject ErrorHandler into controller
func WithIssueLinksAPIErrorHandler(h ErrorHandler) IssueLinksAPIOption {
	return func(c *IssueLinksAPIController) {
		c.errorHandler = h
	}
}

// NewIssueLinksAPIController creates a default api controller
func NewIssueLinksAPIController(s IssueLinksAPIServicer, opts ...IssueLinksAPIOption) Router {
	controller := &IssueLinksAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the IssueLinksAPIController
func (c *IssueLinksAPIController) Routes() Routes {
	return Routes{
		"DeleteIssueLink": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/issueLink/{linkId}",
			c.DeleteIssueLink,
		},
		"GetIssueLink": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/issueLink/{linkId}",
			c.GetIssueLink,
		},
		"LinkIssues": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/issueLink",
			c.LinkIssues,
		},
	}
}

// DeleteIssueLink - Delete issue link
func (c *IssueLinksAPIController) DeleteIssueLink(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	linkIdParam := params["linkId"]
	if linkIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"linkId"}, nil)
		return
	}
	result, err := c.service.DeleteIssueLink(r.Context(), linkIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetIssueLink - Get issue link
func (c *IssueLinksAPIController) GetIssueLink(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	linkIdParam := params["linkId"]
	if linkIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"linkId"}, nil)
		return
	}
	result, err := c.service.GetIssueLink(r.Context(), linkIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// LinkIssues - Create issue link
func (c *IssueLinksAPIController) LinkIssues(w http.ResponseWriter, r *http.Request) {
	linkIssueRequestJsonBeanParam := LinkIssueRequestJsonBean{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&linkIssueRequestJsonBeanParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertLinkIssueRequestJsonBeanRequired(linkIssueRequestJsonBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertLinkIssueRequestJsonBeanConstraints(linkIssueRequestJsonBeanParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.LinkIssues(r.Context(), linkIssueRequestJsonBeanParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}