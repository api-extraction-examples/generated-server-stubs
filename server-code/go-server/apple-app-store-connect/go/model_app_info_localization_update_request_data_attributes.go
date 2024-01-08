/*
 * App Store Connect API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.4.1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type AppInfoLocalizationUpdateRequestDataAttributes struct {

	Name string `json:"name,omitempty"`

	PrivacyPolicyText string `json:"privacyPolicyText,omitempty"`

	PrivacyPolicyUrl string `json:"privacyPolicyUrl,omitempty"`

	Subtitle string `json:"subtitle,omitempty"`
}

// AssertAppInfoLocalizationUpdateRequestDataAttributesRequired checks if the required fields are not zero-ed
func AssertAppInfoLocalizationUpdateRequestDataAttributesRequired(obj AppInfoLocalizationUpdateRequestDataAttributes) error {
	return nil
}

// AssertAppInfoLocalizationUpdateRequestDataAttributesConstraints checks if the values respects the defined constraints
func AssertAppInfoLocalizationUpdateRequestDataAttributesConstraints(obj AppInfoLocalizationUpdateRequestDataAttributes) error {
	return nil
}
