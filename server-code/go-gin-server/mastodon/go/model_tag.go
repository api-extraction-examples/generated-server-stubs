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

// Tag - Represents a hashtag used within the content of a status.
type Tag struct {

	// Usage statistics for given days.
	History []History `json:"history,omitempty"`

	// The value of the hashtag after the `#` sign.
	Name string `json:"name"`

	// A link to the hashtag on the instance.
	Url string `json:"url"`
}
