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

// DomesticPaymentsStatusAPIController binds http requests to an api service and writes the service results to the http response
type DomesticPaymentsStatusAPIController struct {
	service DomesticPaymentsStatusAPIServicer
	errorHandler ErrorHandler
}

// DomesticPaymentsStatusAPIOption for how the controller is set up.
type DomesticPaymentsStatusAPIOption func(*DomesticPaymentsStatusAPIController)

// WithDomesticPaymentsStatusAPIErrorHandler inject ErrorHandler into controller
func WithDomesticPaymentsStatusAPIErrorHandler(h ErrorHandler) DomesticPaymentsStatusAPIOption {
	return func(c *DomesticPaymentsStatusAPIController) {
		c.errorHandler = h
	}
}

// NewDomesticPaymentsStatusAPIController creates a default api controller
func NewDomesticPaymentsStatusAPIController(s DomesticPaymentsStatusAPIServicer, opts ...DomesticPaymentsStatusAPIOption) Router {
	controller := &DomesticPaymentsStatusAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DomesticPaymentsStatusAPIController
func (c *DomesticPaymentsStatusAPIController) Routes() Routes {
	return Routes{
		"PaymentsDomesticCreditTransfersPaymentStatusPost": Route{
			strings.ToUpper("Post"),
			"/openbanking/sandbox/connect/api/payments/domestic-credit-transfers/payment-status",
			c.PaymentsDomesticCreditTransfersPaymentStatusPost,
		},
	}
}

// PaymentsDomesticCreditTransfersPaymentStatusPost - Get payment status
func (c *DomesticPaymentsStatusAPIController) PaymentsDomesticCreditTransfersPaymentStatusPost(w http.ResponseWriter, r *http.Request) {
	bodyParam := PostPaymentsDomesticCreditTransfersPaymentStatusParamsBody{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPostPaymentsDomesticCreditTransfersPaymentStatusParamsBodyRequired(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPostPaymentsDomesticCreditTransfersPaymentStatusParamsBodyConstraints(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PaymentsDomesticCreditTransfersPaymentStatusPost(r.Context(), bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
