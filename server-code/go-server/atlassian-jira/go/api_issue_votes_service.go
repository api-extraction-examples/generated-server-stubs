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

// IssueVotesAPIService is a service that implements the logic for the IssueVotesAPIServicer
// This service should implement the business logic for every endpoint for the IssueVotesAPI API.
// Include any external packages or services that will be required by this service.
type IssueVotesAPIService struct {
}

// NewIssueVotesAPIService creates a default api service
func NewIssueVotesAPIService() IssueVotesAPIServicer {
	return &IssueVotesAPIService{}
}

// AddVote - Add vote
func (s *IssueVotesAPIService) AddVote(ctx context.Context, issueIdOrKey string) (ImplResponse, error) {
	// TODO - update AddVote with the required logic for this service method.
	// Add api_issue_votes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, interface{}{}) or use other options such as http.Ok ...
	// return Response(204, interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddVote method not implemented")
}

// GetVotes - Get votes
func (s *IssueVotesAPIService) GetVotes(ctx context.Context, issueIdOrKey string) (ImplResponse, error) {
	// TODO - update GetVotes with the required logic for this service method.
	// Add api_issue_votes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Votes{}) or use other options such as http.Ok ...
	// return Response(200, Votes{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetVotes method not implemented")
}

// RemoveVote - Delete vote
func (s *IssueVotesAPIService) RemoveVote(ctx context.Context, issueIdOrKey string) (ImplResponse, error) {
	// TODO - update RemoveVote with the required logic for this service method.
	// Add api_issue_votes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveVote method not implemented")
}