/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// RemoteImageAPIController binds http requests to an api service and writes the service results to the http response
type RemoteImageAPIController struct {
	service RemoteImageAPIServicer
	errorHandler ErrorHandler
}

// RemoteImageAPIOption for how the controller is set up.
type RemoteImageAPIOption func(*RemoteImageAPIController)

// WithRemoteImageAPIErrorHandler inject ErrorHandler into controller
func WithRemoteImageAPIErrorHandler(h ErrorHandler) RemoteImageAPIOption {
	return func(c *RemoteImageAPIController) {
		c.errorHandler = h
	}
}

// NewRemoteImageAPIController creates a default api controller
func NewRemoteImageAPIController(s RemoteImageAPIServicer, opts ...RemoteImageAPIOption) Router {
	controller := &RemoteImageAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the RemoteImageAPIController
func (c *RemoteImageAPIController) Routes() Routes {
	return Routes{
		"DownloadRemoteImage": Route{
			strings.ToUpper("Post"),
			"/Items/{itemId}/RemoteImages/Download",
			c.DownloadRemoteImage,
		},
		"GetRemoteImage": Route{
			strings.ToUpper("Get"),
			"/Images/Remote",
			c.GetRemoteImage,
		},
		"GetRemoteImageProviders": Route{
			strings.ToUpper("Get"),
			"/Items/{itemId}/RemoteImages/Providers",
			c.GetRemoteImageProviders,
		},
		"GetRemoteImages": Route{
			strings.ToUpper("Get"),
			"/Items/{itemId}/RemoteImages",
			c.GetRemoteImages,
		},
	}
}

// DownloadRemoteImage - Downloads a remote image for an item.
func (c *RemoteImageAPIController) DownloadRemoteImage(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	var type_Param ImageType
	if query.Has("type") {
		param := ImageType(query.Get("type"))

		type_Param = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "type"}, nil)
		return
	}
	var imageUrlParam *string
	if query.Has("imageUrl") {
		param := query.Get("imageUrl")

		imageUrlParam = &param
	} else {
	}
	result, err := c.service.DownloadRemoteImage(r.Context(), itemIdParam, type_Param, imageUrlParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRemoteImage - Gets a remote image.
func (c *RemoteImageAPIController) GetRemoteImage(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var imageUrlParam string
	if query.Has("imageUrl") {
		param := query.Get("imageUrl")

		imageUrlParam = param
	} else {
		c.errorHandler(w, r, &RequiredError{Field: "imageUrl"}, nil)
		return
	}
	result, err := c.service.GetRemoteImage(r.Context(), imageUrlParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRemoteImageProviders - Gets available remote image providers for an item.
func (c *RemoteImageAPIController) GetRemoteImageProviders(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	result, err := c.service.GetRemoteImageProviders(r.Context(), itemIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRemoteImages - Gets available remote images for an item.
func (c *RemoteImageAPIController) GetRemoteImages(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	var type_Param ImageType
	if query.Has("type") {
		param := ImageType(query.Get("type"))

		type_Param = param
	} else {
	}
	var startIndexParam *int32
	if query.Has("startIndex") {
		param, err := parseNumericParameter[int32](
			query.Get("startIndex"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		startIndexParam = &param
	} else {
	}
	var limitParam *int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = &param
	} else {
	}
	var providerNameParam *string
	if query.Has("providerName") {
		param := query.Get("providerName")

		providerNameParam = &param
	} else {
	}
	var includeAllLanguagesParam bool
	if query.Has("includeAllLanguages") {
		param, err := parseBoolParameter(
			query.Get("includeAllLanguages"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		includeAllLanguagesParam = param
	} else {
		var param bool = false
		includeAllLanguagesParam = param
	}
	result, err := c.service.GetRemoteImages(r.Context(), itemIdParam, type_Param, startIndexParam, limitParam, providerNameParam, includeAllLanguagesParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
