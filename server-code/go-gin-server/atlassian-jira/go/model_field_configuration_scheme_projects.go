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

// FieldConfigurationSchemeProjects - Project list with assigned field configuration schema.
type FieldConfigurationSchemeProjects struct {

	FieldConfigurationScheme FieldConfigurationScheme `json:"fieldConfigurationScheme,omitempty"`

	// The IDs of projects using the field configuration scheme.
	ProjectIds []string `json:"projectIds"`
}
