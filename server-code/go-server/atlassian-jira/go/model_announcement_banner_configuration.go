/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// AnnouncementBannerConfiguration - Announcement banner configuration.
type AnnouncementBannerConfiguration struct {

	// Hash of the banner data. The client detects updates by comparing hash IDs.
	HashId string `json:"hashId,omitempty"`

	// Flag indicating if the announcement banner can be dismissed by the user.
	IsDismissible bool `json:"isDismissible,omitempty"`

	// Flag indicating if the announcement banner is enabled or not.
	IsEnabled bool `json:"isEnabled,omitempty"`

	// The text on the announcement banner.
	Message string `json:"message,omitempty"`

	// Visibility of the announcement banner.
	Visibility string `json:"visibility,omitempty"`
}

// AssertAnnouncementBannerConfigurationRequired checks if the required fields are not zero-ed
func AssertAnnouncementBannerConfigurationRequired(obj AnnouncementBannerConfiguration) error {
	return nil
}

// AssertAnnouncementBannerConfigurationConstraints checks if the values respects the defined constraints
func AssertAnnouncementBannerConfigurationConstraints(obj AnnouncementBannerConfiguration) error {
	return nil
}
