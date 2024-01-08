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

// ProjectPropertiesAPIService is a service that implements the logic for the ProjectPropertiesAPIServicer
// This service should implement the business logic for every endpoint for the ProjectPropertiesAPI API.
// Include any external packages or services that will be required by this service.
type ProjectPropertiesAPIService struct {
}

// NewProjectPropertiesAPIService creates a default api service
func NewProjectPropertiesAPIService() ProjectPropertiesAPIServicer {
	return &ProjectPropertiesAPIService{}
}

// DeleteProjectProperty - Delete project property
func (s *ProjectPropertiesAPIService) DeleteProjectProperty(ctx context.Context, projectIdOrKey string, propertyKey string) (ImplResponse, error) {
	// TODO - update DeleteProjectProperty with the required logic for this service method.
	// Add api_project_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteProjectProperty method not implemented")
}

// GetProjectProperty - Get project property
func (s *ProjectPropertiesAPIService) GetProjectProperty(ctx context.Context, projectIdOrKey string, propertyKey string) (ImplResponse, error) {
	// TODO - update GetProjectProperty with the required logic for this service method.
	// Add api_project_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, EntityProperty{}) or use other options such as http.Ok ...
	// return Response(200, EntityProperty{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetProjectProperty method not implemented")
}

// GetProjectPropertyKeys - Get project property keys
func (s *ProjectPropertiesAPIService) GetProjectPropertyKeys(ctx context.Context, projectIdOrKey string) (ImplResponse, error) {
	// TODO - update GetProjectPropertyKeys with the required logic for this service method.
	// Add api_project_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PropertyKeys{}) or use other options such as http.Ok ...
	// return Response(200, PropertyKeys{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetProjectPropertyKeys method not implemented")
}

// SetProjectProperty - Set project property
func (s *ProjectPropertiesAPIService) SetProjectProperty(ctx context.Context, projectIdOrKey string, propertyKey string, body *interface{}) (ImplResponse, error) {
	// TODO - update SetProjectProperty with the required logic for this service method.
	// Add api_project_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("SetProjectProperty method not implemented")
}