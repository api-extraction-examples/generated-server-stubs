/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// ExperienceAPIController binds http requests to an api service and writes the service results to the http response
type ExperienceAPIController struct {
	service ExperienceAPIServicer
	errorHandler ErrorHandler
}

// ExperienceAPIOption for how the controller is set up.
type ExperienceAPIOption func(*ExperienceAPIController)

// WithExperienceAPIErrorHandler inject ErrorHandler into controller
func WithExperienceAPIErrorHandler(h ErrorHandler) ExperienceAPIOption {
	return func(c *ExperienceAPIController) {
		c.errorHandler = h
	}
}

// NewExperienceAPIController creates a default api controller
func NewExperienceAPIController(s ExperienceAPIServicer, opts ...ExperienceAPIOption) Router {
	controller := &ExperienceAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ExperienceAPIController
func (c *ExperienceAPIController) Routes() Routes {
	return Routes{
		"GetExperienceHomepage": Route{
			strings.ToUpper("Get"),
			"/experience/homepage",
			c.GetExperienceHomepage,
		},
	}
}

// GetExperienceHomepage - Homepage Experience
func (c *ExperienceAPIController) GetExperienceHomepage(w http.ResponseWriter, r *http.Request) {
	xAPIKeyParam := r.Header.Get("X-API-Key")
	result, err := c.service.GetExperienceHomepage(r.Context(), xAPIKeyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}