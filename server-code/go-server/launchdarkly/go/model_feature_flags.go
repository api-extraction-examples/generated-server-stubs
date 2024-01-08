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




type FeatureFlags struct {

	Links Links `json:"_links,omitempty"`

	Items []FeatureFlag `json:"items,omitempty"`

	TotalCount float32 `json:"totalCount,omitempty"`
}

// AssertFeatureFlagsRequired checks if the required fields are not zero-ed
func AssertFeatureFlagsRequired(obj FeatureFlags) error {
	if err := AssertLinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Items {
		if err := AssertFeatureFlagRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertFeatureFlagsConstraints checks if the values respects the defined constraints
func AssertFeatureFlagsConstraints(obj FeatureFlags) error {
	return nil
}