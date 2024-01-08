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

// VersionIssueCounts - Various counts of issues within a version.
type VersionIssueCounts struct {

	// List of custom fields using the version.
	CustomFieldUsage []VersionUsageInCustomField `json:"customFieldUsage,omitempty"`

	// Count of issues where a version custom field is set to the version.
	IssueCountWithCustomFieldsShowingVersion int64 `json:"issueCountWithCustomFieldsShowingVersion,omitempty"`

	// Count of issues where the `affectedVersion` is set to the version.
	IssuesAffectedCount int64 `json:"issuesAffectedCount,omitempty"`

	// Count of issues where the `fixVersion` is set to the version.
	IssuesFixedCount int64 `json:"issuesFixedCount,omitempty"`

	// The URL of these count details.
	Self string `json:"self,omitempty"`
}