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

// AppPriceTiersAPIService is a service that implements the logic for the AppPriceTiersAPIServicer
// This service should implement the business logic for every endpoint for the AppPriceTiersAPI API.
// Include any external packages or services that will be required by this service.
type AppPriceTiersAPIService struct {
}

// NewAppPriceTiersAPIService creates a default api service
func NewAppPriceTiersAPIService() AppPriceTiersAPIServicer {
	return &AppPriceTiersAPIService{}
}

// AppPriceTiersGetCollection - 
func (s *AppPriceTiersAPIService) AppPriceTiersGetCollection(ctx context.Context, filterId []string, fieldsAppPriceTiers []string, limit int32, include []string, fieldsAppPricePoints []string, limitPricePoints int32) (ImplResponse, error) {
	// TODO - update AppPriceTiersGetCollection with the required logic for this service method.
	// Add api_app_price_tiers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPriceTiersResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPriceTiersResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPriceTiersGetCollection method not implemented")
}

// AppPriceTiersGetInstance - 
func (s *AppPriceTiersAPIService) AppPriceTiersGetInstance(ctx context.Context, id string, fieldsAppPriceTiers []string, include []string, fieldsAppPricePoints []string, limitPricePoints int32) (ImplResponse, error) {
	// TODO - update AppPriceTiersGetInstance with the required logic for this service method.
	// Add api_app_price_tiers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPriceTierResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPriceTierResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPriceTiersGetInstance method not implemented")
}

// AppPriceTiersPricePointsGetToManyRelated - 
func (s *AppPriceTiersAPIService) AppPriceTiersPricePointsGetToManyRelated(ctx context.Context, id string, fieldsAppPricePoints []string, limit int32) (ImplResponse, error) {
	// TODO - update AppPriceTiersPricePointsGetToManyRelated with the required logic for this service method.
	// Add api_app_price_tiers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPricePointsResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPricePointsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPriceTiersPricePointsGetToManyRelated method not implemented")
}
