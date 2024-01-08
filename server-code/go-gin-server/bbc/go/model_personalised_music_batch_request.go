/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type PersonalisedMusicBatchRequest struct {

	Action string `json:"action"`

	AddedAt string `json:"added_at,omitempty"`

	Context string `json:"context,omitempty"`

	Domain string `json:"domain"`

	Id string `json:"id"`

	MetaData PersonalisedMusicMetaData `json:"meta_data,omitempty"`

	Type string `json:"type"`
}