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

// ProjectCategoriesAPIService is a service that implements the logic for the ProjectCategoriesAPIServicer
// This service should implement the business logic for every endpoint for the ProjectCategoriesAPI API.
// Include any external packages or services that will be required by this service.
type ProjectCategoriesAPIService struct {
}

// NewProjectCategoriesAPIService creates a default api service
func NewProjectCategoriesAPIService() ProjectCategoriesAPIServicer {
	return &ProjectCategoriesAPIService{}
}

// CreateProjectCategory - Create project category
func (s *ProjectCategoriesAPIService) CreateProjectCategory(ctx context.Context, projectCategory ProjectCategory) (ImplResponse, error) {
	// TODO - update CreateProjectCategory with the required logic for this service method.
	// Add api_project_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, ProjectCategory{}) or use other options such as http.Ok ...
	// return Response(201, ProjectCategory{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateProjectCategory method not implemented")
}

// GetAllProjectCategories - Get all project categories
func (s *ProjectCategoriesAPIService) GetAllProjectCategories(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetAllProjectCategories with the required logic for this service method.
	// Add api_project_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ProjectCategory{}) or use other options such as http.Ok ...
	// return Response(200, []ProjectCategory{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAllProjectCategories method not implemented")
}

// GetProjectCategoryById - Get project category by ID
func (s *ProjectCategoriesAPIService) GetProjectCategoryById(ctx context.Context, id int64) (ImplResponse, error) {
	// TODO - update GetProjectCategoryById with the required logic for this service method.
	// Add api_project_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ProjectCategory{}) or use other options such as http.Ok ...
	// return Response(200, ProjectCategory{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetProjectCategoryById method not implemented")
}

// RemoveProjectCategory - Delete project category
func (s *ProjectCategoriesAPIService) RemoveProjectCategory(ctx context.Context, id int64) (ImplResponse, error) {
	// TODO - update RemoveProjectCategory with the required logic for this service method.
	// Add api_project_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveProjectCategory method not implemented")
}

// UpdateProjectCategory - Update project category
func (s *ProjectCategoriesAPIService) UpdateProjectCategory(ctx context.Context, id int64, projectCategory ProjectCategory) (ImplResponse, error) {
	// TODO - update UpdateProjectCategory with the required logic for this service method.
	// Add api_project_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, UpdatedProjectCategory{}) or use other options such as http.Ok ...
	// return Response(200, UpdatedProjectCategory{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateProjectCategory method not implemented")
}