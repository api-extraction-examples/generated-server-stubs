/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * API version: 2.16.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// SubmissionAPIService is a service that implements the logic for the SubmissionAPIServicer
// This service should implement the business logic for every endpoint for the SubmissionAPI API.
// Include any external packages or services that will be required by this service.
type SubmissionAPIService struct {
}

// NewSubmissionAPIService creates a default api service
func NewSubmissionAPIService() SubmissionAPIServicer {
	return &SubmissionAPIService{}
}

// DeleteSubmission - 
func (s *SubmissionAPIService) DeleteSubmission(ctx context.Context, submissionId string) (ImplResponse, error) {
	// TODO - update DeleteSubmission with the required logic for this service method.
	// Add api_submission_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteSubmission method not implemented")
}

// ListFormSubmission - 
func (s *SubmissionAPIService) ListFormSubmission(ctx context.Context, submissionId string, query string, page int32, perPage int32) (ImplResponse, error) {
	// TODO - update ListFormSubmission with the required logic for this service method.
	// Add api_submission_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Submission{}) or use other options such as http.Ok ...
	// return Response(200, []Submission{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListFormSubmission method not implemented")
}

// ListFormSubmissions - 
func (s *SubmissionAPIService) ListFormSubmissions(ctx context.Context, formId string, page int32, perPage int32) (ImplResponse, error) {
	// TODO - update ListFormSubmissions with the required logic for this service method.
	// Add api_submission_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Submission{}) or use other options such as http.Ok ...
	// return Response(200, []Submission{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListFormSubmissions method not implemented")
}

// ListSiteSubmissions - 
func (s *SubmissionAPIService) ListSiteSubmissions(ctx context.Context, siteId string, page int32, perPage int32) (ImplResponse, error) {
	// TODO - update ListSiteSubmissions with the required logic for this service method.
	// Add api_submission_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []Submission{}) or use other options such as http.Ok ...
	// return Response(200, []Submission{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ListSiteSubmissions method not implemented")
}
