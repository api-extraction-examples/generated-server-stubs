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

// WorkflowSimpleCondition - A workflow transition rule condition. This object returns `nodeType` as `simple`.
type WorkflowSimpleCondition struct {

	// EXPERIMENTAL. The configuration of the transition rule.
	Configuration map[string]interface{} `json:"configuration,omitempty"`

	NodeType string `json:"nodeType"`

	// The type of the transition rule.
	Type string `json:"type"`
}
