/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// MusicExportAPIService is a service that implements the logic for the MusicExportAPIServicer
// This service should implement the business logic for every endpoint for the MusicExportAPI API.
// Include any external packages or services that will be required by this service.
type MusicExportAPIService struct {
}

// NewMusicExportAPIService creates a default api service
func NewMusicExportAPIService() MusicExportAPIServicer {
	return &MusicExportAPIService{}
}

// DeleteMusicPreferencesExport - Music Export Preferences
func (s *MusicExportAPIService) DeleteMusicPreferencesExport(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string) (ImplResponse, error) {
	// TODO - update DeleteMusicPreferencesExport with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MusicExportSuccess{}) or use other options such as http.Ok ...
	// return Response(200, MusicExportSuccess{}), nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteMusicPreferencesExport method not implemented")
}

// DeleteMusicPreferencesExportVendor - Music Export Vendor Preferences
func (s *MusicExportAPIService) DeleteMusicPreferencesExportVendor(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string, vendor string) (ImplResponse, error) {
	// TODO - update DeleteMusicPreferencesExportVendor with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteMusicPreferencesExportVendor method not implemented")
}

// GetMusicExport - Music Exports
func (s *MusicExportAPIService) GetMusicExport(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string, offset int32, limit int32) (ImplResponse, error) {
	// TODO - update GetMusicExport with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MusicExportJob{}) or use other options such as http.Ok ...
	// return Response(200, MusicExportJob{}), nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMusicExport method not implemented")
}

// GetMusicExportJobs - Music Export Jobs
func (s *MusicExportAPIService) GetMusicExportJobs(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string, over16 bool, vendor string) (ImplResponse, error) {
	// TODO - update GetMusicExportJobs with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MusicExportJob{}) or use other options such as http.Ok ...
	// return Response(200, MusicExportJob{}), nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMusicExportJobs method not implemented")
}

// GetMusicExportTracks - Music Export Tracks
func (s *MusicExportAPIService) GetMusicExportTracks(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string, over16 bool, offset int32, limit int32, vendor string, status string) (ImplResponse, error) {
	// TODO - update GetMusicExportTracks with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MusicExportJob{}) or use other options such as http.Ok ...
	// return Response(200, MusicExportJob{}), nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMusicExportTracks method not implemented")
}

// GetMusicPreferencesExport - Music Export Preferences
func (s *MusicExportAPIService) GetMusicPreferencesExport(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string) (ImplResponse, error) {
	// TODO - update GetMusicPreferencesExport with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MusicExportPreferencesResponse{}) or use other options such as http.Ok ...
	// return Response(200, MusicExportPreferencesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMusicPreferencesExport method not implemented")
}

// GetMusicPreferencesExportVendor - Music Export Vendor Preferences
func (s *MusicExportAPIService) GetMusicPreferencesExportVendor(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string, vendor string) (ImplResponse, error) {
	// TODO - update GetMusicPreferencesExportVendor with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MusicExportPreferencesResponse{}) or use other options such as http.Ok ...
	// return Response(200, MusicExportPreferencesResponse{}), nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMusicPreferencesExportVendor method not implemented")
}

// PostMusicExportJob - Music Export Jobs
func (s *MusicExportAPIService) PostMusicExportJob(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string, over16 bool, body []MusicExportJob, vendor string) (ImplResponse, error) {
	// TODO - update PostMusicExportJob with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MusicExportSuccess{}) or use other options such as http.Ok ...
	// return Response(200, MusicExportSuccess{}), nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostMusicExportJob method not implemented")
}

// PostMusicPreferencesExport - Music Export Preferences
func (s *MusicExportAPIService) PostMusicPreferencesExport(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string, body MusicExportPreferences) (ImplResponse, error) {
	// TODO - update PostMusicPreferencesExport with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, MusicExportSuccess{}) or use other options such as http.Ok ...
	// return Response(200, MusicExportSuccess{}), nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostMusicPreferencesExport method not implemented")
}

// PostMusicPreferencesExportVendor - Music Export Vendor Preferences
func (s *MusicExportAPIService) PostMusicPreferencesExportVendor(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string, vendor string, body MusicExportPreferences) (ImplResponse, error) {
	// TODO - update PostMusicPreferencesExportVendor with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PostMusicPreferencesExportVendor method not implemented")
}

// PutMusicPreferencesExportVendor - Music Export Vendor Preferences
func (s *MusicExportAPIService) PutMusicPreferencesExportVendor(ctx context.Context, authorization string, xAuthenticationProvider string, xAPIKey string, vendor string, body MusicExportPreferences) (ImplResponse, error) {
	// TODO - update PutMusicPreferencesExportVendor with the required logic for this service method.
	// Add api_music_export_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(0, MusicExportErrorResponse{}) or use other options such as http.Ok ...
	// return Response(0, MusicExportErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("PutMusicPreferencesExportVendor method not implemented")
}
