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
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// DnsZoneAPIController binds http requests to an api service and writes the service results to the http response
type DnsZoneAPIController struct {
	service DnsZoneAPIServicer
	errorHandler ErrorHandler
}

// DnsZoneAPIOption for how the controller is set up.
type DnsZoneAPIOption func(*DnsZoneAPIController)

// WithDnsZoneAPIErrorHandler inject ErrorHandler into controller
func WithDnsZoneAPIErrorHandler(h ErrorHandler) DnsZoneAPIOption {
	return func(c *DnsZoneAPIController) {
		c.errorHandler = h
	}
}

// NewDnsZoneAPIController creates a default api controller
func NewDnsZoneAPIController(s DnsZoneAPIServicer, opts ...DnsZoneAPIOption) Router {
	controller := &DnsZoneAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the DnsZoneAPIController
func (c *DnsZoneAPIController) Routes() Routes {
	return Routes{
		"ConfigureDNSForSite": Route{
			strings.ToUpper("Put"),
			"/api/v1/sites/{site_id}/dns",
			c.ConfigureDNSForSite,
		},
		"CreateDnsRecord": Route{
			strings.ToUpper("Post"),
			"/api/v1/dns_zones/{zone_id}/dns_records",
			c.CreateDnsRecord,
		},
		"CreateDnsZone": Route{
			strings.ToUpper("Post"),
			"/api/v1/dns_zones",
			c.CreateDnsZone,
		},
		"DeleteDnsRecord": Route{
			strings.ToUpper("Delete"),
			"/api/v1/dns_zones/{zone_id}/dns_records/{dns_record_id}",
			c.DeleteDnsRecord,
		},
		"DeleteDnsZone": Route{
			strings.ToUpper("Delete"),
			"/api/v1/dns_zones/{zone_id}",
			c.DeleteDnsZone,
		},
		"GetDNSForSite": Route{
			strings.ToUpper("Get"),
			"/api/v1/sites/{site_id}/dns",
			c.GetDNSForSite,
		},
		"GetDnsRecords": Route{
			strings.ToUpper("Get"),
			"/api/v1/dns_zones/{zone_id}/dns_records",
			c.GetDnsRecords,
		},
		"GetDnsZone": Route{
			strings.ToUpper("Get"),
			"/api/v1/dns_zones/{zone_id}",
			c.GetDnsZone,
		},
		"GetDnsZones": Route{
			strings.ToUpper("Get"),
			"/api/v1/dns_zones",
			c.GetDnsZones,
		},
		"GetIndividualDnsRecord": Route{
			strings.ToUpper("Get"),
			"/api/v1/dns_zones/{zone_id}/dns_records/{dns_record_id}",
			c.GetIndividualDnsRecord,
		},
		"TransferDnsZone": Route{
			strings.ToUpper("Put"),
			"/api/v1/dns_zones/{zone_id}/transfer",
			c.TransferDnsZone,
		},
	}
}

// ConfigureDNSForSite - 
func (c *DnsZoneAPIController) ConfigureDNSForSite(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	result, err := c.service.ConfigureDNSForSite(r.Context(), siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateDnsRecord - 
func (c *DnsZoneAPIController) CreateDnsRecord(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	zoneIdParam := params["zone_id"]
	if zoneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"zone_id"}, nil)
		return
	}
	dnsRecordParam := DnsRecordCreate{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&dnsRecordParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertDnsRecordCreateRequired(dnsRecordParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertDnsRecordCreateConstraints(dnsRecordParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateDnsRecord(r.Context(), zoneIdParam, dnsRecordParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateDnsZone - 
func (c *DnsZoneAPIController) CreateDnsZone(w http.ResponseWriter, r *http.Request) {
	dnsZoneParamsParam := DnsZoneSetup{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&dnsZoneParamsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertDnsZoneSetupRequired(dnsZoneParamsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertDnsZoneSetupConstraints(dnsZoneParamsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateDnsZone(r.Context(), dnsZoneParamsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteDnsRecord - 
func (c *DnsZoneAPIController) DeleteDnsRecord(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	zoneIdParam := params["zone_id"]
	if zoneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"zone_id"}, nil)
		return
	}
	dnsRecordIdParam := params["dns_record_id"]
	if dnsRecordIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dns_record_id"}, nil)
		return
	}
	result, err := c.service.DeleteDnsRecord(r.Context(), zoneIdParam, dnsRecordIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteDnsZone - 
func (c *DnsZoneAPIController) DeleteDnsZone(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	zoneIdParam := params["zone_id"]
	if zoneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"zone_id"}, nil)
		return
	}
	result, err := c.service.DeleteDnsZone(r.Context(), zoneIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetDNSForSite - 
func (c *DnsZoneAPIController) GetDNSForSite(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	siteIdParam := params["site_id"]
	if siteIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"site_id"}, nil)
		return
	}
	result, err := c.service.GetDNSForSite(r.Context(), siteIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetDnsRecords - 
func (c *DnsZoneAPIController) GetDnsRecords(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	zoneIdParam := params["zone_id"]
	if zoneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"zone_id"}, nil)
		return
	}
	result, err := c.service.GetDnsRecords(r.Context(), zoneIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetDnsZone - 
func (c *DnsZoneAPIController) GetDnsZone(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	zoneIdParam := params["zone_id"]
	if zoneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"zone_id"}, nil)
		return
	}
	result, err := c.service.GetDnsZone(r.Context(), zoneIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetDnsZones - 
func (c *DnsZoneAPIController) GetDnsZones(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var accountSlugParam string
	if query.Has("account_slug") {
		param := query.Get("account_slug")

		accountSlugParam = param
	} else {
	}
	result, err := c.service.GetDnsZones(r.Context(), accountSlugParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetIndividualDnsRecord - 
func (c *DnsZoneAPIController) GetIndividualDnsRecord(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	zoneIdParam := params["zone_id"]
	if zoneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"zone_id"}, nil)
		return
	}
	dnsRecordIdParam := params["dns_record_id"]
	if dnsRecordIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"dns_record_id"}, nil)
		return
	}
	result, err := c.service.GetIndividualDnsRecord(r.Context(), zoneIdParam, dnsRecordIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// TransferDnsZone - 
func (c *DnsZoneAPIController) TransferDnsZone(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	zoneIdParam := params["zone_id"]
	if zoneIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"zone_id"}, nil)
		return
	}
	var accountIdParam string
	if query.Has("account_id") {
		param := query.Get("account_id")

		accountIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "account_id"}, nil)
		return
	}
	var transferAccountIdParam string
	if query.Has("transfer_account_id") {
		param := query.Get("transfer_account_id")

		transferAccountIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "transfer_account_id"}, nil)
		return
	}
	var transferUserIdParam string
	if query.Has("transfer_user_id") {
		param := query.Get("transfer_user_id")

		transferUserIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "transfer_user_id"}, nil)
		return
	}
	result, err := c.service.TransferDnsZone(r.Context(), zoneIdParam, accountIdParam, transferAccountIdParam, transferUserIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}