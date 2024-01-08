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

// SecurityScheme - Details about a security scheme.
type SecurityScheme struct {

	// The ID of the default security level.
	DefaultSecurityLevelId int64 `json:"defaultSecurityLevelId,omitempty"`

	// The description of the issue security scheme.
	Description string `json:"description,omitempty"`

	// The ID of the issue security scheme.
	Id int64 `json:"id,omitempty"`

	Levels []SecurityLevel `json:"levels,omitempty"`

	// The name of the issue security scheme.
	Name string `json:"name,omitempty"`

	// The URL of the issue security scheme.
	Self string `json:"self,omitempty"`
}
