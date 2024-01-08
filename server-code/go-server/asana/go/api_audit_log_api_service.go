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
	"time"
)

// AuditLogAPIAPIService is a service that implements the logic for the AuditLogAPIAPIServicer
// This service should implement the business logic for every endpoint for the AuditLogAPIAPI API.
// Include any external packages or services that will be required by this service.
type AuditLogAPIAPIService struct {
}

// NewAuditLogAPIAPIService creates a default api service
func NewAuditLogAPIAPIService() AuditLogAPIAPIServicer {
	return &AuditLogAPIAPIService{}
}

// GetAuditLogEvents - Get audit log events
func (s *AuditLogAPIAPIService) GetAuditLogEvents(ctx context.Context, workspaceGid string, startAt time.Time, endAt time.Time, eventType string, actorType string, actorGid string, resourceGid string, limit int32, offset string) (ImplResponse, error) {
	// TODO - update GetAuditLogEvents with the required logic for this service method.
	// Add api_audit_log_api_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetAuditLogEvents200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetAuditLogEvents200Response{}), nil

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetAuditLogEvents method not implemented")
}