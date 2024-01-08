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
	"reflect"
)

// UserSearchAPIService is a service that implements the logic for the UserSearchAPIServicer
// This service should implement the business logic for every endpoint for the UserSearchAPI API.
// Include any external packages or services that will be required by this service.
type UserSearchAPIService struct {
}

// NewUserSearchAPIService creates a default api service
func NewUserSearchAPIService() UserSearchAPIServicer {
	return &UserSearchAPIService{}
}

// FindAssignableUsers - Find users assignable to issues
func (s *UserSearchAPIService) FindAssignableUsers(ctx context.Context, query string, sessionId string, username string, accountId string, project string, issueKey string, startAt int32, maxResults int32, actionDescriptorId int32, recommend bool) (ImplResponse, error) {
	// TODO - update FindAssignableUsers with the required logic for this service method.
	// Add api_user_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []User{}) or use other options such as http.Ok ...
	// return Response(200, []User{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(429, {}) or use other options such as http.Ok ...
	// return Response(429, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FindAssignableUsers method not implemented")
}

// FindBulkAssignableUsers - Find users assignable to projects
func (s *UserSearchAPIService) FindBulkAssignableUsers(ctx context.Context, projectKeys string, query string, username string, accountId string, startAt int32, maxResults int32) (ImplResponse, error) {
	// TODO - update FindBulkAssignableUsers with the required logic for this service method.
	// Add api_user_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []User{}) or use other options such as http.Ok ...
	// return Response(200, []User{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(429, {}) or use other options such as http.Ok ...
	// return Response(429, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FindBulkAssignableUsers method not implemented")
}

// FindUserKeysByQuery - Find user keys by query
func (s *UserSearchAPIService) FindUserKeysByQuery(ctx context.Context, query string, startAt int64, maxResults int32) (ImplResponse, error) {
	// TODO - update FindUserKeysByQuery with the required logic for this service method.
	// Add api_user_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanUserKey{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanUserKey{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(408, {}) or use other options such as http.Ok ...
	// return Response(408, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FindUserKeysByQuery method not implemented")
}

// FindUsers - Find users
func (s *UserSearchAPIService) FindUsers(ctx context.Context, query string, username string, accountId string, startAt int32, maxResults int32, property string) (ImplResponse, error) {
	// TODO - update FindUsers with the required logic for this service method.
	// Add api_user_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []User{}) or use other options such as http.Ok ...
	// return Response(200, []User{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(429, {}) or use other options such as http.Ok ...
	// return Response(429, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FindUsers method not implemented")
}

// FindUsersByQuery - Find users by query
func (s *UserSearchAPIService) FindUsersByQuery(ctx context.Context, query string, startAt int64, maxResults int32) (ImplResponse, error) {
	// TODO - update FindUsersByQuery with the required logic for this service method.
	// Add api_user_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PageBeanUser{}) or use other options such as http.Ok ...
	// return Response(200, PageBeanUser{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(408, {}) or use other options such as http.Ok ...
	// return Response(408, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FindUsersByQuery method not implemented")
}

// FindUsersForPicker - Find users for picker
func (s *UserSearchAPIService) FindUsersForPicker(ctx context.Context, query string, maxResults int32, showAvatar bool, exclude []string, excludeAccountIds []string, avatarSize string, excludeConnectUsers bool) (ImplResponse, error) {
	// TODO - update FindUsersForPicker with the required logic for this service method.
	// Add api_user_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, FoundUsers{}) or use other options such as http.Ok ...
	// return Response(200, FoundUsers{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(429, {}) or use other options such as http.Ok ...
	// return Response(429, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FindUsersForPicker method not implemented")
}

// FindUsersWithAllPermissions - Find users with permissions
func (s *UserSearchAPIService) FindUsersWithAllPermissions(ctx context.Context, permissions string, query string, username string, accountId string, issueKey string, projectKey string, startAt int32, maxResults int32) (ImplResponse, error) {
	// TODO - update FindUsersWithAllPermissions with the required logic for this service method.
	// Add api_user_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []User{}) or use other options such as http.Ok ...
	// return Response(200, []User{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(429, {}) or use other options such as http.Ok ...
	// return Response(429, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FindUsersWithAllPermissions method not implemented")
}

// FindUsersWithBrowsePermission - Find users with browse permission
func (s *UserSearchAPIService) FindUsersWithBrowsePermission(ctx context.Context, query string, username string, accountId string, issueKey string, projectKey string, startAt int32, maxResults int32) (ImplResponse, error) {
	// TODO - update FindUsersWithBrowsePermission with the required logic for this service method.
	// Add api_user_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []User{}) or use other options such as http.Ok ...
	// return Response(200, []User{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(429, {}) or use other options such as http.Ok ...
	// return Response(429, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("FindUsersWithBrowsePermission method not implemented")
}