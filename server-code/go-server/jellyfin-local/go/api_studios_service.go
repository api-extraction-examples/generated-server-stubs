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
	"reflect"
)

// StudiosAPIService is a service that implements the logic for the StudiosAPIServicer
// This service should implement the business logic for every endpoint for the StudiosAPI API.
// Include any external packages or services that will be required by this service.
type StudiosAPIService struct {
}

// NewStudiosAPIService creates a default api service
func NewStudiosAPIService() StudiosAPIServicer {
	return &StudiosAPIService{}
}

// GetStudio - Gets a studio by name.
func (s *StudiosAPIService) GetStudio(ctx context.Context, name string, userId *string) (ImplResponse, error) {
	// TODO - update GetStudio with the required logic for this service method.
	// Add api_studios_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDto{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDto{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetStudio method not implemented")
}

// GetStudios - Gets all studios from a given item, folder, or the entire library.
func (s *StudiosAPIService) GetStudios(ctx context.Context, startIndex *int32, limit *int32, searchTerm *string, parentId *string, fields *[]ItemFields, excludeItemTypes *[]string, includeItemTypes *[]string, isFavorite *bool, enableUserData *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType, userId *string, nameStartsWithOrGreater *string, nameStartsWith *string, nameLessThan *string, enableImages *bool, enableTotalRecordCount bool) (ImplResponse, error) {
	// TODO - update GetStudios with the required logic for this service method.
	// Add api_studios_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetStudios method not implemented")
}