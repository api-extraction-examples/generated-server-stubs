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

// AssertGetFlagConfigScheduledChangesConflictsRequestRequired checks if the required fields are not zero-ed
func AssertGetFlagConfigScheduledChangesConflictsRequestRequired(obj GetFlagConfigScheduledChangesConflictsRequest) error {
	for _, el := range obj.Instructions {
		if err := AssertSemanticPatchInstructionInnerRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertGetFlagConfigScheduledChangesConflictsRequestConstraints checks if the values respects the defined constraints
func AssertGetFlagConfigScheduledChangesConflictsRequestConstraints(obj GetFlagConfigScheduledChangesConflictsRequest) error {
	return nil
}