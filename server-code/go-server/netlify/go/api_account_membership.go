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

// AccountMembershipAPIController binds http requests to an api service and writes the service results to the http response
type AccountMembershipAPIController struct {
	service AccountMembershipAPIServicer
	errorHandler ErrorHandler
}

// AccountMembershipAPIOption for how the controller is set up.
type AccountMembershipAPIOption func(*AccountMembershipAPIController)

// WithAccountMembershipAPIErrorHandler inject ErrorHandler into controller
func WithAccountMembershipAPIErrorHandler(h ErrorHandler) AccountMembershipAPIOption {
	return func(c *AccountMembershipAPIController) {
		c.errorHandler = h
	}
}

// NewAccountMembershipAPIController creates a default api controller
func NewAccountMembershipAPIController(s AccountMembershipAPIServicer, opts ...AccountMembershipAPIOption) Router {
	controller := &AccountMembershipAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AccountMembershipAPIController
func (c *AccountMembershipAPIController) Routes() Routes {
	return Routes{
		"CancelAccount": Route{
			strings.ToUpper("Delete"),
			"/api/v1/accounts/{account_id}",
			c.CancelAccount,
		},
		"CreateAccount": Route{
			strings.ToUpper("Post"),
			"/api/v1/accounts",
			c.CreateAccount,
		},
		"GetAccount": Route{
			strings.ToUpper("Get"),
			"/api/v1/accounts/{account_id}",
			c.GetAccount,
		},
		"ListAccountsForUser": Route{
			strings.ToUpper("Get"),
			"/api/v1/accounts",
			c.ListAccountsForUser,
		},
		"UpdateAccount": Route{
			strings.ToUpper("Put"),
			"/api/v1/accounts/{account_id}",
			c.UpdateAccount,
		},
	}
}

// CancelAccount - 
func (c *AccountMembershipAPIController) CancelAccount(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	accountIdParam := params["account_id"]
	if accountIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"account_id"}, nil)
		return
	}
	result, err := c.service.CancelAccount(r.Context(), accountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateAccount - 
func (c *AccountMembershipAPIController) CreateAccount(w http.ResponseWriter, r *http.Request) {
	accountSetupParam := AccountSetup{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&accountSetupParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAccountSetupRequired(accountSetupParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAccountSetupConstraints(accountSetupParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateAccount(r.Context(), accountSetupParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetAccount - 
func (c *AccountMembershipAPIController) GetAccount(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	accountIdParam := params["account_id"]
	if accountIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"account_id"}, nil)
		return
	}
	result, err := c.service.GetAccount(r.Context(), accountIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListAccountsForUser - 
func (c *AccountMembershipAPIController) ListAccountsForUser(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.ListAccountsForUser(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateAccount - 
func (c *AccountMembershipAPIController) UpdateAccount(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	accountIdParam := params["account_id"]
	if accountIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"account_id"}, nil)
		return
	}
	accountUpdateSetupParam := AccountUpdateSetup{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&accountUpdateSetupParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAccountUpdateSetupRequired(accountUpdateSetupParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAccountUpdateSetupConstraints(accountUpdateSetupParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateAccount(r.Context(), accountIdParam, accountUpdateSetupParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
