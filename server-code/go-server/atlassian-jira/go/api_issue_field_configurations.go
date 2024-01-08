/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"
	"reflect"

	"github.com/gorilla/mux"
)

// IssueFieldConfigurationsAPIController binds http requests to an api service and writes the service results to the http response
type IssueFieldConfigurationsAPIController struct {
	service IssueFieldConfigurationsAPIServicer
	errorHandler ErrorHandler
}

// IssueFieldConfigurationsAPIOption for how the controller is set up.
type IssueFieldConfigurationsAPIOption func(*IssueFieldConfigurationsAPIController)

// WithIssueFieldConfigurationsAPIErrorHandler inject ErrorHandler into controller
func WithIssueFieldConfigurationsAPIErrorHandler(h ErrorHandler) IssueFieldConfigurationsAPIOption {
	return func(c *IssueFieldConfigurationsAPIController) {
		c.errorHandler = h
	}
}

// NewIssueFieldConfigurationsAPIController creates a default api controller
func NewIssueFieldConfigurationsAPIController(s IssueFieldConfigurationsAPIServicer, opts ...IssueFieldConfigurationsAPIOption) Router {
	controller := &IssueFieldConfigurationsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the IssueFieldConfigurationsAPIController
func (c *IssueFieldConfigurationsAPIController) Routes() Routes {
	return Routes{
		"AssignFieldConfigurationSchemeToProject": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/fieldconfigurationscheme/project",
			c.AssignFieldConfigurationSchemeToProject,
		},
		"CreateFieldConfiguration": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/fieldconfiguration",
			c.CreateFieldConfiguration,
		},
		"CreateFieldConfigurationScheme": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/fieldconfigurationscheme",
			c.CreateFieldConfigurationScheme,
		},
		"DeleteFieldConfiguration": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/fieldconfiguration/{id}",
			c.DeleteFieldConfiguration,
		},
		"DeleteFieldConfigurationScheme": Route{
			strings.ToUpper("Delete"),
			"/rest/api/3/fieldconfigurationscheme/{id}",
			c.DeleteFieldConfigurationScheme,
		},
		"GetAllFieldConfigurationSchemes": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/fieldconfigurationscheme",
			c.GetAllFieldConfigurationSchemes,
		},
		"GetAllFieldConfigurations": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/fieldconfiguration",
			c.GetAllFieldConfigurations,
		},
		"GetFieldConfigurationItems": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/fieldconfiguration/{id}/fields",
			c.GetFieldConfigurationItems,
		},
		"GetFieldConfigurationSchemeMappings": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/fieldconfigurationscheme/mapping",
			c.GetFieldConfigurationSchemeMappings,
		},
		"GetFieldConfigurationSchemeProjectMapping": Route{
			strings.ToUpper("Get"),
			"/rest/api/3/fieldconfigurationscheme/project",
			c.GetFieldConfigurationSchemeProjectMapping,
		},
		"RemoveIssueTypesFromGlobalFieldConfigurationScheme": Route{
			strings.ToUpper("Post"),
			"/rest/api/3/fieldconfigurationscheme/{id}/mapping/delete",
			c.RemoveIssueTypesFromGlobalFieldConfigurationScheme,
		},
		"SetFieldConfigurationSchemeMapping": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/fieldconfigurationscheme/{id}/mapping",
			c.SetFieldConfigurationSchemeMapping,
		},
		"UpdateFieldConfiguration": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/fieldconfiguration/{id}",
			c.UpdateFieldConfiguration,
		},
		"UpdateFieldConfigurationItems": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/fieldconfiguration/{id}/fields",
			c.UpdateFieldConfigurationItems,
		},
		"UpdateFieldConfigurationScheme": Route{
			strings.ToUpper("Put"),
			"/rest/api/3/fieldconfigurationscheme/{id}",
			c.UpdateFieldConfigurationScheme,
		},
	}
}

