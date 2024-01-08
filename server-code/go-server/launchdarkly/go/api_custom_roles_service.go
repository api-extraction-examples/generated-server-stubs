/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// CustomRolesAPIService is a service that implements the logic for the CustomRolesAPIServicer
// This service should implement the business logic for every endpoint for the CustomRolesAPI API.
// Include any external packages or services that will be required by this service.
type CustomRolesAPIService struct {
}

// NewCustomRolesAPIService creates a default api service
func NewCustomRolesAPIService() CustomRolesAPIServicer {
	return &CustomRolesAPIService{}
}

// DeleteCustomRole - Delete a custom role by key.
func (s *CustomRolesAPIService) DeleteCustomRole(ctx context.Context, customRoleKey string) (ImplResponse, error) {
	// TODO - update DeleteCustomRole with the required logic for this service method.
	// Add api_custom_roles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteCustomRole method not implemented")
}

// GetCustomRole - Get one custom role by key.
func (s *CustomRolesAPIService) GetCustomRole(ctx context.Context, customRoleKey string) (ImplResponse, error) {
	// TODO - update GetCustomRole with the required logic for this service method.
	// Add api_custom_roles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CustomRole{}) or use other options such as http.Ok ...
	// return Response(200, CustomRole{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetCustomRole method not implemented")
}

// GetCustomRoles - Return a complete list of custom roles.
func (s *CustomRolesAPIService) GetCustomRoles(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetCustomRoles with the required logic for this service method.
	// Add api_custom_roles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CustomRoles{}) or use other options such as http.Ok ...
	// return Response(200, CustomRoles{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetCustomRoles method not implemented")
}

// PatchCustomRole - Modify a custom role by key.
func (s *CustomRolesAPIService) PatchCustomRole(ctx context.Context, customRoleKey string, patchDelta []PatchOperation) (ImplResponse, error) {
	// TODO - update PatchCustomRole with the required logic for this service method.
	// Add api_custom_roles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CustomRole{}) or use other options such as http.Ok ...
	// return Response(200, CustomRole{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PatchCustomRole method not implemented")
}

// PostCustomRole - Create a new custom role.
func (s *CustomRolesAPIService) PostCustomRole(ctx context.Context, customRoleBody PostCustomRoleRequest) (ImplResponse, error) {
	// TODO - update PostCustomRole with the required logic for this service method.
	// Add api_custom_roles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, CustomRole{}) or use other options such as http.Ok ...
	// return Response(201, CustomRole{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostCustomRole method not implemented")
}