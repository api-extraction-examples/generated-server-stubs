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

// AssertScheduledStatusRequired checks if the required fields are not zero-ed
func AssertScheduledStatusRequired(obj ScheduledStatus) error {
	elements := map[string]interface{}{
		"id": obj.Id,
		"media_attachments": obj.MediaAttachments,
		"params": obj.Params,
		"scheduled_at": obj.ScheduledAt,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	for _, el := range obj.MediaAttachments {
		if err := AssertAttachmentRequired(el); err != nil {
			return err
		}
	}
	if err := AssertStatusParamsRequired(obj.Params); err != nil {
		return err
	}
	return nil
}

// AssertScheduledStatusConstraints checks if the values respects the defined constraints
func AssertScheduledStatusConstraints(obj ScheduledStatus) error {
	return nil
}