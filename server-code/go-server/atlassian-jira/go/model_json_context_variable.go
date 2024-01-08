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




// JsonContextVariable - A JSON object with custom content.
type JsonContextVariable struct {

	// Type of custom context variable.
	Type string `json:"type"`

	// A JSON object containing custom content.
	Value map[string]interface{} `json:"value,omitempty"`
}

// AssertJsonContextVariableRequired checks if the required fields are not zero-ed
func AssertJsonContextVariableRequired(obj JsonContextVariable) error {
	elements := map[string]interface{}{
		"type": obj.Type,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertJsonContextVariableConstraints checks if the values respects the defined constraints
func AssertJsonContextVariableConstraints(obj JsonContextVariable) error {
	return nil
}
