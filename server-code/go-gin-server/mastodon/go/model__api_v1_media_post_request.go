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
	"os"
)

type ApiV1MediaPostRequest struct {

	// A plain-text description of the media, for accessibility purposes.
	Description string `json:"description,omitempty"`

	// The file to be attached, using multipart form data.
	File *os.File `json:"file"`

	// Two floating points (x,y), comma-delimited, ranging from -1.0 to 1.0 (see “Focal points” below)
	Focus string `json:"focus,omitempty"`

	// The custom thumbnail of the media to be attached, using multipart form data.
	Thumbnail *os.File `json:"thumbnail,omitempty"`
}
