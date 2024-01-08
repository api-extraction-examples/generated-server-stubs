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

// ArtistsAPIService is a service that implements the logic for the ArtistsAPIServicer
// This service should implement the business logic for every endpoint for the ArtistsAPI API.
// Include any external packages or services that will be required by this service.
type ArtistsAPIService struct {
}

// NewArtistsAPIService creates a default api service
func NewArtistsAPIService() ArtistsAPIServicer {
	return &ArtistsAPIService{}
}

// GetAlbumArtists - Gets all album artists from a given item, folder, or the entire library.
func (s *ArtistsAPIService) GetAlbumArtists(ctx context.Context, minCommunityRating *float64, startIndex *int32, limit *int32, searchTerm *string, parentId *string, fields *[]ItemFields, excludeItemTypes *[]string, includeItemTypes *[]string, filters *[]ItemFilter, isFavorite *bool, mediaTypes *[]string, genres *[]string, genreIds *[]string, officialRatings *[]string, tags *[]string, years *[]int32, enableUserData *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType, person *string, personIds *[]string, personTypes *[]string, studios *[]string, studioIds *[]string, userId *string, nameStartsWithOrGreater *string, nameStartsWith *string, nameLessThan *string, enableImages *bool, enableTotalRecordCount bool) (ImplResponse, error) {
	// TODO - update GetAlbumArtists with the required logic for this service method.
	// Add api_artists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAlbumArtists method not implemented")
}

// GetArtistByName - Gets an artist by name.
func (s *ArtistsAPIService) GetArtistByName(ctx context.Context, name string, userId *string) (ImplResponse, error) {
	// TODO - update GetArtistByName with the required logic for this service method.
	// Add api_artists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDto{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDto{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetArtistByName method not implemented")
}

// GetArtists - Gets all artists from a given item, folder, or the entire library.
func (s *ArtistsAPIService) GetArtists(ctx context.Context, minCommunityRating *float64, startIndex *int32, limit *int32, searchTerm *string, parentId *string, fields *[]ItemFields, excludeItemTypes *[]string, includeItemTypes *[]string, filters *[]ItemFilter, isFavorite *bool, mediaTypes *[]string, genres *[]string, genreIds *[]string, officialRatings *[]string, tags *[]string, years *[]int32, enableUserData *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType, person *string, personIds *[]string, personTypes *[]string, studios *[]string, studioIds *[]string, userId *string, nameStartsWithOrGreater *string, nameStartsWith *string, nameLessThan *string, enableImages *bool, enableTotalRecordCount bool) (ImplResponse, error) {
	// TODO - update GetArtists with the required logic for this service method.
	// Add api_artists_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetArtists method not implemented")
}
