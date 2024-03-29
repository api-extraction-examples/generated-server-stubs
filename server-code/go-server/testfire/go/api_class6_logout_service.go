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

// Class6LogoutAPIService is a service that implements the logic for the Class6LogoutAPIServicer
// This service should implement the business logic for every endpoint for the Class6LogoutAPI API.
// Include any external packages or services that will be required by this service.
type Class6LogoutAPIService struct {
}

// NewClass6LogoutAPIService creates a default api service
func NewClass6LogoutAPIService() Class6LogoutAPIServicer {
	return &Class6LogoutAPIService{}
}

// DoLogOut - 
func (s *Class6LogoutAPIService) DoLogOut(ctx context.Context) (ImplResponse, error) {
	// TODO - update DoLogOut with the required logic for this service method.
	// Add api_class6_logout_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DoLogOut method not implemented")
}
