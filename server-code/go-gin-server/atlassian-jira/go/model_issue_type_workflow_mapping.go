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

// IssueTypeWorkflowMapping - Details about the mapping between an issue type and a workflow.
type IssueTypeWorkflowMapping struct {

	// The ID of the issue type. Not required if updating the issue type-workflow mapping.
	IssueType string `json:"issueType,omitempty"`

	// Set to true to create or update the draft of a workflow scheme and update the mapping in the draft, when the workflow scheme cannot be edited. Defaults to `false`. Only applicable when updating the workflow-issue types mapping.
	UpdateDraftIfNeeded bool `json:"updateDraftIfNeeded,omitempty"`

	// The name of the workflow.
	Workflow string `json:"workflow,omitempty"`
}
