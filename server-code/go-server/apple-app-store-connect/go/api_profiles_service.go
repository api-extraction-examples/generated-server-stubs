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

// ProfilesAPIService is a service that implements the logic for the ProfilesAPIServicer
// This service should implement the business logic for every endpoint for the ProfilesAPI API.
// Include any external packages or services that will be required by this service.
type ProfilesAPIService struct {
}

// NewProfilesAPIService creates a default api service
func NewProfilesAPIService() ProfilesAPIServicer {
	return &ProfilesAPIService{}
}

// ProfilesBundleIdGetToOneRelated - 
func (s *ProfilesAPIService) ProfilesBundleIdGetToOneRelated(ctx context.Context, id string, fieldsBundleIds []string) (ImplResponse, error) {
	// TODO - update ProfilesBundleIdGetToOneRelated with the required logic for this service method.
	// Add api_profiles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BundleIdResponse{}) or use other options such as http.Ok ...
	// return Response(200, BundleIdResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ProfilesBundleIdGetToOneRelated method not implemented")
}

// ProfilesCertificatesGetToManyRelated - 
func (s *ProfilesAPIService) ProfilesCertificatesGetToManyRelated(ctx context.Context, id string, fieldsCertificates []string, limit int32) (ImplResponse, error) {
	// TODO - update ProfilesCertificatesGetToManyRelated with the required logic for this service method.
	// Add api_profiles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, CertificatesResponse{}) or use other options such as http.Ok ...
	// return Response(200, CertificatesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ProfilesCertificatesGetToManyRelated method not implemented")
}

// ProfilesCreateInstance - 
func (s *ProfilesAPIService) ProfilesCreateInstance(ctx context.Context, profileCreateRequest ProfileCreateRequest) (ImplResponse, error) {
	// TODO - update ProfilesCreateInstance with the required logic for this service method.
	// Add api_profiles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, ProfileResponse{}) or use other options such as http.Ok ...
	// return Response(201, ProfileResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ProfilesCreateInstance method not implemented")
}

// ProfilesDeleteInstance - 
func (s *ProfilesAPIService) ProfilesDeleteInstance(ctx context.Context, id string) (ImplResponse, error) {
	// TODO - update ProfilesDeleteInstance with the required logic for this service method.
	// Add api_profiles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

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

	return Response(http.StatusNotImplemented, nil), errors.New("ProfilesDeleteInstance method not implemented")
}

// ProfilesDevicesGetToManyRelated - 
func (s *ProfilesAPIService) ProfilesDevicesGetToManyRelated(ctx context.Context, id string, fieldsDevices []string, limit int32) (ImplResponse, error) {
	// TODO - update ProfilesDevicesGetToManyRelated with the required logic for this service method.
	// Add api_profiles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DevicesResponse{}) or use other options such as http.Ok ...
	// return Response(200, DevicesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ProfilesDevicesGetToManyRelated method not implemented")
}

// ProfilesGetCollection - 
func (s *ProfilesAPIService) ProfilesGetCollection(ctx context.Context, filterName []string, filterProfileState []string, filterProfileType []string, filterId []string, sort []string, fieldsProfiles []string, limit int32, include []string, fieldsCertificates []string, fieldsDevices []string, fieldsBundleIds []string, limitCertificates int32, limitDevices int32) (ImplResponse, error) {
	// TODO - update ProfilesGetCollection with the required logic for this service method.
	// Add api_profiles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ProfilesResponse{}) or use other options such as http.Ok ...
	// return Response(200, ProfilesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ProfilesGetCollection method not implemented")
}

// ProfilesGetInstance - 
func (s *ProfilesAPIService) ProfilesGetInstance(ctx context.Context, id string, fieldsProfiles []string, include []string, fieldsCertificates []string, fieldsDevices []string, fieldsBundleIds []string, limitCertificates int32, limitDevices int32) (ImplResponse, error) {
	// TODO - update ProfilesGetInstance with the required logic for this service method.
	// Add api_profiles_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ProfileResponse{}) or use other options such as http.Ok ...
	// return Response(200, ProfileResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ProfilesGetInstance method not implemented")
}
