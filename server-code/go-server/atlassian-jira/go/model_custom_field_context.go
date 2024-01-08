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




// CustomFieldContext - The details of a custom field context.
type CustomFieldContext struct {

	// The description of the context.
	Description string `json:"description"`

	// The ID of the context.
	Id string `json:"id"`

	// Whether the context apply to all issue types.
	IsAnyIssueType bool `json:"isAnyIssueType"`

	// Whether the context is global.
	IsGlobalContext bool `json:"isGlobalContext"`

	// The name of the context.
	Name string `json:"name"`
}

// AssertCustomFieldContextRequired checks if the required fields are not zero-ed
func AssertCustomFieldContextRequired(obj CustomFieldContext) error {
	elements := map[string]interface{}{
		"description": obj.Description,
		"id": obj.Id,
		"isAnyIssueType": obj.IsAnyIssueType,
		"isGlobalContext": obj.IsGlobalContext,
		"name": obj.Name,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCustomFieldContextConstraints checks if the values respects the defined constraints
func AssertCustomFieldContextConstraints(obj CustomFieldContext) error {
	return nil
}