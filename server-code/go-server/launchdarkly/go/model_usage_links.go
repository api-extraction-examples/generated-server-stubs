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




type UsageLinks struct {

	Parent Link `json:"parent,omitempty"`

	Self Link `json:"self,omitempty"`

	// The following links that are in the response.
	Subseries []Link `json:"subseries,omitempty"`
}

// AssertUsageLinksRequired checks if the required fields are not zero-ed
func AssertUsageLinksRequired(obj UsageLinks) error {
	if err := AssertLinkRequired(obj.Parent); err != nil {
		return err
	}
	if err := AssertLinkRequired(obj.Self); err != nil {
		return err
	}
	for _, el := range obj.Subseries {
		if err := AssertLinkRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertUsageLinksConstraints checks if the values respects the defined constraints
func AssertUsageLinksConstraints(obj UsageLinks) error {
	return nil
}
