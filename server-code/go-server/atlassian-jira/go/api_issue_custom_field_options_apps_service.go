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

// IssueCustomFieldOptionsAppsAPIService is a service that implements the logic for the IssueCustomFieldOptionsAppsAPIServicer
// This service should implement the business logic for every endpoint for the IssueCustomFieldOptionsAppsAPI API.
// Include any external packages or services that will be required by this service.
type IssueCustomFieldOptionsAppsAPIService struct {
}

// NewIssueCustomFieldOptionsAppsAPIService creates a default api service
func NewIssueCustomFieldOptionsAppsAPIService() IssueCustomFieldOptionsAppsAPIServicer {
	return &IssueCustomFieldOptionsAppsAPIService{}
}

// CreateIssueFieldOption - Create issue field option
func (s *IssueCustomFieldOptionsAppsAPIService) CreateIssueFieldOption(ctx context.Context, fieldKey string, issueFieldOptionCreateBean IssueFieldOptionCreateBean) (ImplResponse, error) {
	// TODO - update CreateIssueFieldOption with the required logic for this service method.
	// Add api_issue_custom_field_options_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, IssueFieldOption{}) or use other options such as http.Ok ...
	// return Response(200, IssueFieldOption{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateIssueFieldOption method not implemented")
}

// DeleteIssueFieldOption - Delete issue field option
func (s *IssueCustomFieldOptionsAppsAPIService) DeleteIssueFieldOption(ctx context.Context, fieldKey string, optionId int64) (ImplResponse, error) {
	// TODO - update DeleteIssueFieldOption with the required logic for this service method.
	// Add api_issue_custom_field_options_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, interface{}{}) or use other options such as http.Ok ...
	// return Response(204, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteIssueFieldOption method not implemented")
}

// GetAllIssueFieldOptions - Get all issue field options
func (s *IssueCustomFieldOptionsAppsAPIService) GetAllIssueFieldOptions(ctx context.Context, fieldKey string, startAt int64, maxResults int32) (ImplResponse, error) {
	// TODO - update GetAllIssueFieldOptions with the required logic for this service method.
	// Add api_issue_custom_field_options_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanIssueFieldOption{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanIssueFieldOption{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAllIssueFieldOptions method not implemented")
}

// GetIssueFieldOption - Get issue field option
func (s *IssueCustomFieldOptionsAppsAPIService) GetIssueFieldOption(ctx context.Context, fieldKey string, optionId int64) (ImplResponse, error) {
	// TODO - update GetIssueFieldOption with the required logic for this service method.
	// Add api_issue_custom_field_options_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, IssueFieldOption{}) or use other options such as http.Ok ...
	// return Response(200, IssueFieldOption{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetIssueFieldOption method not implemented")
}

// GetSelectableIssueFieldOptions - Get selectable issue field options
func (s *IssueCustomFieldOptionsAppsAPIService) GetSelectableIssueFieldOptions(ctx context.Context, fieldKey string, startAt int64, maxResults int32, projectId int64) (ImplResponse, error) {
	// TODO - update GetSelectableIssueFieldOptions with the required logic for this service method.
	// Add api_issue_custom_field_options_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanIssueFieldOption{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanIssueFieldOption{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSelectableIssueFieldOptions method not implemented")
}

// GetVisibleIssueFieldOptions - Get visible issue field options
func (s *IssueCustomFieldOptionsAppsAPIService) GetVisibleIssueFieldOptions(ctx context.Context, fieldKey string, startAt int64, maxResults int32, projectId int64) (ImplResponse, error) {
	// TODO - update GetVisibleIssueFieldOptions with the required logic for this service method.
	// Add api_issue_custom_field_options_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanIssueFieldOption{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanIssueFieldOption{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetVisibleIssueFieldOptions method not implemented")
}

// ReplaceIssueFieldOption - Replace issue field option
func (s *IssueCustomFieldOptionsAppsAPIService) ReplaceIssueFieldOption(ctx context.Context, fieldKey string, optionId int64, replaceWith int64, jql string, overrideScreenSecurity bool, overrideEditableFlag bool) (ImplResponse, error) {
	// TODO - update ReplaceIssueFieldOption with the required logic for this service method.
	// Add api_issue_custom_field_options_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(303, TaskProgressBeanRemoveOptionFromIssuesResult{}) or use other options such as http.Ok ...
	// return Response(303, TaskProgressBeanRemoveOptionFromIssuesResult{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ReplaceIssueFieldOption method not implemented")
}

// UpdateIssueFieldOption - Update issue field option
func (s *IssueCustomFieldOptionsAppsAPIService) UpdateIssueFieldOption(ctx context.Context, fieldKey string, optionId int64, issueFieldOption IssueFieldOption) (ImplResponse, error) {
	// TODO - update UpdateIssueFieldOption with the required logic for this service method.
	// Add api_issue_custom_field_options_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, IssueFieldOption{}) or use other options such as http.Ok ...
	// return Response(200, IssueFieldOption{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateIssueFieldOption method not implemented")
}
