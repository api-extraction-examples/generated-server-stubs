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




type UpdateBigSegmentTargetsRequest struct {

	Excluded BigSegmentTargetChanges `json:"excluded,omitempty"`

	Included BigSegmentTargetChanges `json:"included,omitempty"`
}

// AssertUpdateBigSegmentTargetsRequestRequired checks if the required fields are not zero-ed
func AssertUpdateBigSegmentTargetsRequestRequired(obj UpdateBigSegmentTargetsRequest) error {
	if err := AssertBigSegmentTargetChangesRequired(obj.Excluded); err != nil {
		return err
	}
	if err := AssertBigSegmentTargetChangesRequired(obj.Included); err != nil {
		return err
	}
	return nil
}

// AssertUpdateBigSegmentTargetsRequestConstraints checks if the values respects the defined constraints
func AssertUpdateBigSegmentTargetsRequestConstraints(obj UpdateBigSegmentTargetsRequest) error {
	return nil
}
