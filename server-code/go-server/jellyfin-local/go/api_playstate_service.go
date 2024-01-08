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
	"context"
	"net/http"
	"errors"
	"time"
)

// PlaystateAPIService is a service that implements the logic for the PlaystateAPIServicer
// This service should implement the business logic for every endpoint for the PlaystateAPI API.
// Include any external packages or services that will be required by this service.
type PlaystateAPIService struct {
}

// NewPlaystateAPIService creates a default api service
func NewPlaystateAPIService() PlaystateAPIServicer {
	return &PlaystateAPIService{}
}

// MarkPlayedItem - Marks an item as played for user.
func (s *PlaystateAPIService) MarkPlayedItem(ctx context.Context, userId string, itemId string, datePlayed *time.Time) (ImplResponse, error) {
	// TODO - update MarkPlayedItem with the required logic for this service method.
	// Add api_playstate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, UserItemDataDto{}) or use other options such as http.Ok ...
	// return Response(200, UserItemDataDto{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("MarkPlayedItem method not implemented")
}

// MarkUnplayedItem - Marks an item as unplayed for user.
func (s *PlaystateAPIService) MarkUnplayedItem(ctx context.Context, userId string, itemId string) (ImplResponse, error) {
	// TODO - update MarkUnplayedItem with the required logic for this service method.
	// Add api_playstate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, UserItemDataDto{}) or use other options such as http.Ok ...
	// return Response(200, UserItemDataDto{}), nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("MarkUnplayedItem method not implemented")
}

// OnPlaybackProgress - Reports a user&#39;s playback progress.
func (s *PlaystateAPIService) OnPlaybackProgress(ctx context.Context, userId string, itemId string, mediaSourceId *string, positionTicks *int64, audioStreamIndex *int32, subtitleStreamIndex *int32, volumeLevel *int32, playMethod PlayMethod, liveStreamId *string, playSessionId *string, repeatMode RepeatMode, isPaused bool, isMuted bool) (ImplResponse, error) {
	// TODO - update OnPlaybackProgress with the required logic for this service method.
	// Add api_playstate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("OnPlaybackProgress method not implemented")
}

// OnPlaybackStart - Reports that a user has begun playing an item.
func (s *PlaystateAPIService) OnPlaybackStart(ctx context.Context, userId string, itemId string, mediaSourceId *string, audioStreamIndex *int32, subtitleStreamIndex *int32, playMethod PlayMethod, liveStreamId *string, playSessionId *string, canSeek bool) (ImplResponse, error) {
	// TODO - update OnPlaybackStart with the required logic for this service method.
	// Add api_playstate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("OnPlaybackStart method not implemented")
}

// OnPlaybackStopped - Reports that a user has stopped playing an item.
func (s *PlaystateAPIService) OnPlaybackStopped(ctx context.Context, userId string, itemId string, mediaSourceId *string, nextMediaType *string, positionTicks *int64, liveStreamId *string, playSessionId *string) (ImplResponse, error) {
	// TODO - update OnPlaybackStopped with the required logic for this service method.
	// Add api_playstate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("OnPlaybackStopped method not implemented")
}

// PingPlaybackSession - Pings a playback session.
func (s *PlaystateAPIService) PingPlaybackSession(ctx context.Context, playSessionId *string) (ImplResponse, error) {
	// TODO - update PingPlaybackSession with the required logic for this service method.
	// Add api_playstate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("PingPlaybackSession method not implemented")
}

// ReportPlaybackProgress - Reports playback progress within a session.
func (s *PlaystateAPIService) ReportPlaybackProgress(ctx context.Context, playbackProgressInfo PlaybackProgressInfo) (ImplResponse, error) {
	// TODO - update ReportPlaybackProgress with the required logic for this service method.
	// Add api_playstate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ReportPlaybackProgress method not implemented")
}

// ReportPlaybackStart - Reports playback has started within a session.
func (s *PlaystateAPIService) ReportPlaybackStart(ctx context.Context, playbackStartInfo PlaybackStartInfo) (ImplResponse, error) {
	// TODO - update ReportPlaybackStart with the required logic for this service method.
	// Add api_playstate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ReportPlaybackStart method not implemented")
}

// ReportPlaybackStopped - Reports playback has stopped within a session.
func (s *PlaystateAPIService) ReportPlaybackStopped(ctx context.Context, playbackStopInfo PlaybackStopInfo) (ImplResponse, error) {
	// TODO - update ReportPlaybackStopped with the required logic for this service method.
	// Add api_playstate_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(204, {}) or use other options such as http.Ok ...
	// return Response(204, nil),nil

	// TODO: Uncomment the next line to return response Response(401, {}) or use other options such as http.Ok ...
	// return Response(401, nil),nil

	// TODO: Uncomment the next line to return response Response(403, {}) or use other options such as http.Ok ...
	// return Response(403, nil),nil

	return Response(http.StatusNotImplemented, nil), errors.New("ReportPlaybackStopped method not implemented")
}