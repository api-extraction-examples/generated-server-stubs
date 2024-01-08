/*
 * Asana
 *
 * This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/developer-docs/master/defs/asana_oas.yaml).
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"time"
)



// StoryResponseDates - *Conditional*
type StoryResponseDates struct {

	// The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.
	DueAt *time.Time `json:"due_at,omitempty"`

	// The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.
	DueOn string `json:"due_on,omitempty"`

	// The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.
	StartOn *string `json:"start_on,omitempty"`
}

// AssertStoryResponseDatesRequired checks if the required fields are not zero-ed
func AssertStoryResponseDatesRequired(obj StoryResponseDates) error {
	return nil
}

// AssertStoryResponseDatesConstraints checks if the values respects the defined constraints
func AssertStoryResponseDatesConstraints(obj StoryResponseDates) error {
	return nil
}
