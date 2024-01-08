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


// FFmpegLocation : Enum describing the location of the FFmpeg tool.
type FFmpegLocation string

// List of FFmpegLocation
const (
	NOT_FOUND FFmpegLocation = "NotFound"
	SET_BY_ARGUMENT FFmpegLocation = "SetByArgument"
	CUSTOM FFmpegLocation = "Custom"
	SYSTEM FFmpegLocation = "System"
)

// AllowedFFmpegLocationEnumValues is all the allowed values of FFmpegLocation enum
var AllowedFFmpegLocationEnumValues = []FFmpegLocation{
	"NotFound",
	"SetByArgument",
	"Custom",
	"System",
}

// validFFmpegLocationEnumValue provides a map of FFmpegLocations for fast verification of use input
var validFFmpegLocationEnumValues = map[FFmpegLocation]struct{}{
	"NotFound": {},
	"SetByArgument": {},
	"Custom": {},
	"System": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v FFmpegLocation) IsValid() bool {
	_, ok := validFFmpegLocationEnumValues[v]
	return ok
}

// NewFFmpegLocationFromValue returns a pointer to a valid FFmpegLocation
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewFFmpegLocationFromValue(v string) (FFmpegLocation, error) {
	ev := FFmpegLocation(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for FFmpegLocation: valid values are %v", v, AllowedFFmpegLocationEnumValues)
	}
}



// AssertFFmpegLocationRequired checks if the required fields are not zero-ed
func AssertFFmpegLocationRequired(obj FFmpegLocation) error {
	return nil
}

// AssertFFmpegLocationConstraints checks if the values respects the defined constraints
func AssertFFmpegLocationConstraints(obj FFmpegLocation) error {
	return nil
}
