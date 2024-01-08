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

// ProjectIssueTypeHierarchy - The issue type hierarchy for the project.
type ProjectIssueTypeHierarchy struct {

	// The ID of the base level. This property is deprecated, see [Change notice: Removing hierarchy level IDs from next-gen APIs](https://developer.atlassian.com/cloud/jira/platform/change-notice-removing-hierarchy-level-ids-from-next-gen-apis/).
	BaseLevelId int64 `json:"baseLevelId,omitempty"`

	// Details about the hierarchy level.
	Levels []SimplifiedHierarchyLevel `json:"levels,omitempty"`
}
