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




type Prerequisite struct {

	Key string `json:"key,omitempty"`

	Variation int32 `json:"variation,omitempty"`
}

// AssertPrerequisiteRequired checks if the required fields are not zero-ed
func AssertPrerequisiteRequired(obj Prerequisite) error {
	return nil
}

// AssertPrerequisiteConstraints checks if the values respects the defined constraints
func AssertPrerequisiteConstraints(obj Prerequisite) error {
	return nil
}
