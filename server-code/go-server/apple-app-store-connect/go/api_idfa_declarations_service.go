/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// IdfaDeclarationsAPIService is a service that implements the logic for the IdfaDeclarationsAPIServicer
// This service should implement the business logic for every endpoint for the IdfaDeclarationsAPI API.
// Include any external packages or services that will be required by this service.
type IdfaDeclarationsAPIService struct {
}

// NewIdfaDeclarationsAPIService creates a default api service
func NewIdfaDeclarationsAPIService() IdfaDeclarationsAPIServicer {
	return &IdfaDeclarationsAPIService{}
}

// IdfaDeclarationsCreateInstance - 
func (s *IdfaDeclarationsAPIService) IdfaDeclarationsCreateInstance(ctx context.Context, idfaDeclarationCreateRequest IdfaDeclarationCreateRequest) (ImplResponse, error) {
	// TODO - update IdfaDeclarationsCreateInstance with the required logic for this service method.
	// Add api_idfa_declarations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, IdfaDeclarationResponse{}) or use other options such as http.Ok ...
	// return Response(201, IdfaDeclarationResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("IdfaDeclarationsCreateInstance method not implemented")
}

// IdfaDeclarationsDeleteInstance - 
func (s *IdfaDeclarationsAPIService) IdfaDeclarationsDeleteInstance(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update IdfaDeclarationsDeleteInstance with the required logic for this service method.
	// Add api_idfa_declarations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("IdfaDeclarationsDeleteInstance method not implemented")
}

// IdfaDeclarationsUpdateInstance - 
func (s *IdfaDeclarationsAPIService) IdfaDeclarationsUpdateInstance(ctx context.Context, id string, idfaDeclarationUpdateRequest IdfaDeclarationUpdateRequest) (ImplResponse, error) {
	// TODO - update IdfaDeclarationsUpdateInstance with the required logic for this service method.
	// Add api_idfa_declarations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, IdfaDeclarationResponse{}) or use other options such as http.Ok ...
	// return Response(200, IdfaDeclarationResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("IdfaDeclarationsUpdateInstance method not implemented")
}
