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

// TeamsAPIService is a service that implements the logic for the TeamsAPIServicer
// This service should implement the business logic for every endpoint for the TeamsAPI API.
// Include any external packages or services that will be required by this service.
type TeamsAPIService struct {
}

// NewTeamsAPIService creates a default api service
func NewTeamsAPIService() TeamsAPIServicer {
	return &TeamsAPIService{}
}

// AddUserForTeam - Add a user to a team
func (s *TeamsAPIService) AddUserForTeam(ctx context.Context, teamGid string, addUserForTeamRequest AddUserForTeamRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update AddUserForTeam with the required logic for this service method.
	// Add api_teams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetTeamMembership200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetTeamMembership200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("AddUserForTeam method not implemented")
}

// CreateTeam - Create a team
func (s *TeamsAPIService) CreateTeam(ctx context.Context, updateTeamRequest UpdateTeamRequest, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update CreateTeam with the required logic for this service method.
	// Add api_teams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, UpdateTeam200Response{}) or use other options such as http.Ok ...
	// return Response(201, UpdateTeam200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("CreateTeam method not implemented")
}

// GetTeam - Get a team
func (s *TeamsAPIService) GetTeam(ctx context.Context, teamGid string, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update GetTeam with the required logic for this service method.
	// Add api_teams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, UpdateTeam200Response{}) or use other options such as http.Ok ...
	// return Response(200, UpdateTeam200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetTeam method not implemented")
}

// GetTeamsForUser - Get teams for a user
func (s *TeamsAPIService) GetTeamsForUser(ctx context.Context, userGid string, organization string, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update GetTeamsForUser with the required logic for this service method.
	// Add api_teams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetTeamsForUser200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetTeamsForUser200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetTeamsForUser method not implemented")
}

// GetTeamsForWorkspace - Get teams in a workspace
func (s *TeamsAPIService) GetTeamsForWorkspace(ctx context.Context, workspaceGid string, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update GetTeamsForWorkspace with the required logic for this service method.
	// Add api_teams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetTeamsForUser200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetTeamsForUser200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetTeamsForWorkspace method not implemented")
}

// RemoveUserForTeam - Remove a user from a team
func (s *TeamsAPIService) RemoveUserForTeam(ctx context.Context, teamGid string, removeUserForTeamRequest RemoveUserForTeamRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update RemoveUserForTeam with the required logic for this service method.
	// Add api_teams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveUserForTeam method not implemented")
}

// UpdateTeam - Update a team
func (s *TeamsAPIService) UpdateTeam(ctx context.Context, updateTeamRequest UpdateTeamRequest, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update UpdateTeam with the required logic for this service method.
	// Add api_teams_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, UpdateTeam200Response{}) or use other options such as http.Ok ...
	// return Response(200, UpdateTeam200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateTeam method not implemented")
}