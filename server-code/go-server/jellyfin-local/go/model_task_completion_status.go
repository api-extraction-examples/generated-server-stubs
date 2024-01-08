/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: v1
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi


import (
	"fmt"
)


// TaskCompletionStatus : Enum TaskCompletionStatus.
type TaskCompletionStatus string

// List of TaskCompletionStatus
const (
	COMPLETED TaskCompletionStatus = "Completed"
	FAILED TaskCompletionStatus = "Failed"
	CANCELLED TaskCompletionStatus = "Cancelled"
	ABORTED TaskCompletionStatus = "Aborted"
)

// AllowedTaskCompletionStatusEnumValues is all the allowed values of TaskCompletionStatus enum
var AllowedTaskCompletionStatusEnumValues = []TaskCompletionStatus{
	"Completed",
	"Failed",
	"Cancelled",
	"Aborted",
}

// validTaskCompletionStatusEnumValue provides a map of TaskCompletionStatuss for fast verification of use input
var validTaskCompletionStatusEnumValues = map[TaskCompletionStatus]struct{}{
	"Completed": {},
	"Failed": {},
	"Cancelled": {},
	"Aborted": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v TaskCompletionStatus) IsValid() bool {
	_, ok := validTaskCompletionStatusEnumValues[v]
	return ok
}

// NewTaskCompletionStatusFromValue returns a pointer to a valid TaskCompletionStatus
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewTaskCompletionStatusFromValue(v string) (TaskCompletionStatus, error) {
	ev := TaskCompletionStatus(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for TaskCompletionStatus: valid values are %v", v, AllowedTaskCompletionStatusEnumValues)
	}
}



// AssertTaskCompletionStatusRequired checks if the required fields are not zero-ed
func AssertTaskCompletionStatusRequired(obj TaskCompletionStatus) error {
	return nil
}

// AssertTaskCompletionStatusConstraints checks if the values respects the defined constraints
func AssertTaskCompletionStatusConstraints(obj TaskCompletionStatus) error {
	return nil
}
