/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// GeneralInformationAPIService is a service that implements the logic for the GeneralInformationAPIServicer
// This service should implement the business logic for every endpoint for the GeneralInformationAPI API.
// Include any external packages or services that will be required by this service.
type GeneralInformationAPIService struct {
}

// NewGeneralInformationAPIService creates a default api service
func NewGeneralInformationAPIService() GeneralInformationAPIServicer {
	return &GeneralInformationAPIService{}
}

// AboutGet - Get information about API.
func (s *GeneralInformationAPIService) AboutGet(ctx context.Context) (ImplResponse, error) {
	// TODO - update AboutGet with the required logic for this service method.
	// Add api_general_information_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AboutGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, AboutGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AboutGet method not implemented")
}

// ArchitecturesArchitectureNameGet - Show one architecture.
func (s *GeneralInformationAPIService) ArchitecturesArchitectureNameGet(ctx context.Context, architectureName string) (ImplResponse, error) {
	// TODO - update ArchitecturesArchitectureNameGet with the required logic for this service method.
	// Add api_general_information_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ArchitecturesArchitectureNameGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, ArchitecturesArchitectureNameGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ArchitecturesArchitectureNameGet method not implemented")
}

// ArchitecturesGet - List all known architectures.
func (s *GeneralInformationAPIService) ArchitecturesGet(ctx context.Context) (ImplResponse, error) {
	// TODO - update ArchitecturesGet with the required logic for this service method.
	// Add api_general_information_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ArchitecturesGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, ArchitecturesGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(401, ArchitecturesGet401Response{}) or use other options such as http.Ok ...
	// return Response(401, ArchitecturesGet401Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ArchitecturesGet method not implemented")
}
