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

// RequestAPIService is a service that implements the logic for the RequestAPIServicer
// This service should implement the business logic for every endpoint for the RequestAPI API.
// Include any external packages or services that will be required by this service.
type RequestAPIService struct {
}

// NewRequestAPIService creates a default api service
func NewRequestAPIService() RequestAPIServicer {
	return &RequestAPIService{}
}

// RequestGet - Get a simple directory listing of all requests
func (s *RequestAPIService) RequestGet(ctx context.Context) (ImplResponse, error) {
	// TODO - update RequestGet with the required logic for this service method.
	// Add api_request_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Object{}) or use other options such as http.Ok ...
	// return Response(200, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("RequestGet method not implemented")
}

// RequestIdDelete - Delete a given request.
func (s *RequestAPIService) RequestIdDelete(ctx context.Context) (ImplResponse, error) {
	// TODO - update RequestIdDelete with the required logic for this service method.
	// Add api_request_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RequestIdDelete method not implemented")
}

// RequestIdGet - Show details about a specified request.
func (s *RequestAPIService) RequestIdGet(ctx context.Context, id int32) (ImplResponse, error) {
	// TODO - update RequestIdGet with the required logic for this service method.
	// Add api_request_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RequestIdGet method not implemented")
}

// RequestIdPost - Apply certain actions on a specified request.
func (s *RequestAPIService) RequestIdPost(ctx context.Context, cmd string, newstate string, priority string, byUser string, byGroup string, byProject string, byPackage string, incident string, time string, comment string) (ImplResponse, error) {
	// TODO - update RequestIdPost with the required logic for this service method.
	// Add api_request_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, Object{}) or use other options such as http.Ok ...
	// return Response(400, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RequestIdPost method not implemented")
}

// RequestIdPut - Modify a given request.
func (s *RequestAPIService) RequestIdPut(ctx context.Context, body Object) (ImplResponse, error) {
	// TODO - update RequestIdPut with the required logic for this service method.
	// Add api_request_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, Object{}) or use other options such as http.Ok ...
	// return Response(400, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RequestIdPut method not implemented")
}

// RequestIdcmddiffPost - Get the diff for all packages affected by the request.
func (s *RequestAPIService) RequestIdcmddiffPost(ctx context.Context, diffToSuperseded string, view string, withissues string) (ImplResponse, error) {
	// TODO - update RequestIdcmddiffPost with the required logic for this service method.
	// Add api_request_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, RequestIdCmdDiffPost200Response{}) or use other options such as http.Ok ...
	// return Response(200, RequestIdCmdDiffPost200Response{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RequestIdcmddiffPost method not implemented")
}

// RequestPost - Create a request
func (s *RequestAPIService) RequestPost(ctx context.Context, cmd string, requestPostRequest RequestPostRequest, addrevision string, ignoreDelegate string, ignoreBuildState string) (ImplResponse, error) {
	// TODO - update RequestPost with the required logic for this service method.
	// Add api_request_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Object{}) or use other options such as http.Ok ...
	// return Response(200, Object{}), nil

	// TODO: Uncomment the next line to return response Response(400, Object{}) or use other options such as http.Ok ...
	// return Response(400, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, Object{}) or use other options such as http.Ok ...
	// return Response(403, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RequestPost method not implemented")
}

// RequestviewcollectionGet - Get a collection of requests for a specified target
func (s *RequestAPIService) RequestviewcollectionGet(ctx context.Context, user string, project string, package_ string, states string, types string, roles string, withhistory string, withfullhistory string, limit int32, ids string) (ImplResponse, error) {
	// TODO - update RequestviewcollectionGet with the required logic for this service method.
	// Add api_request_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, RequestViewCollectionGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, RequestViewCollectionGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RequestviewcollectionGet method not implemented")
}