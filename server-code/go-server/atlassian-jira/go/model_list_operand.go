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




// ListOperand - An operand that is a list of values.
type ListOperand struct {

	// Encoded operand, which can be used directly in a JQL query.
	EncodedOperand string `json:"encodedOperand,omitempty"`

	// The list of operand values.
	Values []JqlQueryUnitaryOperand `json:"values"`
}

// AssertListOperandRequired checks if the required fields are not zero-ed
func AssertListOperandRequired(obj ListOperand) error {
	elements := map[string]interface{}{
		"values": obj.Values,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Values {
		if err := AssertJqlQueryUnitaryOperandRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertListOperandConstraints checks if the values respects the defined constraints
func AssertListOperandConstraints(obj ListOperand) error {
	return nil
}