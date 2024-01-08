/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// PermissionSchemesAPIService is a service that implements the logic for the PermissionSchemesAPIServicer
// This service should implement the business logic for every endpoint for the PermissionSchemesAPI API.
// Include any external packages or services that will be required by this service.
type PermissionSchemesAPIService struct {
}

// NewPermissionSchemesAPIService creates a default api service
func NewPermissionSchemesAPIService() PermissionSchemesAPIServicer {
	return &PermissionSchemesAPIService{}
}

// CreatePermissionGrant - Create permission grant
func (s *PermissionSchemesAPIService) CreatePermissionGrant(ctx context.Context, schemeId int64, permissionGrant PermissionGrant, expand string) (ImplResponse, error) {
	// TODO - update CreatePermissionGrant with the required logic for this service method.
	// Add api_permission_schemes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, PermissionGrant{}) or use other options such as http.Ok ...
	// return Response(201, PermissionGrant{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreatePermissionGrant method not implemented")
}

// CreatePermissionScheme - Create permission scheme
func (s *PermissionSchemesAPIService) CreatePermissionScheme(ctx context.Context, permissionScheme PermissionScheme, expand string) (ImplResponse, error) {
	// TODO - update CreatePermissionScheme with the required logic for this service method.
	// Add api_permission_schemes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, PermissionScheme{}) or use other options such as http.Ok ...
	// return Response(201, PermissionScheme{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreatePermissionScheme method not implemented")
}

// DeletePermissionScheme - Delete permission scheme
func (s *PermissionSchemesAPIService) DeletePermissionScheme(ctx context.Context, schemeId int64) (ImplResponse, error) {
	// TODO - update DeletePermissionScheme with the required logic for this service method.
	// Add api_permission_schemes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeletePermissionScheme method not implemented")
}

// DeletePermissionSchemeEntity - Delete permission scheme grant
func (s *PermissionSchemesAPIService) DeletePermissionSchemeEntity(ctx context.Context, schemeId int64, permissionId int64) (ImplResponse, error) {
	// TODO - update DeletePermissionSchemeEntity with the required logic for this service method.
	// Add api_permission_schemes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeletePermissionSchemeEntity method not implemented")
}

// GetAllPermissionSchemes - Get all permission schemes
func (s *PermissionSchemesAPIService) GetAllPermissionSchemes(ctx context.Context, expand string) (ImplResponse, error) {
	// TODO - update GetAllPermissionSchemes with the required logic for this service method.
	// Add api_permission_schemes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PermissionSchemes{}) or use other options such as http.Ok ...
	// return Response(200, PermissionSchemes{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAllPermissionSchemes method not implemented")
}

// GetPermissionScheme - Get permission scheme
func (s *PermissionSchemesAPIService) GetPermissionScheme(ctx context.Context, schemeId int64, expand string) (ImplResponse, error) {
	// TODO - update GetPermissionScheme with the required logic for this service method.
	// Add api_permission_schemes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PermissionScheme{}) or use other options such as http.Ok ...
	// return Response(200, PermissionScheme{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetPermissionScheme method not implemented")
}

// GetPermissionSchemeGrant - Get permission scheme grant
func (s *PermissionSchemesAPIService) GetPermissionSchemeGrant(ctx context.Context, schemeId int64, permissionId int64, expand string) (ImplResponse, error) {
	// TODO - update GetPermissionSchemeGrant with the required logic for this service method.
	// Add api_permission_schemes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PermissionGrant{}) or use other options such as http.Ok ...
	// return Response(200, PermissionGrant{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetPermissionSchemeGrant method not implemented")
}

// GetPermissionSchemeGrants - Get permission scheme grants
func (s *PermissionSchemesAPIService) GetPermissionSchemeGrants(ctx context.Context, schemeId int64, expand string) (ImplResponse, error) {
	// TODO - update GetPermissionSchemeGrants with the required logic for this service method.
	// Add api_permission_schemes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PermissionGrants{}) or use other options such as http.Ok ...
	// return Response(200, PermissionGrants{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetPermissionSchemeGrants method not implemented")
}

// UpdatePermissionScheme - Update permission scheme
func (s *PermissionSchemesAPIService) UpdatePermissionScheme(ctx context.Context, schemeId int64, permissionScheme PermissionScheme, expand string) (ImplResponse, error) {
	// TODO - update UpdatePermissionScheme with the required logic for this service method.
	// Add api_permission_schemes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PermissionScheme{}) or use other options such as http.Ok ...
	// return Response(200, PermissionScheme{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdatePermissionScheme method not implemented")
}
