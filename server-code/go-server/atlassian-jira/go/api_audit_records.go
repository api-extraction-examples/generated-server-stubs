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
	"time"

	"github.com/gorilla/mux"
)

// AuditRecordsAPIController binds http requests to an api service and writes the service results to the http response
type AuditRecordsAPIController struct {
	service AuditRecordsAPIServicer
	errorHandler ErrorHandler
}

// AuditRecordsAPIOption for how the controller is set up.
type AuditRecordsAPIOption func(*AuditRecordsAPIController)

// WithAuditRecordsAPIErrorHandler inject ErrorHandler into controller
func WithAuditRecordsAPIErrorHandler(h ErrorHandler) AuditRecordsAPIOption {
	return func(c *AuditRecordsAPIController) {
		c.errorHandler = h
	}
}

// NewAuditRecordsAPIController creates a default api controller
func NewAuditRecordsAPIController(s AuditRecordsAPIServicer, opts ...AuditRecordsAPIOption) Router {
	controller := &AuditRecordsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AuditRecordsAPIController
func (c *AuditRecordsAPIController) Routes() Routes {
	return Routes{
		"GetAuditRecords": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/auditing/record",
			c.GetAuditRecords,
		},
	}
}

// GetAuditRecords - Get audit records
func (c *AuditRecordsAPIController) GetAuditRecords(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
		var param int32 = 0
		offsetParam = param
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
		var param int32 = 1000
		limitParam = param
	}
	var filterParam string
	if query.Has("filter") {
		param := query.Get("filter")

		filterParam = param
	} else {
	}
	var fromParam time.Time
	if query.Has("from"){
		param, err := parseTime(query.Get("from"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		fromParam = param
	} else {
	}
	var toParam time.Time
	if query.Has("to"){
		param, err := parseTime(query.Get("to"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		toParam = param
	} else {
	}
	result, err := c.service.GetAuditRecords(r.Context(), offsetParam, limitParam, filterParam, fromParam, toParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
