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




type CustomContextVariable struct {

	// Type of custom context variable.
	Type string `json:"type"`

	// The account ID of the user.
	AccountId string `json:"accountId"`

	// The issue ID.
	Id int64 `json:"id,omitempty"`

	// The issue key.
	Key string `json:"key,omitempty"`

	// A JSON object containing custom content.
	Value map[string]interface{} `json:"value,omitempty"`
}

// AssertCustomContextVariableRequired checks if the required fields are not zero-ed
func AssertCustomContextVariableRequired(obj CustomContextVariable) error {
	elements := map[string]interface{}{
		"type": obj.Type,
		"accountId": obj.AccountId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertCustomContextVariableConstraints checks if the values respects the defined constraints
func AssertCustomContextVariableConstraints(obj CustomContextVariable) error {
	return nil
}
