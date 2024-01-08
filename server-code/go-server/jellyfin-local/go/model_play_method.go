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



type PlayMethod string

// List of PlayMethod
const (
	TRANSCODE PlayMethod = "Transcode"
	DIRECT_STREAM PlayMethod = "DirectStream"
	DIRECT_PLAY PlayMethod = "DirectPlay"
)

// AllowedPlayMethodEnumValues is all the allowed values of PlayMethod enum
var AllowedPlayMethodEnumValues = []PlayMethod{
	"Transcode",
	"DirectStream",
	"DirectPlay",
}

// validPlayMethodEnumValue provides a map of PlayMethods for fast verification of use input
var validPlayMethodEnumValues = map[PlayMethod]struct{}{
	"Transcode": {},
	"DirectStream": {},
	"DirectPlay": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v PlayMethod) IsValid() bool {
	_, ok := validPlayMethodEnumValues[v]
	return ok
}

// NewPlayMethodFromValue returns a pointer to a valid PlayMethod
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewPlayMethodFromValue(v string) (PlayMethod, error) {
	ev := PlayMethod(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for PlayMethod: valid values are %v", v, AllowedPlayMethodEnumValues)
	}
}



// AssertPlayMethodRequired checks if the required fields are not zero-ed
func AssertPlayMethodRequired(obj PlayMethod) error {
	return nil
}

// AssertPlayMethodConstraints checks if the values respects the defined constraints
func AssertPlayMethodConstraints(obj PlayMethod) error {
	return nil
}
