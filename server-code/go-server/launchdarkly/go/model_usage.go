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




type Usage struct {

	Links UsageLinks `json:"_links,omitempty"`

	Series []StreamUsageSeries `json:"series,omitempty"`
}

// AssertUsageRequired checks if the required fields are not zero-ed
func AssertUsageRequired(obj Usage) error {
	if err := AssertUsageLinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Series {
		if err := AssertStreamUsageSeriesRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertUsageConstraints checks if the values respects the defined constraints
func AssertUsageConstraints(obj Usage) error {
	return nil
}
