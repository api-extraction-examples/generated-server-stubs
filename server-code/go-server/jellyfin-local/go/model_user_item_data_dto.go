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



// UserItemDataDto - Class UserItemDataDto.
type UserItemDataDto struct {

	// Gets or sets a value indicating whether this instance is favorite.
	IsFavorite bool `json:"IsFavorite,omitempty"`

	// Gets or sets the item identifier.
	ItemId *string `json:"ItemId,omitempty"`

	// Gets or sets the key.
	Key *string `json:"Key,omitempty"`

	// Gets or sets the last played date.
	LastPlayedDate *time.Time `json:"LastPlayedDate,omitempty"`

	// Gets or sets a value indicating whether this MediaBrowser.Model.Dto.UserItemDataDto is likes.
	Likes *bool `json:"Likes,omitempty"`

	// Gets or sets the play count.
	PlayCount int32 `json:"PlayCount,omitempty"`

	// Gets or sets the playback position ticks.
	PlaybackPositionTicks int64 `json:"PlaybackPositionTicks,omitempty"`

	// Gets or sets a value indicating whether this MediaBrowser.Model.Dto.UserItemDataDto is played.
	Played bool `json:"Played,omitempty"`

	// Gets or sets the played percentage.
	PlayedPercentage *float64 `json:"PlayedPercentage,omitempty"`

	// Gets or sets the rating.
	Rating *float64 `json:"Rating,omitempty"`

	// Gets or sets the unplayed item count.
	UnplayedItemCount *int32 `json:"UnplayedItemCount,omitempty"`
}

// AssertUserItemDataDtoRequired checks if the required fields are not zero-ed
func AssertUserItemDataDtoRequired(obj UserItemDataDto) error {
	return nil
}

// AssertUserItemDataDtoConstraints checks if the values respects the defined constraints
func AssertUserItemDataDtoConstraints(obj UserItemDataDto) error {
	return nil
}