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
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// ReturnPolicyAPIController binds http requests to an api service and writes the service results to the http response
type ReturnPolicyAPIController struct {
	service ReturnPolicyAPIServicer
	errorHandler ErrorHandler
}

// ReturnPolicyAPIOption for how the controller is set up.
type ReturnPolicyAPIOption func(*ReturnPolicyAPIController)

// WithReturnPolicyAPIErrorHandler inject ErrorHandler into controller
func WithReturnPolicyAPIErrorHandler(h ErrorHandler) ReturnPolicyAPIOption {
	return func(c *ReturnPolicyAPIController) {
		c.errorHandler = h
	}
}

// NewReturnPolicyAPIController creates a default api controller
func NewReturnPolicyAPIController(s ReturnPolicyAPIServicer, opts ...ReturnPolicyAPIOption) Router {
	controller := &ReturnPolicyAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ReturnPolicyAPIController
func (c *ReturnPolicyAPIController) Routes() Routes {
	return Routes{
		"CreateReturnPolicy": Route{
			strings.ToUpper("Post"),
			"/sell/account/v1/return_policy",
			c.CreateReturnPolicy,
		},
		"DeleteReturnPolicy": Route{
			strings.ToUpper("Delete"),
			"/sell/account/v1/return_policy/{return_policy_id}",
			c.DeleteReturnPolicy,
		},
		"GetReturnPolicies": Route{
			strings.ToUpper("Get"),
			"/sell/account/v1/return_policy",
			c.GetReturnPolicies,
		},
		"GetReturnPolicy": Route{
			strings.ToUpper("Get"),
			"/sell/account/v1/return_policy/{return_policy_id}",
			c.GetReturnPolicy,
		},
		"GetReturnPolicyByName": Route{
			strings.ToUpper("Get"),
			"/sell/account/v1/return_policy/get_by_policy_name",
			c.GetReturnPolicyByName,
		},
		"UpdateReturnPolicy": Route{
			strings.ToUpper("Put"),
			"/sell/account/v1/return_policy/{return_policy_id}",
			c.UpdateReturnPolicy,
		},
	}
}

// CreateReturnPolicy - 
func (c *ReturnPolicyAPIController) CreateReturnPolicy(w http.ResponseWriter, r *http.Request) {
	returnPolicyRequestParam := ReturnPolicyRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&returnPolicyRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertReturnPolicyRequestRequired(returnPolicyRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertReturnPolicyRequestConstraints(returnPolicyRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateReturnPolicy(r.Context(), returnPolicyRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteReturnPolicy - 
func (c *ReturnPolicyAPIController) DeleteReturnPolicy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	returnPolicyIdParam := params["return_policy_id"]
	if returnPolicyIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"return_policy_id"}, nil)
		return
	}
	result, err := c.service.DeleteReturnPolicy(r.Context(), returnPolicyIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetReturnPolicies - 
func (c *ReturnPolicyAPIController) GetReturnPolicies(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var marketplaceIdParam string
	if query.Has("marketplace_id") {
		param := query.Get("marketplace_id")

		marketplaceIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "marketplace_id"}, nil)
		return
	}
	result, err := c.service.GetReturnPolicies(r.Context(), marketplaceIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetReturnPolicy - 
func (c *ReturnPolicyAPIController) GetReturnPolicy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	returnPolicyIdParam := params["return_policy_id"]
	if returnPolicyIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"return_policy_id"}, nil)
		return
	}
	result, err := c.service.GetReturnPolicy(r.Context(), returnPolicyIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetReturnPolicyByName - 
func (c *ReturnPolicyAPIController) GetReturnPolicyByName(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var marketplaceIdParam string
	if query.Has("marketplace_id") {
		param := query.Get("marketplace_id")

		marketplaceIdParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "marketplace_id"}, nil)
		return
	}
	var nameParam string
	if query.Has("name") {
		param := query.Get("name")

		nameParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "name"}, nil)
		return
	}
	result, err := c.service.GetReturnPolicyByName(r.Context(), marketplaceIdParam, nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateReturnPolicy - 
func (c *ReturnPolicyAPIController) UpdateReturnPolicy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	returnPolicyIdParam := params["return_policy_id"]
	if returnPolicyIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"return_policy_id"}, nil)
		return
	}
	returnPolicyRequestParam := ReturnPolicyRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&returnPolicyRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertReturnPolicyRequestRequired(returnPolicyRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertReturnPolicyRequestConstraints(returnPolicyRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateReturnPolicy(r.Context(), returnPolicyIdParam, returnPolicyRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
