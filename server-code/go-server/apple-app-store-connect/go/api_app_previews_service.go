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

// AppPreviewsAPIService is a service that implements the logic for the AppPreviewsAPIServicer
// This service should implement the business logic for every endpoint for the AppPreviewsAPI API.
// Include any external packages or services that will be required by this service.
type AppPreviewsAPIService struct {
}

// NewAppPreviewsAPIService creates a default api service
func NewAppPreviewsAPIService() AppPreviewsAPIServicer {
	return &AppPreviewsAPIService{}
}

// AppPreviewsCreateInstance - 
func (s *AppPreviewsAPIService) AppPreviewsCreateInstance(ctx context.Context, appPreviewCreateRequest AppPreviewCreateRequest) (ImplResponse, error) {
	// TODO - update AppPreviewsCreateInstance with the required logic for this service method.
	// Add api_app_previews_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, AppPreviewResponse{}) or use other options such as http.Ok ...
	// return Response(201, AppPreviewResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewsCreateInstance method not implemented")
}

// AppPreviewsDeleteInstance - 
func (s *AppPreviewsAPIService) AppPreviewsDeleteInstance(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update AppPreviewsDeleteInstance with the required logic for this service method.
	// Add api_app_previews_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewsDeleteInstance method not implemented")
}

// AppPreviewsGetInstance - 
func (s *AppPreviewsAPIService) AppPreviewsGetInstance(ctx context.Context, id string, fieldsAppPreviews []string, include []string) (ImplResponse, error) {
	// TODO - update AppPreviewsGetInstance with the required logic for this service method.
	// Add api_app_previews_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPreviewResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPreviewResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewsGetInstance method not implemented")
}

// AppPreviewsUpdateInstance - 
func (s *AppPreviewsAPIService) AppPreviewsUpdateInstance(ctx context.Context, id string, appPreviewUpdateRequest AppPreviewUpdateRequest) (ImplResponse, error) {
	// TODO - update AppPreviewsUpdateInstance with the required logic for this service method.
	// Add api_app_previews_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPreviewResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPreviewResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewsUpdateInstance method not implemented")
}
