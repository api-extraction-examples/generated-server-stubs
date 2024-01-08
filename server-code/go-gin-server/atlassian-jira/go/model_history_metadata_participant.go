/*
 * The Jira Cloud platform REST API
 *
 * Jira Cloud platform REST API documentation
 *
 * API version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

// HistoryMetadataParticipant - Details of user or system associated with a issue history metadata item.
type HistoryMetadataParticipant struct {

	// The URL to an avatar for the user or system associated with a history record.
	AvatarUrl string `json:"avatarUrl,omitempty"`

	// The display name of the user or system associated with a history record.
	DisplayName string `json:"displayName,omitempty"`

	// The key of the display name of the user or system associated with a history record.
	DisplayNameKey string `json:"displayNameKey,omitempty"`

	// The ID of the user or system associated with a history record.
	Id string `json:"id,omitempty"`

	// The type of the user or system associated with a history record.
	Type string `json:"type,omitempty"`

	// The URL of the user or system associated with a history record.
	Url string `json:"url,omitempty"`
}