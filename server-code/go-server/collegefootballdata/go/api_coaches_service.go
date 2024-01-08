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

// CoachesAPIService is a service that implements the logic for the CoachesAPIServicer
// This service should implement the business logic for every endpoint for the CoachesAPI API.
// Include any external packages or services that will be required by this service.
type CoachesAPIService struct {
}

// NewCoachesAPIService creates a default api service
func NewCoachesAPIService() CoachesAPIServicer {
	return &CoachesAPIService{}
}

// GetCoaches - Coaching records and history
func (s *CoachesAPIService) GetCoaches(ctx context.Context, firstName string, lastName string, team string, year int32, minYear int32, maxYear int32) (ImplResponse, error) {
	// TODO - update GetCoaches with the required logic for this service method.
	// Add api_coaches_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Coach{}) or use other options such as http.Ok ...
	// return Response(200, []Coach{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetCoaches method not implemented")
}