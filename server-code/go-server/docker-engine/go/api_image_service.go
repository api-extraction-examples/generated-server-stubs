/*
 * Docker Engine API
 *
 * The Engine API is an HTTP API served by Docker Engine. It is the API the Docker client uses to communicate with the Engine, so everything the Docker client can do can be done with the API.  Most of the client's commands map directly to API endpoints (e.g. `docker ps` is `GET /containers/json`). The notable exception is running containers, which consists of several API calls.  # Errors  The API uses standard HTTP status codes to indicate the success or failure of the API call. The body of the response will be JSON in the following format:  ``` {   \"message\": \"page not found\" } ```  # Versioning  The API is usually changed in each release of Docker, so API calls are versioned to ensure that clients don't break.  For Docker Engine 17.09, the API version is 1.32. To lock to this version, you prefix the URL with `/v1.32`. For example, calling `/info` is the same as calling `/v1.32/info`.  Engine releases in the near future should support this version of the API, so your client will continue to work even if it is talking to a newer Engine.  In previous versions of Docker, it was possible to access the API without providing a version. This behaviour is now deprecated will be removed in a future version of Docker.  The API uses an open schema model, which means server may add extra properties to responses. Likewise, the server will ignore any extra query parameters and request body properties. When you write clients, you need to ignore additional properties in responses to ensure they do not break when talking to newer Docker daemons.  This documentation is for version 1.33 of the API. Use this table to find documentation for previous versions of the API:  Docker version  | API version | Changes ----------------|-------------|--------- 17.09.x | [1.31](https://docs.docker.com/engine/api/v1.32/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-32-api-changes) 17.07.x | [1.31](https://docs.docker.com/engine/api/v1.31/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-31-api-changes) 17.06.x | [1.30](https://docs.docker.com/engine/api/v1.30/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-30-api-changes) 17.05.x | [1.29](https://docs.docker.com/engine/api/v1.29/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-29-api-changes) 17.04.x | [1.28](https://docs.docker.com/engine/api/v1.28/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-28-api-changes) 17.03.1 | [1.27](https://docs.docker.com/engine/api/v1.27/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-27-api-changes) 1.13.1 & 17.03.0 | [1.26](https://docs.docker.com/engine/api/v1.26/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-26-api-changes) 1.13.0 | [1.25](https://docs.docker.com/engine/api/v1.25/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-25-api-changes) 1.12.x | [1.24](https://docs.docker.com/engine/api/v1.24/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-24-api-changes) 1.11.x | [1.23](https://docs.docker.com/engine/api/v1.23/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-23-api-changes) 1.10.x | [1.22](https://docs.docker.com/engine/api/v1.22/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-22-api-changes) 1.9.x | [1.21](https://docs.docker.com/engine/api/v1.21/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-21-api-changes) 1.8.x | [1.20](https://docs.docker.com/engine/api/v1.20/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-20-api-changes) 1.7.x | [1.19](https://docs.docker.com/engine/api/v1.19/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-19-api-changes) 1.6.x | [1.18](https://docs.docker.com/engine/api/v1.18/) | [API changes](https://docs.docker.com/engine/api/version-history/#v1-18-api-changes)  # Authentication  Authentication for registries is handled client side. The client has to send authentication details to various endpoints that need to communicate with registries, such as `POST /images/(name)/push`. These are sent as `X-Registry-Auth` header as a Base64 encoded (JSON) string with the following structure:  ``` {   \"username\": \"string\",   \"password\": \"string\",   \"email\": \"string\",   \"serveraddress\": \"string\" } ```  The `serveraddress` is a domain/IP without a protocol. Throughout this structure, double quotes are required.  If you have already got an identity token from the [`/auth` endpoint](#operation/SystemAuth), you can just pass this instead of credentials:  ``` {   \"identitytoken\": \"9cbaf023786cd7...\" } ``` 
 *
 * API version: 1.33
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
	"os"
)

// ImageAPIService is a service that implements the logic for the ImageAPIServicer
// This service should implement the business logic for every endpoint for the ImageAPI API.
// Include any external packages or services that will be required by this service.
type ImageAPIService struct {
}

// NewImageAPIService creates a default api service
func NewImageAPIService() ImageAPIServicer {
	return &ImageAPIService{}
}

// BuildPrune - Delete builder cache
func (s *ImageAPIService) BuildPrune(ctx context.Context) (ImplResponse, error) {
	// TODO - update BuildPrune with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BuildPrune200Response{}) or use other options such as http.Ok ...
	// return Response(200, BuildPrune200Response{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BuildPrune method not implemented")
}

// ImageBuild - Build an image
func (s *ImageAPIService) ImageBuild(ctx context.Context, dockerfile string, t string, extrahosts string, remote string, q bool, nocache bool, cachefrom string, pull string, rm bool, forcerm bool, memory int32, memswap int32, cpushares int32, cpusetcpus string, cpuperiod int32, cpuquota int32, buildargs int32, shmsize int32, squash bool, labels string, networkmode string, contentType string, xRegistryConfig string, body *os.File) (ImplResponse, error) {
	// TODO - update ImageBuild with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageBuild method not implemented")
}

// ImageCommit - Create a new image from a container
func (s *ImageAPIService) ImageCommit(ctx context.Context, container string, repo string, tag string, comment string, author string, pause bool, changes string, containerConfig ContainerConfig) (ImplResponse, error) {
	// TODO - update ImageCommit with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, IdResponse{}) or use other options such as http.Ok ...
	// return Response(201, IdResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageCommit method not implemented")
}

// ImageCreate - Create an image
func (s *ImageAPIService) ImageCreate(ctx context.Context, fromImage string, fromSrc string, repo string, tag string, xRegistryAuth string, body string) (ImplResponse, error) {
	// TODO - update ImageCreate with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageCreate method not implemented")
}

// ImageDelete - Remove an image
func (s *ImageAPIService) ImageDelete(ctx context.Context, name string, force bool, noprune bool) (ImplResponse, error) {
	// TODO - update ImageDelete with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ImageDeleteResponseItem{}) or use other options such as http.Ok ...
	// return Response(200, []ImageDeleteResponseItem{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageDelete method not implemented")
}

// ImageGet - Export an image
func (s *ImageAPIService) ImageGet(ctx context.Context, name string) (ImplResponse, error) {
	// TODO - update ImageGet with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, *os.File{}) or use other options such as http.Ok ...
	// return Response(200, *os.File{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageGet method not implemented")
}

// ImageGetAll - Export several images
func (s *ImageAPIService) ImageGetAll(ctx context.Context, names []string) (ImplResponse, error) {
	// TODO - update ImageGetAll with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, *os.File{}) or use other options such as http.Ok ...
	// return Response(200, *os.File{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageGetAll method not implemented")
}

// ImageHistory - Get the history of an image
func (s *ImageAPIService) ImageHistory(ctx context.Context, name string) (ImplResponse, error) {
	// TODO - update ImageHistory with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ImageHistory200ResponseInner{}) or use other options such as http.Ok ...
	// return Response(200, []ImageHistory200ResponseInner{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageHistory method not implemented")
}

// ImageInspect - Inspect an image
func (s *ImageAPIService) ImageInspect(ctx context.Context, name string) (ImplResponse, error) {
	// TODO - update ImageInspect with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Image{}) or use other options such as http.Ok ...
	// return Response(200, Image{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageInspect method not implemented")
}

// ImageList - List Images
func (s *ImageAPIService) ImageList(ctx context.Context, all bool, filters string, digests bool) (ImplResponse, error) {
	// TODO - update ImageList with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ImageSummary{}) or use other options such as http.Ok ...
	// return Response(200, []ImageSummary{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageList method not implemented")
}

// ImageLoad - Import images
func (s *ImageAPIService) ImageLoad(ctx context.Context, quiet bool, body *os.File) (ImplResponse, error) {
	// TODO - update ImageLoad with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageLoad method not implemented")
}

// ImagePrune - Delete unused images
func (s *ImageAPIService) ImagePrune(ctx context.Context, filters string) (ImplResponse, error) {
	// TODO - update ImagePrune with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, ImagePrune200Response{}) or use other options such as http.Ok ...
	// return Response(200, ImagePrune200Response{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImagePrune method not implemented")
}

// ImagePush - Push an image
func (s *ImageAPIService) ImagePush(ctx context.Context, name string, xRegistryAuth string, tag string) (ImplResponse, error) {
	// TODO - update ImagePush with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, {}) or use other options such as http.Ok ...
	// return Response(200, nil),nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImagePush method not implemented")
}

// ImageSearch - Search images
func (s *ImageAPIService) ImageSearch(ctx context.Context, term string, limit int32, filters string) (ImplResponse, error) {
	// TODO - update ImageSearch with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []ImageSearch200ResponseInner{}) or use other options such as http.Ok ...
	// return Response(200, []ImageSearch200ResponseInner{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageSearch method not implemented")
}

// ImageTag - Tag an image
func (s *ImageAPIService) ImageTag(ctx context.Context, name string, repo string, tag string) (ImplResponse, error) {
	// TODO - update ImageTag with the required logic for this service method.
	// Add api_image_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, {}) or use other options such as http.Ok ...
	// return Response(201, nil),nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(500, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(500, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ImageTag method not implemented")
}
