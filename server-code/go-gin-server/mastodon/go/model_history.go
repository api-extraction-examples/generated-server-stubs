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

// History - Represents daily usage history of a hashtag.
type History struct {

	// the total of accounts using the tag within that day. Cast from an integer.
	Accounts string `json:"accounts"`

	// UNIX timestamp on midnight of the given day.
	Day string `json:"day"`

	// the counted usage of the tag within that day. Cast from an integer.
	Uses string `json:"uses"`
}