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

// ReorderIssueResolutionsRequest - Change the order of issue resolutions.
type ReorderIssueResolutionsRequest struct {

	// The ID of the resolution. Required if `position` isn't provided.
	After string `json:"after,omitempty"`

	// The list of resolution IDs to be reordered. Cannot contain duplicates nor after ID.
	Ids []string `json:"ids"`

	// The position for issue resolutions to be moved to. Required if `after` isn't provided.
	Position string `json:"position,omitempty"`
}
