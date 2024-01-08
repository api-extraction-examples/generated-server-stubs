/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// InstallationInfo - Class InstallationInfo.
type InstallationInfo struct {

	// Gets or sets the changelog for this version.
	Changelog *string `json:"Changelog,omitempty"`

	// Gets or sets a checksum for the binary.
	Checksum *string `json:"Checksum,omitempty"`

	// Gets or sets the Id.
	Guid string `json:"Guid,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	// Gets or sets the source URL.
	SourceUrl *string `json:"SourceUrl,omitempty"`

	Version Version `json:"Version,omitempty"`
}