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

// FilterAPIService is a service that implements the logic for the FilterAPIServicer
// This service should implement the business logic for every endpoint for the FilterAPI API.
// Include any external packages or services that will be required by this service.
type FilterAPIService struct {
}

// NewFilterAPIService creates a default api service
func NewFilterAPIService() FilterAPIServicer {
	return &FilterAPIService{}
}

// GetQueryFilters - Gets query filters.
func (s *FilterAPIService) GetQueryFilters(ctx context.Context, userId *string, parentId *string, includeItemTypes *[]string, isAiring *bool, isMovie *bool, isSports *bool, isKids *bool, isNews *bool, isSeries *bool, recursive *bool) (ImplResponse, error) {
	// TODO - update GetQueryFilters with the required logic for this service method.
	// Add api_filter_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, QueryFilters{}) or use other options such as http.Ok ...
	// return Response(200, QueryFilters{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetQueryFilters method not implemented")
}

// GetQueryFiltersLegacy - Gets legacy query filters.
func (s *FilterAPIService) GetQueryFiltersLegacy(ctx context.Context, userId *string, parentId *string, includeItemTypes *[]string, mediaTypes *[]string) (ImplResponse, error) {
	// TODO - update GetQueryFiltersLegacy with the required logic for this service method.
	// Add api_filter_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, QueryFiltersLegacy{}) or use other options such as http.Ok ...
	// return Response(200, QueryFiltersLegacy{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetQueryFiltersLegacy method not implemented")
}