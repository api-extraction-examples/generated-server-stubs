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




// VersionUnresolvedIssuesCount - Count of a version's unresolved issues.
type VersionUnresolvedIssuesCount struct {

	// Count of issues.
	IssuesCount int64 `json:"issuesCount,omitempty"`

	// Count of unresolved issues.
	IssuesUnresolvedCount int64 `json:"issuesUnresolvedCount,omitempty"`

	// The URL of these count details.
	Self string `json:"self,omitempty"`
}

// AssertVersionUnresolvedIssuesCountRequired checks if the required fields are not zero-ed
func AssertVersionUnresolvedIssuesCountRequired(obj VersionUnresolvedIssuesCount) error {
	return nil
}

// AssertVersionUnresolvedIssuesCountConstraints checks if the values respects the defined constraints
func AssertVersionUnresolvedIssuesCountConstraints(obj VersionUnresolvedIssuesCount) error {
	return nil
}
