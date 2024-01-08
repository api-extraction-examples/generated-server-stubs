/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// LocationType : Enum LocationType.
type LocationType string

// List of LocationType
const (
	FILE_SYSTEM LocationType = "FileSystem"
	REMOTE LocationType = "Remote"
	VIRTUAL LocationType = "Virtual"
	OFFLINE LocationType = "Offline"
)