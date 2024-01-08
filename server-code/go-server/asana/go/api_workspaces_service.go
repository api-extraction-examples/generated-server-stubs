/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// WorkspacesAPIService is a service that implements the logic for the WorkspacesAPIServicer
// This service should implement the business logic for every endpoint for the WorkspacesAPI API.
// Include any external packages or services that will be required by this service.
type WorkspacesAPIService struct {
}

// NewWorkspacesAPIService creates a default api service
func NewWorkspacesAPIService() WorkspacesAPIServicer {
	return &WorkspacesAPIService{}
}

// AddUserForWorkspace - Add a user to a workspace or organization
func (s *WorkspacesAPIService) AddUserForWorkspace(ctx context.Context, workspaceGid string, addUserForWorkspaceRequest AddUserForWorkspaceRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update AddUserForWorkspace with the required logic for this service method.
	// Add api_workspaces_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AddUserForWorkspace200Response{}) or use other options such as http.Ok ...
	// return Response(200, AddUserForWorkspace200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddUserForWorkspace method not implemented")
}

// GetWorkspace - Get a workspace
func (s *WorkspacesAPIService) GetWorkspace(ctx context.Context, workspaceGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetWorkspace with the required logic for this service method.
	// Add api_workspaces_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetWorkspace200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetWorkspace200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetWorkspace method not implemented")
}

// GetWorkspaces - Get multiple workspaces
func (s *WorkspacesAPIService) GetWorkspaces(ctx context.Context, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update GetWorkspaces with the required logic for this service method.
	// Add api_workspaces_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetWorkspaces200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetWorkspaces200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetWorkspaces method not implemented")
}

// RemoveUserForWorkspace - Remove a user from a workspace or organization
func (s *WorkspacesAPIService) RemoveUserForWorkspace(ctx context.Context, workspaceGid string, removeUserForWorkspaceRequest RemoveUserForWorkspaceRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update RemoveUserForWorkspace with the required logic for this service method.
	// Add api_workspaces_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, DeleteAttachment200Response{}) or use other options such as http.Ok ...
	// return Response(204, DeleteAttachment200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveUserForWorkspace method not implemented")
}

// UpdateWorkspace - Update a workspace
func (s *WorkspacesAPIService) UpdateWorkspace(ctx context.Context, workspaceGid string, updateWorkspaceRequest UpdateWorkspaceRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update UpdateWorkspace with the required logic for this service method.
	// Add api_workspaces_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetWorkspace200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetWorkspace200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateWorkspace method not implemented")
}