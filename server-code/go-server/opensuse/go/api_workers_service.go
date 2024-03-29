/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// WorkersAPIService is a service that implements the logic for the WorkersAPIServicer
// This service should implement the business logic for every endpoint for the WorkersAPI API.
// Include any external packages or services that will be required by this service.
type WorkersAPIService struct {
}

// NewWorkersAPIService creates a default api service
func NewWorkersAPIService() WorkersAPIServicer {
	return &WorkersAPIService{}
}

// WorkerArchitectureNameworkerIdGet - Lists capabilites of a worker.
func (s *WorkersAPIService) WorkerArchitectureNameworkerIdGet(ctx context.Context, workerId string) (ImplResponse, error) {
	// TODO - update WorkerArchitectureNameworkerIdGet with the required logic for this service method.
	// Add api_workers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, WorkerArchitectureNameWorkerIdGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, WorkerArchitectureNameWorkerIdGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("WorkerArchitectureNameworkerIdGet method not implemented")
}

// WorkerStatusGet - Lists status of workers, jobs, backend services and general statistics.
func (s *WorkersAPIService) WorkerStatusGet(ctx context.Context) (ImplResponse, error) {
	// TODO - update WorkerStatusGet with the required logic for this service method.
	// Add api_workers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, WorkerStatusGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, WorkerStatusGet200Response{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("WorkerStatusGet method not implemented")
}

// WorkercmdcheckconstraintsPost - Lists workers which match a constraints filter.
func (s *WorkersAPIService) WorkercmdcheckconstraintsPost(ctx context.Context, project string, repository string, arch string, package_ string, workerCmdCheckconstraintsPostRequest WorkerCmdCheckconstraintsPostRequest) (ImplResponse, error) {
	// TODO - update WorkercmdcheckconstraintsPost with the required logic for this service method.
	// Add api_workers_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Object{}) or use other options such as http.Ok ...
	// return Response(200, Object{}), nil

	// TODO: Uncomment the next line to return response Response(400, Object{}) or use other options such as http.Ok ...
	// return Response(400, Object{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(404, Object{}) or use other options such as http.Ok ...
	// return Response(404, Object{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("WorkercmdcheckconstraintsPost method not implemented")
}
