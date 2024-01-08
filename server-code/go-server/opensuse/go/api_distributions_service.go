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

// DistributionsAPIService is a service that implements the logic for the DistributionsAPIServicer
// This service should implement the business logic for every endpoint for the DistributionsAPI API.
// Include any external packages or services that will be required by this service.
type DistributionsAPIService struct {
}

// NewDistributionsAPIService creates a default api service
func NewDistributionsAPIService() DistributionsAPIServicer {
	return &DistributionsAPIService{}
}

// DistributionsBulkReplacePut - Bulk replace all distributions.
func (s *DistributionsAPIService) DistributionsBulkReplacePut(ctx context.Context, body Object) (ImplResponse, error) {
	// TODO - update DistributionsBulkReplacePut with the required logic for this service method.
	// Add api_distributions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Object{}) or use other options such as http.Ok ...
	// return Response(200, Object{}), nil

	// TODO: Uncomment the next line to return response Response(400, Object{}) or use other options such as http.Ok ...
	// return Response(400, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DistributionsBulkReplacePut method not implemented")
}

// DistributionsDistributionIdDelete - Delete a distribution.
func (s *DistributionsAPIService) DistributionsDistributionIdDelete(ctx context.Context) (ImplResponse, error) {
	// TODO - update DistributionsDistributionIdDelete with the required logic for this service method.
	// Add api_distributions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Object{}) or use other options such as http.Ok ...
	// return Response(200, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DistributionsDistributionIdDelete method not implemented")
}

// DistributionsDistributionIdGet - Show a distribution.
func (s *DistributionsAPIService) DistributionsDistributionIdGet(ctx context.Context, distributionId int32) (ImplResponse, error) {
	// TODO - update DistributionsDistributionIdGet with the required logic for this service method.
	// Add api_distributions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Object{}) or use other options such as http.Ok ...
	// return Response(200, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DistributionsDistributionIdGet method not implemented")
}

// DistributionsDistributionIdPut - Update a distribution.
func (s *DistributionsAPIService) DistributionsDistributionIdPut(ctx context.Context, body Object) (ImplResponse, error) {
	// TODO - update DistributionsDistributionIdPut with the required logic for this service method.
	// Add api_distributions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DistributionsDistributionIdPut method not implemented")
}

// DistributionsGet - List all distributions.
func (s *DistributionsAPIService) DistributionsGet(ctx context.Context) (ImplResponse, error) {
	// TODO - update DistributionsGet with the required logic for this service method.
	// Add api_distributions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DistributionsGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, DistributionsGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DistributionsGet method not implemented")
}

// DistributionsIncludeRemotesGet - List all distributions including remote.
func (s *DistributionsAPIService) DistributionsIncludeRemotesGet(ctx context.Context) (ImplResponse, error) {
	// TODO - update DistributionsIncludeRemotesGet with the required logic for this service method.
	// Add api_distributions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DistributionsIncludeRemotesGet method not implemented")
}

// DistributionsPost - Create a distribution.
func (s *DistributionsAPIService) DistributionsPost(ctx context.Context, distributionsPostRequest DistributionsPostRequest) (ImplResponse, error) {
	// TODO - update DistributionsPost with the required logic for this service method.
	// Add api_distributions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Object{}) or use other options such as http.Ok ...
	// return Response(200, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("DistributionsPost method not implemented")
}