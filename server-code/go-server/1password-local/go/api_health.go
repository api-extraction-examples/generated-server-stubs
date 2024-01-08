/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * API version: 1.5.7
 * Contact: support@1password.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// HealthAPIController binds http requests to an api service and writes the service results to the http response
type HealthAPIController struct {
	service HealthAPIServicer
	errorHandler ErrorHandler
}

// HealthAPIOption for how the controller is set up.
type HealthAPIOption func(*HealthAPIController)

// WithHealthAPIErrorHandler inject ErrorHandler into controller
func WithHealthAPIErrorHandler(h ErrorHandler) HealthAPIOption {
	return func(c *HealthAPIController) {
		c.errorHandler = h
	}
}

// NewHealthAPIController creates a default api controller
func NewHealthAPIController(s HealthAPIServicer, opts ...HealthAPIOption) Router {
	controller := &HealthAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the HealthAPIController
func (c *HealthAPIController) Routes() Routes {
	return Routes{
		"GetHeartbeat": Route{
			strings.ToUpper("Get"),
			"/heartbeat",
			c.GetHeartbeat,
		},
		"GetServerHealth": Route{
			strings.ToUpper("Get"),
			"/health",
			c.GetServerHealth,
		},
	}
}

// GetHeartbeat - Ping the server for liveness
func (c *HealthAPIController) GetHeartbeat(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetHeartbeat(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetServerHealth - Get state of the server and its dependencies.
func (c *HealthAPIController) GetServerHealth(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetServerHealth(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}