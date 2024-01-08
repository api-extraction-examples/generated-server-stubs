/*
 * httpbin.org
 *
 * A simple HTTP Request & Response Service.<br/> <br/> <b>Run locally: </b> <code>$ docker run -p 80:80 kennethreitz/httpbin</code>
 *
 * API version: 0.9.2
 * Contact: me@kennethreitz.org
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// StatusCodesAPIService is a service that implements the logic for the StatusCodesAPIServicer
// This service should implement the business logic for every endpoint for the StatusCodesAPI API.
// Include any external packages or services that will be required by this service.
type StatusCodesAPIService struct {
}

// NewStatusCodesAPIService creates a default api service
func NewStatusCodesAPIService() StatusCodesAPIServicer {
	return &StatusCodesAPIService{}
}

// StatusCodesDelete - Return status code or random status code if more than one are given
func (s *StatusCodesAPIService) StatusCodesDelete(ctx context.Context, codes string) (ImplResponse, error) {
	// TODO - update StatusCodesDelete with the required logic for this service method.
	// Add api_status_codes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(100, {}) or use other options such as http.Ok ...
	// return Response(100, nil),nil

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(300, {}) or use other options such as http.Ok ...
	// return Response(300, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("StatusCodesDelete method not implemented")
}

// StatusCodesGet - Return status code or random status code if more than one are given
func (s *StatusCodesAPIService) StatusCodesGet(ctx context.Context, codes string) (ImplResponse, error) {
	// TODO - update StatusCodesGet with the required logic for this service method.
	// Add api_status_codes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(100, {}) or use other options such as http.Ok ...
	// return Response(100, nil),nil

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(300, {}) or use other options such as http.Ok ...
	// return Response(300, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("StatusCodesGet method not implemented")
}

// StatusCodesPatch - Return status code or random status code if more than one are given
func (s *StatusCodesAPIService) StatusCodesPatch(ctx context.Context, codes string) (ImplResponse, error) {
	// TODO - update StatusCodesPatch with the required logic for this service method.
	// Add api_status_codes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(100, {}) or use other options such as http.Ok ...
	// return Response(100, nil),nil

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(300, {}) or use other options such as http.Ok ...
	// return Response(300, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("StatusCodesPatch method not implemented")
}

// StatusCodesPost - Return status code or random status code if more than one are given
func (s *StatusCodesAPIService) StatusCodesPost(ctx context.Context, codes string) (ImplResponse, error) {
	// TODO - update StatusCodesPost with the required logic for this service method.
	// Add api_status_codes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(100, {}) or use other options such as http.Ok ...
	// return Response(100, nil),nil

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(300, {}) or use other options such as http.Ok ...
	// return Response(300, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("StatusCodesPost method not implemented")
}

// StatusCodesPut - Return status code or random status code if more than one are given
func (s *StatusCodesAPIService) StatusCodesPut(ctx context.Context, codes string) (ImplResponse, error) {
	// TODO - update StatusCodesPut with the required logic for this service method.
	// Add api_status_codes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(100, {}) or use other options such as http.Ok ...
	// return Response(100, nil),nil

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(300, {}) or use other options such as http.Ok ...
	// return Response(300, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("StatusCodesPut method not implemented")
}

// StatusCodesTrace - Return status code or random status code if more than one are given
func (s *StatusCodesAPIService) StatusCodesTrace(ctx context.Context, codes string) (ImplResponse, error) {
	// TODO - update StatusCodesTrace with the required logic for this service method.
	// Add api_status_codes_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(100, {}) or use other options such as http.Ok ...
	// return Response(100, nil),nil

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(300, {}) or use other options such as http.Ok ...
	// return Response(300, nil),nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("StatusCodesTrace method not implemented")
}