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

// DraftAPIService is a service that implements the logic for the DraftAPIServicer
// This service should implement the business logic for every endpoint for the DraftAPI API.
// Include any external packages or services that will be required by this service.
type DraftAPIService struct {
}

// NewDraftAPIService creates a default api service
func NewDraftAPIService() DraftAPIServicer {
	return &DraftAPIService{}
}

// GetDraftPicks - List of NFL Draft picks
func (s *DraftAPIService) GetDraftPicks(ctx context.Context, year int32, nflTeam string, college string, conference string, position string) (ImplResponse, error) {
	// TODO - update GetDraftPicks with the required logic for this service method.
	// Add api_draft_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []DraftPick{}) or use other options such as http.Ok ...
	// return Response(200, []DraftPick{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDraftPicks method not implemented")
}

// GetNFLPositions - List of NFL positions
func (s *DraftAPIService) GetNFLPositions(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetNFLPositions with the required logic for this service method.
	// Add api_draft_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []DraftPosition{}) or use other options such as http.Ok ...
	// return Response(200, []DraftPosition{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetNFLPositions method not implemented")
}

// GetNFLTeams - List of NFL teams
func (s *DraftAPIService) GetNFLTeams(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetNFLTeams with the required logic for this service method.
	// Add api_draft_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []DraftTeam{}) or use other options such as http.Ok ...
	// return Response(200, []DraftTeam{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetNFLTeams method not implemented")
}
