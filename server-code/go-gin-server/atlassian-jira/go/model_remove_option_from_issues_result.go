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

type RemoveOptionFromIssuesResult struct {

	Errors SimpleErrorCollection `json:"errors,omitempty"`

	// The IDs of the modified issues.
	ModifiedIssues []int64 `json:"modifiedIssues,omitempty"`

	// The IDs of the unchanged issues, those issues where errors prevent modification.
	UnmodifiedIssues []int64 `json:"unmodifiedIssues,omitempty"`
}
