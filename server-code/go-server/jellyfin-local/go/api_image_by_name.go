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

// ImageByNameAPIController binds http requests to an api service and writes the service results to the http response
type ImageByNameAPIController struct {
	service ImageByNameAPIServicer
	errorHandler ErrorHandler
}

// ImageByNameAPIOption for how the controller is set up.
type ImageByNameAPIOption func(*ImageByNameAPIController)

// WithImageByNameAPIErrorHandler inject ErrorHandler into controller
func WithImageByNameAPIErrorHandler(h ErrorHandler) ImageByNameAPIOption {
	return func(c *ImageByNameAPIController) {
		c.errorHandler = h
	}
}

// NewImageByNameAPIController creates a default api controller
func NewImageByNameAPIController(s ImageByNameAPIServicer, opts ...ImageByNameAPIOption) Router {
	controller := &ImageByNameAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the ImageByNameAPIController
func (c *ImageByNameAPIController) Routes() Routes {
	return Routes{
		"GetGeneralImage": Route{
			strings.ToUpper("Get"),
			"/Images/General/{name}/{type}",
			c.GetGeneralImage,
		},
		"GetGeneralImages": Route{
			strings.ToUpper("Get"),
			"/Images/General",
			c.GetGeneralImages,
		},
		"GetMediaInfoImage": Route{
			strings.ToUpper("Get"),
			"/Images/MediaInfo/{theme}/{name}",
			c.GetMediaInfoImage,
		},
		"GetMediaInfoImages": Route{
			strings.ToUpper("Get"),
			"/Images/MediaInfo",
			c.GetMediaInfoImages,
		},
		"GetRatingImage": Route{
			strings.ToUpper("Get"),
			"/Images/Ratings/{theme}/{name}",
			c.GetRatingImage,
		},
		"GetRatingImages": Route{
			strings.ToUpper("Get"),
			"/Images/Ratings",
			c.GetRatingImages,
		},
	}
}

// GetGeneralImage - Get General Image.
func (c *ImageByNameAPIController) GetGeneralImage(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	nameParam := params["name"]
	if nameParam == "" {
		c.errorHandler(w, r, &RequiredError{"name"}, nil)
		return
	}
	type_Param := params["type"]
	if type_Param == "" {
		c.errorHandler(w, r, &RequiredError{"type"}, nil)
		return
	}
	result, err := c.service.GetGeneralImage(r.Context(), nameParam, type_Param)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetGeneralImages - Get all general images.
func (c *ImageByNameAPIController) GetGeneralImages(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetGeneralImages(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetMediaInfoImage - Get media info image.
func (c *ImageByNameAPIController) GetMediaInfoImage(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	themeParam := params["theme"]
	if themeParam == "" {
		c.errorHandler(w, r, &RequiredError{"theme"}, nil)
		return
	}
	nameParam := params["name"]
	if nameParam == "" {
		c.errorHandler(w, r, &RequiredError{"name"}, nil)
		return
	}
	result, err := c.service.GetMediaInfoImage(r.Context(), themeParam, nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetMediaInfoImages - Get all media info images.
func (c *ImageByNameAPIController) GetMediaInfoImages(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetMediaInfoImages(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRatingImage - Get rating image.
func (c *ImageByNameAPIController) GetRatingImage(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	themeParam := params["theme"]
	if themeParam == "" {
		c.errorHandler(w, r, &RequiredError{"theme"}, nil)
		return
	}
	nameParam := params["name"]
	if nameParam == "" {
		c.errorHandler(w, r, &RequiredError{"name"}, nil)
		return
	}
	result, err := c.service.GetRatingImage(r.Context(), themeParam, nameParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetRatingImages - Get all general images.
func (c *ImageByNameAPIController) GetRatingImages(w http.ResponseWriter, r *http.Request) {
	result, err := c.service.GetRatingImages(r.Context())
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
