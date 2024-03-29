/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// SnippetAPIService is a service that implements the logic for the SnippetAPIServicer
// This service should implement the business logic for every endpoint for the SnippetAPI API.
// Include any external packages or services that will be required by this service.
type SnippetAPIService struct {
}

// NewSnippetAPIService creates a default api service
func NewSnippetAPIService() SnippetAPIServicer {
	return &SnippetAPIService{}
}

// CreateSiteSnippet - 
func (s *SnippetAPIService) CreateSiteSnippet(ctx context.Context, siteId string, snippet Snippet) (ImplResponse, error) {
	// TODO - update CreateSiteSnippet with the required logic for this service method.
	// Add api_snippet_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, Snippet{}) or use other options such as http.Ok ...
	// return Response(201, Snippet{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateSiteSnippet method not implemented")
}

// DeleteSiteSnippet - 
func (s *SnippetAPIService) DeleteSiteSnippet(ctx context.Context, siteId string, snippetId string) (ImplResponse, error) {
	// TODO - update DeleteSiteSnippet with the required logic for this service method.
	// Add api_snippet_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteSiteSnippet method not implemented")
}

// GetSiteSnippet - 
func (s *SnippetAPIService) GetSiteSnippet(ctx context.Context, siteId string, snippetId string) (ImplResponse, error) {
	// TODO - update GetSiteSnippet with the required logic for this service method.
	// Add api_snippet_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Snippet{}) or use other options such as http.Ok ...
	// return Response(200, Snippet{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSiteSnippet method not implemented")
}

// ListSiteSnippets - 
func (s *SnippetAPIService) ListSiteSnippets(ctx context.Context, siteId string) (ImplResponse, error) {
	// TODO - update ListSiteSnippets with the required logic for this service method.
	// Add api_snippet_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Snippet{}) or use other options such as http.Ok ...
	// return Response(200, []Snippet{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListSiteSnippets method not implemented")
}

// UpdateSiteSnippet - 
func (s *SnippetAPIService) UpdateSiteSnippet(ctx context.Context, siteId string, snippetId string, snippet Snippet) (ImplResponse, error) {
	// TODO - update UpdateSiteSnippet with the required logic for this service method.
	// Add api_snippet_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateSiteSnippet method not implemented")
}
