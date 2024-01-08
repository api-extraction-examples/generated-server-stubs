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

// CustomPolicyAPIService is a service that implements the logic for the CustomPolicyAPIServicer
// This service should implement the business logic for every endpoint for the CustomPolicyAPI API.
// Include any external packages or services that will be required by this service.
type CustomPolicyAPIService struct {
}

// NewCustomPolicyAPIService creates a default api service
func NewCustomPolicyAPIService() CustomPolicyAPIServicer {
	return &CustomPolicyAPIService{}
}

// CreateCustomPolicy - 
func (s *CustomPolicyAPIService) CreateCustomPolicy(ctx context.Context, xEBAYCMARKETPLACEID string, customPolicyCreateRequest CustomPolicyCreateRequest) (ImplResponse, error) {
	// TODO - update CreateCustomPolicy with the required logic for this service method.
	// Add api_custom_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, map[string]interface{}{}) or use other options such as http.Ok ...
	// return Response(201, map[string]interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateCustomPolicy method not implemented")
}

// GetCustomPolicies - 
func (s *CustomPolicyAPIService) GetCustomPolicies(ctx context.Context, xEBAYCMARKETPLACEID string, policyTypes string) (ImplResponse, error) {
	// TODO - update GetCustomPolicies with the required logic for this service method.
	// Add api_custom_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CustomPolicyResponse{}) or use other options such as http.Ok ...
	// return Response(200, CustomPolicyResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetCustomPolicies method not implemented")
}

// GetCustomPolicy - 
func (s *CustomPolicyAPIService) GetCustomPolicy(ctx context.Context, customPolicyId string, xEBAYCMARKETPLACEID string) (ImplResponse, error) {
	// TODO - update GetCustomPolicy with the required logic for this service method.
	// Add api_custom_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CustomPolicy{}) or use other options such as http.Ok ...
	// return Response(200, CustomPolicy{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetCustomPolicy method not implemented")
}

// UpdateCustomPolicy - 
func (s *CustomPolicyAPIService) UpdateCustomPolicy(ctx context.Context, customPolicyId string, xEBAYCMARKETPLACEID string, customPolicyRequest CustomPolicyRequest) (ImplResponse, error) {
	// TODO - update UpdateCustomPolicy with the required logic for this service method.
	// Add api_custom_policy_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateCustomPolicy method not implemented")
}