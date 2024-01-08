/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type MetadataRefreshMode string

// List of MetadataRefreshMode
const (
	NONE MetadataRefreshMode = "None"
	VALIDATION_ONLY MetadataRefreshMode = "ValidationOnly"
	DEFAULT MetadataRefreshMode = "Default"
	FULL_REFRESH MetadataRefreshMode = "FullRefresh"
)