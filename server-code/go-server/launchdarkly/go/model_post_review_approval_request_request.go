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




type PostReviewApprovalRequestRequest struct {

	// comment will be included in audit log item for change.
	Comment string `json:"comment,omitempty"`

	// One of approve, decline, or comment.
	Kind string `json:"kind"`
}

// AssertPostReviewApprovalRequestRequestRequired checks if the required fields are not zero-ed
func AssertPostReviewApprovalRequestRequestRequired(obj PostReviewApprovalRequestRequest) error {
	elements := map[string]interface{}{
		"kind": obj.Kind,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertPostReviewApprovalRequestRequestConstraints checks if the values respects the defined constraints
func AssertPostReviewApprovalRequestRequestConstraints(obj PostReviewApprovalRequestRequest) error {
	return nil
}
