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

// FieldConfigurationItem - A field within a field configuration.
type FieldConfigurationItem struct {

	// The description of the field within the field configuration.
	Description string `json:"description,omitempty"`

	// The ID of the field within the field configuration.
	Id string `json:"id"`

	// Whether the field is hidden in the field configuration.
	IsHidden bool `json:"isHidden,omitempty"`

	// Whether the field is required in the field configuration.
	IsRequired bool `json:"isRequired,omitempty"`

	// The renderer type for the field within the field configuration.
	Renderer string `json:"renderer,omitempty"`
}
