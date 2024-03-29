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




type PatchFeatureFlagRequest struct {

	Comment string `json:"comment,omitempty"`

	Patch []PatchOperation `json:"patch,omitempty"`
}

// AssertPatchFeatureFlagRequestRequired checks if the required fields are not zero-ed
func AssertPatchFeatureFlagRequestRequired(obj PatchFeatureFlagRequest) error {
	for _, el := range obj.Patch {
		if err := AssertPatchOperationRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPatchFeatureFlagRequestConstraints checks if the values respects the defined constraints
func AssertPatchFeatureFlagRequestConstraints(obj PatchFeatureFlagRequest) error {
	return nil
}
