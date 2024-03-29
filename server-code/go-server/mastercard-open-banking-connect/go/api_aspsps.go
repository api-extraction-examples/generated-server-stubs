/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * API version: 1.16.0
 * Contact: apisupport@mastercard.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// ASPSPsAPIController binds http requests to an api service and writes the service results to the http response
type ASPSPsAPIController struct {
	service ASPSPsAPIServicer
	errorHandler ErrorHandler
}

// ASPSPsAPIOption for how the controller is set up.
type ASPSPsAPIOption func(*ASPSPsAPIController)

// WithASPSPsAPIErrorHandler inject ErrorHandler into controller
func WithASPSPsAPIErrorHandler(h ErrorHandler) ASPSPsAPIOption {
	return func(c *ASPSPsAPIController) {
		c.errorHandler = h
	}
}

// NewASPSPsAPIController creates a default api controller
func NewASPSPsAPIController(s ASPSPsAPIServicer, opts ...ASPSPsAPIOption) Router {
	controller := &ASPSPsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ASPSPsAPIController
func (c *ASPSPsAPIController) Routes() Routes {
	return Routes{
		"PaymentsAspspsPost": Route{
			strings.ToUpper("Post"),
			"/openbanking/sandbox/connect/api/payments/aspsps",
			c.PaymentsAspspsPost,
		},
	}
}

// PaymentsAspspsPost - Get list of ASPSPs
func (c *ASPSPsAPIController) PaymentsAspspsPost(w http.ResponseWriter, r *http.Request) {
	bodyParam := PostAspspsParamsBody{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPostAspspsParamsBodyRequired(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPostAspspsParamsBodyConstraints(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PaymentsAspspsPost(r.Context(), bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
