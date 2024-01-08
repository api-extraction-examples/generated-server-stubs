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

// LicenseMetricsAPIService is a service that implements the logic for the LicenseMetricsAPIServicer
// This service should implement the business logic for every endpoint for the LicenseMetricsAPI API.
// Include any external packages or services that will be required by this service.
type LicenseMetricsAPIService struct {
}

// NewLicenseMetricsAPIService creates a default api service
func NewLicenseMetricsAPIService() LicenseMetricsAPIServicer {
	return &LicenseMetricsAPIService{}
}

// GetApproximateApplicationLicenseCount - Get approximate application license count
func (s *LicenseMetricsAPIService) GetApproximateApplicationLicenseCount(ctx context.Context, applicationKey string) (ImplResponse, error) {
	// TODO - update GetApproximateApplicationLicenseCount with the required logic for this service method.
	// Add api_license_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, LicenseMetric{}) or use other options such as http.Ok ...
	// return Response(200, LicenseMetric{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetApproximateApplicationLicenseCount method not implemented")
}

// GetApproximateLicenseCount - Get approximate license count
func (s *LicenseMetricsAPIService) GetApproximateLicenseCount(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetApproximateLicenseCount with the required logic for this service method.
	// Add api_license_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, LicenseMetric{}) or use other options such as http.Ok ...
	// return Response(200, LicenseMetric{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetApproximateLicenseCount method not implemented")
}