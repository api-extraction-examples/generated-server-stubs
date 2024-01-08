/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CustomFieldCompact struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	DateValue CustomFieldCompactAllOfDateValue `json:"date_value,omitempty"`

	// A string representation for the value of the custom field. Integrations that don't require the underlying type should use this field to read values. Using this field will future-proof an app against new custom field types.
	DisplayValue *string `json:"display_value,omitempty"`

	// *Conditional*. Determines if the custom field is enabled or not.
	Enabled bool `json:"enabled,omitempty"`

	// *Conditional*. Only relevant for custom fields of type `enum`. This array specifies the possible values which an `enum` custom field can adopt. To modify the enum options, refer to [working with enum options](/docs/create-an-enum-option).
	EnumOptions []EnumOption `json:"enum_options,omitempty"`

	EnumValue CustomFieldCompactAllOfEnumValue `json:"enum_value,omitempty"`

	// *Conditional*. Only relevant for custom fields of type `multi_enum`. This object is the chosen values of a `multi_enum` custom field.
	MultiEnumValues []EnumOption `json:"multi_enum_values,omitempty"`

	// The name of the custom field.
	Name string `json:"name,omitempty"`

	// *Conditional*. This number is the value of a `number` custom field.
	NumberValue float32 `json:"number_value,omitempty"`

	// The type of the custom field. Must be one of the given values. 
	ResourceSubtype string `json:"resource_subtype,omitempty"`

	// *Conditional*. This string is the value of a `text` custom field.
	TextValue string `json:"text_value,omitempty"`

	// *Deprecated: new integrations should prefer the resource_subtype field.* The type of the custom field. Must be one of the given values. 
	Type string `json:"type,omitempty"`
}

// AssertCustomFieldCompactRequired checks if the required fields are not zero-ed
func AssertCustomFieldCompactRequired(obj CustomFieldCompact) error {
	if err := AssertCustomFieldCompactAllOfDateValueRequired(obj.DateValue); err != nil {
		return err
	}
	for _, el := range obj.EnumOptions {
		if err := AssertEnumOptionRequired(el); err != nil {
			return err
		}
	}
	if err := AssertCustomFieldCompactAllOfEnumValueRequired(obj.EnumValue); err != nil {
		return err
	}
	for _, el := range obj.MultiEnumValues {
		if err := AssertEnumOptionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCustomFieldCompactConstraints checks if the values respects the defined constraints
func AssertCustomFieldCompactConstraints(obj CustomFieldCompact) error {
	return nil
}
