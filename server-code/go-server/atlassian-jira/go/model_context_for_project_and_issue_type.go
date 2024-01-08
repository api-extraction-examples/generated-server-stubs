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




// ContextForProjectAndIssueType - The project and issue type mapping with a matching custom field context.
type ContextForProjectAndIssueType struct {

	// The ID of the custom field context.
	ContextId string `json:"contextId"`

	// The ID of the issue type.
	IssueTypeId string `json:"issueTypeId"`

	// The ID of the project.
	ProjectId string `json:"projectId"`
}

// AssertContextForProjectAndIssueTypeRequired checks if the required fields are not zero-ed
func AssertContextForProjectAndIssueTypeRequired(obj ContextForProjectAndIssueType) error {
	elements := map[string]interface{}{
		"contextId": obj.ContextId,
		"issueTypeId": obj.IssueTypeId,
		"projectId": obj.ProjectId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertContextForProjectAndIssueTypeConstraints checks if the values respects the defined constraints
func AssertContextForProjectAndIssueTypeConstraints(obj ContextForProjectAndIssueType) error {
	return nil
}