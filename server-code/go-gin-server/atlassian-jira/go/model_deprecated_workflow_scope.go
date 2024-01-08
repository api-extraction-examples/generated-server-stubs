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

// DeprecatedWorkflowScope - The scope where this workflow applies
type DeprecatedWorkflowScope struct {

	Project ScopeProject `json:"project,omitempty"`

	// The type of scope.
	Type string `json:"type,omitempty"`
}
