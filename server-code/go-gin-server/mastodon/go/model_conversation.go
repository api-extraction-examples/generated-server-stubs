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

// Conversation - Represents a conversation with \"direct message\" visibility.
type Conversation struct {

	// Participants in the conversation.
	Accounts []Account `json:"accounts"`

	// Local database ID of the conversation. Cast from an integer, but not guaranteed to be a number
	Id string `json:"id"`

	LastStatus Status `json:"last_status,omitempty"`

	// Is the conversation currently marked as unread?
	Unread bool `json:"unread"`
}
