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




type FeatureFlagScheduledChangesConflicts struct {

	Instructions []FeatureFlagScheduledChangesConflictsInstructionsInner `json:"instructions,omitempty"`
}

// AssertFeatureFlagScheduledChangesConflictsRequired checks if the required fields are not zero-ed
func AssertFeatureFlagScheduledChangesConflictsRequired(obj FeatureFlagScheduledChangesConflicts) error {
	for _, el := range obj.Instructions {
		if err := AssertFeatureFlagScheduledChangesConflictsInstructionsInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertFeatureFlagScheduledChangesConflictsConstraints checks if the values respects the defined constraints
func AssertFeatureFlagScheduledChangesConflictsConstraints(obj FeatureFlagScheduledChangesConflicts) error {
	return nil
}