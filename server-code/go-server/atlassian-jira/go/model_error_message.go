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




type ErrorMessage struct {

	// The error message.
	Message string `json:"message"`
}

// AssertErrorMessageRequired checks if the required fields are not zero-ed
func AssertErrorMessageRequired(obj ErrorMessage) error {
	elements := map[string]interface{}{
		"message": obj.Message,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertErrorMessageConstraints checks if the values respects the defined constraints
func AssertErrorMessageConstraints(obj ErrorMessage) error {
	return nil
}
