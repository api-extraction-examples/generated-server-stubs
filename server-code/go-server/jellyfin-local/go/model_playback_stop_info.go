/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// PlaybackStopInfo - Class PlaybackStopInfo.
type PlaybackStopInfo struct {

	// Gets or sets a value indicating whether this MediaBrowser.Model.Session.PlaybackStopInfo is failed.
	Failed bool `json:"Failed,omitempty"`

	Item BaseItemDto `json:"Item,omitempty"`

	// Gets or sets the item identifier.
	ItemId string `json:"ItemId,omitempty"`

	// Gets or sets the live stream identifier.
	LiveStreamId *string `json:"LiveStreamId,omitempty"`

	// Gets or sets the media version identifier.
	MediaSourceId *string `json:"MediaSourceId,omitempty"`

	NextMediaType *string `json:"NextMediaType,omitempty"`

	NowPlayingQueue *[]QueueItem `json:"NowPlayingQueue,omitempty"`

	// Gets or sets the play session identifier.
	PlaySessionId *string `json:"PlaySessionId,omitempty"`

	PlaylistItemId *string `json:"PlaylistItemId,omitempty"`

	// Gets or sets the position ticks.
	PositionTicks *int64 `json:"PositionTicks,omitempty"`

	// Gets or sets the session id.
	SessionId *string `json:"SessionId,omitempty"`
}

// AssertPlaybackStopInfoRequired checks if the required fields are not zero-ed
func AssertPlaybackStopInfoRequired(obj PlaybackStopInfo) error {
	if err := AssertBaseItemDtoRequired(obj.Item); err != nil {
		return err
	}
	if obj.NowPlayingQueue != nil {
		for _, el := range *obj.NowPlayingQueue {
			if err := AssertQueueItemRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertPlaybackStopInfoConstraints checks if the values respects the defined constraints
func AssertPlaybackStopInfoConstraints(obj PlaybackStopInfo) error {
	return nil
}