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

// ScheduledStatus - Represents a status that will be published at a future scheduled date.
type ScheduledStatus struct {

	// ID of the scheduled status in the database. Cast from an integer, but not guaranteed to be a number.
	Id string `json:"id"`

	// Array of attachements
	MediaAttachments []Attachment `json:"media_attachments"`

	Params StatusParams `json:"params"`

	// ID of the status in the database. ISO 8601 Datetime.
	ScheduledAt time.Time `json:"scheduled_at"`
}
