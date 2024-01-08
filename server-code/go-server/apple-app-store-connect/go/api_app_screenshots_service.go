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

// AppScreenshotsAPIService is a service that implements the logic for the AppScreenshotsAPIServicer
// This service should implement the business logic for every endpoint for the AppScreenshotsAPI API.
// Include any external packages or services that will be required by this service.
type AppScreenshotsAPIService struct {
}

// NewAppScreenshotsAPIService creates a default api service
func NewAppScreenshotsAPIService() AppScreenshotsAPIServicer {
	return &AppScreenshotsAPIService{}
}

// AppScreenshotsCreateInstance - 
func (s *AppScreenshotsAPIService) AppScreenshotsCreateInstance(ctx context.Context, appScreenshotCreateRequest AppScreenshotCreateRequest) (ImplResponse, error) {
	// TODO - update AppScreenshotsCreateInstance with the required logic for this service method.
	// Add api_app_screenshots_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, AppScreenshotResponse{}) or use other options such as http.Ok ...
	// return Response(201, AppScreenshotResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppScreenshotsCreateInstance method not implemented")
}

// AppScreenshotsDeleteInstance - 
func (s *AppScreenshotsAPIService) AppScreenshotsDeleteInstance(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update AppScreenshotsDeleteInstance with the required logic for this service method.
	// Add api_app_screenshots_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("AppScreenshotsDeleteInstance method not implemented")
}

// AppScreenshotsGetInstance - 
func (s *AppScreenshotsAPIService) AppScreenshotsGetInstance(ctx context.Context, id string, fieldsAppScreenshots []string, include []string) (ImplResponse, error) {
	// TODO - update AppScreenshotsGetInstance with the required logic for this service method.
	// Add api_app_screenshots_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppScreenshotResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppScreenshotResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppScreenshotsGetInstance method not implemented")
}

// AppScreenshotsUpdateInstance - 
func (s *AppScreenshotsAPIService) AppScreenshotsUpdateInstance(ctx context.Context, id string, appScreenshotUpdateRequest AppScreenshotUpdateRequest) (ImplResponse, error) {
	// TODO - update AppScreenshotsUpdateInstance with the required logic for this service method.
	// Add api_app_screenshots_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppScreenshotResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppScreenshotResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppScreenshotsUpdateInstance method not implemented")
}
