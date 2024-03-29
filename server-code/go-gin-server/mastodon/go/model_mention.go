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

// Mention - Represents a mention of a user within the content of a status.
type Mention struct {

	// The webfinger acct URI of the mentioned user. Equivalent to `username` for local users, or `username@domain` for remote users.
	Acct string `json:"acct"`

	// The account id of the mentioned user. Cast from an integer, but not guaranteed to be a number
	Id string `json:"id"`

	// The location of the mentioned user's profile.
	Url string `json:"url"`

	// The username of the mentioned user.
	Username string `json:"username"`
}
