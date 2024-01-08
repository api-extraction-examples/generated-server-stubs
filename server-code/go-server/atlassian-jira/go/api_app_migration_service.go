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

// AppMigrationAPIService is a service that implements the logic for the AppMigrationAPIServicer
// This service should implement the business logic for every endpoint for the AppMigrationAPI API.
// Include any external packages or services that will be required by this service.
type AppMigrationAPIService struct {
}

// NewAppMigrationAPIService creates a default api service
func NewAppMigrationAPIService() AppMigrationAPIServicer {
	return &AppMigrationAPIService{}
}

// AppIssueFieldValueUpdateResourceUpdateIssueFieldsPut - Bulk update custom field value
func (s *AppMigrationAPIService) AppIssueFieldValueUpdateResourceUpdateIssueFieldsPut(ctx context.Context, atlassianTransferId string, connectCustomFieldValues ConnectCustomFieldValues) (ImplResponse, error) {
	// TODO - update AppIssueFieldValueUpdateResourceUpdateIssueFieldsPut with the required logic for this service method.
	// Add api_app_migration_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	// return Response(200, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppIssueFieldValueUpdateResourceUpdateIssueFieldsPut method not implemented")
}

// MigrationResourceUpdateEntityPropertiesValuePut - Bulk update entity properties
func (s *AppMigrationAPIService) MigrationResourceUpdateEntityPropertiesValuePut(ctx context.Context, atlassianTransferId string, entityType string, entityPropertyDetails []EntityPropertyDetails) (ImplResponse, error) {
	// TODO - update MigrationResourceUpdateEntityPropertiesValuePut with the required logic for this service method.
	// Add api_app_migration_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("MigrationResourceUpdateEntityPropertiesValuePut method not implemented")
}

// MigrationResourceWorkflowRuleSearchPost - Get workflow transition rule configurations
func (s *AppMigrationAPIService) MigrationResourceWorkflowRuleSearchPost(ctx context.Context, atlassianTransferId string, workflowRulesSearch WorkflowRulesSearch) (ImplResponse, error) {
	// TODO - update MigrationResourceWorkflowRuleSearchPost with the required logic for this service method.
	// Add api_app_migration_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, WorkflowRulesSearchDetails{}) or use other options such as http.Ok ...
	// return Response(200, WorkflowRulesSearchDetails{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("MigrationResourceWorkflowRuleSearchPost method not implemented")
}