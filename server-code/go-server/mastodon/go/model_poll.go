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


import (
	"time"
)



// Poll - Represents a poll attached to a status.
type Poll struct {

	// Custom emoji to be used for rendering poll options.
	Emojis []Emoji `json:"emojis,omitempty"`

	// Is the poll currently expired?
	Expired bool `json:"expired,omitempty"`

	// When the poll ends. ISO 8601 Datetime, or null if the poll does not end.
	ExpiresAt time.Time `json:"expires_at,omitempty"`

	// The ID of the poll in the database. Cast from an integer, but not guaranteed to be a number.
	Id string `json:"id,omitempty"`

	// Does the poll allow multiple-choice answers?
	Multiple bool `json:"multiple,omitempty"`

	// Possible answers for the poll.
	Options []interface{} `json:"options,omitempty"`

	// When called with a user token, which options has the authorized user chosen? Contains an array of index values for `options`. Array of Number, or null if no current user
	OwnVotes []int32 `json:"own_votes,omitempty"`

	// When called with a user token, has the authorized user voted? Boolean, or null if no current user
	Voted bool `json:"voted,omitempty"`

	// How many unique accounts have voted on a multiple-choice poll. Number, or null if `multiple` is false.
	VotersCount int32 `json:"voters_count,omitempty"`

	// How many votes have been received.
	VotesCount int32 `json:"votes_count,omitempty"`
}

// AssertPollRequired checks if the required fields are not zero-ed
func AssertPollRequired(obj Poll) error {
	for _, el := range obj.Emojis {
		if err := AssertEmojiRequired(el); err != nil {
			return err
		}
	}
	return nil
}

// AssertPollConstraints checks if the values respects the defined constraints
func AssertPollConstraints(obj Poll) error {
	return nil
}
