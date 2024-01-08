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

// PackageAPIService is a service that implements the logic for the PackageAPIServicer
// This service should implement the business logic for every endpoint for the PackageAPI API.
// Include any external packages or services that will be required by this service.
type PackageAPIService struct {
}

// NewPackageAPIService creates a default api service
func NewPackageAPIService() PackageAPIServicer {
	return &PackageAPIService{}
}

// CancelPackageInstallation - Cancels a package installation.
func (s *PackageAPIService) CancelPackageInstallation(ctx context.Context, packageId string) (ImplResponse, error) {
	// TODO - update CancelPackageInstallation with the required logic for this service method.
	// Add api_package_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("CancelPackageInstallation method not implemented")
}

// GetPackageInfo - Gets a package by name or assembly GUID.
func (s *PackageAPIService) GetPackageInfo(ctx context.Context, name string, assemblyGuid *string) (ImplResponse, error) {
	// TODO - update GetPackageInfo with the required logic for this service method.
	// Add api_package_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, PackageInfo{}) or use other options such as http.Ok ...
	// return Response(200, PackageInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetPackageInfo method not implemented")
}

// GetPackages - Gets available packages.
func (s *PackageAPIService) GetPackages(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetPackages with the required logic for this service method.
	// Add api_package_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []PackageInfo{}) or use other options such as http.Ok ...
	// return Response(200, []PackageInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetPackages method not implemented")
}

// GetRepositories - Gets all package repositories.
func (s *PackageAPIService) GetRepositories(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetRepositories with the required logic for this service method.
	// Add api_package_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []RepositoryInfo{}) or use other options such as http.Ok ...
	// return Response(200, []RepositoryInfo{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetRepositories method not implemented")
}

// InstallPackage - Installs a package.
func (s *PackageAPIService) InstallPackage(ctx context.Context, name string, assemblyGuid *string, version *string, repositoryUrl *string) (ImplResponse, error) {
	// TODO - update InstallPackage with the required logic for this service method.
	// Add api_package_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("InstallPackage method not implemented")
}

// SetRepositories - Sets the enabled and existing package repositories.
func (s *PackageAPIService) SetRepositories(ctx context.Context, repositoryInfo *[]RepositoryInfo) (ImplResponse, error) {
	// TODO - update SetRepositories with the required logic for this service method.
	// Add api_package_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("SetRepositories method not implemented")
}
