/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// SendCommandType : Enum SendCommandType.
type SendCommandType string

// List of SendCommandType
const (
	UNPAUSE SendCommandType = "Unpause"
	PAUSE SendCommandType = "Pause"
	STOP SendCommandType = "Stop"
	SEEK SendCommandType = "Seek"
)
