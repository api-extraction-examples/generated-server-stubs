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

// DevicesAPIService is a service that implements the logic for the DevicesAPIServicer
// This service should implement the business logic for every endpoint for the DevicesAPI API.
// Include any external packages or services that will be required by this service.
type DevicesAPIService struct {
}

// NewDevicesAPIService creates a default api service
func NewDevicesAPIService() DevicesAPIServicer {
	return &DevicesAPIService{}
}

// DevicesCreateInstance - 
func (s *DevicesAPIService) DevicesCreateInstance(ctx context.Context, deviceCreateRequest DeviceCreateRequest) (ImplResponse, error) {
	// TODO - update DevicesCreateInstance with the required logic for this service method.
	// Add api_devices_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, DeviceResponse{}) or use other options such as http.Ok ...
	// return Response(201, DeviceResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DevicesCreateInstance method not implemented")
}

// DevicesGetCollection - 
func (s *DevicesAPIService) DevicesGetCollection(ctx context.Context, filterName []string, filterPlatform []string, filterStatus []string, filterUdid []string, filterId []string, sort []string, fieldsDevices []string, limit int32) (ImplResponse, error) {
	// TODO - update DevicesGetCollection with the required logic for this service method.
	// Add api_devices_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DevicesResponse{}) or use other options such as http.Ok ...
	// return Response(200, DevicesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DevicesGetCollection method not implemented")
}

// DevicesGetInstance - 
func (s *DevicesAPIService) DevicesGetInstance(ctx context.Context, id string, fieldsDevices []string) (ImplResponse, error) {
	// TODO - update DevicesGetInstance with the required logic for this service method.
	// Add api_devices_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeviceResponse{}) or use other options such as http.Ok ...
	// return Response(200, DeviceResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DevicesGetInstance method not implemented")
}

// DevicesUpdateInstance - 
func (s *DevicesAPIService) DevicesUpdateInstance(ctx context.Context, id string, deviceUpdateRequest DeviceUpdateRequest) (ImplResponse, error) {
	// TODO - update DevicesUpdateInstance with the required logic for this service method.
	// Add api_devices_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeviceResponse{}) or use other options such as http.Ok ...
	// return Response(200, DeviceResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DevicesUpdateInstance method not implemented")
}