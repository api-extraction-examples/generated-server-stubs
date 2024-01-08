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

// BatchAPIAPIService is a service that implements the logic for the BatchAPIAPIServicer
// This service should implement the business logic for every endpoint for the BatchAPIAPI API.
// Include any external packages or services that will be required by this service.
type BatchAPIAPIService struct {
}

// NewBatchAPIAPIService creates a default api service
func NewBatchAPIAPIService() BatchAPIAPIServicer {
	return &BatchAPIAPIService{}
}

// CreateBatchRequest - Submit parallel requests
func (s *BatchAPIAPIService) CreateBatchRequest(ctx context.Context, createBatchRequestRequest CreateBatchRequestRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update CreateBatchRequest with the required logic for this service method.
	// Add api_batch_api_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateBatchRequest200Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateBatchRequest200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("CreateBatchRequest method not implemented")
}