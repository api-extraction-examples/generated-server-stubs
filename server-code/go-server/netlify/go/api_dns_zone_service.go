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

// DnsZoneAPIService is a service that implements the logic for the DnsZoneAPIServicer
// This service should implement the business logic for every endpoint for the DnsZoneAPI API.
// Include any external packages or services that will be required by this service.
type DnsZoneAPIService struct {
}

// NewDnsZoneAPIService creates a default api service
func NewDnsZoneAPIService() DnsZoneAPIServicer {
	return &DnsZoneAPIService{}
}

// ConfigureDNSForSite - 
func (s *DnsZoneAPIService) ConfigureDNSForSite(ctx context.Context, siteId string) (ImplResponse, error) {
	// TODO - update ConfigureDNSForSite with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []DnsZone{}) or use other options such as http.Ok ...
	// return Response(200, []DnsZone{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("ConfigureDNSForSite method not implemented")
}

// CreateDnsRecord - 
func (s *DnsZoneAPIService) CreateDnsRecord(ctx context.Context, zoneId string, dnsRecord DnsRecordCreate) (ImplResponse, error) {
	// TODO - update CreateDnsRecord with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, DnsRecord{}) or use other options such as http.Ok ...
	// return Response(201, DnsRecord{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateDnsRecord method not implemented")
}

// CreateDnsZone - 
func (s *DnsZoneAPIService) CreateDnsZone(ctx context.Context, dnsZoneParams DnsZoneSetup) (ImplResponse, error) {
	// TODO - update CreateDnsZone with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(201, DnsZone{}) or use other options such as http.Ok ...
	// return Response(201, DnsZone{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("CreateDnsZone method not implemented")
}

// DeleteDnsRecord - 
func (s *DnsZoneAPIService) DeleteDnsRecord(ctx context.Context, zoneId string, dnsRecordId string) (ImplResponse, error) {
	// TODO - update DeleteDnsRecord with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteDnsRecord method not implemented")
}

// DeleteDnsZone - 
func (s *DnsZoneAPIService) DeleteDnsZone(ctx context.Context, zoneId string) (ImplResponse, error) {
	// TODO - update DeleteDnsZone with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("DeleteDnsZone method not implemented")
}

// GetDNSForSite - 
func (s *DnsZoneAPIService) GetDNSForSite(ctx context.Context, siteId string) (ImplResponse, error) {
	// TODO - update GetDNSForSite with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []DnsZone{}) or use other options such as http.Ok ...
	// return Response(200, []DnsZone{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDNSForSite method not implemented")
}

// GetDnsRecords - 
func (s *DnsZoneAPIService) GetDnsRecords(ctx context.Context, zoneId string) (ImplResponse, error) {
	// TODO - update GetDnsRecords with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []DnsRecord{}) or use other options such as http.Ok ...
	// return Response(200, []DnsRecord{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDnsRecords method not implemented")
}

// GetDnsZone - 
func (s *DnsZoneAPIService) GetDnsZone(ctx context.Context, zoneId string) (ImplResponse, error) {
	// TODO - update GetDnsZone with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DnsZone{}) or use other options such as http.Ok ...
	// return Response(200, DnsZone{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDnsZone method not implemented")
}

// GetDnsZones - 
func (s *DnsZoneAPIService) GetDnsZones(ctx context.Context, accountSlug string) (ImplResponse, error) {
	// TODO - update GetDnsZones with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, []DnsZone{}) or use other options such as http.Ok ...
	// return Response(200, []DnsZone{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetDnsZones method not implemented")
}

// GetIndividualDnsRecord - 
func (s *DnsZoneAPIService) GetIndividualDnsRecord(ctx context.Context, zoneId string, dnsRecordId string) (ImplResponse, error) {
	// TODO - update GetIndividualDnsRecord with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DnsRecord{}) or use other options such as http.Ok ...
	// return Response(200, DnsRecord{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetIndividualDnsRecord method not implemented")
}

// TransferDnsZone - 
func (s *DnsZoneAPIService) TransferDnsZone(ctx context.Context, zoneId string, accountId string, transferAccountId string, transferUserId string) (ImplResponse, error) {
	// TODO - update TransferDnsZone with the required logic for this service method.
	// Add api_dns_zone_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, DnsZone{}) or use other options such as http.Ok ...
	// return Response(200, DnsZone{}), nil

	// TODO: Uncomment the next line to return response Response(0, ModelError{}) or use other options such as http.Ok ...
	// return Response(0, ModelError{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("TransferDnsZone method not implemented")
}
