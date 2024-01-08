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

// HlsSegmentAPIController binds http requests to an api service and writes the service results to the http response
type HlsSegmentAPIController struct {
	service HlsSegmentAPIServicer
	errorHandler ErrorHandler
}

// HlsSegmentAPIOption for how the controller is set up.
type HlsSegmentAPIOption func(*HlsSegmentAPIController)

// WithHlsSegmentAPIErrorHandler inject ErrorHandler into controller
func WithHlsSegmentAPIErrorHandler(h ErrorHandler) HlsSegmentAPIOption {
	return func(c *HlsSegmentAPIController) {
		c.errorHandler = h
	}
}

// NewHlsSegmentAPIController creates a default api controller
func NewHlsSegmentAPIController(s HlsSegmentAPIServicer, opts ...HlsSegmentAPIOption) Router {
	controller := &HlsSegmentAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the HlsSegmentAPIController
func (c *HlsSegmentAPIController) Routes() Routes {
	return Routes{
		"GetHlsAudioSegmentLegacyAac": Route{
			strings.ToUpper("Get"),
			"/Audio/{itemId}/hls/{segmentId}/stream.aac",
			c.GetHlsAudioSegmentLegacyAac,
		},
		"GetHlsAudioSegmentLegacyMp3": Route{
			strings.ToUpper("Get"),
			"/Audio/{itemId}/hls/{segmentId}/stream.mp3",
			c.GetHlsAudioSegmentLegacyMp3,
		},
		"GetHlsPlaylistLegacy": Route{
			strings.ToUpper("Get"),
			"/Videos/{itemId}/hls/{playlistId}/stream.m3u8",
			c.GetHlsPlaylistLegacy,
		},
		"GetHlsVideoSegmentLegacy": Route{
			strings.ToUpper("Get"),
			"/Videos/{itemId}/hls/{playlistId}/{segmentId}.{segmentContainer}",
			c.GetHlsVideoSegmentLegacy,
		},
		"StopEncodingProcess": Route{
			strings.ToUpper("Delete"),
			"/Videos/ActiveEncodings",
			c.StopEncodingProcess,
		},
	}
}

// GetHlsAudioSegmentLegacyAac - Gets the specified audio segment for an audio item.
func (c *HlsSegmentAPIController) GetHlsAudioSegmentLegacyAac(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	segmentIdParam := params["segmentId"]
	if segmentIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"segmentId"}, nil)
		return
	}
	result, err := c.service.GetHlsAudioSegmentLegacyAac(r.Context(), itemIdParam, segmentIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetHlsAudioSegmentLegacyMp3 - Gets the specified audio segment for an audio item.
func (c *HlsSegmentAPIController) GetHlsAudioSegmentLegacyMp3(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	segmentIdParam := params["segmentId"]
	if segmentIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"segmentId"}, nil)
		return
	}
	result, err := c.service.GetHlsAudioSegmentLegacyMp3(r.Context(), itemIdParam, segmentIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetHlsPlaylistLegacy - Gets a hls video playlist.
func (c *HlsSegmentAPIController) GetHlsPlaylistLegacy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	playlistIdParam := params["playlistId"]
	if playlistIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"playlistId"}, nil)
		return
	}
	result, err := c.service.GetHlsPlaylistLegacy(r.Context(), itemIdParam, playlistIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// GetHlsVideoSegmentLegacy - Gets a hls video segment.
func (c *HlsSegmentAPIController) GetHlsVideoSegmentLegacy(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	playlistIdParam := params["playlistId"]
	if playlistIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"playlistId"}, nil)
		return
	}
	segmentIdParam := params["segmentId"]
	if segmentIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"segmentId"}, nil)
		return
	}
	segmentContainerParam := params["segmentContainer"]
	if segmentContainerParam == "" {
		c.errorHandler(w, r, &RequiredError{"segmentContainer"}, nil)
		return
	}
	result, err := c.service.GetHlsVideoSegmentLegacy(r.Context(), itemIdParam, playlistIdParam, segmentIdParam, segmentContainerParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// StopEncodingProcess - Stops an active encoding.
func (c *HlsSegmentAPIController) StopEncodingProcess(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var deviceIdParam *string
	if query.Has("deviceId") {
		param := query.Get("deviceId")

		deviceIdParam = &param
	} else {
	}
	var playSessionIdParam *string
	if query.Has("playSessionId") {
		param := query.Get("playSessionId")

		playSessionIdParam = &param
	} else {
	}
	result, err := c.service.StopEncodingProcess(r.Context(), deviceIdParam, playSessionIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}