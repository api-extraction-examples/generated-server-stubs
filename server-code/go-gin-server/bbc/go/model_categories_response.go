/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type CategoriesResponse struct {

	Schema string `json:"$schema"`

	Limit int32 `json:"limit"`

	Offset int32 `json:"offset"`

	Results []Category `json:"results"`

	Total int32 `json:"total"`
}
