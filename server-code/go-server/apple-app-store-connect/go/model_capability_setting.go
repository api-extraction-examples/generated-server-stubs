/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CapabilitySetting struct {

	AllowedInstances string `json:"allowedInstances,omitempty"`

	Description string `json:"description,omitempty"`

	EnabledByDefault bool `json:"enabledByDefault,omitempty"`

	Key string `json:"key,omitempty"`

	MinInstances int32 `json:"minInstances,omitempty"`

	Name string `json:"name,omitempty"`

	Options []CapabilityOption `json:"options,omitempty"`

	Visible bool `json:"visible,omitempty"`
}

// AssertCapabilitySettingRequired checks if the required fields are not zero-ed
func AssertCapabilitySettingRequired(obj CapabilitySetting) error {
	for _, el := range obj.Options {
		if err := AssertCapabilityOptionRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCapabilitySettingConstraints checks if the values respects the defined constraints
func AssertCapabilitySettingConstraints(obj CapabilitySetting) error {
	return nil
}
