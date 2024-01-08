/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type PersonalisedMusicArtist struct {

	Id string `json:"id,omitempty"`

	Images []PersonalisedMusicImage `json:"images,omitempty"`

	Name string `json:"name,omitempty"`

	Role string `json:"role,omitempty"`
}
