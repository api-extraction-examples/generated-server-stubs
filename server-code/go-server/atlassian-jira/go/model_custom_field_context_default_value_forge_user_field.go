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




// CustomFieldContextDefaultValueForgeUserField - Defaults for a Forge user custom field.
type CustomFieldContextDefaultValueForgeUserField struct {

	// The ID of the default user.
	AccountId string `json:"accountId"`

	// The ID of the context.
	ContextId string `json:"contextId"`

	Type string `json:"type"`

	UserFilter UserFilter `json:"userFilter"`
}

// AssertCustomFieldContextDefaultValueForgeUserFieldRequired checks if the required fields are not zero-ed
func AssertCustomFieldContextDefaultValueForgeUserFieldRequired(obj CustomFieldContextDefaultValueForgeUserField) error {
	elements := map[string]interface{}{
		"accountId": obj.AccountId,
		"contextId": obj.ContextId,
		"type": obj.Type,
		"userFilter": obj.UserFilter,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	if err := AssertUserFilterRequired(obj.UserFilter); err != nil {
		return err
	}
	return nil
}

// AssertCustomFieldContextDefaultValueForgeUserFieldConstraints checks if the values respects the defined constraints
func AssertCustomFieldContextDefaultValueForgeUserFieldConstraints(obj CustomFieldContextDefaultValueForgeUserField) error {
	return nil
}
