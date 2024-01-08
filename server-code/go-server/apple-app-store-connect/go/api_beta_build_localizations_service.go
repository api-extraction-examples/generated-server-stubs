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

// BetaBuildLocalizationsAPIService is a service that implements the logic for the BetaBuildLocalizationsAPIServicer
// This service should implement the business logic for every endpoint for the BetaBuildLocalizationsAPI API.
// Include any external packages or services that will be required by this service.
type BetaBuildLocalizationsAPIService struct {
}

// NewBetaBuildLocalizationsAPIService creates a default api service
func NewBetaBuildLocalizationsAPIService() BetaBuildLocalizationsAPIServicer {
	return &BetaBuildLocalizationsAPIService{}
}

// BetaBuildLocalizationsBuildGetToOneRelated - 
func (s *BetaBuildLocalizationsAPIService) BetaBuildLocalizationsBuildGetToOneRelated(ctx context.Context, id string, fieldsBuilds []string) (ImplResponse, error) {
	// TODO - update BetaBuildLocalizationsBuildGetToOneRelated with the required logic for this service method.
	// Add api_beta_build_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BuildResponse{}) or use other options such as http.Ok ...
	// return Response(200, BuildResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaBuildLocalizationsBuildGetToOneRelated method not implemented")
}

// BetaBuildLocalizationsCreateInstance - 
func (s *BetaBuildLocalizationsAPIService) BetaBuildLocalizationsCreateInstance(ctx context.Context, betaBuildLocalizationCreateRequest BetaBuildLocalizationCreateRequest) (ImplResponse, error) {
	// TODO - update BetaBuildLocalizationsCreateInstance with the required logic for this service method.
	// Add api_beta_build_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, BetaBuildLocalizationResponse{}) or use other options such as http.Ok ...
	// return Response(201, BetaBuildLocalizationResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaBuildLocalizationsCreateInstance method not implemented")
}

// BetaBuildLocalizationsDeleteInstance - 
func (s *BetaBuildLocalizationsAPIService) BetaBuildLocalizationsDeleteInstance(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update BetaBuildLocalizationsDeleteInstance with the required logic for this service method.
	// Add api_beta_build_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("BetaBuildLocalizationsDeleteInstance method not implemented")
}

// BetaBuildLocalizationsGetCollection - 
func (s *BetaBuildLocalizationsAPIService) BetaBuildLocalizationsGetCollection(ctx context.Context, filterLocale []string, filterBuild []string, fieldsBetaBuildLocalizations []string, limit int32, include []string, fieldsBuilds []string) (ImplResponse, error) {
	// TODO - update BetaBuildLocalizationsGetCollection with the required logic for this service method.
	// Add api_beta_build_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BetaBuildLocalizationsResponse{}) or use other options such as http.Ok ...
	// return Response(200, BetaBuildLocalizationsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaBuildLocalizationsGetCollection method not implemented")
}

// BetaBuildLocalizationsGetInstance - 
func (s *BetaBuildLocalizationsAPIService) BetaBuildLocalizationsGetInstance(ctx context.Context, id string, fieldsBetaBuildLocalizations []string, include []string, fieldsBuilds []string) (ImplResponse, error) {
	// TODO - update BetaBuildLocalizationsGetInstance with the required logic for this service method.
	// Add api_beta_build_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BetaBuildLocalizationResponse{}) or use other options such as http.Ok ...
	// return Response(200, BetaBuildLocalizationResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaBuildLocalizationsGetInstance method not implemented")
}

// BetaBuildLocalizationsUpdateInstance - 
func (s *BetaBuildLocalizationsAPIService) BetaBuildLocalizationsUpdateInstance(ctx context.Context, id string, betaBuildLocalizationUpdateRequest BetaBuildLocalizationUpdateRequest) (ImplResponse, error) {
	// TODO - update BetaBuildLocalizationsUpdateInstance with the required logic for this service method.
	// Add api_beta_build_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BetaBuildLocalizationResponse{}) or use other options such as http.Ok ...
	// return Response(200, BetaBuildLocalizationResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaBuildLocalizationsUpdateInstance method not implemented")
}
