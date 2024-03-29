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

// ProjectsAPIService is a service that implements the logic for the ProjectsAPIServicer
// This service should implement the business logic for every endpoint for the ProjectsAPI API.
// Include any external packages or services that will be required by this service.
type ProjectsAPIService struct {
}

// NewProjectsAPIService creates a default api service
func NewProjectsAPIService() ProjectsAPIServicer {
	return &ProjectsAPIService{}
}

// DeleteProject - Delete a project by key. Caution-- deleting a project will delete all associated environments and feature flags. You cannot delete the last project in an account.
func (s *ProjectsAPIService) DeleteProject(ctx context.Context, projectKey string) (ImplResponse, error) {
	// TODO - update DeleteProject with the required logic for this service method.
	// Add api_projects_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteProject method not implemented")
}

// GetProject - Fetch a single project by key.
func (s *ProjectsAPIService) GetProject(ctx context.Context, projectKey string) (ImplResponse, error) {
	// TODO - update GetProject with the required logic for this service method.
	// Add api_projects_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Project{}) or use other options such as http.Ok ...
	// return Response(200, Project{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetProject method not implemented")
}

// GetProjects - Returns a list of all projects in the account.
func (s *ProjectsAPIService) GetProjects(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetProjects with the required logic for this service method.
	// Add api_projects_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Projects{}) or use other options such as http.Ok ...
	// return Response(200, Projects{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetProjects method not implemented")
}

// PatchProject - Modify a project by ID.
func (s *ProjectsAPIService) PatchProject(ctx context.Context, projectKey string, patchDelta []PatchOperation) (ImplResponse, error) {
	// TODO - update PatchProject with the required logic for this service method.
	// Add api_projects_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Project{}) or use other options such as http.Ok ...
	// return Response(200, Project{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PatchProject method not implemented")
}

// PostProject - Create a new project with the given key and name.
func (s *ProjectsAPIService) PostProject(ctx context.Context, projectBody PostProjectRequest) (ImplResponse, error) {
	// TODO - update PostProject with the required logic for this service method.
	// Add api_projects_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, Project{}) or use other options such as http.Ok ...
	// return Response(201, Project{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostProject method not implemented")
}
