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




// ProjectType - Details about a project type.
type ProjectType struct {

	// The color of the project type.
	Color string `json:"color,omitempty"`

	// The key of the project type's description.
	DescriptionI18nKey string `json:"descriptionI18nKey,omitempty"`

	// The formatted key of the project type.
	FormattedKey string `json:"formattedKey,omitempty"`

	// The icon of the project type.
	Icon string `json:"icon,omitempty"`

	// The key of the project type.
	Key string `json:"key,omitempty"`
}

// AssertProjectTypeRequired checks if the required fields are not zero-ed
func AssertProjectTypeRequired(obj ProjectType) error {
	return nil
}

// AssertProjectTypeConstraints checks if the values respects the defined constraints
func AssertProjectTypeConstraints(obj ProjectType) error {
	return nil
}
