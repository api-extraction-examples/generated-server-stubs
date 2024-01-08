/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type PersonalisedMusicData struct {

	Artist PersonalisedMusicArtist `json:"artist,omitempty"`

	Clip PersonalisedMusicClip `json:"clip,omitempty"`

	Genre PersonalisedMusicGenre `json:"genre,omitempty"`

	Playlist PersonalisedMusicPlaylist `json:"playlist,omitempty"`

	Service PersonalisedMusicService `json:"service,omitempty"`

	Track PersonalisedMusicTrack `json:"track,omitempty"`
}
