/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// OrganizationExportsAPIController binds http requests to an api service and writes the service results to the http response
type OrganizationExportsAPIController struct {
	service OrganizationExportsAPIServicer
	errorHandler ErrorHandler
}

// OrganizationExportsAPIOption for how the controller is set up.
type OrganizationExportsAPIOption func(*OrganizationExportsAPIController)

// WithOrganizationExportsAPIErrorHandler inject ErrorHandler into controller
func WithOrganizationExportsAPIErrorHandler(h ErrorHandler) OrganizationExportsAPIOption {
	return func(c *OrganizationExportsAPIController) {
		c.errorHandler = h
	}
}

// NewOrganizationExportsAPIController creates a default api controller
func NewOrganizationExportsAPIController(s OrganizationExportsAPIServicer, opts ...OrganizationExportsAPIOption) Router {
	controller := &OrganizationExportsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the OrganizationExportsAPIController
func (c *OrganizationExportsAPIController) Routes() Routes {
	return Routes{
		"CreateOrganizationExport": Route{
			strings.ToUpper("Post"),
			"/api/1.0/organization_exports",
			c.CreateOrganizationExport,
		},
		"GetOrganizationExport": Route{
			strings.ToUpper("Get"),
			"/api/1.0/organization_exports/{organization_export_gid}",
			c.GetOrganizationExport,
		},
	}
}

// CreateOrganizationExport - Create an organization export request
func (c *OrganizationExportsAPIController) CreateOrganizationExport(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	createOrganizationExportRequestParam := CreateOrganizationExportRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createOrganizationExportRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateOrganizationExportRequestRequired(createOrganizationExportRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateOrganizationExportRequestConstraints(createOrganizationExportRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	var optPrettyParam bool
	if query.Has("opt_pretty") {
		param, err := parseBoolParameter(
			query.Get("opt_pretty"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		optPrettyParam = param
	} else {
	}
	var optFieldsParam []string
	if query.Has("opt_fields") {
		optFieldsParam = strings.Split(query.Get("opt_fields"), ",")
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
	}
	var offsetParam string
	if query.Has("offset") {
		param := query.Get("offset")

		offsetParam = param
	} else {
	}
	result, err := c.service.CreateOrganizationExport(r.Context(), createOrganizationExportRequestParam, optPrettyParam, optFieldsParam, limitParam, offsetParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetOrganizationExport - Get details on an org export request
func (c *OrganizationExportsAPIController) GetOrganizationExport(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	organizationExportGidParam := params["organization_export_gid"]
	if organizationExportGidParam == "" {
		c.errorHandler(w, r, &RequiredError{"organization_export_gid"}, nil)
		return
	}
	var optPrettyParam bool
	if query.Has("opt_pretty") {
		param, err := parseBoolParameter(
			query.Get("opt_pretty"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		optPrettyParam = param
	} else {
	}
	var optFieldsParam []string
	if query.Has("opt_fields") {
		optFieldsParam = strings.Split(query.Get("opt_fields"), ",")
	}
	result, err := c.service.GetOrganizationExport(r.Context(), organizationExportGidParam, optPrettyParam, optFieldsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}