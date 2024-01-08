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

// IssueCommentPropertiesAPIService is a service that implements the logic for the IssueCommentPropertiesAPIServicer
// This service should implement the business logic for every endpoint for the IssueCommentPropertiesAPI API.
// Include any external packages or services that will be required by this service.
type IssueCommentPropertiesAPIService struct {
}

// NewIssueCommentPropertiesAPIService creates a default api service
func NewIssueCommentPropertiesAPIService() IssueCommentPropertiesAPIServicer {
	return &IssueCommentPropertiesAPIService{}
}

// DeleteCommentProperty - Delete comment property
func (s *IssueCommentPropertiesAPIService) DeleteCommentProperty(ctx context.Context, commentId string, propertyKey string) (ImplResponse, error) {
	// TODO - update DeleteCommentProperty with the required logic for this service method.
	// Add api_issue_comment_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteCommentProperty method not implemented")
}

// GetCommentProperty - Get comment property
func (s *IssueCommentPropertiesAPIService) GetCommentProperty(ctx context.Context, commentId string, propertyKey string) (ImplResponse, error) {
	// TODO - update GetCommentProperty with the required logic for this service method.
	// Add api_issue_comment_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetCommentProperty method not implemented")
}

// GetCommentPropertyKeys - Get comment property keys
func (s *IssueCommentPropertiesAPIService) GetCommentPropertyKeys(ctx context.Context, commentId string) (ImplResponse, error) {
	// TODO - update GetCommentPropertyKeys with the required logic for this service method.
	// Add api_issue_comment_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("GetCommentPropertyKeys method not implemented")
}

// SetCommentProperty - Set comment property
func (s *IssueCommentPropertiesAPIService) SetCommentProperty(ctx context.Context, commentId string, propertyKey string, body *interface{}) (ImplResponse, error) {
	// TODO - update SetCommentProperty with the required logic for this service method.
	// Add api_issue_comment_properties_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("SetCommentProperty method not implemented")
}
