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

// EnvironmentVariablesAPIService is a service that implements the logic for the EnvironmentVariablesAPIServicer
// This service should implement the business logic for every endpoint for the EnvironmentVariablesAPI API.
// Include any external packages or services that will be required by this service.
type EnvironmentVariablesAPIService struct {
}

// NewEnvironmentVariablesAPIService creates a default api service
func NewEnvironmentVariablesAPIService() EnvironmentVariablesAPIServicer {
	return &EnvironmentVariablesAPIService{}
}

// CreateEnvVars - 
func (s *EnvironmentVariablesAPIService) CreateEnvVars(ctx context.Context, accountId string, siteId string, envVars []CreateEnvVarsRequestInner) (ImplResponse, error) {
	// TODO - update CreateEnvVars with the required logic for this service method.
	// Add api_environment_variables_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, []EnvVar{}) or use other options such as http.Ok ...
	// return Response(201, []EnvVar{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateEnvVars method not implemented")
}

// DeleteEnvVar - 
func (s *EnvironmentVariablesAPIService) DeleteEnvVar(ctx context.Context, accountId string, key string, siteId string) (ImplResponse, error) {
	// TODO - update DeleteEnvVar with the required logic for this service method.
	// Add api_environment_variables_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteEnvVar method not implemented")
}

// DeleteEnvVarValue - 
func (s *EnvironmentVariablesAPIService) DeleteEnvVarValue(ctx context.Context, accountId string, id string, key string, siteId string) (ImplResponse, error) {
	// TODO - update DeleteEnvVarValue with the required logic for this service method.
	// Add api_environment_variables_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteEnvVarValue method not implemented")
}

// GetEnvVar - 
func (s *EnvironmentVariablesAPIService) GetEnvVar(ctx context.Context, accountId string, key string, siteId string) (ImplResponse, error) {
	// TODO - update GetEnvVar with the required logic for this service method.
	// Add api_environment_variables_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, EnvVar{}) or use other options such as http.Ok ...
	// return Response(200, EnvVar{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetEnvVar method not implemented")
}

// GetEnvVars - 
func (s *EnvironmentVariablesAPIService) GetEnvVars(ctx context.Context, accountId string, contextName string, scope string, siteId string) (ImplResponse, error) {
	// TODO - update GetEnvVars with the required logic for this service method.
	// Add api_environment_variables_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []EnvVar{}) or use other options such as http.Ok ...
	// return Response(200, []EnvVar{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetEnvVars method not implemented")
}

// SetEnvVarValue - 
func (s *EnvironmentVariablesAPIService) SetEnvVarValue(ctx context.Context, accountId string, key string, siteId string, envVar SetEnvVarValueRequest) (ImplResponse, error) {
	// TODO - update SetEnvVarValue with the required logic for this service method.
	// Add api_environment_variables_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, EnvVar{}) or use other options such as http.Ok ...
	// return Response(201, EnvVar{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetEnvVarValue method not implemented")
}

// UpdateEnvVar - 
func (s *EnvironmentVariablesAPIService) UpdateEnvVar(ctx context.Context, accountId string, key string, siteId string, envVar CreateEnvVarsRequestInner) (ImplResponse, error) {
	// TODO - update UpdateEnvVar with the required logic for this service method.
	// Add api_environment_variables_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, EnvVar{}) or use other options such as http.Ok ...
	// return Response(200, EnvVar{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateEnvVar method not implemented")
}
