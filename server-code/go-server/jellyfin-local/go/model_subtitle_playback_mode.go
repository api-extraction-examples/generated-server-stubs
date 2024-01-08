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


// SubtitlePlaybackMode : An enum representing a subtitle playback mode.
type SubtitlePlaybackMode string

// List of SubtitlePlaybackMode
const (
	DEFAULT SubtitlePlaybackMode = "Default"
	ALWAYS SubtitlePlaybackMode = "Always"
	ONLY_FORCED SubtitlePlaybackMode = "OnlyForced"
	NONE SubtitlePlaybackMode = "None"
	SMART SubtitlePlaybackMode = "Smart"
)

// AllowedSubtitlePlaybackModeEnumValues is all the allowed values of SubtitlePlaybackMode enum
var AllowedSubtitlePlaybackModeEnumValues = []SubtitlePlaybackMode{
	"Default",
	"Always",
	"OnlyForced",
	"None",
	"Smart",
}

// validSubtitlePlaybackModeEnumValue provides a map of SubtitlePlaybackModes for fast verification of use input
var validSubtitlePlaybackModeEnumValues = map[SubtitlePlaybackMode]struct{}{
	"Default": {},
	"Always": {},
	"OnlyForced": {},
	"None": {},
	"Smart": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v SubtitlePlaybackMode) IsValid() bool {
	_, ok := validSubtitlePlaybackModeEnumValues[v]
	return ok
}

// NewSubtitlePlaybackModeFromValue returns a pointer to a valid SubtitlePlaybackMode
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewSubtitlePlaybackModeFromValue(v string) (SubtitlePlaybackMode, error) {
	ev := SubtitlePlaybackMode(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for SubtitlePlaybackMode: valid values are %v", v, AllowedSubtitlePlaybackModeEnumValues)
	}
}



// AssertSubtitlePlaybackModeRequired checks if the required fields are not zero-ed
func AssertSubtitlePlaybackModeRequired(obj SubtitlePlaybackMode) error {
	return nil
}

// AssertSubtitlePlaybackModeConstraints checks if the values respects the defined constraints
func AssertSubtitlePlaybackModeConstraints(obj SubtitlePlaybackMode) error {
	return nil
}
