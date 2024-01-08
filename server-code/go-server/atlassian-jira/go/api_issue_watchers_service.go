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

// IssueWatchersAPIService is a service that implements the logic for the IssueWatchersAPIServicer
// This service should implement the business logic for every endpoint for the IssueWatchersAPI API.
// Include any external packages or services that will be required by this service.
type IssueWatchersAPIService struct {
}

// NewIssueWatchersAPIService creates a default api service
func NewIssueWatchersAPIService() IssueWatchersAPIServicer {
	return &IssueWatchersAPIService{}
}

// AddWatcher - Add watcher
func (s *IssueWatchersAPIService) AddWatcher(ctx context.Context, issueIdOrKey string, body string) (ImplResponse, error) {
	// TODO - update AddWatcher with the required logic for this service method.
	// Add api_issue_watchers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("AddWatcher method not implemented")
}

// GetIsWatchingIssueBulk - Get is watching issue bulk
func (s *IssueWatchersAPIService) GetIsWatchingIssueBulk(ctx context.Context, issueList IssueList) (ImplResponse, error) {
	// TODO - update GetIsWatchingIssueBulk with the required logic for this service method.
	// Add api_issue_watchers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BulkIssueIsWatching{}) or use other options such as http.Ok ...
	// return Response(200, BulkIssueIsWatching{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetIsWatchingIssueBulk method not implemented")
}

// GetIssueWatchers - Get issue watchers
func (s *IssueWatchersAPIService) GetIssueWatchers(ctx context.Context, issueIdOrKey string) (ImplResponse, error) {
	// TODO - update GetIssueWatchers with the required logic for this service method.
	// Add api_issue_watchers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Watchers{}) or use other options such as http.Ok ...
	// return Response(200, Watchers{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetIssueWatchers method not implemented")
}

// RemoveWatcher - Delete watcher
func (s *IssueWatchersAPIService) RemoveWatcher(ctx context.Context, issueIdOrKey string, username string, accountId string) (ImplResponse, error) {
	// TODO - update RemoveWatcher with the required logic for this service method.
	// Add api_issue_watchers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveWatcher method not implemented")
}