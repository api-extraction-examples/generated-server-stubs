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

// Field - Represents a profile field as a name-value pair with optional verification.
type Field struct {

	// The key of a given field's key-value pair.
	Name string `json:"name,omitempty"`

	// The value associated with the `name` key.
	Value string `json:"value,omitempty"`

	// Timestamp of when the server verified a URL value for a rel=\"me” link. If `value` is a verified URL. Otherwise, null
	VerifiedAt time.Time `json:"verified_at,omitempty"`
}
