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




type Projects struct {

	Links Links `json:"_links,omitempty"`

	Items []Project `json:"items,omitempty"`
}

// AssertProjectsRequired checks if the required fields are not zero-ed
func AssertProjectsRequired(obj Projects) error {
	if err := AssertLinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Items {
		if err := AssertProjectRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertProjectsConstraints checks if the values respects the defined constraints
func AssertProjectsConstraints(obj Projects) error {
	return nil
}
