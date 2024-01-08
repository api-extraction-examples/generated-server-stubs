/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type CustomFieldBase struct {

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

	// *Conditional*. A unique identifier to associate this field with the template source of truth.
	AsanaCreatedField *string `json:"asana_created_field,omitempty"`

	// ISO 4217 currency code to format this custom field. This will be null if the `format` is not `currency`.
	CurrencyCode *string `json:"currency_code,omitempty"`

	// This is the string that appears next to the custom field value. This will be null if the `format` is not `custom`.
	CustomLabel *string `json:"custom_label,omitempty"`

	// Only relevant for custom fields with `custom` format. This depicts where to place the custom label. This will be null if the `format` is not `custom`.
	CustomLabelPosition string `json:"custom_label_position,omitempty"`

	// [Opt In](/docs/input-output-options). The description of the custom field.
	Description string `json:"description,omitempty"`

	// The format of this custom field.
	Format string `json:"format,omitempty"`

	// *Conditional*. This flag describes whether a follower of a task with this field should receive inbox notifications from changes to this field.
	HasNotificationsEnabled bool `json:"has_notifications_enabled,omitempty"`

	// This flag describes whether this custom field is available to every container in the workspace. Before project-specific custom fields, this field was always true.
	IsGlobalToWorkspace bool `json:"is_global_to_workspace,omitempty"`

	// Only relevant for custom fields of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%. The identifier format will always have a precision of 0.
	Precision int32 `json:"precision,omitempty"`
}
