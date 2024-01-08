/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * API version: v1
 * Contact: softwareengineering@parliament.uk
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// BillTypesAPIService is a service that implements the logic for the BillTypesAPIServicer
// This service should implement the business logic for every endpoint for the BillTypesAPI API.
// Include any external packages or services that will be required by this service.
type BillTypesAPIService struct {
}

// NewBillTypesAPIService creates a default api service
func NewBillTypesAPIService() BillTypesAPIServicer {
	return &BillTypesAPIService{}
}

// ApiV1BillTypesGet - Returns a list of Bill types.
func (s *BillTypesAPIService) ApiV1BillTypesGet(ctx context.Context, category BillTypeCategory, skip int32, take int32) (ImplResponse, error) {
	// TODO - update ApiV1BillTypesGet with the required logic for this service method.
	// Add api_bill_types_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BillTypeSearchResult{}) or use other options such as http.Ok ...
	// return Response(200, BillTypeSearchResult{}), nil

	// TODO: Uncomment the next line to return response Response(400, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(400, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ApiV1BillTypesGet method not implemented")
}
