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

// Class5AdminAPIService is a service that implements the logic for the Class5AdminAPIServicer
// This service should implement the business logic for every endpoint for the Class5AdminAPI API.
// Include any external packages or services that will be required by this service.
type Class5AdminAPIService struct {
}

// NewClass5AdminAPIService creates a default api service
func NewClass5AdminAPIService() Class5AdminAPIServicer {
	return &Class5AdminAPIService{}
}

// AddUser - 
func (s *Class5AdminAPIService) AddUser(ctx context.Context, authorization string, body NewUser) (ImplResponse, error) {
	// TODO - update AddUser with the required logic for this service method.
	// Add api_class5_admin_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddUser method not implemented")
}

// ChangePassword - 
func (s *Class5AdminAPIService) ChangePassword(ctx context.Context, authorization string, body ChangePassword) (ImplResponse, error) {
	// TODO - update ChangePassword with the required logic for this service method.
	// Add api_class5_admin_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ChangePassword method not implemented")
}