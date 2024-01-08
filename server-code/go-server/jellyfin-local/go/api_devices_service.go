/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
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

// DeleteDevice - Deletes a device.
func (s *DevicesAPIService) DeleteDevice(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update DeleteDevice with the required logic for this service method.
	// Add api_devices_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteDevice method not implemented")
}

// GetDeviceInfo - Get info for a device.
func (s *DevicesAPIService) GetDeviceInfo(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update GetDeviceInfo with the required logic for this service method.
	// Add api_devices_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeviceInfo{}) or use other options such as http.Ok ...
	// return Response(200, DeviceInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDeviceInfo method not implemented")
}

// GetDeviceOptions - Get options for a device.
func (s *DevicesAPIService) GetDeviceOptions(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update GetDeviceOptions with the required logic for this service method.
	// Add api_devices_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeviceOptions{}) or use other options such as http.Ok ...
	// return Response(200, DeviceOptions{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDeviceOptions method not implemented")
}

// GetDevices - Get Devices.
func (s *DevicesAPIService) GetDevices(ctx context.Context, supportsSync *bool, userId *string) (ImplResponse, error) {
	// TODO - update GetDevices with the required logic for this service method.
	// Add api_devices_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DeviceInfoQueryResult{}) or use other options such as http.Ok ...
	// return Response(200, DeviceInfoQueryResult{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDevices method not implemented")
}

// UpdateDeviceOptions - Update device options.
func (s *DevicesAPIService) UpdateDeviceOptions(ctx context.Context, id string, deviceOptions DeviceOptions) (ImplResponse, error) {
	// TODO - update UpdateDeviceOptions with the required logic for this service method.
	// Add api_devices_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateDeviceOptions method not implemented")
}