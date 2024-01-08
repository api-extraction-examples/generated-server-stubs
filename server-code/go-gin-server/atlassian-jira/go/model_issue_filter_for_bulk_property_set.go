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

// IssueFilterForBulkPropertySet - Bulk operation filter details.
type IssueFilterForBulkPropertySet struct {

	// The value of properties to perform the bulk operation on.
	CurrentValue *interface{} `json:"currentValue,omitempty"`

	// List of issues to perform the bulk operation on.
	EntityIds []int64 `json:"entityIds,omitempty"`

	// Whether the bulk operation occurs only when the property is present on or absent from an issue.
	HasProperty bool `json:"hasProperty,omitempty"`
}