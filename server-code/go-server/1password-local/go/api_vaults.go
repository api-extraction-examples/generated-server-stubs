/*
 * 1Password Connect
 *
 * REST API interface for 1Password Connect.
 *
 * API version: 1.5.7
 * Contact: support@1password.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// VaultsAPIController binds http requests to an api service and writes the service results to the http response
type VaultsAPIController struct {
	service VaultsAPIServicer
	errorHandler ErrorHandler
}

// VaultsAPIOption for how the controller is set up.
type VaultsAPIOption func(*VaultsAPIController)

// WithVaultsAPIErrorHandler inject ErrorHandler into controller
func WithVaultsAPIErrorHandler(h ErrorHandler) VaultsAPIOption {
	return func(c *VaultsAPIController) {
		c.errorHandler = h
	}
}

// NewVaultsAPIController creates a default api controller
func NewVaultsAPIController(s VaultsAPIServicer, opts ...VaultsAPIOption) Router {
	controller := &VaultsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the VaultsAPIController
func (c *VaultsAPIController) Routes() Routes {
	return Routes{
		"GetVaultById": Route{
			strings.ToUpper("Get"),
			"/vaults/{vaultUuid}",
			c.GetVaultById,
		},
		"GetVaults": Route{
			strings.ToUpper("Get"),
			"/vaults",
			c.GetVaults,
		},
	}
}

// GetVaultById - Get Vault details and metadata
func (c *VaultsAPIController) GetVaultById(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	vaultUuidParam := params["vaultUuid"]
	if vaultUuidParam == "" {
		c.errorHandler(w, r, &RequiredError{"vaultUuid"}, nil)
		return
	}
	result, err := c.service.GetVaultById(r.Context(), vaultUuidParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetVaults - Get all Vaults
func (c *VaultsAPIController) GetVaults(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var filterParam string
	if query.Has("filter") {
		param := query.Get("filter")

		filterParam = param
	} else {
	}
	result, err := c.service.GetVaults(r.Context(), filterParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
