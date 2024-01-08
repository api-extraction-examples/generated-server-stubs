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

// OrganizationExportsAPIService is a service that implements the logic for the OrganizationExportsAPIServicer
// This service should implement the business logic for every endpoint for the OrganizationExportsAPI API.
// Include any external packages or services that will be required by this service.
type OrganizationExportsAPIService struct {
}

// NewOrganizationExportsAPIService creates a default api service
func NewOrganizationExportsAPIService() OrganizationExportsAPIServicer {
	return &OrganizationExportsAPIService{}
}

// CreateOrganizationExport - Create an organization export request
func (s *OrganizationExportsAPIService) CreateOrganizationExport(ctx context.Context, createOrganizationExportRequest CreateOrganizationExportRequest, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update CreateOrganizationExport with the required logic for this service method.
	// Add api_organization_exports_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, CreateOrganizationExport201Response{}) or use other options such as http.Ok ...
	// return Response(201, CreateOrganizationExport201Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("CreateOrganizationExport method not implemented")
}

// GetOrganizationExport - Get details on an org export request
func (s *OrganizationExportsAPIService) GetOrganizationExport(ctx context.Context, organizationExportGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetOrganizationExport with the required logic for this service method.
	// Add api_organization_exports_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateOrganizationExport201Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateOrganizationExport201Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetOrganizationExport method not implemented")
}
