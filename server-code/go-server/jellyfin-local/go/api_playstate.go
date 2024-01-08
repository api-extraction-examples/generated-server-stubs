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
	"time"

	"github.com/gorilla/mux"
)

// PlaystateAPIController binds http requests to an api service and writes the service results to the http response
type PlaystateAPIController struct {
	service PlaystateAPIServicer
	errorHandler ErrorHandler
}

// PlaystateAPIOption for how the controller is set up.
type PlaystateAPIOption func(*PlaystateAPIController)

// WithPlaystateAPIErrorHandler inject ErrorHandler into controller
func WithPlaystateAPIErrorHandler(h ErrorHandler) PlaystateAPIOption {
	return func(c *PlaystateAPIController) {
		c.errorHandler = h
	}
}

// NewPlaystateAPIController creates a default api controller
func NewPlaystateAPIController(s PlaystateAPIServicer, opts ...PlaystateAPIOption) Router {
	controller := &PlaystateAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the PlaystateAPIController
func (c *PlaystateAPIController) Routes() Routes {
	return Routes{
		"MarkPlayedItem": Route{
			strings.ToUpper("Post"),
			"/Users/{userId}/PlayedItems/{itemId}",
			c.MarkPlayedItem,
		},
		"MarkUnplayedItem": Route{
			strings.ToUpper("Delete"),
			"/Users/{userId}/PlayedItems/{itemId}",
			c.MarkUnplayedItem,
		},
		"OnPlaybackProgress": Route{
			strings.ToUpper("Post"),
			"/Users/{userId}/PlayingItems/{itemId}/Progress",
			c.OnPlaybackProgress,
		},
		"OnPlaybackStart": Route{
			strings.ToUpper("Post"),
			"/Users/{userId}/PlayingItems/{itemId}",
			c.OnPlaybackStart,
		},
		"OnPlaybackStopped": Route{
			strings.ToUpper("Delete"),
			"/Users/{userId}/PlayingItems/{itemId}",
			c.OnPlaybackStopped,
		},
		"PingPlaybackSession": Route{
			strings.ToUpper("Post"),
			"/Sessions/Playing/Ping",
			c.PingPlaybackSession,
		},
		"ReportPlaybackProgress": Route{
			strings.ToUpper("Post"),
			"/Sessions/Playing/Progress",
			c.ReportPlaybackProgress,
		},
		"ReportPlaybackStart": Route{
			strings.ToUpper("Post"),
			"/Sessions/Playing",
			c.ReportPlaybackStart,
		},
		"ReportPlaybackStopped": Route{
			strings.ToUpper("Post"),
			"/Sessions/Playing/Stopped",
			c.ReportPlaybackStopped,
		},
	}
}

// MarkPlayedItem - Marks an item as played for user.
func (c *PlaystateAPIController) MarkPlayedItem(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	userIdParam := params["userId"]
	if userIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"userId"}, nil)
		return
	}
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	var datePlayedParam *time.Time
	if query.Has("datePlayed"){
		param, err := parseTime(query.Get("datePlayed"))
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		datePlayedParam = &param
	} else {
	}
	result, err := c.service.MarkPlayedItem(r.Context(), userIdParam, itemIdParam, datePlayedParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// MarkUnplayedItem - Marks an item as unplayed for user.
func (c *PlaystateAPIController) MarkUnplayedItem(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	userIdParam := params["userId"]
	if userIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"userId"}, nil)
		return
	}
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	result, err := c.service.MarkUnplayedItem(r.Context(), userIdParam, itemIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// OnPlaybackProgress - Reports a user's playback progress.
func (c *PlaystateAPIController) OnPlaybackProgress(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	userIdParam := params["userId"]
	if userIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"userId"}, nil)
		return
	}
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	var mediaSourceIdParam *string
	if query.Has("mediaSourceId") {
		param := query.Get("mediaSourceId")

		mediaSourceIdParam = &param
	} else {
	}
	var positionTicksParam *int64
	if query.Has("positionTicks") {
		param, err := parseNumericParameter[int64](
			query.Get("positionTicks"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		positionTicksParam = &param
	} else {
	}
	var audioStreamIndexParam *int32
	if query.Has("audioStreamIndex") {
		param, err := parseNumericParameter[int32](
			query.Get("audioStreamIndex"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		audioStreamIndexParam = &param
	} else {
	}
	var subtitleStreamIndexParam *int32
	if query.Has("subtitleStreamIndex") {
		param, err := parseNumericParameter[int32](
			query.Get("subtitleStreamIndex"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		subtitleStreamIndexParam = &param
	} else {
	}
	var volumeLevelParam *int32
	if query.Has("volumeLevel") {
		param, err := parseNumericParameter[int32](
			query.Get("volumeLevel"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		volumeLevelParam = &param
	} else {
	}
	var playMethodParam PlayMethod
	if query.Has("playMethod") {
		param := PlayMethod(query.Get("playMethod"))

		playMethodParam = param
	} else {
	}
	var liveStreamIdParam *string
	if query.Has("liveStreamId") {
		param := query.Get("liveStreamId")

		liveStreamIdParam = &param
	} else {
	}
	var playSessionIdParam *string
	if query.Has("playSessionId") {
		param := query.Get("playSessionId")

		playSessionIdParam = &param
	} else {
	}
	var repeatModeParam RepeatMode
	if query.Has("repeatMode") {
		param := RepeatMode(query.Get("repeatMode"))

		repeatModeParam = param
	} else {
	}
	var isPausedParam bool
	if query.Has("isPaused") {
		param, err := parseBoolParameter(
			query.Get("isPaused"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isPausedParam = param
	} else {
		var param bool = false
		isPausedParam = param
	}
	var isMutedParam bool
	if query.Has("isMuted") {
		param, err := parseBoolParameter(
			query.Get("isMuted"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		isMutedParam = param
	} else {
		var param bool = false
		isMutedParam = param
	}
	result, err := c.service.OnPlaybackProgress(r.Context(), userIdParam, itemIdParam, mediaSourceIdParam, positionTicksParam, audioStreamIndexParam, subtitleStreamIndexParam, volumeLevelParam, playMethodParam, liveStreamIdParam, playSessionIdParam, repeatModeParam, isPausedParam, isMutedParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// OnPlaybackStart - Reports that a user has begun playing an item.
func (c *PlaystateAPIController) OnPlaybackStart(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	userIdParam := params["userId"]
	if userIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"userId"}, nil)
		return
	}
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	var mediaSourceIdParam *string
	if query.Has("mediaSourceId") {
		param := query.Get("mediaSourceId")

		mediaSourceIdParam = &param
	} else {
	}
	var audioStreamIndexParam *int32
	if query.Has("audioStreamIndex") {
		param, err := parseNumericParameter[int32](
			query.Get("audioStreamIndex"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		audioStreamIndexParam = &param
	} else {
	}
	var subtitleStreamIndexParam *int32
	if query.Has("subtitleStreamIndex") {
		param, err := parseNumericParameter[int32](
			query.Get("subtitleStreamIndex"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		subtitleStreamIndexParam = &param
	} else {
	}
	var playMethodParam PlayMethod
	if query.Has("playMethod") {
		param := PlayMethod(query.Get("playMethod"))

		playMethodParam = param
	} else {
	}
	var liveStreamIdParam *string
	if query.Has("liveStreamId") {
		param := query.Get("liveStreamId")

		liveStreamIdParam = &param
	} else {
	}
	var playSessionIdParam *string
	if query.Has("playSessionId") {
		param := query.Get("playSessionId")

		playSessionIdParam = &param
	} else {
	}
	var canSeekParam bool
	if query.Has("canSeek") {
		param, err := parseBoolParameter(
			query.Get("canSeek"),
			WithParse[bool](parseBool),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		canSeekParam = param
	} else {
		var param bool = false
		canSeekParam = param
	}
	result, err := c.service.OnPlaybackStart(r.Context(), userIdParam, itemIdParam, mediaSourceIdParam, audioStreamIndexParam, subtitleStreamIndexParam, playMethodParam, liveStreamIdParam, playSessionIdParam, canSeekParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// OnPlaybackStopped - Reports that a user has stopped playing an item.
func (c *PlaystateAPIController) OnPlaybackStopped(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query := r.URL.Query()
	userIdParam := params["userId"]
	if userIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"userId"}, nil)
		return
	}
	itemIdParam := params["itemId"]
	if itemIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"itemId"}, nil)
		return
	}
	var mediaSourceIdParam *string
	if query.Has("mediaSourceId") {
		param := query.Get("mediaSourceId")

		mediaSourceIdParam = &param
	} else {
	}
	var nextMediaTypeParam *string
	if query.Has("nextMediaType") {
		param := query.Get("nextMediaType")

		nextMediaTypeParam = &param
	} else {
	}
	var positionTicksParam *int64
	if query.Has("positionTicks") {
		param, err := parseNumericParameter[int64](
			query.Get("positionTicks"),
			WithParse[int64](parseInt64),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		positionTicksParam = &param
	} else {
	}
	var liveStreamIdParam *string
	if query.Has("liveStreamId") {
		param := query.Get("liveStreamId")

		liveStreamIdParam = &param
	} else {
	}
	var playSessionIdParam *string
	if query.Has("playSessionId") {
		param := query.Get("playSessionId")

		playSessionIdParam = &param
	} else {
	}
	result, err := c.service.OnPlaybackStopped(r.Context(), userIdParam, itemIdParam, mediaSourceIdParam, nextMediaTypeParam, positionTicksParam, liveStreamIdParam, playSessionIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// PingPlaybackSession - Pings a playback session.
func (c *PlaystateAPIController) PingPlaybackSession(w http.ResponseWriter, r *http.Request) {
	query := r.URL.Query()
	var playSessionIdParam *string
	if query.Has("playSessionId") {
		param := query.Get("playSessionId")

		playSessionIdParam = &param
	} else {
	}
	result, err := c.service.PingPlaybackSession(r.Context(), playSessionIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ReportPlaybackProgress - Reports playback progress within a session.
func (c *PlaystateAPIController) ReportPlaybackProgress(w http.ResponseWriter, r *http.Request) {
	playbackProgressInfoParam := PlaybackProgressInfo{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&playbackProgressInfoParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPlaybackProgressInfoRequired(playbackProgressInfoParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPlaybackProgressInfoConstraints(playbackProgressInfoParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.ReportPlaybackProgress(r.Context(), playbackProgressInfoParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ReportPlaybackStart - Reports playback has started within a session.
func (c *PlaystateAPIController) ReportPlaybackStart(w http.ResponseWriter, r *http.Request) {
	playbackStartInfoParam := PlaybackStartInfo{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&playbackStartInfoParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPlaybackStartInfoRequired(playbackStartInfoParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPlaybackStartInfoConstraints(playbackStartInfoParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.ReportPlaybackStart(r.Context(), playbackStartInfoParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ReportPlaybackStopped - Reports playback has stopped within a session.
func (c *PlaystateAPIController) ReportPlaybackStopped(w http.ResponseWriter, r *http.Request) {
	playbackStopInfoParam := PlaybackStopInfo{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&playbackStopInfoParam); err != nil && !errors.Is(err, io.EOF) {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertPlaybackStopInfoRequired(playbackStopInfoParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertPlaybackStopInfoConstraints(playbackStopInfoParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.ReportPlaybackStopped(r.Context(), playbackStopInfoParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}