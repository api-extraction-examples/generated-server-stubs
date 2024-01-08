/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// SalesReportsAPIController binds http requests to an api service and writes the service results to the http response
type SalesReportsAPIController struct {
	service SalesReportsAPIServicer
	errorHandler ErrorHandler
}

// SalesReportsAPIOption for how the controller is set up.
type SalesReportsAPIOption func(*SalesReportsAPIController)

// WithSalesReportsAPIErrorHandler inject ErrorHandler into controller
func WithSalesReportsAPIErrorHandler(h ErrorHandler) SalesReportsAPIOption {
	return func(c *SalesReportsAPIController) {
		c.errorHandler = h
	}
}

// NewSalesReportsAPIController creates a default api controller
func NewSalesReportsAPIController(s SalesReportsAPIServicer, opts ...SalesReportsAPIOption) Router {
	controller := &SalesReportsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SalesReportsAPIController
func (c *SalesReportsAPIController) Routes() Routes {
	return Routes{
		"SalesReportsGetCollection": Route{
			strings.ToUpper("Get"),
			"/v1/salesReports",
			c.SalesReportsGetCollection,
		},
	}
}

// SalesReportsGetCollection - 
func (c *SalesReportsAPIController) SalesReportsGetCollection(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var filterFrequencyParam []string
	if query.Has("filter[frequency]") {
		filterFrequencyParam = strings.Split(query.Get("filter[frequency]"), ",")
	}
	var filterReportSubTypeParam []string
	if query.Has("filter[reportSubType]") {
		filterReportSubTypeParam = strings.Split(query.Get("filter[reportSubType]"), ",")
	}
	var filterReportTypeParam []string
	if query.Has("filter[reportType]") {
		filterReportTypeParam = strings.Split(query.Get("filter[reportType]"), ",")
	}
	var filterVendorNumberParam []string
	if query.Has("filter[vendorNumber]") {
		filterVendorNumberParam = strings.Split(query.Get("filter[vendorNumber]"), ",")
	}
	var filterReportDateParam []string
	if query.Has("filter[reportDate]") {
		filterReportDateParam = strings.Split(query.Get("filter[reportDate]"), ",")
	}
	var filterVersionParam []string
	if query.Has("filter[version]") {
		filterVersionParam = strings.Split(query.Get("filter[version]"), ",")
	}
	result, err := c.service.SalesReportsGetCollection(r.Context(), filterFrequencyParam, filterReportSubTypeParam, filterReportTypeParam, filterVendorNumberParam, filterReportDateParam, filterVersionParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
