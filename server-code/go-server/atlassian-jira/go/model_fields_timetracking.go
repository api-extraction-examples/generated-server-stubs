/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// FieldsTimetracking - The time tracking of the linked issue.
type FieldsTimetracking struct {

	// The original estimate of time needed for this issue in readable format.
	OriginalEstimate string `json:"originalEstimate,omitempty"`

	// The original estimate of time needed for this issue in seconds.
	OriginalEstimateSeconds int64 `json:"originalEstimateSeconds,omitempty"`

	// The remaining estimate of time needed for this issue in readable format.
	RemainingEstimate string `json:"remainingEstimate,omitempty"`

	// The remaining estimate of time needed for this issue in seconds.
	RemainingEstimateSeconds int64 `json:"remainingEstimateSeconds,omitempty"`

	// Time worked on this issue in readable format.
	TimeSpent string `json:"timeSpent,omitempty"`

	// Time worked on this issue in seconds.
	TimeSpentSeconds int64 `json:"timeSpentSeconds,omitempty"`
}

// AssertFieldsTimetrackingRequired checks if the required fields are not zero-ed
func AssertFieldsTimetrackingRequired(obj FieldsTimetracking) error {
	return nil
}

// AssertFieldsTimetrackingConstraints checks if the values respects the defined constraints
func AssertFieldsTimetrackingConstraints(obj FieldsTimetracking) error {
	return nil
}