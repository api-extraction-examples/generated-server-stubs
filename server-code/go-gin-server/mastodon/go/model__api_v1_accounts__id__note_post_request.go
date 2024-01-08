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

type ApiV1AccountsIdNotePostRequest struct {

	// The comment to be set on that user. Provide an empty string or leave out this parameter to clear the currently set note.
	Comment string `json:"comment,omitempty"`
}
