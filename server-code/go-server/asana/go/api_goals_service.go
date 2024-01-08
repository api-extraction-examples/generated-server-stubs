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
	"reflect"
)

// GoalsAPIService is a service that implements the logic for the GoalsAPIServicer
// This service should implement the business logic for every endpoint for the GoalsAPI API.
// Include any external packages or services that will be required by this service.
type GoalsAPIService struct {
}

// NewGoalsAPIService creates a default api service
func NewGoalsAPIService() GoalsAPIServicer {
	return &GoalsAPIService{}
}

// AddFollowers - Add a collaborator to a goal
func (s *GoalsAPIService) AddFollowers(ctx context.Context, goalGid string, addFollowersRequest AddFollowersRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update AddFollowers with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateGoal201Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateGoal201Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddFollowers method not implemented")
}

// CreateGoal - Create a goal
func (s *GoalsAPIService) CreateGoal(ctx context.Context, createGoalRequest CreateGoalRequest, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update CreateGoal with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, CreateGoal201Response{}) or use other options such as http.Ok ...
	// return Response(201, CreateGoal201Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateGoal method not implemented")
}

// CreateGoalMetric - Create a goal metric
func (s *GoalsAPIService) CreateGoalMetric(ctx context.Context, goalGid string, createGoalMetricRequest CreateGoalMetricRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update CreateGoalMetric with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateGoal201Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateGoal201Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateGoalMetric method not implemented")
}

// DeleteGoal - Delete a goal
func (s *GoalsAPIService) DeleteGoal(ctx context.Context, goalGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update DeleteGoal with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeleteAttachment200Response{}) or use other options such as http.Ok ...
	// return Response(200, DeleteAttachment200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteGoal method not implemented")
}

// GetGoal - Get a goal
func (s *GoalsAPIService) GetGoal(ctx context.Context, goalGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetGoal with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateGoal201Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateGoal201Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetGoal method not implemented")
}

// GetGoals - Get goals
func (s *GoalsAPIService) GetGoals(ctx context.Context, optPretty bool, optFields []string, limit int32, offset string, portfolio string, project string, isWorkspaceLevel bool, team string, workspace string, timePeriods []string) (ImplResponse, error) {
	// TODO - update GetGoals with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetGoals200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetGoals200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetGoals method not implemented")
}

// GetParentGoalsForGoal - Get parent goals from a goal
func (s *GoalsAPIService) GetParentGoalsForGoal(ctx context.Context, goalGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetParentGoalsForGoal with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetGoals200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetGoals200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetParentGoalsForGoal method not implemented")
}

// RemoveFollowers - Remove a collaborator from a goal
func (s *GoalsAPIService) RemoveFollowers(ctx context.Context, goalGid string, addFollowersRequest AddFollowersRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update RemoveFollowers with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateGoal201Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateGoal201Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveFollowers method not implemented")
}

// UpdateGoal - Update a goal
func (s *GoalsAPIService) UpdateGoal(ctx context.Context, goalGid string, createGoalRequest CreateGoalRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update UpdateGoal with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateGoal201Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateGoal201Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateGoal method not implemented")
}

// UpdateGoalMetric - Update a goal metric
func (s *GoalsAPIService) UpdateGoalMetric(ctx context.Context, goalGid string, updateGoalMetricRequest UpdateGoalMetricRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update UpdateGoalMetric with the required logic for this service method.
	// Add api_goals_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateGoal201Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateGoal201Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateGoalMetric method not implemented")
}