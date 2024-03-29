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




type Variation struct {

	Id string `json:"_id,omitempty"`

	Description string `json:"description,omitempty"`

	Name string `json:"name,omitempty"`

	Value map[string]interface{} `json:"value"`
}

// AssertVariationRequired checks if the required fields are not zero-ed
func AssertVariationRequired(obj Variation) error {
	elements := map[string]interface{}{
		"value": obj.Value,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertVariationConstraints checks if the values respects the defined constraints
func AssertVariationConstraints(obj Variation) error {
	return nil
}
