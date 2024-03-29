/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// KycAPIService is a service that implements the logic for the KycAPIServicer
// This service should implement the business logic for every endpoint for the KycAPI API.
// Include any external packages or services that will be required by this service.
type KycAPIService struct {
}

// NewKycAPIService creates a default api service
func NewKycAPIService() KycAPIServicer {
	return &KycAPIService{}
}

// GetKYC - 
func (s *KycAPIService) GetKYC(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetKYC with the required logic for this service method.
	// Add api_kyc_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, KycResponse{}) or use other options such as http.Ok ...
	// return Response(200, KycResponse{}), nil

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetKYC method not implemented")
}
