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




type Mau struct {

	Links UsageLinks `json:"_links,omitempty"`

	Metadata []StreamBySdkLinksMetadata `json:"metadata,omitempty"`

	Series []StreamUsageSeries `json:"series,omitempty"`
}

// AssertMauRequired checks if the required fields are not zero-ed
func AssertMauRequired(obj Mau) error {
	if err := AssertUsageLinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Metadata {
		if err := AssertStreamBySdkLinksMetadataRequired(el); err != nil {
			return err
		}
	}
	for _, el := range obj.Series {
		if err := AssertStreamUsageSeriesRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertMauConstraints checks if the values respects the defined constraints
func AssertMauConstraints(obj Mau) error {
	return nil
}
