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

// SalesReportsAPIService is a service that implements the logic for the SalesReportsAPIServicer
// This service should implement the business logic for every endpoint for the SalesReportsAPI API.
// Include any external packages or services that will be required by this service.
type SalesReportsAPIService struct {
}

// NewSalesReportsAPIService creates a default api service
func NewSalesReportsAPIService() SalesReportsAPIServicer {
	return &SalesReportsAPIService{}
}

// SalesReportsGetCollection - 
func (s *SalesReportsAPIService) SalesReportsGetCollection(ctx context.Context, filterFrequency []string, filterReportSubType []string, filterReportType []string, filterVendorNumber []string, filterReportDate []string, filterVersion []string) (ImplResponse, error) {
	// TODO - update SalesReportsGetCollection with the required logic for this service method.
	// Add api_sales_reports_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, *os.File{}) or use other options such as http.Ok ...
	// return Response(200, *os.File{}), nil

	// TODO: Uncomment the next line to return response Response(400, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(400, ErrorResponse{}), nil

	// TODO: Uncomment the next line to return response Response(403, ErrorResponse{}) or use other options such as http.Ok ...
	// return Response(403, ErrorResponse{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("SalesReportsGetCollection method not implemented")
}
