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




// OrderOfIssueTypes - An ordered list of issue type IDs and information about where to move them.
type OrderOfIssueTypes struct {

	// The ID of the issue type to place the moved issue types after. Required if `position` isn't provided.
	After string `json:"after,omitempty"`

	// A list of the issue type IDs to move. The order of the issue type IDs in the list is the order they are given after the move.
	IssueTypeIds []string `json:"issueTypeIds"`

	// The position the issue types should be moved to. Required if `after` isn't provided.
	Position string `json:"position,omitempty"`
}

// AssertOrderOfIssueTypesRequired checks if the required fields are not zero-ed
func AssertOrderOfIssueTypesRequired(obj OrderOfIssueTypes) error {
	elements := map[string]interface{}{
		"issueTypeIds": obj.IssueTypeIds,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertOrderOfIssueTypesConstraints checks if the values respects the defined constraints
func AssertOrderOfIssueTypesConstraints(obj OrderOfIssueTypes) error {
	return nil
}