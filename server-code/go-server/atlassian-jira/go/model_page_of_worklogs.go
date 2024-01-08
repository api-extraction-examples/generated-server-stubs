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




// PageOfWorklogs - Paginated list of worklog details
type PageOfWorklogs struct {

	// The maximum number of results that could be on the page.
	MaxResults int32 `json:"maxResults,omitempty"`

	// The index of the first item returned on the page.
	StartAt int32 `json:"startAt,omitempty"`

	// The number of results on the page.
	Total int32 `json:"total,omitempty"`

	// List of worklogs.
	Worklogs []Worklog `json:"worklogs,omitempty"`
}

// AssertPageOfWorklogsRequired checks if the required fields are not zero-ed
func AssertPageOfWorklogsRequired(obj PageOfWorklogs) error {
	return nil
}

// AssertPageOfWorklogsConstraints checks if the values respects the defined constraints
func AssertPageOfWorklogsConstraints(obj PageOfWorklogs) error {
	return nil
}
