/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// ConfigurationPageInfo - The configuration page info.
type ConfigurationPageInfo struct {

	ConfigurationPageType ConfigurationPageType `json:"ConfigurationPageType,omitempty"`

	// Gets or sets the display name.
	DisplayName *string `json:"DisplayName,omitempty"`

	// Gets or sets a value indicating whether the configurations page is enabled in the main menu.
	EnableInMainMenu bool `json:"EnableInMainMenu,omitempty"`

	// Gets or sets the menu icon.
	MenuIcon *string `json:"MenuIcon,omitempty"`

	// Gets or sets the menu section.
	MenuSection *string `json:"MenuSection,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	// Gets or sets the plugin id.
	PluginId *string `json:"PluginId,omitempty"`
}

// AssertConfigurationPageInfoRequired checks if the required fields are not zero-ed
func AssertConfigurationPageInfoRequired(obj ConfigurationPageInfo) error {
	return nil
}

// AssertConfigurationPageInfoConstraints checks if the values respects the defined constraints
func AssertConfigurationPageInfoConstraints(obj ConfigurationPageInfo) error {
	return nil
}
