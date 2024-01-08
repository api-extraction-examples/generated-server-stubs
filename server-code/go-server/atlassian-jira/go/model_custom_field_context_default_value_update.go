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




// CustomFieldContextDefaultValueUpdate - Default values to update.
type CustomFieldContextDefaultValueUpdate struct {

	DefaultValues []CustomFieldContextDefaultValue `json:"defaultValues,omitempty"`
}

// AssertCustomFieldContextDefaultValueUpdateRequired checks if the required fields are not zero-ed
func AssertCustomFieldContextDefaultValueUpdateRequired(obj CustomFieldContextDefaultValueUpdate) error {
	for _, el := range obj.DefaultValues {
		if err := AssertCustomFieldContextDefaultValueRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCustomFieldContextDefaultValueUpdateConstraints checks if the values respects the defined constraints
func AssertCustomFieldContextDefaultValueUpdateConstraints(obj CustomFieldContextDefaultValueUpdate) error {
	return nil
}