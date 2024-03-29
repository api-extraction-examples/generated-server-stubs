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

// Source - Represents display or publishing preferences of user's own account. Returned as an additional entity when verifying and updated credentials, as an attribute of Account.
type Source struct {

	// Metadata about the account.
	Fields []Field `json:"fields,omitempty"`

	// The number of pending follow requests
	FollowRequestsCount int32 `json:"follow_requests_count,omitempty"`

	// The default posting language for new statuses, ISO 639-1 language two-letter code.
	Language string `json:"language,omitempty"`

	// Profile bio
	Note string `json:"note,omitempty"`

	// The default post privacy to be used for new statuses.
	Privacy string `json:"privacy,omitempty"`

	// Whether new statuses should be marked sensitive by default.
	Sensitive bool `json:"sensitive,omitempty"`
}
