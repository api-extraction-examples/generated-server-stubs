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




// CustomFieldContextDefaultValueForgeNumberField - Default value for a Forge number custom field.
type CustomFieldContextDefaultValueForgeNumberField struct {

	// The ID of the context.
	ContextId string `json:"contextId"`

	// The default floating-point number.
	Number float64 `json:"number"`

	Type string `json:"type"`
}

// AssertCustomFieldContextDefaultValueForgeNumberFieldRequired checks if the required fields are not zero-ed
func AssertCustomFieldContextDefaultValueForgeNumberFieldRequired(obj CustomFieldContextDefaultValueForgeNumberField) error {
	elements := map[string]interface{}{
		"contextId": obj.ContextId,
		"number": obj.Number,
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCustomFieldContextDefaultValueForgeNumberFieldConstraints checks if the values respects the defined constraints
func AssertCustomFieldContextDefaultValueForgeNumberFieldConstraints(obj CustomFieldContextDefaultValueForgeNumberField) error {
	return nil
}
