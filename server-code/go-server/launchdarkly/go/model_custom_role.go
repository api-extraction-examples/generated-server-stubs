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




type CustomRole struct {

	// The unique resource id.
	Id string `json:"_id,omitempty"`

	Links Links `json:"_links,omitempty"`

	// Description of the custom role.
	Description string `json:"description,omitempty"`

	// The 20-hexdigit id or the key for a custom role.
	Key string `json:"key,omitempty"`

	// Name of the custom role.
	Name string `json:"name,omitempty"`

	Policy []Policy `json:"policy,omitempty"`
}

// AssertCustomRoleRequired checks if the required fields are not zero-ed
func AssertCustomRoleRequired(obj CustomRole) error {
	if err := AssertLinksRequired(obj.Links); err != nil {
		return err
	}
	for _, el := range obj.Policy {
		if err := AssertPolicyRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertCustomRoleConstraints checks if the values respects the defined constraints
func AssertCustomRoleConstraints(obj CustomRole) error {
	return nil
}
