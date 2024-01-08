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




type Links struct {

	Next Link `json:"next,omitempty"`

	Self Link `json:"self,omitempty"`
}

// AssertLinksRequired checks if the required fields are not zero-ed
func AssertLinksRequired(obj Links) error {
	if err := AssertLinkRequired(obj.Next); err != nil {
		return err
	}
	if err := AssertLinkRequired(obj.Self); err != nil {
		return err
	}
	return nil
}

// AssertLinksConstraints checks if the values respects the defined constraints
func AssertLinksConstraints(obj Links) error {
	return nil
}