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

// AnnouncementBannerAPIController binds http requests to an api service and writes the service results to the http response
type AnnouncementBannerAPIController struct {
	service AnnouncementBannerAPIServicer
	errorHandler ErrorHandler
}

// AnnouncementBannerAPIOption for how the controller is set up.
type AnnouncementBannerAPIOption func(*AnnouncementBannerAPIController)

// WithAnnouncementBannerAPIErrorHandler inject ErrorHandler into controller
func WithAnnouncementBannerAPIErrorHandler(h ErrorHandler) AnnouncementBannerAPIOption {
	return func(c *AnnouncementBannerAPIController) {
		c.errorHandler = h
	}
}

// NewAnnouncementBannerAPIController creates a default api controller
func NewAnnouncementBannerAPIController(s AnnouncementBannerAPIServicer, opts ...AnnouncementBannerAPIOption) Router {
	controller := &AnnouncementBannerAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AnnouncementBannerAPIController
func (c *AnnouncementBannerAPIController) Routes() Routes {
	return Routes{
		"GetBanner": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/announcementBanner",
			c.GetBanner,
		},
		"SetBanner": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/announcementBanner",
			c.SetBanner,
		},
	}
}

// GetBanner - Get announcement banner configuration
func (c *AnnouncementBannerAPIController) GetBanner(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetBanner(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetBanner - Update announcement banner configuration
func (c *AnnouncementBannerAPIController) SetBanner(w http.ResponseWriter, r *http.Request) {
	announcementBannerConfigurationUpdateParam := AnnouncementBannerConfigurationUpdate{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&announcementBannerConfigurationUpdateParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAnnouncementBannerConfigurationUpdateRequired(announcementBannerConfigurationUpdateParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAnnouncementBannerConfigurationUpdateConstraints(announcementBannerConfigurationUpdateParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetBanner(r.Context(), announcementBannerConfigurationUpdateParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}