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
	"context"
	"net/http"
	"errors"
)

// DomesticPaymentsAPIService is a service that implements the logic for the DomesticPaymentsAPIServicer
// This service should implement the business logic for every endpoint for the DomesticPaymentsAPI API.
// Include any external packages or services that will be required by this service.
type DomesticPaymentsAPIService struct {
}

// NewDomesticPaymentsAPIService creates a default api service
func NewDomesticPaymentsAPIService() DomesticPaymentsAPIServicer {
	return &DomesticPaymentsAPIService{}
}

// PaymentsDomesticCreditTransfersPost - Redeem the payment
func (s *DomesticPaymentsAPIService) PaymentsDomesticCreditTransfersPost(ctx context.Context, body PostPaymentsDomesticCreditTransfersParamsBody) (ImplResponse, error) {
	// TODO - update PaymentsDomesticCreditTransfersPost with the required logic for this service method.
	// Add api_domestic_payments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PostPaymentsDomesticCreditTransfersOkBody{}) or use other options such as http.Ok ...
	// return Response(200, PostPaymentsDomesticCreditTransfersOkBody{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(500, Error{}) or use other options such as http.Ok ...
	// return Response(500, Error{}), nil

	// TODO: Uncomment the next line to return response Response(504, Error{}) or use other options such as http.Ok ...
	// return Response(504, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PaymentsDomesticCreditTransfersPost method not implemented")
}