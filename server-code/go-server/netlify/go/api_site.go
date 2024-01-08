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

// SiteAPIController binds http requests to an api service and writes the service results to the http response
type SiteAPIController struct {
	service SiteAPIServicer
	errorHandler ErrorHandler
}

// SiteAPIOption for how the controller is set up.
type SiteAPIOption func(*SiteAPIController)

// WithSiteAPIErrorHandler inject ErrorHandler into controller
func WithSiteAPIErrorHandler(h ErrorHandler) SiteAPIOption {
	return func(c *SiteAPIController) {
		c.errorHandler = h
	}
}

// NewSiteAPIController creates a default api controller
func NewSiteAPIController(s SiteAPIServicer, opts ...SiteAPIOption) Router {
	controller := &SiteAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SiteAPIController
func (c *SiteAPIController) Routes() Routes {
	return Routes{
		"CreateSite": Route{
			strings.ToUpper("Post"),
			"/api/v1/sites",
			c.CreateSite,
		},
		"CreateSiteInTeam": Route{
			strings.ToUpper("Post"),
			"/api/v1/{account_slug}/sites",
			c.CreateSiteInTeam,
		},
		"DeleteSite": Route{
			strings.ToUpper("Delete"),
			"/api/v1/sites/{site_id}",
			c.DeleteSite,
		},
		"GetSite": Route{
			strings.ToUpper("Get"),
			"/api/v1/sites/{site_id}",
			c.GetSite,
		},
		"ListSites": Route{
			strings.ToUpper("Get"),
			"/api/v1/sites",
			c.ListSites,
		},
		"ListSitesForAccount": Route{
			strings.ToUpper("Get"),
			"/api/v1/{account_slug}/sites",
			c.ListSitesForAccount,
		},
		"UnlinkSiteRepo": Route{
			strings.ToUpper("Put"),
			"/api/v1/sites/{site_id}/unlink_repo",
			c.UnlinkSiteRepo,
		},
		"UpdateSite": Route{
			strings.ToUpper("Patch"),
			"/api/v1/sites/{site_id}",
			c.UpdateSite,
		},
	}
}

// CreateSite - 
func (c *SiteAPIController) CreateSite(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	siteParam := SiteSetup{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&siteParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSiteSetupRequired(siteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSiteSetupConstraints(siteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var configureDnsParam bool
	if query.Has("configure_dns") {
		param, err := parseBoolParameter(
			query.Get("configure_dns"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		configureDnsParam = param
	} else {
	}
	result, err := c.service.CreateSite(r.Context(), siteParam, configureDnsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateSiteInTeam - 
func (c *SiteAPIController) CreateSiteInTeam(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	accountSlugParam := params["account_slug"]
	if accountSlugParam == "" {
		c.errorHandler(w, r, &RequiredError{"account_slug"}, nil)
		return
	}
	var configureDnsParam bool
	if query.Has("configure_dns") {
		param, err := parseBoolParameter(
			query.Get("configure_dns"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		configureDnsParam = param
	} else {
	}
	siteParam := SiteSetup{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&siteParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSiteSetupRequired(siteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSiteSetupConstraints(siteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateSiteInTeam(r.Context(), accountSlugParam, configureDnsParam, siteParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteSite - 
func (c *SiteAPIController) DeleteSite(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	result, err := c.service.DeleteSite(r.Context(), siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSite - 
func (c *SiteAPIController) GetSite(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	result, err := c.service.GetSite(r.Context(), siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListSites - 
func (c *SiteAPIController) ListSites(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var nameParam string
	if query.Has("name") {
		param := query.Get("name")

		nameParam = param
	} else {
	}
	var filterParam string
	if query.Has("filter") {
		param := query.Get("filter")

		filterParam = param
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
	result, err := c.service.ListSites(r.Context(), nameParam, filterParam, pageParam, perPageParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListSitesForAccount - 
func (c *SiteAPIController) ListSitesForAccount(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	accountSlugParam := params["account_slug"]
	if accountSlugParam == "" {
		c.errorHandler(w, r, &RequiredError{"account_slug"}, nil)
		return
	}
	var nameParam string
	if query.Has("name") {
		param := query.Get("name")

		nameParam = param
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
	result, err := c.service.ListSitesForAccount(r.Context(), accountSlugParam, nameParam, pageParam, perPageParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UnlinkSiteRepo - 
func (c *SiteAPIController) UnlinkSiteRepo(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	result, err := c.service.UnlinkSiteRepo(r.Context(), siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateSite - 
func (c *SiteAPIController) UpdateSite(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	siteParam := SiteSetup{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&siteParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertSiteSetupRequired(siteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertSiteSetupConstraints(siteParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateSite(r.Context(), siteIdParam, siteParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}