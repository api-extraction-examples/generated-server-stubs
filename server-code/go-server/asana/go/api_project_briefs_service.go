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

// ProjectBriefsAPIService is a service that implements the logic for the ProjectBriefsAPIServicer
// This service should implement the business logic for every endpoint for the ProjectBriefsAPI API.
// Include any external packages or services that will be required by this service.
type ProjectBriefsAPIService struct {
}

// NewProjectBriefsAPIService creates a default api service
func NewProjectBriefsAPIService() ProjectBriefsAPIServicer {
	return &ProjectBriefsAPIService{}
}

// CreateProjectBrief - Create a project brief
func (s *ProjectBriefsAPIService) CreateProjectBrief(ctx context.Context, projectGid string, updateProjectBriefRequest UpdateProjectBriefRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update CreateProjectBrief with the required logic for this service method.
	// Add api_project_briefs_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, GetProjectBrief200Response{}) or use other options such as http.Ok ...
	// return Response(201, GetProjectBrief200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateProjectBrief method not implemented")
}

// DeleteProjectBrief - Delete a project brief
func (s *ProjectBriefsAPIService) DeleteProjectBrief(ctx context.Context, projectBriefGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update DeleteProjectBrief with the required logic for this service method.
	// Add api_project_briefs_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeleteAttachment200Response{}) or use other options such as http.Ok ...
	// return Response(200, DeleteAttachment200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteProjectBrief method not implemented")
}

// GetProjectBrief - Get a project brief
func (s *ProjectBriefsAPIService) GetProjectBrief(ctx context.Context, projectBriefGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetProjectBrief with the required logic for this service method.
	// Add api_project_briefs_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetProjectBrief200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetProjectBrief200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(402, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(402, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(424, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(424, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(501, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(501, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(503, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(503, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(504, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(504, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetProjectBrief method not implemented")
}

// UpdateProjectBrief - Update a project brief
func (s *ProjectBriefsAPIService) UpdateProjectBrief(ctx context.Context, projectBriefGid string, updateProjectBriefRequest UpdateProjectBriefRequest, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update UpdateProjectBrief with the required logic for this service method.
	// Add api_project_briefs_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetProjectBrief200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetProjectBrief200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateProjectBrief method not implemented")
}
