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




// PageBeanIssueSecuritySchemeToProjectMapping - A page of items.
type PageBeanIssueSecuritySchemeToProjectMapping struct {

	// Whether this is the last page.
	IsLast bool `json:"isLast,omitempty"`

	// The maximum number of items that could be returned.
	MaxResults int32 `json:"maxResults,omitempty"`

	// If there is another page of results, the URL of the next page.
	NextPage string `json:"nextPage,omitempty"`

	// The URL of the page.
	Self string `json:"self,omitempty"`

	// The index of the first item returned.
	StartAt int64 `json:"startAt,omitempty"`

	// The number of items returned.
	Total int64 `json:"total,omitempty"`

	// The list of items.
	Values []IssueSecuritySchemeToProjectMapping `json:"values,omitempty"`
}

// AssertPageBeanIssueSecuritySchemeToProjectMappingRequired checks if the required fields are not zero-ed
func AssertPageBeanIssueSecuritySchemeToProjectMappingRequired(obj PageBeanIssueSecuritySchemeToProjectMapping) error {
	return nil
}

// AssertPageBeanIssueSecuritySchemeToProjectMappingConstraints checks if the values respects the defined constraints
func AssertPageBeanIssueSecuritySchemeToProjectMappingConstraints(obj PageBeanIssueSecuritySchemeToProjectMapping) error {
	return nil
}
