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




type FeatureFlagStatusAcrossEnvironments struct {

	Links FeatureFlagStatusLinks `json:"_links,omitempty"`

	Environments map[string]FeatureFlagStatusForQueriedEnvironment `json:"environments,omitempty"`

	Key string `json:"key,omitempty"`
}

// AssertFeatureFlagStatusAcrossEnvironmentsRequired checks if the required fields are not zero-ed
func AssertFeatureFlagStatusAcrossEnvironmentsRequired(obj FeatureFlagStatusAcrossEnvironments) error {
	if err := AssertFeatureFlagStatusLinksRequired(obj.Links); err != nil {
		return err
	}
	return nil
}

// AssertFeatureFlagStatusAcrossEnvironmentsConstraints checks if the values respects the defined constraints
func AssertFeatureFlagStatusAcrossEnvironmentsConstraints(obj FeatureFlagStatusAcrossEnvironments) error {
	return nil
}
