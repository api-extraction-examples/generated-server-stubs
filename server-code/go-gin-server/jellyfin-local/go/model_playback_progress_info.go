/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// PlaybackProgressInfo - Class PlaybackProgressInfo.
type PlaybackProgressInfo struct {

	AspectRatio *string `json:"AspectRatio,omitempty"`

	// Gets or sets the index of the audio stream.
	AudioStreamIndex *int32 `json:"AudioStreamIndex,omitempty"`

	Brightness *int32 `json:"Brightness,omitempty"`

	// Gets or sets a value indicating whether this instance can seek.
	CanSeek bool `json:"CanSeek,omitempty"`

	// Gets or sets a value indicating whether this instance is muted.
	IsMuted bool `json:"IsMuted,omitempty"`

	// Gets or sets a value indicating whether this instance is paused.
	IsPaused bool `json:"IsPaused,omitempty"`

	Item BaseItemDto `json:"Item,omitempty"`

	// Gets or sets the item identifier.
	ItemId string `json:"ItemId,omitempty"`

	// Gets or sets the live stream identifier.
	LiveStreamId *string `json:"LiveStreamId,omitempty"`

	// Gets or sets the media version identifier.
	MediaSourceId *string `json:"MediaSourceId,omitempty"`

	NowPlayingQueue *[]QueueItem `json:"NowPlayingQueue,omitempty"`

	PlayMethod PlayMethod `json:"PlayMethod,omitempty"`

	// Gets or sets the play session identifier.
	PlaySessionId *string `json:"PlaySessionId,omitempty"`

	PlaybackStartTimeTicks *int64 `json:"PlaybackStartTimeTicks,omitempty"`

	PlaylistItemId *string `json:"PlaylistItemId,omitempty"`

	// Gets or sets the position ticks.
	PositionTicks *int64 `json:"PositionTicks,omitempty"`

	RepeatMode RepeatMode `json:"RepeatMode,omitempty"`

	// Gets or sets the session id.
	SessionId *string `json:"SessionId,omitempty"`

	// Gets or sets the index of the subtitle stream.
	SubtitleStreamIndex *int32 `json:"SubtitleStreamIndex,omitempty"`

	// Gets or sets the volume level.
	VolumeLevel *int32 `json:"VolumeLevel,omitempty"`
}
