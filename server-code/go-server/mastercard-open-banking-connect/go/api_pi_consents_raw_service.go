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

// PIConsentsRawAPIService is a service that implements the logic for the PIConsentsRawAPIServicer
// This service should implement the business logic for every endpoint for the PIConsentsRawAPI API.
// Include any external packages or services that will be required by this service.
type PIConsentsRawAPIService struct {
}

// NewPIConsentsRawAPIService creates a default api service
func NewPIConsentsRawAPIService() PIConsentsRawAPIServicer {
	return &PIConsentsRawAPIService{}
}

// PaymentsConsentsRawPost - Extracts the original raw consent given by the aspsp
func (s *PIConsentsRawAPIService) PaymentsConsentsRawPost(ctx context.Context, body PostPaymentsConsentsRawParamsBody) (ImplResponse, error) {
	// TODO - update PaymentsConsentsRawPost with the required logic for this service method.
	// Add api_pi_consents_raw_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PostPaymentsConsentsRawOkBody{}) or use other options such as http.Ok ...
	// return Response(200, PostPaymentsConsentsRawOkBody{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(500, Error{}) or use other options such as http.Ok ...
	// return Response(500, Error{}), nil

	// TODO: Uncomment the next line to return response Response(504, Error{}) or use other options such as http.Ok ...
	// return Response(504, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PaymentsConsentsRawPost method not implemented")
}
