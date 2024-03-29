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

// AppPricePointsAPIService is a service that implements the logic for the AppPricePointsAPIServicer
// This service should implement the business logic for every endpoint for the AppPricePointsAPI API.
// Include any external packages or services that will be required by this service.
type AppPricePointsAPIService struct {
}

// NewAppPricePointsAPIService creates a default api service
func NewAppPricePointsAPIService() AppPricePointsAPIServicer {
	return &AppPricePointsAPIService{}
}

// AppPricePointsGetCollection - 
func (s *AppPricePointsAPIService) AppPricePointsGetCollection(ctx context.Context, filterPriceTier []string, filterTerritory []string, fieldsAppPricePoints []string, limit int32, include []string, fieldsTerritories []string) (ImplResponse, error) {
	// TODO - update AppPricePointsGetCollection with the required logic for this service method.
	// Add api_app_price_points_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPricePointsResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPricePointsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPricePointsGetCollection method not implemented")
}

// AppPricePointsGetInstance - 
func (s *AppPricePointsAPIService) AppPricePointsGetInstance(ctx context.Context, id string, fieldsAppPricePoints []string, include []string, fieldsTerritories []string) (ImplResponse, error) {
	// TODO - update AppPricePointsGetInstance with the required logic for this service method.
	// Add api_app_price_points_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPricePointResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPricePointResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPricePointsGetInstance method not implemented")
}

// AppPricePointsTerritoryGetToOneRelated - 
func (s *AppPricePointsAPIService) AppPricePointsTerritoryGetToOneRelated(ctx context.Context, id string, fieldsTerritories []string) (ImplResponse, error) {
	// TODO - update AppPricePointsTerritoryGetToOneRelated with the required logic for this service method.
	// Add api_app_price_points_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, TerritoryResponse{}) or use other options such as http.Ok ...
	// return Response(200, TerritoryResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPricePointsTerritoryGetToOneRelated method not implemented")
}
