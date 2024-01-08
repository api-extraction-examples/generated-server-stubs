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
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// AppStoreVersionsAPIController binds http requests to an api service and writes the service results to the http response
type AppStoreVersionsAPIController struct {
	service AppStoreVersionsAPIServicer
	errorHandler ErrorHandler
}

// AppStoreVersionsAPIOption for how the controller is set up.
type AppStoreVersionsAPIOption func(*AppStoreVersionsAPIController)

// WithAppStoreVersionsAPIErrorHandler inject ErrorHandler into controller
func WithAppStoreVersionsAPIErrorHandler(h ErrorHandler) AppStoreVersionsAPIOption {
	return func(c *AppStoreVersionsAPIController) {
		c.errorHandler = h
	}
}

// NewAppStoreVersionsAPIController creates a default api controller
func NewAppStoreVersionsAPIController(s AppStoreVersionsAPIServicer, opts ...AppStoreVersionsAPIOption) Router {
	controller := &AppStoreVersionsAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the AppStoreVersionsAPIController
func (c *AppStoreVersionsAPIController) Routes() Routes {
	return Routes{
		"AppStoreVersionsAgeRatingDeclarationGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}/ageRatingDeclaration",
			c.AppStoreVersionsAgeRatingDeclarationGetToOneRelated,
		},
		"AppStoreVersionsAppStoreReviewDetailGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}/appStoreReviewDetail",
			c.AppStoreVersionsAppStoreReviewDetailGetToOneRelated,
		},
		"AppStoreVersionsAppStoreVersionLocalizationsGetToManyRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}/appStoreVersionLocalizations",
			c.AppStoreVersionsAppStoreVersionLocalizationsGetToManyRelated,
		},
		"AppStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}/appStoreVersionPhasedRelease",
			c.AppStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated,
		},
		"AppStoreVersionsAppStoreVersionSubmissionGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}/appStoreVersionSubmission",
			c.AppStoreVersionsAppStoreVersionSubmissionGetToOneRelated,
		},
		"AppStoreVersionsBuildGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}/build",
			c.AppStoreVersionsBuildGetToOneRelated,
		},
		"AppStoreVersionsBuildGetToOneRelationship": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}/relationships/build",
			c.AppStoreVersionsBuildGetToOneRelationship,
		},
		"AppStoreVersionsBuildUpdateToOneRelationship": Route{
			strings.ToUpper("Patch"),
			"/v1/appStoreVersions/{id}/relationships/build",
			c.AppStoreVersionsBuildUpdateToOneRelationship,
		},
		"AppStoreVersionsCreateInstance": Route{
			strings.ToUpper("Post"),
			"/v1/appStoreVersions",
			c.AppStoreVersionsCreateInstance,
		},
		"AppStoreVersionsDeleteInstance": Route{
			strings.ToUpper("Delete"),
			"/v1/appStoreVersions/{id}",
			c.AppStoreVersionsDeleteInstance,
		},
		"AppStoreVersionsGetInstance": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}",
			c.AppStoreVersionsGetInstance,
		},
		"AppStoreVersionsIdfaDeclarationGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}/idfaDeclaration",
			c.AppStoreVersionsIdfaDeclarationGetToOneRelated,
		},
		"AppStoreVersionsRoutingAppCoverageGetToOneRelated": Route{
			strings.ToUpper("Get"),
			"/v1/appStoreVersions/{id}/routingAppCoverage",
			c.AppStoreVersionsRoutingAppCoverageGetToOneRelated,
		},
		"AppStoreVersionsUpdateInstance": Route{
			strings.ToUpper("Patch"),
			"/v1/appStoreVersions/{id}",
			c.AppStoreVersionsUpdateInstance,
		},
	}
}

