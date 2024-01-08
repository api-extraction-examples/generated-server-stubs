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

// UpdateIssueSecurityLevelDetails - Details of issue security scheme level.
type UpdateIssueSecurityLevelDetails struct {

	// The description of the issue security scheme level.
	Description string `json:"description,omitempty"`

	// The name of the issue security scheme level. Must be unique.
	Name string `json:"name,omitempty"`
}