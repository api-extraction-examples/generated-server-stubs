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

// AmendmentsAPIService is a service that implements the logic for the AmendmentsAPIServicer
// This service should implement the business logic for every endpoint for the AmendmentsAPI API.
// Include any external packages or services that will be required by this service.
type AmendmentsAPIService struct {
}

// NewAmendmentsAPIService creates a default api service
func NewAmendmentsAPIService() AmendmentsAPIServicer {
	return &AmendmentsAPIService{}
}

// GetAmendment - Returns an amendment.
func (s *AmendmentsAPIService) GetAmendment(ctx context.Context, billId int32, billStageId int32, amendmentId int32) (ImplResponse, error) {
	// TODO - update GetAmendment with the required logic for this service method.
	// Add api_amendments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AmendmentDetail{}) or use other options such as http.Ok ...
	// return Response(200, AmendmentDetail{}), nil

	// TODO: Uncomment the next line to return response Response(400, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(400, ProblemDetails{}), nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAmendment method not implemented")
}

// GetAmendments - Returns a list of amendments.
func (s *AmendmentsAPIService) GetAmendments(ctx context.Context, billId int32, billStageId int32, searchTerm string, decision Decision, memberId int32, skip int32, take int32) (ImplResponse, error) {
	// TODO - update GetAmendments with the required logic for this service method.
	// Add api_amendments_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, AmendmentSearchItemSearchResult{}) or use other options such as http.Ok ...
	// return Response(200, AmendmentSearchItemSearchResult{}), nil

	// TODO: Uncomment the next line to return response Response(400, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(400, ProblemDetails{}), nil

	// TODO: Uncomment the next line to return response Response(404, ProblemDetails{}) or use other options such as http.Ok ...
	// return Response(404, ProblemDetails{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetAmendments method not implemented")
}
