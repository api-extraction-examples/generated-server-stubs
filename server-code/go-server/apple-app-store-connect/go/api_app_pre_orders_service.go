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

// AppPreOrdersAPIService is a service that implements the logic for the AppPreOrdersAPIServicer
// This service should implement the business logic for every endpoint for the AppPreOrdersAPI API.
// Include any external packages or services that will be required by this service.
type AppPreOrdersAPIService struct {
}

// NewAppPreOrdersAPIService creates a default api service
func NewAppPreOrdersAPIService() AppPreOrdersAPIServicer {
	return &AppPreOrdersAPIService{}
}

// AppPreOrdersCreateInstance - 
func (s *AppPreOrdersAPIService) AppPreOrdersCreateInstance(ctx context.Context, appPreOrderCreateRequest AppPreOrderCreateRequest) (ImplResponse, error) {
	// TODO - update AppPreOrdersCreateInstance with the required logic for this service method.
	// Add api_app_pre_orders_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, AppPreOrderResponse{}) or use other options such as http.Ok ...
	// return Response(201, AppPreOrderResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreOrdersCreateInstance method not implemented")
}

// AppPreOrdersDeleteInstance - 
func (s *AppPreOrdersAPIService) AppPreOrdersDeleteInstance(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update AppPreOrdersDeleteInstance with the required logic for this service method.
	// Add api_app_pre_orders_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreOrdersDeleteInstance method not implemented")
}

// AppPreOrdersGetInstance - 
func (s *AppPreOrdersAPIService) AppPreOrdersGetInstance(ctx context.Context, id string, fieldsAppPreOrders []string, include []string) (ImplResponse, error) {
	// TODO - update AppPreOrdersGetInstance with the required logic for this service method.
	// Add api_app_pre_orders_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPreOrderResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPreOrderResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreOrdersGetInstance method not implemented")
}

// AppPreOrdersUpdateInstance - 
func (s *AppPreOrdersAPIService) AppPreOrdersUpdateInstance(ctx context.Context, id string, appPreOrderUpdateRequest AppPreOrderUpdateRequest) (ImplResponse, error) {
	// TODO - update AppPreOrdersUpdateInstance with the required logic for this service method.
	// Add api_app_pre_orders_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AppPreOrderResponse{}) or use other options such as http.Ok ...
	// return Response(200, AppPreOrderResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("AppPreOrdersUpdateInstance method not implemented")
}
