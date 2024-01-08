/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type EnumOptionInsertRequest struct {

	// An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.
	AfterEnumOption string `json:"after_enum_option,omitempty"`

	// An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.
	BeforeEnumOption string `json:"before_enum_option,omitempty"`

	// The gid of the enum option to relocate.
	EnumOption string `json:"enum_option"`
}

// AssertEnumOptionInsertRequestRequired checks if the required fields are not zero-ed
func AssertEnumOptionInsertRequestRequired(obj EnumOptionInsertRequest) error {
	elements := map[string]interface{}{
		"enum_option": obj.EnumOption,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertEnumOptionInsertRequestConstraints checks if the values respects the defined constraints
func AssertEnumOptionInsertRequestConstraints(obj EnumOptionInsertRequest) error {
	return nil
}