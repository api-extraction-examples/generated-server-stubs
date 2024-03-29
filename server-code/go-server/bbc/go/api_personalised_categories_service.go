/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// PersonalisedCategoriesAPIService is a service that implements the logic for the PersonalisedCategoriesAPIServicer
// This service should implement the business logic for every endpoint for the PersonalisedCategoriesAPI API.
// Include any external packages or services that will be required by this service.
type PersonalisedCategoriesAPIService struct {
}

// NewPersonalisedCategoriesAPIService creates a default api service
func NewPersonalisedCategoriesAPIService() PersonalisedCategoriesAPIServicer {
	return &PersonalisedCategoriesAPIService{}
}

// MyCategoriesFollowsDelete - Unfollow category
func (s *PersonalisedCategoriesAPIService) MyCategoriesFollowsDelete(ctx context.Context, authorization string, xAPIKey string, body Body1) (ImplResponse, error) {
	// TODO - update MyCategoriesFollowsDelete with the required logic for this service method.
	// Add api_personalised_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(202, {}) or use other options such as http.Ok ...
	// return Response(202, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MyCategoriesFollowsDelete method not implemented")
}

// MyCategoriesFollowsGet - List of followed categories
func (s *PersonalisedCategoriesAPIService) MyCategoriesFollowsGet(ctx context.Context, authorization string, xAPIKey string, offset int32, limit int32) (ImplResponse, error) {
	// TODO - update MyCategoriesFollowsGet with the required logic for this service method.
	// Add api_personalised_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PersonalisedCategoriesResponse{}) or use other options such as http.Ok ...
	// return Response(200, PersonalisedCategoriesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MyCategoriesFollowsGet method not implemented")
}

// MyCategoriesFollowsPost - Follow category
func (s *PersonalisedCategoriesAPIService) MyCategoriesFollowsPost(ctx context.Context, authorization string, xAPIKey string, body Body) (ImplResponse, error) {
	// TODO - update MyCategoriesFollowsPost with the required logic for this service method.
	// Add api_personalised_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(202, {}) or use other options such as http.Ok ...
	// return Response(202, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(401, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(401, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("MyCategoriesFollowsPost method not implemented")
}
