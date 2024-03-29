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




// EnvironmentApprovalSettings - Approval settings for an environment. Only appears if the approvals feature is enabled.
type EnvironmentApprovalSettings struct {

	// Whether changes can be applied as long as minNumApprovals is met, regardless of if any reviewers have declined a request.
	CanApplyDeclinedChanges bool `json:"canApplyDeclinedChanges,omitempty"`

	// Whether requesters can approve or decline their own request. They may always comment.
	CanReviewOwnRequest bool `json:"canReviewOwnRequest,omitempty"`

	// The number of approvals required before an approval request can be applied.
	MinNumApprovals int64 `json:"minNumApprovals,omitempty"`

	// Whether any changes to flags in this environment will require approval. You may only set required or requiredApprovalTags, not both.
	Required bool `json:"required,omitempty"`

	// An array of tags used to specify which flags with those tags require approval. You may only set requiredApprovalTags or required, not both.
	RequiredApprovalTags []string `json:"requiredApprovalTags,omitempty"`

	// The approvals system used.
	ServiceKind string `json:"serviceKind,omitempty"`
}

// AssertEnvironmentApprovalSettingsRequired checks if the required fields are not zero-ed
func AssertEnvironmentApprovalSettingsRequired(obj EnvironmentApprovalSettings) error {
	return nil
}

// AssertEnvironmentApprovalSettingsConstraints checks if the values respects the defined constraints
func AssertEnvironmentApprovalSettingsConstraints(obj EnvironmentApprovalSettings) error {
	return nil
}
