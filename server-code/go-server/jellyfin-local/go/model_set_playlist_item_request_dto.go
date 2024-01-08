/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// SetPlaylistItemRequestDto - Class SetPlaylistItemRequestDto.
type SetPlaylistItemRequestDto struct {

	// Gets or sets the playlist identifier of the playing item.
	PlaylistItemId string `json:"PlaylistItemId,omitempty"`
}

// AssertSetPlaylistItemRequestDtoRequired checks if the required fields are not zero-ed
func AssertSetPlaylistItemRequestDtoRequired(obj SetPlaylistItemRequestDto) error {
	return nil
}

// AssertSetPlaylistItemRequestDtoConstraints checks if the values respects the defined constraints
func AssertSetPlaylistItemRequestDtoConstraints(obj SetPlaylistItemRequestDto) error {
	return nil
}
