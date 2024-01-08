/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// PlaybackInfoResponse - Class PlaybackInfoResponse.
type PlaybackInfoResponse struct {

	ErrorCode PlaybackErrorCode `json:"ErrorCode,omitempty"`

	// Gets or sets the media sources.
	MediaSources *[]MediaSourceInfo `json:"MediaSources,omitempty"`

	// Gets or sets the play session identifier.
	PlaySessionId *string `json:"PlaySessionId,omitempty"`
}

// AssertPlaybackInfoResponseRequired checks if the required fields are not zero-ed
func AssertPlaybackInfoResponseRequired(obj PlaybackInfoResponse) error {
	if obj.MediaSources != nil {
		for _, el := range *obj.MediaSources {
			if err := AssertMediaSourceInfoRequired(el); err != nil {
				return err
			}
		}
	}
	return nil
}

// AssertPlaybackInfoResponseConstraints checks if the values respects the defined constraints
func AssertPlaybackInfoResponseConstraints(obj PlaybackInfoResponse) error {
	return nil
}
