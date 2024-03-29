/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type CapabilityOption struct {

	Description string `json:"description,omitempty"`

	Enabled bool `json:"enabled,omitempty"`

	EnabledByDefault bool `json:"enabledByDefault,omitempty"`

	Key string `json:"key,omitempty"`

	Name string `json:"name,omitempty"`

	SupportsWildcard bool `json:"supportsWildcard,omitempty"`
}

// AssertCapabilityOptionRequired checks if the required fields are not zero-ed
func AssertCapabilityOptionRequired(obj CapabilityOption) error {
	return nil
}

// AssertCapabilityOptionConstraints checks if the values respects the defined constraints
func AssertCapabilityOptionConstraints(obj CapabilityOption) error {
	return nil
}
