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




type PaginatedResponseComment struct {

	MaxResults int32 `json:"maxResults,omitempty"`

	Results []Comment `json:"results,omitempty"`

	StartAt int64 `json:"startAt,omitempty"`

	Total int64 `json:"total,omitempty"`
}

// AssertPaginatedResponseCommentRequired checks if the required fields are not zero-ed
func AssertPaginatedResponseCommentRequired(obj PaginatedResponseComment) error {
	return nil
}

// AssertPaginatedResponseCommentConstraints checks if the values respects the defined constraints
func AssertPaginatedResponseCommentConstraints(obj PaginatedResponseComment) error {
	return nil
}
