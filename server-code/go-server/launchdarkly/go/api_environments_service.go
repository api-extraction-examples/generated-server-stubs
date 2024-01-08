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

// EnvironmentsAPIService is a service that implements the logic for the EnvironmentsAPIServicer
// This service should implement the business logic for every endpoint for the EnvironmentsAPI API.
// Include any external packages or services that will be required by this service.
type EnvironmentsAPIService struct {
}

// NewEnvironmentsAPIService creates a default api service
func NewEnvironmentsAPIService() EnvironmentsAPIServicer {
	return &EnvironmentsAPIService{}
}

// DeleteEnvironment - Delete an environment in a specific project.
func (s *EnvironmentsAPIService) DeleteEnvironment(ctx context.Context, projectKey string, environmentKey string) (ImplResponse, error) {
	// TODO - update DeleteEnvironment with the required logic for this service method.
	// Add api_environments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteEnvironment method not implemented")
}

// GetEnvironment - Get an environment given a project and key.
func (s *EnvironmentsAPIService) GetEnvironment(ctx context.Context, projectKey string, environmentKey string) (ImplResponse, error) {
	// TODO - update GetEnvironment with the required logic for this service method.
	// Add api_environments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Environment{}) or use other options such as http.Ok ...
	// return Response(200, Environment{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetEnvironment method not implemented")
}

// PatchEnvironment - Modify an environment by ID. If you try to patch the environment by setting both required and requiredApprovalTags, it will result in an error. Users can specify either required approvals for all flags in an environment or those with specific tags, but not both. Only customers on an Enterprise plan can require approval for flag updates with either mechanism.
func (s *EnvironmentsAPIService) PatchEnvironment(ctx context.Context, projectKey string, environmentKey string, patchDelta []PatchOperation) (ImplResponse, error) {
	// TODO - update PatchEnvironment with the required logic for this service method.
	// Add api_environments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Environment{}) or use other options such as http.Ok ...
	// return Response(200, Environment{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PatchEnvironment method not implemented")
}

// PostEnvironment - Create a new environment in a specified project with a given name, key, and swatch color.
func (s *EnvironmentsAPIService) PostEnvironment(ctx context.Context, projectKey string, environmentBody EnvironmentPost) (ImplResponse, error) {
	// TODO - update PostEnvironment with the required logic for this service method.
	// Add api_environments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, Environment{}) or use other options such as http.Ok ...
	// return Response(201, Environment{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostEnvironment method not implemented")
}

// ResetEnvironmentMobileKey - Reset an environment&#39;s mobile key. The optional expiry for the old key is deprecated for this endpoint, so the old key will always expire immediately.
func (s *EnvironmentsAPIService) ResetEnvironmentMobileKey(ctx context.Context, projectKey string, environmentKey string, expiry int64) (ImplResponse, error) {
	// TODO - update ResetEnvironmentMobileKey with the required logic for this service method.
	// Add api_environments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Environment{}) or use other options such as http.Ok ...
	// return Response(200, Environment{}), nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ResetEnvironmentMobileKey method not implemented")
}

// ResetEnvironmentSDKKey - Reset an environment&#39;s SDK key with an optional expiry time for the old key.
func (s *EnvironmentsAPIService) ResetEnvironmentSDKKey(ctx context.Context, projectKey string, environmentKey string, expiry int64) (ImplResponse, error) {
	// TODO - update ResetEnvironmentSDKKey with the required logic for this service method.
	// Add api_environments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Environment{}) or use other options such as http.Ok ...
	// return Response(200, Environment{}), nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ResetEnvironmentSDKKey method not implemented")
}