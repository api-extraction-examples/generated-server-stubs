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

// UsersAPIService is a service that implements the logic for the UsersAPIServicer
// This service should implement the business logic for every endpoint for the UsersAPI API.
// Include any external packages or services that will be required by this service.
type UsersAPIService struct {
}

// NewUsersAPIService creates a default api service
func NewUsersAPIService() UsersAPIServicer {
	return &UsersAPIService{}
}

// GetFavoritesForUser - Get a user&#39;s favorites
func (s *UsersAPIService) GetFavoritesForUser(ctx context.Context, userGid string, resourceType string, workspace string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetFavoritesForUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetFavoritesForUser200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetFavoritesForUser200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetFavoritesForUser method not implemented")
}

// GetUser - Get a user
func (s *UsersAPIService) GetUser(ctx context.Context, userGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetUser with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetUser200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetUser200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetUser method not implemented")
}

// GetUsers - Get multiple users
func (s *UsersAPIService) GetUsers(ctx context.Context, workspace string, team string, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update GetUsers with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetUsersForTeam200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetUsersForTeam200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetUsers method not implemented")
}

// GetUsersForTeam - Get users in a team
func (s *UsersAPIService) GetUsersForTeam(ctx context.Context, teamGid string, optPretty bool, optFields []string, offset string) (ImplResponse, error) {
	// TODO - update GetUsersForTeam with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetUsersForTeam200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetUsersForTeam200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetUsersForTeam method not implemented")
}

// GetUsersForWorkspace - Get users in a workspace or organization
func (s *UsersAPIService) GetUsersForWorkspace(ctx context.Context, workspaceGid string, optPretty bool, optFields []string, offset string) (ImplResponse, error) {
	// TODO - update GetUsersForWorkspace with the required logic for this service method.
	// Add api_users_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetUsersForTeam200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetUsersForTeam200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetUsersForWorkspace method not implemented")
}