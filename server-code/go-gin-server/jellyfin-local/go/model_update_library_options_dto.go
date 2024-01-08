/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// UpdateLibraryOptionsDto - Update library options dto.
type UpdateLibraryOptionsDto struct {

	// Gets or sets the library item id.
	Id string `json:"Id,omitempty"`

	LibraryOptions LibraryOptions `json:"LibraryOptions,omitempty"`
}