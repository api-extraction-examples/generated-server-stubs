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

// UpdateFieldConfigurationSchemeDetails - The details of the field configuration scheme.
type UpdateFieldConfigurationSchemeDetails struct {

	// The description of the field configuration scheme.
	Description string `json:"description,omitempty"`

	// The name of the field configuration scheme. The name must be unique.
	Name string `json:"name"`
}
