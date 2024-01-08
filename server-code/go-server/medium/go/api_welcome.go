/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * API version: 1.0
 * Contact: nishu@mediumapi.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// WelcomeAPIController binds http requests to an api service and writes the service results to the http response
type WelcomeAPIController struct {
	service WelcomeAPIServicer
	errorHandler ErrorHandler
}

// WelcomeAPIOption for how the controller is set up.
type WelcomeAPIOption func(*WelcomeAPIController)

// WithWelcomeAPIErrorHandler inject ErrorHandler into controller
func WithWelcomeAPIErrorHandler(h ErrorHandler) WelcomeAPIOption {
	return func(c *WelcomeAPIController) {
		c.errorHandler = h
	}
}

// NewWelcomeAPIController creates a default api controller
func NewWelcomeAPIController(s WelcomeAPIServicer, opts ...WelcomeAPIOption) Router {
	controller := &WelcomeAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the WelcomeAPIController
func (c *WelcomeAPIController) Routes() Routes {
	return Routes{
		"RootGet": Route{
			strings.ToUpper("Get"),
			"/",
			c.RootGet,
		},
	}
}

// RootGet - Get Welcome
func (c *WelcomeAPIController) RootGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.RootGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
