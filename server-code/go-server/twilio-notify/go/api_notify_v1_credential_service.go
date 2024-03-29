/*
 * Twilio - Notify
 *
 * This is the public Twilio REST API.
 *
 * API version: 1.52.0
 * Contact: support@twilio.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// NotifyV1CredentialAPIService is a service that implements the logic for the NotifyV1CredentialAPIServicer
// This service should implement the business logic for every endpoint for the NotifyV1CredentialAPI API.
// Include any external packages or services that will be required by this service.
type NotifyV1CredentialAPIService struct {
}

// NewNotifyV1CredentialAPIService creates a default api service
func NewNotifyV1CredentialAPIService() NotifyV1CredentialAPIServicer {
	return &NotifyV1CredentialAPIService{}
}

// CreateCredential - 
func (s *NotifyV1CredentialAPIService) CreateCredential(ctx context.Context, type_ CredentialEnumPushService, apiKey string, certificate string, friendlyName string, privateKey string, sandbox bool, secret string) (ImplResponse, error) {
	// TODO - update CreateCredential with the required logic for this service method.
	// Add api_notify_v1_credential_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, NotifyV1Credential{}) or use other options such as http.Ok ...
	// return Response(201, NotifyV1Credential{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateCredential method not implemented")
}

// DeleteCredential - 
func (s *NotifyV1CredentialAPIService) DeleteCredential(ctx context.Context, sid string) (ImplResponse, error) {
	// TODO - update DeleteCredential with the required logic for this service method.
	// Add api_notify_v1_credential_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteCredential method not implemented")
}

// FetchCredential - 
func (s *NotifyV1CredentialAPIService) FetchCredential(ctx context.Context, sid string) (ImplResponse, error) {
	// TODO - update FetchCredential with the required logic for this service method.
	// Add api_notify_v1_credential_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, NotifyV1Credential{}) or use other options such as http.Ok ...
	// return Response(200, NotifyV1Credential{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("FetchCredential method not implemented")
}

// ListCredential - 
func (s *NotifyV1CredentialAPIService) ListCredential(ctx context.Context, pageSize int32, page int32, pageToken string) (ImplResponse, error) {
	// TODO - update ListCredential with the required logic for this service method.
	// Add api_notify_v1_credential_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ListCredentialResponse{}) or use other options such as http.Ok ...
	// return Response(200, ListCredentialResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListCredential method not implemented")
}

// UpdateCredential - 
func (s *NotifyV1CredentialAPIService) UpdateCredential(ctx context.Context, sid string, apiKey string, certificate string, friendlyName string, privateKey string, sandbox bool, secret string) (ImplResponse, error) {
	// TODO - update UpdateCredential with the required logic for this service method.
	// Add api_notify_v1_credential_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, NotifyV1Credential{}) or use other options such as http.Ok ...
	// return Response(200, NotifyV1Credential{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateCredential method not implemented")
}
