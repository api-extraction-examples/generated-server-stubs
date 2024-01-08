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

// IssueCustomFieldConfigurationAppsAPIService is a service that implements the logic for the IssueCustomFieldConfigurationAppsAPIServicer
// This service should implement the business logic for every endpoint for the IssueCustomFieldConfigurationAppsAPI API.
// Include any external packages or services that will be required by this service.
type IssueCustomFieldConfigurationAppsAPIService struct {
}

// NewIssueCustomFieldConfigurationAppsAPIService creates a default api service
func NewIssueCustomFieldConfigurationAppsAPIService() IssueCustomFieldConfigurationAppsAPIServicer {
	return &IssueCustomFieldConfigurationAppsAPIService{}
}

// GetCustomFieldConfiguration - Get custom field configurations
func (s *IssueCustomFieldConfigurationAppsAPIService) GetCustomFieldConfiguration(ctx context.Context, fieldIdOrKey string, id []int64, fieldContextId []int64, issueId int64, projectKeyOrId string, issueTypeId string, startAt int64, maxResults int32) (ImplResponse, error) {
	// TODO - update GetCustomFieldConfiguration with the required logic for this service method.
	// Add api_issue_custom_field_configuration_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanContextualConfiguration{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanContextualConfiguration{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetCustomFieldConfiguration method not implemented")
}

// UpdateCustomFieldConfiguration - Update custom field configurations
func (s *IssueCustomFieldConfigurationAppsAPIService) UpdateCustomFieldConfiguration(ctx context.Context, fieldIdOrKey string, customFieldConfigurations CustomFieldConfigurations) (ImplResponse, error) {
	// TODO - update UpdateCustomFieldConfiguration with the required logic for this service method.
	// Add api_issue_custom_field_configuration_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	// return Response(200, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateCustomFieldConfiguration method not implemented")
}