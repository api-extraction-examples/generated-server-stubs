/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type SecuritySchemeLevelBean struct {

	// The description of the issue security scheme level.
	Description string `json:"description,omitempty"`

	// Specifies whether the level is the default level. False by default.
	IsDefault bool `json:"isDefault,omitempty"`

	// The list of level members which should be added to the issue security scheme level.
	Members []SecuritySchemeLevelMemberBean `json:"members,omitempty"`

	// The name of the issue security scheme level. Must be unique.
	Name string `json:"name"`
}
