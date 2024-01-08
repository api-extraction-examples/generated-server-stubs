/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// ItemUpdateAPIService is a service that implements the logic for the ItemUpdateAPIServicer
// This service should implement the business logic for every endpoint for the ItemUpdateAPI API.
// Include any external packages or services that will be required by this service.
type ItemUpdateAPIService struct {
}

// NewItemUpdateAPIService creates a default api service
func NewItemUpdateAPIService() ItemUpdateAPIServicer {
	return &ItemUpdateAPIService{}
}

// GetMetadataEditorInfo - Gets metadata editor info for an item.
func (s *ItemUpdateAPIService) GetMetadataEditorInfo(ctx context.Context, itemId string) (ImplResponse, error) {
	// TODO - update GetMetadataEditorInfo with the required logic for this service method.
	// Add api_item_update_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MetadataEditorInfo{}) or use other options such as http.Ok ...
	// return Response(200, MetadataEditorInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMetadataEditorInfo method not implemented")
}

// UpdateItem - Updates an item.
func (s *ItemUpdateAPIService) UpdateItem(ctx context.Context, itemId string, baseItemDto BaseItemDto) (ImplResponse, error) {
	// TODO - update UpdateItem with the required logic for this service method.
	// Add api_item_update_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateItem method not implemented")
}

// UpdateItemContentType - Updates an item&#39;s content type.
func (s *ItemUpdateAPIService) UpdateItemContentType(ctx context.Context, itemId string, contentType *string) (ImplResponse, error) {
	// TODO - update UpdateItemContentType with the required logic for this service method.
	// Add api_item_update_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateItemContentType method not implemented")
}
