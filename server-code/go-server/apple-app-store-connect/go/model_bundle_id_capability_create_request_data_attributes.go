/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type BundleIdCapabilityCreateRequestDataAttributes struct {

	CapabilityType CapabilityType `json:"capabilityType"`

	Settings []CapabilitySetting `json:"settings,omitempty"`
}

// AssertBundleIdCapabilityCreateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertBundleIdCapabilityCreateRequestDataAttributesRequired(obj BundleIdCapabilityCreateRequestDataAttributes) error {
	elements := map[string]interface{}{
		"capabilityType": obj.CapabilityType,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.Settings {
		if err := AssertCapabilitySettingRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertBundleIdCapabilityCreateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertBundleIdCapabilityCreateRequestDataAttributesConstraints(obj BundleIdCapabilityCreateRequestDataAttributes) error {
	return nil
}
