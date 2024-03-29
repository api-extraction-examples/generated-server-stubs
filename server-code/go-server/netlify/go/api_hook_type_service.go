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

// HookTypeAPIService is a service that implements the logic for the HookTypeAPIServicer
// This service should implement the business logic for every endpoint for the HookTypeAPI API.
// Include any external packages or services that will be required by this service.
type HookTypeAPIService struct {
}

// NewHookTypeAPIService creates a default api service
func NewHookTypeAPIService() HookTypeAPIServicer {
	return &HookTypeAPIService{}
}

// ListHookTypes - 
func (s *HookTypeAPIService) ListHookTypes(ctx context.Context) (ImplResponse, error) {
	// TODO - update ListHookTypes with the required logic for this service method.
	// Add api_hook_type_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []HookType{}) or use other options such as http.Ok ...
	// return Response(200, []HookType{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListHookTypes method not implemented")
}