// AppStoreVersionsAgeRatingDeclarationGetToOneRelated - 
// Deprecated
func (c *AppStoreVersionsAPIController) AppStoreVersionsAgeRatingDeclarationGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAgeRatingDeclarationsParam []string
	if query.Has("fields[ageRatingDeclarations]") {
		fieldsAgeRatingDeclarationsParam = strings.Split(query.Get("fields[ageRatingDeclarations]"), ",")
	}
	result, err := c.service.AppStoreVersionsAgeRatingDeclarationGetToOneRelated(r.Context(), idParam, fieldsAgeRatingDeclarationsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsAppStoreReviewDetailGetToOneRelated - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsAppStoreReviewDetailGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppStoreReviewDetailsParam []string
	if query.Has("fields[appStoreReviewDetails]") {
		fieldsAppStoreReviewDetailsParam = strings.Split(query.Get("fields[appStoreReviewDetails]"), ",")
	}
	var fieldsAppStoreVersionsParam []string
	if query.Has("fields[appStoreVersions]") {
		fieldsAppStoreVersionsParam = strings.Split(query.Get("fields[appStoreVersions]"), ",")
	}
	var fieldsAppStoreReviewAttachmentsParam []string
	if query.Has("fields[appStoreReviewAttachments]") {
		fieldsAppStoreReviewAttachmentsParam = strings.Split(query.Get("fields[appStoreReviewAttachments]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	result, err := c.service.AppStoreVersionsAppStoreReviewDetailGetToOneRelated(r.Context(), idParam, fieldsAppStoreReviewDetailsParam, fieldsAppStoreVersionsParam, fieldsAppStoreReviewAttachmentsParam, includeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsAppStoreVersionLocalizationsGetToManyRelated - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsAppStoreVersionLocalizationsGetToManyRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppStoreVersionLocalizationsParam []string
	if query.Has("fields[appStoreVersionLocalizations]") {
		fieldsAppStoreVersionLocalizationsParam = strings.Split(query.Get("fields[appStoreVersionLocalizations]"), ",")
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](200),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
	}
	result, err := c.service.AppStoreVersionsAppStoreVersionLocalizationsGetToManyRelated(r.Context(), idParam, fieldsAppStoreVersionLocalizationsParam, limitParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppStoreVersionPhasedReleasesParam []string
	if query.Has("fields[appStoreVersionPhasedReleases]") {
		fieldsAppStoreVersionPhasedReleasesParam = strings.Split(query.Get("fields[appStoreVersionPhasedReleases]"), ",")
	}
	result, err := c.service.AppStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated(r.Context(), idParam, fieldsAppStoreVersionPhasedReleasesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsAppStoreVersionSubmissionGetToOneRelated - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsAppStoreVersionSubmissionGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppStoreVersionsParam []string
	if query.Has("fields[appStoreVersions]") {
		fieldsAppStoreVersionsParam = strings.Split(query.Get("fields[appStoreVersions]"), ",")
	}
	var fieldsAppStoreVersionSubmissionsParam []string
	if query.Has("fields[appStoreVersionSubmissions]") {
		fieldsAppStoreVersionSubmissionsParam = strings.Split(query.Get("fields[appStoreVersionSubmissions]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	result, err := c.service.AppStoreVersionsAppStoreVersionSubmissionGetToOneRelated(r.Context(), idParam, fieldsAppStoreVersionsParam, fieldsAppStoreVersionSubmissionsParam, includeParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsBuildGetToOneRelated - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsBuildGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsBuildsParam []string
	if query.Has("fields[builds]") {
		fieldsBuildsParam = strings.Split(query.Get("fields[builds]"), ",")
	}
	result, err := c.service.AppStoreVersionsBuildGetToOneRelated(r.Context(), idParam, fieldsBuildsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsBuildGetToOneRelationship - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsBuildGetToOneRelationship(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.AppStoreVersionsBuildGetToOneRelationship(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsBuildUpdateToOneRelationship - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsBuildUpdateToOneRelationship(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	appStoreVersionBuildLinkageRequestParam := AppStoreVersionBuildLinkageRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appStoreVersionBuildLinkageRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppStoreVersionBuildLinkageRequestRequired(appStoreVersionBuildLinkageRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppStoreVersionBuildLinkageRequestConstraints(appStoreVersionBuildLinkageRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppStoreVersionsBuildUpdateToOneRelationship(r.Context(), idParam, appStoreVersionBuildLinkageRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsCreateInstance - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsCreateInstance(w http.ResponseWriter, r *http.Request) {
	appStoreVersionCreateRequestParam := AppStoreVersionCreateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appStoreVersionCreateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppStoreVersionCreateRequestRequired(appStoreVersionCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppStoreVersionCreateRequestConstraints(appStoreVersionCreateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppStoreVersionsCreateInstance(r.Context(), appStoreVersionCreateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsDeleteInstance - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsDeleteInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	result, err := c.service.AppStoreVersionsDeleteInstance(r.Context(), idParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsGetInstance - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsGetInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsAppStoreVersionsParam []string
	if query.Has("fields[appStoreVersions]") {
		fieldsAppStoreVersionsParam = strings.Split(query.Get("fields[appStoreVersions]"), ",")
	}
	var includeParam []string
	if query.Has("include") {
		includeParam = strings.Split(query.Get("include"), ",")
	}
	var fieldsAppStoreVersionLocalizationsParam []string
	if query.Has("fields[appStoreVersionLocalizations]") {
		fieldsAppStoreVersionLocalizationsParam = strings.Split(query.Get("fields[appStoreVersionLocalizations]"), ",")
	}
	var fieldsIdfaDeclarationsParam []string
	if query.Has("fields[idfaDeclarations]") {
		fieldsIdfaDeclarationsParam = strings.Split(query.Get("fields[idfaDeclarations]"), ",")
	}
	var fieldsRoutingAppCoveragesParam []string
	if query.Has("fields[routingAppCoverages]") {
		fieldsRoutingAppCoveragesParam = strings.Split(query.Get("fields[routingAppCoverages]"), ",")
	}
	var fieldsAppStoreVersionPhasedReleasesParam []string
	if query.Has("fields[appStoreVersionPhasedReleases]") {
		fieldsAppStoreVersionPhasedReleasesParam = strings.Split(query.Get("fields[appStoreVersionPhasedReleases]"), ",")
	}
	var fieldsAgeRatingDeclarationsParam []string
	if query.Has("fields[ageRatingDeclarations]") {
		fieldsAgeRatingDeclarationsParam = strings.Split(query.Get("fields[ageRatingDeclarations]"), ",")
	}
	var fieldsAppStoreReviewDetailsParam []string
	if query.Has("fields[appStoreReviewDetails]") {
		fieldsAppStoreReviewDetailsParam = strings.Split(query.Get("fields[appStoreReviewDetails]"), ",")
	}
	var fieldsBuildsParam []string
	if query.Has("fields[builds]") {
		fieldsBuildsParam = strings.Split(query.Get("fields[builds]"), ",")
	}
	var fieldsAppStoreVersionSubmissionsParam []string
	if query.Has("fields[appStoreVersionSubmissions]") {
		fieldsAppStoreVersionSubmissionsParam = strings.Split(query.Get("fields[appStoreVersionSubmissions]"), ",")
	}
	var limitAppStoreVersionLocalizationsParam int32
	if query.Has("limit[appStoreVersionLocalizations]") {
		param, err := parseNumericParameter[int32](
			query.Get("limit[appStoreVersionLocalizations]"),
			WithParse[int32](parseInt32),
			WithMaximum[int32](50),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitAppStoreVersionLocalizationsParam = param
	} else {
	}
	result, err := c.service.AppStoreVersionsGetInstance(r.Context(), idParam, fieldsAppStoreVersionsParam, includeParam, fieldsAppStoreVersionLocalizationsParam, fieldsIdfaDeclarationsParam, fieldsRoutingAppCoveragesParam, fieldsAppStoreVersionPhasedReleasesParam, fieldsAgeRatingDeclarationsParam, fieldsAppStoreReviewDetailsParam, fieldsBuildsParam, fieldsAppStoreVersionSubmissionsParam, limitAppStoreVersionLocalizationsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsIdfaDeclarationGetToOneRelated - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsIdfaDeclarationGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsIdfaDeclarationsParam []string
	if query.Has("fields[idfaDeclarations]") {
		fieldsIdfaDeclarationsParam = strings.Split(query.Get("fields[idfaDeclarations]"), ",")
	}
	result, err := c.service.AppStoreVersionsIdfaDeclarationGetToOneRelated(r.Context(), idParam, fieldsIdfaDeclarationsParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsRoutingAppCoverageGetToOneRelated - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsRoutingAppCoverageGetToOneRelated(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	var fieldsRoutingAppCoveragesParam []string
	if query.Has("fields[routingAppCoverages]") {
		fieldsRoutingAppCoveragesParam = strings.Split(query.Get("fields[routingAppCoverages]"), ",")
	}
	result, err := c.service.AppStoreVersionsRoutingAppCoverageGetToOneRelated(r.Context(), idParam, fieldsRoutingAppCoveragesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// AppStoreVersionsUpdateInstance - 
func (c *AppStoreVersionsAPIController) AppStoreVersionsUpdateInstance(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	idParam := params["id"]
	if idParam == "" {
		c.errorHandler(w, r, &RequiredError{"id"}, nil)
		return
	}
	appStoreVersionUpdateRequestParam := AppStoreVersionUpdateRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&appStoreVersionUpdateRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertAppStoreVersionUpdateRequestRequired(appStoreVersionUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertAppStoreVersionUpdateRequestConstraints(appStoreVersionUpdateRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.AppStoreVersionsUpdateInstance(r.Context(), idParam, appStoreVersionUpdateRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
