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

// PlayspaceAPIController binds http requests to an api service and writes the service results to the http response
type PlayspaceAPIController struct {
	service PlayspaceAPIServicer
	errorHandler ErrorHandler
}

// PlayspaceAPIOption for how the controller is set up.
type PlayspaceAPIOption func(*PlayspaceAPIController)

// WithPlayspaceAPIErrorHandler inject ErrorHandler into controller
func WithPlayspaceAPIErrorHandler(h ErrorHandler) PlayspaceAPIOption {
	return func(c *PlayspaceAPIController) {
		c.errorHandler = h
	}
}

// NewPlayspaceAPIController creates a default api controller
func NewPlayspaceAPIController(s PlayspaceAPIServicer, opts ...PlayspaceAPIOption) Router {
	controller := &PlayspaceAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the PlayspaceAPIController
func (c *PlayspaceAPIController) Routes() Routes {
	return Routes{
		"GetContainer": Route{
			strings.ToUpper("Get"),
			"/my/playspace/containers/{id}",
			c.GetContainer,
		},
		"SuggestContainer": Route{
			strings.ToUpper("Get"),
			"/my/playspace/containers/suggested",
			c.SuggestContainer,
		},
	}
}

// GetContainer - Playspace Container by ID
func (c *PlayspaceAPIController) GetContainer(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	authorizationParam := r.Header.Get("Authorization")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.GetContainer(r.Context(), authorizationParam, xAPIKeyParam, idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SuggestContainer - Suggested Playspace Container
func (c *PlayspaceAPIController) SuggestContainer(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	authorizationParam := r.Header.Get("Authorization")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	var previousPidParam string
	if query.Has("previous_pid") {
		param := query.Get("previous_pid")

		previousPidParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "previous_pid"}, nil)
		return
	}
	var previousContainerParam string
	if query.Has("previous_container") {
		param := query.Get("previous_container")

		previousContainerParam = param
	} else {
	}
	result, err := c.service.SuggestContainer(r.Context(), authorizationParam, xAPIKeyParam, previousPidParam, previousContainerParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}