// AssignFieldConfigurationSchemeToProject - Assign field configuration scheme to project
func (c *IssueFieldConfigurationsAPIController) AssignFieldConfigurationSchemeToProject(w http.ResponseWriter, r *http.Request) {
	fieldConfigurationSchemeProjectAssociationParam := FieldConfigurationSchemeProjectAssociation{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&fieldConfigurationSchemeProjectAssociationParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertFieldConfigurationSchemeProjectAssociationRequired(fieldConfigurationSchemeProjectAssociationParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertFieldConfigurationSchemeProjectAssociationConstraints(fieldConfigurationSchemeProjectAssociationParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AssignFieldConfigurationSchemeToProject(r.Context(), fieldConfigurationSchemeProjectAssociationParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateFieldConfiguration - Create field configuration
func (c *IssueFieldConfigurationsAPIController) CreateFieldConfiguration(w http.ResponseWriter, r *http.Request) {
	fieldConfigurationDetailsParam := FieldConfigurationDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&fieldConfigurationDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertFieldConfigurationDetailsRequired(fieldConfigurationDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertFieldConfigurationDetailsConstraints(fieldConfigurationDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateFieldConfiguration(r.Context(), fieldConfigurationDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateFieldConfigurationScheme - Create field configuration scheme
func (c *IssueFieldConfigurationsAPIController) CreateFieldConfigurationScheme(w http.ResponseWriter, r *http.Request) {
	updateFieldConfigurationSchemeDetailsParam := UpdateFieldConfigurationSchemeDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateFieldConfigurationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateFieldConfigurationSchemeDetailsRequired(updateFieldConfigurationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateFieldConfigurationSchemeDetailsConstraints(updateFieldConfigurationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateFieldConfigurationScheme(r.Context(), updateFieldConfigurationSchemeDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteFieldConfiguration - Delete field configuration
func (c *IssueFieldConfigurationsAPIController) DeleteFieldConfiguration(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.DeleteFieldConfiguration(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteFieldConfigurationScheme - Delete field configuration scheme
func (c *IssueFieldConfigurationsAPIController) DeleteFieldConfigurationScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.DeleteFieldConfigurationScheme(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetAllFieldConfigurationSchemes - Get all field configuration schemes
func (c *IssueFieldConfigurationsAPIController) GetAllFieldConfigurationSchemes(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 50
		maxResultsParam = param
	}
	idParam, err := parseNumericArrayParameter[int64](
		query.Get("id"), ",", false,
		WithParse[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.GetAllFieldConfigurationSchemes(r.Context(), startAtParam, maxResultsParam, idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetAllFieldConfigurations - Get all field configurations
func (c *IssueFieldConfigurationsAPIController) GetAllFieldConfigurations(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 50
		maxResultsParam = param
	}
	idParam, err := parseNumericArrayParameter[int64](
		query.Get("id"), ",", false,
		WithParse[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var isDefaultParam bool
	if query.Has("isDefault") {
		param, err := parseBoolParameter(
			query.Get("isDefault"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isDefaultParam = param
	} else {
		var param bool = false
		isDefaultParam = param
	}
	var queryParam string
	if query.Has("query") {
		param := query.Get("query")

		queryParam = param
	} else {
		param := 
		queryParam = param
	}
	result, err := c.service.GetAllFieldConfigurations(r.Context(), startAtParam, maxResultsParam, idParam, isDefaultParam, queryParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetFieldConfigurationItems - Get field configuration items
func (c *IssueFieldConfigurationsAPIController) GetFieldConfigurationItems(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 50
		maxResultsParam = param
	}
	result, err := c.service.GetFieldConfigurationItems(r.Context(), idParam, startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetFieldConfigurationSchemeMappings - Get field configuration issue type items
func (c *IssueFieldConfigurationsAPIController) GetFieldConfigurationSchemeMappings(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 50
		maxResultsParam = param
	}
	fieldConfigurationSchemeIdParam, err := parseNumericArrayParameter[int64](
		query.Get("fieldConfigurationSchemeId"), ",", false,
		WithParse[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	result, err := c.service.GetFieldConfigurationSchemeMappings(r.Context(), startAtParam, maxResultsParam, fieldConfigurationSchemeIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetFieldConfigurationSchemeProjectMapping - Get field configuration schemes for projects
func (c *IssueFieldConfigurationsAPIController) GetFieldConfigurationSchemeProjectMapping(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	projectIdParam, err := parseNumericArrayParameter[int64](
		query.Get("projectId"), ",", true,
		WithParse[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var startAtParam int64
	if query.Has("startAt") {
		param, err := parseNumericParameter[int64](
			query.Get("startAt"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startAtParam = param
	} else {
		var param int64 = 0
		startAtParam = param
	}
	var maxResultsParam int32
	if query.Has("maxResults") {
		param, err := parseNumericParameter[int32](
			query.Get("maxResults"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		maxResultsParam = param
	} else {
		var param int32 = 50
		maxResultsParam = param
	}
	result, err := c.service.GetFieldConfigurationSchemeProjectMapping(r.Context(), projectIdParam, startAtParam, maxResultsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RemoveIssueTypesFromGlobalFieldConfigurationScheme - Remove issue types from field configuration scheme
func (c *IssueFieldConfigurationsAPIController) RemoveIssueTypesFromGlobalFieldConfigurationScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	issueTypeIdsToRemoveParam := IssueTypeIdsToRemove{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&issueTypeIdsToRemoveParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertIssueTypeIdsToRemoveRequired(issueTypeIdsToRemoveParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertIssueTypeIdsToRemoveConstraints(issueTypeIdsToRemoveParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.RemoveIssueTypesFromGlobalFieldConfigurationScheme(r.Context(), idParam, issueTypeIdsToRemoveParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// SetFieldConfigurationSchemeMapping - Assign issue types to field configurations
func (c *IssueFieldConfigurationsAPIController) SetFieldConfigurationSchemeMapping(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	associateFieldConfigurationsWithIssueTypesRequestParam := AssociateFieldConfigurationsWithIssueTypesRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&associateFieldConfigurationsWithIssueTypesRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAssociateFieldConfigurationsWithIssueTypesRequestRequired(associateFieldConfigurationsWithIssueTypesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAssociateFieldConfigurationsWithIssueTypesRequestConstraints(associateFieldConfigurationsWithIssueTypesRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.SetFieldConfigurationSchemeMapping(r.Context(), idParam, associateFieldConfigurationsWithIssueTypesRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateFieldConfiguration - Update field configuration
func (c *IssueFieldConfigurationsAPIController) UpdateFieldConfiguration(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	fieldConfigurationDetailsParam := FieldConfigurationDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&fieldConfigurationDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertFieldConfigurationDetailsRequired(fieldConfigurationDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertFieldConfigurationDetailsConstraints(fieldConfigurationDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateFieldConfiguration(r.Context(), idParam, fieldConfigurationDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateFieldConfigurationItems - Update field configuration items
func (c *IssueFieldConfigurationsAPIController) UpdateFieldConfigurationItems(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	fieldConfigurationItemsDetailsParam := FieldConfigurationItemsDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&fieldConfigurationItemsDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertFieldConfigurationItemsDetailsRequired(fieldConfigurationItemsDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertFieldConfigurationItemsDetailsConstraints(fieldConfigurationItemsDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateFieldConfigurationItems(r.Context(), idParam, fieldConfigurationItemsDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// UpdateFieldConfigurationScheme - Update field configuration scheme
func (c *IssueFieldConfigurationsAPIController) UpdateFieldConfigurationScheme(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam, err := parseNumericParameter[int64](
		params["id"],
		WithRequire[int64](parseInt64),
	)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	updateFieldConfigurationSchemeDetailsParam := UpdateFieldConfigurationSchemeDetails{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&updateFieldConfigurationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertUpdateFieldConfigurationSchemeDetailsRequired(updateFieldConfigurationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertUpdateFieldConfigurationSchemeDetailsConstraints(updateFieldConfigurationSchemeDetailsParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.UpdateFieldConfigurationScheme(r.Context(), idParam, updateFieldConfigurationSchemeDetailsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
