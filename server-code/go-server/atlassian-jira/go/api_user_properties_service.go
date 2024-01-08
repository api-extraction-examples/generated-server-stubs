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

// UserPropertiesAPIService is a service that implements the logic for the UserPropertiesAPIServicer
// This service should implement the business logic for every endpoint for the UserPropertiesAPI API.
// Include any external packages or services that will be required by this service.
type UserPropertiesAPIService struct {
}

// NewUserPropertiesAPIService creates a default api service
func NewUserPropertiesAPIService() UserPropertiesAPIServicer {
	return &UserPropertiesAPIService{}
}

// DeleteUserProperty - Delete user property
func (s *UserPropertiesAPIService) DeleteUserProperty(ctx context.Context, propertyKey string, accountId string, userKey string, username string) (ImplResponse, error) {
	// TODO - update DeleteUserProperty with the required logic for this service method.
	// Add api_user_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteUserProperty method not implemented")
}

// GetUserProperty - Get user property
func (s *UserPropertiesAPIService) GetUserProperty(ctx context.Context, propertyKey string, accountId string, userKey string, username string) (ImplResponse, error) {
	// TODO - update GetUserProperty with the required logic for this service method.
	// Add api_user_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, EntityProperty{}) or use other options such as http.Ok ...
	// return Response(200, EntityProperty{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUserProperty method not implemented")
}

// GetUserPropertyKeys - Get user property keys
func (s *UserPropertiesAPIService) GetUserPropertyKeys(ctx context.Context, accountId string, userKey string, username string) (ImplResponse, error) {
	// TODO - update GetUserPropertyKeys with the required logic for this service method.
	// Add api_user_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PropertyKeys{}) or use other options such as http.Ok ...
	// return Response(200, PropertyKeys{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetUserPropertyKeys method not implemented")
}

// SetUserProperty - Set user property
func (s *UserPropertiesAPIService) SetUserProperty(ctx context.Context, propertyKey string, body *interface{}, accountId string, userKey string, username string) (ImplResponse, error) {
	// TODO - update SetUserProperty with the required logic for this service method.
	// Add api_user_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, interface{}{}) or use other options such as http.Ok ...
	// return Response(200, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(201, interface{}{}) or use other options such as http.Ok ...
	// return Response(201, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(405, {}) or use other options such as http.Ok ...
	// return Response(405, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetUserProperty method not implemented")
}
