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

// BetaAppReviewSubmissionsAPIService is a service that implements the logic for the BetaAppReviewSubmissionsAPIServicer
// This service should implement the business logic for every endpoint for the BetaAppReviewSubmissionsAPI API.
// Include any external packages or services that will be required by this service.
type BetaAppReviewSubmissionsAPIService struct {
}

// NewBetaAppReviewSubmissionsAPIService creates a default api service
func NewBetaAppReviewSubmissionsAPIService() BetaAppReviewSubmissionsAPIServicer {
	return &BetaAppReviewSubmissionsAPIService{}
}

// BetaAppReviewSubmissionsBuildGetToOneRelated - 
func (s *BetaAppReviewSubmissionsAPIService) BetaAppReviewSubmissionsBuildGetToOneRelated(ctx context.Context, id string, fieldsBuilds []string) (ImplResponse, error) {
	// TODO - update BetaAppReviewSubmissionsBuildGetToOneRelated with the required logic for this service method.
	// Add api_beta_app_review_submissions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BuildResponse{}) or use other options such as http.Ok ...
	// return Response(200, BuildResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppReviewSubmissionsBuildGetToOneRelated method not implemented")
}

// BetaAppReviewSubmissionsCreateInstance - 
func (s *BetaAppReviewSubmissionsAPIService) BetaAppReviewSubmissionsCreateInstance(ctx context.Context, betaAppReviewSubmissionCreateRequest BetaAppReviewSubmissionCreateRequest) (ImplResponse, error) {
	// TODO - update BetaAppReviewSubmissionsCreateInstance with the required logic for this service method.
	// Add api_beta_app_review_submissions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, BetaAppReviewSubmissionResponse{}) or use other options such as http.Ok ...
	// return Response(201, BetaAppReviewSubmissionResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(409, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(409, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppReviewSubmissionsCreateInstance method not implemented")
}

// BetaAppReviewSubmissionsGetCollection - 
func (s *BetaAppReviewSubmissionsAPIService) BetaAppReviewSubmissionsGetCollection(ctx context.Context, filterBuild []string, filterBetaReviewState []string, fieldsBetaAppReviewSubmissions []string, limit int32, include []string, fieldsBuilds []string) (ImplResponse, error) {
	// TODO - update BetaAppReviewSubmissionsGetCollection with the required logic for this service method.
	// Add api_beta_app_review_submissions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BetaAppReviewSubmissionsResponse{}) or use other options such as http.Ok ...
	// return Response(200, BetaAppReviewSubmissionsResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppReviewSubmissionsGetCollection method not implemented")
}

// BetaAppReviewSubmissionsGetInstance - 
func (s *BetaAppReviewSubmissionsAPIService) BetaAppReviewSubmissionsGetInstance(ctx context.Context, id string, fieldsBetaAppReviewSubmissions []string, include []string, fieldsBuilds []string) (ImplResponse, error) {
	// TODO - update BetaAppReviewSubmissionsGetInstance with the required logic for this service method.
	// Add api_beta_app_review_submissions_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, BetaAppReviewSubmissionResponse{}) or use other options such as http.Ok ...
	// return Response(200, BetaAppReviewSubmissionResponse{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(404, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(404, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("BetaAppReviewSubmissionsGetInstance method not implemented")
}
