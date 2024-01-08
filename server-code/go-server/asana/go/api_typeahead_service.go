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

// TypeaheadAPIService is a service that implements the logic for the TypeaheadAPIServicer
// This service should implement the business logic for every endpoint for the TypeaheadAPI API.
// Include any external packages or services that will be required by this service.
type TypeaheadAPIService struct {
}

// NewTypeaheadAPIService creates a default api service
func NewTypeaheadAPIService() TypeaheadAPIServicer {
	return &TypeaheadAPIService{}
}

// TypeaheadForWorkspace - Get objects via typeahead
func (s *TypeaheadAPIService) TypeaheadForWorkspace(ctx context.Context, workspaceGid string, resourceType string, type_ string, query string, count int32, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update TypeaheadForWorkspace with the required logic for this service method.
	// Add api_typeahead_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, TypeaheadForWorkspace200Response{}) or use other options such as http.Ok ...
	// return Response(200, TypeaheadForWorkspace200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("TypeaheadForWorkspace method not implemented")
}
