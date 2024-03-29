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

// CollectionsAPIService is a service that implements the logic for the CollectionsAPIServicer
// This service should implement the business logic for every endpoint for the CollectionsAPI API.
// Include any external packages or services that will be required by this service.
type CollectionsAPIService struct {
}

// NewCollectionsAPIService creates a default api service
func NewCollectionsAPIService() CollectionsAPIServicer {
	return &CollectionsAPIService{}
}

// GetCollectionMembers - Collection Members
func (s *CollectionsAPIService) GetCollectionMembers(ctx context.Context, xAPIKey string, pid string, offset int32, limit int32) (ImplResponse, error) {
	// TODO - update GetCollectionMembers with the required logic for this service method.
	// Add api_collections_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ProgrammesResponse{}) or use other options such as http.Ok ...
	// return Response(200, ProgrammesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetCollectionMembers method not implemented")
}
