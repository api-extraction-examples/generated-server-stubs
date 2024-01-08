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




// BulkIssueIsWatching - A container for the watch status of a list of issues.
type BulkIssueIsWatching struct {

	// The map of issue ID to boolean watch status.
	IssuesIsWatching map[string]bool `json:"issuesIsWatching,omitempty"`
}

// AssertBulkIssueIsWatchingRequired checks if the required fields are not zero-ed
func AssertBulkIssueIsWatchingRequired(obj BulkIssueIsWatching) error {
	return nil
}

// AssertBulkIssueIsWatchingConstraints checks if the values respects the defined constraints
func AssertBulkIssueIsWatchingConstraints(obj BulkIssueIsWatching) error {
	return nil
}
