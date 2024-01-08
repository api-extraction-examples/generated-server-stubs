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
	"time"
)

// StatusUpdatesAPIService is a service that implements the logic for the StatusUpdatesAPIServicer
// This service should implement the business logic for every endpoint for the StatusUpdatesAPI API.
// Include any external packages or services that will be required by this service.
type StatusUpdatesAPIService struct {
}

// NewStatusUpdatesAPIService creates a default api service
func NewStatusUpdatesAPIService() StatusUpdatesAPIServicer {
	return &StatusUpdatesAPIService{}
}

// CreateStatusForObject - Create a status update
func (s *StatusUpdatesAPIService) CreateStatusForObject(ctx context.Context, createStatusForObjectRequest CreateStatusForObjectRequest, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update CreateStatusForObject with the required logic for this service method.
	// Add api_status_updates_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, CreateStatusForObject201Response{}) or use other options such as http.Ok ...
	// return Response(201, CreateStatusForObject201Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("CreateStatusForObject method not implemented")
}

// DeleteStatus - Delete a status update
func (s *StatusUpdatesAPIService) DeleteStatus(ctx context.Context, statusGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update DeleteStatus with the required logic for this service method.
	// Add api_status_updates_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeleteAttachment200Response{}) or use other options such as http.Ok ...
	// return Response(200, DeleteAttachment200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteStatus method not implemented")
}

// GetStatus - Get a status update
func (s *StatusUpdatesAPIService) GetStatus(ctx context.Context, statusGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetStatus with the required logic for this service method.
	// Add api_status_updates_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateStatusForObject201Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateStatusForObject201Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetStatus method not implemented")
}

// GetStatusesForObject - Get status updates from an object
func (s *StatusUpdatesAPIService) GetStatusesForObject(ctx context.Context, parent string, optPretty bool, optFields []string, limit int32, offset string, createdSince time.Time) (ImplResponse, error) {
	// TODO - update GetStatusesForObject with the required logic for this service method.
	// Add api_status_updates_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetStatusesForObject200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetStatusesForObject200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetStatusesForObject method not implemented")
}