/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * API version: 1.0
 * Contact: nishu@mediumapi.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// SearchAPIService is a service that implements the logic for the SearchAPIServicer
// This service should implement the business logic for every endpoint for the SearchAPI API.
// Include any external packages or services that will be required by this service.
type SearchAPIService struct {
}

// NewSearchAPIService creates a default api service
func NewSearchAPIService() SearchAPIServicer {
	return &SearchAPIService{}
}

// SearchArticlesqueryqueryGet - Search Articles
func (s *SearchAPIService) SearchArticlesqueryqueryGet(ctx context.Context, query string) (ImplResponse, error) {
	// TODO - update SearchArticlesqueryqueryGet with the required logic for this service method.
	// Add api_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SearchArticlesQueryQueryGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, SearchArticlesQueryQueryGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SearchArticlesqueryqueryGet method not implemented")
}

// SearchListsqueryqueryGet - Search Lists
func (s *SearchAPIService) SearchListsqueryqueryGet(ctx context.Context, query string) (ImplResponse, error) {
	// TODO - update SearchListsqueryqueryGet with the required logic for this service method.
	// Add api_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SearchListsQueryQueryGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, SearchListsQueryQueryGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SearchListsqueryqueryGet method not implemented")
}

// SearchPublicationsqueryqueryGet - Search Publications
func (s *SearchAPIService) SearchPublicationsqueryqueryGet(ctx context.Context, query string) (ImplResponse, error) {
	// TODO - update SearchPublicationsqueryqueryGet with the required logic for this service method.
	// Add api_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SearchPublicationsQueryQueryGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, SearchPublicationsQueryQueryGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SearchPublicationsqueryqueryGet method not implemented")
}

// SearchTagsqueryqueryGet - Search Tags
func (s *SearchAPIService) SearchTagsqueryqueryGet(ctx context.Context, query string) (ImplResponse, error) {
	// TODO - update SearchTagsqueryqueryGet with the required logic for this service method.
	// Add api_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SearchTagsQueryQueryGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, SearchTagsQueryQueryGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SearchTagsqueryqueryGet method not implemented")
}

// SearchUsersqueryqueryGet - Search Users
func (s *SearchAPIService) SearchUsersqueryqueryGet(ctx context.Context, query string) (ImplResponse, error) {
	// TODO - update SearchUsersqueryqueryGet with the required logic for this service method.
	// Add api_search_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, SearchUsersQueryQueryGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, SearchUsersQueryQueryGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SearchUsersqueryqueryGet method not implemented")
}
