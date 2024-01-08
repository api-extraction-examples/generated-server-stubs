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

// IssueEntityPropertiesForMultiUpdate - An issue ID with entity property values. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.
type IssueEntityPropertiesForMultiUpdate struct {

	// The ID of the issue.
	IssueID int64 `json:"issueID,omitempty"`

	// Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.
	Properties map[string]JsonNode `json:"properties,omitempty"`
}
