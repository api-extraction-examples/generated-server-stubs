/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// StartupRemoteAccessDto - Startup remote access dto.
type StartupRemoteAccessDto struct {

	// Gets or sets a value indicating whether enable automatic port mapping.
	EnableAutomaticPortMapping bool `json:"EnableAutomaticPortMapping"`

	// Gets or sets a value indicating whether enable remote access.
	EnableRemoteAccess bool `json:"EnableRemoteAccess"`
}
