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


// SeriesStatus : Enum SeriesStatus.
type SeriesStatus string

// List of SeriesStatus
const (
	CONTINUING SeriesStatus = "Continuing"
	ENDED SeriesStatus = "Ended"
)

// AllowedSeriesStatusEnumValues is all the allowed values of SeriesStatus enum
var AllowedSeriesStatusEnumValues = []SeriesStatus{
	"Continuing",
	"Ended",
}

// validSeriesStatusEnumValue provides a map of SeriesStatuss for fast verification of use input
var validSeriesStatusEnumValues = map[SeriesStatus]struct{}{
	"Continuing": {},
	"Ended": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v SeriesStatus) IsValid() bool {
	_, ok := validSeriesStatusEnumValues[v]
	return ok
}

// NewSeriesStatusFromValue returns a pointer to a valid SeriesStatus
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewSeriesStatusFromValue(v string) (SeriesStatus, error) {
	ev := SeriesStatus(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for SeriesStatus: valid values are %v", v, AllowedSeriesStatusEnumValues)
	}
}



// AssertSeriesStatusRequired checks if the required fields are not zero-ed
func AssertSeriesStatusRequired(obj SeriesStatus) error {
	return nil
}

// AssertSeriesStatusConstraints checks if the values respects the defined constraints
func AssertSeriesStatusConstraints(obj SeriesStatus) error {
	return nil
}
