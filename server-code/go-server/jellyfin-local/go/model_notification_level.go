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



type NotificationLevel string

// List of NotificationLevel
const (
	NORMAL NotificationLevel = "Normal"
	WARNING NotificationLevel = "Warning"
	ERROR NotificationLevel = "Error"
)

// AllowedNotificationLevelEnumValues is all the allowed values of NotificationLevel enum
var AllowedNotificationLevelEnumValues = []NotificationLevel{
	"Normal",
	"Warning",
	"Error",
}

// validNotificationLevelEnumValue provides a map of NotificationLevels for fast verification of use input
var validNotificationLevelEnumValues = map[NotificationLevel]struct{}{
	"Normal": {},
	"Warning": {},
	"Error": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v NotificationLevel) IsValid() bool {
	_, ok := validNotificationLevelEnumValues[v]
	return ok
}

// NewNotificationLevelFromValue returns a pointer to a valid NotificationLevel
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewNotificationLevelFromValue(v string) (NotificationLevel, error) {
	ev := NotificationLevel(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for NotificationLevel: valid values are %v", v, AllowedNotificationLevelEnumValues)
	}
}



// AssertNotificationLevelRequired checks if the required fields are not zero-ed
func AssertNotificationLevelRequired(obj NotificationLevel) error {
	return nil
}

// AssertNotificationLevelConstraints checks if the values respects the defined constraints
func AssertNotificationLevelConstraints(obj NotificationLevel) error {
	return nil
}
