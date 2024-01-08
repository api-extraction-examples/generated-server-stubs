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

// RecruitingAPIService is a service that implements the logic for the RecruitingAPIServicer
// This service should implement the business logic for every endpoint for the RecruitingAPI API.
// Include any external packages or services that will be required by this service.
type RecruitingAPIService struct {
}

// NewRecruitingAPIService creates a default api service
func NewRecruitingAPIService() RecruitingAPIServicer {
	return &RecruitingAPIService{}
}

// GetRecruitingGroups - Recruit position group ratings
func (s *RecruitingAPIService) GetRecruitingGroups(ctx context.Context, startYear int32, endYear int32, team string, conference string) (ImplResponse, error) {
	// TODO - update GetRecruitingGroups with the required logic for this service method.
	// Add api_recruiting_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []PositionGroupRecruitingRating{}) or use other options such as http.Ok ...
	// return Response(200, []PositionGroupRecruitingRating{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetRecruitingGroups method not implemented")
}

// GetRecruitingPlayers - Player recruiting ratings and rankings
func (s *RecruitingAPIService) GetRecruitingPlayers(ctx context.Context, year int32, classification string, position string, state string, team string) (ImplResponse, error) {
	// TODO - update GetRecruitingPlayers with the required logic for this service method.
	// Add api_recruiting_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Recruit{}) or use other options such as http.Ok ...
	// return Response(200, []Recruit{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetRecruitingPlayers method not implemented")
}

// GetRecruitingTeams - Team recruiting rankings and ratings
func (s *RecruitingAPIService) GetRecruitingTeams(ctx context.Context, year int32, team string) (ImplResponse, error) {
	// TODO - update GetRecruitingTeams with the required logic for this service method.
	// Add api_recruiting_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []TeamRecruitingRank{}) or use other options such as http.Ok ...
	// return Response(200, []TeamRecruitingRank{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetRecruitingTeams method not implemented")
}
