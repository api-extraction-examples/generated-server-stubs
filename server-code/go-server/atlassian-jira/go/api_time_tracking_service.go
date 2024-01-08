/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// TimeTrackingAPIService is a service that implements the logic for the TimeTrackingAPIServicer
// This service should implement the business logic for every endpoint for the TimeTrackingAPI API.
// Include any external packages or services that will be required by this service.
type TimeTrackingAPIService struct {
}

// NewTimeTrackingAPIService creates a default api service
func NewTimeTrackingAPIService() TimeTrackingAPIServicer {
	return &TimeTrackingAPIService{}
}

// GetAvailableTimeTrackingImplementations - Get all time tracking providers
func (s *TimeTrackingAPIService) GetAvailableTimeTrackingImplementations(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetAvailableTimeTrackingImplementations with the required logic for this service method.
	// Add api_time_tracking_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []TimeTrackingProvider{}) or use other options such as http.Ok ...
	// return Response(200, []TimeTrackingProvider{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAvailableTimeTrackingImplementations method not implemented")
}

// GetSelectedTimeTrackingImplementation - Get selected time tracking provider
func (s *TimeTrackingAPIService) GetSelectedTimeTrackingImplementation(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetSelectedTimeTrackingImplementation with the required logic for this service method.
	// Add api_time_tracking_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, TimeTrackingProvider{}) or use other options such as http.Ok ...
	// return Response(200, TimeTrackingProvider{}), nil

	// TODO: Uncomment the next line to return response Response(204, interface{}{}) or use other options such as http.Ok ...
	// return Response(204, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSelectedTimeTrackingImplementation method not implemented")
}

// GetSharedTimeTrackingConfiguration - Get time tracking settings
func (s *TimeTrackingAPIService) GetSharedTimeTrackingConfiguration(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetSharedTimeTrackingConfiguration with the required logic for this service method.
	// Add api_time_tracking_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, TimeTrackingConfiguration{}) or use other options such as http.Ok ...
	// return Response(200, TimeTrackingConfiguration{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSharedTimeTrackingConfiguration method not implemented")
}

// SelectTimeTrackingImplementation - Select time tracking provider
func (s *TimeTrackingAPIService) SelectTimeTrackingImplementation(ctx context.Context, timeTrackingProvider TimeTrackingProvider) (ImplResponse, error) {
	// TODO - update SelectTimeTrackingImplementation with the required logic for this service method.
	// Add api_time_tracking_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, interface{}{}) or use other options such as http.Ok ...
	// return Response(204, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("SelectTimeTrackingImplementation method not implemented")
}

// SetSharedTimeTrackingConfiguration - Set time tracking settings
func (s *TimeTrackingAPIService) SetSharedTimeTrackingConfiguration(ctx context.Context, timeTrackingConfiguration TimeTrackingConfiguration) (ImplResponse, error) {
	// TODO - update SetSharedTimeTrackingConfiguration with the required logic for this service method.
	// Add api_time_tracking_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, TimeTrackingConfiguration{}) or use other options such as http.Ok ...
	// return Response(200, TimeTrackingConfiguration{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetSharedTimeTrackingConfiguration method not implemented")
}
