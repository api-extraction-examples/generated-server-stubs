/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// UIModificationsAppsAPIService is a service that implements the logic for the UIModificationsAppsAPIServicer
// This service should implement the business logic for every endpoint for the UIModificationsAppsAPI API.
// Include any external packages or services that will be required by this service.
type UIModificationsAppsAPIService struct {
}

// NewUIModificationsAppsAPIService creates a default api service
func NewUIModificationsAppsAPIService() UIModificationsAppsAPIServicer {
	return &UIModificationsAppsAPIService{}
}

// CreateUiModification - Create UI modification
func (s *UIModificationsAppsAPIService) CreateUiModification(ctx context.Context, createUiModificationDetails CreateUiModificationDetails) (ImplResponse, error) {
	// TODO - update CreateUiModification with the required logic for this service method.
	// Add api_ui_modifications_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, UiModificationIdentifiers{}) or use other options such as http.Ok ...
	// return Response(201, UiModificationIdentifiers{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateUiModification method not implemented")
}

// DeleteUiModification - Delete UI modification
func (s *UIModificationsAppsAPIService) DeleteUiModification(ctx context.Context, uiModificationId string) (ImplResponse, error) {
	// TODO - update DeleteUiModification with the required logic for this service method.
	// Add api_ui_modifications_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, interface{}{}) or use other options such as http.Ok ...
	// return Response(204, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteUiModification method not implemented")
}

// GetUiModifications - Get UI modifications
func (s *UIModificationsAppsAPIService) GetUiModifications(ctx context.Context, startAt int64, maxResults int32, expand string) (ImplResponse, error) {
	// TODO - update GetUiModifications with the required logic for this service method.
	// Add api_ui_modifications_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanUiModificationDetails{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanUiModificationDetails{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUiModifications method not implemented")
}

// UpdateUiModification - Update UI modification
func (s *UIModificationsAppsAPIService) UpdateUiModification(ctx context.Context, uiModificationId string, updateUiModificationDetails UpdateUiModificationDetails) (ImplResponse, error) {
	// TODO - update UpdateUiModification with the required logic for this service method.
	// Add api_ui_modifications_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, interface{}{}) or use other options such as http.Ok ...
	// return Response(204, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateUiModification method not implemented")
}
