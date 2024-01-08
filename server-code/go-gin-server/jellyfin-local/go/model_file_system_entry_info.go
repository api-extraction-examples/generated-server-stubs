/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// FileSystemEntryInfo - Class FileSystemEntryInfo.
type FileSystemEntryInfo struct {

	// Gets the name.
	Name *string `json:"Name,omitempty"`

	// Gets the path.
	Path *string `json:"Path,omitempty"`

	Type FileSystemEntryType `json:"Type,omitempty"`
}
