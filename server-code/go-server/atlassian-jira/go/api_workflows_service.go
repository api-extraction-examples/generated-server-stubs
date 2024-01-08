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

// WorkflowsAPIService is a service that implements the logic for the WorkflowsAPIServicer
// This service should implement the business logic for every endpoint for the WorkflowsAPI API.
// Include any external packages or services that will be required by this service.
type WorkflowsAPIService struct {
}

// NewWorkflowsAPIService creates a default api service
func NewWorkflowsAPIService() WorkflowsAPIServicer {
	return &WorkflowsAPIService{}
}

// CreateWorkflow - Create workflow
func (s *WorkflowsAPIService) CreateWorkflow(ctx context.Context, createWorkflowDetails CreateWorkflowDetails) (ImplResponse, error) {
	// TODO - update CreateWorkflow with the required logic for this service method.
	// Add api_workflows_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, WorkflowIds{}) or use other options such as http.Ok ...
	// return Response(201, WorkflowIds{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateWorkflow method not implemented")
}

// DeleteInactiveWorkflow - Delete inactive workflow
func (s *WorkflowsAPIService) DeleteInactiveWorkflow(ctx context.Context, entityId string) (ImplResponse, error) {
	// TODO - update DeleteInactiveWorkflow with the required logic for this service method.
	// Add api_workflows_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteInactiveWorkflow method not implemented")
}

// GetAllWorkflows - Get all workflows
// Deprecated
func (s *WorkflowsAPIService) GetAllWorkflows(ctx context.Context, workflowName string) (ImplResponse, error) {
	// TODO - update GetAllWorkflows with the required logic for this service method.
	// Add api_workflows_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []DeprecatedWorkflow{}) or use other options such as http.Ok ...
	// return Response(200, []DeprecatedWorkflow{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAllWorkflows method not implemented")
}

// GetWorkflowsPaginated - Get workflows paginated
func (s *WorkflowsAPIService) GetWorkflowsPaginated(ctx context.Context, startAt int64, maxResults int32, workflowName []string, expand string, queryString string, orderBy string, isActive bool) (ImplResponse, error) {
	// TODO - update GetWorkflowsPaginated with the required logic for this service method.
	// Add api_workflows_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanWorkflow{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanWorkflow{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, ErrorCollection{}) or use other options such as http.Ok ...
	// return Response(403, ErrorCollection{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetWorkflowsPaginated method not implemented")
}