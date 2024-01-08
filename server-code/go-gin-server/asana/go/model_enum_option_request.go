/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type EnumOptionRequest struct {

	// Globally unique identifier of the resource, as a string.
	Gid string `json:"gid,omitempty"`

	// The base type of this resource.
	ResourceType string `json:"resource_type,omitempty"`

	// The color of the enum option. Defaults to ‘none’.
	Color string `json:"color,omitempty"`

	// Whether or not the enum option is a selectable value for the custom field.
	Enabled bool `json:"enabled,omitempty"`

	// The name of the enum option.
	Name string `json:"name,omitempty"`

	// An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.
	InsertAfter string `json:"insert_after,omitempty"`

	// An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.
	InsertBefore string `json:"insert_before,omitempty"`
}
