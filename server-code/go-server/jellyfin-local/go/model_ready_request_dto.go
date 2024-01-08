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
	"time"
)



// ReadyRequestDto - Class ReadyRequest.
type ReadyRequestDto struct {

	// Gets or sets a value indicating whether the client playback is unpaused.
	IsPlaying bool `json:"IsPlaying,omitempty"`

	// Gets or sets the playlist item identifier of the playing item.
	PlaylistItemId string `json:"PlaylistItemId,omitempty"`

	// Gets or sets the position ticks.
	PositionTicks int64 `json:"PositionTicks,omitempty"`

	// Gets or sets when the request has been made by the client.
	When time.Time `json:"When,omitempty"`
}

// AssertReadyRequestDtoRequired checks if the required fields are not zero-ed
func AssertReadyRequestDtoRequired(obj ReadyRequestDto) error {
	return nil
}

// AssertReadyRequestDtoConstraints checks if the values respects the defined constraints
func AssertReadyRequestDtoConstraints(obj ReadyRequestDto) error {
	return nil
}