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

// BatchAPIAPIController binds http requests to an api service and writes the service results to the http response
type BatchAPIAPIController struct {
	service BatchAPIAPIServicer
	errorHandler ErrorHandler
}

// BatchAPIAPIOption for how the controller is set up.
type BatchAPIAPIOption func(*BatchAPIAPIController)

// WithBatchAPIAPIErrorHandler inject ErrorHandler into controller
func WithBatchAPIAPIErrorHandler(h ErrorHandler) BatchAPIAPIOption {
	return func(c *BatchAPIAPIController) {
		c.errorHandler = h
	}
}

// NewBatchAPIAPIController creates a default api controller
func NewBatchAPIAPIController(s BatchAPIAPIServicer, opts ...BatchAPIAPIOption) Router {
	controller := &BatchAPIAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the BatchAPIAPIController
func (c *BatchAPIAPIController) Routes() Routes {
	return Routes{
		"CreateBatchRequest": Route{
			strings.ToUpper("Post"),
			"/api/1.0/batch",
			c.CreateBatchRequest,
		},
	}
}

// CreateBatchRequest - Submit parallel requests
func (c *BatchAPIAPIController) CreateBatchRequest(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	createBatchRequestRequestParam := CreateBatchRequestRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createBatchRequestRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateBatchRequestRequestRequired(createBatchRequestRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateBatchRequestRequestConstraints(createBatchRequestRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
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
	result, err := c.service.CreateBatchRequest(r.Context(), createBatchRequestRequestParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
