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
	"time"
)

// SeriesTimerInfoDto - Class SeriesTimerInfoDto.
type SeriesTimerInfoDto struct {

	// ChannelId of the recording.
	ChannelId string `json:"ChannelId,omitempty"`

	// ChannelName of the recording.
	ChannelName *string `json:"ChannelName,omitempty"`

	ChannelPrimaryImageTag *string `json:"ChannelPrimaryImageTag,omitempty"`

	DayPattern DayPattern `json:"DayPattern,omitempty"`

	// Gets or sets the days.
	Days *[]DayOfWeek `json:"Days,omitempty"`

	// The end date of the recording, in UTC.
	EndDate time.Time `json:"EndDate,omitempty"`

	// Gets or sets the external channel identifier.
	ExternalChannelId *string `json:"ExternalChannelId,omitempty"`

	// Gets or sets the external identifier.
	ExternalId *string `json:"ExternalId,omitempty"`

	// Gets or sets the external program identifier.
	ExternalProgramId *string `json:"ExternalProgramId,omitempty"`

	// Id of the recording.
	Id *string `json:"Id,omitempty"`

	// Gets or sets the image tags.
	ImageTags *map[string]string `json:"ImageTags,omitempty"`

	// Gets or sets a value indicating whether this instance is post padding required.
	IsPostPaddingRequired bool `json:"IsPostPaddingRequired,omitempty"`

	// Gets or sets a value indicating whether this instance is pre padding required.
	IsPrePaddingRequired bool `json:"IsPrePaddingRequired,omitempty"`

	KeepUntil KeepUntil `json:"KeepUntil,omitempty"`

	KeepUpTo int32 `json:"KeepUpTo,omitempty"`

	// Name of the recording.
	Name *string `json:"Name,omitempty"`

	// Description of the recording.
	Overview *string `json:"Overview,omitempty"`

	// Gets or sets the parent backdrop image tags.
	ParentBackdropImageTags *[]string `json:"ParentBackdropImageTags,omitempty"`

	// If the item does not have any backdrops, this will hold the Id of the Parent that has one.
	ParentBackdropItemId *string `json:"ParentBackdropItemId,omitempty"`

	// Gets or sets the parent primary image item identifier.
	ParentPrimaryImageItemId *string `json:"ParentPrimaryImageItemId,omitempty"`

	// Gets or sets the parent primary image tag.
	ParentPrimaryImageTag *string `json:"ParentPrimaryImageTag,omitempty"`

	// Gets or sets the parent thumb image tag.
	ParentThumbImageTag *string `json:"ParentThumbImageTag,omitempty"`

	// Gets or sets the parent thumb item id.
	ParentThumbItemId *string `json:"ParentThumbItemId,omitempty"`

	// Gets or sets the post padding seconds.
	PostPaddingSeconds int32 `json:"PostPaddingSeconds,omitempty"`

	// Gets or sets the pre padding seconds.
	PrePaddingSeconds int32 `json:"PrePaddingSeconds,omitempty"`

	// Gets or sets the priority.
	Priority int32 `json:"Priority,omitempty"`

	// Gets or sets the program identifier.
	ProgramId *string `json:"ProgramId,omitempty"`

	// Gets or sets a value indicating whether [record any channel].
	RecordAnyChannel bool `json:"RecordAnyChannel,omitempty"`

	// Gets or sets a value indicating whether [record any time].
	RecordAnyTime bool `json:"RecordAnyTime,omitempty"`

	// Gets or sets a value indicating whether [record new only].
	RecordNewOnly bool `json:"RecordNewOnly,omitempty"`

	// Gets or sets the server identifier.
	ServerId *string `json:"ServerId,omitempty"`

	// Gets or sets the name of the service.
	ServiceName *string `json:"ServiceName,omitempty"`

	SkipEpisodesInLibrary bool `json:"SkipEpisodesInLibrary,omitempty"`

	// The start date of the recording, in UTC.
	StartDate time.Time `json:"StartDate,omitempty"`

	Type *string `json:"Type,omitempty"`
}