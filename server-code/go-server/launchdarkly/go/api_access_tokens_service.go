/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// AccessTokensAPIService is a service that implements the logic for the AccessTokensAPIServicer
// This service should implement the business logic for every endpoint for the AccessTokensAPI API.
// Include any external packages or services that will be required by this service.
type AccessTokensAPIService struct {
}

// NewAccessTokensAPIService creates a default api service
func NewAccessTokensAPIService() AccessTokensAPIServicer {
	return &AccessTokensAPIService{}
}

// DeleteToken - Delete an access token by ID.
func (s *AccessTokensAPIService) DeleteToken(ctx context.Context, tokenId string) (ImplResponse, error) {
	// TODO - update DeleteToken with the required logic for this service method.
	// Add api_access_tokens_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteToken method not implemented")
}

// GetToken - Get a single access token by ID.
func (s *AccessTokensAPIService) GetToken(ctx context.Context, tokenId string) (ImplResponse, error) {
	// TODO - update GetToken with the required logic for this service method.
	// Add api_access_tokens_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Token{}) or use other options such as http.Ok ...
	// return Response(200, Token{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetToken method not implemented")
}

// GetTokens - Returns a list of tokens in the account.
func (s *AccessTokensAPIService) GetTokens(ctx context.Context, showAll bool) (ImplResponse, error) {
	// TODO - update GetTokens with the required logic for this service method.
	// Add api_access_tokens_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Tokens{}) or use other options such as http.Ok ...
	// return Response(200, Tokens{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetTokens method not implemented")
}

// PatchToken - Modify an access token by ID.
func (s *AccessTokensAPIService) PatchToken(ctx context.Context, tokenId string, patchDelta []PatchOperation) (ImplResponse, error) {
	// TODO - update PatchToken with the required logic for this service method.
	// Add api_access_tokens_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Token{}) or use other options such as http.Ok ...
	// return Response(200, Token{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PatchToken method not implemented")
}

// PostToken - Create a new token.
func (s *AccessTokensAPIService) PostToken(ctx context.Context, tokenBody PostTokenRequest) (ImplResponse, error) {
	// TODO - update PostToken with the required logic for this service method.
	// Add api_access_tokens_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, Token{}) or use other options such as http.Ok ...
	// return Response(201, Token{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostToken method not implemented")
}

// ResetToken - Reset an access token&#39;s secret key with an optional expiry time for the old key.
func (s *AccessTokensAPIService) ResetToken(ctx context.Context, tokenId string, expiry int64) (ImplResponse, error) {
	// TODO - update ResetToken with the required logic for this service method.
	// Add api_access_tokens_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Token{}) or use other options such as http.Ok ...
	// return Response(200, Token{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ResetToken method not implemented")
}
