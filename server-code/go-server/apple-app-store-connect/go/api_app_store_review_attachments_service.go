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

// AppStoreReviewAttachmentsAPIService is a service that implements the logic for the AppStoreReviewAttachmentsAPIServicer
// This service should implement the business logic for every endpoint for the AppStoreReviewAttachmentsAPI API.
// Include any external packages or services that will be required by this service.
type AppStoreReviewAttachmentsAPIService struct {
}

// NewAppStoreReviewAttachmentsAPIService creates a default api service
func NewAppStoreReviewAttachmentsAPIService() AppStoreReviewAttachmentsAPIServicer {
	return &AppStoreReviewAttachmentsAPIService{}
}

// AppStoreReviewAttachmentsCreateInstance - 
func (s *AppStoreReviewAttachmentsAPIService) AppStoreReviewAttachmentsCreateInstance(ctx context.Context, appStoreReviewAttachmentCreateRequest AppStoreReviewAttachmentCreateRequest) (ImplResponse, error) {
	// TODO - update AppStoreReviewAttachmentsCreateInstance with the required logic for this service method.
	// Add api_app_store_review_attachments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, AppStoreReviewAttachmentResponse{}) or use other options such as http.Ok ...
	// return Response(201, AppStoreReviewAttachmentResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppStoreReviewAttachmentsCreateInstance method not implemented")
}

// AppStoreReviewAttachmentsDeleteInstance - 
func (s *AppStoreReviewAttachmentsAPIService) AppStoreReviewAttachmentsDeleteInstance(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update AppStoreReviewAttachmentsDeleteInstance with the required logic for this service method.
	// Add api_app_store_review_attachments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("AppStoreReviewAttachmentsDeleteInstance method not implemented")
}

// AppStoreReviewAttachmentsGetInstance - 
func (s *AppStoreReviewAttachmentsAPIService) AppStoreReviewAttachmentsGetInstance(ctx context.Context, id string, fieldsAppStoreReviewAttachments []string, include []string) (ImplResponse, error) {
	// TODO - update AppStoreReviewAttachmentsGetInstance with the required logic for this service method.
	// Add api_app_store_review_attachments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppStoreReviewAttachmentResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppStoreReviewAttachmentResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppStoreReviewAttachmentsGetInstance method not implemented")
}

// AppStoreReviewAttachmentsUpdateInstance - 
func (s *AppStoreReviewAttachmentsAPIService) AppStoreReviewAttachmentsUpdateInstance(ctx context.Context, id string, appStoreReviewAttachmentUpdateRequest AppStoreReviewAttachmentUpdateRequest) (ImplResponse, error) {
	// TODO - update AppStoreReviewAttachmentsUpdateInstance with the required logic for this service method.
	// Add api_app_store_review_attachments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppStoreReviewAttachmentResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppStoreReviewAttachmentResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppStoreReviewAttachmentsUpdateInstance method not implemented")
}
