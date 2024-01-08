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

// SEPAPaymentsAPIController binds http requests to an api service and writes the service results to the http response
type SEPAPaymentsAPIController struct {
	service SEPAPaymentsAPIServicer
	errorHandler ErrorHandler
}

// SEPAPaymentsAPIOption for how the controller is set up.
type SEPAPaymentsAPIOption func(*SEPAPaymentsAPIController)

// WithSEPAPaymentsAPIErrorHandler inject ErrorHandler into controller
func WithSEPAPaymentsAPIErrorHandler(h ErrorHandler) SEPAPaymentsAPIOption {
	return func(c *SEPAPaymentsAPIController) {
		c.errorHandler = h
	}
}

// NewSEPAPaymentsAPIController creates a default api controller
func NewSEPAPaymentsAPIController(s SEPAPaymentsAPIServicer, opts ...SEPAPaymentsAPIOption) Router {
	controller := &SEPAPaymentsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the SEPAPaymentsAPIController
func (c *SEPAPaymentsAPIController) Routes() Routes {
	return Routes{
		"PaymentsSepaCreditTransfersPost": Route{
			strings.ToUpper("Post"),
			"/openbanking/sandbox/connect/api/payments/sepa-credit-transfers",
			c.PaymentsSepaCreditTransfersPost,
		},
	}
}

// PaymentsSepaCreditTransfersPost - Redeem the payment
func (c *SEPAPaymentsAPIController) PaymentsSepaCreditTransfersPost(w http.ResponseWriter, r *http.Request) {
	bodyParam := PostPaymentsSepaCreditTransfersParamsBody{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPostPaymentsSepaCreditTransfersParamsBodyRequired(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPostPaymentsSepaCreditTransfersParamsBodyConstraints(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PaymentsSepaCreditTransfersPost(r.Context(), bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
