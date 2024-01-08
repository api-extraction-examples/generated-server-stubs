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

// PaymentPolicyAPIService is a service that implements the logic for the PaymentPolicyAPIServicer
// This service should implement the business logic for every endpoint for the PaymentPolicyAPI API.
// Include any external packages or services that will be required by this service.
type PaymentPolicyAPIService struct {
}

// NewPaymentPolicyAPIService creates a default api service
func NewPaymentPolicyAPIService() PaymentPolicyAPIServicer {
	return &PaymentPolicyAPIService{}
}

// CreatePaymentPolicy - 
func (s *PaymentPolicyAPIService) CreatePaymentPolicy(ctx context.Context, paymentPolicyRequest PaymentPolicyRequest) (ImplResponse, error) {
	// TODO - update CreatePaymentPolicy with the required logic for this service method.
	// Add api_payment_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, SetPaymentPolicyResponse{}) or use other options such as http.Ok ...
	// return Response(201, SetPaymentPolicyResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreatePaymentPolicy method not implemented")
}

// DeletePaymentPolicy - 
func (s *PaymentPolicyAPIService) DeletePaymentPolicy(ctx context.Context, paymentPolicyId string) (ImplResponse, error) {
	// TODO - update DeletePaymentPolicy with the required logic for this service method.
	// Add api_payment_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeletePaymentPolicy method not implemented")
}

// GetPaymentPolicies - 
func (s *PaymentPolicyAPIService) GetPaymentPolicies(ctx context.Context, marketplaceId string) (ImplResponse, error) {
	// TODO - update GetPaymentPolicies with the required logic for this service method.
	// Add api_payment_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PaymentPolicyResponse{}) or use other options such as http.Ok ...
	// return Response(200, PaymentPolicyResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetPaymentPolicies method not implemented")
}

// GetPaymentPolicy - 
func (s *PaymentPolicyAPIService) GetPaymentPolicy(ctx context.Context, paymentPolicyId string) (ImplResponse, error) {
	// TODO - update GetPaymentPolicy with the required logic for this service method.
	// Add api_payment_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PaymentPolicy{}) or use other options such as http.Ok ...
	// return Response(200, PaymentPolicy{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetPaymentPolicy method not implemented")
}

// GetPaymentPolicyByName - 
func (s *PaymentPolicyAPIService) GetPaymentPolicyByName(ctx context.Context, marketplaceId string, name string) (ImplResponse, error) {
	// TODO - update GetPaymentPolicyByName with the required logic for this service method.
	// Add api_payment_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PaymentPolicy{}) or use other options such as http.Ok ...
	// return Response(200, PaymentPolicy{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetPaymentPolicyByName method not implemented")
}

// UpdatePaymentPolicy - 
func (s *PaymentPolicyAPIService) UpdatePaymentPolicy(ctx context.Context, paymentPolicyId string, paymentPolicyRequest PaymentPolicyRequest) (ImplResponse, error) {
	// TODO - update UpdatePaymentPolicy with the required logic for this service method.
	// Add api_payment_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SetPaymentPolicyResponse{}) or use other options such as http.Ok ...
	// return Response(200, SetPaymentPolicyResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdatePaymentPolicy method not implemented")
}
