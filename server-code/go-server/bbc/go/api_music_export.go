/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// MusicExportAPIController binds http requests to an api service and writes the service results to the http response
type MusicExportAPIController struct {
	service MusicExportAPIServicer
	errorHandler ErrorHandler
}

// MusicExportAPIOption for how the controller is set up.
type MusicExportAPIOption func(*MusicExportAPIController)

// WithMusicExportAPIErrorHandler inject ErrorHandler into controller
func WithMusicExportAPIErrorHandler(h ErrorHandler) MusicExportAPIOption {
	return func(c *MusicExportAPIController) {
		c.errorHandler = h
	}
}

// NewMusicExportAPIController creates a default api controller
func NewMusicExportAPIController(s MusicExportAPIServicer, opts ...MusicExportAPIOption) Router {
	controller := &MusicExportAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the MusicExportAPIController
func (c *MusicExportAPIController) Routes() Routes {
	return Routes{
		"DeleteMusicPreferencesExport": Route{
			strings.ToUpper("Delete"),
			"/my/music/preferences/export",
			c.DeleteMusicPreferencesExport,
		},
		"DeleteMusicPreferencesExportVendor": Route{
			strings.ToUpper("Delete"),
			"/my/music/preferences/export/{vendor}",
			c.DeleteMusicPreferencesExportVendor,
		},
		"GetMusicExport": Route{
			strings.ToUpper("Get"),
			"/my/music/export",
			c.GetMusicExport,
		},
		"GetMusicExportJobs": Route{
			strings.ToUpper("Get"),
			"/my/music/exports/jobs",
			c.GetMusicExportJobs,
		},
		"GetMusicExportTracks": Route{
			strings.ToUpper("Get"),
			"/my/music/exports/tracks",
			c.GetMusicExportTracks,
		},
		"GetMusicPreferencesExport": Route{
			strings.ToUpper("Get"),
			"/my/music/preferences/export",
			c.GetMusicPreferencesExport,
		},
		"GetMusicPreferencesExportVendor": Route{
			strings.ToUpper("Get"),
			"/my/music/preferences/export/{vendor}",
			c.GetMusicPreferencesExportVendor,
		},
		"PostMusicExportJob": Route{
			strings.ToUpper("Post"),
			"/my/music/exports/jobs",
			c.PostMusicExportJob,
		},
		"PostMusicPreferencesExport": Route{
			strings.ToUpper("Post"),
			"/my/music/preferences/export",
			c.PostMusicPreferencesExport,
		},
		"PostMusicPreferencesExportVendor": Route{
			strings.ToUpper("Post"),
			"/my/music/preferences/export/{vendor}",
			c.PostMusicPreferencesExportVendor,
		},
		"PutMusicPreferencesExportVendor": Route{
			strings.ToUpper("Put"),
			"/my/music/preferences/export/{vendor}",
			c.PutMusicPreferencesExportVendor,
		},
	}
}

// DeleteMusicPreferencesExport - Music Export Preferences
func (c *MusicExportAPIController) DeleteMusicPreferencesExport(w http.ResponseWriter, r *http.Request) {
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	result, err := c.service.DeleteMusicPreferencesExport(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// DeleteMusicPreferencesExportVendor - Music Export Vendor Preferences
func (c *MusicExportAPIController) DeleteMusicPreferencesExportVendor(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	vendorParam := params["vendor"]
	if vendorParam == "" {
		c.errorHandler(w, r, &RequiredError{"vendor"}, nil)
		return
	}
	result, err := c.service.DeleteMusicPreferencesExportVendor(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam, vendorParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetMusicExport - Music Exports
func (c *MusicExportAPIController) GetMusicExport(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
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
	result, err := c.service.GetMusicExport(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam, offsetParam, limitParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetMusicExportJobs - Music Export Jobs
func (c *MusicExportAPIController) GetMusicExportJobs(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	var over16Param bool
	if query.Has("over16") {
		param, err := parseBoolParameter(
			query.Get("over16"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		over16Param = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "over16"}, nil)
		return
	}
	var vendorParam string
	if query.Has("vendor") {
		param := query.Get("vendor")

		vendorParam = param
	} else {
	}
	result, err := c.service.GetMusicExportJobs(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam, over16Param, vendorParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetMusicExportTracks - Music Export Tracks
func (c *MusicExportAPIController) GetMusicExportTracks(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	var over16Param bool
	if query.Has("over16") {
		param, err := parseBoolParameter(
			query.Get("over16"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		over16Param = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "over16"}, nil)
		return
	}
	var offsetParam int32
	if query.Has("offset") {
		param, err := parseNumericParameter[int32](
			query.Get("offset"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		offsetParam = param
	} else {
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
	var vendorParam string
	if query.Has("vendor") {
		param := query.Get("vendor")

		vendorParam = param
	} else {
	}
	var statusParam string
	if query.Has("status") {
		param := query.Get("status")

		statusParam = param
	} else {
	}
	result, err := c.service.GetMusicExportTracks(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam, over16Param, offsetParam, limitParam, vendorParam, statusParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetMusicPreferencesExport - Music Export Preferences
func (c *MusicExportAPIController) GetMusicPreferencesExport(w http.ResponseWriter, r *http.Request) {
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	result, err := c.service.GetMusicPreferencesExport(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetMusicPreferencesExportVendor - Music Export Vendor Preferences
func (c *MusicExportAPIController) GetMusicPreferencesExportVendor(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	vendorParam := params["vendor"]
	if vendorParam == "" {
		c.errorHandler(w, r, &RequiredError{"vendor"}, nil)
		return
	}
	result, err := c.service.GetMusicPreferencesExportVendor(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam, vendorParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PostMusicExportJob - Music Export Jobs
func (c *MusicExportAPIController) PostMusicExportJob(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	var over16Param bool
	if query.Has("over16") {
		param, err := parseBoolParameter(
			query.Get("over16"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		over16Param = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "over16"}, nil)
		return
	}
	bodyParam := []MusicExportJob{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	for _, el := range bodyParam {
		if err := AssertMusicExportJobRequired(el); err != nil {
			c.errorHandler(w, r, err, nil)
			return
		}
	}
	var vendorParam string
	if query.Has("vendor") {
		param := query.Get("vendor")

		vendorParam = param
	} else {
	}
	result, err := c.service.PostMusicExportJob(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam, over16Param, bodyParam, vendorParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PostMusicPreferencesExport - Music Export Preferences
func (c *MusicExportAPIController) PostMusicPreferencesExport(w http.ResponseWriter, r *http.Request) {
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	bodyParam := MusicExportPreferences{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertMusicExportPreferencesRequired(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertMusicExportPreferencesConstraints(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PostMusicPreferencesExport(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam, bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PostMusicPreferencesExportVendor - Music Export Vendor Preferences
func (c *MusicExportAPIController) PostMusicPreferencesExportVendor(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	vendorParam := params["vendor"]
	if vendorParam == "" {
		c.errorHandler(w, r, &RequiredError{"vendor"}, nil)
		return
	}
	bodyParam := MusicExportPreferences{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertMusicExportPreferencesRequired(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertMusicExportPreferencesConstraints(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PostMusicPreferencesExportVendor(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam, vendorParam, bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PutMusicPreferencesExportVendor - Music Export Vendor Preferences
func (c *MusicExportAPIController) PutMusicPreferencesExportVendor(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	authorizationParam := r.Header.Get("Authorization")
	xAuthenticationProviderParam := r.Header.Get("X-Authentication-Provider")
	xAPIKeyParam := r.Header.Get("X-API-Key")
	vendorParam := params["vendor"]
	if vendorParam == "" {
		c.errorHandler(w, r, &RequiredError{"vendor"}, nil)
		return
	}
	bodyParam := MusicExportPreferences{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&bodyParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertMusicExportPreferencesRequired(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertMusicExportPreferencesConstraints(bodyParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.PutMusicPreferencesExportVendor(r.Context(), authorizationParam, xAuthenticationProviderParam, xAPIKeyParam, vendorParam, bodyParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
