/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// AppCategoriesAPIService is a service that implements the logic for the AppCategoriesAPIServicer
// This service should implement the business logic for every endpoint for the AppCategoriesAPI API.
// Include any external packages or services that will be required by this service.
type AppCategoriesAPIService struct {
}

// NewAppCategoriesAPIService creates a default api service
func NewAppCategoriesAPIService() AppCategoriesAPIServicer {
	return &AppCategoriesAPIService{}
}

// AppCategoriesGetCollection - 
func (s *AppCategoriesAPIService) AppCategoriesGetCollection(ctx context.Context, filterPlatforms []string, existsParent []string, fieldsAppCategories []string, limit int32, include []string, limitSubcategories int32) (ImplResponse, error) {
	// TODO - update AppCategoriesGetCollection with the required logic for this service method.
	// Add api_app_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppCategoriesResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppCategoriesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppCategoriesGetCollection method not implemented")
}

// AppCategoriesGetInstance - 
func (s *AppCategoriesAPIService) AppCategoriesGetInstance(ctx context.Context, id string, fieldsAppCategories []string, include []string, limitSubcategories int32) (ImplResponse, error) {
	// TODO - update AppCategoriesGetInstance with the required logic for this service method.
	// Add api_app_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppCategoryResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppCategoryResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppCategoriesGetInstance method not implemented")
}

// AppCategoriesParentGetToOneRelated - 
func (s *AppCategoriesAPIService) AppCategoriesParentGetToOneRelated(ctx context.Context, id string, fieldsAppCategories []string) (ImplResponse, error) {
	// TODO - update AppCategoriesParentGetToOneRelated with the required logic for this service method.
	// Add api_app_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppCategoryResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppCategoryResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppCategoriesParentGetToOneRelated method not implemented")
}

// AppCategoriesSubcategoriesGetToManyRelated - 
func (s *AppCategoriesAPIService) AppCategoriesSubcategoriesGetToManyRelated(ctx context.Context, id string, fieldsAppCategories []string, limit int32) (ImplResponse, error) {
	// TODO - update AppCategoriesSubcategoriesGetToManyRelated with the required logic for this service method.
	// Add api_app_categories_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppCategoriesResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppCategoriesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppCategoriesSubcategoriesGetToManyRelated method not implemented")
}
