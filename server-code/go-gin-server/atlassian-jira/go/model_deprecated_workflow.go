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

// DeprecatedWorkflow - Details about a workflow.
type DeprecatedWorkflow struct {

	Default bool `json:"default,omitempty"`

	// The description of the workflow.
	Description string `json:"description,omitempty"`

	// The datetime the workflow was last modified.
	LastModifiedDate string `json:"lastModifiedDate,omitempty"`

	// This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
	LastModifiedUser string `json:"lastModifiedUser,omitempty"`

	// The account ID of the user that last modified the workflow.
	LastModifiedUserAccountId string `json:"lastModifiedUserAccountId,omitempty"`

	// The name of the workflow.
	Name string `json:"name,omitempty"`

	Scope DeprecatedWorkflowScope `json:"scope,omitempty"`

	// The number of steps included in the workflow.
	Steps int32 `json:"steps,omitempty"`
}
