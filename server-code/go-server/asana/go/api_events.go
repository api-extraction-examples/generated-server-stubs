/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// EventsAPIController binds http requests to an api service and writes the service results to the http response
type EventsAPIController struct {
	service EventsAPIServicer
	errorHandler ErrorHandler
}

// EventsAPIOption for how the controller is set up.
type EventsAPIOption func(*EventsAPIController)

// WithEventsAPIErrorHandler inject ErrorHandler into controller
func WithEventsAPIErrorHandler(h ErrorHandler) EventsAPIOption {
	return func(c *EventsAPIController) {
		c.errorHandler = h
	}
}

// NewEventsAPIController creates a default api controller
func NewEventsAPIController(s EventsAPIServicer, opts ...EventsAPIOption) Router {
	controller := &EventsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the EventsAPIController
func (c *EventsAPIController) Routes() Routes {
	return Routes{
		"GetEvents": Route{
			strings.ToUpper("Get"),
			"/api/1.0/events",
			c.GetEvents,
		},
	}
}

// GetEvents - Get events on a resource
func (c *EventsAPIController) GetEvents(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var resourceParam string
	if query.Has("resource") {
		param := query.Get("resource")

		resourceParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "resource"}, nil)
		return
	}
	var syncParam string
	if query.Has("sync") {
		param := query.Get("sync")

		syncParam = param
	} else {
	}
	var optPrettyParam bool
	if query.Has("opt_pretty") {
		param, err := parseBoolParameter(
			query.Get("opt_pretty"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		optPrettyParam = param
	} else {
	}
	var optFieldsParam []string
	if query.Has("opt_fields") {
		optFieldsParam = strings.Split(query.Get("opt_fields"), ",")
	}
	result, err := c.service.GetEvents(r.Context(), resourceParam, syncParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
