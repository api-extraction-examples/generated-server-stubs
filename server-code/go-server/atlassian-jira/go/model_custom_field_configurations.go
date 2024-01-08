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




// CustomFieldConfigurations - Details of configurations for a custom field.
type CustomFieldConfigurations struct {

	// The list of custom field configuration details.
	Configurations []ContextualConfiguration `json:"configurations"`
}

// AssertCustomFieldConfigurationsRequired checks if the required fields are not zero-ed
func AssertCustomFieldConfigurationsRequired(obj CustomFieldConfigurations) error {
	elements := map[string]interface{}{
		"configurations": obj.Configurations,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Configurations {
		if err := AssertContextualConfigurationRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCustomFieldConfigurationsConstraints checks if the values respects the defined constraints
func AssertCustomFieldConfigurationsConstraints(obj CustomFieldConfigurations) error {
	return nil
}