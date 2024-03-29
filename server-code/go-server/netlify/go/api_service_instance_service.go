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

// ServiceInstanceAPIService is a service that implements the logic for the ServiceInstanceAPIServicer
// This service should implement the business logic for every endpoint for the ServiceInstanceAPI API.
// Include any external packages or services that will be required by this service.
type ServiceInstanceAPIService struct {
}

// NewServiceInstanceAPIService creates a default api service
func NewServiceInstanceAPIService() ServiceInstanceAPIServicer {
	return &ServiceInstanceAPIService{}
}

// CreateServiceInstance - 
func (s *ServiceInstanceAPIService) CreateServiceInstance(ctx context.Context, siteId string, addon string, config map[string]interface{}) (ImplResponse, error) {
	// TODO - update CreateServiceInstance with the required logic for this service method.
	// Add api_service_instance_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, ServiceInstance{}) or use other options such as http.Ok ...
	// return Response(201, ServiceInstance{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateServiceInstance method not implemented")
}

// DeleteServiceInstance - 
func (s *ServiceInstanceAPIService) DeleteServiceInstance(ctx context.Context, siteId string, addon string, instanceId string) (ImplResponse, error) {
	// TODO - update DeleteServiceInstance with the required logic for this service method.
	// Add api_service_instance_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteServiceInstance method not implemented")
}

// ListServiceInstancesForSite - 
func (s *ServiceInstanceAPIService) ListServiceInstancesForSite(ctx context.Context, siteId string) (ImplResponse, error) {
	// TODO - update ListServiceInstancesForSite with the required logic for this service method.
	// Add api_service_instance_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ServiceInstance{}) or use other options such as http.Ok ...
	// return Response(200, []ServiceInstance{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListServiceInstancesForSite method not implemented")
}

// ShowServiceInstance - 
func (s *ServiceInstanceAPIService) ShowServiceInstance(ctx context.Context, siteId string, addon string, instanceId string) (ImplResponse, error) {
	// TODO - update ShowServiceInstance with the required logic for this service method.
	// Add api_service_instance_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ServiceInstance{}) or use other options such as http.Ok ...
	// return Response(200, ServiceInstance{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ShowServiceInstance method not implemented")
}

// UpdateServiceInstance - 
func (s *ServiceInstanceAPIService) UpdateServiceInstance(ctx context.Context, siteId string, addon string, instanceId string, config map[string]interface{}) (ImplResponse, error) {
	// TODO - update UpdateServiceInstance with the required logic for this service method.
	// Add api_service_instance_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateServiceInstance method not implemented")
}
