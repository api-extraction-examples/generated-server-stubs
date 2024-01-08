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




type Fallthrough struct {

	Rollout Rollout `json:"rollout,omitempty"`

	Variation int32 `json:"variation,omitempty"`
}

// AssertFallthroughRequired checks if the required fields are not zero-ed
func AssertFallthroughRequired(obj Fallthrough) error {
	if err := AssertRolloutRequired(obj.Rollout); err != nil {
		return err
	}
	return nil
}

// AssertFallthroughConstraints checks if the values respects the defined constraints
func AssertFallthroughConstraints(obj Fallthrough) error {
	return nil
}