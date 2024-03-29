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

// PublicationAPIService is a service that implements the logic for the PublicationAPIServicer
// This service should implement the business logic for every endpoint for the PublicationAPI API.
// Include any external packages or services that will be required by this service.
type PublicationAPIService struct {
}

// NewPublicationAPIService creates a default api service
func NewPublicationAPIService() PublicationAPIServicer {
	return &PublicationAPIService{}
}

// PublicationIdForPublicationSlugGet - Get Publication ID
func (s *PublicationAPIService) PublicationIdForPublicationSlugGet(ctx context.Context, publicationSlug string) (ImplResponse, error) {
	// TODO - update PublicationIdForPublicationSlugGet with the required logic for this service method.
	// Add api_publication_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PublicationIdForPublicationSlugGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, PublicationIdForPublicationSlugGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PublicationIdForPublicationSlugGet method not implemented")
}

// PublicationPublicationIdArticlesGet - Get Publication Articles
func (s *PublicationAPIService) PublicationPublicationIdArticlesGet(ctx context.Context, publicationId string, from string) (ImplResponse, error) {
	// TODO - update PublicationPublicationIdArticlesGet with the required logic for this service method.
	// Add api_publication_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PublicationPublicationIdArticlesGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, PublicationPublicationIdArticlesGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PublicationPublicationIdArticlesGet method not implemented")
}

// PublicationPublicationIdGet - Get Publication Info
func (s *PublicationAPIService) PublicationPublicationIdGet(ctx context.Context, publicationId string) (ImplResponse, error) {
	// TODO - update PublicationPublicationIdGet with the required logic for this service method.
	// Add api_publication_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PublicationPublicationIdGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, PublicationPublicationIdGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PublicationPublicationIdGet method not implemented")
}

// PublicationPublicationIdNewsletterGet - Get Publication Newsletter
func (s *PublicationAPIService) PublicationPublicationIdNewsletterGet(ctx context.Context, publicationId string) (ImplResponse, error) {
	// TODO - update PublicationPublicationIdNewsletterGet with the required logic for this service method.
	// Add api_publication_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PublicationPublicationIdNewsletterGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, PublicationPublicationIdNewsletterGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PublicationPublicationIdNewsletterGet method not implemented")
}
