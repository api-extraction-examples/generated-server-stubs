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

// IssuePropertiesAPIService is a service that implements the logic for the IssuePropertiesAPIServicer
// This service should implement the business logic for every endpoint for the IssuePropertiesAPI API.
// Include any external packages or services that will be required by this service.
type IssuePropertiesAPIService struct {
}

// NewIssuePropertiesAPIService creates a default api service
func NewIssuePropertiesAPIService() IssuePropertiesAPIServicer {
	return &IssuePropertiesAPIService{}
}

// BulkDeleteIssueProperty - Bulk delete issue property
func (s *IssuePropertiesAPIService) BulkDeleteIssueProperty(ctx context.Context, propertyKey string, issueFilterForBulkPropertyDelete IssueFilterForBulkPropertyDelete) (ImplResponse, error) {
	// TODO - update BulkDeleteIssueProperty with the required logic for this service method.
	// Add api_issue_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(303, {}) or use other options such as http.Ok ...
	// return Response(303, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BulkDeleteIssueProperty method not implemented")
}

// BulkSetIssuePropertiesByIssue - Bulk set issue properties by issue
func (s *IssuePropertiesAPIService) BulkSetIssuePropertiesByIssue(ctx context.Context, multiIssueEntityProperties MultiIssueEntityProperties) (ImplResponse, error) {
	// TODO - update BulkSetIssuePropertiesByIssue with the required logic for this service method.
	// Add api_issue_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(303, {}) or use other options such as http.Ok ...
	// return Response(303, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(403, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BulkSetIssuePropertiesByIssue method not implemented")
}

// BulkSetIssueProperty - Bulk set issue property
func (s *IssuePropertiesAPIService) BulkSetIssueProperty(ctx context.Context, propertyKey string, bulkIssuePropertyUpdateRequest BulkIssuePropertyUpdateRequest) (ImplResponse, error) {
	// TODO - update BulkSetIssueProperty with the required logic for this service method.
	// Add api_issue_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(303, {}) or use other options such as http.Ok ...
	// return Response(303, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BulkSetIssueProperty method not implemented")
}

// BulkSetIssuesPropertiesList - Bulk set issues properties by list
func (s *IssuePropertiesAPIService) BulkSetIssuesPropertiesList(ctx context.Context, issueEntityProperties IssueEntityProperties) (ImplResponse, error) {
	// TODO - update BulkSetIssuesPropertiesList with the required logic for this service method.
	// Add api_issue_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(303, {}) or use other options such as http.Ok ...
	// return Response(303, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BulkSetIssuesPropertiesList method not implemented")
}

// DeleteIssueProperty - Delete issue property
func (s *IssuePropertiesAPIService) DeleteIssueProperty(ctx context.Context, issueIdOrKey string, propertyKey string) (ImplResponse, error) {
	// TODO - update DeleteIssueProperty with the required logic for this service method.
	// Add api_issue_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteIssueProperty method not implemented")
}

// GetIssueProperty - Get issue property
func (s *IssuePropertiesAPIService) GetIssueProperty(ctx context.Context, issueIdOrKey string, propertyKey string) (ImplResponse, error) {
	// TODO - update GetIssueProperty with the required logic for this service method.
	// Add api_issue_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, EntityProperty{}) or use other options such as http.Ok ...
	// return Response(200, EntityProperty{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetIssueProperty method not implemented")
}

// GetIssuePropertyKeys - Get issue property keys
func (s *IssuePropertiesAPIService) GetIssuePropertyKeys(ctx context.Context, issueIdOrKey string) (ImplResponse, error) {
	// TODO - update GetIssuePropertyKeys with the required logic for this service method.
	// Add api_issue_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PropertyKeys{}) or use other options such as http.Ok ...
	// return Response(200, PropertyKeys{}), nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetIssuePropertyKeys method not implemented")
}

// SetIssueProperty - Set issue property
func (s *IssuePropertiesAPIService) SetIssueProperty(ctx context.Context, issueIdOrKey string, propertyKey string, body *interface{}) (ImplResponse, error) {
	// TODO - update SetIssueProperty with the required logic for this service method.
	// Add api_issue_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	// return Response(200, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(201, interface{}{}) or use other options such as http.Ok ...
	// return Response(201, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetIssueProperty method not implemented")
}