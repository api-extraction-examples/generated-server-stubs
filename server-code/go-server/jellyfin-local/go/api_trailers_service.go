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
	"time"
)

// TrailersAPIService is a service that implements the logic for the TrailersAPIServicer
// This service should implement the business logic for every endpoint for the TrailersAPI API.
// Include any external packages or services that will be required by this service.
type TrailersAPIService struct {
}

// NewTrailersAPIService creates a default api service
func NewTrailersAPIService() TrailersAPIServicer {
	return &TrailersAPIService{}
}

// GetTrailers - Finds movies and trailers similar to a given trailer.
func (s *TrailersAPIService) GetTrailers(ctx context.Context, userId *string, maxOfficialRating *string, hasThemeSong *bool, hasThemeVideo *bool, hasSubtitles *bool, hasSpecialFeature *bool, hasTrailer *bool, adjacentTo *string, parentIndexNumber *int32, hasParentalRating *bool, isHd *bool, is4K *bool, locationTypes *[]LocationType, excludeLocationTypes *[]LocationType, isMissing *bool, isUnaired *bool, minCommunityRating *float64, minCriticRating *float64, minPremiereDate *time.Time, minDateLastSaved *time.Time, minDateLastSavedForUser *time.Time, maxPremiereDate *time.Time, hasOverview *bool, hasImdbId *bool, hasTmdbId *bool, hasTvdbId *bool, excludeItemIds *[]string, startIndex *int32, limit *int32, recursive *bool, searchTerm *string, sortOrder *string, parentId *string, fields *[]ItemFields, excludeItemTypes *[]string, filters *[]ItemFilter, isFavorite *bool, mediaTypes *[]string, imageTypes *[]ImageType, sortBy *string, isPlayed *bool, genres *[]string, officialRatings *[]string, tags *[]string, years *[]int32, enableUserData *bool, imageTypeLimit *int32, enableImageTypes *[]ImageType, person *string, personIds *[]string, personTypes *[]string, studios *[]string, artists *[]string, excludeArtistIds *[]string, artistIds *[]string, albumArtistIds *[]string, contributingArtistIds *[]string, albums *[]string, albumIds *[]string, ids *[]string, videoTypes *[]VideoType, minOfficialRating *string, isLocked *bool, isPlaceHolder *bool, hasOfficialRating *bool, collapseBoxSetItems *bool, minWidth *int32, minHeight *int32, maxWidth *int32, maxHeight *int32, is3D *bool, seriesStatus *[]SeriesStatus, nameStartsWithOrGreater *string, nameStartsWith *string, nameLessThan *string, studioIds *[]string, genreIds *[]string, enableTotalRecordCount bool, enableImages *bool) (ImplResponse, error) {
	// TODO - update GetTrailers with the required logic for this service method.
	// Add api_trailers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BaseItemDtoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, BaseItemDtoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetTrailers method not implemented")
}
