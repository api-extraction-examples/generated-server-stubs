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

// IssueTypeScreenSchemeItem - The screen scheme for an issue type.
type IssueTypeScreenSchemeItem struct {

	// The ID of the issue type or *default*. Only issue types used in classic projects are accepted. When creating an issue screen scheme, an entry for *default* must be provided and defines the mapping for all issue types without a screen scheme. Otherwise, a *default* entry can't be provided.
	IssueTypeId string `json:"issueTypeId"`

	// The ID of the issue type screen scheme.
	IssueTypeScreenSchemeId string `json:"issueTypeScreenSchemeId"`

	// The ID of the screen scheme.
	ScreenSchemeId string `json:"screenSchemeId"`
}
