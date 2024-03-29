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
	"os"
)

// AttachmentsAPIService is a service that implements the logic for the AttachmentsAPIServicer
// This service should implement the business logic for every endpoint for the AttachmentsAPI API.
// Include any external packages or services that will be required by this service.
type AttachmentsAPIService struct {
}

// NewAttachmentsAPIService creates a default api service
func NewAttachmentsAPIService() AttachmentsAPIServicer {
	return &AttachmentsAPIService{}
}

// CreateAttachmentForObject - Upload an attachment
func (s *AttachmentsAPIService) CreateAttachmentForObject(ctx context.Context, optPretty bool, optFields []string, connectToApp bool, file *os.File, name string, parent string, resourceSubtype string, url string) (ImplResponse, error) {
	// TODO - update CreateAttachmentForObject with the required logic for this service method.
	// Add api_attachments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateAttachmentForObject200Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateAttachmentForObject200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("CreateAttachmentForObject method not implemented")
}

// DeleteAttachment - Delete an attachment
func (s *AttachmentsAPIService) DeleteAttachment(ctx context.Context, attachmentGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update DeleteAttachment with the required logic for this service method.
	// Add api_attachments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteAttachment method not implemented")
}

// GetAttachment - Get an attachment
func (s *AttachmentsAPIService) GetAttachment(ctx context.Context, attachmentGid string, optPretty bool, optFields []string) (ImplResponse, error) {
	// TODO - update GetAttachment with the required logic for this service method.
	// Add api_attachments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CreateAttachmentForObject200Response{}) or use other options such as http.Ok ...
	// return Response(200, CreateAttachmentForObject200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetAttachment method not implemented")
}

// GetAttachmentsForObject - Get attachments from an object
func (s *AttachmentsAPIService) GetAttachmentsForObject(ctx context.Context, parent string, optPretty bool, optFields []string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update GetAttachmentsForObject with the required logic for this service method.
	// Add api_attachments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetAttachmentsForObject200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetAttachmentsForObject200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetAttachmentsForObject method not implemented")
}
