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

// LabelsAPIService is a service that implements the logic for the LabelsAPIServicer
// This service should implement the business logic for every endpoint for the LabelsAPI API.
// Include any external packages or services that will be required by this service.
type LabelsAPIService struct {
}

// NewLabelsAPIService creates a default api service
func NewLabelsAPIService() LabelsAPIServicer {
	return &LabelsAPIService{}
}

// GetAllLabels - Get all labels
func (s *LabelsAPIService) GetAllLabels(ctx context.Context, startAt int64, maxResults int32) (ImplResponse, error) {
	// TODO - update GetAllLabels with the required logic for this service method.
	// Add api_labels_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanString{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanString{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAllLabels method not implemented")
}
