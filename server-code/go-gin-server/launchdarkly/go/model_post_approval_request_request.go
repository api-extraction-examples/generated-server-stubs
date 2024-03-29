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

type PostApprovalRequestRequest struct {

	// comment will be included in audit log item for change.
	Comment string `json:"comment,omitempty"`

	// A name that describes the changes you would like to apply to a feature flag configuration
	Description string `json:"description"`

	// Timestamp for when instructions will be executed
	ExecutionDate int64 `json:"executionDate,omitempty"`

	Instructions []SemanticPatchInstructionInner `json:"instructions"`

	NotifyMemberIds []string `json:"notifyMemberIds"`

	// ID of scheduled change to edit or delete
	OperatingOnId string `json:"operatingOnId,omitempty"`
}
