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

// GenresAPIService is a service that implements the logic for the GenresAPIServicer
// This service should implement the business logic for every endpoint for the GenresAPI API.
// Include any external packages or services that will be required by this service.
type GenresAPIService struct {
}

// NewGenresAPIService creates a default api service
func NewGenresAPIService() GenresAPIServicer {
	return &GenresAPIService{}
}

// GetGenre - Gets a genre, by name.
func (s *GenresAPIService) GetGenre(ctx context.Context, genreName string, userId *string) (ImplResponse, error) {
	// TODO - update GetGenre with the required logic for this service method.
	// Add api_genres_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDto{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDto{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetGenre method not implemented")
}

// GetGenres - Gets all genres from a given item, folder, or the entire library.
func (s *GenresAPIService) GetGenres(ctx context.Context, startIndex *int32, limit *int32, searchTerm *string, parentId *string, fields *[]ItemFields, excludeItemTypes *[]string, includeItemTypes *[]string, isFavorite *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType, userId *string, nameStartsWithOrGreater *string, nameStartsWith *string, nameLessThan *string, enableImages *bool, enableTotalRecordCount bool) (ImplResponse, error) {
	// TODO - update GetGenres with the required logic for this service method.
	// Add api_genres_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetGenres method not implemented")
}
