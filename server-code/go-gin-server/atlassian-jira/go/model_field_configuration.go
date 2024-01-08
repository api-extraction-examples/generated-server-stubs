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

// FieldConfiguration - Details of a field configuration.
type FieldConfiguration struct {

	// The description of the field configuration.
	Description string `json:"description"`

	// The ID of the field configuration.
	Id int64 `json:"id"`

	// Whether the field configuration is the default.
	IsDefault bool `json:"isDefault,omitempty"`

	// The name of the field configuration.
	Name string `json:"name"`
}
