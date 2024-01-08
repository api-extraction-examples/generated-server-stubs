/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * API version: 5.3.0
 * Contact: support@launchdarkly.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




type UserFlagSetting struct {

	Links Links `json:"_links,omitempty"`

	// The most important attribute in the response. The _value is the current setting for the user. For a boolean feature toggle, this will be true, false, or null if there is no defined fallthrough value.
	Value bool `json:"_value,omitempty"`

	// The setting attribute indicates whether you've explicitly targeted this user to receive a particular variation. For example, if you have explicitly turned off a feature toggle for a user, setting will be false. A setting of null means that you haven't assigned that user to a specific variation.
	Setting bool `json:"setting,omitempty"`
}

// AssertUserFlagSettingRequired checks if the required fields are not zero-ed
func AssertUserFlagSettingRequired(obj UserFlagSetting) error {
	if err := AssertLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertUserFlagSettingConstraints checks if the values respects the defined constraints
func AssertUserFlagSettingConstraints(obj UserFlagSetting) error {
	return nil
}