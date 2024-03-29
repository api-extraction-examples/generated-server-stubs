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

// SiteAPIService is a service that implements the logic for the SiteAPIServicer
// This service should implement the business logic for every endpoint for the SiteAPI API.
// Include any external packages or services that will be required by this service.
type SiteAPIService struct {
}

// NewSiteAPIService creates a default api service
func NewSiteAPIService() SiteAPIServicer {
	return &SiteAPIService{}
}

// CreateSite - 
func (s *SiteAPIService) CreateSite(ctx context.Context, site SiteSetup, configureDns bool) (ImplResponse, error) {
	// TODO - update CreateSite with the required logic for this service method.
	// Add api_site_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, Site{}) or use other options such as http.Ok ...
	// return Response(201, Site{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateSite method not implemented")
}

// CreateSiteInTeam - 
func (s *SiteAPIService) CreateSiteInTeam(ctx context.Context, accountSlug string, configureDns bool, site SiteSetup) (ImplResponse, error) {
	// TODO - update CreateSiteInTeam with the required logic for this service method.
	// Add api_site_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, Site{}) or use other options such as http.Ok ...
	// return Response(201, Site{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateSiteInTeam method not implemented")
}

// DeleteSite - 
func (s *SiteAPIService) DeleteSite(ctx context.Context, siteId string) (ImplResponse, error) {
	// TODO - update DeleteSite with the required logic for this service method.
	// Add api_site_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteSite method not implemented")
}

// GetSite - 
func (s *SiteAPIService) GetSite(ctx context.Context, siteId string) (ImplResponse, error) {
	// TODO - update GetSite with the required logic for this service method.
	// Add api_site_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Site{}) or use other options such as http.Ok ...
	// return Response(200, Site{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetSite method not implemented")
}

// ListSites - 
func (s *SiteAPIService) ListSites(ctx context.Context, name string, filter string, page int32, perPage int32) (ImplResponse, error) {
	// TODO - update ListSites with the required logic for this service method.
	// Add api_site_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Site{}) or use other options such as http.Ok ...
	// return Response(200, []Site{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListSites method not implemented")
}

// ListSitesForAccount - 
func (s *SiteAPIService) ListSitesForAccount(ctx context.Context, accountSlug string, name string, page int32, perPage int32) (ImplResponse, error) {
	// TODO - update ListSitesForAccount with the required logic for this service method.
	// Add api_site_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Site{}) or use other options such as http.Ok ...
	// return Response(200, []Site{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListSitesForAccount method not implemented")
}

// UnlinkSiteRepo - 
func (s *SiteAPIService) UnlinkSiteRepo(ctx context.Context, siteId string) (ImplResponse, error) {
	// TODO - update UnlinkSiteRepo with the required logic for this service method.
	// Add api_site_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Site{}) or use other options such as http.Ok ...
	// return Response(200, Site{}), nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UnlinkSiteRepo method not implemented")
}

// UpdateSite - 
func (s *SiteAPIService) UpdateSite(ctx context.Context, siteId string, site SiteSetup) (ImplResponse, error) {
	// TODO - update UpdateSite with the required logic for this service method.
	// Add api_site_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Site{}) or use other options such as http.Ok ...
	// return Response(200, Site{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateSite method not implemented")
}
