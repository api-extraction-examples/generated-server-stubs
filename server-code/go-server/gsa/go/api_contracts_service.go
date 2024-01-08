/*
 * Discovery Market Research
 *
 * <p>This API drives the <a href=\"https://discovery.gsa.gov\">Discovery Market Research Tool</a>. It contains information on the vendors that are part of the OASIS and OASIS Small Business contracting vehicles, such as their contracting history, their elligibility for contract awards, and their small business designations. To learn more about the tool, please visit <a href=\"https://discovery.gsa.gov\">Discovery</a> or see the README on our <a href=\"https://github.com/PSHCDevOps/discovery\">GitHub repository</a>.</p> <p><strong>Please note that the base path for this API is <code>https://api.data.gov/gsa/discovery/</code></strong></p> <p>It requires an API key, obtainable at <a href=\"http://api.data.gov/\">api.data.gov</a>. It must be passed in the <code>api_key</code> parameter with each request.</p>
 *
 * API version: 0.1
 * Contact: discovery-18f@gsa.gov
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// ContractsAPIService is a service that implements the logic for the ContractsAPIServicer
// This service should implement the business logic for every endpoint for the ContractsAPI API.
// Include any external packages or services that will be required by this service.
type ContractsAPIService struct {
}

// NewContractsAPIService creates a default api service
func NewContractsAPIService() ContractsAPIServicer {
	return &ContractsAPIService{}
}

// ListContractsGET - This endpoint returns contract history from FPDS for a specific vendor
func (s *ContractsAPIService) ListContractsGET(ctx context.Context, duns string, naics string, sort string, direction string, page string) (ImplResponse, error) {
	// TODO - update ListContractsGET with the required logic for this service method.
	// Add api_contracts_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, map[string]interface{}{}) or use other options such as http.Ok ...
	// return Response(200, map[string]interface{}{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListContractsGET method not implemented")
}