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




type StreamLinks struct {

	Parent Link `json:"parent,omitempty"`

	Self Link `json:"self,omitempty"`

	// Links to endpoints that are in the request path.
	Subseries []Link `json:"subseries,omitempty"`
}

// AssertStreamLinksRequired checks if the required fields are not zero-ed
func AssertStreamLinksRequired(obj StreamLinks) error {
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

// AssertStreamLinksConstraints checks if the values respects the defined constraints
func AssertStreamLinksConstraints(obj StreamLinks) error {
	return nil
}
