/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// TimePeriodsAPIService is a service that implements the logic for the TimePeriodsAPIServicer
// This service should implement the business logic for every endpoint for the TimePeriodsAPI API.
// Include any external packages or services that will be required by this service.
type TimePeriodsAPIService struct {
}

// NewTimePeriodsAPIService creates a default api service
func NewTimePeriodsAPIService() TimePeriodsAPIServicer {
	return &TimePeriodsAPIService{}
}

// GetTimePeriod - Get a time period
func (s *TimePeriodsAPIService) GetTimePeriod(ctx context.Context, timePeriodGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetTimePeriod with the required logic for this service method.
	// Add api_time_periods_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetTimePeriod200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetTimePeriod200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetTimePeriod method not implemented")
}

// GetTimePeriods - Get time periods
func (s *TimePeriodsAPIService) GetTimePeriods(ctx context.Context, workspace string, optPretty bool, optFields []string, limit int32, offset string, startOn string, endOn string) (ImplResponse, error) {
	// TODO - update GetTimePeriods with the required logic for this service method.
	// Add api_time_periods_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetTimePeriods200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetTimePeriods200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetTimePeriods method not implemented")
}
