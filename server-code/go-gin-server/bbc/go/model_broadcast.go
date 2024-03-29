/*
 * Radio & Music Services
 *
 * We encapsulate Radio & Music business logic for iPlayer Radio and BBC Music products on all platforms. We add value by reliably providing the right blend of metadata needed by clients.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type Broadcast struct {

	Duration int32 `json:"duration"`

	End string `json:"end"`

	IsAudioDescribed bool `json:"is_audio_described"`

	IsBlanked bool `json:"is_blanked"`

	IsCritical bool `json:"is_critical"`

	IsLive bool `json:"is_live"`

	IsRepeat bool `json:"is_repeat"`

	IsWebcast bool `json:"is_webcast"`

	Pid string `json:"pid"`

	Programme ProgrammeSummary `json:"programme,omitempty"`

	ServiceId string `json:"service_id"`

	Start string `json:"start"`

	Type string `json:"type"`

	VersionPid string `json:"version_pid"`
}
