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


// GeneralCommandType : This exists simply to identify a set of known commands.
type GeneralCommandType string

// List of GeneralCommandType
const (
	MOVE_UP GeneralCommandType = "MoveUp"
	MOVE_DOWN GeneralCommandType = "MoveDown"
	MOVE_LEFT GeneralCommandType = "MoveLeft"
	MOVE_RIGHT GeneralCommandType = "MoveRight"
	PAGE_UP GeneralCommandType = "PageUp"
	PAGE_DOWN GeneralCommandType = "PageDown"
	PREVIOUS_LETTER GeneralCommandType = "PreviousLetter"
	NEXT_LETTER GeneralCommandType = "NextLetter"
	TOGGLE_OSD GeneralCommandType = "ToggleOsd"
	TOGGLE_CONTEXT_MENU GeneralCommandType = "ToggleContextMenu"
	SELECT GeneralCommandType = "Select"
	BACK GeneralCommandType = "Back"
	TAKE_SCREENSHOT GeneralCommandType = "TakeScreenshot"
	SEND_KEY GeneralCommandType = "SendKey"
	SEND_STRING GeneralCommandType = "SendString"
	GO_HOME GeneralCommandType = "GoHome"
	GO_TO_SETTINGS GeneralCommandType = "GoToSettings"
	VOLUME_UP GeneralCommandType = "VolumeUp"
	VOLUME_DOWN GeneralCommandType = "VolumeDown"
	MUTE GeneralCommandType = "Mute"
	UNMUTE GeneralCommandType = "Unmute"
	TOGGLE_MUTE GeneralCommandType = "ToggleMute"
	SET_VOLUME GeneralCommandType = "SetVolume"
	SET_AUDIO_STREAM_INDEX GeneralCommandType = "SetAudioStreamIndex"
	SET_SUBTITLE_STREAM_INDEX GeneralCommandType = "SetSubtitleStreamIndex"
	TOGGLE_FULLSCREEN GeneralCommandType = "ToggleFullscreen"
	DISPLAY_CONTENT GeneralCommandType = "DisplayContent"
	GO_TO_SEARCH GeneralCommandType = "GoToSearch"
	DISPLAY_MESSAGE GeneralCommandType = "DisplayMessage"
	SET_REPEAT_MODE GeneralCommandType = "SetRepeatMode"
	CHANNEL_UP GeneralCommandType = "ChannelUp"
	CHANNEL_DOWN GeneralCommandType = "ChannelDown"
	GUIDE GeneralCommandType = "Guide"
	TOGGLE_STATS GeneralCommandType = "ToggleStats"
	PLAY_MEDIA_SOURCE GeneralCommandType = "PlayMediaSource"
	PLAY_TRAILERS GeneralCommandType = "PlayTrailers"
	SET_SHUFFLE_QUEUE GeneralCommandType = "SetShuffleQueue"
	PLAY_STATE GeneralCommandType = "PlayState"
	PLAY_NEXT GeneralCommandType = "PlayNext"
	TOGGLE_OSD_MENU GeneralCommandType = "ToggleOsdMenu"
	PLAY GeneralCommandType = "Play"
)

// AllowedGeneralCommandTypeEnumValues is all the allowed values of GeneralCommandType enum
var AllowedGeneralCommandTypeEnumValues = []GeneralCommandType{
	"MoveUp",
	"MoveDown",
	"MoveLeft",
	"MoveRight",
	"PageUp",
	"PageDown",
	"PreviousLetter",
	"NextLetter",
	"ToggleOsd",
	"ToggleContextMenu",
	"Select",
	"Back",
	"TakeScreenshot",
	"SendKey",
	"SendString",
	"GoHome",
	"GoToSettings",
	"VolumeUp",
	"VolumeDown",
	"Mute",
	"Unmute",
	"ToggleMute",
	"SetVolume",
	"SetAudioStreamIndex",
	"SetSubtitleStreamIndex",
	"ToggleFullscreen",
	"DisplayContent",
	"GoToSearch",
	"DisplayMessage",
	"SetRepeatMode",
	"ChannelUp",
	"ChannelDown",
	"Guide",
	"ToggleStats",
	"PlayMediaSource",
	"PlayTrailers",
	"SetShuffleQueue",
	"PlayState",
	"PlayNext",
	"ToggleOsdMenu",
	"Play",
}

// validGeneralCommandTypeEnumValue provides a map of GeneralCommandTypes for fast verification of use input
var validGeneralCommandTypeEnumValues = map[GeneralCommandType]struct{}{
	"MoveUp": {},
	"MoveDown": {},
	"MoveLeft": {},
	"MoveRight": {},
	"PageUp": {},
	"PageDown": {},
	"PreviousLetter": {},
	"NextLetter": {},
	"ToggleOsd": {},
	"ToggleContextMenu": {},
	"Select": {},
	"Back": {},
	"TakeScreenshot": {},
	"SendKey": {},
	"SendString": {},
	"GoHome": {},
	"GoToSettings": {},
	"VolumeUp": {},
	"VolumeDown": {},
	"Mute": {},
	"Unmute": {},
	"ToggleMute": {},
	"SetVolume": {},
	"SetAudioStreamIndex": {},
	"SetSubtitleStreamIndex": {},
	"ToggleFullscreen": {},
	"DisplayContent": {},
	"GoToSearch": {},
	"DisplayMessage": {},
	"SetRepeatMode": {},
	"ChannelUp": {},
	"ChannelDown": {},
	"Guide": {},
	"ToggleStats": {},
	"PlayMediaSource": {},
	"PlayTrailers": {},
	"SetShuffleQueue": {},
	"PlayState": {},
	"PlayNext": {},
	"ToggleOsdMenu": {},
	"Play": {},
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v GeneralCommandType) IsValid() bool {
	_, ok := validGeneralCommandTypeEnumValues[v]
	return ok
}

// NewGeneralCommandTypeFromValue returns a pointer to a valid GeneralCommandType
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewGeneralCommandTypeFromValue(v string) (GeneralCommandType, error) {
	ev := GeneralCommandType(v)
	if ev.IsValid() {
		return ev, nil
	} else {
		return "", fmt.Errorf("invalid value '%v' for GeneralCommandType: valid values are %v", v, AllowedGeneralCommandTypeEnumValues)
	}
}



// AssertGeneralCommandTypeRequired checks if the required fields are not zero-ed
func AssertGeneralCommandTypeRequired(obj GeneralCommandType) error {
	return nil
}

// AssertGeneralCommandTypeConstraints checks if the values respects the defined constraints
func AssertGeneralCommandTypeConstraints(obj GeneralCommandType) error {
	return nil
}