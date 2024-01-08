/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * API version: 2.10.50
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// AttributesAPIController binds http requests to an api service and writes the service results to the http response
type AttributesAPIController struct {
	service AttributesAPIServicer
	errorHandler ErrorHandler
}

// AttributesAPIOption for how the controller is set up.
type AttributesAPIOption func(*AttributesAPIController)

// WithAttributesAPIErrorHandler inject ErrorHandler into controller
func WithAttributesAPIErrorHandler(h ErrorHandler) AttributesAPIOption {
	return func(c *AttributesAPIController) {
		c.errorHandler = h
	}
}

// NewAttributesAPIController creates a default api controller
func NewAttributesAPIController(s AttributesAPIServicer, opts ...AttributesAPIOption) Router {
	controller := &AttributesAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AttributesAPIController
func (c *AttributesAPIController) Routes() Routes {
	return Routes{
		"AttributeNamespaceAttributeNameDelete": Route{
			strings.ToUpper("Delete"),
			"/attribute/{namespace}/{attribute_name}",
			c.AttributeNamespaceAttributeNameDelete,
		},
		"AttributeNamespaceAttributeNameMetaDelete": Route{
			strings.ToUpper("Delete"),
			"/attribute/{namespace}/{attribute_name}/_meta",
			c.AttributeNamespaceAttributeNameMetaDelete,
		},
		"AttributeNamespaceAttributeNameMetaGet": Route{
			strings.ToUpper("Get"),
			"/attribute/{namespace}/{attribute_name}/_meta",
			c.AttributeNamespaceAttributeNameMetaGet,
		},
		"AttributeNamespaceAttributeNameMetaPost": Route{
			strings.ToUpper("Post"),
			"/attribute/{namespace}/{attribute_name}/_meta",
			c.AttributeNamespaceAttributeNameMetaPost,
		},
		"AttributeNamespaceAttributeNameMetaPut": Route{
			strings.ToUpper("Put"),
			"/attribute/{namespace}/{attribute_name}/_meta",
			c.AttributeNamespaceAttributeNameMetaPut,
		},
	}
}

// AttributeNamespaceAttributeNameDelete - Delete an attribute and all its values in projects or packages.
func (c *AttributesAPIController) AttributeNamespaceAttributeNameDelete(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	attributeNameParam := params["attribute_name"]
	if attributeNameParam == "" {
		c.errorHandler(w, r, &RequiredError{"attribute_name"}, nil)
		return
	}
	result, err := c.service.AttributeNamespaceAttributeNameDelete(r.Context(), attributeNameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AttributeNamespaceAttributeNameMetaDelete - Delete an attribute and all its values in projects or packages.
func (c *AttributesAPIController) AttributeNamespaceAttributeNameMetaDelete(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.AttributeNamespaceAttributeNameMetaDelete(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AttributeNamespaceAttributeNameMetaGet - Shows attribute.
func (c *AttributesAPIController) AttributeNamespaceAttributeNameMetaGet(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.AttributeNamespaceAttributeNameMetaGet(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AttributeNamespaceAttributeNameMetaPost - Change attribute data. Create an attribute if it doesn't exist.
func (c *AttributesAPIController) AttributeNamespaceAttributeNameMetaPost(w http.ResponseWriter, r *http.Request) {
	bodyParam := Object{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.AttributeNamespaceAttributeNameMetaPost(r.Context(), bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AttributeNamespaceAttributeNameMetaPut - Change attribute data. Create an attribute if it doesn't exist.
func (c *AttributesAPIController) AttributeNamespaceAttributeNameMetaPut(w http.ResponseWriter, r *http.Request) {
	bodyParam := Object{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.AttributeNamespaceAttributeNameMetaPut(r.Context(), bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
