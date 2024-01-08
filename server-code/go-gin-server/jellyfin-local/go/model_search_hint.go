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

// SearchHint - Class SearchHintResult.
type SearchHint struct {

	// Gets or sets the album.
	Album *string `json:"Album,omitempty"`

	// Gets or sets the album artist.
	AlbumArtist *string `json:"AlbumArtist,omitempty"`

	AlbumId string `json:"AlbumId,omitempty"`

	// Gets or sets the artists.
	Artists *[]string `json:"Artists,omitempty"`

	// Gets or sets the backdrop image item identifier.
	BackdropImageItemId *string `json:"BackdropImageItemId,omitempty"`

	// Gets or sets the backdrop image tag.
	BackdropImageTag *string `json:"BackdropImageTag,omitempty"`

	// Gets or sets the channel identifier.
	ChannelId string `json:"ChannelId,omitempty"`

	// Gets or sets the name of the channel.
	ChannelName *string `json:"ChannelName,omitempty"`

	EndDate *time.Time `json:"EndDate,omitempty"`

	// Gets or sets the episode count.
	EpisodeCount *int32 `json:"EpisodeCount,omitempty"`

	Id string `json:"Id,omitempty"`

	// Gets or sets the index number.
	IndexNumber *int32 `json:"IndexNumber,omitempty"`

	IsFolder *bool `json:"IsFolder,omitempty"`

	// Gets or sets the item id.
	ItemId string `json:"ItemId,omitempty"`

	// Gets or sets the matched term.
	MatchedTerm *string `json:"MatchedTerm,omitempty"`

	// Gets or sets the type of the media.
	MediaType *string `json:"MediaType,omitempty"`

	// Gets or sets the name.
	Name *string `json:"Name,omitempty"`

	// Gets or sets the parent index number.
	ParentIndexNumber *int32 `json:"ParentIndexNumber,omitempty"`

	// Gets or sets the primary image aspect ratio.
	PrimaryImageAspectRatio *float64 `json:"PrimaryImageAspectRatio,omitempty"`

	// Gets or sets the image tag.
	PrimaryImageTag *string `json:"PrimaryImageTag,omitempty"`

	// Gets or sets the production year.
	ProductionYear *int32 `json:"ProductionYear,omitempty"`

	// Gets or sets the run time ticks.
	RunTimeTicks *int64 `json:"RunTimeTicks,omitempty"`

	// Gets or sets the series.
	Series *string `json:"Series,omitempty"`

	// Gets or sets the song count.
	SongCount *int32 `json:"SongCount,omitempty"`

	StartDate *time.Time `json:"StartDate,omitempty"`

	Status *string `json:"Status,omitempty"`

	// Gets or sets the thumb image item identifier.
	ThumbImageItemId *string `json:"ThumbImageItemId,omitempty"`

	// Gets or sets the thumb image tag.
	ThumbImageTag *string `json:"ThumbImageTag,omitempty"`

	// Gets or sets the type.
	Type *string `json:"Type,omitempty"`
}
