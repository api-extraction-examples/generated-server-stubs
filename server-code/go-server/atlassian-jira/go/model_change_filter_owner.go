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




// ChangeFilterOwner - The account ID of the new owner.
type ChangeFilterOwner struct {

	// The account ID of the new owner.
	AccountId string `json:"accountId"`
}

// AssertChangeFilterOwnerRequired checks if the required fields are not zero-ed
func AssertChangeFilterOwnerRequired(obj ChangeFilterOwner) error {
	elements := map[string]interface{}{
		"accountId": obj.AccountId,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertChangeFilterOwnerConstraints checks if the values respects the defined constraints
func AssertChangeFilterOwnerConstraints(obj ChangeFilterOwner) error {
	return nil
}