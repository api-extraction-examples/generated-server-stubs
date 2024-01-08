/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * API version: v1.9.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// ProgramAPIService is a service that implements the logic for the ProgramAPIServicer
// This service should implement the business logic for every endpoint for the ProgramAPI API.
// Include any external packages or services that will be required by this service.
type ProgramAPIService struct {
}

// NewProgramAPIService creates a default api service
func NewProgramAPIService() ProgramAPIServicer {
	return &ProgramAPIService{}
}

// GetOptedInPrograms - 
func (s *ProgramAPIService) GetOptedInPrograms(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetOptedInPrograms with the required logic for this service method.
	// Add api_program_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, Programs{}) or use other options such as http.Ok ...
	// return Response(200, Programs{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetOptedInPrograms method not implemented")
}

// OptInToProgram - 
func (s *ProgramAPIService) OptInToProgram(ctx context.Context, program Program) (ImplResponse, error) {
	// TODO - update OptInToProgram with the required logic for this service method.
	// Add api_program_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, map[string]interface{}{}) or use other options such as http.Ok ...
	// return Response(200, map[string]interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("OptInToProgram method not implemented")
}

// OptOutOfProgram - 
func (s *ProgramAPIService) OptOutOfProgram(ctx context.Context, program Program) (ImplResponse, error) {
	// TODO - update OptOutOfProgram with the required logic for this service method.
	// Add api_program_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, map[string]interface{}{}) or use other options such as http.Ok ...
	// return Response(200, map[string]interface{}{}), nil

	// TODO: Uncomment the next line to return response Response(400, {}) or use other options such as http.Ok ...
	// return Response(400, nil),nil

	// TODO: Uncomment the next line to return response Response(404, {}) or use other options such as http.Ok ...
	// return Response(404, nil),nil

	// TODO: Uncomment the next line to return response Response(409, {}) or use other options such as http.Ok ...
	// return Response(409, nil),nil

	// TODO: Uncomment the next line to return response Response(500, {}) or use other options such as http.Ok ...
	// return Response(500, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("OptOutOfProgram method not implemented")
}
