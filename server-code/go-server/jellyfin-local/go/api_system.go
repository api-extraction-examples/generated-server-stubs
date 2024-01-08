/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// SystemAPIController binds http requests to an api service and writes the service results to the http response
type SystemAPIController struct {
	service SystemAPIServicer
	errorHandler ErrorHandler
}

// SystemAPIOption for how the controller is set up.
type SystemAPIOption func(*SystemAPIController)

// WithSystemAPIErrorHandler inject ErrorHandler into controller
func WithSystemAPIErrorHandler(h ErrorHandler) SystemAPIOption {
	return func(c *SystemAPIController) {
		c.errorHandler = h
	}
}

// NewSystemAPIController creates a default api controller
func NewSystemAPIController(s SystemAPIServicer, opts ...SystemAPIOption) Router {
	controller := &SystemAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SystemAPIController
func (c *SystemAPIController) Routes() Routes {
	return Routes{
		"GetEndpointInfo": Route{
			strings.ToUpper("Get"),
			"/System/Endpoint",
			c.GetEndpointInfo,
		},
		"GetLogFile": Route{
			strings.ToUpper("Get"),
			"/System/Logs/Log",
			c.GetLogFile,
		},
		"GetPingSystem": Route{
			strings.ToUpper("Get"),
			"/System/Ping",
			c.GetPingSystem,
		},
		"GetPublicSystemInfo": Route{
			strings.ToUpper("Get"),
			"/System/Info/Public",
			c.GetPublicSystemInfo,
		},
		"GetServerLogs": Route{
			strings.ToUpper("Get"),
			"/System/Logs",
			c.GetServerLogs,
		},
		"GetSystemInfo": Route{
			strings.ToUpper("Get"),
			"/System/Info",
			c.GetSystemInfo,
		},
		"GetWakeOnLanInfo": Route{
			strings.ToUpper("Get"),
			"/System/WakeOnLanInfo",
			c.GetWakeOnLanInfo,
		},
		"PostPingSystem": Route{
			strings.ToUpper("Post"),
			"/System/Ping",
			c.PostPingSystem,
		},
		"RestartApplication": Route{
			strings.ToUpper("Post"),
			"/System/Restart",
			c.RestartApplication,
		},
		"ShutdownApplication": Route{
			strings.ToUpper("Post"),
			"/System/Shutdown",
			c.ShutdownApplication,
		},
	}
}

// GetEndpointInfo - Gets information about the request endpoint.
func (c *SystemAPIController) GetEndpointInfo(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetEndpointInfo(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetLogFile - Gets a log file.
func (c *SystemAPIController) GetLogFile(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var nameParam string
	if query.Has("name") {
		param := query.Get("name")

		nameParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "name"}, nil)
		return
	}
	result, err := c.service.GetLogFile(r.Context(), nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetPingSystem - Pings the system.
func (c *SystemAPIController) GetPingSystem(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetPingSystem(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetPublicSystemInfo - Gets public information about the server.
func (c *SystemAPIController) GetPublicSystemInfo(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetPublicSystemInfo(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetServerLogs - Gets a list of available server log files.
func (c *SystemAPIController) GetServerLogs(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetServerLogs(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetSystemInfo - Gets information about the server.
func (c *SystemAPIController) GetSystemInfo(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetSystemInfo(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetWakeOnLanInfo - Gets wake on lan information.
func (c *SystemAPIController) GetWakeOnLanInfo(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetWakeOnLanInfo(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PostPingSystem - Pings the system.
func (c *SystemAPIController) PostPingSystem(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.PostPingSystem(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RestartApplication - Restarts the application.
func (c *SystemAPIController) RestartApplication(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.RestartApplication(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ShutdownApplication - Shuts down the application.
func (c *SystemAPIController) ShutdownApplication(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ShutdownApplication(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
