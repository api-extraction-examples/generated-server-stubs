/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// RemoveFromPlaylistRequestDto - Class RemoveFromPlaylistRequestDto.
type RemoveFromPlaylistRequestDto struct {

	// Gets or sets the playlist identifiers ot the items.
	PlaylistItemIds *[]string `json:"PlaylistItemIds,omitempty"`
}

// AssertRemoveFromPlaylistRequestDtoRequired checks if the required fields are not zero-ed
func AssertRemoveFromPlaylistRequestDtoRequired(obj RemoveFromPlaylistRequestDto) error {
	return nil
}

// AssertRemoveFromPlaylistRequestDtoConstraints checks if the values respects the defined constraints
func AssertRemoveFromPlaylistRequestDtoConstraints(obj RemoveFromPlaylistRequestDto) error {
	return nil
}