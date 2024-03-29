/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// CustomerMetricsAPIService is a service that implements the logic for the CustomerMetricsAPIServicer
// This service should implement the business logic for every endpoint for the CustomerMetricsAPI API.
// Include any external packages or services that will be required by this service.
type CustomerMetricsAPIService struct {
}

// NewCustomerMetricsAPIService creates a default api service
func NewCustomerMetricsAPIService() CustomerMetricsAPIServicer {
	return &CustomerMetricsAPIService{}
}

// GetEvaluations - Get events usage by event id and the feature flag key.
func (s *CustomerMetricsAPIService) GetEvaluations(ctx context.Context, envId string, flagKey string) (ImplResponse, error) {
	// TODO - update GetEvaluations with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, StreamSdkVersion{}) or use other options such as http.Ok ...
	// return Response(200, StreamSdkVersion{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	// TODO: Uncomment the next line to return response Response(404, EvaluationUsageError{}) or use other options such as http.Ok ...
	// return Response(404, EvaluationUsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetEvaluations method not implemented")
}

// GetEvent - Get events usage by event type.
func (s *CustomerMetricsAPIService) GetEvent(ctx context.Context, type_ string) (ImplResponse, error) {
	// TODO - update GetEvent with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, StreamSdkVersion{}) or use other options such as http.Ok ...
	// return Response(200, StreamSdkVersion{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	// TODO: Uncomment the next line to return response Response(404, StreamUsageError{}) or use other options such as http.Ok ...
	// return Response(404, StreamUsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetEvent method not implemented")
}

// GetEvents - Get events usage endpoints.
func (s *CustomerMetricsAPIService) GetEvents(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetEvents with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Events{}) or use other options such as http.Ok ...
	// return Response(200, Events{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetEvents method not implemented")
}

// GetMAU - Get monthly active user data.
func (s *CustomerMetricsAPIService) GetMAU(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetMAU with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Mau{}) or use other options such as http.Ok ...
	// return Response(200, Mau{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMAU method not implemented")
}

// GetMAUByCategory - Get monthly active user data by category.
func (s *CustomerMetricsAPIService) GetMAUByCategory(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetMAUByCategory with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MaUbyCategory{}) or use other options such as http.Ok ...
	// return Response(200, MaUbyCategory{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMAUByCategory method not implemented")
}

// GetStream - Get a stream endpoint and return timeseries data.
func (s *CustomerMetricsAPIService) GetStream(ctx context.Context, source string) (ImplResponse, error) {
	// TODO - update GetStream with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Stream{}) or use other options such as http.Ok ...
	// return Response(200, Stream{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	// TODO: Uncomment the next line to return response Response(404, StreamUsageError{}) or use other options such as http.Ok ...
	// return Response(404, StreamUsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetStream method not implemented")
}

// GetStreamBySDK - Get a stream timeseries data by source show sdk version metadata.
func (s *CustomerMetricsAPIService) GetStreamBySDK(ctx context.Context, source string) (ImplResponse, error) {
	// TODO - update GetStreamBySDK with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, StreamBySdk{}) or use other options such as http.Ok ...
	// return Response(200, StreamBySdk{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	// TODO: Uncomment the next line to return response Response(404, StreamUsageError{}) or use other options such as http.Ok ...
	// return Response(404, StreamUsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetStreamBySDK method not implemented")
}

// GetStreamSDKVersion - Get a stream timeseries data by source and show all sdk version associated.
func (s *CustomerMetricsAPIService) GetStreamSDKVersion(ctx context.Context, source string) (ImplResponse, error) {
	// TODO - update GetStreamSDKVersion with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, StreamSdkVersion{}) or use other options such as http.Ok ...
	// return Response(200, StreamSdkVersion{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	// TODO: Uncomment the next line to return response Response(404, StreamUsageError{}) or use other options such as http.Ok ...
	// return Response(404, StreamUsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetStreamSDKVersion method not implemented")
}

// GetStreams - Returns a list of all streams.
func (s *CustomerMetricsAPIService) GetStreams(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetStreams with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Streams{}) or use other options such as http.Ok ...
	// return Response(200, Streams{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetStreams method not implemented")
}

// GetUsage - Returns of the usage endpoints available.
func (s *CustomerMetricsAPIService) GetUsage(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetUsage with the required logic for this service method.
	// Add api_customer_metrics_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Usage{}) or use other options such as http.Ok ...
	// return Response(200, Usage{}), nil

	// TODO: Uncomment the next line to return response Response(403, UsageError{}) or use other options such as http.Ok ...
	// return Response(403, UsageError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUsage method not implemented")
}
