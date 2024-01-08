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

// AppPreviewSetsAPIService is a service that implements the logic for the AppPreviewSetsAPIServicer
// This service should implement the business logic for every endpoint for the AppPreviewSetsAPI API.
// Include any external packages or services that will be required by this service.
type AppPreviewSetsAPIService struct {
}

// NewAppPreviewSetsAPIService creates a default api service
func NewAppPreviewSetsAPIService() AppPreviewSetsAPIServicer {
	return &AppPreviewSetsAPIService{}
}

// AppPreviewSetsAppPreviewsGetToManyRelated - 
func (s *AppPreviewSetsAPIService) AppPreviewSetsAppPreviewsGetToManyRelated(ctx context.Context, id string, fieldsAppPreviews []string, fieldsAppPreviewSets []string, limit int32, include []string) (ImplResponse, error) {
	// TODO - update AppPreviewSetsAppPreviewsGetToManyRelated with the required logic for this service method.
	// Add api_app_preview_sets_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPreviewsResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPreviewsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewSetsAppPreviewsGetToManyRelated method not implemented")
}

// AppPreviewSetsAppPreviewsGetToManyRelationship - 
func (s *AppPreviewSetsAPIService) AppPreviewSetsAppPreviewsGetToManyRelationship(ctx context.Context, id string, limit int32) (ImplResponse, error) {
	// TODO - update AppPreviewSetsAppPreviewsGetToManyRelationship with the required logic for this service method.
	// Add api_app_preview_sets_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPreviewSetAppPreviewsLinkagesResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPreviewSetAppPreviewsLinkagesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewSetsAppPreviewsGetToManyRelationship method not implemented")
}

// AppPreviewSetsAppPreviewsReplaceToManyRelationship - 
func (s *AppPreviewSetsAPIService) AppPreviewSetsAppPreviewsReplaceToManyRelationship(ctx context.Context, id string, appPreviewSetAppPreviewsLinkagesRequest AppPreviewSetAppPreviewsLinkagesRequest) (ImplResponse, error) {
	// TODO - update AppPreviewSetsAppPreviewsReplaceToManyRelationship with the required logic for this service method.
	// Add api_app_preview_sets_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewSetsAppPreviewsReplaceToManyRelationship method not implemented")
}

// AppPreviewSetsCreateInstance - 
func (s *AppPreviewSetsAPIService) AppPreviewSetsCreateInstance(ctx context.Context, appPreviewSetCreateRequest AppPreviewSetCreateRequest) (ImplResponse, error) {
	// TODO - update AppPreviewSetsCreateInstance with the required logic for this service method.
	// Add api_app_preview_sets_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, AppPreviewSetResponse{}) or use other options such as http.Ok ...
	// return Response(201, AppPreviewSetResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewSetsCreateInstance method not implemented")
}

// AppPreviewSetsDeleteInstance - 
func (s *AppPreviewSetsAPIService) AppPreviewSetsDeleteInstance(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update AppPreviewSetsDeleteInstance with the required logic for this service method.
	// Add api_app_preview_sets_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewSetsDeleteInstance method not implemented")
}

// AppPreviewSetsGetInstance - 
func (s *AppPreviewSetsAPIService) AppPreviewSetsGetInstance(ctx context.Context, id string, fieldsAppPreviewSets []string, include []string, fieldsAppPreviews []string, limitAppPreviews int32) (ImplResponse, error) {
	// TODO - update AppPreviewSetsGetInstance with the required logic for this service method.
	// Add api_app_preview_sets_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPreviewSetResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPreviewSetResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreviewSetsGetInstance method not implemented")
}