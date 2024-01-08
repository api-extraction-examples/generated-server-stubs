/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// PluginStatus : Plugin load status.
type PluginStatus string

// List of PluginStatus
const (
	ACTIVE PluginStatus = "Active"
	RESTART PluginStatus = "Restart"
	DELETED PluginStatus = "Deleted"
	SUPERCEDED PluginStatus = "Superceded"
	MALFUNCTIONED PluginStatus = "Malfunctioned"
	NOT_SUPPORTED PluginStatus = "NotSupported"
	DISABLED PluginStatus = "Disabled"
)
