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

// OauthAPIService is a service that implements the logic for the OauthAPIServicer
// This service should implement the business logic for every endpoint for the OauthAPI API.
// Include any external packages or services that will be required by this service.
type OauthAPIService struct {
}

// NewOauthAPIService creates a default api service
func NewOauthAPIService() OauthAPIServicer {
	return &OauthAPIService{}
}

// OauthAuthorizeGet - 
func (s *OauthAPIService) OauthAuthorizeGet(ctx context.Context, responseType string, clientId string, redirectUri string, scope string, forceLogin bool) (ImplResponse, error) {
	// TODO - update OauthAuthorizeGet with the required logic for this service method.
	// Add api_oauth_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("OauthAuthorizeGet method not implemented")
}

// OauthRevokePost - 
func (s *OauthAPIService) OauthRevokePost(ctx context.Context, oauthRevokePostRequest OauthRevokePostRequest) (ImplResponse, error) {
	// TODO - update OauthRevokePost with the required logic for this service method.
	// Add api_oauth_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(403, Error{}) or use other options such as http.Ok ...
	// return Response(403, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("OauthRevokePost method not implemented")
}

// OauthTokenPost - 
func (s *OauthAPIService) OauthTokenPost(ctx context.Context, oauthTokenPostRequest OauthTokenPostRequest) (ImplResponse, error) {
	// TODO - update OauthTokenPost with the required logic for this service method.
	// Add api_oauth_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, OauthTokenPost200Response{}) or use other options such as http.Ok ...
	// return Response(200, OauthTokenPost200Response{}), nil

	// TODO: Uncomment the next line to return response Response(400, Error{}) or use other options such as http.Ok ...
	// return Response(400, Error{}), nil

	// TODO: Uncomment the next line to return response Response(401, Error{}) or use other options such as http.Ok ...
	// return Response(401, Error{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("OauthTokenPost method not implemented")
}
