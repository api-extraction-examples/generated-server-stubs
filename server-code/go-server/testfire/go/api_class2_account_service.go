/*
 * AltoroJ REST API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.2
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// Class2AccountAPIService is a service that implements the logic for the Class2AccountAPIServicer
// This service should implement the business logic for every endpoint for the Class2AccountAPI API.
// Include any external packages or services that will be required by this service.
type Class2AccountAPIService struct {
}

// NewClass2AccountAPIService creates a default api service
func NewClass2AccountAPIService() Class2AccountAPIServicer {
	return &Class2AccountAPIService{}
}

// GetAccount - 
func (s *Class2AccountAPIService) GetAccount(ctx context.Context, authorization string) (ImplResponse, error) {
	// TODO - update GetAccount with the required logic for this service method.
	// Add api_class2_account_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAccount method not implemented")
}

// GetAccountBalance - 
func (s *Class2AccountAPIService) GetAccountBalance(ctx context.Context, authorization string, accountNo string) (ImplResponse, error) {
	// TODO - update GetAccountBalance with the required logic for this service method.
	// Add api_class2_account_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAccountBalance method not implemented")
}

// GetTransactions - 
func (s *Class2AccountAPIService) GetTransactions(ctx context.Context, authorization string, accountNo string, body Dates) (ImplResponse, error) {
	// TODO - update GetTransactions with the required logic for this service method.
	// Add api_class2_account_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(501, {}) or use other options such as http.Ok ...
	// return Response(501, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetTransactions method not implemented")
}

// ShowLastTenTransactions - 
func (s *Class2AccountAPIService) ShowLastTenTransactions(ctx context.Context, authorization string, accountNo string) (ImplResponse, error) {
	// TODO - update ShowLastTenTransactions with the required logic for this service method.
	// Add api_class2_account_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ShowLastTenTransactions method not implemented")
}
