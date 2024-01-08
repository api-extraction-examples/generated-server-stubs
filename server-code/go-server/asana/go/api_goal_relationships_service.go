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

// GoalRelationshipsAPIService is a service that implements the logic for the GoalRelationshipsAPIServicer
// This service should implement the business logic for every endpoint for the GoalRelationshipsAPI API.
// Include any external packages or services that will be required by this service.
type GoalRelationshipsAPIService struct {
}

// NewGoalRelationshipsAPIService creates a default api service
func NewGoalRelationshipsAPIService() GoalRelationshipsAPIServicer {
	return &GoalRelationshipsAPIService{}
}

// AddSupportingRelationship - Add a supporting goal relationship
func (s *GoalRelationshipsAPIService) AddSupportingRelationship(ctx context.Context, goalGid string, addSupportingRelationshipRequest AddSupportingRelationshipRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update AddSupportingRelationship with the required logic for this service method.
	// Add api_goal_relationships_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetGoalRelationship200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetGoalRelationship200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("AddSupportingRelationship method not implemented")
}

// GetGoalRelationship - Get a goal relationship
func (s *GoalRelationshipsAPIService) GetGoalRelationship(ctx context.Context, goalRelationshipGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetGoalRelationship with the required logic for this service method.
	// Add api_goal_relationships_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetGoalRelationship200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetGoalRelationship200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetGoalRelationship method not implemented")
}

// GetGoalRelationships - Get goal relationships
func (s *GoalRelationshipsAPIService) GetGoalRelationships(ctx context.Context, supportedGoal string, optPretty bool, optFields []string, resourceSubtype string) (ImplResponse, error) {
	// TODO - update GetGoalRelationships with the required logic for this service method.
	// Add api_goal_relationships_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetGoalRelationships200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetGoalRelationships200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetGoalRelationships method not implemented")
}

// RemoveSupportingRelationship - Removes a supporting goal relationship
func (s *GoalRelationshipsAPIService) RemoveSupportingRelationship(ctx context.Context, goalGid string, removeSupportingRelationshipRequest RemoveSupportingRelationshipRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update RemoveSupportingRelationship with the required logic for this service method.
	// Add api_goal_relationships_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeleteAttachment200Response{}) or use other options such as http.Ok ...
	// return Response(200, DeleteAttachment200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveSupportingRelationship method not implemented")
}

// UpdateGoalRelationship - Update a goal relationship
func (s *GoalRelationshipsAPIService) UpdateGoalRelationship(ctx context.Context, goalRelationshipGid string, updateGoalRelationshipRequest UpdateGoalRelationshipRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update UpdateGoalRelationship with the required logic for this service method.
	// Add api_goal_relationships_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetGoalRelationship200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetGoalRelationship200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateGoalRelationship method not implemented")
}
