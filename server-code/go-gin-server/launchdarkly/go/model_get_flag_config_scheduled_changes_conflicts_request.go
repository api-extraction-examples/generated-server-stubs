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

type GetFlagConfigScheduledChangesConflictsRequest struct {

	// A unix epoch time in milliseconds specifying the date the scheduled changes will be applied
	ExecutionDate int32 `json:"executionDate,omitempty"`

	Instructions []SemanticPatchInstructionInner `json:"instructions,omitempty"`
}
