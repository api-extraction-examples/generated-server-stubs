/*
 * Discovery Market Research
 *
 * <p>This API drives the <a href=\"https://discovery.gsa.gov\">Discovery Market Research Tool</a>. It contains information on the vendors that are part of the OASIS and OASIS Small Business contracting vehicles, such as their contracting history, their elligibility for contract awards, and their small business designations. To learn more about the tool, please visit <a href=\"https://discovery.gsa.gov\">Discovery</a> or see the README on our <a href=\"https://github.com/PSHCDevOps/discovery\">GitHub repository</a>.</p> <p><strong>Please note that the base path for this API is <code>https://api.data.gov/gsa/discovery/</code></strong></p> <p>It requires an API key, obtainable at <a href=\"http://api.data.gov/\">api.data.gov</a>. It must be passed in the <code>api_key</code> parameter with each request.</p>
 *
 * API version: 0.1
 * Contact: discovery-18f@gsa.gov
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// VendorAPIController binds http requests to an api service and writes the service results to the http response
type VendorAPIController struct {
	service VendorAPIServicer
	errorHandler ErrorHandler
}

// VendorAPIOption for how the controller is set up.
type VendorAPIOption func(*VendorAPIController)

// WithVendorAPIErrorHandler inject ErrorHandler into controller
func WithVendorAPIErrorHandler(h ErrorHandler) VendorAPIOption {
	return func(c *VendorAPIController) {
		c.errorHandler = h
	}
}

// NewVendorAPIController creates a default api controller
func NewVendorAPIController(s VendorAPIServicer, opts ...VendorAPIOption) Router {
	controller := &VendorAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the VendorAPIController
func (c *VendorAPIController) Routes() Routes {
	return Routes{
		"GetVendorGET": Route{
			strings.ToUpper("Get"),
			"/api/vendor/{duns}",
			c.GetVendorGET,
		},
	}
}

// GetVendorGET - This endpoint returns a single vendor by their 9 digit DUNS number
func (c *VendorAPIController) GetVendorGET(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	dunsParam := params["duns"]
	if dunsParam == "" {
		c.errorHandler(w, r, &RequiredError{"duns"}, nil)
		return
	}
	result, err := c.service.GetVendorGET(r.Context(), dunsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
