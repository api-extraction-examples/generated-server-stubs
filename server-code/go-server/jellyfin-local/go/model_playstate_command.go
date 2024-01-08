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


// PlaystateCommand : Enum PlaystateCommand.
type PlaystateCommand string

// List of PlaystateCommand
const (
	STOP PlaystateCommand = "Stop"
	PAUSE PlaystateCommand = "Pause"
	UNPAUSE PlaystateCommand = "Unpause"
	NEXT_TRACK PlaystateCommand = "NextTrack"
	PREVIOUS_TRACK PlaystateCommand = "PreviousTrack"
	SEEK PlaystateCommand = "Seek"
	REWIND PlaystateCommand = "Rewind"
	FAST_FORWARD PlaystateCommand = "FastForward"
	PLAY_PAUSE PlaystateCommand = "PlayPause"
)

// AllowedPlaystateCommandEnumValues is all the allowed values of PlaystateCommand enum
var AllowedPlaystateCommandEnumValues = []PlaystateCommand{
	"Stop",
	"Pause",
	"Unpause",
	"NextTrack",
	"PreviousTrack",
	"Seek",
	"Rewind",
	"FastForward",
	"PlayPause",
}

// validPlaystateCommandEnumValue provides a map of PlaystateCommands for fast verification of use input
var validPlaystateCommandEnumValues = map[PlaystateCommand]struct{}{
	"Stop": {},
	"Pause": {},
	"Unpause": {},
	"NextTrack": {},
	"PreviousTrack": {},
	"Seek": {},
	"Rewind": {},
	"FastForward": {},
	"PlayPause": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v PlaystateCommand) IsValid() bool {
	_, ok := validPlaystateCommandEnumValues[v]
	return ok
}

// NewPlaystateCommandFromValue returns a pointer to a valid PlaystateCommand
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewPlaystateCommandFromValue(v string) (PlaystateCommand, error) {
	ev := PlaystateCommand(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for PlaystateCommand: valid values are %v", v, AllowedPlaystateCommandEnumValues)
	}
}



// AssertPlaystateCommandRequired checks if the required fields are not zero-ed
func AssertPlaystateCommandRequired(obj PlaystateCommand) error {
	return nil
}

// AssertPlaystateCommandConstraints checks if the values respects the defined constraints
func AssertPlaystateCommandConstraints(obj PlaystateCommand) error {
	return nil
}