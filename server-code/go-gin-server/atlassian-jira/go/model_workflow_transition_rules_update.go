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

// WorkflowTransitionRulesUpdate - Details about a workflow configuration update request.
type WorkflowTransitionRulesUpdate struct {

	// The list of workflows with transition rules to update.
	Workflows []WorkflowTransitionRules `json:"workflows"`
}
