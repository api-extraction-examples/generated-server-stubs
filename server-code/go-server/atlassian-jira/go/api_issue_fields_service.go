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
	"reflect"
)

// IssueFieldsAPIService is a service that implements the logic for the IssueFieldsAPIServicer
// This service should implement the business logic for every endpoint for the IssueFieldsAPI API.
// Include any external packages or services that will be required by this service.
type IssueFieldsAPIService struct {
}

// NewIssueFieldsAPIService creates a default api service
func NewIssueFieldsAPIService() IssueFieldsAPIServicer {
	return &IssueFieldsAPIService{}
}

// CreateCustomField - Create custom field
func (s *IssueFieldsAPIService) CreateCustomField(ctx context.Context, customFieldDefinitionJsonBean CustomFieldDefinitionJsonBean) (ImplResponse, error) {
	// TODO - update CreateCustomField with the required logic for this service method.
	// Add api_issue_fields_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, FieldDetails{}) or use other options such as http.Ok ...
	// return Response(201, FieldDetails{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateCustomField method not implemented")
}

// DeleteCustomField - Delete custom field
func (s *IssueFieldsAPIService) DeleteCustomField(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update DeleteCustomField with the required logic for this service method.
	// Add api_issue_fields_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(303, TaskProgressBeanObject{}) or use other options such as http.Ok ...
	// return Response(303, TaskProgressBeanObject{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(403, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(404, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(409, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteCustomField method not implemented")
}

// GetContextsForFieldDeprecated - Get contexts for a field
// Deprecated
func (s *IssueFieldsAPIService) GetContextsForFieldDeprecated(ctx context.Context, fieldId string, startAt int64, maxResults int32) (ImplResponse, error) {
	// TODO - update GetContextsForFieldDeprecated with the required logic for this service method.
	// Add api_issue_fields_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanContext{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanContext{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetContextsForFieldDeprecated method not implemented")
}

// GetFields - Get fields
func (s *IssueFieldsAPIService) GetFields(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetFields with the required logic for this service method.
	// Add api_issue_fields_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []FieldDetails{}) or use other options such as http.Ok ...
	// return Response(200, []FieldDetails{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFields method not implemented")
}

// GetFieldsPaginated - Get fields paginated
func (s *IssueFieldsAPIService) GetFieldsPaginated(ctx context.Context, startAt int64, maxResults int32, type_ []string, id []string, query string, orderBy string, expand string) (ImplResponse, error) {
	// TODO - update GetFieldsPaginated with the required logic for this service method.
	// Add api_issue_fields_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanField{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanField{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(403, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetFieldsPaginated method not implemented")
}

// GetTrashedFieldsPaginated - Get fields in trash paginated
func (s *IssueFieldsAPIService) GetTrashedFieldsPaginated(ctx context.Context, startAt int64, maxResults int32, id []string, query string, expand string, orderBy string) (ImplResponse, error) {
	// TODO - update GetTrashedFieldsPaginated with the required logic for this service method.
	// Add api_issue_fields_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanField{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanField{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(403, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetTrashedFieldsPaginated method not implemented")
}

// RestoreCustomField - Restore custom field from trash
func (s *IssueFieldsAPIService) RestoreCustomField(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update RestoreCustomField with the required logic for this service method.
	// Add api_issue_fields_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	// return Response(200, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(403, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(404, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RestoreCustomField method not implemented")
}

// TrashCustomField - Move custom field to trash
func (s *IssueFieldsAPIService) TrashCustomField(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update TrashCustomField with the required logic for this service method.
	// Add api_issue_fields_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	// return Response(200, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(400, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(401, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(403, ErrorCollection{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(404, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("TrashCustomField method not implemented")
}

// UpdateCustomField - Update custom field
func (s *IssueFieldsAPIService) UpdateCustomField(ctx context.Context, fieldId string, updateCustomFieldDetails UpdateCustomFieldDetails) (ImplResponse, error) {
	// TODO - update UpdateCustomField with the required logic for this service method.
	// Add api_issue_fields_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, interface{}{}) or use other options such as http.Ok ...
	// return Response(204, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateCustomField method not implemented")
}