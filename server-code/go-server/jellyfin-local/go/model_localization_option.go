/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type LocalizationOption struct {

	Name *string `json:"Name,omitempty"`

	Value *string `json:"Value,omitempty"`
}

// AssertLocalizationOptionRequired checks if the required fields are not zero-ed
func AssertLocalizationOptionRequired(obj LocalizationOption) error {
	return nil
}

// AssertLocalizationOptionConstraints checks if the values respects the defined constraints
func AssertLocalizationOptionConstraints(obj LocalizationOption) error {
	return nil
}
