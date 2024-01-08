/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// PlayspaceAPIService is a service that implements the logic for the PlayspaceAPIServicer
// This service should implement the business logic for every endpoint for the PlayspaceAPI API.
// Include any external packages or services that will be required by this service.
type PlayspaceAPIService struct {
}

// NewPlayspaceAPIService creates a default api service
func NewPlayspaceAPIService() PlayspaceAPIServicer {
	return &PlayspaceAPIService{}
}

// GetContainer - Playspace Container by ID
func (s *PlayspaceAPIService) GetContainer(ctx context.Context, authorization string, xAPIKey string, id string) (ImplResponse, error) {
	// TODO - update GetContainer with the required logic for this service method.
	// Add api_playspace_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PlayspaceContainer{}) or use other options such as http.Ok ...
	// return Response(200, PlayspaceContainer{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetContainer method not implemented")
}

// SuggestContainer - Suggested Playspace Container
func (s *PlayspaceAPIService) SuggestContainer(ctx context.Context, authorization string, xAPIKey string, previousPid string, previousContainer string) (ImplResponse, error) {
	// TODO - update SuggestContainer with the required logic for this service method.
	// Add api_playspace_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PlayspaceContainer{}) or use other options such as http.Ok ...
	// return Response(200, PlayspaceContainer{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SuggestContainer method not implemented")
}