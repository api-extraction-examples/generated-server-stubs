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

// TvShowsAPIService is a service that implements the logic for the TvShowsAPIServicer
// This service should implement the business logic for every endpoint for the TvShowsAPI API.
// Include any external packages or services that will be required by this service.
type TvShowsAPIService struct {
}

// NewTvShowsAPIService creates a default api service
func NewTvShowsAPIService() TvShowsAPIServicer {
	return &TvShowsAPIService{}
}

// GetEpisodes - Gets episodes for a tv season.
func (s *TvShowsAPIService) GetEpisodes(ctx context.Context, seriesId string, userId *string, fields *[]ItemFields, season *int32, seasonId *string, isMissing *bool, adjacentTo *string, startItemId *string, startIndex *int32, limit *int32, enableImages *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType, enableUserData *bool, sortBy *string) (ImplResponse, error) {
	// TODO - update GetEpisodes with the required logic for this service method.
	// Add api_tv_shows_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetEpisodes method not implemented")
}

// GetNextUp - Gets a list of next up episodes.
func (s *TvShowsAPIService) GetNextUp(ctx context.Context, userId *string, startIndex *int32, limit *int32, fields *[]ItemFields, seriesId *string, parentId *string, enableImges *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType, enableUserData *bool, enableTotalRecordCount bool) (ImplResponse, error) {
	// TODO - update GetNextUp with the required logic for this service method.
	// Add api_tv_shows_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetNextUp method not implemented")
}

// GetSeasons - Gets seasons for a tv series.
func (s *TvShowsAPIService) GetSeasons(ctx context.Context, seriesId string, userId *string, fields *[]ItemFields, isSpecialSeason *bool, isMissing *bool, adjacentTo *string, enableImages *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType, enableUserData *bool) (ImplResponse, error) {
	// TODO - update GetSeasons with the required logic for this service method.
	// Add api_tv_shows_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSeasons method not implemented")
}

// GetUpcomingEpisodes - Gets a list of upcoming episodes.
func (s *TvShowsAPIService) GetUpcomingEpisodes(ctx context.Context, userId *string, startIndex *int32, limit *int32, fields *[]ItemFields, parentId *string, enableImges *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType, enableUserData *bool) (ImplResponse, error) {
	// TODO - update GetUpcomingEpisodes with the required logic for this service method.
	// Add api_tv_shows_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUpcomingEpisodes method not implemented")
}