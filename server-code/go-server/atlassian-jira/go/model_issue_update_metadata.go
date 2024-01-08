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




// IssueUpdateMetadata - A list of editable field details.
type IssueUpdateMetadata struct {

	Fields map[string]FieldMetadata `json:"fields,omitempty"`
}

// AssertIssueUpdateMetadataRequired checks if the required fields are not zero-ed
func AssertIssueUpdateMetadataRequired(obj IssueUpdateMetadata) error {
	return nil
}

// AssertIssueUpdateMetadataConstraints checks if the values respects the defined constraints
func AssertIssueUpdateMetadataConstraints(obj IssueUpdateMetadata) error {
	return nil
}
