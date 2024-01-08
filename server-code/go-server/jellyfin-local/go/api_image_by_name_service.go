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

// ImageByNameAPIService is a service that implements the logic for the ImageByNameAPIServicer
// This service should implement the business logic for every endpoint for the ImageByNameAPI API.
// Include any external packages or services that will be required by this service.
type ImageByNameAPIService struct {
}

// NewImageByNameAPIService creates a default api service
func NewImageByNameAPIService() ImageByNameAPIServicer {
	return &ImageByNameAPIService{}
}

// GetGeneralImage - Get General Image.
func (s *ImageByNameAPIService) GetGeneralImage(ctx context.Context, name string, type_ string) (ImplResponse, error) {
	// TODO - update GetGeneralImage with the required logic for this service method.
	// Add api_image_by_name_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, *os.File{}) or use other options such as http.Ok ...
	// return Response(200, *os.File{}), nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetGeneralImage method not implemented")
}

// GetGeneralImages - Get all general images.
func (s *ImageByNameAPIService) GetGeneralImages(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetGeneralImages with the required logic for this service method.
	// Add api_image_by_name_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ImageByNameInfo{}) or use other options such as http.Ok ...
	// return Response(200, []ImageByNameInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetGeneralImages method not implemented")
}

// GetMediaInfoImage - Get media info image.
func (s *ImageByNameAPIService) GetMediaInfoImage(ctx context.Context, theme string, name string) (ImplResponse, error) {
	// TODO - update GetMediaInfoImage with the required logic for this service method.
	// Add api_image_by_name_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, *os.File{}) or use other options such as http.Ok ...
	// return Response(200, *os.File{}), nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMediaInfoImage method not implemented")
}

// GetMediaInfoImages - Get all media info images.
func (s *ImageByNameAPIService) GetMediaInfoImages(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetMediaInfoImages with the required logic for this service method.
	// Add api_image_by_name_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ImageByNameInfo{}) or use other options such as http.Ok ...
	// return Response(200, []ImageByNameInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMediaInfoImages method not implemented")
}

// GetRatingImage - Get rating image.
func (s *ImageByNameAPIService) GetRatingImage(ctx context.Context, theme string, name string) (ImplResponse, error) {
	// TODO - update GetRatingImage with the required logic for this service method.
	// Add api_image_by_name_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, *os.File{}) or use other options such as http.Ok ...
	// return Response(200, *os.File{}), nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetRatingImage method not implemented")
}

// GetRatingImages - Get all general images.
func (s *ImageByNameAPIService) GetRatingImages(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetRatingImages with the required logic for this service method.
	// Add api_image_by_name_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ImageByNameInfo{}) or use other options such as http.Ok ...
	// return Response(200, []ImageByNameInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetRatingImages method not implemented")
}
