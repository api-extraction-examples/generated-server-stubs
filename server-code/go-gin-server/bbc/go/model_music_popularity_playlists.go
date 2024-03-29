/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type MusicPopularityPlaylists struct {

	Limit int32 `json:"limit,omitempty"`

	Method string `json:"method"`

	Offset int32 `json:"offset,omitempty"`

	RepliedAt string `json:"repliedAt"`

	Results []MusicPopularityPlaylist `json:"results"`

	Schema string `json:"schema"`

	Total int32 `json:"total"`
}
