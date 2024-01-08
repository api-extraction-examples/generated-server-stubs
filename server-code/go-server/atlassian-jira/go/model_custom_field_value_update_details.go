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




// CustomFieldValueUpdateDetails - Details of updates for a custom field.
type CustomFieldValueUpdateDetails struct {

	// The list of custom field update details.
	Updates []CustomFieldValueUpdate `json:"updates,omitempty"`
}

// AssertCustomFieldValueUpdateDetailsRequired checks if the required fields are not zero-ed
func AssertCustomFieldValueUpdateDetailsRequired(obj CustomFieldValueUpdateDetails) error {
	for _, el := range obj.Updates {
		if err := AssertCustomFieldValueUpdateRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCustomFieldValueUpdateDetailsConstraints checks if the values respects the defined constraints
func AssertCustomFieldValueUpdateDetailsConstraints(obj CustomFieldValueUpdateDetails) error {
	return nil
}