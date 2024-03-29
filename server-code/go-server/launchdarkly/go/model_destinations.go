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




type Destinations struct {

	Links Links `json:"_links,omitempty"`

	Items []Destination `json:"items,omitempty"`
}

// AssertDestinationsRequired checks if the required fields are not zero-ed
func AssertDestinationsRequired(obj Destinations) error {
	if err := AssertLinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Items {
		if err := AssertDestinationRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertDestinationsConstraints checks if the values respects the defined constraints
func AssertDestinationsConstraints(obj Destinations) error {
	return nil
}
