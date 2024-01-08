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

// BetaAppLocalizationsAPIService is a service that implements the logic for the BetaAppLocalizationsAPIServicer
// This service should implement the business logic for every endpoint for the BetaAppLocalizationsAPI API.
// Include any external packages or services that will be required by this service.
type BetaAppLocalizationsAPIService struct {
}

// NewBetaAppLocalizationsAPIService creates a default api service
func NewBetaAppLocalizationsAPIService() BetaAppLocalizationsAPIServicer {
	return &BetaAppLocalizationsAPIService{}
}

// BetaAppLocalizationsAppGetToOneRelated - 
func (s *BetaAppLocalizationsAPIService) BetaAppLocalizationsAppGetToOneRelated(ctx context.Context, id string, fieldsApps []string) (ImplResponse, error) {
	// TODO - update BetaAppLocalizationsAppGetToOneRelated with the required logic for this service method.
	// Add api_beta_app_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppLocalizationsAppGetToOneRelated method not implemented")
}

// BetaAppLocalizationsCreateInstance - 
func (s *BetaAppLocalizationsAPIService) BetaAppLocalizationsCreateInstance(ctx context.Context, betaAppLocalizationCreateRequest BetaAppLocalizationCreateRequest) (ImplResponse, error) {
	// TODO - update BetaAppLocalizationsCreateInstance with the required logic for this service method.
	// Add api_beta_app_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, BetaAppLocalizationResponse{}) or use other options such as http.Ok ...
	// return Response(201, BetaAppLocalizationResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppLocalizationsCreateInstance method not implemented")
}

// BetaAppLocalizationsDeleteInstance - 
func (s *BetaAppLocalizationsAPIService) BetaAppLocalizationsDeleteInstance(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update BetaAppLocalizationsDeleteInstance with the required logic for this service method.
	// Add api_beta_app_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppLocalizationsDeleteInstance method not implemented")
}

// BetaAppLocalizationsGetCollection - 
func (s *BetaAppLocalizationsAPIService) BetaAppLocalizationsGetCollection(ctx context.Context, filterLocale []string, filterApp []string, fieldsBetaAppLocalizations []string, limit int32, include []string, fieldsApps []string) (ImplResponse, error) {
	// TODO - update BetaAppLocalizationsGetCollection with the required logic for this service method.
	// Add api_beta_app_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BetaAppLocalizationsResponse{}) or use other options such as http.Ok ...
	// return Response(200, BetaAppLocalizationsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppLocalizationsGetCollection method not implemented")
}

// BetaAppLocalizationsGetInstance - 
func (s *BetaAppLocalizationsAPIService) BetaAppLocalizationsGetInstance(ctx context.Context, id string, fieldsBetaAppLocalizations []string, include []string, fieldsApps []string) (ImplResponse, error) {
	// TODO - update BetaAppLocalizationsGetInstance with the required logic for this service method.
	// Add api_beta_app_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BetaAppLocalizationResponse{}) or use other options such as http.Ok ...
	// return Response(200, BetaAppLocalizationResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppLocalizationsGetInstance method not implemented")
}

// BetaAppLocalizationsUpdateInstance - 
func (s *BetaAppLocalizationsAPIService) BetaAppLocalizationsUpdateInstance(ctx context.Context, id string, betaAppLocalizationUpdateRequest BetaAppLocalizationUpdateRequest) (ImplResponse, error) {
	// TODO - update BetaAppLocalizationsUpdateInstance with the required logic for this service method.
	// Add api_beta_app_localizations_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BetaAppLocalizationResponse{}) or use other options such as http.Ok ...
	// return Response(200, BetaAppLocalizationResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppLocalizationsUpdateInstance method not implemented")
}
