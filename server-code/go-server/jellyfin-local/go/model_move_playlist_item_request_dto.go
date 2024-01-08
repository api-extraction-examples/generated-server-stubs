/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// MovePlaylistItemRequestDto - Class MovePlaylistItemRequestDto.
type MovePlaylistItemRequestDto struct {

	// Gets or sets the new position.
	NewIndex int32 `json:"NewIndex,omitempty"`

	// Gets or sets the playlist identifier of the item.
	PlaylistItemId string `json:"PlaylistItemId,omitempty"`
}

// AssertMovePlaylistItemRequestDtoRequired checks if the required fields are not zero-ed
func AssertMovePlaylistItemRequestDtoRequired(obj MovePlaylistItemRequestDto) error {
	return nil
}

// AssertMovePlaylistItemRequestDtoConstraints checks if the values respects the defined constraints
func AssertMovePlaylistItemRequestDtoConstraints(obj MovePlaylistItemRequestDto) error {
	return nil
}