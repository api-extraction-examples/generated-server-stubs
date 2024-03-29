/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// AppsAPIService is a service that implements the logic for the AppsAPIServicer
// This service should implement the business logic for every endpoint for the AppsAPI API.
// Include any external packages or services that will be required by this service.
type AppsAPIService struct {
}

// NewAppsAPIService creates a default api service
func NewAppsAPIService() AppsAPIServicer {
	return &AppsAPIService{}
}

// ApiV1AppsPost - 
func (s *AppsAPIService) ApiV1AppsPost(ctx context.Context, apiV1AppsPostRequest ApiV1AppsPostRequest) (ImplResponse, error) {
	// TODO - update ApiV1AppsPost with the required logic for this service method.
	// Add api_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ApiV1AppsPost200Response{}) or use other options such as http.Ok ...
	// return Response(200, ApiV1AppsPost200Response{}), nil

	// TODO: Uncomment the next line to return response Response(422, Error{}) or use other options such as http.Ok ...
	// return Response(422, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AppsPost method not implemented")
}

// ApiV1AppsVerifyCredentialsGet - 
func (s *AppsAPIService) ApiV1AppsVerifyCredentialsGet(ctx context.Context) (ImplResponse, error) {
	// TODO - update ApiV1AppsVerifyCredentialsGet with the required logic for this service method.
	// Add api_apps_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Application{}) or use other options such as http.Ok ...
	// return Response(200, Application{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1AppsVerifyCredentialsGet method not implemented")
}
