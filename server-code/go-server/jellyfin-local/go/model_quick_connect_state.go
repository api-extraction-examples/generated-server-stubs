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


// QuickConnectState : Quick connect state.
type QuickConnectState string

// List of QuickConnectState
const (
	UNAVAILABLE QuickConnectState = "Unavailable"
	AVAILABLE QuickConnectState = "Available"
	ACTIVE QuickConnectState = "Active"
)

// AllowedQuickConnectStateEnumValues is all the allowed values of QuickConnectState enum
var AllowedQuickConnectStateEnumValues = []QuickConnectState{
	"Unavailable",
	"Available",
	"Active",
}

// validQuickConnectStateEnumValue provides a map of QuickConnectStates for fast verification of use input
var validQuickConnectStateEnumValues = map[QuickConnectState]struct{}{
	"Unavailable": {},
	"Available": {},
	"Active": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v QuickConnectState) IsValid() bool {
	_, ok := validQuickConnectStateEnumValues[v]
	return ok
}

// NewQuickConnectStateFromValue returns a pointer to a valid QuickConnectState
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewQuickConnectStateFromValue(v string) (QuickConnectState, error) {
	ev := QuickConnectState(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for QuickConnectState: valid values are %v", v, AllowedQuickConnectStateEnumValues)
	}
}



// AssertQuickConnectStateRequired checks if the required fields are not zero-ed
func AssertQuickConnectStateRequired(obj QuickConnectState) error {
	return nil
}

// AssertQuickConnectStateConstraints checks if the values respects the defined constraints
func AssertQuickConnectStateConstraints(obj QuickConnectState) error {
	return nil
}
