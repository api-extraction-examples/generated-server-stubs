/*
 * College Football Data API
 *
 * This is an API for accessing all sorts of college football data.  Please note that API keys should be supplied with \"Bearer \" prepended (e.g. \"Bearer your_key\"). API keys can be acquired from the CollegeFootballData.com website.
 *
 * API version: 4.4.12
 * Contact: admin@collegefootballdata.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// RatingsAPIService is a service that implements the logic for the RatingsAPIServicer
// This service should implement the business logic for every endpoint for the RatingsAPI API.
// Include any external packages or services that will be required by this service.
type RatingsAPIService struct {
}

// NewRatingsAPIService creates a default api service
func NewRatingsAPIService() RatingsAPIServicer {
	return &RatingsAPIService{}
}

// GetConferenceSPRatings - Historical SP+ ratings by conference
func (s *RatingsAPIService) GetConferenceSPRatings(ctx context.Context, year int32, conference string) (ImplResponse, error) {
	// TODO - update GetConferenceSPRatings with the required logic for this service method.
	// Add api_ratings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ConferenceSpRating{}) or use other options such as http.Ok ...
	// return Response(200, []ConferenceSpRating{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetConferenceSPRatings method not implemented")
}

// GetEloRatings - Historical Elo ratings
func (s *RatingsAPIService) GetEloRatings(ctx context.Context, year int32, week int32, team string, conference string) (ImplResponse, error) {
	// TODO - update GetEloRatings with the required logic for this service method.
	// Add api_ratings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []TeamEloRating{}) or use other options such as http.Ok ...
	// return Response(200, []TeamEloRating{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetEloRatings method not implemented")
}

// GetSPRatings - Historical SP+ ratings
func (s *RatingsAPIService) GetSPRatings(ctx context.Context, year int32, team string) (ImplResponse, error) {
	// TODO - update GetSPRatings with the required logic for this service method.
	// Add api_ratings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []TeamSpRating{}) or use other options such as http.Ok ...
	// return Response(200, []TeamSpRating{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSPRatings method not implemented")
}

// GetSRSRatings - Historical SRS ratings
func (s *RatingsAPIService) GetSRSRatings(ctx context.Context, year int32, team string, conference string) (ImplResponse, error) {
	// TODO - update GetSRSRatings with the required logic for this service method.
	// Add api_ratings_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []TeamSrsRating{}) or use other options such as http.Ok ...
	// return Response(200, []TeamSrsRating{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSRSRatings method not implemented")
}