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




// CustomFieldContextDefaultValueForgeDateTimeField - The default value for a Forge date time custom field.
type CustomFieldContextDefaultValueForgeDateTimeField struct {

	// The ID of the context.
	ContextId string `json:"contextId"`

	// The default date-time in ISO format. Ignored if `useCurrent` is true.
	DateTime string `json:"dateTime,omitempty"`

	Type string `json:"type"`

	// Whether to use the current date.
	UseCurrent bool `json:"useCurrent,omitempty"`
}

// AssertCustomFieldContextDefaultValueForgeDateTimeFieldRequired checks if the required fields are not zero-ed
func AssertCustomFieldContextDefaultValueForgeDateTimeFieldRequired(obj CustomFieldContextDefaultValueForgeDateTimeField) error {
	elements := map[string]interface{}{
		"contextId": obj.ContextId,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCustomFieldContextDefaultValueForgeDateTimeFieldConstraints checks if the values respects the defined constraints
func AssertCustomFieldContextDefaultValueForgeDateTimeFieldConstraints(obj CustomFieldContextDefaultValueForgeDateTimeField) error {
	return nil
}