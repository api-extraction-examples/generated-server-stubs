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




// CustomFieldContextDefaultValueForgeMultiUserField - Defaults for a Forge collection of users custom field.
type CustomFieldContextDefaultValueForgeMultiUserField struct {

	// The IDs of the default users.
	AccountIds []string `json:"accountIds"`

	// The ID of the context.
	ContextId string `json:"contextId"`

	Type string `json:"type"`
}

// AssertCustomFieldContextDefaultValueForgeMultiUserFieldRequired checks if the required fields are not zero-ed
func AssertCustomFieldContextDefaultValueForgeMultiUserFieldRequired(obj CustomFieldContextDefaultValueForgeMultiUserField) error {
	elements := map[string]interface{}{
		"accountIds": obj.AccountIds,
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

// AssertCustomFieldContextDefaultValueForgeMultiUserFieldConstraints checks if the values respects the defined constraints
func AssertCustomFieldContextDefaultValueForgeMultiUserFieldConstraints(obj CustomFieldContextDefaultValueForgeMultiUserField) error {
	return nil
}
