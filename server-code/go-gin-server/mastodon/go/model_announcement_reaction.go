/*
 * Mastodon API Specification (https://github.com/mastodon/mastodon)
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0
 * Contact: sardo@hey.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// AnnouncementReaction - Represents an emoji reaction to an Announcement.
type AnnouncementReaction struct {

	// The total number of users who have added this reaction.
	Count int32 `json:"count,omitempty"`

	// Whether the authorized user has added this reaction to the announcement.
	Me bool `json:"me,omitempty"`

	// The emoji used for the reaction. Either a unicode emoji, or a custom emoji's shortcode.
	Name string `json:"name,omitempty"`

	// A link to a non-animated version of the custom emoji (URL).
	StaticUrl string `json:"static_url,omitempty"`

	// A link to the custom emoji (URL).
	Url string `json:"url,omitempty"`
}