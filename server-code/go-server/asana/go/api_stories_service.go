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

// StoriesAPIService is a service that implements the logic for the StoriesAPIServicer
// This service should implement the business logic for every endpoint for the StoriesAPI API.
// Include any external packages or services that will be required by this service.
type StoriesAPIService struct {
}

// NewStoriesAPIService creates a default api service
func NewStoriesAPIService() StoriesAPIServicer {
	return &StoriesAPIService{}
}

// CreateStoryForTask - Create a story on a task
func (s *StoriesAPIService) CreateStoryForTask(ctx context.Context, taskGid string, updateStoryRequest UpdateStoryRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update CreateStoryForTask with the required logic for this service method.
	// Add api_stories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, GetStory200Response{}) or use other options such as http.Ok ...
	// return Response(201, GetStory200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("CreateStoryForTask method not implemented")
}

// DeleteStory - Delete a story
func (s *StoriesAPIService) DeleteStory(ctx context.Context, storyGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update DeleteStory with the required logic for this service method.
	// Add api_stories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteStory method not implemented")
}

// GetStoriesForTask - Get stories from a task
func (s *StoriesAPIService) GetStoriesForTask(ctx context.Context, taskGid string, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update GetStoriesForTask with the required logic for this service method.
	// Add api_stories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetStoriesForTask200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetStoriesForTask200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetStoriesForTask method not implemented")
}

// GetStory - Get a story
func (s *StoriesAPIService) GetStory(ctx context.Context, storyGid string, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update GetStory with the required logic for this service method.
	// Add api_stories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetStory200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetStory200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetStory method not implemented")
}

// UpdateStory - Update a story
func (s *StoriesAPIService) UpdateStory(ctx context.Context, storyGid string, updateStoryRequest UpdateStoryRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update UpdateStory with the required logic for this service method.
	// Add api_stories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetStory200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetStory200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateStory method not implemented")
}
