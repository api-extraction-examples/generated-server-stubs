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

// FilterSharingAPIService is a service that implements the logic for the FilterSharingAPIServicer
// This service should implement the business logic for every endpoint for the FilterSharingAPI API.
// Include any external packages or services that will be required by this service.
type FilterSharingAPIService struct {
}

// NewFilterSharingAPIService creates a default api service
func NewFilterSharingAPIService() FilterSharingAPIServicer {
	return &FilterSharingAPIService{}
}

// AddSharePermission - Add share permission
func (s *FilterSharingAPIService) AddSharePermission(ctx context.Context, id int64, sharePermissionInputBean SharePermissionInputBean) (ImplResponse, error) {
	// TODO - update AddSharePermission with the required logic for this service method.
	// Add api_filter_sharing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, []SharePermission{}) or use other options such as http.Ok ...
	// return Response(201, []SharePermission{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddSharePermission method not implemented")
}

// DeleteSharePermission - Delete share permission
func (s *FilterSharingAPIService) DeleteSharePermission(ctx context.Context, id int64, permissionId int64) (ImplResponse, error) {
	// TODO - update DeleteSharePermission with the required logic for this service method.
	// Add api_filter_sharing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteSharePermission method not implemented")
}

// GetDefaultShareScope - Get default share scope
func (s *FilterSharingAPIService) GetDefaultShareScope(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetDefaultShareScope with the required logic for this service method.
	// Add api_filter_sharing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DefaultShareScope{}) or use other options such as http.Ok ...
	// return Response(200, DefaultShareScope{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDefaultShareScope method not implemented")
}

// GetSharePermission - Get share permission
func (s *FilterSharingAPIService) GetSharePermission(ctx context.Context, id int64, permissionId int64) (ImplResponse, error) {
	// TODO - update GetSharePermission with the required logic for this service method.
	// Add api_filter_sharing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SharePermission{}) or use other options such as http.Ok ...
	// return Response(200, SharePermission{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSharePermission method not implemented")
}

// GetSharePermissions - Get share permissions
func (s *FilterSharingAPIService) GetSharePermissions(ctx context.Context, id int64) (ImplResponse, error) {
	// TODO - update GetSharePermissions with the required logic for this service method.
	// Add api_filter_sharing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []SharePermission{}) or use other options such as http.Ok ...
	// return Response(200, []SharePermission{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSharePermissions method not implemented")
}

// SetDefaultShareScope - Set default share scope
func (s *FilterSharingAPIService) SetDefaultShareScope(ctx context.Context, defaultShareScope DefaultShareScope) (ImplResponse, error) {
	// TODO - update SetDefaultShareScope with the required logic for this service method.
	// Add api_filter_sharing_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DefaultShareScope{}) or use other options such as http.Ok ...
	// return Response(200, DefaultShareScope{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetDefaultShareScope method not implemented")
}
