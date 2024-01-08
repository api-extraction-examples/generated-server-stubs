/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// StartupConfigurationDto - The startup configuration DTO.
type StartupConfigurationDto struct {

	// Gets or sets the metadata country code.
	MetadataCountryCode *string `json:"MetadataCountryCode,omitempty"`

	// Gets or sets the preferred language for the metadata.
	PreferredMetadataLanguage *string `json:"PreferredMetadataLanguage,omitempty"`

	// Gets or sets UI language culture.
	UICulture *string `json:"UICulture,omitempty"`
}

// AssertStartupConfigurationDtoRequired checks if the required fields are not zero-ed
func AssertStartupConfigurationDtoRequired(obj StartupConfigurationDto) error {
	return nil
}

// AssertStartupConfigurationDtoConstraints checks if the values respects the defined constraints
func AssertStartupConfigurationDtoConstraints(obj StartupConfigurationDto) error {
	return nil
}