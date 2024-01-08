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
	"reflect"
)

// LibraryStructureAPIService is a service that implements the logic for the LibraryStructureAPIServicer
// This service should implement the business logic for every endpoint for the LibraryStructureAPI API.
// Include any external packages or services that will be required by this service.
type LibraryStructureAPIService struct {
}

// NewLibraryStructureAPIService creates a default api service
func NewLibraryStructureAPIService() LibraryStructureAPIServicer {
	return &LibraryStructureAPIService{}
}

// AddMediaPath - Add a media path to a library.
func (s *LibraryStructureAPIService) AddMediaPath(ctx context.Context, mediaPathDto MediaPathDto, refreshLibrary bool) (ImplResponse, error) {
	// TODO - update AddMediaPath with the required logic for this service method.
	// Add api_library_structure_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddMediaPath method not implemented")
}

// AddVirtualFolder - Adds a virtual folder.
func (s *LibraryStructureAPIService) AddVirtualFolder(ctx context.Context, name *string, collectionType *string, paths *[]string, refreshLibrary bool, addVirtualFolderDto AddVirtualFolderDto) (ImplResponse, error) {
	// TODO - update AddVirtualFolder with the required logic for this service method.
	// Add api_library_structure_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("AddVirtualFolder method not implemented")
}

// GetVirtualFolders - Gets all virtual folders.
func (s *LibraryStructureAPIService) GetVirtualFolders(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetVirtualFolders with the required logic for this service method.
	// Add api_library_structure_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []VirtualFolderInfo{}) or use other options such as http.Ok ...
	// return Response(200, []VirtualFolderInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetVirtualFolders method not implemented")
}

// RemoveMediaPath - Remove a media path.
func (s *LibraryStructureAPIService) RemoveMediaPath(ctx context.Context, name *string, path *string, refreshLibrary bool) (ImplResponse, error) {
	// TODO - update RemoveMediaPath with the required logic for this service method.
	// Add api_library_structure_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveMediaPath method not implemented")
}

// RemoveVirtualFolder - Removes a virtual folder.
func (s *LibraryStructureAPIService) RemoveVirtualFolder(ctx context.Context, name *string, refreshLibrary bool) (ImplResponse, error) {
	// TODO - update RemoveVirtualFolder with the required logic for this service method.
	// Add api_library_structure_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("RemoveVirtualFolder method not implemented")
}

// RenameVirtualFolder - Renames a virtual folder.
func (s *LibraryStructureAPIService) RenameVirtualFolder(ctx context.Context, name *string, newName *string, refreshLibrary bool) (ImplResponse, error) {
	// TODO - update RenameVirtualFolder with the required logic for this service method.
	// Add api_library_structure_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	// TODO: Uncomment the next line to return response Response(409, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(409, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("RenameVirtualFolder method not implemented")
}

// UpdateLibraryOptions - Update library options.
func (s *LibraryStructureAPIService) UpdateLibraryOptions(ctx context.Context, updateLibraryOptionsDto UpdateLibraryOptionsDto) (ImplResponse, error) {
	// TODO - update UpdateLibraryOptions with the required logic for this service method.
	// Add api_library_structure_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateLibraryOptions method not implemented")
}

// UpdateMediaPath - Updates a media path.
func (s *LibraryStructureAPIService) UpdateMediaPath(ctx context.Context, name *string, mediaPathInfo MediaPathInfo) (ImplResponse, error) {
	// TODO - update UpdateMediaPath with the required logic for this service method.
	// Add api_library_structure_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("UpdateMediaPath method not implemented")
}
